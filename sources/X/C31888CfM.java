package X;

import com.bytedance.android.live.wallet.IWalletService;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.CfM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31888CfM implements InterfaceC38012Evw {
    public final IWalletService LJLIL;

    public C31888CfM(C38118Exe c38118Exe) {
        new WeakReference(c38118Exe);
        this.LJLIL = (IWalletService) CN1.LIZ(IWalletService.class);
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (c38048EwW == null || (jSONObject2 = c38048EwW.LIZLLL) == null) {
            return;
        }
        c38048EwW.LJIIJ = false;
        jSONObject2.optJSONObject("args").optString("auth_info");
    }
}
