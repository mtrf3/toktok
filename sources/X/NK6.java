package X;

import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NK6 implements InterfaceC23970wr {
    public static final NK6 LIZ = new NK6();

    @Override // X.InterfaceC23970wr
    public final void onEventV3(String str, JSONObject jSONObject) {
        IAppLogDepend LIZ2 = C59835Ne3.LIZ();
        if (LIZ2 != null) {
            LIZ2.onEventV3Json(str, jSONObject);
        }
    }
}
