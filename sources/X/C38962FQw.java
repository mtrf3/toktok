package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.FQw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38962FQw implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;

    public C38962FQw(WeakReference<Context> weakReference) {
        this.LJLIL = weakReference;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Activity LJIJJ;
        if (UC0.LJJI(this.LJLIL) == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "h5");
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
        if (c38048EwW.LIZLLL.has("args")) {
            jSONObject2 = JSONObjectProtectorUtils.getJSONObject(c38048EwW.LIZLLL, "args");
        } else {
            jSONObject2 = null;
        }
        OZ1.LIZIZ.LJ(UC0.LJJI(this.LJLIL));
        if (jSONObject2 != null && jSONObject2.has("should_close_self") && JSONObjectProtectorUtils.getBoolean(jSONObject2, "should_close_self") && (LJIJJ = C45804HyK.LJIJJ(UC0.LJJI(this.LJLIL))) != null) {
            LJIJJ.finish();
        }
    }
}
