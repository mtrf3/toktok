package X;

import Y.IDcS364S0100000_1;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84543Tm {
    public static final C84543Tm LIZ = new C84543Tm();

    public static void LIZJ() {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        C96963rI.LJII().getClass();
        c4wc.LIZJ(C97353rv.LIZLLL());
    }

    public static void LIZ() {
        C96963rI.LIZLLL().getClass();
        if (C84563To.LIZIZ()) {
            Keva kevaRepo = C84523Tk.LJII();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            if (!kevaRepo.getBoolean(C84523Tk.LIZLLL(), false)) {
                C82833Mx.LIZ.getClass();
                if (!C82833Mx.LIZIZ) {
                    V1B.LJIIZILJ("bring to top depend on ConversationSortOrderExperiment.isEnableIgnoreRankUpdate == true");
                } else {
                    C96963rI.LJII().getClass();
                    AbstractC90763hI LIZ2 = C81273Gx.LIZ(C97353rv.LIZLLL());
                    LIZ2.LJIJJ(C113554cx.LJJLIIIIJ(new OSZ("manual_set_conversation_update_time", String.valueOf(System.currentTimeMillis()))), new IDcS364S0100000_1(LIZ2, 4));
                }
            }
        }
        C96963rI.LIZ().getClass();
        try {
            C96963rI.LIZLLL().getClass();
            if (C84563To.LIZ() && C84523Tk.LIZ()) {
                C89163ei.LIZ((List) C89163ei.LIZIZ.getValue());
            }
        } catch (Exception e) {
            QCU.LJFF("checkAutoWelcomeMsgWhenEnterChat exception!", e, 4);
        }
    }

    public static void LIZIZ() {
        C96963rI.LIZLLL().getClass();
        if (!SearchServiceImpl.LLLZI().LJJJIL() || ((Number) C52720Kma.LIZ.getValue()).intValue() == 0) {
            C96963rI.LIZLLL().getClass();
            if (!SearchServiceImpl.LLLZI().LJJIJIIJIL() || ((Number) C52722Kmc.LIZ.getValue()).intValue() == 0 || !C96963rI.LJII().LIZ()) {
                return;
            }
            LIZJ();
            return;
        }
        if (!C96963rI.LJII().LIZ()) {
            SearchServiceImpl.LLLZI().LLJIJIL(C84553Tn.LJLIL);
        } else {
            LIZJ();
        }
    }
}
