package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes6.dex */
public final class BP9 extends OrientationEventListener {
    public final /* synthetic */ BP8 LIZ;

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        BPA bpa;
        if (i == -1) {
            return;
        }
        int i2 = BPB.LIZ[this.LIZ.LJI.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                BP8 bp8 = this.LIZ;
                bp8.getClass();
                if (i < 0) {
                    return;
                }
                if (i >= 21) {
                    if (340 <= i) {
                        if (i >= 360) {
                            return;
                        }
                    } else {
                        if (60 > i) {
                            return;
                        }
                        if (i < 121) {
                            if (bp8.LIZLLL.get() == -1) {
                                bp8.LIZLLL.set(8);
                            }
                            if (bp8.LIZIZ == 8) {
                                if (System.currentTimeMillis() - bp8.LIZJ <= 500) {
                                    return;
                                }
                                bp8.LIZ(8);
                                return;
                            } else {
                                bp8.LIZJ = System.currentTimeMillis();
                                bp8.LIZIZ = 8;
                                return;
                            }
                        }
                        if (240 > i || i >= 301) {
                            return;
                        }
                        if (bp8.LIZLLL.get() == -1) {
                            bp8.LIZLLL.set(0);
                        }
                        if (bp8.LIZIZ == 0) {
                            if (System.currentTimeMillis() - bp8.LIZJ <= 500) {
                                return;
                            }
                            bp8.LIZ(0);
                            return;
                        } else {
                            bp8.LIZJ = System.currentTimeMillis();
                            bp8.LIZIZ = 0;
                            return;
                        }
                    }
                }
                if (bp8.LIZLLL.get() == -1) {
                    bp8.LIZLLL.set(1);
                }
                if (bp8.LIZIZ == 1) {
                    if (System.currentTimeMillis() - bp8.LIZJ <= 500) {
                        return;
                    }
                    bp8.LIZ(1);
                    return;
                } else {
                    bp8.LIZJ = System.currentTimeMillis();
                    bp8.LIZIZ = 1;
                    return;
                }
            }
            if (20 <= i && i < 341) {
                BP8 bp82 = this.LIZ;
                bp82.LJ = false;
                bp82.getClass();
                if (21 <= i) {
                    if (i < 180) {
                        if (bp82.LIZLLL.get() == -1) {
                            bp82.LIZLLL.set(8);
                        }
                    } else if (181 <= i && i < 341 && bp82.LIZLLL.get() == -1) {
                        bp82.LIZLLL.set(0);
                    }
                }
                this.LIZ.LIZJ = System.currentTimeMillis();
                return;
            }
            if (this.LIZ.LJ) {
                long currentTimeMillis = System.currentTimeMillis();
                BP8 bp83 = this.LIZ;
                if (currentTimeMillis - bp83.LIZJ > 500) {
                    bp83.LJI = BPA.UNLOCKED;
                    this.LIZ.LJ = true;
                    return;
                }
            }
            BP8 bp84 = this.LIZ;
            if (!bp84.LJ) {
                bp84.LIZJ = System.currentTimeMillis();
            }
            this.LIZ.LJ = true;
            return;
        }
        BP8 bp85 = this.LIZ;
        if (i < 60 || i > 300) {
            bpa = BPA.UNLOCKED;
        } else {
            bpa = BPA.LOCKED;
        }
        bp85.LJI = bpa;
        bp85.LIZJ = System.currentTimeMillis();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BP9(BP8 bp8, Context context) {
        super(context);
        this.LIZ = bp8;
    }
}
