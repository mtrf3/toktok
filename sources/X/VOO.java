package X;

import Y.ARunnableS50S0100000_14;
import Y.IDLListenerS199S0100000_14;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public abstract class VOO {
    public WeakReference<UIBody> LIZ;
    public IDLListenerS199S0100000_14 LIZIZ;
    public VOP LIZJ;
    public VOQ LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public Handler LJIIIIZZ;
    public ARunnableS50S0100000_14 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIILIIL;
    public final String LJIILJJIL;
    public long LJII = 50;
    public final int[] LJIIJJI = new int[2];
    public boolean LJIIL = true;

    public final void LIZJ() {
        this.LJFF = false;
        VNS LJ = LJ();
        if (LJ == null) {
            LLog.LIZLLL(4, this.LJIILJJIL, "LynxObserver getViewTreeObserver failed since rootView is null");
        } else {
            ViewTreeObserver viewTreeObserver = LJ.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.LIZIZ);
                viewTreeObserver.removeOnScrollChangedListener(this.LIZJ);
                viewTreeObserver.removeOnDrawListener(this.LIZLLL);
                return;
            }
        }
        LLog.LIZLLL(4, this.LJIILJJIL, "LynxObserverManager remove listeners failed since observer is null");
    }

    public abstract void LJII();

    public final void LIZIZ() {
        VNU vnu;
        UIBody uIBody = this.LIZ.get();
        if (uIBody != null) {
            vnu = uIBody.mContext;
        } else {
            vnu = null;
        }
        if (vnu != null) {
            int i = vnu.LLIIJLIL;
            if (i <= 0) {
                i = 1;
            }
            this.LJII = Math.max(16, 1000 / i);
            this.LJIIL = vnu.LLIIII;
            this.LJIILIIL = vnu.LLIIIILZ;
        }
        this.LJFF = true;
        LJIIIIZZ();
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new ARunnableS50S0100000_14(this, 199);
        }
        this.LJIIIIZZ.postDelayed(this.LJIIIZ, this.LJII);
    }

    public final VNS LJ() {
        UIBody uIBody = this.LIZ.get();
        if (uIBody == null) {
            LLog.LIZLLL(4, this.LJIILJJIL, "LynxObserver getRootView failed since rootUI is null");
            return null;
        }
        return (VNS) uIBody.LJLIL;
    }

    public final void LJI() {
        if (!this.LJ) {
            LLog.LIZLLL(4, this.LJIILJJIL, "Lynx observerHandler failed since rootView not draw");
        } else if (this.LJIIJ) {
            LLog.LIZLLL(3, this.LJIILJJIL, "Lynx observerHandler failed since inner function is delayed");
        } else {
            C79411VEp.LJ(new ARunnableS50S0100000_14(this, 198));
        }
    }

    public final void LJIIIIZZ() {
        VNS LJ = LJ();
        if (LJ == null) {
            LLog.LIZLLL(4, this.LJIILJJIL, "LynxObserver getViewTreeObserver failed since rootView is null");
        } else {
            ViewTreeObserver viewTreeObserver = LJ.getViewTreeObserver();
            if (viewTreeObserver != null) {
                IDLListenerS199S0100000_14 iDLListenerS199S0100000_14 = new IDLListenerS199S0100000_14(this, 6);
                this.LIZIZ = iDLListenerS199S0100000_14;
                this.LIZJ = new VOP(this);
                this.LIZLLL = new VOQ(this);
                viewTreeObserver.addOnGlobalLayoutListener(iDLListenerS199S0100000_14);
                viewTreeObserver.addOnScrollChangedListener(this.LIZJ);
                viewTreeObserver.addOnDrawListener(this.LIZLLL);
                return;
            }
        }
        LLog.LIZLLL(4, this.LJIILJJIL, "LynxObserverManager add listeners failed since observer is null");
    }

    public VOO(String str) {
        this.LJIILJJIL = str;
    }

    public final Rect LIZLLL(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI == null) {
            LLog.LIZLLL(4, this.LJIILJJIL, "LynxObserverManager getBoundsOnScreenOfLynxBaseUI failed since ui is null");
            return rect;
        }
        if (lynxBaseUI instanceof LynxUI) {
            ((LynxUI) lynxBaseUI).mView.getLocationOnScreen(this.LJIIJJI);
            int[] iArr = this.LJIIJJI;
            rect.offset(iArr[0], iArr[1]);
            int i = rect.left;
            rect.set(i, rect.top, lynxBaseUI.getWidth() + i, lynxBaseUI.getHeight() + rect.top);
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
            while (true) {
                if (parentBaseUI != null) {
                    if (!(parentBaseUI instanceof LynxUI)) {
                        parentBaseUI = parentBaseUI.getParentBaseUI();
                    } else {
                        T t = ((LynxUI) parentBaseUI).mView;
                        t.getLocationOnScreen(this.LJIIJJI);
                        int[] iArr2 = this.LJIIJJI;
                        rect.offset(iArr2[0], iArr2[1]);
                        rect.offset(-t.getScrollX(), -t.getScrollY());
                        rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                        int i2 = rect.left;
                        rect.set(i2, rect.top, lynxBaseUI.getWidth() + i2, lynxBaseUI.getHeight() + rect.top);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return rect;
    }

    public final Rect LJFF(VNU vnu) {
        DisplayMetrics LIZJ;
        if (vnu == null || (LIZJ = DisplayMetricsHolder.LIZ(vnu)) == null || (LIZJ.widthPixels == 0 && LIZJ.heightPixels == 0)) {
            LLog.LIZLLL(3, this.LJIILJJIL, "getWindowRect getRealScreenDisplayMetrics failed, use getWindowDisplayMetrics instead");
            LIZJ = DisplayMetricsHolder.LIZJ();
            if (LIZJ == null) {
                LLog.LIZLLL(4, this.LJIILJJIL, "getWindowRect func failed since DisplayMetrics is null");
                return new Rect();
            }
        }
        return new Rect(0, 0, LIZJ.widthPixels, LIZJ.heightPixels);
    }
}
