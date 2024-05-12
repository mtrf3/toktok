package androidx.media;

import X.AbstractC06170Mb;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC06170Mb abstractC06170Mb) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.LIZ = abstractC06170Mb.LJIIIZ(audioAttributesImplBase.LIZ, 1);
        audioAttributesImplBase.LIZIZ = abstractC06170Mb.LJIIIZ(audioAttributesImplBase.LIZIZ, 2);
        audioAttributesImplBase.LIZJ = abstractC06170Mb.LJIIIZ(audioAttributesImplBase.LIZJ, 3);
        audioAttributesImplBase.LIZLLL = abstractC06170Mb.LJIIIZ(audioAttributesImplBase.LIZLLL, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC06170Mb abstractC06170Mb) {
        abstractC06170Mb.getClass();
        abstractC06170Mb.LJIJI(audioAttributesImplBase.LIZ, 1);
        abstractC06170Mb.LJIJI(audioAttributesImplBase.LIZIZ, 2);
        abstractC06170Mb.LJIJI(audioAttributesImplBase.LIZJ, 3);
        abstractC06170Mb.LJIJI(audioAttributesImplBase.LIZLLL, 4);
    }
}
