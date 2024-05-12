package X;

/* renamed from: X.Rzq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71378Rzq extends S0L {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Integer LJIILIIL;
    public String LJIILJJIL;

    public C71378Rzq() {
        super("product_anchor_show");
    }

    @Override // X.S0L
    public final void LIZIZ() {
        String str = this.LIZLLL;
        InterfaceC71397S0j.LIZ.getClass();
        LIZ("enter_from", str);
        LIZ("group_id", this.LJ);
        LIZ("request_id", this.LJI);
        LIZ("author_id", this.LJFF);
        LIZ("product_type", this.LJII);
        LIZ("page_type", this.LJIIIIZZ);
        LIZ("anchor_show_type", this.LJIIIZ);
        LIZ("product_source", this.LJIIJJI);
        LIZ("source", this.LJIIJ);
        LIZ("page_name", this.LJIILJJIL);
        Integer num = this.LJIILIIL;
        if (num != null) {
            LIZ("follow_status", String.valueOf(num.intValue()));
        }
        LIZ("entrance_form", this.LJIIL);
    }
}
