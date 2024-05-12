package X;

/* renamed from: X.Rzn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71375Rzn extends S0L {
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
    public String LJIILIIL;
    public Integer LJIILJJIL;
    public String LJIILL;

    public C71375Rzn() {
        super("product_stay_time");
    }

    @Override // X.S0L
    public final void LIZIZ() {
        String str = this.LIZLLL;
        InterfaceC71397S0j.LIZ.getClass();
        LIZ("enter_from", str);
        LIZ("group_id", this.LJ);
        LIZ("author_id", this.LJFF);
        LIZ("request_id", this.LJI);
        LIZ("product_type", this.LJII);
        LIZ("duration", this.LJIIIIZZ);
        LIZ("page_type", this.LJIIIZ);
        LIZ("anchor_show_type", this.LJIIJ);
        LIZ("product_source", this.LJIIL);
        LIZ("source", this.LJIIJJI);
        LIZ("page_name", this.LJIILL);
        Integer num = this.LJIILJJIL;
        if (num != null) {
            LIZ("follow_status", String.valueOf(num.intValue()));
        }
        LIZ("entrance_form", this.LJIILIIL);
    }
}
