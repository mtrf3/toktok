package X;

import X.AbstractC71081Rv3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rut, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71071Rut<T, VH extends AbstractC71081Rv3> extends AbstractC31414CUo<Object, Object> {
    public final Aweme LIZIZ;
    public final FeedEcCardConfig LIZJ;
    public final FeedEcCardStyle LIZLLL;
    public final C71076Ruy LJ;
    public final boolean LJFF;

    public final void LJI(SmartImageView smartImageView, Image image, int i) {
        C62562cu imageUrlModel;
        Drawable LJIIIIZZ;
        int i2;
        o.LJIIIZ(smartImageView, "<this>");
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            S3I s3i = new S3I();
            s3i.LIZLLL = C32151Nz.LJIIZILJ(Integer.valueOf(i));
            s3i.LIZIZ = C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
            s3i.LIZJ = C78609UtB.LJJJ(R.attr.dn, smartImageView.getContext());
            S3L s3l = new S3L(s3i);
            if (!this.LJFF) {
                Context context = smartImageView.getContext();
                o.LJIIIIZZ(context, "this.context");
                LJIIIIZZ = C79045V0n.LJIIIIZZ(R.attr.cj, context);
            } else {
                Context context2 = smartImageView.getContext();
                o.LJIIIIZZ(context2, "this.context");
                LJIIIIZZ = C79045V0n.LJIIIIZZ(R.attr.d2, context2);
            }
            W5F LJIIIZ = W5U.LJIIIZ(imageUrlModel);
            Integer width = image.getWidth();
            int i3 = 0;
            if (width != null) {
                i2 = width.intValue();
            } else {
                i2 = 0;
            }
            Integer height = image.getHeight();
            if (height != null) {
                i3 = height.intValue();
            }
            if (i2 > 0 && i3 > 0) {
                LJIIIZ.LJIIIZ = i2;
                LJIIIZ.LJIIJ = i3;
            }
            LJIIIZ.LJIJJLI = s3l;
            LJIIIZ.LJIILIIL = LJIIIIZZ;
            LJIIIZ.LJIILLIIL = LJIIIIZZ;
            LJIIIZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LJIIIZ.LJJI = KL0.HIGH;
            LJIIIZ.LIZIZ("feed_ec_card");
            LJIIIZ.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJIIIZ);
        }
    }

    public static void LJII(TuxTextView tvProductCurrency, TuxTextView tvProductSalesPrice, TuxTextView tvProductOriginalPrice, EcUgProduct.EcUgProductPrice ecUgProductPrice) {
        o.LJIIIZ(tvProductCurrency, "tvProductCurrency");
        o.LJIIIZ(tvProductSalesPrice, "tvProductSalesPrice");
        o.LJIIIZ(tvProductOriginalPrice, "tvProductOriginalPrice");
        if (ecUgProductPrice != null) {
            String LIZ = ED2.LIZ(ecUgProductPrice.getCurrency());
            tvProductCurrency.setText(LIZ);
            String LIZ2 = ED2.LIZ(ecUgProductPrice.getMinSalesPrice());
            if (!ujb.o.LJJJJJL(LIZ2)) {
                tvProductSalesPrice.setText(LIZ2);
            } else {
                tvProductCurrency.setText("");
                tvProductSalesPrice.setText("");
            }
            String LIZ3 = ED2.LIZ(ecUgProductPrice.getMinOriginalPrice());
            if (!ujb.o.LJJJJJL(LIZ3)) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZ);
                LIZ4.append(LIZ3);
                tvProductOriginalPrice.setText(X1D.LIZIZ(LIZ4));
                return;
            }
            tvProductOriginalPrice.setText("");
            return;
        }
        tvProductCurrency.setText("");
        tvProductSalesPrice.setText("");
        tvProductOriginalPrice.setText("");
    }

    public AbstractC71071Rut(Aweme aweme, FeedEcCardConfig cardConfig, FeedEcCardStyle cardStyle, C71076Ruy cardCache, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardConfig, "cardConfig");
        o.LJIIIZ(cardStyle, "cardStyle");
        o.LJIIIZ(cardCache, "cardCache");
        this.LIZIZ = aweme;
        this.LIZJ = cardConfig;
        this.LIZLLL = cardStyle;
        this.LJ = cardCache;
        this.LJFF = z;
    }
}
