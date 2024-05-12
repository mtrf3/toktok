package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes11.dex */
public final class P1G extends JHM<P1G> {
    public int LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;

    public P1G() {
        super("follow_list_user_show");
        this.LJIILJJIL = -1;
        this.LJIILL = "";
        this.LJIILLIIL = "";
        this.LJIIZILJ = CardStruct.IStatusCode.DEFAULT;
        this.LJIJ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.JHM
    public final void LJII() {
        LJ("enter_from", this.LIZLLL, InterfaceC1798974f.LIZ);
        LIZJ(this.LJIILJJIL, "impr_order");
        LIZLLL("req_id", this.LJIILL);
        LIZLLL("to_user_id", this.LJIILLIIL);
        LIZLLL("is_rec", this.LJIIZILJ);
        LIZLLL("has_label", this.LJIJ);
    }
}
