package day12;

// 기능을들 나열한거
interface TvRemoteController {
	// 전원켜기
	// void turnOn();
	// 전원끄기
	// void turnOff();
	// 전원 켜기.끄기
	void turn();

	// 채널 변경(숫자)
	void channel(int channel);

	// 채널 업
	void channelUp();
	// 채널 다운
	void channelDown();

	// 볼륨 업
	void volumnUp();

	// 볼륨 다운
	void volumnDown();

	

}
