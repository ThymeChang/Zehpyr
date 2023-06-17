package com.example.mpdemo;

import com.example.mpdemo.pojo.Stuthyme;
import com.example.mpdemo.service.StuthymeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MpDemoApplicationTests {

	@Autowired
	private StuthymeService stuthymeService;

	@Test
	void contextLoads() {
		ArrayList<String> ids = new ArrayList<>();
		ids.add("0254545");
		ids.add("1256464");
		ids.add("254545");
		ids.add("254575");
		stuthymeService.queryAll(ids);

	}

	@Test
	void addBatch(){
		ArrayList<Stuthyme> stuthymes = new ArrayList<>();

//		stuthymes.add(new Stuthyme("周杰伦","男",03));
//		stuthymes.add(new Stuthyme("李健","男",02));
//		stuthymes.add(new Stuthyme("kay","女",02));
		stuthymeService.addMore(stuthymes);
	}

	@Test
	void selectCondition(){
		ArrayList<Stuthyme> stuthymes = stuthymeService.queryFilter();
		System.out.println(stuthymes);
	}

}
