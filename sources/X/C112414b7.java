package X;

import Y.ACListenerS21S0100000_1;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.4b7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112414b7 extends C112554bL implements InterfaceC86486Xww {
    public static InterfaceC88472Yns<? super C112454bB, C76800UCe> LIZIZ;
    public static InterfaceC88471Ynr<? super Boolean, ? super C112454bB, C76800UCe> LIZJ;
    public static InterfaceC112564bM LIZLLL;
    public static final C112414b7 LIZ = new C112414b7();
    public static final int[] LJ = {21};

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return LJ;
    }

    public static C112454bB LJIIL(InnerPushMessage innerPushMessage) {
        Object obj;
        java.util.Map<String, Object> extrasMap;
        if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
            obj = extrasMap.get("dm");
        } else {
            obj = null;
        }
        if (!(obj instanceof C112454bB)) {
            return null;
        }
        return (C112454bB) obj;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
        Object obj;
        int i;
        String str;
        java.util.Map<String, Object> extrasMap;
        C112454bB LJIIL = LJIIL(innerPushMessage);
        if (LJIIL != null) {
            InterfaceC88472Yns<? super C112454bB, C76800UCe> interfaceC88472Yns = LIZIZ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(LJIIL);
            }
            if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
                obj = extrasMap.get("dm_has_green_dot");
            } else {
                obj = null;
            }
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            Boolean bool = Boolean.TRUE;
            if (o.LJ(obj, bool)) {
                InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
                C107724Kq c107724Kq = new C107724Kq(null);
                c107724Kq.LJI = bool;
                c107724Kq.LIZIZ = EnumC112364b2.DM_INNER_PUSH;
                c107724Kq.LIZJ = LJIIL.LJIJJLI;
                activityStatusAnalytics.LJFF(c107724Kq);
            }
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("enter_from", MainPageFragmentImpl.LJI().LJJLIIIJJI());
            Integer num = LJIIL.LJIJ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            int i2 = 1;
            oszArr[1] = new OSZ("chat_cnt", String.valueOf(i));
            oszArr[2] = new OSZ("from_user_id", LJIIL.LJIJJLI);
            FMX.LJIIL("show_message_inner_push", C113554cx.LJJL(oszArr));
            Integer num2 = LJIIL.LJIJ;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            C112464bC.LIZJ("show_as_inner_push", i2);
            if (LJIIL.LIZ == 3) {
                Integer num3 = LJIIL.LIZJ;
                int i3 = AbstractC63505Ow9.LIZ;
                if (num3 == null || num3.intValue() != i3) {
                    str = "group";
                } else {
                    str = "private";
                }
                C93363lU.LIZIZ(str);
            }
        }
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        if (((Boolean) C34235Dc7.LIZJ.getValue()).booleanValue() || !C53765L8f.LJIILIIL("NOTIFICATION") || !LRP.LIZIZ.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        boolean z;
        InterfaceC88471Ynr<? super Boolean, ? super C112454bB, C76800UCe> interfaceC88471Ynr;
        if (C31Q.LJIILLIIL.LJ().LIZJ == 0) {
            z = true;
        } else {
            z = false;
        }
        C112454bB LJIIL = LJIIL(innerPushMessage);
        if (LJIIL != null && (interfaceC88471Ynr = LIZJ) != null) {
            interfaceC88471Ynr.invoke(Boolean.valueOf(z), LJIIL);
        }
        if (z && C86550Xxy.LIZIZ.LJFF()) {
            InterfaceC112564bM interfaceC112564bM = LIZLLL;
            if (interfaceC112564bM != null) {
                interfaceC112564bM.LIZ(innerPushMessage, new int[]{1, 2, 3});
            }
            innerPushMessage.setDMPushReusedContainerShowed(true);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(X.C112454bB r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112414b7.LJIIJJI(X.4bB, boolean):void");
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        C112454bB LJIIL = LJIIL(innerPushMessage);
        if (LJIIL != null) {
            if (i == 3) {
                C109544Rq c109544Rq = LJIIL.LJIJI;
                if (c109544Rq != null) {
                    C84823Uo.LIZ(c109544Rq);
                }
                if (C7ZI.LIZJ()) {
                    LIZ.getClass();
                    if (C4FU.LJFF(LJIIL.LJIJI)) {
                        String str = LJIIL.LIZLLL;
                        if (str != null) {
                            C4GZ c4gz = C4GZ.NOTIFICATION;
                            String str2 = LJIIL.LJIIIIZZ;
                            if (str2 == null) {
                                str2 = "";
                            }
                            C4FU.LJII(c4gz, str, new C4FW(str2, c4gz, new ACListenerS21S0100000_1(LJIIL, 232)), new C4FX(EnumC112404b6.INNER_PUSH.getValue(), EnumC112374b3.CELL.getValue(), null, null, 12));
                        }
                    } else if (C4FU.LJI(LJIIL.LJIJI)) {
                        if (LJIIL.LIZLLL != null) {
                            LJIIJJI(LJIIL, true);
                        }
                    }
                }
                LIZ.getClass();
                LJIIJJI(LJIIL, true);
            } else {
                LIZ.getClass();
                LJIIJJI(LJIIL, false);
            }
            LIZ.getClass();
            InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
            C107724Kq c107724Kq = new C107724Kq(null);
            c107724Kq.LIZLLL = MainPageFragmentImpl.LJI().LJJLIIIJJI();
            c107724Kq.LJI = Boolean.TRUE;
            c107724Kq.LIZIZ = EnumC112364b2.DM_INNER_PUSH;
            c107724Kq.LJ = "chat_room";
            c107724Kq.LIZJ = LJIIL.LJIJJLI;
            C107434Jn.LIZ(activityStatusAnalytics, c107724Kq, false, 6);
        }
        C86550Xxy.LIZIZ.LJIILIIL(EnumC86549Xxx.CLICK, innerPushMessage, "click");
        InterfaceC112564bM interfaceC112564bM = LIZLLL;
        if (interfaceC112564bM != null) {
            interfaceC112564bM.LIZIZ("DM push click", true);
        }
        return true;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        LIZLLL = c86507XxH;
        return null;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        String str2;
        int i;
        String str3;
        Integer num;
        C112454bB LJIIL = LJIIL(innerPushMessage);
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", MainPageFragmentImpl.LJI().LJJLIIIJJI());
        if (z) {
            str2 = "slide_up";
        } else {
            str2 = "auto";
        }
        oszArr[1] = new OSZ("action_type", str2);
        if (LJIIL != null && (num = LJIIL.LJIJ) != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        oszArr[2] = new OSZ("chat_cnt", String.valueOf(i));
        if (LJIIL == null || (str3 = LJIIL.LJIJJLI) == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ("from_user_id", str3);
        FMX.LJIIL("close_message_inner_push", C113554cx.LJJL(oszArr));
    }
}
