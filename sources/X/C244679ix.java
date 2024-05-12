package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.9ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244679ix extends AbstractC244669iw {
    public final View LJFF;
    public int LJI;

    @Override // X.ARS
    public final View LIZIZ() {
        FrameLayout frameLayout = new FrameLayout((Context) this.LIZIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, 0, 0, this.LJI);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.LJ));
        View view = this.LJFF;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        frameLayout.addView(view);
        return frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C244679ix(Context context, View view, int i) {
        super(context, i);
        o.LJIIIZ(context, "context");
        this.LJFF = view;
        this.LJI = C7MY.LIZIZ(24);
    }
}
