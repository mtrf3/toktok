package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OOa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61820OOa {
    public static void LIZIZ(Window window, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Build.MANUFACTURER);
        LIZ.append("-");
        LIZ.append(Build.MODEL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (TextUtils.equals("vivo-V1821A", LIZIZ) || TextUtils.equals("vivo-V1821T", LIZIZ)) {
            window.setLayout(i, -2);
        } else {
            window.setLayout(i, i2);
        }
    }

    public static void LIZ(Dialog dialog, PNP pnp, boolean z, boolean z2, BaseSharePackage baseSharePackage) {
        int i;
        WindowManager.LayoutParams attributes;
        Bundle bundle;
        String string;
        View decorView;
        View decorView2;
        o.LJIIIZ(dialog, "dialog");
        Context context = dialog.getContext();
        o.LJIIIIZZ(context, "dialog.context");
        Window window = dialog.getWindow();
        C62210ObG LIZ = C62209ObF.LIZ(context);
        if (LIZ != null) {
            i = LIZ.LIZJ;
        } else {
            i = 0;
        }
        int LJJJJLI = i - C63081OpJ.LJJJJLI(context);
        if (window != null) {
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("enter_method")) != null && string.equals("icon")) {
                if (z) {
                    LIZIZ(window, -1, -1);
                    Window window2 = dialog.getWindow();
                    if (window2 != null) {
                        O09.LIZ(window2);
                    }
                    Window window3 = dialog.getWindow();
                    if (window3 != null) {
                        window3.setStatusBarColor(0);
                    }
                    Window window4 = dialog.getWindow();
                    if (window4 != null) {
                        window4.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                    }
                } else {
                    Context context2 = dialog.getContext();
                    if (context2 != null && C012403c.LIZ(context2) == 1) {
                        window.setGravity(8388611);
                    } else {
                        window.setGravity(8388613);
                    }
                    LIZIZ(window, O6R.LJJIIZ(C32151Nz.LJIIZILJ(375)), -1);
                    Window window5 = dialog.getWindow();
                    if (window5 != null && (decorView2 = window5.getDecorView()) != null) {
                        decorView2.setSystemUiVisibility(2);
                    }
                    Window window6 = dialog.getWindow();
                    if (window6 != null && (decorView = window6.getDecorView()) != null) {
                        decorView.setOnSystemUiVisibilityChangeListener(new OOZ(dialog));
                    }
                }
            } else {
                if (!z || LJJJJLI == 0) {
                    LJJJJLI = -1;
                }
                LIZIZ(window, -1, LJJJJLI);
            }
            OVT ovt = C62494Ofq.LJI;
            if (ovt != null && ovt.LIZIZ(z2)) {
                window.setGravity(80);
            } else if (z) {
                Object parent = pnp.getParent();
                if (parent != null) {
                    BottomSheetBehavior from = BottomSheetBehavior.from((View) parent);
                    o.LJIIIIZZ(from, "BottomSheetBehavior.from…ntentView.parent as View)");
                    Window window7 = dialog.getWindow();
                    if (window7 != null && (attributes = window7.getAttributes()) != null) {
                        from.setPeekHeight(attributes.height);
                        from.setState(3);
                        from.setBottomSheetCallback(new C61821OOb(dialog, from));
                    }
                    window.setGravity(80);
                    WindowManager.LayoutParams attributes2 = window.getAttributes();
                    attributes2.gravity = 80;
                    window.setAttributes(attributes2);
                    window.findViewById(R.id.c8m).setBackgroundDrawable(new ColorDrawable(0));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            } else {
                window.addFlags(67108864);
            }
            dialog.setCanceledOnTouchOutside(true);
        }
    }
}
