package X;

/* loaded from: classes7.dex */
public final class G2I extends F9E {
    public final G2J LJLIL;
    public final G2J LJLILLLLZI;
    public final G2J LJLJI;
    public final G2J LJLJJI;
    public final G2J LJLJJL;
    public final G2J LJLJJLL;
    public final G2J LJLJL;
    public final G2J LJLJLJ;
    public boolean LJLJLLL;

    public G2I() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, Boolean.valueOf(this.LJLJLLL)};
    }

    public G2I(int i) {
        G2J g2j = new G2J("flow_engine_execute_component");
        G2J g2j2 = new G2J("flow_engine_handle_step");
        G2J g2j3 = new G2J("activity_launch");
        G2J g2j4 = new G2J("fragment_on_create");
        G2J g2j5 = new G2J("fragment_on_create_view");
        G2J g2j6 = new G2J("fragment_on_view_created");
        G2J g2j7 = new G2J("fragment_on_resume");
        G2J g2j8 = new G2J("fragment_init_to_resume");
        this.LJLIL = g2j;
        this.LJLILLLLZI = g2j2;
        this.LJLJI = g2j3;
        this.LJLJJI = g2j4;
        this.LJLJJL = g2j5;
        this.LJLJJLL = g2j6;
        this.LJLJL = g2j7;
        this.LJLJLJ = g2j8;
        this.LJLJLLL = false;
    }
}
