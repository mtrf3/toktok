package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3HV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HV {
    public static void LIZ() {
        boolean z = false;
        if (C107454Jp.LIZ()) {
            IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4EZ.LJLIL);
        if (((Number) C4D2.LIZ.getValue()).intValue() == 0) {
            arrayList.add(C3HY.LJLIL);
            arrayList.add(C3HZ.LJLIL);
            arrayList.add(C73132tx.LJLIL);
        }
        if (AnonymousClass304.LIZIZ() || AnonymousClass304.LIZ() == 7) {
            C76662ze observer = C76662ze.LJLIL;
            o.LJIIIZ(observer, "observer");
            C72982ti.LIZ.add(observer);
        }
        if (C96573qf.LIZJ() || C96573qf.LIZIZ() == 7) {
            C72982ti.LIZ.add(C75382xa.LJLIL);
        }
        new Object() { // from class: X.3Ha
        }.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "tt_im_display_suggested_stickers_in_chat_page", true) != 0) {
            C72982ti.LIZ.add(C73022tm.LJLIL);
        }
        if (C72982ti.LIZ.size() > 0) {
            arrayList.add(C73002tk.LJLIL);
        }
        if (C81363Hg.LIZ()) {
            arrayList.add(C3HX.LJLIL);
        }
        if (C115204fc.LIZ()) {
            arrayList.add(C3VH.LJLIL);
            arrayList.add(C3HW.LJLIL);
            arrayList.add(C3VD.LJLIL);
        }
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(arrayList, (List<String>) 626);
        if (AnonymousClass304.LIZ() > 0 && AnonymousClass304.LIZ() != 5 && AnonymousClass304.LIZ() != 7) {
            z = true;
        }
        if (z) {
            C76662ze.LJLIL.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C76752zn(null), 3);
        }
        if (C81313Hb.LIZ()) {
            C82563Lw c82563Lw = C82563Lw.LJLIL;
            c82563Lw.getClass();
            if (C82563Lw.LJLJI == C3MU.INIT) {
                XKQ xkq = C82563Lw.LJLJJL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                C82563Lw.LJLJJL = XKX.LIZLLL(c82563Lw, null, null, new C3HQ(null), 3);
            }
        }
        E3F.LIZJ("imrequest_sparse", aqS151S0100000_1, new AqS151S0100000_1(arrayList, (List<String>) 627), ((Boolean) C34526Dgo.LIZ.getValue()).booleanValue());
        C34B.LIZIZ("IMInitReadyBootFinishLegoTask", "run finished");
    }
}
