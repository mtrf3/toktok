package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkMicStyleSwitchWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TbK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74954TbK implements InterfaceC74759TVr {
    public static final C74954TbK LIZ = new C74954TbK();

    @Override // X.InterfaceC74759TVr
    public final int LIZIZ(int i) {
        return 0;
    }

    @Override // X.InterfaceC74759TVr
    public final int getLayoutId() {
        return R.layout.dp7;
    }

    @Override // X.InterfaceC74759TVr
    public final int getHeight() {
        return C15380j0.LIZ(98.0f);
    }

    @Override // X.InterfaceC74759TVr
    public final int getWidth() {
        return C15380j0.LIZ(85.0f);
    }

    @Override // X.InterfaceC74759TVr
    public final void LIZJ(LiveWidget widget) {
        o.LJIIIZ(widget, "widget");
        widget.subWidgetManager.load(R.id.dqn, new GameLinkMicStyleSwitchWidget());
    }

    @Override // X.InterfaceC74759TVr
    public final void LIZ(View view, C75377Ti9 c75377Ti9) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.dql);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(85.0f), C15380j0.LIZ(98.0f));
        layoutParams.gravity = 8388691;
        layoutParams.setMarginEnd(C15380j0.LIZ(4.0f));
        viewGroup.addView(c75377Ti9, layoutParams);
    }

    @Override // X.InterfaceC74759TVr
    public final void LIZLLL(int i, C75377Ti9 view) {
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(view, viewGroup);
            if (i > viewGroup.getChildCount()) {
                i = viewGroup.getChildCount();
            }
            viewGroup.addView(view, i);
        }
    }
}
