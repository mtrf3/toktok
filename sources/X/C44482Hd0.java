package X;

import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Hd0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44482Hd0 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ = 3000;
    public int LIZLLL = 0;
    public final String[] LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44482Hd0)) {
            return false;
        }
        C44482Hd0 c44482Hd0 = (C44482Hd0) obj;
        return o.LJ(this.LIZ, c44482Hd0.LIZ) && o.LJ(this.LIZIZ, c44482Hd0.LIZIZ) && this.LIZJ == c44482Hd0.LIZJ && this.LIZLLL == c44482Hd0.LIZLLL && o.LJ(this.LJ, c44482Hd0.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + Arrays.hashCode(this.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoEndWatermarkData(endWatermarkFrame=");
        LIZ.append(this.LIZ);
        LIZ.append(", endAudioPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", watermarkDuration=");
        LIZ.append(this.LIZJ);
        LIZ.append(", inputMediaDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", transitions=");
        return q.LIZIZ(LIZ, Arrays.toString(this.LJ), ')', LIZ);
    }

    public C44482Hd0(String str, String str2, String[] strArr) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LJ = strArr;
    }
}
