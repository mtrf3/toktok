package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class WBM extends WBL {
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public float LJLLILLLL;
    public final float LJLLJ;
    public final long LJLLL;
    public final long LJLLLL;
    public final WBN LJLLLLLL;
    public final WBN LJLZ;
    public long LJZ;
    public long LJZI;
    public long LJZL;
    public long LL;
    public long LLD;
    public double LLF;
    public long LLFF;
    public final int LLFFF;
    public double LLFII;

    public final void LIZIZ(float f) {
        float max;
        if (f > 0.0f) {
            if (this.LJLLILLLL >= this.LJLL) {
                f = -this.LJLLJ;
            }
        } else if (f < 0.0f && this.LJLLILLLL <= this.LJLJLLL) {
            f = this.LJLLJ;
        }
        float f2 = this.LJLLILLLL + f;
        this.LJLLILLLL = f2;
        if (f > 0.0f) {
            max = Math.min(f2, this.LJLL);
        } else {
            max = Math.max(this.LJLJLLL, f2);
        }
        this.LJLLILLLL = max;
    }

    public WBM(InputStream inputStream, float f, float f2) {
        super(inputStream);
        this.LJLJLLL = 0.1f;
        this.LJLL = 0.7f;
        this.LJLLILLLL = 0.1f;
        this.LJLLJ = 0.1f;
        this.LJLLL = 1000L;
        this.LJLLLL = 2000L;
        this.LJLLLLLL = new WBN(0.1d);
        this.LJLZ = new WBN(0.1d);
        this.LLFFF = 60;
        if (f < f2) {
            if (f >= 0.0f && f < 1.0f) {
                this.LJLJLLL = f;
            }
            if (f2 > 0.0f && f2 <= 1.0f) {
                this.LJLL = f2;
            }
        }
        this.LJLLI = (this.LJLJLLL + this.LJLL) / 2.0f;
    }

    @Override // X.WBL, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        float f;
        float f2;
        if (this.LJLILLLLZI == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.LJLJL > this.LJLJJI) {
                this.LJLJL = currentTimeMillis;
                long j = this.LJZ;
                long j2 = currentTimeMillis - j;
                if (j2 >= this.LJLLL) {
                    double d = j2;
                    if (j <= 0 || d <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        this.LJZ = currentTimeMillis;
                        this.LL = C16880lQ.LLLLLZ();
                        this.LJZI = this.LJZL;
                    } else {
                        this.LJZ = currentTimeMillis;
                        long LLLLLZ = C16880lQ.LLLLLZ();
                        long j3 = this.LJZL;
                        long j4 = j3 - this.LJZI;
                        long j5 = LLLLLZ - this.LL;
                        this.LJZI = j3;
                        this.LL = LLLLLZ;
                        this.LJLLLLLL.LIZ(j4 / d);
                        this.LJLZ.LIZ(j5 / d);
                    }
                }
                long j6 = this.LLD;
                if (currentTimeMillis - j6 >= this.LJLLLL) {
                    if (j6 == 0) {
                        this.LLD = currentTimeMillis;
                    } else {
                        this.LLD = currentTimeMillis;
                        double d2 = this.LJLZ.LIZJ - this.LJLLLLLL.LIZJ;
                        double d3 = d2 - this.LLF;
                        this.LLF = d2;
                        double d4 = d3 + this.LLFII;
                        this.LLFII = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        int i3 = this.LLFFF;
                        if (d4 < i3) {
                            if (d4 >= (-i3)) {
                                this.LLFII = d4;
                                if (d4 > r5 / 2.0f) {
                                    if (this.LJLLILLLL < this.LJLLI) {
                                        f = this.LJLLJ * 2.0f;
                                    } else {
                                        f = this.LJLLJ;
                                    }
                                    LIZIZ(f);
                                } else if (this.LJLLILLLL < this.LJLLI) {
                                    LIZIZ(this.LJLLJ);
                                } else {
                                    LIZIZ(-this.LJLLJ);
                                }
                            }
                        }
                        if (this.LJLLILLLL > this.LJLLI) {
                            f2 = (-this.LJLLJ) * 2.0f;
                        } else {
                            f2 = -this.LJLLJ;
                        }
                        LIZIZ(f2);
                    }
                }
                long j7 = (long) (this.LJLJJI * (1.0f - this.LJLLILLLL));
                long j8 = this.LLFF;
                if (j8 >= j7) {
                    this.LLFF = j8 - j7;
                } else {
                    if (j8 > 0) {
                        j7 -= j8;
                        this.LLFF = 0L;
                    }
                    if (j7 > 0) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        try {
                            Thread.sleep(j7);
                            long currentTimeMillis3 = (System.currentTimeMillis() - currentTimeMillis2) - j7;
                            if (currentTimeMillis3 > 0) {
                                this.LLFF = currentTimeMillis3;
                            }
                        } catch (InterruptedException e) {
                            throw new IOException(e);
                        }
                    }
                }
            }
            int LIZ = LIZ(i, bArr, i2);
            if (LIZ != -1) {
                this.LJZL += LIZ;
            }
            return LIZ;
        }
        return super.read(bArr, i, i2);
    }
}
