package X;

import com.ss.android.vesdk.ROTATE_DEGREE;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.5RU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RU {
    public final String[] LIZ;
    public final String[] LIZIZ;
    public final int[] LIZJ;
    public final int[] LIZLLL;
    public final float[] LJ;
    public final String[] LJFF;
    public final String[] LJI;
    public final int[] LJII;
    public final int[] LJIIIIZZ;
    public final float[] LJIIIZ;
    public final ROTATE_DEGREE[] LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5RU)) {
            return false;
        }
        C5RU c5ru = (C5RU) obj;
        return o.LJ(this.LIZ, c5ru.LIZ) && o.LJ(this.LIZIZ, c5ru.LIZIZ) && o.LJ(this.LIZJ, c5ru.LIZJ) && o.LJ(this.LIZLLL, c5ru.LIZLLL) && o.LJ(this.LJ, c5ru.LJ) && o.LJ(this.LJFF, c5ru.LJFF) && o.LJ(this.LJI, c5ru.LJI) && o.LJ(this.LJII, c5ru.LJII) && o.LJ(this.LJIIIIZZ, c5ru.LJIIIIZZ) && o.LJ(this.LJIIIZ, c5ru.LJIIIZ) && o.LJ(this.LJIIJ, c5ru.LJIIJ);
    }

    public final int hashCode() {
        String[] strArr = this.LIZ;
        int hashCode = (strArr != null ? Arrays.hashCode(strArr) : 0) * 31;
        String[] strArr2 = this.LIZIZ;
        int hashCode2 = (hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        int[] iArr = this.LIZJ;
        int hashCode3 = (hashCode2 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31;
        float[] fArr = this.LJ;
        int hashCode5 = (hashCode4 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        String[] strArr3 = this.LJFF;
        int hashCode6 = (hashCode5 + (strArr3 != null ? Arrays.hashCode(strArr3) : 0)) * 31;
        String[] strArr4 = this.LJI;
        int hashCode7 = (hashCode6 + (strArr4 != null ? Arrays.hashCode(strArr4) : 0)) * 31;
        int[] iArr3 = this.LJII;
        int hashCode8 = (hashCode7 + (iArr3 != null ? Arrays.hashCode(iArr3) : 0)) * 31;
        int[] iArr4 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (iArr4 != null ? Arrays.hashCode(iArr4) : 0)) * 31;
        float[] fArr2 = this.LJIIIZ;
        int hashCode10 = (hashCode9 + (fArr2 != null ? Arrays.hashCode(fArr2) : 0)) * 31;
        ROTATE_DEGREE[] rotate_degreeArr = this.LJIIJ;
        return hashCode10 + (rotate_degreeArr != null ? Arrays.hashCode(rotate_degreeArr) : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeResParamData(videoFilePaths=");
        LIZ.append(Arrays.toString(this.LIZ));
        LIZ.append(", vFileInfos=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(", vTrimIn=");
        C0JT.LIZLLL(this.LIZJ, LIZ, ", vTrimOut=");
        C0JT.LIZLLL(this.LIZLLL, LIZ, ", videoSpeed=");
        LIZ.append(Arrays.toString(this.LJ));
        LIZ.append(", audioFilePaths=");
        LIZ.append(Arrays.toString(this.LJFF));
        LIZ.append(", aFileInfos=");
        LIZ.append(Arrays.toString(this.LJI));
        LIZ.append(", aTrimIn=");
        C0JT.LIZLLL(this.LJII, LIZ, ", aTrimOut=");
        C0JT.LIZLLL(this.LJIIIIZZ, LIZ, ", audioSpeed=");
        LIZ.append(Arrays.toString(this.LJIIIZ));
        LIZ.append(", rotate=");
        return JBR.LJFF(LIZ, Arrays.toString(this.LJIIJ), ")", LIZ);
    }

    public C5RU(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        this.LIZ = strArr;
        this.LIZIZ = strArr2;
        this.LIZJ = iArr;
        this.LIZLLL = iArr2;
        this.LJ = fArr;
        this.LJFF = strArr3;
        this.LJI = strArr4;
        this.LJII = iArr3;
        this.LJIIIIZZ = iArr4;
        this.LJIIIZ = fArr2;
        this.LJIIJ = rotate_degreeArr;
    }
}
