package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vad, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80007Vad implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar LJLIL;

    public final void LIZ() {
        Context context;
        BaseTransientBottomBar baseTransientBottomBar = this.LJLIL;
        if (baseTransientBottomBar.LIZJ == null || (context = baseTransientBottomBar.LIZIZ) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        BaseTransientBottomBar baseTransientBottomBar2 = this.LJLIL;
        int[] iArr = new int[2];
        baseTransientBottomBar2.LIZJ.getLocationOnScreen(iArr);
        int height = (i - (baseTransientBottomBar2.LIZJ.getHeight() + iArr[1])) + ((int) this.LJLIL.LIZJ.getTranslationY());
        BaseTransientBottomBar baseTransientBottomBar3 = this.LJLIL;
        if (height >= baseTransientBottomBar3.LJIIJ) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.LIZJ.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.bottomMargin;
        BaseTransientBottomBar baseTransientBottomBar4 = this.LJLIL;
        marginLayoutParams.bottomMargin = (baseTransientBottomBar4.LJIIJ - height) + i2;
        baseTransientBottomBar4.LIZJ.requestLayout();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80007Vad(BaseTransientBottomBar baseTransientBottomBar) {
        this.LJLIL = baseTransientBottomBar;
    }
}
