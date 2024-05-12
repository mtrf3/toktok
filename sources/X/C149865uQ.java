package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS48S0400000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149865uQ {
    public final IAccountUserService LIZ = AccountService.LJIJ().LJFF();

    public final boolean LIZIZ() {
        if (this.LIZ.isLogin()) {
            if (this.LIZ.isChildrenMode()) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("EffectAuthManager", "Server rendering doesn't support child mode");
            } else {
                String curUserId = this.LIZ.getCurUserId();
                o.LJIIIIZZ(curUserId, "userService.curUserId");
                return C132845Jg.LIZ(curUserId);
            }
        }
        return false;
    }

    public final void LIZ(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        c26227ARb.LJ(R.string.flz);
        c26227ARb.LIZ(R.string.fly);
        UC0.LIZJ(c26227ARb, new AqS48S0400000_2((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76800UCe>) this, (C149865uQ) activityC45651qj, (ActivityC45651qj) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1));
        c26227ARb.LJI().LIZLLL();
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, String str3) {
        String str4;
        String str5;
        C145995oB c145995oB = new C145995oB();
        String str6 = null;
        if (shortVideoContext != null) {
            str4 = shortVideoContext.LJI();
        } else {
            str4 = null;
        }
        c145995oB.LJI("creation_id", str4);
        if (shortVideoContext != null) {
            str5 = shortVideoContext.shootWay;
        } else {
            str5 = null;
        }
        c145995oB.LJI("shoot_way", str5);
        c145995oB.LJI("content_type", str2);
        c145995oB.LJI("content_source", str3);
        if (shortVideoContext != null) {
            str6 = shortVideoContext.enterFrom;
        }
        c145995oB.LJI("enter_from", str6);
        c145995oB.LJI("shoot_tab_name", "");
        c145995oB.LIZ(0, "is_editor_pro");
        c145995oB.LJI("creation_tool", "effect");
        GXR.LIZ(str, c145995oB.LIZ);
    }
}
