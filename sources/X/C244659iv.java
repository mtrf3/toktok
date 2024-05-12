package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.9iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244659iv extends AbstractC244669iw {
    public final Drawable LJFF;

    @Override // X.ARS
    public final View LIZIZ() {
        FrameLayout frameLayout = new FrameLayout((Context) this.LIZIZ);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, C7MY.LIZIZ(24), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.LJ));
        ImageView imageView = new ImageView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        imageView.setImageDrawable(this.LJFF);
        frameLayout.addView(imageView);
        return frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C244659iv(int i, Context context, Drawable icon) {
        super(context, i);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(icon, "icon");
        this.LJFF = icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C244659iv(Context context, int i, Integer num, int i2) {
        super(context, i2);
        o.LJIIIZ(context, "context");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = num;
        this.LJFF = c2068389v.LIZ(context);
    }

    public /* synthetic */ C244659iv(Context context, int i, Integer num, int i2, int i3) {
        this(context, i, (i2 & 4) != 0 ? null : num, 0);
    }
}
