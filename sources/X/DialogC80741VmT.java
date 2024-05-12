package X;

import Y.ARunnableS17S0201000_14;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: X.VmT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC80741VmT extends C18Z {
    public final SideSheetBehavior<View> LJLJI;

    @Override // android.app.Dialog
    public final void onStart() {
        View view;
        super.onStart();
        SideSheetBehavior<View> sideSheetBehavior = this.LJLJI;
        if (sideSheetBehavior.LIZJ == 5) {
            WeakReference<View> weakReference = sideSheetBehavior.LIZLLL;
            if (weakReference == null || (view = weakReference.get()) == null) {
                sideSheetBehavior.setStateInternal(3);
                return;
            }
            ARunnableS17S0201000_14 aRunnableS17S0201000_14 = new ARunnableS17S0201000_14(view, sideSheetBehavior, 1);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && C16330kX.LIZIZ(view)) {
                view.post(aRunnableS17S0201000_14);
            } else {
                aRunnableS17S0201000_14.run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
    
        if (X.C26338AVi.LIZJ(r0) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC80741VmT(android.content.Context r9, boolean r10, boolean r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC80741VmT.<init>(android.content.Context, boolean, boolean, int, boolean):void");
    }
}
