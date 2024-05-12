package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.HandlerThread;
import com.ss.android.ugc.aweme.ml.har.SmartHARServiceImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public final class J4K {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public J4O LIZLLL;
    public C35718E0c LJ;
    public Handler LJIIIZ;
    public HandlerThread LJIIJ;
    public Handler LJIIJJI;
    public J4L LJIIL;
    public final ArrayList<J4Y> LJFF = new ArrayList<>();
    public C47400Iiy LJI = null;
    public final ReentrantReadWriteLock LJII = new ReentrantReadWriteLock();
    public final LinkedList<C47400Iiy> LJIIIIZZ = new LinkedList<>();
    public boolean LJIILIIL = false;
    public int LJIILJJIL = -999;
    public int LJIILL = -999;
    public boolean LJIILLIIL = false;
    public J4R LJIIZILJ = null;
    public final ARunnableS44S0100000_8 LJIJ = new ARunnableS44S0100000_8(this, 196);
    public final J4W LJIJI = new J4W(this);

    public final boolean LIZIZ() {
        if (this.LJIILIIL && this.LJIILJJIL == 0) {
            return true;
        }
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService not canPredict!!!! hasInit:");
            LIZ.append(this.LJIILIIL);
            LIZ.append(" lastInitErrCode:");
            LIZ.append(this.LJIILJJIL);
            X1D.LIZIZ(LIZ);
            return false;
        }
        return false;
    }

    public final void LIZJ() {
        C35718E0c c35718E0c;
        Handler handler = this.LJIIJJI;
        if (handler != null && (c35718E0c = this.LJ) != null && c35718E0c.LIZ > 0) {
            handler.removeCallbacks(this.LJIJ);
            this.LJIIJJI.postDelayed(this.LJIJ, this.LJ.LIZ);
            if (J6U.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("HARService.checkAndPutContinuousPredictMsg continuousPredictIntervalMs:");
                LIZ.append(this.LJ.LIZ);
                X1D.LIZIZ(LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J4K.LIZLLL():boolean");
    }

    public final void LJ() {
        J4L j4l = this.LJIIL;
        if (j4l != null) {
            j4l.getClass();
            j4l.LJLLL = false;
            j4l.LJI();
        }
        Handler handler = this.LJIIJJI;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.LJIIIZ;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final java.util.Map<String, Float> LJFF() {
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.getLastResult result:");
            LIZ.append(this.LJI);
            X1D.LIZIZ(LIZ);
        }
        C47400Iiy c47400Iiy = this.LJI;
        if (c47400Iiy != null) {
            return c47400Iiy.LIZLLL;
        }
        return null;
    }

    public final boolean LJIIIZ() {
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.startOncePredictingWithSensorKeepRegister hasInit:");
            LIZ.append(this.LJIILIIL);
            LIZ.append(" predicting:");
            LIZ.append(this.LIZ);
            LIZ.append(" oncePredicting:");
            LIZ.append(this.LIZJ);
            LIZ.append(" lastIsOncePredictingWithSensorKeepRegister:");
            LIZ.append(this.LIZIZ);
            X1D.LIZIZ(LIZ);
        }
        if (this.LIZ && !this.LIZIZ) {
            return true;
        }
        boolean LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ) {
            this.LIZIZ = true;
            J4L j4l = this.LJIIL;
            if (j4l != null) {
                j4l.LJ(true);
            }
        }
        return LJIIIIZZ;
    }

    public final boolean LJIIJ() {
        C35718E0c c35718E0c = this.LJ;
        if (c35718E0c != null && c35718E0c.LIZIZ) {
            return LJIIIZ();
        }
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.startOncePredictingWithSensorUnRegister hasInit:");
            LIZ.append(this.LJIILIIL);
            LIZ.append(" predicting:");
            LIZ.append(this.LIZ);
            LIZ.append(" oncePredicting:");
            LIZ.append(this.LIZJ);
            X1D.LIZIZ(LIZ);
        }
        if (!LIZIZ()) {
            return false;
        }
        if (!this.LIZJ) {
            if (this.LIZ) {
                this.LIZJ = true;
            } else if (LIZLLL()) {
                this.LIZJ = true;
            }
        }
        return this.LIZJ;
    }

    public final boolean LJIIJJI() {
        C35718E0c c35718E0c = this.LJ;
        if (c35718E0c != null && c35718E0c.LIZ > 0) {
            if (J6U.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("HARService.startPredicting continuousPredictIntervalMs:");
                LIZ.append(this.LJ.LIZ);
                X1D.LIZIZ(LIZ);
            }
            return LJIIIZ();
        }
        if (J6U.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("HARService.startPredicting hasInit:");
            LIZ2.append(this.LJIILIIL);
            LIZ2.append(" predicting:");
            LIZ2.append(this.LIZ);
            X1D.LIZIZ(LIZ2);
        }
        boolean LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ) {
            this.LIZIZ = false;
            J4L j4l = this.LJIIL;
            if (j4l != null) {
                j4l.LJ(false);
            }
        }
        return LJIIIIZZ;
    }

    public final void LJIIL() {
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.stopPredicting hasInit:");
            LIZ.append(this.LJIILIIL);
            LIZ.append(" predicting:");
            LIZ.append(this.LIZ);
            LIZ.append(" oncePredicting:");
            LIZ.append(this.LIZJ);
            X1D.LIZIZ(LIZ);
        }
        if (this.LIZ || this.LIZJ) {
            this.LIZ = false;
            this.LIZJ = false;
            LJ();
        }
    }

    public final boolean LJIIIIZZ() {
        if (!LIZIZ()) {
            return false;
        }
        if (!this.LIZ) {
            if (this.LIZJ) {
                this.LIZ = true;
            } else if (LIZLLL()) {
                this.LIZ = true;
            }
        }
        return this.LIZ;
    }

    public final void LIZ(SmartHARServiceImpl smartHARServiceImpl) {
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService addPredictListener listener:");
            LIZ.append(smartHARServiceImpl);
            X1D.LIZIZ(LIZ);
        }
        if (smartHARServiceImpl != null) {
            synchronized (this.LJFF) {
                if (!this.LJFF.contains(smartHARServiceImpl)) {
                    this.LJFF.add(smartHARServiceImpl);
                }
            }
        }
    }

    public final List<C47400Iiy> LJI(int i, boolean z) {
        ArrayList arrayList;
        C47400Iiy c47400Iiy;
        if ((z && this.LJI != null) || !this.LJIIIIZZ.isEmpty()) {
            arrayList = new ArrayList();
            if (z && (c47400Iiy = this.LJI) != null) {
                arrayList.add(c47400Iiy);
                i--;
            }
            if (!this.LJIIIIZZ.isEmpty()) {
                this.LJII.readLock().lock();
                try {
                    int min = Math.min(i, this.LJIIIIZZ.size());
                    for (int i2 = 0; i2 < min; i2++) {
                        arrayList.add(this.LJIIIIZZ.get(i2));
                    }
                } finally {
                    this.LJII.readLock().unlock();
                }
            }
        } else {
            arrayList = null;
        }
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.getRangeHistoryHarStatus outList:");
            LIZ.append(arrayList);
            X1D.LIZIZ(LIZ);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.util.Map r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J4K.LJII(java.util.Map, int, boolean):void");
    }
}
