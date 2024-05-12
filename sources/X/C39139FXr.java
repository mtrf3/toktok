package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.FXr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39139FXr implements InterfaceC39141FXt {
    public final /* synthetic */ Context LIZ;

    public C39139FXr(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("https://mon.tiktokv.com/monitor/appmonitor/v2/settings");
        arrayList2.add("https://mon.tiktokv.com/monitor/collect/");
        SDKMonitorUtils.LIZLLL("1385", arrayList);
        SDKMonitorUtils.LJ("1385", arrayList2);
        SDKMonitorUtils.LIZJ(C16880lQ.LLLLL(this.LIZ), "1385", jSONObject, new C39138FXq());
    }
}
