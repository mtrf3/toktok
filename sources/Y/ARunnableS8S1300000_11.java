package Y;

import X.C141335gf;
import X.C3C5;
import X.C66140PxY;
import X.HKE;
import X.OCR;
import X.OIP;
import X.PVC;
import X.QNO;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.helios.api.config.AnchorInfoModel;
import java.util.Map;

/* loaded from: classes12.dex */
public class ARunnableS8S1300000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask.LJ(r14, false, null, new java.lang.Exception("OAuth TokenResponse is null"), null, null, 26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S1300000_11.LIZ$0():void");
    }

    public final void LIZ$1() {
        View view;
        Dialog dialog;
        Window window;
        Fragment fragment = C66140PxY.LIZIZ;
        View view2 = null;
        if (fragment != null) {
            view = fragment.getView();
        } else {
            view = null;
        }
        DialogFragment dialogFragment = (DialogFragment) this.l2;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view == null || view2 == null) {
            return;
        }
        try {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            if (rect.isEmpty()) {
                return;
            }
            if (!HKE.LIZJ(rect, view2)) {
                return;
            }
            C66140PxY c66140PxY = (C66140PxY) this.l1;
            String str = this.s0;
            AnchorInfoModel anchorInfoModel = (AnchorInfoModel) this.l3;
            c66140PxY.LJII(str, anchorInfoModel, this.l2, anchorInfoModel.resourceIds);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void run$0(ARunnableS8S1300000_11 aRunnableS8S1300000_11) {
        boolean LIZ;
        try {
            aRunnableS8S1300000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S1300000_11 aRunnableS8S1300000_11) {
        boolean LIZ;
        try {
            aRunnableS8S1300000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S1300000_11 aRunnableS8S1300000_11) {
        boolean LIZ;
        try {
            String str = new String(OIP.LIZ.LIZ.LJIIZILJ.get(aRunnableS8S1300000_11.s0, (Map) aRunnableS8S1300000_11.l1), PVC.LIZ);
            QNO qno = (QNO) aRunnableS8S1300000_11.l3;
            OCR ocr = (OCR) aRunnableS8S1300000_11.l2;
            qno.getClass();
            QNO.LJ(ocr, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS8S1300000_11(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
