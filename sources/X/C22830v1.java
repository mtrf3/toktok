package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import defpackage.q;
import org.json.JSONObject;

/* renamed from: X.0v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22830v1 {
    public final int LIZ;
    public final JSONObject LIZIZ;
    public final PTYError LIZJ;
    public final PTYPackageInfo LIZLLL;

    public final boolean LIZ() {
        if (this.LIZ == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PitayaTaskOutputData :: [isSuccess == ");
        LIZ.append(LIZ());
        LIZ.append(" | code == ");
        LIZ.append(this.LIZ);
        String str3 = "";
        if (this.LIZIZ == null) {
            str = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" | outputData == ");
            LIZ2.append(this.LIZIZ);
            str = X1D.LIZIZ(LIZ2);
        }
        LIZ.append(str);
        if (this.LIZJ == null) {
            str2 = "";
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" | rawError == ");
            LIZ3.append(this.LIZJ);
            str2 = X1D.LIZIZ(LIZ3);
        }
        LIZ.append(str2);
        if (this.LIZLLL != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(" | rawPackageInfo == ");
            LIZ4.append(this.LIZLLL);
            str3 = X1D.LIZIZ(LIZ4);
        }
        return q.LIZIZ(LIZ, str3, ']', LIZ);
    }

    public C22830v1(int i, JSONObject jSONObject, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
        this.LIZ = i;
        this.LIZIZ = jSONObject;
        this.LIZJ = pTYError;
        this.LIZLLL = pTYPackageInfo;
    }

    public /* synthetic */ C22830v1(int i, JSONObject jSONObject, PTYError pTYError, PTYPackageInfo pTYPackageInfo, int i2) {
        this(i, (i2 & 2) != 0 ? null : jSONObject, (i2 & 4) != 0 ? null : pTYError, (i2 & 8) != 0 ? null : pTYPackageInfo);
    }
}
