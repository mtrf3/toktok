package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A0B implements R47 {
    public final /* synthetic */ DialogC25756A8y LIZ;
    public final /* synthetic */ ThirdPartyBindingPage LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    public A0B(DialogC25756A8y dialogC25756A8y, ThirdPartyBindingPage thirdPartyBindingPage, String str, String str2) {
        this.LIZ = dialogC25756A8y;
        this.LIZIZ = thirdPartyBindingPage;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        int i3;
        String str;
        if (i == 18) {
            this.LIZ.dismiss();
            String str2 = null;
            if (i2 != 1) {
                if (i2 != 3) {
                    return;
                }
                if (obj instanceof Bundle) {
                    BaseBundle baseBundle = (BaseBundle) obj;
                    i3 = baseBundle.getInt("error_code");
                    str2 = baseBundle.getString("error_message");
                } else {
                    i3 = -1;
                }
                if (TextUtils.isEmpty(str2)) {
                    str = this.LIZIZ.getString(R.string.s87, this.LIZJ);
                } else {
                    o.LJI(str2);
                    str = str2;
                }
                o.LJIIIIZZ(str, "if (TextUtils.isEmpty(er…           errorMessage!!");
                C26045AKb c26045AKb = new C26045AKb(this.LIZIZ);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
                ThirdPartyBindingPage thirdPartyBindingPage = this.LIZIZ;
                String str3 = this.LIZLLL;
                thirdPartyBindingPage.getClass();
                ThirdPartyBindingPage.Gl(i3, str3, str2);
                return;
            }
            ThirdPartyBindingPage thirdPartyBindingPage2 = this.LIZIZ;
            String string = thirdPartyBindingPage2.getString(R.string.s8b, this.LIZJ);
            o.LJIIIIZZ(string, "getString(R.string.thrp_…_success_toast, showName)");
            C26045AKb c26045AKb2 = new C26045AKb(thirdPartyBindingPage2);
            c26045AKb2.LJIIIZ(string);
            c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb2.LJII(R.attr.e8);
            c26045AKb2.LJIIJ();
            this.LIZIZ.Hl(this.LIZLLL, false);
            ThirdPartyBindingPage thirdPartyBindingPage3 = this.LIZIZ;
            String str4 = this.LIZLLL;
            thirdPartyBindingPage3.getClass();
            ThirdPartyBindingPage.Gl(0, str4, null);
        }
    }
}
