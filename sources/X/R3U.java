package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R3U implements InterfaceC38012Evw {
    public final WeakReference<Context> LJLIL;

    public R3U(WeakReference<Context> contextRef, C38049EwX iesJsBridge) {
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
        this.LJLIL = contextRef;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        String str;
        String str2;
        Intent intent;
        JSONObject jSONObject2;
        if (this.LJLIL.get() == null) {
            return;
        }
        if (c38048EwW != null && (jSONObject2 = c38048EwW.LIZLLL) != null) {
            str = jSONObject2.optString("interstitial_token");
        } else {
            str = null;
        }
        AccountRetrofitInetcept accountRetrofitInetcept = AccountRetrofitInetcept.LJLIL;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        accountRetrofitInetcept.getClass();
        AccountRetrofitInetcept.LJLJI = str2;
        if (C52927Kpv.LIZ()) {
            intent = new Intent(this.LJLIL.get(), (Class<?>) TwoStepVerificationManagementActivity.class);
        } else {
            intent = new Intent(this.LJLIL.get(), (Class<?>) TwoStepVerificationManageActivity.class);
        }
        intent.putExtra("enter_from", "mandatory_page");
        intent.putExtra("is_from_un_login_user", true);
        intent.putExtra("interstitial_token", str);
        Context context = this.LJLIL.get();
        o.LJI(context);
        C16880lQ.LIZJ(context, intent);
    }
}
