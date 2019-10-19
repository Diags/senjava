package com.senjava.demo;
import com.senjava.demo.controller.VoitureController;
import com.senjava.demo.repository.VoitureRepository;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

@RunWith(SpringRunner.class)
@WebMvcTest(VoitureController.class)
class DemoApplicationTests {
    @MockBean
    private VoitureRepository voitureRepository;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testVoitures() throws Exception {
        Mockito.when(voitureRepository.findAll()).thenReturn(Collections.emptyList());
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/all")
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString()+ " this is response");
        Mockito.verify(voitureRepository).findAll();
    }

}
