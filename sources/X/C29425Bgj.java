package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.Bgj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29425Bgj extends C29421Bgf {
    public final HybridDialogFragment LJLJI;

    @Override // X.C29421Bgf, X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        super.call(c38048EwW, jSONObject);
        if (TextUtils.equals(c38048EwW.LIZLLL.optString("type"), "gift_panel")) {
            this.LJLJI.dismissAllowingStateLoss();
        }
    }

    public C29425Bgj(WeakReference<Context> weakReference, HybridDialogFragment hybridDialogFragment, String str) {
        super(weakReference, new C29426Bgk(str));
        this.LJLJI = hybridDialogFragment;
    }
}
