package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import kotlin.jvm.internal.o;

/* renamed from: X.K6u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnApplyWindowInsetsListenerC51180K6u implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ View LIZIZ;

    public ViewOnApplyWindowInsetsListenerC51180K6u(Context context, View view) {
        this.LIZ = context;
        this.LIZIZ = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        o.LJIIIZ(windowInsets, "windowInsets");
        if (Build.VERSION.SDK_INT >= 30) {
            int i = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
            float LJIIIZ = KL2.LJIIIZ(this.LIZ);
            int[] iArr = new int[2];
            this.LIZIZ.getLocationOnScreen(iArr);
            int i2 = iArr[1];
            float f = LJIIIZ - i;
            if (i2 > f) {
                this.LIZIZ.setPadding(0, 0, 0, (int) (i2 - f));
            } else {
                this.LIZIZ.setPadding(0, 0, 0, 0);
            }
            windowInsets.getInsets(WindowInsets.Type.ime() | WindowInsets.Type.systemGestures());
        }
        return windowInsets;
    }
}
