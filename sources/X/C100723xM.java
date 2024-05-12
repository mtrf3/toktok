package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.3xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100723xM {
    public static String LIZ;
    public static EnumC100743xO LIZIZ;
    public static long LIZJ;
    public static final C100903xe LIZLLL = new C100903xe();
    public static int LJ;
    public static boolean LJFF;
    public static boolean LJI;

    static {
        C84763XOl.LJI().LJJJJZI(new InterfaceC64592gB() { // from class: X.3xN
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Boolean isBackground = (Boolean) obj;
                o.LJIIIIZZ(isBackground, "isBackground");
                boolean booleanValue = isBackground.booleanValue();
                if (C100723xM.LJFF && booleanValue) {
                    C34B.LIZIZ("IMChatPerfLogger", "App is going to background");
                    C100723xM.LIZJ = 0L;
                }
                C100723xM.LJFF = !isBackground.booleanValue();
                C100723xM.LJI = false;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isAppForeground: ");
                LIZ2.append(C100723xM.LJFF);
                C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZ2));
            }
        });
        C84763XOl.LJII().LJJJJZI(new InterfaceC64592gB() { // from class: X.3uY
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C100723xM.LJI = true;
                C100723xM.LJFF = false;
            }
        });
    }

    public static String LIZIZ() {
        String str;
        if (TextUtils.isEmpty(LIZ)) {
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append('_');
        EnumC100743xO enumC100743xO = LIZIZ;
        if (enumC100743xO != null) {
            str = enumC100743xO.LJLIL;
        } else {
            str = null;
        }
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZLLL() {
        LJ();
        LIZIZ = EnumC100743xO.RENDERING;
        String LIZIZ2 = LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start ");
        LIZ2.append(LIZIZ2);
        LIZ2.append(" rendering");
        C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZ2));
        C40443Fu3.LIZ(LIZIZ2).start();
    }

    public static void LJ() {
        String LIZIZ2 = LIZIZ();
        if (!ujb.o.LJJJJJL(LIZIZ2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stop ");
            LIZ2.append(LIZIZ2);
            LIZ2.append(" fps tracking");
            C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZ2));
            InterfaceC55057LjB LIZIZ3 = C40443Fu3.LIZIZ(LIZIZ2);
            if (LIZIZ3 != null) {
                LIZIZ3.stop();
            }
        }
    }

    public static void LIZJ(String str) {
        LJ();
        LIZIZ = EnumC100743xO.NAVIGATING;
        LIZ = str;
        long j = C98673u3.LIZ;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        LIZJ = j;
        String LIZIZ2 = LIZIZ();
        StringBuilder LIZIZ3 = C25620zW.LIZIZ("start chat ", LIZIZ2, " with last click time ");
        LIZIZ3.append(LIZJ);
        C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZIZ3));
        C40443Fu3.LIZ(LIZIZ2).start();
    }

    public static void LJFF(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("trackChatroomScrollPerf ");
        LIZ2.append("chat_message_list");
        C34B.LIZIZ("IMChatPerfLogger", X1D.LIZIZ(LIZ2));
        C40443Fu3.LIZ("chat_message_list").LJIIIIZZ(recyclerView);
    }

    public static void LIZ(C99033ud sessionInfo, int i) {
        boolean z;
        String str;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        LJ();
        if (LIZJ > 0) {
            C34B.LIZIZ("IMChatPerfLogger", "log render time");
            long currentTimeMillis = System.currentTimeMillis() - LIZJ;
            C98583tu.LJFF(currentTimeMillis, sessionInfo, i, true, 48);
            if (o.LJ(sessionInfo.getEnterFromForMob(), "outer_push")) {
                C1HQ c1hq = new C1HQ();
                boolean z2 = false;
                if (C00F.LIZ(31744, 0, "dm_dev_out_app_push_to_chat_room_optimize_v2", true) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c1hq.put("push_to_chat_optimization_enable", String.valueOf(z));
                FFL.LJIIIZ().getClass();
                if (FFL.LJIIJ(31744, 0, "dm_dev_out_app_push_to_chat_room_optimize_v2", true) == 2) {
                    z2 = true;
                }
                c1hq.put("push_to_chat_optimization_enable_only_cold", String.valueOf(z2));
                c1hq.put("duration", String.valueOf(currentTimeMillis));
                c1hq.put("chat_type", C98583tu.LIZJ(sessionInfo));
                int i2 = LJ;
                if (i2 != 0) {
                    if (i2 != 1) {
                        str = "hot";
                    } else {
                        str = "warm";
                    }
                } else {
                    str = "cold";
                }
                c1hq.put("start_type", str);
                C772831o.LIZ().LIZIZ("out_push_to_chat_latency", c1hq);
            }
        }
        LIZ = null;
        LIZIZ = null;
        LIZJ = 0L;
    }
}
