package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* renamed from: X.J2l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48519J2l implements J3D {
    public final C47663InD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    @Override // X.J3D
    public final String getModelType() {
        return "bytenn";
    }

    @Override // X.J3D
    public final boolean enable() {
        if (!this.LIZLLL && !TextUtils.isEmpty(this.LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.J3D
    public final String getModelDirName() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.J3D
    public final String modelUrl() {
        String str = this.LIZIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C48519J2l(C47663InD c47663InD) {
        String str;
        Object obj;
        this.LIZ = c47663InD;
        this.LIZIZ = C78880UxY.LJJLIIJ(c47663InD);
        SmartSceneConfig LJJZZI = C78880UxY.LJJZZI(c47663InD);
        if (LJJZZI != null) {
            str = LJJZZI.outType;
        } else {
            java.util.Map map = (java.util.Map) c47663InD.LIZJ;
            if (map != null && (obj = map.get("outputType")) != null) {
                str = obj.toString();
            } else {
                str = null;
            }
        }
        this.LIZJ = str;
        this.LIZLLL = C78880UxY.LJJI(c47663InD);
    }
}
