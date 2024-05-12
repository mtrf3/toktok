package androidx.media;

import X.AbstractC06170Mb;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC06170Mb abstractC06170Mb) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.LIZ;
        if (abstractC06170Mb.LJII(1)) {
            obj = abstractC06170Mb.LJIILIIL();
        }
        audioAttributesCompat.LIZ = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC06170Mb abstractC06170Mb) {
        abstractC06170Mb.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.LIZ;
        abstractC06170Mb.LJIILJJIL(1);
        abstractC06170Mb.LJIL(audioAttributesImpl);
    }
}
