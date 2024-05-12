package X;

import android.R;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.util.List;

/* renamed from: X.UyO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78932UyO {
    public static Drawable LIZLLL(Context context) {
        if (!(context instanceof Activity)) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.windowBackground, typedValue, true);
            int i = typedValue.type;
            if (i >= 28 && i <= 31) {
                return new ColorDrawable(typedValue.data);
            }
            return context.getResources().getDrawable(typedValue.resourceId);
        }
        throw new IllegalArgumentException("Use Scene Context instead");
    }

    public static boolean LJ(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static void LJFF(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
    }

    public static String LIZIZ(int i, Context context) {
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static void LJI(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void LIZ(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            if (z) {
                fragmentTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransaction.commitAllowingStateLoss();
                return;
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
        if (!z) {
            return;
        }
        fragmentManager.executePendingTransactions();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(WM7 wm7, StringBuilder sb, int i) {
        View view;
        InterfaceC36571c5 interfaceC36571c5 = wm7.mParentScene;
        String replace = new String(new char[i]).replace("\u0000", "    ");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder LIZJ = b1.LIZJ(replace, "[");
        LIZJ.append(C16880lQ.LJLLJ(wm7.getClass()));
        LIZJ.append("] ");
        sb2.append(X1D.LIZIZ(LIZJ));
        if (interfaceC36571c5 != null) {
            sb2.append(((InterfaceC78933UyP) interfaceC36571c5).getSceneDebugInfo(wm7));
        }
        if (wm7.getApplicationContext() != null && (view = wm7.mView) != null && view.getId() != -1) {
            String LIZIZ = LIZIZ(wm7.mView.getId(), wm7.requireApplicationContext());
            if (LIZIZ != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("viewId: ");
                LIZ.append(LIZIZ);
                LIZ.append(" ");
                sb2.append(X1D.LIZIZ(LIZ));
            }
        }
        sb2.append("\n");
        sb.append(sb2.toString());
        if (wm7 instanceof InterfaceC78933UyP) {
            int i2 = i + 1;
            List<WM7> sceneList = ((InterfaceC78933UyP) wm7).getSceneList();
            for (int i3 = 0; i3 < sceneList.size(); i3++) {
                LIZJ((WM7) ListProtector.get(sceneList, i3), sb, i2);
            }
        }
    }
}
