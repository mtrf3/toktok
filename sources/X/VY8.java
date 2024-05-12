package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VY8 extends AbstractC79867VWd {
    public VYB LL;
    public final VYD LLD;
    public VYA LLF;
    public VY9 LLFF;
    public long LLFFF;
    public long LLFII;
    public float LLFZ;
    public long LLI;
    public final C62822Ol8 LLIFFJFJJ;

    @Override // X.AbstractC79867VWd
    public final void LJFF() {
    }

    @Override // X.AbstractC79867VWd
    public final void LJIIIIZZ() {
    }

    @Override // X.AbstractC79867VWd
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC79867VWd
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC79867VWd
    public final void LJIIL() {
    }

    public final VYH getClipListener() {
        return null;
    }

    public final VYJ getProgressListener() {
        return null;
    }

    public final VYI getTimeListener() {
        return null;
    }

    public final void setClipListener(VYH vyh) {
    }

    public final void setProgressListener(VYJ vyj) {
    }

    public final void setTimeListener(VYI vyi) {
    }

    @Override // X.AbstractC79867VWd
    public final void LJI() {
        VYA vya = this.LLF;
        if (vya != null) {
            Iterator<C79916VYa> it = vya.LIZIZ.iterator();
            while (it.hasNext()) {
                VYM vym = vya.LIZJ.get(it.next());
                if (vym != null) {
                    float x = vym.getX() - vya.LIZLLL.getScrollX();
                    long j = vya.LIZLLL.LLI;
                    vym.LJLJJLL = x;
                    vym.LJLJLJ = j;
                }
            }
            VY9 vy9 = this.LLFF;
            if (vy9 != null) {
                VY6 vy6 = vy9.LIZ;
                float x2 = vy6.getX() - vy9.LIZIZ.getScrollX();
                long j2 = vy9.LIZIZ.LLI;
                vy6.LJLJJLL = x2;
                vy6.LJLJLJ = j2;
                vy6.LIZLLL(false);
                return;
            }
            o.LJIJI("rulerLayer");
            throw null;
        }
        o.LJIJI("trackLayer");
        throw null;
    }

    @Override // X.AbstractC79867VWd
    public int getChildTotalWidth() {
        return getWidth() + ((int) (((float) this.LLFII) / this.LLFZ));
    }

    public final VYB getRulerLevel() {
        VYB vyb = this.LL;
        if (vyb != null) {
            return vyb;
        }
        o.LJIJI("rulerLevel");
        throw null;
    }

    public final VYG getTrackApi() {
        return (VYG) this.LLIFFJFJJ.getValue();
    }

    @Override // X.AbstractC79867VWd
    public final void LJIIJ() {
        this.LLI = getScrollX() * this.LLFZ;
        if (getScrollX() == getChildTotalWidth() - getWidth()) {
            long j = this.LLFFF;
            long j2 = this.LLI;
            if (j <= j2) {
                j = j2;
            }
            this.LLI = j;
        }
        getTouchBlockEvent();
    }

    @Override // X.AbstractC79867VWd
    public int getScrollRange() {
        return Math.max(0, getChildTotalWidth() - getWidth());
    }

    @Override // X.AbstractC79867VWd
    public final void LIZ(boolean z) {
        if (z) {
            LIZJ((int) (getScrollX() - 10.0f));
        } else {
            LIZJ((int) (getScrollX() + 10.0f));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        LIZLLL(MotionEvent.obtain(uptimeMillis, uptimeMillis, 2, getTrackX(), getTrackY(), 0));
    }

    @Override // X.AbstractC79867VWd
    public final void LIZLLL(MotionEvent motionEvent) {
        o.LJI(motionEvent);
        motionEvent.getX();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.LLFF != null) {
            return;
        }
        o.LJIJI("rulerLayer");
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
    }

    public final void setMainEnd(long j) {
        long j2 = this.LLFII;
        long j3 = this.LLFFF;
        if (j2 != j3 || j3 != j) {
            this.LLFFF = j;
            this.LLFII = j;
            LJIILIIL(this.LLFZ, true);
            VY9 vy9 = this.LLFF;
            if (vy9 != null) {
                vy9.LIZ.setTotalProgress(vy9.LIZIZ.LLFII);
                vy9.LIZ.LIZJ();
                vy9.LIZIZ.requestLayout();
                return;
            }
            o.LJIJI("rulerLayer");
            throw null;
        }
    }

    public final void setRulerLevel(VYB vyb) {
        o.LJIIIZ(vyb, "<set-?>");
        this.LL = vyb;
    }

    @Override // X.AbstractC79867VWd
    public void setTouchBlock(EnumC79869VWf touchBlock) {
        o.LJIIIZ(touchBlock, "touchBlock");
        super.setTouchBlock(touchBlock);
        getTrackX();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VY8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        o.LJI(context);
        this.LLD = new VYD(this);
        this.LLFFF = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        this.LLFII = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        this.LLFZ = 1.0f;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        J75.LIZ(context2, 50.0f);
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 365));
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        setRulerLevel(new VYB(context3, this.LLFZ));
        this.LLF = new VYA(this);
        this.LLFF = new VY9(this);
        float f = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        this.LLFZ = f / J75.LIZ(context4, 50.0f);
    }

    @Override // X.AbstractC79867VWd
    public final void LJ(double d, double d2) {
        VY9 vy9 = this.LLFF;
        if (vy9 != null) {
            vy9.LIZIZ.getRulerLevel();
            LJIILIIL((float) ((d / d2) * this.LLFZ), false);
            VY9 vy92 = this.LLFF;
            if (vy92 != null) {
                vy92.LIZIZ.getRulerLevel();
                return;
            } else {
                o.LJIJI("rulerLayer");
                throw null;
            }
        }
        o.LJIJI("rulerLayer");
        throw null;
    }

    public final void LJIILIIL(float f, boolean z) {
        if (this.LLFZ == f && !z) {
            return;
        }
        this.LLFZ = Math.min(f, (((float) this.LLFII) * 1.0f) / (getWidth() / 3));
        getRulerLevel().LIZ(this.LLFZ);
        VYA vya = this.LLF;
        if (vya != null) {
            Iterator<C79916VYa> it = vya.LIZIZ.iterator();
            while (it.hasNext()) {
                VYM vym = vya.LIZJ.get(it.next());
                if (vym != null) {
                    VY8 vy8 = vya.LIZLLL;
                    vym.LIZLLL(vy8.LLFZ, vy8.getRulerLevel().LIZIZ);
                }
            }
            VY9 vy9 = this.LLFF;
            if (vy9 != null) {
                VY6 vy6 = vy9.LIZ;
                VY8 vy82 = vy9.LIZIZ;
                float f2 = vy82.LLFZ;
                long j = vy82.getRulerLevel().LIZIZ;
                vy6.LJLJJI = f2;
                vy6.LJLJJL = j;
                vy6.LIZJ();
                vy6.invalidate();
                LIZJ((int) (((float) this.LLI) / f));
                requestLayout();
                return;
            }
            o.LJIJI("rulerLayer");
            throw null;
        }
        o.LJIJI("trackLayer");
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        VYA vya = this.LLF;
        if (vya != null) {
            Iterator<C79916VYa> it = vya.LIZIZ.iterator();
            while (it.hasNext()) {
                VYM vym = vya.LIZJ.get(it.next());
                if (vym != null) {
                    vym.measure(i, i2);
                }
            }
            VY9 vy9 = this.LLFF;
            if (vy9 != null) {
                vy9.LIZ.measure(i, i2);
                return;
            } else {
                o.LJIJI("rulerLayer");
                throw null;
            }
        }
        o.LJIJI("trackLayer");
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        VYA vya = this.LLF;
        if (vya != null) {
            Iterator<C79916VYa> it = vya.LIZIZ.iterator();
            while (it.hasNext()) {
                VYM vym = vya.LIZJ.get(it.next());
                if (vym != null) {
                    vym.setParentWidth(vya.LIZLLL.getWidth());
                }
            }
            VY9 vy9 = this.LLFF;
            if (vy9 != null) {
                vy9.LIZ.setParentWidth(vy9.LIZIZ.getWidth());
                return;
            } else {
                o.LJIJI("rulerLayer");
                throw null;
            }
        }
        o.LJIJI("trackLayer");
        throw null;
    }

    @Override // X.AbstractC79867VWd, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        VY9 vy9 = this.LLFF;
        if (vy9 != null) {
            vy9.LIZ.layout(vy9.LIZ.getXOffset() + (vy9.LIZIZ.getWidth() / 2), 0, (int) (vy9.LIZ.getHopeWidth() + vy9.LIZ.getXOffset() + (vy9.LIZIZ.getWidth() / 2)), (int) vy9.LIZ.getHopeHeight());
            VYA vya = this.LLF;
            if (vya != null) {
                Iterator<C79916VYa> it = vya.LIZIZ.iterator();
                while (it.hasNext()) {
                    C79916VYa next = it.next();
                    VYM vym = vya.LIZJ.get(next);
                    if (vym != null) {
                        int xOffset = vym.getXOffset();
                        int hopeWidth = (int) (vym.getHopeWidth() + vym.getXOffset());
                        float f = vya.LIZ;
                        next.getClass();
                        int hopeHeight = (int) (((vym.getHopeHeight() + 2) * 0) + f);
                        vym.layout(xOffset, hopeHeight, hopeWidth, (int) (vym.getHopeHeight() + hopeHeight));
                    }
                }
                return;
            }
            o.LJIJI("trackLayer");
            throw null;
        }
        o.LJIJI("rulerLayer");
        throw null;
    }
}
