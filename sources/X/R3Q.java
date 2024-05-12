package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R3Q implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;

    public R3Q(WeakReference<Context> contextRef, C38049EwX iesJsBridge) {
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
        this.LJLIL = contextRef;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW msg, JSONObject jSONObject) {
        Fragment fragment;
        InterfaceC69056R8i interfaceC69056R8i;
        AuthorizeActivity authorizeActivity;
        o.LJIIIZ(msg, "msg");
        if (msg.LIZLLL == null) {
            return;
        }
        AccountRetrofitInetcept.LJLIL.getClass();
        AccountRetrofitInetcept.LJLJI = "";
        QTX qtx = new QTX(msg.LIZLLL);
        qtx.LIZ();
        WeakReference weakReference = C79156V4u.LJLIL;
        if (weakReference != null) {
            fragment = (Fragment) weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference weakReference2 = C79156V4u.LJLILLLLZI;
        if (weakReference2 != null) {
            interfaceC69056R8i = (InterfaceC69056R8i) weakReference2.get();
        } else {
            interfaceC69056R8i = null;
        }
        QTW qtw = (QTW) QTW.LIZIZ(this.LJLIL.get());
        qtw.LLILII = qtx;
        qtw.LJFF(qtx, false);
        QTW qtw2 = (QTW) QTW.LIZIZ(this.LJLIL.get());
        qtw2.LLIIIJ = true;
        SharedPreferences.Editor edit = F9J.LIZIZ(qtw2.LLILLL, 0, "com.bytedance.sdk.account_setting").edit();
        edit.putBoolean("is_login", qtw2.LLIIIJ);
        edit.apply();
        if (qtw2.LJLIL != null) {
            String LIZJ = C66953QPl.LJZL.LIZJ(null, false, true);
            if (!TextUtils.isEmpty(LIZJ)) {
                QQM.LJIIJJI(qtw2.LLILLL, LIZJ, new C66959QPr(LIZJ)).LJIIIZ();
            }
        }
        new R7H(this.LJLIL.get()).LJJIII("wap_login", null);
        if (fragment != null && interfaceC69056R8i != null) {
            C68985R5p.LIZIZ(fragment, interfaceC69056R8i, interfaceC69056R8i.scene(), interfaceC69056R8i.LJLLLL(), qtx);
        } else {
            R3S r3s = C79156V4u.LJLJJI;
            if (r3s != null) {
                r3s.LIZ(qtx);
            } else {
                Context context = this.LJLIL.get();
                o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
                C68985R5p.LIZ((Activity) context, qtx, msg.LIZLLL, false);
            }
        }
        WeakReference weakReference3 = C79156V4u.LJLJI;
        if (weakReference3 != null && (authorizeActivity = (AuthorizeActivity) weakReference3.get()) != null) {
            authorizeActivity.LLFF = true;
            C79156V4u.LJLJI = null;
            authorizeActivity.LJJIIZI(qtx);
        }
        C79156V4u.LJLJI = null;
        C79156V4u.LJLILLLLZI = null;
        C79156V4u.LJLIL = null;
        C79156V4u.LJLJJI = null;
    }
}
