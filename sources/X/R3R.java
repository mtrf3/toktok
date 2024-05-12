package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R3R implements InterfaceC38012Evw {
    public R3R(WeakReference<Context> contextRef, C38049EwX iesJsBridge) {
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        AuthorizeActivity authorizeActivity;
        WeakReference weakReference = C79156V4u.LJLJI;
        if (weakReference != null && (authorizeActivity = (AuthorizeActivity) weakReference.get()) != null) {
            authorizeActivity.LLIIIILZ();
        }
        AccountRetrofitInetcept.LJLIL.getClass();
        AccountRetrofitInetcept.LJLJI = "";
        WeakReference weakReference2 = C79156V4u.LJLIL;
        if (weakReference2 != null && (fragment = (Fragment) weakReference2.get()) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
        R3S r3s = C79156V4u.LJLJJI;
        if (r3s != null) {
            r3s.onError();
        }
        C79156V4u.LJLIL = null;
        C79156V4u.LJLILLLLZI = null;
        C79156V4u.LJLJI = null;
        C79156V4u.LJLJJI = null;
    }
}
