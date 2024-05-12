package X;

import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public class WV5 extends FrameLayout {
    public static final int LLIIIZ = (int) KL2.LIZJ(C16880lQ.LLLLJI(C60903NvH.LJ), 3.0f);
    public List<TimeSpeedModelExtension> LJLIL;
    public TimeSpeedModelExtension LJLILLLLZI;
    public long LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;
    public final Paint LJLJL;
    public final Paint LJLJLJ;
    public final Paint LJLJLLL;
    public final Paint LJLL;
    public final Paint LJLLI;
    public final Paint LJLLILLLL;
    public final Paint LJLLJ;
    public final Paint LJLLL;
    public final Paint LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public long LJZI;
    public long LJZL;
    public long LL;
    public boolean LLD;
    public String LLF;
    public float LLFF;
    public float LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public CopyOnWriteArrayList<VERecordData.VERecordSegmentData> LLI;
    public int LLIFFJFJJ;
    public ValueAnimator LLII;
    public ValueAnimator LLIIII;
    public long LLIIIILZ;
    public List<TimeSpeedModelExtension> LLIIIJ;
    public final boolean LLIIIL;

    public final void LJIIIIZZ() {
        this.LLFII = true;
        ValueAnimator valueAnimator = this.LLIIII;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        LJII(false);
    }

    private long getLongVideoAnchorPosition() {
        return LIZJ(this.LJZI);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLII.removeAllUpdateListeners();
            this.LLII = null;
        }
        ValueAnimator valueAnimator2 = this.LLIIII;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.LLIIII.removeAllUpdateListeners();
            this.LLIIII = null;
        }
    }

    public long getMaxDuration() {
        return this.LJZL;
    }

    public static void LJFF(String str) {
        if (!C52910Kpe.LIZ()) {
            H7B.LIZ(str);
        }
    }

    public void LIZ(Canvas canvas) {
        long j = 0;
        if (this.LJLILLLLZI != null) {
            j = 0 + r2.getDuration();
            int LIZJ = (int) LIZJ(j);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PGRPAINT: drawAnchors() -> draw anchor for stitch at =");
            int i = LIZJ - LLIIIZ;
            LIZ.append(i);
            LJFF(X1D.LIZIZ(LIZ));
            float f = LIZJ;
            canvas.drawRect((float) this.LJZ, 0.0f, f, (float) this.LJLZ, this.LJLJLLL);
            if (LIZJ < this.LJLLLLLL) {
                canvas.drawRect(i, 0.0f, f, (float) this.LJLZ, this.LJLJLJ);
            }
        }
        if (this.LJLIL != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PGRPAINT: drawAnchors() -> start to draw anchors for other video segments =");
            LIZ2.append(this.LJLIL.size());
            LJFF(X1D.LIZIZ(LIZ2));
            for (int i2 = 0; i2 < this.LJLIL.size(); i2++) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(this.LJLIL, i2);
                j += TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed());
                int LIZJ2 = (int) LIZJ(j);
                if (LIZJ2 < this.LJLLLLLL) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("PGRPAINT: drawAnchors() -> draw anchor for segment at =");
                    int i3 = LIZJ2 - LLIIIZ;
                    LIZ3.append(i3);
                    LJFF(X1D.LIZIZ(LIZ3));
                    canvas.drawRect(i3, 0.0f, LIZJ2, (float) this.LJLZ, this.LJLJLJ);
                }
            }
            if (this.LLD && this.LJZL > 30000 && this.LJLJI < this.LJZI) {
                long longVideoAnchorPosition = getLongVideoAnchorPosition();
                long j2 = longVideoAnchorPosition - 2;
                canvas.drawRect((float) j2, 0.0f, (float) (longVideoAnchorPosition + 2), (float) this.LJLZ, this.LJLJLJ);
                canvas.drawText(this.LLF, (float) (j2 - (this.LL / 2)), (getY() + ((float) (this.LJLZ * 2))) - C81184Vtc.LJFF(getContext()), this.LJLLLL);
            }
        }
    }

    public void LIZIZ(Canvas canvas) {
        float f;
        CopyOnWriteArrayList<VERecordData.VERecordSegmentData> copyOnWriteArrayList = this.LLI;
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            j2 += ((VERecordData.VERecordSegmentData) ListProtector.get(copyOnWriteArrayList, i)).mVideoLength;
        }
        float f2 = ((float) this.LJLLLLLL) / ((float) j2);
        float f3 = 0.0f;
        int i2 = 0;
        while (i2 < this.LLI.size()) {
            int i3 = (int) (((float) this.LLI.get(i2).mVideoLength) * f2);
            Canvas canvas2 = canvas;
            if (i2 == this.LLIFFJFJJ) {
                this.LJLJJI.setStrokeCap(Paint.Cap.BUTT);
                float f4 = (float) this.LJZ;
                float f5 = f3 + i3;
                canvas2.drawLine(f3, f4, f5, f4, this.LJLJJI);
                if (this.LLIIIJ != null) {
                    long j3 = this.LLIIIILZ;
                    if (j3 >= j) {
                        float f6 = f2 * 1000.0f;
                        if (j3 > j) {
                            float f7 = (((float) j3) * f6) + f3;
                            float min = Math.min(f7, f5);
                            int i4 = this.LLIFFJFJJ;
                            if (i4 == 0) {
                                canvas2.save();
                                canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                                float f8 = (float) this.LJZ;
                                canvas2.drawCircle(f8, f8, f8, this.LJLJJL);
                                canvas2.restore();
                                f = ((float) this.LJZ) + f3;
                            } else {
                                if (f7 >= f5 && i4 == this.LLI.size() - 1) {
                                    canvas2.save();
                                    canvas2.clipRect(f5 - ((float) this.LJZ), 0.0f, f5, (float) this.LJLZ);
                                    float f9 = (float) this.LJZ;
                                    canvas2.drawCircle(f5 - f9, f9, f9, this.LJLJJL);
                                    canvas2.restore();
                                    min = f5 - ((float) this.LJZ);
                                }
                                f = f3;
                            }
                            canvas2.drawRect(f, 0.0f, min, (float) this.LJLZ, this.LJLJJL);
                        }
                        if (this.LLIIIJ != null) {
                            float f10 = f3;
                            int i5 = 0;
                            while (i5 < this.LLIIIJ.size()) {
                                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(this.LLIIIJ, i5);
                                float calculateRealTime = (TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()) * f6) + f10;
                                if (this.LLIFFJFJJ != this.LLI.size() - 1 || calculateRealTime < f5) {
                                    float min2 = Math.min(calculateRealTime, f5);
                                    canvas2.drawRect(min2 - LLIIIZ, 0.0f, min2, (float) this.LJLZ, this.LJLJLJ);
                                }
                                i5++;
                                f10 = calculateRealTime;
                            }
                        }
                    }
                }
                if (this.LLFII) {
                    this.LJLLL.setAlpha((int) (this.LLFFF * 255.0f));
                    canvas2.drawRect(f3, 0.0f, f5, (float) this.LJLZ, this.LJLLL);
                }
                f3 = f5;
            } else {
                if (i2 == 0) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                    float f11 = (float) this.LJZ;
                    canvas2.drawCircle(f11, f11, f11, this.LJLJL);
                    canvas2.restore();
                    long j4 = this.LJZ;
                    canvas2.drawRect((float) j4, 0.0f, (float) Math.min(i3, this.LJLLLLLL - j4), (float) this.LJLZ, LIZLLL(this.LLI.get(i2)));
                } else if (i2 == this.LLI.size() - 1) {
                    canvas2.save();
                    long j5 = this.LJLLLLLL;
                    canvas2.clipRect((float) (j5 - this.LJZ), 0.0f, (float) j5, (float) this.LJLZ);
                    long j6 = this.LJLLLLLL;
                    long j7 = this.LJZ;
                    float f12 = (float) (j6 - j7);
                    float f13 = (float) j7;
                    canvas2.drawCircle(f12, f13, f13, this.LJLJL);
                    canvas2.restore();
                    canvas2 = canvas2;
                    f3 = f3;
                    canvas2.drawRect(f3, 0.0f, (float) (this.LJLLLLLL - this.LJZ), (float) this.LJLZ, LIZLLL(this.LLI.get(i2)));
                } else {
                    canvas2 = canvas2;
                    f3 = f3;
                    canvas2.drawRect(f3, 0.0f, f3 + i3, (float) this.LJLZ, LIZLLL(this.LLI.get(i2)));
                }
                f3 += i3;
                if (i2 == this.LLIFFJFJJ - 1) {
                    this.LJLLJ.setAlpha((int) (this.LLFF * 255.0f));
                    f3 = f3;
                    canvas2.drawRect(f3 - LLIIIZ, 0.0f, f3, (float) this.LJLZ, this.LJLLJ);
                } else if (i2 != this.LLI.size() - 1) {
                    f3 = f3;
                    canvas2.drawRect(f3 - LLIIIZ, 0.0f, f3, (float) this.LJLZ, this.LJLJLJ);
                }
            }
            i2++;
            j = 0;
        }
    }

    public final long LIZJ(long j) {
        return (long) (((j * 1.0d) * this.LJLLLLLL) / this.LJZL);
    }

    public final Paint LIZLLL(VERecordData.VERecordSegmentData vERecordSegmentData) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PGRPAINT: mVideo =");
        LIZ.append(vERecordSegmentData.mVideo);
        LJFF(X1D.LIZIZ(LIZ));
        if (vERecordSegmentData.mVideo.startsWith(C43075GvP.LIZ) && vERecordSegmentData.mVideo.contains("concat")) {
            LJFF("PGRPAINT: mAlphaLibraryPaint");
            return this.LJLLI;
        }
        return this.LJLJL;
    }

    public final Paint LJ(TimeSpeedModelExtension timeSpeedModelExtension) {
        if (C76917UGr.LJJJJ(timeSpeedModelExtension)) {
            return this.LJLL;
        }
        return this.LJLJJL;
    }

    public final void LJII(boolean z) {
        ValueAnimator valueAnimator = this.LLII;
        if (valueAnimator == null) {
            return;
        }
        if (z) {
            valueAnimator.start();
        } else {
            valueAnimator.end();
            this.LLFF = 1.0f;
        }
    }

    public final void LJIIIZ(RetakeVideoContext retakeVideoContext) {
        if (retakeVideoContext.recordData == null) {
            return;
        }
        CopyOnWriteArrayList<VERecordData.VERecordSegmentData> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LLI = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(retakeVideoContext.recordData.getSegmentData());
        this.LLIFFJFJJ = retakeVideoContext.retakeIndex;
        this.LLFZ = 2;
        if (this.LLIIIJ != null) {
            this.LLIIIJ = null;
        }
        this.LLIIIILZ = 0L;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint LJ;
        float f;
        Paint LJ2;
        Paint LJ3;
        float f2;
        long j;
        Paint LJ4;
        Paint LJ5;
        Paint LJ6;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        if (this.LLFZ == 2) {
            if (this.LLIIIL) {
                CopyOnWriteArrayList<VERecordData.VERecordSegmentData> copyOnWriteArrayList = this.LLI;
                long j2 = 0;
                for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                    j2 += ((VERecordData.VERecordSegmentData) ListProtector.get(copyOnWriteArrayList, i)).mVideoLength;
                }
                float f5 = ((float) this.LJLLLLLL) / ((float) j2);
                long j3 = 0;
                int i2 = 0;
                float f6 = 0.0f;
                while (i2 < this.LLI.size()) {
                    int i3 = (int) (((float) this.LLI.get(i2).mVideoLength) * f5);
                    if (i2 == this.LLIFFJFJJ) {
                        this.LJLJJI.setStrokeCap(Paint.Cap.BUTT);
                        float f7 = ((float) this.LJLLLLLL) - f6;
                        float f8 = i3;
                        float f9 = (float) this.LJZ;
                        canvas2.drawLine(f7 - f8, f9, f7, f9, this.LJLJJI);
                        if (this.LLIIIJ != null) {
                            long j4 = this.LLIIIILZ;
                            if (j4 >= j3) {
                                float f10 = f6 + f8;
                                float f11 = f5 * 1000.0f;
                                if (j4 > j3) {
                                    float f12 = (((float) j4) * f11) + f6;
                                    float min = Math.min(f12, f10);
                                    int i4 = this.LLIFFJFJJ;
                                    if (i4 == 0) {
                                        canvas2.save();
                                        long j5 = this.LJLLLLLL;
                                        canvas2.clipRect((float) (j5 - this.LJZ), 0.0f, (float) j5, (float) this.LJLZ);
                                        long j6 = this.LJLLLLLL;
                                        long j7 = this.LJZ;
                                        float f13 = (float) (j6 - j7);
                                        float f14 = (float) j7;
                                        canvas2.drawCircle(f13, f14, f14, this.LJLJJL);
                                        canvas2.restore();
                                        f4 = ((float) this.LJZ) + f6;
                                    } else {
                                        if (f12 >= f10 && i4 == this.LLI.size() - 1) {
                                            canvas2.save();
                                            canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                                            float f15 = (float) this.LJZ;
                                            canvas2.drawCircle(f15, f15, f15, this.LJLJJL);
                                            canvas2.restore();
                                            min = f10 - ((float) this.LJZ);
                                        }
                                        f4 = f6;
                                    }
                                    float f16 = (float) this.LJLLLLLL;
                                    canvas2.drawRect(f16 - f4, 0.0f, f16 - min, (float) this.LJLZ, this.LJLJJL);
                                }
                                if (this.LLIIIJ != null) {
                                    float f17 = f6;
                                    int i5 = 0;
                                    while (i5 < this.LLIIIJ.size()) {
                                        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(this.LLIIIJ, i5);
                                        float calculateRealTime = (TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()) * f11) + f17;
                                        if (this.LLIFFJFJJ != this.LLI.size() - 1 || calculateRealTime < f10) {
                                            float min2 = Math.min(calculateRealTime, f10);
                                            float f18 = (float) this.LJLLLLLL;
                                            canvas2.drawRect(f18 - (min2 - LLIIIZ), 0.0f, f18 - min2, (float) this.LJLZ, this.LJLJLJ);
                                        }
                                        i5++;
                                        f17 = calculateRealTime;
                                    }
                                }
                            }
                        }
                        if (this.LLFII) {
                            this.LJLLL.setAlpha((int) (this.LLFFF * 255.0f));
                            float f19 = ((float) this.LJLLLLLL) - f6;
                            canvas2.drawRect(f19 - f8, 0.0f, f19, (float) this.LJLZ, this.LJLLL);
                        }
                        f6 += f8;
                    } else {
                        if (i2 == 0) {
                            canvas2.save();
                            long j8 = this.LJLLLLLL;
                            canvas2.clipRect((float) (j8 - this.LJZ), 0.0f, (float) j8, (float) this.LJLZ);
                            long j9 = this.LJLLLLLL;
                            long j10 = this.LJZ;
                            float f20 = (float) (j9 - j10);
                            float f21 = (float) j10;
                            canvas2.drawCircle(f20, f21, f21, this.LJLJL);
                            canvas2.restore();
                            long j11 = this.LJLLLLLL;
                            long j12 = this.LJZ;
                            canvas2.drawRect((float) (j11 - j12), 0.0f, (float) Math.max(j12, j11 - i3), (float) this.LJLZ, this.LJLJL);
                        } else if (i2 == this.LLI.size() - 1) {
                            canvas2.save();
                            canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                            float f22 = (float) this.LJZ;
                            canvas2.drawCircle(f22, f22, f22, this.LJLJL);
                            canvas2.restore();
                            canvas2.drawRect(((float) this.LJLLLLLL) - f6, 0.0f, (float) this.LJZ, (float) this.LJLZ, this.LJLJL);
                        } else {
                            float f23 = ((float) this.LJLLLLLL) - f6;
                            canvas2.drawRect(f23, 0.0f, f23 - i3, (float) this.LJLZ, this.LJLJL);
                        }
                        f6 += i3;
                        if (i2 == this.LLIFFJFJJ - 1) {
                            this.LJLLJ.setAlpha((int) (this.LLFF * 255.0f));
                            float f24 = (float) this.LJLLLLLL;
                            canvas2.drawRect(f24 - (f6 - LLIIIZ), 0.0f, f24 - f6, (float) this.LJLZ, this.LJLLJ);
                        } else if (i2 != this.LLI.size() - 1) {
                            float f25 = (float) this.LJLLLLLL;
                            canvas2.drawRect(f25 - (f6 - LLIIIZ), 0.0f, f25 - f6, (float) this.LJLZ, this.LJLJLJ);
                        }
                    }
                    i2++;
                    j3 = 0;
                }
                return;
            }
            LIZIZ(canvas2);
            return;
        }
        long LIZJ = LIZJ(this.LJLJI);
        if (this.LJLJI <= this.LJZL) {
            if (this.LLIIIL) {
                float f26 = (float) (this.LJLLLLLL - LIZJ);
                float f27 = (float) this.LJZ;
                canvas2.drawLine(f26, f27, 0.0f, f27, this.LJLJJI);
            } else {
                float f28 = (float) this.LJZ;
                canvas2.drawLine((float) LIZJ, f28, (float) this.LJLLLLLL, f28, this.LJLJJI);
            }
        }
        if (this.LLIIIL) {
            if (this.LJLILLLLZI == null) {
                float f29 = (float) (this.LJLLLLLL - this.LJZ);
                if (LIZJ > 0) {
                    canvas2.save();
                    long j13 = this.LJLLLLLL;
                    canvas2.clipRect((float) (j13 - this.LJZ), 0.0f, (float) j13, (float) this.LJLZ);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> draw a left half-round, radius = ");
                    LIZ.append(this.LJZ);
                    LJFF(X1D.LIZIZ(LIZ));
                    long j14 = this.LJLLLLLL;
                    long j15 = this.LJZ;
                    float f30 = (float) (j14 - j15);
                    float f31 = (float) j15;
                    if (C77413UZt.LJIILL(this.LJLIL)) {
                        LJ4 = this.LJLJJL;
                    } else {
                        LJ4 = LJ((TimeSpeedModelExtension) ListProtector.get(this.LJLIL, 0));
                    }
                    canvas2.drawCircle(f30, f31, f31, LJ4);
                    canvas2.restore();
                    if (this.LJLIL != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> start to draw progress bar with video segments of = ");
                        LIZ2.append(this.LJLIL.size());
                        LIZ2.append(" recordedLength =");
                        LIZ2.append(LIZJ);
                        LJFF(X1D.LIZIZ(LIZ2));
                        long j16 = 0;
                        int i6 = 0;
                        while (i6 < this.LJLIL.size()) {
                            TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) ListProtector.get(this.LJLIL, i6);
                            long calculateRealTime2 = TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed());
                            j16 += calculateRealTime2;
                            int LIZJ2 = (int) LIZJ(calculateRealTime2);
                            if (i6 == 0) {
                                f3 = (((float) this.LJZ) + f29) - LIZJ2;
                            } else {
                                f3 = f29 - LIZJ2;
                            }
                            float max = Math.max(f3, (float) this.LJZ);
                            StringBuilder LJ7 = C7MY.LJ("PGRPAINT: drawProgressbarForNormalModeRTL() -> index =", i6, " duration =");
                            LJ7.append(timeSpeedModelExtension2.getDuration());
                            LJ7.append(" realTime =");
                            LJ7.append(calculateRealTime2);
                            V1I.LIZLLL(LJ7, " curLength =", LIZJ2, " time =");
                            LJ7.append(j16);
                            LJ7.append(" length =");
                            LJ7.append((int) LIZJ(j16));
                            LJFF(X1D.LIZIZ(LJ7));
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("PGRPAINT: drawProgressbarForNormalModeRTL() -> startPos =");
                            LIZ3.append(f29);
                            LIZ3.append(" endPos =");
                            LIZ3.append(max);
                            LIZ3.append(" segmentType = ");
                            LIZ3.append(C76917UGr.LJJJJ(timeSpeedModelExtension2));
                            LJFF(X1D.LIZIZ(LIZ3));
                            canvas2.drawRect(f29, 0.0f, max, (float) this.LJLZ, LJ(timeSpeedModelExtension2));
                            i6++;
                            f29 = max - 0.1f;
                        }
                        if (((float) (this.LJLLLLLL - LIZJ)) < f29) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("PGRPAINT: drawProgressbarForNormalModeRTL -> draw the new recorded video segment startPos =");
                            LIZ4.append(f29);
                            LIZ4.append(" recordedLength =");
                            LIZ4.append(LIZJ);
                            LIZ4.append(" mWidth =");
                            LIZ4.append(this.LJLLLLLL);
                            LJFF(X1D.LIZIZ(LIZ4));
                            f29 = f29;
                            canvas2.drawRect(f29, 0.0f, (float) Math.max(this.LJLLLLLL - LIZJ, this.LJZ), (float) this.LJLZ, this.LJLJJL);
                        }
                    }
                    float f32 = (float) (this.LJLLLLLL - LIZJ);
                    if (f32 < f29 && Math.abs(f29 - f32) < 2.0f) {
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("PGRPAINT: drawProgressbarForNormalModeRTL -> fill up the gap, startPos =");
                        LIZ5.append(f29);
                        LIZ5.append(" endPos =");
                        LIZ5.append(Math.min(LIZJ, this.LJLLLLLL) - this.LJZ);
                        LJFF(X1D.LIZIZ(LIZ5));
                        long j17 = this.LJLLLLLL - LIZJ;
                        long j18 = this.LJZ;
                        float max2 = (float) Math.max(j17 - j18, j18);
                        float f33 = (float) this.LJLZ;
                        if (C77413UZt.LJIILL(this.LJLIL)) {
                            LJ6 = this.LJLJJL;
                        } else {
                            List<TimeSpeedModelExtension> list = this.LJLIL;
                            LJ6 = LJ((TimeSpeedModelExtension) C64504PTg.LIZIZ(list, -1, list));
                        }
                        canvas2 = canvas2;
                        canvas2.drawRect(f29, 0.0f, max2, f33, LJ6);
                    }
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("PGRPAINT: drawProgressbarForNormalModeRTL -> mTotalRecordingTime =");
                    LIZ6.append(this.LJLJI);
                    LIZ6.append(" mMaxDuration =");
                    LIZ6.append(this.LJZL);
                    LJFF(X1D.LIZIZ(LIZ6));
                    if (this.LJLJI >= this.LJZL) {
                        LJFF("PGRPAINT: draw the right half-round");
                        canvas2.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                        float f34 = (float) this.LJZ;
                        if (C77413UZt.LJIILL(this.LJLIL)) {
                            LJ5 = this.LJLJJL;
                        } else {
                            List<TimeSpeedModelExtension> list2 = this.LJLIL;
                            LJ5 = LJ((TimeSpeedModelExtension) C64504PTg.LIZIZ(list2, -1, list2));
                        }
                        canvas2.drawCircle(f34, f34, f34, LJ5);
                        canvas2.restore();
                    }
                }
            } else {
                long LIZJ3 = LIZJ(r3.getDuration());
                canvas2.save();
                long j19 = this.LJLLLLLL;
                canvas2.clipRect((float) (j19 - this.LJZ), 0.0f, (float) j19, (float) this.LJLZ);
                long j20 = this.LJLLLLLL;
                long j21 = this.LJZ;
                float f35 = (float) j21;
                canvas2.drawCircle((float) (j20 - j21), f35, f35, this.LJLJLLL);
                canvas2.restore();
                long j22 = this.LJLLLLLL;
                canvas2.drawRect((float) (j22 - this.LJZ), 0.0f, (float) (j22 - LIZJ3), (float) this.LJLZ, this.LJLJLLL);
                if (LIZJ > LIZJ3) {
                    long j23 = this.LJLLLLLL;
                    canvas2.drawRect((float) (j23 - LIZJ3), 0.0f, (float) Math.max(this.LJZ, j23 - LIZJ), (float) this.LJLZ, this.LJLLILLLL);
                }
                if (this.LJLJI > this.LJZL) {
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                    float f36 = (float) this.LJZ;
                    canvas2.drawCircle(f36, f36, f36, this.LJLLILLLL);
                    canvas2.restore();
                }
            }
            if (this.LJLILLLLZI != null) {
                j = r1.getDuration() + 0;
                long LIZJ4 = (int) LIZJ(j);
                if (LIZJ4 < this.LJLLLLLL) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("PGRPAINT: drawAnchors() -> draw anchor for stitch at =");
                    long j24 = this.LJLLLLLL - LIZJ4;
                    long j25 = LLIIIZ;
                    LIZ7.append(j24 - j25);
                    LJFF(X1D.LIZIZ(LIZ7));
                    long j26 = this.LJLLLLLL - LIZJ4;
                    canvas2 = canvas2;
                    canvas2.drawRect((float) j26, 0.0f, (float) (j26 - j25), (float) this.LJLZ, this.LJLJLJ);
                }
            } else {
                j = 0;
            }
            if (this.LJLIL != null) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("PGRPAINT: drawAnchors() -> start to draw anchors for other segments =");
                LIZ8.append(this.LJLIL.size());
                LJFF(X1D.LIZIZ(LIZ8));
                for (int i7 = 0; i7 < this.LJLIL.size(); i7++) {
                    TimeSpeedModelExtension timeSpeedModelExtension3 = (TimeSpeedModelExtension) ListProtector.get(this.LJLIL, i7);
                    j += TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension3.getDuration(), timeSpeedModelExtension3.getSpeed());
                    long LIZJ5 = (int) LIZJ(j);
                    if (LIZJ5 < this.LJLLLLLL) {
                        StringBuilder LIZ9 = X1D.LIZ();
                        LIZ9.append("PGRPAINT: drawAnchors() -> draw anchor for segment at =");
                        long j27 = this.LJLLLLLL - LIZJ5;
                        long j28 = LLIIIZ;
                        LIZ9.append(j27 - j28);
                        LJFF(X1D.LIZIZ(LIZ9));
                        long j29 = this.LJLLLLLL - LIZJ5;
                        canvas2.drawRect((float) j29, 0.0f, (float) (j29 - j28), (float) this.LJLZ, this.LJLJLJ);
                    }
                }
                if (this.LLD && this.LJZL > 30000 && this.LJLJI < this.LJZI) {
                    long longVideoAnchorPosition = getLongVideoAnchorPosition();
                    long j30 = this.LJLLLLLL - longVideoAnchorPosition;
                    canvas2.drawRect((float) (j30 - 2), 0.0f, (float) (j30 + 2), (float) this.LJLZ, this.LJLJLJ);
                    canvas2.drawText(this.LLF, (float) (((this.LJLLLLLL - longVideoAnchorPosition) - 2) - (this.LL / 2)), (getY() + ((float) (this.LJLZ * 2))) - C81184Vtc.LJFF(getContext()), this.LJLLLL);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LJLILLLLZI == null) {
            float f37 = (float) this.LJZ;
            if (LIZJ > 0) {
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
                float f38 = (float) this.LJZ;
                if (C77413UZt.LJIILL(this.LJLIL)) {
                    LJ = this.LJLJJL;
                } else {
                    LJ = LJ((TimeSpeedModelExtension) ListProtector.get(this.LJLIL, 0));
                }
                canvas2.drawCircle(f38, f38, f38, LJ);
                canvas2.restore();
                if (this.LJLIL != null) {
                    long j31 = 0;
                    for (int i8 = 0; i8 < this.LJLIL.size(); i8++) {
                        TimeSpeedModelExtension timeSpeedModelExtension4 = (TimeSpeedModelExtension) ListProtector.get(this.LJLIL, i8);
                        long calculateRealTime3 = TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension4.getDuration(), timeSpeedModelExtension4.getSpeed());
                        j31 += calculateRealTime3;
                        int LIZJ6 = (int) LIZJ(calculateRealTime3);
                        if (i8 == 0) {
                            f2 = (LIZJ6 + f37) - ((float) this.LJZ);
                        } else {
                            f2 = LIZJ6 + f37;
                        }
                        float min3 = Math.min(f2, (float) (this.LJLLLLLL - this.LJZ));
                        StringBuilder LJ8 = C7MY.LJ("PGRPAINT: drawProgressbarForNormalMode() -> index =", i8, " duration =");
                        LJ8.append(timeSpeedModelExtension4.getDuration());
                        LJ8.append(" realTime =");
                        LJ8.append(calculateRealTime3);
                        V1I.LIZLLL(LJ8, " curLength =", LIZJ6, " time =");
                        LJ8.append(j31);
                        LJ8.append(" length =");
                        LJ8.append((int) LIZJ(j31));
                        LJFF(X1D.LIZIZ(LJ8));
                        StringBuilder LIZ10 = X1D.LIZ();
                        LIZ10.append("PGRPAINT: drawProgressbarForNormalMode() -> startPos =");
                        LIZ10.append(f37);
                        LIZ10.append(" endPos =");
                        LIZ10.append(min3);
                        LIZ10.append(" segmentType = ");
                        LIZ10.append(C76917UGr.LJJJJ(timeSpeedModelExtension4));
                        LJFF(X1D.LIZIZ(LIZ10));
                        canvas2.drawRect(f37, 0.0f, min3, (float) this.LJLZ, LJ(timeSpeedModelExtension4));
                        f37 = min3 + 0.1f;
                    }
                    if (f37 < ((float) LIZJ)) {
                        StringBuilder LIZ11 = X1D.LIZ();
                        LIZ11.append("PGRPAINT: drawProgressbarForNormalMode -> draw the new recorded video segment startPos =");
                        LIZ11.append(f37);
                        LIZ11.append(" recordedLength =");
                        LIZ11.append(LIZJ);
                        LIZ11.append(" mWidth =");
                        LIZ11.append(this.LJLLLLLL);
                        LJFF(X1D.LIZIZ(LIZ11));
                        f = f37;
                        canvas2.drawRect(f37, 0.0f, (float) Math.min(LIZJ, this.LJLLLLLL - this.LJZ), (float) this.LJLZ, this.LJLJJL);
                    } else {
                        f = f37;
                    }
                } else {
                    f = f37;
                }
                float f39 = (float) LIZJ;
                if (f < f39 && Math.abs(f39 - f) < 2.0f) {
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append("PGRPAINT: drawProgressbarForNormalMode -> fill up the gap, startPos =");
                    LIZ12.append(f);
                    LIZ12.append(" endPos =");
                    LIZ12.append(Math.min(LIZJ, this.LJLLLLLL) - this.LJZ);
                    LJFF(X1D.LIZIZ(LIZ12));
                    float min4 = (float) (Math.min(LIZJ, this.LJLLLLLL) - this.LJZ);
                    float f40 = (float) this.LJLZ;
                    if (C77413UZt.LJIILL(this.LJLIL)) {
                        LJ3 = this.LJLJJL;
                    } else {
                        List<TimeSpeedModelExtension> list3 = this.LJLIL;
                        LJ3 = LJ((TimeSpeedModelExtension) C64504PTg.LIZIZ(list3, -1, list3));
                    }
                    canvas2 = canvas2;
                    canvas2.drawRect(f, 0.0f, min4, f40, LJ3);
                }
                StringBuilder LIZ13 = X1D.LIZ();
                LIZ13.append("PGRPAINT: drawProgressbarForNormalMode -> mTotalRecordingTime =");
                LIZ13.append(this.LJLJI);
                LIZ13.append(" mMaxDuration =");
                LIZ13.append(this.LJZL);
                LJFF(X1D.LIZIZ(LIZ13));
                if (this.LJLJI >= this.LJZL) {
                    LJFF("PGRPAINT: draw the right half-round");
                    canvas2.save();
                    long j32 = this.LJLLLLLL;
                    canvas2.clipRect((float) (j32 - this.LJZ), 0.0f, (float) j32, (float) this.LJLZ);
                    long j33 = this.LJLLLLLL;
                    long j34 = this.LJZ;
                    float f41 = (float) (j33 - j34);
                    float f42 = (float) j34;
                    if (C77413UZt.LJIILL(this.LJLIL)) {
                        LJ2 = this.LJLJJL;
                    } else {
                        List<TimeSpeedModelExtension> list4 = this.LJLIL;
                        LJ2 = LJ((TimeSpeedModelExtension) C64504PTg.LIZIZ(list4, -1, list4));
                    }
                    canvas2.drawCircle(f41, f42, f42, LJ2);
                    canvas2.restore();
                }
            }
        } else {
            long LIZJ7 = LIZJ(r3.getDuration());
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, (float) this.LJZ, (float) this.LJLZ);
            float f43 = (float) this.LJZ;
            canvas2.drawCircle(f43, f43, f43, this.LJLJLLL);
            canvas2.restore();
            float f44 = (float) LIZJ7;
            canvas2.drawRect((float) this.LJZ, 0.0f, f44, (float) this.LJLZ, this.LJLJLLL);
            if (LIZJ > LIZJ7) {
                canvas2.drawRect(f44, 0.0f, (float) Math.min(LIZJ, this.LJLLLLLL - this.LJZ), (float) this.LJLZ, this.LJLLILLLL);
            }
            if (this.LJLJI > this.LJZL) {
                canvas2.save();
                long j35 = this.LJLLLLLL;
                canvas2.clipRect((float) (j35 - this.LJZ), 0.0f, (float) j35, (float) this.LJLZ);
                long j36 = this.LJLLLLLL;
                long j37 = this.LJZ;
                float f45 = (float) j37;
                canvas2.drawCircle((float) (j36 - j37), f45, f45, this.LJLLILLLL);
                canvas2.restore();
            }
        }
        LIZ(canvas2);
    }

    public void setAnchorDuration(long j) {
        this.LJZI = j;
    }

    public void setAnchorString(String str) {
        this.LLF = str;
        this.LL = this.LJLLLL.measureText(str);
    }

    public void setMaxDuration(long j) {
        this.LJZL = j;
        postInvalidate();
    }

    public void setNeedDrawAnchor(boolean z) {
        this.LLD = z;
    }

    public WV5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJI(long j, List list) {
        this.LJLIL = list;
        if (this.LJLILLLLZI != null) {
            this.LJLJI = j + r0.getDuration();
        } else {
            this.LJLJI = j;
        }
        this.LLFZ = 1;
        postInvalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLLLLLL = getMeasuredWidth();
        long measuredHeight = getMeasuredHeight() / 3;
        this.LJLZ = measuredHeight;
        this.LJZ = measuredHeight >> 1;
    }

    public WV5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJZI = LivePlayEnforceIntervalSetting.DEFAULT;
        this.LJZL = LivePlayEnforceIntervalSetting.DEFAULT;
        this.LLD = true;
        this.LLF = "15s";
        this.LLFZ = 1;
        setWillNotDraw(false);
        if (C173636rf.LIZIZ(context)) {
            this.LLIIIL = true;
        }
        Paint paint = new Paint(1);
        this.LJLJJI = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(KL2.LIZJ(context, 6.0f));
        paint.setColor(C04330Ez.LIZIZ(getContext(), R.color.re));
        Paint paint2 = new Paint(1);
        this.LJLJL = paint2;
        paint2.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, getContext()));
        paint2.setAlpha(86);
        Paint paint3 = new Paint(1);
        this.LJLJJL = paint3;
        paint3.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, getContext()));
        Paint paint4 = new Paint(1);
        this.LJLJJLL = paint4;
        paint4.setColor(AnonymousClass636.LJIIIIZZ(R.attr.da, getContext()));
        Paint paint5 = new Paint(1);
        this.LJLJLLL = paint5;
        paint5.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext()));
        Paint paint6 = new Paint(1);
        this.LJLLILLLL = paint6;
        paint6.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, getContext()));
        Paint paint7 = new Paint(1);
        this.LJLL = paint7;
        paint7.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext()));
        Paint paint8 = new Paint(1);
        this.LJLLI = paint8;
        paint8.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext()));
        paint8.setAlpha(86);
        Paint paint9 = new Paint(1);
        this.LJLJLJ = paint9;
        paint9.setStyle(Paint.Style.FILL);
        paint9.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
        Paint paint10 = new Paint(1);
        this.LJLLJ = paint10;
        paint10.setStyle(Paint.Style.FILL);
        paint10.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
        Paint paint11 = new Paint(1);
        this.LJLLL = paint11;
        paint11.setStyle(Paint.Style.FILL);
        paint11.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
        Paint paint12 = new Paint(1);
        this.LJLLLL = paint12;
        paint12.setStyle(Paint.Style.FILL);
        paint12.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
        paint12.setTextSize(KL2.LJIIZILJ(getContext(), 12.0f));
        paint12.setShadowLayer(4.0f, 0.0f, 2.0f, C04330Ez.LIZIZ(getContext(), R.color.ca));
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            paint12.setTypeface(LIZLLL);
        }
        this.LL = paint12.measureText(this.LLF);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(350L);
        this.LLII = duration;
        duration.setRepeatCount(-1);
        this.LLII.setRepeatMode(2);
        this.LLII.addUpdateListener(new AUListenerS101S0100000_14(this, 42));
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f).setDuration(700L);
        this.LLIIII = duration2;
        duration2.addUpdateListener(new AUListenerS101S0100000_14(this, 43));
    }
}
