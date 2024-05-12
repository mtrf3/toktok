package X;

import Y.ARunnableS50S0100000_14;
import Y.IDLListenerS199S0100000_14;
import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.lynx.tasm.base.LLog;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public final class VPF {
    public final VNU LIZ;
    public IDLListenerS199S0100000_14 LIZIZ;
    public final float LIZJ;
    public boolean LIZLLL;
    public SYK LJ;
    public int LJFF;
    public int LJI;
    public final Rect LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final WeakHashMap<Object, ViewTreeObserver.OnGlobalLayoutListener> LJIIJ = new WeakHashMap<>();

    public final synchronized void LIZ() {
        if (this.LIZLLL) {
            LLog.LIZLLL(1, "Lynx", "KeyboardEvent already started");
            return;
        }
        if (!C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 190));
        } else {
            LIZIZ();
        }
    }

    public final synchronized void LIZJ() {
        if (!this.LIZLLL) {
            return;
        }
        if (!C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 191));
        } else {
            LIZLLL();
        }
    }

    public final void LIZIZ() {
        LLog.LIZLLL(1, "Lynx", "KeyboardEvent starting");
        Activity LJIIJJI = C78996UzQ.LJIIJJI(this.LIZ);
        if (LJIIJJI == null) {
            LLog.LIZLLL(4, "Lynx", "KeyboardEvent's context must be Activity");
            return;
        }
        if (this.LJ == null) {
            this.LJ = new SYK(LJIIJJI);
        }
        LJIIJJI.getWindowManager().getDefaultDisplay().getRealMetrics(new DisplayMetrics());
        IDLListenerS199S0100000_14 iDLListenerS199S0100000_14 = new IDLListenerS199S0100000_14(this, 5);
        this.LIZIZ = iDLListenerS199S0100000_14;
        this.LJ.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(iDLListenerS199S0100000_14);
        SYK syk = this.LJ;
        if (!syk.isShowing()) {
            try {
                if (!SYK.LIZIZ(syk.getContext()).isFinishing()) {
                    SYK.LIZ(syk);
                }
            } catch (WindowManager.BadTokenException e) {
                LLog.LIZLLL(3, SYK.LJLILLLLZI, e.toString());
            } catch (RuntimeException e2) {
                LLog.LIZLLL(3, SYK.LJLILLLLZI, e2.toString());
            }
        }
        this.LIZLLL = true;
    }

    public final void LIZLLL() {
        SYK syk;
        LLog.LIZLLL(1, "Lynx", "KeyboardEvent stopping");
        try {
            IDLListenerS199S0100000_14 iDLListenerS199S0100000_14 = this.LIZIZ;
            if (iDLListenerS199S0100000_14 != null && (syk = this.LJ) != null) {
                syk.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS199S0100000_14);
                SYK syk2 = this.LJ;
                if (syk2.isShowing()) {
                    try {
                        syk2.dismiss();
                    } catch (WindowManager.BadTokenException e) {
                        LLog.LIZLLL(3, SYK.LJLILLLLZI, e.toString());
                    } catch (RuntimeException e2) {
                        LLog.LIZLLL(3, SYK.LJLILLLLZI, e2.toString());
                    }
                }
            }
        } catch (Exception e3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop KeyboardEvent failed for ");
            LIZ.append(e3.toString());
            LLog.LIZLLL(3, "Lynx", X1D.LIZIZ(LIZ));
        }
        this.LIZLLL = false;
    }

    public VPF(VNU vnu) {
        LLog.LIZLLL(1, "Lynx", "KeyboardEvent initialized.");
        this.LIZ = vnu;
        this.LIZJ = vnu.LIZ().getResources().getDisplayMetrics().density;
        this.LJII = new Rect();
    }
}
