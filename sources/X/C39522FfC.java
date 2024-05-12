package X;

import com.bytedance.ruler.base.models.RuleModel;
import com.google.gson.j;

/* renamed from: X.FfC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39522FfC {
    public final int LIZ;
    public final String LIZIZ;
    public RuleModel LIZJ;
    public final Throwable LIZLLL;
    public final j LJ;
    public final Object LJFF;

    public C39522FfC() {
        this(0, null, null, null, null, null, 63);
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[code = ");
        LIZ.append(this.LIZ);
        LIZ.append(", ruleModel=");
        RuleModel ruleModel = this.LIZJ;
        if (ruleModel != null) {
            str = ruleModel.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", msg = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", result = ");
        LIZ.append(this.LJ);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public C39522FfC(int i, String str, RuleModel ruleModel, Throwable th, j jVar, Object obj, int i2) {
        i = (i2 & 1) != 0 ? -1 : i;
        str = (i2 & 2) != 0 ? null : str;
        ruleModel = (i2 & 4) != 0 ? null : ruleModel;
        th = (i2 & 8) != 0 ? null : th;
        jVar = (i2 & 16) != 0 ? null : jVar;
        obj = (i2 & 32) != 0 ? null : obj;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = ruleModel;
        this.LIZLLL = th;
        this.LJ = jVar;
        this.LJFF = obj;
    }
}
