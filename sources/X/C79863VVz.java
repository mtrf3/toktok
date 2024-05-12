package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.VVz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79863VVz extends ViewPager {
    public C79863VVz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof C80638Vko) {
            AbstractC80634Vkk abstractC80634Vkk = (AbstractC80634Vkk) view;
            RectF bitmapRect = abstractC80634Vkk.getBitmapRect();
            abstractC80634Vkk.LJIIJJI(bitmapRect, abstractC80634Vkk.LLD);
            Rect rect = new Rect();
            abstractC80634Vkk.getGlobalVisibleRect(rect);
            if (bitmapRect != null) {
                float f = bitmapRect.right;
                float f2 = rect.right;
                if (f >= f2) {
                }
            }
            if (!super.canScroll(view, z, i, i2, i3)) {
                return false;
            }
            return true;
        }
        return super.canScroll(view, z, i, i2, i3);
    }
}
