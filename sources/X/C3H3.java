package X;

import java.util.HashMap;

/* renamed from: X.3H3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3H3 extends AbstractC69312nn {
    public final boolean LIZJ;
    public final long LIZLLL;
    public final int LJ;

    @Override // X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        String str;
        OSZ[] oszArr = new OSZ[3];
        if (this.LIZJ) {
            str = "full";
        } else {
            str = "half";
        }
        oszArr[0] = new OSZ("style", str);
        oszArr[1] = new OSZ("start_click_to_now", Long.valueOf(this.LIZLLL));
        oszArr[2] = new OSZ("product_quantity", Integer.valueOf(this.LJ));
        return C113554cx.LJJJLZIJ(oszArr);
    }

    public C3H3(boolean z, long j, int i) {
        super("rd_tiktokec_anchor_sku_duration");
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = i;
    }
}
