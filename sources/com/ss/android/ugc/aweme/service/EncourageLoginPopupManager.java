package com.ss.android.ugc.aweme.service;

import X.ActivityC45651qj;
import X.C188727au;
import X.C54094LKw;
import X.C54552Lb2;
import X.C58096Mr6;
import X.C77275UUl;
import X.FMX;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.AccountService;
import defpackage.t1;
import java.util.Set;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EncourageLoginPopupManager implements IEncourageLogInService {
    public boolean LIZ;
    public final String LIZIZ = "homepage_hot";
    public String LIZJ = "";
    public final Set<String> LIZLLL = C77275UUl.LJIIIIZZ("chat_head", "chat_list", "chat_merge", "chat");

    public static IEncourageLogInService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IEncourageLogInService.class, false);
        if (LIZ != null) {
            return (IEncourageLogInService) LIZ;
        }
        if (C58096Mr6.U4 == null) {
            synchronized (IEncourageLogInService.class) {
                if (C58096Mr6.U4 == null) {
                    C58096Mr6.U4 = new EncourageLoginPopupManager();
                }
            }
        }
        return C58096Mr6.U4;
    }

    @Override // com.ss.android.ugc.aweme.service.IEncourageLogInService
    public final void LIZIZ(ActivityC45651qj fragmentActivity) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        if (!this.LIZ || !C77275UUl.LJIIIIZZ("BR", "MX", "CO").contains(AccountService.LJIJ().LJIILL()) || t1.LJI()) {
            return;
        }
        if (((Keva) C54552Lb2.LIZ.getValue()).getLong("key_last_show_time", 0L) + 259200000 >= System.currentTimeMillis()) {
            return;
        }
        PopupManager.LJIIL(new C54094LKw(fragmentActivity, new AqS175S0100000_9(this, 459)));
    }

    public final void LIZLLL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("enter_from", this.LIZIZ);
        c188727au.LJIIIZ("enter_method", this.LIZJ);
        FMX.LJIIL("login_notify_pop_up", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.IEncourageLogInService
    public final void LIZ(Context context, String str, String str2) {
        o.LJIIIZ(context, "context");
        if (AccountService.LJIJ().LJFF().isLogin() || !(context instanceof ActivityC45651qj) || TextUtils.isEmpty(str) || this.LIZLLL.contains(str)) {
            this.LIZ = false;
        } else {
            this.LIZ = true;
            this.LIZJ = str2;
        }
    }
}
