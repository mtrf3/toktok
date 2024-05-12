package X;

import java.util.HashMap;

/* renamed from: X.RkK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70416RkK extends AbstractC28083B0l {
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        String str;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("photo_show_type", this.LIZJ);
        if (this.LIZLLL) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        oszArr[1] = new OSZ("page_show_type", str);
        oszArr[2] = new OSZ("photo_id", this.LJ);
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        oszArr[3] = new OSZ("glide_info", str2);
        return C113554cx.LJJJLZIJ(oszArr);
    }

    public C70416RkK(String str, String str2, String str3, boolean z) {
        super("tiktokec_product_detail_page_photo_glide");
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
