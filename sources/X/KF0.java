package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KF0 {
    public final Word LIZ;
    public final int LIZIZ;

    public KF0() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KF0)) {
            return false;
        }
        KF0 kf0 = (KF0) obj;
        return o.LJ(this.LIZ, kf0.LIZ) && this.LIZIZ == kf0.LIZIZ;
    }

    public final int hashCode() {
        Word word = this.LIZ;
        return ((word == null ? 0 : word.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchHintWordModel(hintWord=");
        LIZ.append(this.LIZ);
        LIZ.append(", hintPosition=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public KF0(Word word, int i) {
        this.LIZ = word;
        this.LIZIZ = i;
    }

    public /* synthetic */ KF0(Word word, int i, int i2) {
        this((i & 1) != 0 ? null : word, 0);
    }
}
