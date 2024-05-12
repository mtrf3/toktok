package X;

import java.util.HashMap;

/* renamed from: X.RkN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70419RkN extends AbstractC28083B0l {
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        return C113554cx.LJJJLZIJ(new OSZ("video_id", this.LIZJ), new OSZ("video_whole_duration", Integer.valueOf(this.LIZLLL)), new OSZ("module_name", this.LJ));
    }

    public C70419RkN(String str, int i, String str2) {
        super("tiktokec_product_detail_page_video_click");
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = str2;
    }
}
