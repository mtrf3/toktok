package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R71 extends AbstractC69088R9o {
    public final JSONObject LIZJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        if (this.LIZJ == null) {
            return false;
        }
        C79156V4u.LJLIL = new WeakReference(this.LIZ);
        C79156V4u.LJLILLLLZI = new WeakReference(this.LIZIZ);
        String optString = this.LIZJ.optString("webapp_url");
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        SmartRouter.buildRoute(this.LIZ.mo49getActivity(), optString).open();
        return true;
    }

    public R71(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, JSONObject jSONObject) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = jSONObject;
    }
}
