package com.ss.android.ugc.aweme.services;

import X.C10K;
import X.C53262KvK;
import X.C58725N2z;
import X.C68517Qun;
import X.C68540QvA;
import X.C76800UCe;
import X.C77119UOl;
import X.C79004UzY;
import X.C85990Xow;
import X.FFL;
import X.InterfaceC253709xW;
import X.InterfaceC68532Qv2;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.R41;
import X.RBW;
import Y.AgS109S0200000_6;
import Y.AgS123S0100000_6;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.AqS60S0201000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LoginMethodService implements InterfaceC253709xW {
    public final String TAG = "LoginMethodService";

    @Override // X.InterfaceC253709xW
    public boolean isTrustedEnvLoginFreshInstallEnable() {
        try {
            FFL.LJIIIZ().getClass();
            return FFL.LJIIJ(31744, 0, "trusted_env_login_on_new_install", true) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String getCurSecUserId() {
        return RBW.LJLLI.LIZJ();
    }

    @Override // X.InterfaceC253709xW
    public String getLatestLoginMethodName() {
        BaseLoginMethod LJIIJJI = C68517Qun.LIZ.LJIIJJI();
        if (LJIIJJI instanceof TPLoginMethod) {
            return ((TPLoginMethod) LJIIJJI).getPlatform();
        }
        return LJIIJJI.getLoginMethodName().name();
    }

    @Override // X.InterfaceC253709xW
    public boolean isCurrentMethodAvaliable() {
        C68517Qun c68517Qun = C68517Qun.LIZ;
        o.LJIIIIZZ(R41.LIZLLL(), "getCurUserId()");
        return !C79004UzY.LJJIFFI(c68517Qun.LJI(r1));
    }

    public int getCurrentLoginHistoryState() {
        return C68540QvA.LIZIZ(getCurSecUserId());
    }

    @Override // X.InterfaceC253709xW
    public boolean getSaveLoginStatus() {
        if (C53262KvK.LIZIZ()) {
            return C68517Qun.LIZ.LJIIJ();
        }
        synchronized (C68517Qun.LIZ) {
            List<BaseLoginMethod> list = C68517Qun.LIZJ;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (o.LJ(((BaseLoginMethod) next).getUid(), R41.LIZLLL())) {
                    arrayList.add(next);
                }
            }
            if (!C79004UzY.LJJIFFI(arrayList)) {
                Boolean allowOneKeyLogin = ((BaseLoginMethod) ORZ.LJLLJ(arrayList)).getAllowOneKeyLogin();
                if (allowOneKeyLogin != null) {
                    return allowOneKeyLogin.booleanValue();
                }
            }
        }
        if (isOneKeyLoginExperimentEnabled()) {
            return false;
        }
        return ((InterfaceC68532Qv2) C77119UOl.LJIIL(C58725N2z.LIZ, InterfaceC68532Qv2.class)).LIZIZ(false);
    }

    @Override // X.InterfaceC253709xW
    public boolean isOneKeyLoginExperimentEnabled() {
        return !ujb.o.LJJJJIZL("JP", C85990Xow.LIZ(), true);
    }

    public void removeLoginMethod(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C68517Qun c68517Qun = C68517Qun.LIZ;
        o.LJI(str);
        c68517Qun.LJIILLIIL(str);
    }

    @Override // X.InterfaceC253709xW
    public void fetchLoginHistoryState(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        TrustedEnvApi.LIZ.getLoginHistoryFeatureState().LJ(new AgS109S0200000_6(lifecycleOwner, new AqS142S0200000_11(this, (LoginMethodService) interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) 4), 4), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC253709xW
    public void updateAllowOneKeyLoginInfo(boolean z, boolean z2) {
        int i;
        if (isOneKeyLoginExperimentEnabled()) {
            C68517Qun.LIZ.LIZ(z);
        } else {
            ((InterfaceC68532Qv2) C77119UOl.LJIIL(C58725N2z.LIZ, InterfaceC68532Qv2.class)).LIZLLL(z);
        }
        if (z2) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            updateLoginHistoryState(i, null);
        }
    }

    @Override // X.InterfaceC253709xW
    public void updateLoginHistoryState(int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        TrustedEnvApi.LIZ.setLoginHistoryFeatureState(i).LJ(new AgS123S0100000_6(new AqS60S0201000_11(i, (int) this, (LoginMethodService) interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) 0), 21), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC253709xW
    public void updateMethodInfo(String key, Object... info) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        SignificantUserInfo significantUserInfo = null;
        int i = 2;
        switch (key.hashCode()) {
            case -1854071945:
                if (!key.equals("update_expire_time") || info.length < 2) {
                    return;
                }
                C68517Qun c68517Qun = C68517Qun.LIZ;
                Object obj = info[0];
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = info[1];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Long");
                c68517Qun.LJIJ(((Long) obj2).longValue(), (String) obj, false);
                return;
            case -573632447:
                if (!key.equals("update_name") || info.length == 0) {
                    return;
                }
                C68517Qun c68517Qun2 = C68517Qun.LIZ;
                String LIZLLL = R41.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getCurUserId()");
                Object obj3 = info[0];
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
                c68517Qun2.LJIJI(LIZLLL, (String) obj3);
                return;
            case 58019962:
                if (!key.equals("allow_one_key_login") || info.length == 0) {
                    return;
                }
                Object obj4 = info[0];
                o.LJII(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                if (isOneKeyLoginExperimentEnabled()) {
                    C68517Qun.LIZ.LIZ(booleanValue);
                } else {
                    ((InterfaceC68532Qv2) C77119UOl.LJIIL(C58725N2z.LIZ, InterfaceC68532Qv2.class)).LIZLLL(booleanValue);
                }
                if (info.length >= 2) {
                    Object obj5 = info[1];
                    o.LJII(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj5).booleanValue()) {
                        return;
                    }
                }
                if (booleanValue) {
                    i = 1;
                }
                updateLoginHistoryState(i, null);
                return;
            case 2043348218:
                if (!key.equals("update_significan_user_info") || info.length == 0) {
                    return;
                }
                C68517Qun c68517Qun3 = C68517Qun.LIZ;
                Object obj6 = info[1];
                if (obj6 instanceof SignificantUserInfo) {
                    significantUserInfo = (SignificantUserInfo) obj6;
                }
                c68517Qun3.LJIJJLI(significantUserInfo);
                return;
            case 2096788723:
                if (!key.equals("update_last_active_time") || info.length < 2) {
                    return;
                }
                C68517Qun c68517Qun4 = C68517Qun.LIZ;
                Object obj7 = info[0];
                o.LJII(obj7, "null cannot be cast to non-null type kotlin.String");
                Object obj8 = info[1];
                o.LJII(obj8, "null cannot be cast to non-null type kotlin.Long");
                c68517Qun4.LJIIZILJ(((Long) obj8).longValue(), (String) obj7);
                return;
            default:
                return;
        }
    }
}
