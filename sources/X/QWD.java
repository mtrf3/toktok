package X;

import Y.ARunnableS18S0000000_11;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.network.AccountBindingsInterceptor;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.ss.android.ugc.aweme.account.network.AgeVerificationNewUserInterceptor;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.network.StoreRegionInterceptor;
import com.ss.android.ugc.aweme.account.network.ttp.TTPInterceptor;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.notice.api.bean.PushChallengeInfoMsg;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.InterceptorService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import com.ss.android.ugc.aweme.services.RnAndH5Service;
import com.ss.android.ugc.aweme.services.TelecomCarrierService;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class QWD implements IAccountService {
    public volatile RBY LIZ;
    public RnAndH5Service LIZIZ;
    public BindService LIZJ;
    public PasswordService LIZLLL;
    public ProAccountService LJ;
    public InterceptorService LJFF;
    public LoginMethodService LJI;
    public TelecomCarrierService LJII;
    public TwoStepVerificationService LJIIIIZZ;
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public final AtomicReference<LoginService> LJIIJ = new AtomicReference<>(null);
    public final C65885PtR LJIIJJI = new C65885PtR();

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final boolean LIZ() {
        return this.LJIIIZ.get();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String LJIIJJI() {
        return C64707PaR.LIZJ.toUpperCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final C65887PtT LJIILIIL() {
        return new C65887PtT(new C65884PtQ(new C65883PtP(new C65882PtO(new C65889PtV(new C65437PmD())))));
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String LJIILL() {
        String str = X9V.LIZLLL;
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase(Locale.US);
        }
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("mock_store_region", "");
        Locale locale = Locale.ROOT;
        String upperCase = LJI.toUpperCase(locale);
        if (!upperCase.isEmpty()) {
            return upperCase;
        }
        String upperCase2 = C64707PaR.LIZJ.toUpperCase(locale);
        if (!upperCase2.isEmpty()) {
            return upperCase2;
        }
        return LIZLLL();
    }

    public final void LJIIZILJ() {
        R41.LIZIZ = this;
        C61200O0e.LIZ(BindOrModifyPhoneActivity.class, "aweme://bind/mobile/");
        C66960QPs.LIZ = new QWR();
        Context LIZ = QWR.LIZ();
        if (QWG.LIZ == null) {
            synchronized (QWG.class) {
                if (QWG.LIZ == null) {
                    QWG.LIZ = new QWG(LIZ);
                }
            }
        }
        QWG qwg = QWG.LIZ;
        if (qwg != null) {
            ((ConcurrentHashMap) C58252Mtc.LIZ).put(QWJ.class, qwg);
        }
        C66960QPs.LIZ.getClass();
        java.util.Map<Class, InterfaceC66565QAn> map = C58252Mtc.LIZ;
        if (((InterfaceC66565QAn) ((ConcurrentHashMap) map).get(QWK.class)) == null) {
            ((ConcurrentHashMap) map).put(QWK.class, new QWI());
        }
        C66960QPs.LIZ.getClass();
        QQF.LIZ().LIZ = new QWL();
        C66960QPs.LIZ.getClass();
        QWH.LIZ().LIZ = C28791BRr.LJLIL;
        C28791BRr c28791BRr = QWH.LIZ().LIZ;
        C66960QPs.LIZ();
        QWR.LIZ();
        c28791BRr.getClass();
        C66960QPs.LIZ.getClass();
        QPG.LIZIZ(QTJ.class, QTK.LJJJLZIJ());
        HandlerC66956QPo handlerC66956QPo = C66960QPs.LIZIZ;
        handlerC66956QPo.postDelayed(new ARunnableS18S0000000_11(3), 5000L);
        handlerC66956QPo.sendEmptyMessageDelayed(2001, 60000L);
        InterfaceC66963QPv LIZIZ = QTW.LIZIZ(C58725N2z.LIZ);
        Keva repo = Keva.getRepo("first_time_isLogin");
        if (repo.getBoolean("isFirstTime", true)) {
            QTW qtw = (QTW) LIZIZ;
            qtw.LLIIIJ = RBW.LJLLI.LJI();
            SharedPreferences.Editor edit = F9J.LIZIZ(qtw.LLILLL, 0, "com.bytedance.sdk.account_setting").edit();
            edit.putBoolean("is_login", qtw.LLIIIJ);
            edit.apply();
            repo.storeBoolean("isFirstTime", false);
        }
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LIZJ(LiveExchangeConfirmThreshold.DEFAULT, 1, new InterfaceC67148QWy() { // from class: X.M6Z
                @Override // X.InterfaceC67148QWy
                public final void LJIJJLI(WsChannelMsg wsChannelMsg) {
                    try {
                        PushChallengeInfoMsg pushChallengeInfoMsg = (PushChallengeInfoMsg) JsonParseUtils.LIZJ(PushChallengeInfoMsg.class, new String(wsChannelMsg.LIZ()));
                        String optString = new JSONObject(pushChallengeInfoMsg.getExtra()).optString("ticket");
                        HG3.LJIIL();
                        HG3.LJLJL.LJIIL().handlePushChallengeInfo(optString, pushChallengeInfoMsg.getUrl());
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            });
        } else {
            C67125QWb.LJLL.LIZLLL(EnumC54358LVa.SYSTEM, new C56256M6a());
        }
        FFL.LJIIIZ().getClass();
        if (FFL.LJFF(2, "idv_integration_switch_v2", true, true)) {
            QWO qwo = QWO.LIZLLL;
            Application application = C58725N2z.LIZ;
            qwo.getClass();
            QWO.LIZ(application);
        }
        C65083PgV.LIZIZ(AccountRetrofitInetcept.LJLIL);
        C65083PgV.LIZIZ(StoreRegionInterceptor.LJLIL);
        C65083PgV.LIZIZ(TTPInterceptor.LJLIL);
        C65083PgV.LIZIZ(AccountBindingsInterceptor.LJLIL);
        C65083PgV.LIZIZ(AgeVerificationNewUserInterceptor.LJLIL);
        QWE.LIZ();
        QWF.LIZ();
        ((QTW) LIZIZ).LIZ(this.LJIIJJI);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void tryInit() {
        if (!this.LJIIIZ.get()) {
            synchronized (this.LJIIIZ) {
                if (!this.LJIIIZ.get()) {
                    LJIIZILJ();
                    this.LJIIIZ.set(true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final TelecomCarrierService LIZIZ() {
        tryInit();
        if (this.LJII == null) {
            this.LJII = new TelecomCarrierService();
        }
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final BindService LIZJ() {
        tryInit();
        if (this.LIZJ == null) {
            this.LIZJ = new BindService();
        }
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final String LIZLLL() {
        return C85990Xow.LIZ().toUpperCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final InterceptorService LJ() {
        tryInit();
        if (this.LJFF == null) {
            this.LJFF = new InterceptorService();
        }
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final RBY LJFF() {
        tryInit();
        if (this.LIZ == null) {
            this.LIZ = new RBY();
            RBY rby = this.LIZ;
            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.LIZ;
            rby.getClass();
            C68542QvC.LIZ.getClass();
            C68542QvC.LIZJ = networkProxyAccount;
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final InterfaceC65895Ptb LJI() {
        tryInit();
        if (this.LJIIJ.get() == null) {
            synchronized (this.LJIIJ) {
                if (this.LJIIJ.get() == null) {
                    this.LJIIJ.set(new LoginService());
                }
            }
        }
        return this.LJIIJ.get();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final PasswordService LJII() {
        tryInit();
        if (this.LIZLLL == null) {
            this.LIZLLL = new PasswordService();
        }
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final ProAccountService LJIIIIZZ() {
        tryInit();
        if (this.LJ == null) {
            this.LJ = new ProAccountService();
        }
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final LoginMethodService LJIIIZ() {
        tryInit();
        if (this.LJI == null) {
            this.LJI = new LoginMethodService();
        }
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final RnAndH5Service LJIIJ() {
        tryInit();
        if (this.LIZIZ == null) {
            this.LIZIZ = new RnAndH5Service();
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final InterfaceC26157AOj LJIIL() {
        tryInit();
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new TwoStepVerificationService();
        }
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void LJIILJJIL(LEA lea) {
        synchronized (R41.class) {
            List<LEA> list = R41.LIZ;
            if (!((CopyOnWriteArrayList) list).contains(lea)) {
                ((CopyOnWriteArrayList) list).add(lea);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService
    public final void LJIILLIIL(LEA lea) {
        synchronized (R41.class) {
            ((CopyOnWriteArrayList) R41.LIZ).remove(lea);
        }
    }
}
