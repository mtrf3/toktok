package X;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S2P {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("coupon_id", "coupon_type_id", "coupon_type_info", "coupon_cost_role");
    public static final List<Integer> LIZIZ = C47261Igj.LJJIJIIJI(15, 16, 20, 19);

    public static final void LIZIZ(SmartImageView smartImageView, PromotionItem promotionItem, Float f) {
        try {
            GImage waistImg = promotionItem.getWaistImg();
            if (waistImg != null) {
                W5F LIZLLL = C70759Rpr.LIZLLL(C69889Rbp.LIZLLL(waistImg));
                if (f != null) {
                    f.floatValue();
                    S3I s3i = new S3I();
                    s3i.LJFF = new C81726W5q(0.0f, 0.0f, f.floatValue(), f.floatValue());
                    LIZLLL.LJIJJLI = new S3L(s3i);
                }
                LIZLLL.LJJIIJ = smartImageView;
                LIZLLL.LIZLLL(new LDN(smartImageView));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    public static final OSZ<Float, Float> LIZ(Context context, float f, TuxTextView tuxTextView, TuxTextView tuxTextView2, String text1, String text2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(text1, "text1");
        o.LJIIIZ(text2, "text2");
        Paint paint = new Paint(tuxTextView.getPaint());
        Paint paint2 = new Paint(tuxTextView2.getPaint());
        int i = 13;
        do {
            paint.setTextSize(C87277YNd.LJI(i, context));
            paint2.setTextSize(C87277YNd.LJI(i, context));
            float measureText = paint2.measureText(text2) + paint.measureText(text1);
            if (measureText <= f || i == 9) {
                return new OSZ<>(Float.valueOf(i), Float.valueOf(Math.min(measureText, f)));
            }
            i--;
        } while (8 < i);
        return new OSZ<>(Float.valueOf(9.0f), Float.valueOf(f));
    }
}
