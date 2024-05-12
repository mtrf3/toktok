package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.EzR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38229EzR implements InterfaceC38140Ey0 {
    public final /* synthetic */ C38150EyA LIZ;

    @Override // X.InterfaceC38140Ey0
    public final /* synthetic */ void LIZJ(C38117Exd c38117Exd, int i) {
    }

    public C38229EzR(C38150EyA c38150EyA) {
        this.LIZ = c38150EyA;
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZ(String str, String str2, C17230lz c17230lz) {
        if (this.LIZ.LJIIIIZZ) {
            Gson gson = new Gson();
            List list = c17230lz.LIZ;
            if (list != null && !list.isEmpty()) {
                GsonProtectorUtils.toJson(gson, c17230lz.LIZ);
            }
            List list2 = (List) c17230lz.LIZIZ;
            if (list2 != null && !list2.isEmpty()) {
                GsonProtectorUtils.toJson(gson, c17230lz.LIZIZ);
            }
            List list3 = (List) c17230lz.LIZJ;
            if (list3 == null || list3.isEmpty()) {
                return;
            }
            GsonProtectorUtils.toJson(gson, c17230lz.LIZJ);
        }
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZIZ(String str, String str2, int i, String str3, C17230lz c17230lz) {
        C59866NeY c59866NeY;
        boolean z;
        String json;
        String str4;
        String str5;
        F0E f0e = this.LIZ.LJIIJ;
        if (f0e != null && (c59866NeY = (C59866NeY) f0e.LIZ(C59866NeY.class)) != null) {
            Gson gson = new Gson();
            List list = c17230lz.LIZ;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                json = "";
            } else {
                json = GsonProtectorUtils.toJson(gson, c17230lz.LIZ);
            }
            List list2 = (List) c17230lz.LIZIZ;
            if (list2 == null || list2.isEmpty()) {
                str4 = "";
            } else {
                str4 = GsonProtectorUtils.toJson(gson, c17230lz.LIZIZ);
            }
            List list3 = (List) c17230lz.LIZJ;
            if (list3 == null || list3.isEmpty()) {
                str5 = "";
            } else {
                str5 = GsonProtectorUtils.toJson(gson, c17230lz.LIZJ);
            }
            InterfaceC59585Na1 interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class);
            if (interfaceC59585Na1 != null) {
                JSONObject jSONObject = new JSONObject();
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("bridge_name", str2);
                jSONObject.put("bridge_access", "false");
                jSONObject.put("reason", i);
                if (str == null) {
                    str = "";
                }
                jSONObject.put("url", str);
                jSONObject.put("log", str3);
                jSONObject.put("jsb_sdk_init_time_line", json);
                jSONObject.put("jsb_instance_time_line", str4);
                jSONObject.put("jsb_call_time_line", str5);
                interfaceC59585Na1.LJIILJJIL("jsb_call_monitor", "jsb_call_rejected", jSONObject, null, null);
            }
        }
    }
}
