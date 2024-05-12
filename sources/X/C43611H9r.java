package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.H9r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43611H9r {
    public final NLETemplateModel LIZ;
    public NLEModel LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final AVMusic LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43611H9r)) {
            return false;
        }
        C43611H9r c43611H9r = (C43611H9r) obj;
        return o.LJ(this.LIZ, c43611H9r.LIZ) && o.LJ(this.LIZIZ, c43611H9r.LIZIZ) && this.LIZJ == c43611H9r.LIZJ && o.LJ(this.LIZLLL, c43611H9r.LIZLLL) && o.LJ(this.LJ, c43611H9r.LJ) && o.LJ(this.LJFF, c43611H9r.LJFF) && o.LJ(this.LJI, c43611H9r.LJI) && o.LJ(this.LJII, c43611H9r.LJII) && o.LJ(this.LJIIIIZZ, c43611H9r.LJIIIIZZ) && o.LJ(this.LJIIIZ, c43611H9r.LJIIIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        NLETemplateModel nLETemplateModel = this.LIZ;
        int i = 0;
        if (nLETemplateModel == null) {
            hashCode = 0;
        } else {
            hashCode = nLETemplateModel.hashCode();
        }
        int i2 = hashCode * 31;
        NLEModel nLEModel = this.LIZIZ;
        if (nLEModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = nLEModel.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZJ, (i2 + hashCode2) * 31, 31);
        String str = this.LIZLLL;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i3 = (LIZJ + hashCode3) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str4 = this.LJI;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJII, (i5 + hashCode6) * 31, 31);
        AVMusic aVMusic = this.LJIIIIZZ;
        if (aVMusic == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = aVMusic.hashCode();
        }
        int i6 = (LJ + hashCode7) * 31;
        String str5 = this.LJIIIZ;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateData(nleTemplateModel = ");
        boolean z2 = true;
        if (this.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", nleModel = ");
        if (this.LIZIZ == null) {
            z2 = false;
        }
        LIZ.append(z2);
        LIZ.append(", avMusic = ");
        AVMusic aVMusic = this.LJIIIIZZ;
        if (aVMusic != null) {
            str = aVMusic.getMusicId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", musicPath = ");
        return q.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C43611H9r(NLETemplateModel nLETemplateModel, NLEModel nLEModel, long j, String str, String str2, String str3, String str4, String str5, AVMusic aVMusic, String str6) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = nLEModel;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = aVMusic;
        this.LJIIIZ = str6;
    }
}
