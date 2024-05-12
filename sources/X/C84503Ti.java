package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84503Ti {
    public static final C84503Ti LIZ = new C84503Ti();

    public static void LIZ(C99003ua c99003ua, boolean z) {
        if (c99003ua == null) {
            return;
        }
        try {
            Keva kevaRepo = C84523Tk.LJII();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            kevaRepo.storeBoolean(C84523Tk.LJ(), true);
            if (z) {
                C96963rI.LIZ().getClass();
                C89163ei.LIZIZ(c99003ua);
            }
            C57082Lw.LIZ.LIZJ("#ENTER_CHAT_SUCCESS_EVENT").setValue(Boolean.TRUE);
        } catch (Exception e) {
            QCU.LJFF("onEnterBotChatSuccess exception!", e, 4);
        }
    }

    public static void LIZIZ(ActivityC45651qj activity, C3L4 session) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(session, "session");
        C82223Ko c82223Ko = C99033ud.Companion;
        String LJFF = session.LJFF();
        c82223Ko.getClass();
        if (!C82223Ko.LIZ(LJFF)) {
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        C8SE imTakoService = IMService.createIIMServicebyMonsterPlugin(false).getImTakoService();
        String LIZIZ = C99883w0.LIZIZ(true);
        C96963rI.LJII().getClass();
        String LIZIZ2 = C97353rv.LIZIZ();
        if (LIZIZ2 == null) {
            LIZIZ2 = "";
        }
        imTakoService.LJ(activity, new C99003ua(LIZIZ, "click_tikbot_cell", LIZIZ2, null, null, null, null, null, C113554cx.LJJL(new OSZ("entry_time", valueOf), new OSZ("source", "session_list_chat_sug")), E2C.LIZJ("entry_time", valueOf), 0, null, null, null, null, true, session.LJLLILLLL, 31992, null));
        String LIZIZ3 = C99883w0.LIZIZ(false);
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZJ = HXX.LIZJ("enter_from", LIZIZ3, "entrance_type", "message_cell");
        LIZJ.put("group_id", null);
        LIZJ.put("search_id", null);
        LIZ2.LIZIZ("tikbot_entrance_click", LIZJ);
    }
}
