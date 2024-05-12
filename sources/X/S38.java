package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S38 implements S35 {
    public final S3B LIZ;

    public S38(S3B style) {
        o.LJIIIZ(style, "style");
        this.LIZ = style;
    }

    @Override // X.S35
    public final void LJFF(ViewGroup innerContainerView) {
        o.LJIIIZ(innerContainerView, "innerContainerView");
        ViewGroup.LayoutParams layoutParams = innerContainerView.getLayoutParams();
        layoutParams.width = this.LIZ.LJ();
        layoutParams.height = this.LIZ.LJ();
        innerContainerView.setLayoutParams(layoutParams);
        Integer LIZLLL = this.LIZ.LIZLLL();
        if (LIZLLL != null) {
            int intValue = LIZLLL.intValue();
            C45804HyK.LJJLIIIJ(intValue, innerContainerView);
            C45804HyK.LJJLIIIIJ(intValue, innerContainerView);
        }
    }

    @Override // X.S35
    public final W5F LJ(Context context, String imageUrl) {
        S3L s3l;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(imageUrl, "imageUrl");
        W5F LIZLLL = C70759Rpr.LIZLLL(imageUrl);
        Integer LJI = C79045V0n.LJI(this.LIZ.LJIIIZ(), context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            S3I s3i = new S3I();
            s3i.LIZLLL = this.LIZ.LIZ();
            float LJIIL = this.LIZ.LJIIL();
            s3i.LIZJ = intValue;
            s3i.LIZIZ = LJIIL;
            s3i.LJ = this.LIZ.LJIIL();
            s3l = new S3L(s3i);
        } else {
            s3l = null;
        }
        LIZLLL.LJIJJLI = s3l;
        return LIZLLL;
    }

    @Override // X.S35
    public final void LJII(SmartImageView smartImageView, PromotionItem promotionItem) {
        S2P.LIZIZ(smartImageView, promotionItem, Float.valueOf(this.LIZ.LIZ()));
    }

    @Override // X.S35
    public final void LIZIZ(Context context, TuxTextView tuxTextView, boolean z) {
        float LJIIIIZZ;
        o.LJIIIZ(context, "context");
        S3B s3b = this.LIZ;
        if (z) {
            LJIIIIZZ = 0.0f;
        } else {
            LJIIIIZZ = s3b.LJIIIIZZ();
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(this.LIZ.LIZIZ());
        c110614Vt.LJIIJJI = Float.valueOf(LJIIIIZZ);
        c110614Vt.LJIIIIZZ = Float.valueOf(this.LIZ.LJIIIIZZ());
        tuxTextView.setBackground(c110614Vt.LIZ(context));
    }

    @Override // X.S35
    public final void LJIIJJI(Context context, TuxTextView tuxTextView, int i) {
        Integer LJIIJ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        if (C53650L3u.LIZ[this.LIZ.LJI().ordinal()] == 1) {
            tuxTextView.setText(String.valueOf(i));
            if (i < 100) {
                LJIIJ = this.LIZ.LJII();
            } else {
                int LIZIZ = C7MY.LIZIZ(3);
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(LIZIZ);
                    marginLayoutParams.setMarginEnd(LIZIZ);
                }
                tuxTextView.requestLayout();
                LJIIJ = this.LIZ.LJIIJ();
            }
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if (LJIIJ != null) {
                i2 = LJIIJ.intValue();
            } else {
                i2 = -2;
            }
            layoutParams2.width = i2;
            tuxTextView.setLayoutParams(layoutParams2);
            return;
        }
        String LLLZI = C16880lQ.LLLZI(Locale.US, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        tuxTextView.setText(LLLZI);
        tuxTextView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.p2), context.getResources().getDimensionPixelSize(R.dimen.oj), context.getResources().getDimensionPixelSize(R.dimen.p2), context.getResources().getDimensionPixelSize(R.dimen.oj));
    }
}
