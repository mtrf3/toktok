package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CgB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31939CgB implements InterfaceC31943CgF {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C31938CgA LIZJ;

    @Override // X.InterfaceC31943CgF
    public final void LIZ(java.util.Map<String, Object> data) {
        Object obj;
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("xbridge end,fun name:");
        C31811Ce7.LJ(LIZ, this.LIZ, LIZ, "XbridgeManager");
        if (this.LIZIZ == 1 && (obj = data.get("data")) != null && (obj instanceof java.util.Map)) {
            data.remove("data");
            data.putAll((java.util.Map) obj);
        }
        this.LIZJ.finishWithRawResult(new JSONObject(data));
    }

    public C31939CgB(String str, int i, C31938CgA c31938CgA) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = c31938CgA;
    }
}
