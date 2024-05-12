package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvr */
/* loaded from: classes11.dex */
public final class C60939Nvr {
    /* JADX WARN: Code restructure failed: missing block: B:88:0x006a, code lost:
    
        if (r5 != null) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #1 {all -> 0x00ea, blocks: (B:38:0x005d, B:41:0x006c, B:42:0x006f, B:44:0x0076, B:45:0x0079, B:87:0x0066), top: B:86:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[Catch: all -> 0x00ea, TryCatch #1 {all -> 0x00ea, blocks: (B:38:0x005d, B:41:0x006c, B:42:0x006f, B:44:0x0076, B:45:0x0079, B:87:0x0066), top: B:86:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:48:0x0094, B:50:0x00a5, B:52:0x00bd, B:54:0x00c7, B:56:0x00cb, B:58:0x00d2, B:59:0x00e1, B:62:0x00d7, B:63:0x00db, B:64:0x00e2, B:74:0x0081, B:76:0x0089, B:78:0x008f, B:79:0x00ae), top: B:73:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:48:0x0094, B:50:0x00a5, B:52:0x00bd, B:54:0x00c7, B:56:0x00cb, B:58:0x00d2, B:59:0x00e1, B:62:0x00d7, B:63:0x00db, B:64:0x00e2, B:74:0x0081, B:76:0x0089, B:78:0x008f, B:79:0x00ae), top: B:73:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[Catch: all -> 0x00e8, TryCatch #0 {all -> 0x00e8, blocks: (B:48:0x0094, B:50:0x00a5, B:52:0x00bd, B:54:0x00c7, B:56:0x00cb, B:58:0x00d2, B:59:0x00e1, B:62:0x00d7, B:63:0x00db, B:64:0x00e2, B:74:0x0081, B:76:0x0089, B:78:0x008f, B:79:0x00ae), top: B:73:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.view.Window r8, android.view.View r9, com.bytedance.hybrid.spark.page.SparkPopup r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60939Nvr.LIZ(android.view.Window, android.view.View, com.bytedance.hybrid.spark.page.SparkPopup):int");
    }

    public static boolean LIZLLL(View view, Window window, View view2) {
        int i;
        boolean z;
        ViewParent viewParent;
        boolean z2;
        WindowManager.LayoutParams attributes;
        if (view == null) {
            return false;
        }
        if (window != null && (attributes = window.getAttributes()) != null) {
            i = attributes.flags;
        } else {
            i = 0;
        }
        if ((view.getWindowSystemUiVisibility() & 512) != 0 && (134217728 & i) == 0 && (Integer.MIN_VALUE & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (view2 != null) {
            viewParent = view2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            obj = viewParent;
        }
        View view3 = (View) obj;
        if (view3 == null || view3.getPaddingBottom() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(Window window, SparkPopupSchemaParam params, SparkPopup sparkPopup, boolean z) {
        View view;
        Context context;
        int LIZ;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        o.LJIIJ(params, "params");
        o.LJIIJ(sparkPopup, "sparkPopup");
        Window Jl = sparkPopup.Jl();
        Context context2 = null;
        if (Jl != null) {
            view = Jl.getDecorView();
            context = Jl.getContext();
        } else {
            view = null;
            context = null;
        }
        int realHeight = params.getRealHeight(context);
        if (!z && (bottomSheetBehavior = sparkPopup.LJLLL) != null && bottomSheetBehavior.LJJIIJ == 3 && params.getDragHeight() > 0) {
            realHeight = params.getDragHeight();
        }
        if (realHeight > 0) {
            if (Jl != null) {
                if (sparkPopup.Il(null) <= 0 ? realHeight <= (LIZ = LIZ(Jl, sparkPopup.getView(), sparkPopup)) : realHeight <= (LIZ = LIZ(Jl, sparkPopup.getView(), sparkPopup) - sparkPopup.Il(null))) {
                    LIZ = realHeight;
                }
                LIZLLL(view, window, sparkPopup.getView());
                C16800lI c16800lI = sparkPopup.LLIFFJFJJ;
                if (c16800lI != null) {
                    c16800lI.LJII(8);
                    return LIZ;
                }
                return LIZ;
            }
        } else if (realHeight == 0) {
            if (Jl != null) {
                context2 = Jl.getContext();
            }
            if (!o.LJ(params.getRealGravity(context2), "center") || Jl == null) {
                return -1;
            }
            Context context3 = Jl.getContext();
            o.LJFF(context3, "w.context");
            return J7A.LIZ(400.0d, context3);
        }
        return realHeight;
    }

    public static /* synthetic */ int LIZJ(C60939Nvr c60939Nvr, Window window, SparkPopupSchemaParam sparkPopupSchemaParam, SparkPopup sparkPopup) {
        c60939Nvr.getClass();
        return LIZIZ(window, sparkPopupSchemaParam, sparkPopup, false);
    }
}
