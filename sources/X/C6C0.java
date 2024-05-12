package X;

import Y.ARunnableS9S0101000_5;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6C0, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6C0 extends WXC {
    public final /* synthetic */ C6BL LIZ;

    public C6C0(C6BL c6bl) {
        this.LIZ = c6bl;
    }

    @Override // X.C6P6, X.C6V2
    public boolean LJJIIZI(MotionEvent motionEvent) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                boolean z = c156426By.LJLLI;
                boolean z2 = c156426By.LJLLJ;
                boolean z3 = c156426By.LJLLILLLL;
                if (c156426By.LJIIJJI(motionEvent)) {
                    StickerHintTextViewModel stickerHintTextViewModel = this.LIZ.LL;
                    if (stickerHintTextViewModel != null) {
                        stickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
                    }
                    C6CA c6ca = this.LIZ.LLFFF;
                    if (c6ca != null) {
                        if (z) {
                            c6ca.LIZIZ();
                        }
                        if (z3) {
                            this.LIZ.LLFFF.LIZ();
                        }
                        if (z2) {
                            this.LIZ.LLFFF.LIZJ();
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            }
        }
        AnonymousClass655 anonymousClass655 = this.LIZ.LJLJJI;
        if (anonymousClass655 != null) {
            anonymousClass655.hide();
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJIZ(float f) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                if (!(!(c156426By instanceof C156436Bz)) || !c156426By.LJLLILLLL) {
                    if (c156426By.LJZL) {
                    }
                } else {
                    c156426By.LJIJI((float) Math.toDegrees(f), Boolean.TRUE);
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJLI(C82537WaL c82537WaL) {
        C6BR c6br;
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                if (!c156426By.LJII() || !c156426By.LJI()) {
                    if (c156426By.LJZL) {
                    }
                } else if (Math.abs(c82537WaL.LJIIIZ.y) + Math.abs(c82537WaL.LJIIIZ.x) >= 1.0f) {
                    if (c156426By.LJLJJLL.LJLLJ) {
                        c156426By.LLI = true;
                    }
                    c156426By.LLFZ = (int) (Math.abs(c82537WaL.LJIIIZ.y) + Math.abs(c82537WaL.LJIIIZ.x));
                    PointF pointF = c82537WaL.LJIIIZ;
                    c156426By.LJIL(pointF.x, pointF.y, Boolean.TRUE);
                    c156426By.LJIIIZ(c156426By.LJLJL.getX() + (c156426By.LJLJL.getWidth() / 2), c156426By.LJLJL.getY() + (c156426By.LJLJL.getHeight() / 2));
                    c156426By.LJLLL.x += c156426By.LJLJJI;
                    if (c156426By.LJI() && (c6br = c156426By.LJLL) != null) {
                        ((C6BM) c6br).LIZJ(c156426By, false);
                    }
                    if (!c156426By.LJZ) {
                        c156426By.LJZ = c156426By.LJLJJLL.LJLLJ;
                    }
                    c156426By.LJFF(false);
                }
                StickerHintTextViewModel stickerHintTextViewModel = this.LIZ.LL;
                if (stickerHintTextViewModel != null) {
                    stickerHintTextViewModel.gv0().postValue(Boolean.TRUE);
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                if (!(c156426By instanceof C156436Bz)) {
                    c156426By.LJIIIZ(c82536WaK.LJIILIIL, c82536WaK.LJIILJJIL);
                    C6C1 c6c1 = c156426By.LJLJJLL;
                    PointF pointF = c156426By.LJLLL;
                    boolean LJIILL = C77119UOl.LJIILL(pointF.x, pointF.y, c6c1.LJLILLLLZI, c6c1.LJLLI);
                    c156426By.LJLLILLLL = LJIILL;
                    if (LJIILL) {
                        return true;
                    }
                }
                if (c156426By.LJZL) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public boolean onDown(MotionEvent motionEvent) {
        C6BL c6bl = this.LIZ;
        c6bl.LLD = false;
        c6bl.LLFZ = false;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null && c156426By.LJIIJ(motionEvent)) {
                C6BL c6bl2 = this.LIZ;
                c6bl2.LJLL = c156426By;
                if (c6bl2.LJIJJLI()) {
                    C6BL c6bl3 = this.LIZ;
                    c6bl3.LJLL.post(new ARunnableS9S0101000_5(4, c6bl3, 21));
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                if (!(!(c156426By instanceof C156436Bz)) || !c156426By.LJLLJ) {
                    if (c156426By.LJZL) {
                    }
                } else {
                    c156426By.LJIJJ(scaleGestureDetector.getScaleFactor());
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z;
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                if (!(c156426By instanceof C156436Bz)) {
                    long currentTimeMillis = System.currentTimeMillis() - c156426By.LLFII;
                    if (currentTimeMillis < 300) {
                        c156426By.LLFII = System.currentTimeMillis();
                    }
                    c156426By.LJIIIZ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    C6C1 c6c1 = c156426By.LJLJJLL;
                    PointF pointF = c156426By.LJLLL;
                    if (C77119UOl.LJIILL(pointF.x, pointF.y, c6c1.LJLILLLLZI, c6c1.LJLLI) && currentTimeMillis > 300) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c156426By.LJLLJ = z;
                    if (z) {
                        return true;
                    }
                }
                if (c156426By.LJZL) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null) {
                boolean z = c156426By.LJLJJLL.LJLLJ;
                if (z && c156426By.LLIFFJFJJ) {
                    c156426By.LJFF(false);
                }
                c156426By.LLIFFJFJJ = false;
                c156426By.LJZL = false;
                if (z || c156426By.LLII) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null && (c156426By.LJI() || c156426By.LJZL)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null && (c156426By.LJLLI || System.currentTimeMillis() - c156426By.LLFII < 300)) {
                return true;
            }
        }
        C6BL c6bl2 = this.LIZ;
        if (!c6bl2.LLD) {
            return false;
        }
        c6bl2.LLD = false;
        return true;
    }

    @Override // X.C6P6, X.C6V2
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6BL c6bl = this.LIZ;
        if (!c6bl.LJLILLLLZI) {
            return false;
        }
        Iterator it = ((ArrayList) c6bl.LJLLI).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            if (c156426By != null && (c156426By.LJLLI || System.currentTimeMillis() - c156426By.LLFII < 300)) {
                return true;
            }
        }
        return false;
    }
}
