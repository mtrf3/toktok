package androidx.media;

import X.X1D;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes LIZ;
    public int LIZIZ = -1;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioAttributesCompat: audioattributes=");
        LIZ.append(this.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.LIZ.equals(((AudioAttributesImplApi21) obj).LIZ);
    }
}
