package X;

/* renamed from: X.YbP, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C87699YbP implements Cloneable {
    public long LJLIL;
    public AbstractC87636YaO LJLILLLLZI;
    public VIN LJLJI;
    public Float LJLJJI;
    public AbstractC87636YaO LJLJJL;
    public Float LJLJJLL;
    public C87650Yac LJLJL;
    public YZE LJLJLJ;
    public YZF LJLJLLL;
    public Float LJLL;
    public C87650Yac[] LJLLI;
    public C87650Yac LJLLILLLL;
    public Float LJLLJ;
    public C87637YaP LJLLL;
    public Boolean LJLLLL;
    public C87717Ybh LJLLLLLL;
    public Boolean LJLZ;
    public Boolean LJZ;
    public AbstractC87636YaO LJZI;
    public Float LJZL;
    public String LL;
    public VIN LLD;
    public AbstractC87636YaO LLF;
    public Float LLFF;
    public AbstractC87636YaO LLFFF;
    public Float LLFII;
    public VIO LLFZ;
    public VIP LLI;

    public static C87699YbP LIZ() {
        C87699YbP c87699YbP = new C87699YbP();
        c87699YbP.LJLIL = -1L;
        C87637YaP c87637YaP = C87637YaP.LJLILLLLZI;
        c87699YbP.LJLILLLLZI = c87637YaP;
        VIN vin = VIN.NonZero;
        c87699YbP.LJLJI = vin;
        Float valueOf = Float.valueOf(1.0f);
        c87699YbP.LJLJJI = valueOf;
        c87699YbP.LJLJJL = null;
        c87699YbP.LJLJJLL = valueOf;
        c87699YbP.LJLJL = new C87650Yac();
        c87699YbP.LJLJLJ = YZE.Butt;
        c87699YbP.LJLJLLL = YZF.Miter;
        c87699YbP.LJLL = Float.valueOf(4.0f);
        c87699YbP.LJLLI = null;
        c87699YbP.LJLLILLLL = new C87650Yac();
        c87699YbP.LJLLJ = valueOf;
        c87699YbP.LJLLL = c87637YaP;
        Boolean bool = Boolean.TRUE;
        c87699YbP.LJLLLL = bool;
        c87699YbP.LJLLLLLL = null;
        c87699YbP.LJLZ = bool;
        c87699YbP.LJZ = bool;
        c87699YbP.LJZI = c87637YaP;
        c87699YbP.LJZL = valueOf;
        c87699YbP.LL = null;
        c87699YbP.LLD = vin;
        c87699YbP.LLF = null;
        c87699YbP.LLFF = valueOf;
        c87699YbP.LLFFF = null;
        c87699YbP.LLFII = valueOf;
        c87699YbP.LLFZ = VIO.None;
        c87699YbP.LLI = VIP.auto;
        return c87699YbP;
    }

    public final Object clone() {
        C87699YbP c87699YbP = (C87699YbP) super.clone();
        C87650Yac[] c87650YacArr = this.LJLLI;
        if (c87650YacArr != null) {
            c87699YbP.LJLLI = (C87650Yac[]) c87650YacArr.clone();
        }
        return c87699YbP;
    }
}
