package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes11.dex */
public final class P1H extends JHM<P1H> {
    public String LJIILJJIL;
    public int LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;

    public P1H() {
        super("fan_list_user_show");
        this.LJIILJJIL = CardStruct.IStatusCode.DEFAULT;
        this.LJIILL = -1;
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
        this.LJIJ = CardStruct.IStatusCode.DEFAULT;
        this.LJIJI = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.JHM
    public final void LJII() {
        LJ("enter_from", this.LIZLLL, InterfaceC1798974f.LIZ);
        LIZLLL("is_highlight", this.LJIILJJIL);
        LIZJ(this.LJIILL, "impr_order");
        LIZLLL("req_id", this.LJIILLIIL);
        LIZLLL("to_user_id", this.LJIIZILJ);
        LIZLLL("is_rec", this.LJIJ);
        LIZLLL("has_label", this.LJIJI);
    }
}
