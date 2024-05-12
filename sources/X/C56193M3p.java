package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.BindPhonePopFreControlConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.M3p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56193M3p {
    public static final C56193M3p LIZ = new C56193M3p();

    public static BindPhonePopFreControlConfig LIZIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        BindPhonePopFreControlConfig bindPhonePopFreControlConfig = C56194M3q.LIZ;
        BindPhonePopFreControlConfig bindPhonePopFreControlConfig2 = (BindPhonePopFreControlConfig) LIZLLL.LJIIIIZZ("bind_phone_pop_control", BindPhonePopFreControlConfig.class, bindPhonePopFreControlConfig);
        if (bindPhonePopFreControlConfig2 != null) {
            bindPhonePopFreControlConfig = bindPhonePopFreControlConfig2;
        }
        o.LJIIIIZZ(bindPhonePopFreControlConfig, "SettingsManager.getInsta….java)\n        ?: DEFAULT");
        return bindPhonePopFreControlConfig;
    }

    public static boolean LIZ(Aweme aweme) {
        boolean z;
        Object next;
        char c;
        long j;
        Long loginTime;
        if (!((RBX) HG3.LJIILL()).isLogin() || C00F.LIZ(31744, 0, "cold_boot_bind_phone_pop_or_sheet", true) == 0) {
            return false;
        }
        if (aweme != null && aweme.isAd()) {
            return false;
        }
        if (C59522Vg.LIZ()) {
            InterfaceC70542pm LJJIIJ = C78609UtB.LJJIIJ(EnumC56196M3s.FYP, C56195M3r.LJLIL);
            if (LJJIIJ != null) {
                z = ((C77202URq) LJJIIJ).LIZ();
            }
            z = false;
        } else {
            UQF LJJIJIIJIL = C77266UUc.LIZIZ.LJJIJIIJIL(1, true);
            if (LJJIJIIJIL.LJLIL || LJJIJIIJIL.LJLILLLLZI) {
                z = true;
            }
            z = false;
        }
        boolean LIZIZ = C77266UUc.LIZIZ.LIZLLL().LIZIZ();
        if (z || LIZIZ) {
            return false;
        }
        C56191M3n.LIZ();
        C68517Qun c68517Qun = C68517Qun.LIZ;
        String uid = C56192M3o.LIZIZ;
        o.LJIIIIZZ(uid, "uid");
        Iterator it = ((ArrayList) c68517Qun.LJI(uid)).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Long loginTime2 = ((BaseLoginMethod) next).getLoginTime();
                if (loginTime2 != null && loginTime2.longValue() > 0) {
                    c = 1;
                } else {
                    c = 0;
                }
                do {
                    Object next2 = it.next();
                    Long loginTime3 = ((BaseLoginMethod) next2).getLoginTime();
                    if (loginTime3 != null && loginTime3.longValue() > 0 && c < 1) {
                        next = next2;
                        c = 1;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next;
        if (baseLoginMethod != null && (loginTime = baseLoginMethod.getLoginTime()) != null) {
            j = loginTime.longValue();
        } else {
            j = 0;
        }
        long max = Math.max(j, Math.max(C56191M3n.LIZ().LIZ.getLong("last_show_time", 0L), C56191M3n.LIZ().LIZ.getLong("last_unbind_time", 0L)));
        if (C56191M3n.LIZ().LIZ.getInt("click_delete_icon_times", 0) >= LIZIZ().clickDeleteIconMaxTimes) {
            if (System.currentTimeMillis() <= (LIZIZ().showFreqInDaysAfterReject * 86400000) + max) {
                return false;
            }
        } else if (System.currentTimeMillis() <= (LIZIZ().showFreqInDays * 86400000) + max) {
            return false;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || curUser.isPhoneBinded()) {
            return false;
        }
        return true;
    }
}
