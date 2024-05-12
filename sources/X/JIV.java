package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class JIV extends AbstractC69312nn {
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;

    @Override // X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        return C113554cx.LJJJLZIJ(new OSZ("enter2loaded_cost", Long.valueOf(this.LIZJ)), new OSZ("load_cost", Long.valueOf(this.LIZLLL)), new OSZ("load_success", Boolean.valueOf(this.LJI)), new OSZ("ab", Integer.valueOf(this.LJ)), new OSZ("cache", Boolean.valueOf(this.LJFF)), new OSZ("preview_radio", Float.valueOf(this.LJII)), new OSZ("radio", Float.valueOf(this.LJIIIIZZ)), new OSZ("leak_preview_loading", Boolean.valueOf(this.LJIIIZ)), new OSZ("leak_real_loading", Boolean.valueOf(this.LJIIJ)), new OSZ("hit_pre_download", Boolean.valueOf(this.LJIIJJI)));
    }

    public JIV(float f, float f2, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super("rd_tiktokec_pdp_image_load");
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = f;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = z5;
    }
}
