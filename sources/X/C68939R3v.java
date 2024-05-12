package X;

import Y.ARunnableS46S0100000_10;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import kotlin.jvm.internal.AqS44S1300000_11;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.R3v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68939R3v extends AbstractC68940R3w {
    public final /* synthetic */ InterfaceC88471Ynr<Integer, String, C76800UCe> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ LoginMethodListFragment LIZJ;
    public final /* synthetic */ BaseLoginMethod LIZLLL;

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        super.onNeedSecureCaptcha(response);
        this.LIZ.invoke(Integer.valueOf(response.LIZLLL), response.LJFF);
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        QTX qtx;
        R6R r6r = (R6R) qqi;
        C68937R3t c68937R3t = new C68937R3t(this.LIZIZ, this.LIZJ, r6r, this.LIZLLL);
        if (r6r != null && (qtx = r6r.LJIIIZ) != null && qtx.LJIIJJI) {
            a.LJI().LJIILLIIL(new ARunnableS46S0100000_10((Object) c68937R3t, 32), true);
        } else {
            c68937R3t.invoke();
        }
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String str;
        InterfaceC88471Ynr<Integer, String, C76800UCe> interfaceC88471Ynr = this.LIZ;
        Integer valueOf = Integer.valueOf(i);
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        interfaceC88471Ynr.invoke(valueOf, str);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        super.onNeedCaptcha(response, str);
        this.LIZ.invoke(Integer.valueOf(response.LIZLLL), response.LJFF);
    }

    public C68939R3v(AqS44S1300000_11 aqS44S1300000_11, String str, LoginMethodListFragment loginMethodListFragment, BaseLoginMethod baseLoginMethod) {
        this.LIZ = aqS44S1300000_11;
        this.LIZIZ = str;
        this.LIZJ = loginMethodListFragment;
        this.LIZLLL = baseLoginMethod;
    }
}
