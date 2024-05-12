package androidx.media;

import X.AbstractC06170Mb;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC06170Mb abstractC06170Mb) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.LIZ = (AudioAttributes) abstractC06170Mb.LJIIJJI(audioAttributesImplApi21.LIZ, 1);
        audioAttributesImplApi21.LIZIZ = abstractC06170Mb.LJIIIZ(audioAttributesImplApi21.LIZIZ, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC06170Mb abstractC06170Mb) {
        abstractC06170Mb.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.LIZ;
        abstractC06170Mb.LJIILJJIL(1);
        abstractC06170Mb.LJIJJ(audioAttributes);
        abstractC06170Mb.LJIJI(audioAttributesImplApi21.LIZIZ, 2);
    }
}
