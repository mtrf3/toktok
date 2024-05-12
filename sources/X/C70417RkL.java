package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RkL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70417RkL extends AbstractC28083B0l {
    public final String LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        return C113554cx.LJJJLZIJ(new OSZ("photo_id", this.LIZJ), new OSZ("photo_type", this.LIZLLL));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70417RkL(String photoId, String photoType) {
        super("tiktokec_product_detail_page_photo_click");
        o.LJIIIZ(photoId, "photoId");
        o.LJIIIZ(photoType, "photoType");
        this.LIZJ = photoId;
        this.LIZLLL = photoType;
    }
}
