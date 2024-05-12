package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.9iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244689iy extends AbstractC244669iw {
    public final View LJFF;
    public int LJI;
    public int LJII;

    @Override // X.ARS
    public final View LIZIZ() {
        View view = this.LJFF;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.LJI, this.LJII);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout((Context) this.LIZIZ);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, C7MY.LIZIZ(24), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackground(new ColorDrawable(this.LJ));
        frameLayout.addView(this.LJFF);
        return frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C244689iy(Context context, View view) {
        super(context, 0);
        o.LJIIIZ(context, "context");
        this.LJFF = view;
        this.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        this.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
    }
}
