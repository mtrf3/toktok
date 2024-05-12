package X;

import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import kotlin.jvm.internal.AqS34S0210000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4b8 */
/* loaded from: classes2.dex */
public final class C112424b8 {
    public boolean LIZ;
    public ViewGroup LIZIZ;
    public ViewOnClickListenerC112504bG LIZJ;
    public C112454bB LIZLLL;
    public final CountDownTimerC112534bJ LJ = new CountDownTimerC112534bJ(this);

    public static void LIZLLL(String str) {
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        C107724Kq c107724Kq = new C107724Kq(null);
        c107724Kq.LIZLLL = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        c107724Kq.LJI = Boolean.TRUE;
        c107724Kq.LIZIZ = EnumC112364b2.DM_INNER_PUSH;
        c107724Kq.LJ = "chat_room";
        c107724Kq.LIZJ = str;
        C107434Jn.LIZ(activityStatusAnalytics, c107724Kq, false, 6);
    }

    public static void LJ(C112454bB c112454bB) {
        String str;
        Long l;
        int i;
        String LJFF;
        String valueOf;
        String LJJLIIIJJI = MainPageFragmentImpl.LJI().LJJLIIIJJI();
        Long l2 = c112454bB.LJIILIIL;
        String str2 = "";
        if (l2 == null || (str = l2.toString()) == null) {
            str = "";
        }
        C109544Rq c109544Rq = c112454bB.LJIJI;
        if (c109544Rq != null) {
            l = Long.valueOf(c109544Rq.getMsgId());
        } else {
            l = null;
        }
        String valueOf2 = String.valueOf(l);
        String LJIILJJIL = C1FP.LJIILJJIL(c112454bB);
        String str3 = c112454bB.LJIJJLI;
        String LJIIJJI = C1FP.LJIIJJI(c112454bB);
        Integer num = c112454bB.LJIJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        String str4 = c112454bB.LJJ;
        if (str4 != null) {
            str2 = str4;
        }
        String LIZIZ = C112474bD.LIZIZ(c112454bB.LIZ);
        C109544Rq c109544Rq2 = c112454bB.LJIJI;
        if (c109544Rq2 == null) {
            LJFF = "unknown";
        } else {
            LJFF = C106674Gp.LJFF(c109544Rq2, null);
        }
        C109544Rq c109544Rq3 = c112454bB.LJIJI;
        if (c109544Rq3 == null) {
            valueOf = "-1";
        } else {
            valueOf = String.valueOf(c109544Rq3.getMsgType());
        }
        C112484bE c112484bE = new C112484bE(LJJLIIIJJI, str, valueOf2, LJIILJJIL, str3, LJIIJJI, i, str2, LIZIZ, LJFF, valueOf);
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("inner_push_click", C112464bC.LJFF(c112484bE));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112424b8.LIZJ(boolean):void");
    }

    public final void LIZ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        ViewOnClickListenerC112504bG viewOnClickListenerC112504bG = this.LIZJ;
        if (viewOnClickListenerC112504bG != null && this.LIZ) {
            viewOnClickListenerC112504bG.LIZIZ(new AqS34S0210000_1(this, (C112424b8) z, (boolean) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1));
        }
        this.LJ.cancel();
        this.LIZJ = null;
        this.LIZIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r20, X.C112454bB r21) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112424b8.LJFF(java.lang.String, X.4bB):void");
    }

    public static /* synthetic */ void LIZIZ(C112424b8 c112424b8, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        c112424b8.LIZ(null, z);
    }
}
