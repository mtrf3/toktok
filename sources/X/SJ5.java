package X;

import android.view.MotionEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJ5 implements SJ8<SJ7> {
    public SJ8<SJ5> LJLIL;
    public final SJ7 LJLILLLLZI;
    public final ArrayList<Integer> LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public int LJLLILLLL;

    public SJ5() {
        SJ7 sj7 = new SJ7();
        this.LJLILLLLZI = sj7;
        this.LJLJI = new ArrayList<>();
        this.LJLJJI = 1.0f;
        this.LJLLI = 1.0f;
        sj7.LJIIIZ = this;
    }

    @Override // X.SJ8
    public final void LIZ(SJ7 detector) {
        o.LJIIIZ(detector, "detector");
        SJ8<SJ5> sj8 = this.LJLIL;
        if (sj8 != null) {
            sj8.LIZ(this);
        }
        this.LJLJJI = 1.0f;
        this.LJLJJL = 0.0f;
        this.LJLJJLL = 0.0f;
        this.LJLJL = 0.0f;
        this.LJLJLJ = 0.0f;
        this.LJLJLLL = 0.0f;
        this.LJLL = 0.0f;
        this.LJLLI = 1.0f;
        this.LJLLILLLL = 0;
    }

    @Override // X.SJ8
    public final void LIZIZ(SJ7 sj7) {
        SJ7 detector = sj7;
        o.LJIIIZ(detector, "detector");
        if (this.LJLILLLLZI.LIZ == 1) {
            this.LJLJJI = 1.0f;
            this.LJLLI = 1.0f;
        } else {
            float[] fArr = detector.LIZLLL;
            float f = fArr[1] - fArr[0];
            float[] fArr2 = detector.LJ;
            float f2 = fArr2[1] - fArr2[0];
            float[] fArr3 = detector.LJFF;
            float f3 = fArr3[1] - fArr3[0];
            float[] fArr4 = detector.LJI;
            float f4 = fArr4[1] - fArr4[0];
            float hypot = (float) Math.hypot(f, f2);
            float hypot2 = (float) Math.hypot(f3, f4);
            float f5 = this.LJLJJI;
            float f6 = hypot2 / hypot;
            this.LJLJJI = f6;
            this.LJLLI = f6 / f5;
            this.LJLJL = LIZJ(detector.LIZ, detector.LJFF);
            this.LJLJLJ = LIZJ(detector.LIZ, detector.LJI);
        }
        float LIZJ = LIZJ(detector.LIZ, detector.LJFF) - LIZJ(detector.LIZ, detector.LJII);
        this.LJLJLLL = LIZJ;
        this.LJLJJL += LIZJ;
        float LIZJ2 = LIZJ(detector.LIZ, detector.LJI) - LIZJ(detector.LIZ, detector.LJIIIIZZ);
        this.LJLL = LIZJ2;
        this.LJLJJLL += LIZJ2;
        if (this.LJLILLLLZI.LIZ == 1) {
            if (this.LJLLILLLL == 0) {
                if (Math.abs(this.LJLJJL) - Math.abs(this.LJLJJLL) >= 0.0f) {
                    if (this.LJLJJL < -10.0f && !this.LJLJI.contains(1)) {
                        this.LJLLILLLL = 1;
                    }
                    if (this.LJLJJL > 10.0f && !this.LJLJI.contains(3)) {
                        this.LJLLILLLL = 3;
                    }
                } else {
                    if (this.LJLJJLL < -10.0f && !this.LJLJI.contains(2)) {
                        this.LJLLILLLL = 2;
                    }
                    if (this.LJLJJLL > 10.0f && !this.LJLJI.contains(4)) {
                        this.LJLLILLLL = 4;
                    }
                }
            }
        } else {
            this.LJLLILLLL = -1;
        }
        SJ8<SJ5> sj8 = this.LJLIL;
        if (sj8 != null) {
            sj8.LIZIZ(this);
        }
    }

    public final boolean LIZLLL(MotionEvent event) {
        o.LJIIIZ(event, "event");
        SJ7 sj7 = this.LJLILLLLZI;
        sj7.getClass();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                sj7.LIZIZ(event);
                                if (sj7.LIZ == 0) {
                                    sj7.LIZ();
                                } else {
                                    SJ5 sj5 = sj7.LJIIIZ;
                                    if (sj5 != null) {
                                        sj5.LIZIZ(sj7);
                                    }
                                }
                            }
                        } else {
                            sj7.LIZIZ(event);
                            SJ5 sj52 = sj7.LJIIIZ;
                            if (sj52 != null) {
                                sj52.LIZIZ(sj7);
                            }
                        }
                    } else {
                        sj7.LIZ();
                    }
                } else {
                    sj7.LIZIZ = sj7.LIZ;
                    int i = 0;
                    do {
                        int findPointerIndex = event.findPointerIndex(sj7.LIZJ[i]);
                        if (findPointerIndex != -1) {
                            float[] fArr = sj7.LJII;
                            float[] fArr2 = sj7.LJFF;
                            fArr[i] = fArr2[i];
                            sj7.LJIIIIZZ[i] = sj7.LJI[i];
                            fArr2[i] = event.getX(findPointerIndex);
                            sj7.LJI[i] = event.getY(findPointerIndex);
                        }
                        i++;
                    } while (i < 2);
                    SJ5 sj53 = sj7.LJIIIZ;
                    if (sj53 != null) {
                        sj53.LIZIZ(sj7);
                    }
                }
            } else {
                sj7.LIZIZ(event);
                if (sj7.LIZ == 0) {
                    sj7.LIZ();
                } else {
                    SJ5 sj54 = sj7.LJIIIZ;
                    if (sj54 != null) {
                        sj54.LIZIZ(sj7);
                    }
                }
            }
        } else {
            SJ5 sj55 = sj7.LJIIIZ;
            if (sj55 != null) {
                sj55.LJ(sj7);
            }
            sj7.LIZIZ(event);
        }
        return true;
    }

    @Override // X.SJ8
    public final void LJ(SJ7 detector) {
        o.LJIIIZ(detector, "detector");
        SJ8<SJ5> sj8 = this.LJLIL;
        if (sj8 != null) {
            sj8.LJ(this);
        }
    }

    public static float LIZJ(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i <= 0) {
            return 0.0f;
        }
        return f / i;
    }
}
