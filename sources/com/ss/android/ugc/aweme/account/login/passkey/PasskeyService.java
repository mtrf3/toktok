package com.ss.android.ugc.aweme.account.login.passkey;

import X.AbstractC73635Sv9;
import X.ActivityC45651qj;
import X.C03660Ck;
import X.C1ZW;
import X.C26227ARb;
import X.C34867DmJ;
import X.C35041Zc;
import X.C47261Igj;
import X.C48841JEv;
import X.C57434MgQ;
import X.C58096Mr6;
import X.C61878OQg;
import X.C68735QyJ;
import X.C73969T1h;
import X.C78613UtF;
import X.C85758XlC;
import X.C85759XlD;
import X.C85766XlK;
import X.C85770XlO;
import X.C85771XlP;
import X.C85772XlQ;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC85762XlG;
import X.EnumC85764XlI;
import X.InterfaceC70422pa;
import X.InterfaceC85767XlL;
import X.OJD;
import X.ORZ;
import X.PVC;
import X.R9V;
import X.T16;
import X.UC0;
import X.XKX;
import Y.AfS12S0310000_15;
import Y.AfS67S0100000_15;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.IPasskeyService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowReplacePasskeyPopupEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AqS0S2310000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class PasskeyService implements IPasskeyService {
    public static String LIZ;

    public static IPasskeyService LJFF() {
        Object LIZ2 = C58096Mr6.LIZ(IPasskeyService.class, false);
        if (LIZ2 != null) {
            return (IPasskeyService) LIZ2;
        }
        if (C58096Mr6.LJLIL == null) {
            synchronized (IPasskeyService.class) {
                if (C58096Mr6.LJLIL == null) {
                    C58096Mr6.LJLIL = new PasskeyService();
                }
            }
        }
        return C58096Mr6.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyService
    public final boolean LIZJ() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (C34867DmJ.LIZ() != 2 && C34867DmJ.LIZ() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyService
    public final boolean LJ() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (C34867DmJ.LIZ() != 3 && C34867DmJ.LIZ() != 1) {
            return false;
        }
        return true;
    }

    public static Boolean LJIIIZ(String str) {
        List list;
        boolean z;
        try {
            boolean z2 = false;
            List<String> split = new OJD("\\.").split(str, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C61878OQg.INSTANCE;
            String[] strArr = (String[]) list.toArray(new String[0]);
            if (strArr.length != 3) {
                return Boolean.FALSE;
            }
            byte[] decode = Base64.decode(strArr[1], 8);
            o.LJIIIIZZ(decode, "decode(splitToken[1], Base64.URL_SAFE)");
            String string = JSONObjectProtectorUtils.getString(new JSONObject(new String(decode, PVC.LIZ)), "nonce");
            String str2 = LIZ;
            if (str2 != null && o.LJ(str2, string)) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyService
    public final void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.PASSKEY, EnumC69116RAq.PASSKEY_REGISTRATION, new Bundle(), C85771XlP.LIZ, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyService
    public final void LIZ(ActivityC45651qj activity, InterfaceC85767XlL interfaceC85767XlL, boolean z) {
        o.LJIIIZ(activity, "activity");
        AbstractC73635Sv9.LJ(new R9V("/passport/fido2/begin_user_registration/", C03660Ck.LIZJ("entrance", "account_settings"))).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIIZILJ(new AfS12S0310000_15(z, this, activity, interfaceC85767XlL, 1), new AfS67S0100000_15(interfaceC85767XlL, 70));
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyService
    public final void LIZLLL(Activity activity, InterfaceC85767XlL callback, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(callback, "callback");
        AbstractC73635Sv9.LJ(new R9V("/passport/fido2/begin_discoverable_user_login/", new HashMap())).LJIIZILJ(new AfS12S0310000_15(z, this, activity, callback, 0), new AfS67S0100000_15(callback, 19));
    }

    public final void LJII(Activity activity, String requestJson, String ticket, InterfaceC85767XlL callback) {
        InterfaceC70422pa LIZ2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(requestJson, "requestJson");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(callback, "callback");
        try {
            C35041Zc c35041Zc = new C35041Zc(requestJson);
            C85770XlO c85770XlO = new C85770XlO();
            c85770XlO.LIZJ = true;
            c85770XlO.LIZ = "340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com";
            c85770XlO.LIZLLL = false;
            c85770XlO.LIZIZ = LIZ;
            C68735QyJ c68735QyJ = new C68735QyJ(c85770XlO.LIZ, c85770XlO.LIZIZ, c85770XlO.LIZJ, c85770XlO.LIZLLL);
            List LLJILJILJ = ORZ.LLJILJILJ(C47261Igj.LJJIJ(c35041Zc));
            if (LIZ != null) {
                ((ArrayList) LLJILJILJ).add(c68735QyJ);
            }
            LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(activity);
            if (LIZIZ == null || (LIZ2 = LifecycleOwnerKt.getLifecycleScope(LIZIZ)) == null) {
                LIZ2 = C48841JEv.LIZ(C78613UtF.LIZJ);
            }
            XKX.LIZLLL(LIZ2, C78613UtF.LIZJ, null, new C85758XlC(activity, LLJILJILJ, callback, this, ticket, null), 2);
        } catch (IllegalArgumentException unused) {
            C85766XlK.LIZ(callback, new C85772XlQ(EnumC85762XlG.PASSKEY_LOGIN_ILLEGAL_ARGUMENT.getErrorCode()), true, null, 12);
        } catch (NullPointerException unused2) {
            C85766XlK.LIZ(callback, new C85772XlQ(EnumC85762XlG.PASSKEY_LOGIN_NULL_POINTER.getErrorCode()), true, null, 12);
        }
    }

    public final void LJIIIIZZ(Activity activity, String str, String str2, InterfaceC85767XlL interfaceC85767XlL) {
        ShowReplacePasskeyPopupEvent showReplacePasskeyPopupEvent = new ShowReplacePasskeyPopupEvent();
        showReplacePasskeyPopupEvent.LIZLLL("account_page", "enter_from");
        showReplacePasskeyPopupEvent.LIZLLL("click", "enter_method");
        showReplacePasskeyPopupEvent.LJFF();
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(activity.getString(R.string.jf2));
        c26227ARb.LIZIZ(activity.getString(R.string.jey));
        c26227ARb.LIZJ(new AqS181S0100000_15(interfaceC85767XlL, 258));
        UC0.LIZJ(c26227ARb, new AqS0S2310000_15(activity, interfaceC85767XlL, this, str, str2, 1));
        c26227ARb.LJI().LIZLLL();
    }

    public static void LJI(Activity activity, String requestJson, String ticket, boolean z, boolean z2, boolean z3, InterfaceC85767XlL callback) {
        InterfaceC70422pa LIZ2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(requestJson, "requestJson");
        o.LJIIIZ(ticket, "ticket");
        o.LJIIIZ(callback, "callback");
        try {
            C1ZW c1zw = new C1ZW(z, requestJson);
            LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(activity);
            if (LIZIZ == null || (LIZ2 = LifecycleOwnerKt.getLifecycleScope(LIZIZ)) == null) {
                LIZ2 = C48841JEv.LIZ(C78613UtF.LIZJ);
            }
            XKX.LIZLLL(LIZ2, C78613UtF.LIZJ, null, new C85759XlD(activity, c1zw, z2, z3, callback, ticket, null), 2);
        } catch (IllegalArgumentException unused) {
            C85766XlK.LIZ(callback, new C85772XlQ(EnumC85764XlI.PASSKEY_REGISTRATION_ILLEGAL_ARGUMENT.getErrorCode()), true, null, 12);
        } catch (NullPointerException unused2) {
            C85766XlK.LIZ(callback, new C85772XlQ(EnumC85764XlI.PASSKEY_REGISTRATION_NULL_POINTER.getErrorCode()), true, null, 12);
        }
    }
}
