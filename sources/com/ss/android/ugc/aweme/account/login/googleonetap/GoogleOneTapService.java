package com.ss.android.ugc.aweme.account.login.googleonetap;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C46451IKx;
import X.C52577KkH;
import X.C58194Msg;
import X.C58292Qn;
import X.C5H3;
import X.C62822Ol8;
import X.C62999Onz;
import X.C63001Oo1;
import X.C63026OoQ;
import X.C68989R5t;
import X.E4G;
import X.EnumC221088m0;
import X.EnumC35839E4t;
import X.HG3;
import X.L3Z;
import X.QCT;
import X.RBX;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GoogleOneTapService implements IGoogleOneTapService {
    public static final C5H3<GoogleOneTapService> LJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C58194Msg.LJLIL);
    public long LIZ;
    public long LIZIZ;
    public final long LIZJ;
    public int LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C58292Qn.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS156S0100000_6(this, 19));

    public static int LIZJ() {
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        Iterator<E4G> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList().iterator();
        while (true) {
            if (it.hasNext()) {
                e4g = it.next();
                if (e4g.getType() == EnumC35839E4t.SP_GOOGLE_ONE_TAP_EEA_ROW_DNU_DATA) {
                    break;
                }
            } else {
                e4g = null;
                break;
            }
        }
        E4G e4g2 = e4g;
        if (e4g2 != null && (value = e4g2.getValue()) != null) {
            IPluginService.SimplePluginData simplePluginData = value.simplePluginData;
            if (simplePluginData != null) {
                return simplePluginData.abGroup;
            }
            return L3Z.V0.getValue();
        }
        return L3Z.V0.getValue();
    }

    public final Keva LIZLLL() {
        return (Keva) this.LJ.getValue();
    }

    public final boolean LJFF() {
        if (!C46451IKx.LIZIZ) {
            return false;
        }
        if (LIZJ() != L3Z.V0.getValue()) {
            Boolean isNewUser = (Boolean) this.LJFF.getValue();
            o.LJIIIIZZ(isNewUser, "isNewUser");
            if (isNewUser.booleanValue()) {
                if ((7 * 86400000) + this.LIZJ <= System.currentTimeMillis()) {
                    TimeUnit.MILLISECONDS.toDays(this.LIZJ);
                    return false;
                }
            }
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        long j = this.LIZIZ;
        if (j == -1) {
            LIZLLL().storeLong("first_trigger_time", System.currentTimeMillis());
        } else {
            if ((1 * 86400000) + j < System.currentTimeMillis()) {
                long j2 = this.LIZ;
                if (j2 == -1) {
                    LIZLLL().storeLong("last_trigger_time", System.currentTimeMillis());
                } else if ((7 * 86400000) + j2 < System.currentTimeMillis()) {
                    this.LIZIZ = this.LIZ;
                    this.LIZ = System.currentTimeMillis();
                    LIZLLL().storeLong("first_trigger_time", this.LIZIZ);
                    LIZLLL().storeLong("last_trigger_time", this.LIZ);
                }
            }
            return false;
        }
        return true;
    }

    public GoogleOneTapService() {
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZ = LIZLLL().getLong("last_trigger_time", -1L);
        this.LIZIZ = LIZLLL().getLong("first_trigger_time", -1L);
        long j = LIZLLL().getLong("first_proactive_check", -1L);
        this.LIZJ = j;
        if (j == -1) {
            LIZLLL().storeLong("first_proactive_check", System.currentTimeMillis());
            this.LIZJ = System.currentTimeMillis();
        }
    }

    public static int LIZIZ(WeakReference weakReference) {
        if (!QCT.LIZIZ("", weakReference)) {
            return 0;
        }
        return ((Number) C52577KkH.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.service.googleonetap.IGoogleOneTapService
    public final void LIZ(String enterFrom, WeakReference weakReference) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZLLL++;
        if (LIZJ() != L3Z.V0.getValue()) {
            if (this.LIZLLL >= 16 && LIZJ() == L3Z.V4.getValue()) {
                this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
                LJI(enterFrom, weakReference);
                return;
            } else {
                if (this.LIZLLL < 1) {
                    return;
                }
                IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
                o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
                if (createIMandatoryLoginServicebyMonsterPlugin.enableForcedLogin(false) || LIZJ() != L3Z.V5.getValue()) {
                    return;
                }
                this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
                LJI(enterFrom, weakReference);
                return;
            }
        }
        if (this.LIZLLL >= 16 && LIZIZ(weakReference) == 4) {
            this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
            LJI(enterFrom, weakReference);
        } else {
            if (this.LIZLLL < 1) {
                return;
            }
            IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin2 = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin2, "get().getService(IMandat…LoginService::class.java)");
            if (createIMandatoryLoginServicebyMonsterPlugin2.enableForcedLogin(false) || LIZIZ(weakReference) != 5) {
                return;
            }
            this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
            LJI(enterFrom, weakReference);
        }
    }

    public final void LJI(String str, WeakReference weakReference) {
        if (!LJFF()) {
            return;
        }
        LJ((Activity) weakReference.get(), str, "vv_trigger", true, true);
    }

    public static void LJ(Activity activity, String str, String str2, boolean z, boolean z2) {
        if (!(activity instanceof ActivityC45651qj)) {
            return;
        }
        if (z2) {
            PopupManager.LJIIL(new C63001Oo1((ActivityC45651qj) activity, z, str, str2, C62999Onz.LJLIL));
        } else {
            C68989R5t.LIZIZ(activity, C68989R5t.LIZ(activity, z, "google_onetap", new C63026OoQ(str, str2, "auto_pop", "signup_login", "", new Bundle())));
        }
    }

    public final void LJII(WeakReference weakReference, boolean z, String str, boolean z2, boolean z3, boolean z4) {
        if (!QCT.LIZIZ(str, weakReference)) {
            return;
        }
        if (!z2) {
            if ((LIZJ() != L3Z.V0.getValue() || ((LIZIZ(weakReference) != 1 || z3) && LIZIZ(weakReference) != 2)) && ((!z4 || LIZIZ(weakReference) != 5) && ((LIZJ() != L3Z.V1.getValue() || z3) && LIZJ() != L3Z.V2.getValue() && (!z4 || LIZJ() != L3Z.V5.getValue())))) {
                return;
            }
        } else {
            if (z3) {
                return;
            }
            if ((LIZJ() != L3Z.V0.getValue() || LIZIZ(weakReference) != 3) && LIZJ() != L3Z.V3.getValue()) {
                return;
            }
        }
        if (!LJFF()) {
            return;
        }
        LJ((Activity) weakReference.get(), "signup_login", str, z, z2);
    }
}
