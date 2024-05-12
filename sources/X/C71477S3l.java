package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data.FeedProduct;
import kotlin.jvm.internal.o;

/* renamed from: X.S3l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71477S3l {
    public FeedProduct LIZ;
    public long LIZIZ;
    public int LIZJ = 1;
    public boolean LIZLLL;

    public final S21 LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LIZ == null) {
            return null;
        }
        S21 s21 = new S21(this.LIZJ, this.LIZLLL, context);
        FeedProduct feedProduct = this.LIZ;
        if (feedProduct != null) {
            s21.LJJLJLI(feedProduct, this.LIZIZ);
            return s21;
        }
        o.LJIJI("product");
        throw null;
    }
}
