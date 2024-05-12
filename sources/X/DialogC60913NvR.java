package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.NvR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class DialogC60913NvR extends C18Z {
    @Override // android.app.Dialog
    public final void show() {
        Window window;
        View decorView;
        View decorView2;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setFlags(8, 8);
        }
        if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-8690584130385368942")).LIZ) {
            super.show();
        }
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && (window = ownerActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window3 = getWindow();
            if (window3 != null && (decorView2 = window3.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.clearFlags(8);
        }
    }

    public final void LJIJJ() {
        Window window;
        View decorView;
        View findViewById;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
            window2.setSoftInputMode(16);
            window2.setBackgroundDrawable(new ColorDrawable(0));
            Window window3 = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                if (window3 != null) {
                    window3.clearFlags(67108864);
                    window3.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                    window3.setStatusBarColor(0);
                    if (window3 != null && (findViewById = window3.findViewById(R.id.content)) != null) {
                        findViewById.setForeground(null);
                    }
                }
            } else if (window3 != null) {
                window3.setStatusBarColor(0);
            }
            View decorView2 = window2.getDecorView();
            decorView2.setPadding(0, 0, 0, 0);
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity != null && (window = ownerActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(decorView.getSystemUiVisibility());
            }
            Activity ownerActivity2 = getOwnerActivity();
            if (ownerActivity2 != null) {
                Window window4 = ownerActivity2.getWindow();
                o.LJFF(window4, "it.window");
                window2.setNavigationBarColor(window4.getNavigationBarColor());
            }
        }
    }

    public DialogC60913NvR(Context context) {
        super(context, com.zhiliaoapp.musically.R.style.hn);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIJ(view, "view");
        LJIJI(1);
        super.setContentView(view);
        view.setFitsSystemWindows(false);
        LJIJJ();
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        LJIJI(1);
        super.setContentView(i);
        LJIJJ();
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIJ(view, "view");
        LJIJI(1);
        super.setContentView(view, layoutParams);
        LJIJJ();
    }
}
