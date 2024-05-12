package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TbL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74955TbL implements InterfaceC74759TVr {
    public static final C74955TbL LIZ = new C74955TbL();

    @Override // X.InterfaceC74759TVr
    public final void LIZJ(LiveWidget widget) {
        o.LJIIIZ(widget, "widget");
    }

    @Override // X.InterfaceC74759TVr
    public final int getLayoutId() {
        return R.layout.dp6;
    }

    @Override // X.InterfaceC74759TVr
    public final int getHeight() {
        return C15380j0.LIZ(122.0f);
    }

    @Override // X.InterfaceC74759TVr
    public final int getWidth() {
        return C15380j0.LIZ(104.0f);
    }

    @Override // X.InterfaceC74759TVr
    public final int LIZIZ(int i) {
        return C15380j0.LIZ(16.0f) + C15380j0.LJFF(R.dimen.adn) + C15380j0.LJFF(R.dimen.adh) + C15380j0.LIZ(((i - 1) * 4.0f) + (i * 122.0f));
    }

    @Override // X.InterfaceC74759TVr
    public final void LIZ(View view, C75377Ti9 c75377Ti9) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(104.0f), C15380j0.LIZ(122.0f));
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = C15380j0.LIZ(16.0f) + C15380j0.LJFF(R.dimen.adn) + C15380j0.LJFF(R.dimen.adh) + C15380j0.LIZ(0 * 126.0f);
        layoutParams.rightMargin = C15380j0.LIZ(8.0f);
        ((ViewGroup) view).addView(c75377Ti9, layoutParams);
    }

    @Override // X.InterfaceC74759TVr
    public final void LIZLLL(int i, C75377Ti9 view) {
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.bottomMargin = C15380j0.LIZ(16.0f) + C15380j0.LJFF(R.dimen.adn) + C15380j0.LJFF(R.dimen.adh) + C15380j0.LIZ(i * 126.0f);
            view.setLayoutParams(layoutParams);
        }
    }
}
