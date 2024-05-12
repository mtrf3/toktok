package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EOP implements EOS {
    public static EOS LIZIZ;
    public static PersonalizedNUJV2Data LIZJ;
    public static final EOP LIZ = new EOP();
    public static final Keva LIZLLL = Keva.getRepo("personalized_nuj_trial_keva_v2");
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(EOQ.LJLIL);

    @Override // X.EOS
    public final void LJ(String awemeId, String enterFrom) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(enterFrom, "enterFrom");
    }

    @Override // X.EOS
    public final void LJI() {
        List<E4G> currentPluginList;
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        IPluginService createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false);
        if (createIPluginServicebyMonsterPlugin != null && (currentPluginList = createIPluginServicebyMonsterPlugin.getCurrentPluginList()) != null) {
            Iterator<E4G> it = currentPluginList.iterator();
            while (true) {
                if (it.hasNext()) {
                    e4g = it.next();
                    if (e4g.getType() == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA) {
                        break;
                    }
                } else {
                    e4g = null;
                    break;
                }
            }
            E4G e4g2 = e4g;
            if (e4g2 != null && (value = e4g2.getValue()) != null && (personalizedNUJV2Data = value.personalizedNUJV2Data) != null) {
                Keva keva = LIZLLL;
                Boolean bool = personalizedNUJV2Data.shouldTrySmartLock;
                Boolean bool2 = Boolean.TRUE;
                keva.storeBoolean("should_try_smart_lock", o.LJ(bool, bool2));
                keva.storeBoolean("should_try_age_gate", o.LJ(personalizedNUJV2Data.shouldTryAgeGate, bool2));
                keva.storeBoolean("should_try_push_popup", o.LJ(personalizedNUJV2Data.shouldTryPushPopup, bool2));
                keva.storeBoolean("need_nuj_in_age_gate_flow", o.LJ(personalizedNUJV2Data.needNUJInAgeGateFlow, bool2));
                keva.storeBoolean("need_nuj_quick_login_flow", o.LJ(personalizedNUJV2Data.needNUJInQuickLoginFlow, bool2));
                keva.storeBoolean("enable_unlogin_time_limit", personalizedNUJV2Data.enableUnloginTimeLimit);
                keva.storeInt("login_time_limit_min", personalizedNUJV2Data.loginTimeLimitMin);
                keva.storeInt("personalized_nuj_label", personalizedNUJV2Data.personalizedNUJLabel);
                LJIIIZ(true);
            }
        }
        LIZIZ = null;
        LJIIIIZZ();
        LJIIIIZZ().LJI();
    }

    public static EOS LJIIIIZZ() {
        EOS eos;
        if (LIZIZ == null) {
            if (Q7K.LIZIZ("nuj_trial_switch", 0) == 0) {
                PersonalizedNUJV2Data LJIIIZ = LJIIIZ(false);
                if (o.LJ(LJIIIZ.shouldTryAgeGate, Boolean.TRUE) && LJIIIZ.enableUnloginTimeLimit) {
                    eos = C36346EOg.LIZ;
                } else {
                    eos = EOR.LIZ;
                }
            } else {
                eos = EOR.LIZ;
            }
            LIZIZ = eos;
        }
        EOS eos2 = LIZIZ;
        if (eos2 == null) {
            return EOR.LIZ;
        }
        return eos2;
    }

    @Override // X.EOS
    public final boolean LIZ() {
        if (Q7K.LIZIZ("nuj_trial_switch", 0) != 0 || !LIZLLL.getBoolean("hasLoginStatusChanged", false)) {
            return false;
        }
        return true;
    }

    @Override // X.EOS
    public final void LIZIZ() {
        LIZLLL.storeBoolean("hasLoginStatusChanged", true);
    }

    @Override // X.EOS
    public final void LIZJ() {
        LJIIIIZZ().LIZJ();
    }

    @Override // X.EOS
    public final boolean LIZLLL() {
        return LJIIIIZZ().LIZLLL();
    }

    @Override // X.EOS
    public final boolean LJFF() {
        return LJIIIIZZ().LJFF();
    }

    public static PersonalizedNUJV2Data LJIIIZ(boolean z) {
        PersonalizedNUJV2Data personalizedNUJV2Data = LIZJ;
        if (personalizedNUJV2Data != null && !z) {
            return personalizedNUJV2Data;
        }
        Keva keva = LIZLLL;
        PersonalizedNUJV2Data personalizedNUJV2Data2 = new PersonalizedNUJV2Data(Boolean.valueOf(keva.getBoolean("should_try_smart_lock", false)), Boolean.valueOf(keva.getBoolean("should_try_age_gate", false)), Boolean.valueOf(keva.getBoolean("should_try_push_popup", false)), Boolean.valueOf(keva.getBoolean("need_nuj_in_age_gate_flow", false)), Boolean.valueOf(keva.getBoolean("need_nuj_quick_login_flow", false)), keva.getInt("personalized_nuj_label", 0), keva.getBoolean("enable_unlogin_time_limit", false), keva.getInt("login_time_limit_min", 0));
        LIZJ = personalizedNUJV2Data2;
        return personalizedNUJV2Data2;
    }

    public static void LJIIJ(String log) {
        o.LJIIIZ(log, "log");
        EOT eot = (EOT) LJ.getValue();
        if (eot != null) {
            eot.LIZ("nuj_trial", log);
        }
    }

    @Override // X.EOS
    public final boolean LJII(String str) {
        return LJIIIIZZ().LJII(str);
    }
}
