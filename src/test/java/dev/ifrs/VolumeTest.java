package dev.ifrs;

import dev.ifrs.AudioManager;
import dev.ifrs.VolumeUtil;

@ExtendWith(MockitoExtension.class)
public class VolumeTest {
    // 1 - Crie um mock da classe AudioManager
    @Mock
    AudioManager audioManager;

    // 2 - injete um mock da classe VolumeUtil
    @InjectMocks
    VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
        // 3 - realize uma chamada para o método maximizeVolume do objeto VolumeUtil
        volumeUtil.maximizeVolume(100);
    
        // 4 - Verifique se o método setVolume foi chamado uma única vez
        verify(audioManager, times(1)).setVolume();
    }

}
