package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASQ {
    public static void LIZIZ(View view) {
        ASX reason = ASX.LIZ;
        o.LJIIIZ(reason, "reason");
        DialogFragment dialogFragment = (DialogFragment) view.getTag(R.id.c2m);
        if (dialogFragment == null) {
            return;
        }
        Dialog dialog = dialogFragment.getDialog();
        LJIIJJI(dialog, reason);
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
        dialogFragment.dismissAllowingStateLoss();
    }

    public static /* synthetic */ void LJFF(View view) {
        LIZLLL(view, ASX.LIZ);
    }

    public static /* synthetic */ void LJI(Fragment fragment) {
        LJ(fragment, ASX.LIZ);
    }

    public static AST LJIIIIZZ(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        if (dialog instanceof ASP) {
            return ((ASP) dialog).LJLLI;
        }
        return ASX.LIZ;
    }

    public static TuxSheet LJIIIZ(Fragment fragment) {
        TuxSheet tuxSheet = (TuxSheet) fragment.getParentFragment();
        if (tuxSheet != null && tuxSheet.isAdded()) {
            return tuxSheet;
        }
        return null;
    }

    public static void LJIIJ(Fragment contentFragment) {
        o.LJIIIZ(contentFragment, "contentFragment");
        TuxSheet LJIIIZ = LJIIIZ(contentFragment);
        if (LJIIIZ != null) {
            LJIIIZ.xl();
        }
    }

    public static void LIZ(Fragment contentFragment, AST reason) {
        o.LJIIIZ(contentFragment, "contentFragment");
        o.LJIIIZ(reason, "reason");
        TuxSheet LJIIIZ = LJIIIZ(contentFragment);
        if (LJIIIZ == null) {
            return;
        }
        Dialog dialog = LJIIIZ.getDialog();
        LJIIJJI(LJIIIZ.getDialog(), reason);
        if (dialog != null) {
            LJIIIZ.onCancel(dialog);
        }
        LJIIIZ.dismissAllowingStateLoss();
    }

    public static void LIZLLL(View content, AST reason) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(reason, "reason");
        DialogFragment dialogFragment = (DialogFragment) content.getTag(R.id.c2m);
        if (dialogFragment == null) {
            return;
        }
        Dialog dialog = dialogFragment.getDialog();
        if (dialog instanceof ASP) {
            ASP asp = (ASP) dialog;
            asp.getClass();
            asp.LJLLI = reason;
        }
        dialogFragment.dismissAllowingStateLoss();
    }

    public static void LJ(Fragment contentFragment, AST reason) {
        Dialog dialog;
        o.LJIIIZ(contentFragment, "contentFragment");
        o.LJIIIZ(reason, "reason");
        TuxSheet LJIIIZ = LJIIIZ(contentFragment);
        if (LJIIIZ != null) {
            dialog = LJIIIZ.getDialog();
        } else {
            dialog = null;
        }
        if (dialog instanceof ASP) {
            ASP asp = (ASP) dialog;
            asp.getClass();
            asp.LJLLI = reason;
        }
        if (LJIIIZ != null) {
            LJIIIZ.dismissAllowingStateLoss();
        }
    }

    public static void LJII(Fragment fragment, boolean z) {
        C26255ASd c26255ASd;
        BottomSheetBehavior<?> behavior;
        int i;
        TuxSheet LJIIIZ = LJIIIZ(fragment);
        if (LJIIIZ == null || (c26255ASd = LJIIIZ.LLFFF) == null || (behavior = c26255ASd.getBehavior()) == null) {
            return;
        }
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        behavior.setState(i);
    }

    public static void LJIIJJI(Dialog dialog, AST ast) {
        if (dialog instanceof ASP) {
            ASP asp = (ASP) dialog;
            asp.getClass();
            o.LJIIIZ(ast, "<set-?>");
            asp.LJLL = ast;
            asp.LJLLI = ast;
        }
    }

    public static void LJIIL(Fragment contentFragment, boolean z) {
        C26255ASd c26255ASd;
        o.LJIIIZ(contentFragment, "contentFragment");
        TuxSheet LJIIIZ = LJIIIZ(contentFragment);
        if (LJIIIZ != null && (c26255ASd = LJIIIZ.LLFFF) != null) {
            c26255ASd.setHideable$tux_theme_release(z);
        }
    }

    public static void LJIILIIL(Fragment curFragment, Fragment fragment, boolean z) {
        o.LJIIIZ(curFragment, "curFragment");
        TuxSheet LJIIIZ = LJIIIZ(curFragment);
        if (LJIIIZ != null) {
            LJIIIZ.Al(fragment, z);
        }
    }
}
