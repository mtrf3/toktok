package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.HQm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44048HQm {
    public final String LIZ;
    public final int LIZIZ;
    public final NLETemplateModel LIZJ;
    public final NLEModel LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final AVMusic LJIIJJI;
    public final String LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C44048HQm() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r16 = 32767(0x7fff, float:4.5916E-41)
            r0 = r17
            r3 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r2
            r12 = r1
            r13 = r1
            r14 = r2
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44048HQm.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44048HQm)) {
            return false;
        }
        C44048HQm c44048HQm = (C44048HQm) obj;
        return o.LJ(this.LIZ, c44048HQm.LIZ) && this.LIZIZ == c44048HQm.LIZIZ && o.LJ(this.LIZJ, c44048HQm.LIZJ) && o.LJ(this.LIZLLL, c44048HQm.LIZLLL) && this.LJ == c44048HQm.LJ && o.LJ(this.LJFF, c44048HQm.LJFF) && o.LJ(this.LJI, c44048HQm.LJI) && o.LJ(this.LJII, c44048HQm.LJII) && o.LJ(this.LJIIIIZZ, c44048HQm.LJIIIIZZ) && o.LJ(this.LJIIIZ, c44048HQm.LJIIIZ) && this.LJIIJ == c44048HQm.LJIIJ && o.LJ(this.LJIIJJI, c44048HQm.LJIIJJI) && o.LJ(this.LJIIL, c44048HQm.LJIIL) && this.LJIILIIL == c44048HQm.LJIILIIL && o.LJ(this.LJIILJJIL, c44048HQm.LJIILJJIL);
    }

    public final boolean LIZ() {
        int i;
        String str;
        int i2 = this.LIZIZ;
        if (i2 == 3 || (i = this.LJIIJ) == 3) {
            return true;
        }
        if (i2 == 2 && this.LIZJ == null && this.LIZLLL == null) {
            return true;
        }
        if (i == 2 && (this.LJIIJJI == null || (str = this.LJIIL) == null || str.length() == 0)) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        boolean z;
        String str;
        String str2 = this.LJIIIZ;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LIZIZ != 2) {
                return false;
            }
            if (this.LIZJ == null && this.LIZLLL == null) {
                return false;
            }
            return true;
        }
        if (this.LIZIZ != 2) {
            return false;
        }
        if ((this.LIZJ == null && this.LIZLLL == null) || this.LJIIJ != 2 || this.LJIIJJI == null || (str = this.LJIIL) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode * 31) + this.LIZIZ) * 31;
        NLETemplateModel nLETemplateModel = this.LIZJ;
        if (nLETemplateModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = nLETemplateModel.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        NLEModel nLEModel = this.LIZLLL;
        if (nLEModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = nLEModel.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJ, (i3 + hashCode3) * 31, 31);
        String str2 = this.LJFF;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (LIZJ + hashCode4) * 31;
        String str3 = this.LJI;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str4 = this.LJII;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str5 = this.LJIIIIZZ;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str6 = this.LJIIIZ;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i8 = (((i7 + hashCode8) * 31) + this.LJIIJ) * 31;
        AVMusic aVMusic = this.LJIIJJI;
        if (aVMusic == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = aVMusic.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str7 = this.LJIIL;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i10 = (((i9 + hashCode10) * 31) + this.LJIILIIL) * 31;
        String str8 = this.LJIILJJIL;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateDownloadResult(templateId = ");
        LIZ.append(this.LIZ);
        LIZ.append(", templateStatus = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nleTemplateModel = ");
        String str3 = "Non-null";
        if (this.LIZJ != null) {
            str = "Non-null";
        } else {
            str = "null";
        }
        LIZ.append(str);
        LIZ.append(",nleModel = ");
        if (this.LIZLLL != null) {
            str2 = "Non-null";
        } else {
            str2 = "null";
        }
        LIZ.append(str2);
        LIZ.append(", musicId = ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", musicStatus = ");
        LIZ.append(this.LJIIJ);
        LIZ.append(", musicPath = ");
        LIZ.append(this.LJIIL);
        LIZ.append(", avMusic = ");
        if (this.LJIIJJI == null) {
            str3 = "null";
        }
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C44048HQm(String str, int i, NLETemplateModel nLETemplateModel, long j, String str2, String str3, String str4, String str5, String str6, int i2, AVMusic aVMusic, String str7, int i3, String str8, int i4) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? null : nLETemplateModel, (NLEModel) null, (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? -1 : i2, (i4 & 2048) != 0 ? null : aVMusic, (i4 & 4096) != 0 ? null : str7, (i4 & FileUtils.BUFFER_SIZE) != 0 ? -1 : i3, (i4 & 16384) != 0 ? null : str8);
    }

    public C44048HQm(String str, int i, NLETemplateModel nLETemplateModel, NLEModel nLEModel, long j, String str2, String str3, String str4, String str5, String str6, int i2, AVMusic aVMusic, String str7, int i3, String str8) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = nLETemplateModel;
        this.LIZLLL = nLEModel;
        this.LJ = j;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = i2;
        this.LJIIJJI = aVMusic;
        this.LJIIL = str7;
        this.LJIILIIL = i3;
        this.LJIILJJIL = str8;
    }
}
