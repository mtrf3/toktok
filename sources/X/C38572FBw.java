package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import java.util.LinkedHashMap;

/* renamed from: X.FBw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38572FBw implements AttachUserData {
    public static final C38572FBw LIZ = new C38572FBw();

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC71003Rtn interfaceC71003Rtn = (InterfaceC71003Rtn) ORZ.LJLLLL(PageMonitor.LJFF);
        if (interfaceC71003Rtn == null) {
            return linkedHashMap;
        }
        C38574FBy c38574FBy = PageMonitor.LIZLLL.get(interfaceC71003Rtn);
        if (c38574FBy == null) {
            return linkedHashMap;
        }
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("latest_product_id", String.valueOf(C78948Uye.LJIILJJIL(interfaceC71003Rtn, "lib_track_builtin_lane_business").get((Object) "product_id")));
        String str = c38574FBy.LIZJ.get("log_id");
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("log_id", str);
        oszArr[2] = new OSZ("page_name", c38574FBy.LIZ);
        return C113554cx.LJJLIIIIJ(oszArr);
    }
}
