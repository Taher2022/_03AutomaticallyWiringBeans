package _12_com.spring.mixingXMLConfigInJavaConfig;

import org.springframework.stereotype.Component;

@Component
public class _03CDPlayer implements _01CompactDisk {

	private _02MediaPlayer mediaPlayer;
	
	public _03CDPlayer(_02MediaPlayer mediaPlayer) {
		super();
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void play() {
		System.out.println("Playing CD with ");
		mediaPlayer.playMediaPlayer();
	}

}
