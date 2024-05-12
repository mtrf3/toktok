package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.9vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252579vh extends AbstractC65781Prl implements InterfaceC88472Yns<Context, FrameLayout> {
    public static final C252579vh LJLIL = new C252579vh();

    public C252579vh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final FrameLayout invoke(Context context) {
        Context context2 = context;
        o.LJIIIZ(context2, "context");
        FrameLayout frameLayout = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(0);
        C223338pd c223338pd = new C223338pd(context2, null, 6);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(28)));
        layoutParams2.gravity = 17;
        c223338pd.setLayoutParams(layoutParams2);
        c223338pd.setVisibility(0);
        c223338pd.LIZIZ();
        frameLayout.addView(c223338pd);
        return frameLayout;
    }
}
