package X;

import Y.AUListenerS101S0200000_12;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data.FeedProduct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S3k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71476S3k implements InterfaceC71472S3g {
    @Override // X.InterfaceC71472S3g
    public final Animator LIZIZ(ViewGroup viewGroup, S21 s21) {
        ViewGroup.LayoutParams layoutParams = s21.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = -layoutParams2.height;
        s21.setLayoutParams(layoutParams2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0200000_12(s21, layoutParams2, 1));
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    @Override // X.InterfaceC71472S3g
    public final Animator LIZJ(ViewGroup viewGroup, S21 s21) {
        ViewGroup.LayoutParams layoutParams = s21.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = -layoutParams2.height;
        s21.setLayoutParams(layoutParams2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0200000_12(s21, layoutParams2, 0));
        ofFloat.setInterpolator(new SJH());
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    @Override // X.InterfaceC71472S3g
    public final S21 LIZ(FeedProduct feedProduct, long j, Context context, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(context, "context");
        C71477S3l c71477S3l = new C71477S3l();
        c71477S3l.LIZ = feedProduct;
        c71477S3l.LIZIZ = j;
        c71477S3l.LIZJ = 2;
        c71477S3l.LIZLLL = z;
        S21 LIZ = c71477S3l.LIZ(context);
        if (LIZ != null) {
            if (z) {
                layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.om));
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.pl));
                layoutParams.bottomMargin = -20;
            }
            LIZ.setLayoutParams(layoutParams);
            return LIZ;
        }
        return null;
    }
}
