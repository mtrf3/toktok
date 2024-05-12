package X;

import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NzT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC61163NzT implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ SkeletonSharePanelFragment LJLIL;

    public ViewTreeObserverOnGlobalLayoutListenerC61163NzT(SkeletonSharePanelFragment skeletonSharePanelFragment) {
        this.LJLIL = skeletonSharePanelFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        Window window;
        View decorView;
        int i2;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        Dialog dialog;
        Window window2;
        View decorView2;
        WindowManager windowManager;
        Display defaultDisplay;
        SkeletonSharePanelFragment skeletonSharePanelFragment = this.LJLIL;
        if (!skeletonSharePanelFragment.LJZI || skeletonSharePanelFragment.LJLILLLLZI == null) {
            return;
        }
        Point point = new Point();
        ActivityC45651qj mo49getActivity = skeletonSharePanelFragment.mo49getActivity();
        if (mo49getActivity != null && (windowManager = mo49getActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getSize(point);
        }
        Rect rect = new Rect();
        TuxSheet tuxSheet = skeletonSharePanelFragment.LJLILLLLZI;
        if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (window2 = dialog.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            decorView2.getWindowVisibleDisplayFrame(rect);
        }
        int i3 = point.y;
        ActivityC45651qj mo49getActivity2 = skeletonSharePanelFragment.mo49getActivity();
        boolean z = false;
        if (mo49getActivity2 == null || (window = mo49getActivity2.getWindow()) == null || (decorView = window.getDecorView()) == null || (i2 = Build.VERSION.SDK_INT) < 23 || (rootWindowInsets = decorView.getRootWindowInsets()) == null || i2 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i = 0;
        } else {
            List<Rect> boundingRects = displayCutout.getBoundingRects();
            o.LJIIIIZZ(boundingRects, "displayCutout.boundingRects");
            i = 0;
            for (Rect rect2 : boundingRects) {
                if (rect2.top == 0) {
                    i += rect2.bottom;
                }
            }
        }
        int i4 = (i3 + i) - rect.bottom;
        skeletonSharePanelFragment.LJLZ = i4;
        if (i4 > 0) {
            z = true;
        }
        skeletonSharePanelFragment.LJZ = z;
    }
}
