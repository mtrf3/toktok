package androidx.media;

import X.AbstractC06170Mb;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC06170Mb abstractC06170Mb) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.LIZ = (AudioAttributes) abstractC06170Mb.LJIIJJI(audioAttributesImplApi26.LIZ, 1);
        audioAttributesImplApi26.LIZIZ = abstractC06170Mb.LJIIIZ(audioAttributesImplApi26.LIZIZ, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC06170Mb abstractC06170Mb) {
        abstractC06170Mb.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.LIZ;
        abstractC06170Mb.LJIILJJIL(1);
        abstractC06170Mb.LJIJJ(audioAttributes);
        abstractC06170Mb.LJIJI(audioAttributesImplApi26.LIZIZ, 2);
    }
}
