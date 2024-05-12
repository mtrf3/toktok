package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.3ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97343ru {
    public static final Context LIZ = EF7.LIZIZ();

    public static final Boolean LIZ(View view) {
        if (C6ZT.LIZ(view)) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final int LIZLLL(int i) {
        Integer LJI;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && (LJI = C79045V0n.LJI(i, topActivity)) != null) {
            return LJI.intValue();
        }
        return 0;
    }

    public static final int LJ(int i) {
        try {
            return EF7.LIZIZ().getResources().getDimensionPixelSize(i);
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    public static final String LJFF(int i) {
        String string = LIZ.getString(i);
        o.LJIIIIZZ(string, "appContext.getString(resId)");
        return string;
    }

    public static final void LIZIZ(View view, InterfaceC88472Yns<? super ViewGroup.MarginLayoutParams, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                block.invoke(layoutParams);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static final String LJI(int i, Object... objArr) {
        try {
            String string = LIZ.getString(i, Arrays.copyOf(objArr, objArr.length));
            o.LJIIIIZZ(string, "{\n    appContext.getString(resId, *formatArgs)\n}");
            return string;
        } catch (Resources.NotFoundException unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get string fail: ");
            LIZ2.append(i);
            QCU.LJFF(X1D.LIZIZ(LIZ2), null, 6);
            return "";
        }
    }

    public static void LIZJ(View view, Integer num, Integer num2, int i) {
        int paddingTop;
        int paddingBottom;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if (view != null) {
            int paddingStart = view.getPaddingStart();
            if (num != null) {
                paddingTop = num.intValue();
            } else {
                paddingTop = view.getPaddingTop();
            }
            int paddingEnd = view.getPaddingEnd();
            if (num2 != null) {
                paddingBottom = num2.intValue();
            } else {
                paddingBottom = view.getPaddingBottom();
            }
            view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
        }
    }
}
