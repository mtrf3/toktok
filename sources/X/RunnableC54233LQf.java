package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* renamed from: X.LQf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54233LQf implements Runnable {
    public static final RunnableC54233LQf LJLIL = new RunnableC54233LQf();

    public static void LIZ() {
        int LJIIJJI = C54362LVe.LJIIJJI();
        LinkedHashMap LIZ = C0JU.LIZ("enter_from", "notification_page");
        if (LJIIJJI > 0) {
            C132805Jc.LJFF(LIZ, "notice_type", "number_dot", LJIIJJI, "show_cnt");
        } else if (C54362LVe.LJIIJ() > 0) {
            LIZ.put("notice_type", "yellow_dot");
            LIZ.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
        } else {
            LIZ.put("show_cnt", CardStruct.IStatusCode.DEFAULT);
        }
        FMX.LJIIL("double_click_tab_name", LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
