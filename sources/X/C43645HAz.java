package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HAz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43645HAz {
    public final String LIZ;
    public final float LIZIZ;
    public final NLETemplateModel LIZJ;
    public final NLEModel LIZLLL;

    public C43645HAz() {
        this(null, 0.0f, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43645HAz)) {
            return false;
        }
        C43645HAz c43645HAz = (C43645HAz) obj;
        return o.LJ(this.LIZ, c43645HAz.LIZ) && Float.compare(this.LIZIZ, c43645HAz.LIZIZ) == 0 && o.LJ(this.LIZJ, c43645HAz.LIZJ) && o.LJ(this.LIZLLL, c43645HAz.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateDownloadProgress(stage=");
        LIZ.append(this.LIZ);
        LIZ.append(", progress=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nleTemplateModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nleModel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LIZIZ, hashCode * 31, 31);
        NLETemplateModel nLETemplateModel = this.LIZJ;
        if (nLETemplateModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = nLETemplateModel.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        NLEModel nLEModel = this.LIZLLL;
        if (nLEModel != null) {
            i = nLEModel.hashCode();
        }
        return i2 + i;
    }

    public C43645HAz(String str, float f, NLETemplateModel nLETemplateModel, int i) {
        str = (i & 1) != 0 ? null : str;
        f = (i & 2) != 0 ? 0.0f : f;
        nLETemplateModel = (i & 4) != 0 ? null : nLETemplateModel;
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = nLETemplateModel;
        this.LIZLLL = null;
    }
}
