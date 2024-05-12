package com.ss.android.ugc.aweme.account.prompt;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C19N;
import X.C58096Mr6;
import X.C68517Qun;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.Q7K;
import X.R7H;
import X.UZ1;
import X.UZD;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.experiment.prompt.ShowPromptToConfirmDynamicDataExperiment;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AccountShowConfirmPromptServiceImpl implements IAccountShowBindPromptApi {
    @Override // com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi
    public final boolean LIZ() {
        Object next;
        char c;
        int i;
        int i2;
        Long loginTime;
        if ((Q7K.LIZIZ("usau_confirm_email_phone_phase_2", 0) != 1 && Q7K.LIZIZ("row_update_email_phone_phase_2", 0) != 1) || !t1.LJI()) {
            return false;
        }
        User curUser = AccountService.LJIJ().LJFF().getCurUser();
        if (curUser.getUid() == null) {
            return false;
        }
        String uid = curUser.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        Iterator it = ((ArrayList) C68517Qun.LIZ.LJI(uid)).iterator();
        long j = 0;
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
        }
        long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        ShowPromptToConfirmDynamicDataExperiment.LIZ();
        if (currentTimeMillis < ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.timeAfterLogin) {
            return false;
        }
        String region = AccountService.LJIJ().LJIILL();
        o.LJIIIIZZ(region, "region");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (UZ1.LIZIZ(region)) {
            linkedHashMap.put("x", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.nonAutoConfirmSysPopFreq));
            linkedHashMap.put("y", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.nonAutoConfirmSysDismissSoftCap));
            linkedHashMap.put("z", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.nonAutoConfirmSysAdjustedFreq));
            linkedHashMap.put("w", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.nonAutoConfirmSysMaxNumberDisplayed));
        } else {
            linkedHashMap.put("x", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.autoConfirmSysPopFreq));
            linkedHashMap.put("y", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.autoConfirmSysDismissSoftCap));
            linkedHashMap.put("z", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.autoConfirmSysAdjustedFreq));
            linkedHashMap.put("w", Integer.valueOf(ShowPromptToConfirmDynamicDataExperiment.LIZ().verifyEmailPhoneFrequencyControl.autoConfirmSysMaxNumberDisplayed));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Keva keva = UZ1.LIZIZ;
        int i3 = keva.getInt("impression_time", 0);
        long j2 = (currentTimeMillis2 - keva.getLong("last_show_time", -1L)) / 1000;
        Integer num = (Integer) linkedHashMap.get("w");
        int i4 = -1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (i3 >= i) {
            return false;
        }
        int i5 = keva.getInt("not_now_time", 0);
        Integer num2 = (Integer) linkedHashMap.get("y");
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = -1;
        }
        if (i5 >= i2) {
            Integer num3 = (Integer) linkedHashMap.get("z");
            if (num3 != null) {
                i4 = num3.intValue();
            }
            if (j2 < i4) {
                return false;
            }
        } else {
            Integer num4 = (Integer) linkedHashMap.get("x");
            if (num4 != null) {
                i4 = num4.intValue();
            }
            if (j2 < i4) {
                return false;
            }
        }
        return true;
    }

    public static IAccountShowBindPromptApi LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IAccountShowBindPromptApi.class, false);
        if (LIZ != null) {
            return (IAccountShowBindPromptApi) LIZ;
        }
        if (C58096Mr6.LJLL == null) {
            synchronized (IAccountShowBindPromptApi.class) {
                if (C58096Mr6.LJLL == null) {
                    C58096Mr6.LJLL = new AccountShowConfirmPromptServiceImpl();
                }
            }
        }
        return C58096Mr6.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.account.prompt.IAccountShowBindPromptApi
    public final void LIZIZ(ActivityC45651qj activity, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        UZ1.LIZLLL = interfaceC65784Pro;
        if (UZ1.LIZ == null) {
            if (C19N.LJ("account_show_confirm_mem_leak", true)) {
                UZ1.LIZ = new R7H(C16880lQ.LLLLL(activity));
            } else {
                UZ1.LIZ = new R7H(activity);
            }
        }
        UZ1.LJFF = 0L;
        R7H r7h = UZ1.LIZ;
        if (r7h != null) {
            r7h.LJJIII("normal", new UZD(activity, str));
        } else {
            o.LJIJI("accountApi");
            throw null;
        }
    }
}
