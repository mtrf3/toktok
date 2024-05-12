package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponentTemp;
import kotlin.jvm.internal.o;

/* renamed from: X.00j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C005300j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        ViewGroup.LayoutParams layoutParams;
        switch (this.LJLIL) {
            case 1:
                Rect videoContainerLocation = (Rect) this.LJLILLLLZI;
                o.LJIIIZ(videoContainerLocation, "$videoContainerLocation");
                o.LJIIIZ(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                KeyEventCallbackC73065Slx.LJLLJ = videoContainerLocation.width();
                KeyEventCallbackC73065Slx.LJLLL = videoContainerLocation.height();
                int i = KeyEventCallbackC73065Slx.LJLJJI;
                int i2 = KeyEventCallbackC73065Slx.LJLJI;
                int i3 = (int) KeyEventCallbackC73065Slx.LJLLJ;
                int i4 = (int) KeyEventCallbackC73065Slx.LJLLL;
                double d = i;
                double d2 = i2;
                double d3 = i3;
                double d4 = i4;
                if (d / d2 > d3 / d4) {
                    i4 = (int) ((d3 * d2) / d);
                } else {
                    i3 = (int) ((d4 * d) / d2);
                }
                C73043Slb c73043Slb = new C73043Slb(i3, i4);
                KeyEventCallbackC73065Slx.LJLLLL = c73043Slb.LIZ;
                KeyEventCallbackC73065Slx.LJLLLLLL = c73043Slb.LIZIZ;
                ImageView imageView = KeyEventCallbackC73065Slx.LJLLILLLL;
                if (imageView != null) {
                    layoutParams = imageView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int[] iArr = KeyEventCallbackC73065Slx.LJLILLLLZI;
                float f = iArr[1];
                float f2 = KeyEventCallbackC73065Slx.LJLLL;
                float f3 = KeyEventCallbackC73065Slx.LJLLLLLL;
                marginLayoutParams.topMargin = (int) (f - ((f - ((f2 - f3) / 2.0f)) * floatValue));
                float f4 = iArr[0];
                float f5 = KeyEventCallbackC73065Slx.LJLLJ;
                float f6 = KeyEventCallbackC73065Slx.LJLLLL;
                marginLayoutParams.leftMargin = (int) (f4 - ((f4 - ((f5 - f6) / 2.0f)) * floatValue));
                float f7 = KeyEventCallbackC73065Slx.LJLJJI;
                marginLayoutParams.width = (int) C06420Na.LIZIZ(f6, f7, floatValue, f7);
                float f8 = KeyEventCallbackC73065Slx.LJLJI;
                marginLayoutParams.height = (int) C06420Na.LIZIZ(f3, f8, floatValue, f8);
                ImageView imageView2 = KeyEventCallbackC73065Slx.LJLLILLLL;
                if (imageView2 == null) {
                    return;
                }
                imageView2.setLayoutParams(marginLayoutParams);
                return;
            default:
                ScreenAdaptionComponentTemp screenAdaptionComponentTemp = ((BaseListFragmentPanel) this.LJLILLLLZI).mScreenAdaptionComponentTemp;
                if (screenAdaptionComponentTemp != null) {
                    screenAdaptionComponentTemp.vU(((Integer) animation.getAnimatedValue()).intValue());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ C005300j(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
