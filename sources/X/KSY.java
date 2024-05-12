package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class KSY extends AbstractC69312nn {
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final long LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;

    @Override // X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        String str;
        String str2;
        OSZ[] oszArr = new OSZ[13];
        if (this.LIZJ) {
            str = "full";
        } else {
            str = "half";
        }
        oszArr[0] = new OSZ("style", str);
        if (this.LIZLLL) {
            str2 = "video";
        } else {
            str2 = "";
        }
        oszArr[1] = new OSZ("business", str2);
        oszArr[2] = new OSZ("retry_count", Integer.valueOf(this.LJ));
        oszArr[3] = new OSZ("preload_type", Integer.valueOf(this.LJI));
        oszArr[4] = new OSZ("template", this.LJFF);
        oszArr[5] = new OSZ("start_click_to_now", Long.valueOf(this.LJII));
        oszArr[6] = new OSZ("image_load_duration", Long.valueOf(this.LJIIIIZZ));
        oszArr[7] = new OSZ("load_success", Integer.valueOf(this.LJIIIZ));
        oszArr[8] = new OSZ("cold_start", Integer.valueOf(this.LJIIJ ? 1 : 0));
        oszArr[9] = new OSZ("is_from_preview", Integer.valueOf(this.LJIIL ? 1 : 0));
        oszArr[10] = new OSZ("hit_cache", Integer.valueOf(this.LJIILIIL ? 1 : 0));
        oszArr[11] = new OSZ("start_scene_to_now", Long.valueOf(this.LJIIJJI));
        oszArr[12] = new OSZ("has_first_screen_data", Integer.valueOf(this.LJIILJJIL ? 1 : 0));
        return C113554cx.LJJJLZIJ(oszArr);
    }

    public KSY(boolean z, boolean z2, int i, String str, int i2, long j, long j2, int i3, boolean z3, long j3, boolean z4, boolean z5, boolean z6) {
        super("rd_tiktokec_anchor_product_detail_duration");
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = i2;
        this.LJII = j;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = i3;
        this.LJIIJ = z3;
        this.LJIIJJI = j3;
        this.LJIIL = z4;
        this.LJIILIIL = z5;
        this.LJIILJJIL = z6;
    }
}
