package X;

import com.tiktok.ttm.TTMCore;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Pz2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66232Pz2 implements InterfaceC64299PLj {
    public static final C66232Pz2 LIZ = new C66232Pz2();

    @Override // X.InterfaceC64299PLj
    public final java.util.Map LIZ(JSONObject jSONObject) {
        String dumpInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long optLong = jSONObject.optLong("tid");
        TTMCore tTMCore = TTMCore.LIZJ;
        if (!tTMCore.LIZ()) {
            dumpInfo = "null";
        } else if (!tTMCore.LIZIZ.LIZLLL) {
            dumpInfo = "d-null";
        } else {
            dumpInfo = TTMCore.JNIHelper.dumpInfo(optLong);
        }
        o.LJIIIIZZ(dumpInfo, "getInstance().dump(tid)");
        linkedHashMap.put("ttmachine_state_dump_info", dumpInfo);
        return linkedHashMap;
    }
}
