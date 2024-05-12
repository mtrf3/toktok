package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes10.dex */
public final class M91 extends JHM {
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;

    public M91() {
        super("launch_log");
    }

    @Override // X.JHM
    public final void LJII() {
        String str = this.LJIILJJIL;
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        LJ("launch_method", str, c1799074g);
        LJ("push_id", null, c1799074g);
        LJ("enter_to", this.LJIILL, c1799074g);
        LJ("red_badge_number", this.LJIILLIIL, c1799074g);
        LJ("is_cold_launch", this.LJIIZILJ, c1799074g);
        LIZLLL("is_share_link_launch", CardStruct.IStatusCode.DEFAULT);
        if (!TextUtils.isEmpty(this.LJIJ)) {
            LJ("launch_from", this.LJIJ, c1799074g);
        }
    }
}
