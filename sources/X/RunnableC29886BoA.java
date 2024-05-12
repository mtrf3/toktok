package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.BoA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC29886BoA extends FrameLayout implements Runnable {
    public boolean LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public final C62822Ol8 LJLJLJ;
    public InterfaceC88472Yns<? super java.util.Map<String, Long>, C76800UCe> LJLJLLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL = true;
            getMCostTimesMap().remove("traversal_start_time");
            getMCostTimesMap().put("total_traversal_times", Long.valueOf(this.LJLJL));
            InterfaceC88472Yns<? super java.util.Map<String, Long>, C76800UCe> interfaceC88472Yns = this.LJLJLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(getMCostTimesMap());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    private final java.util.Map<String, Long> getMCostTimesMap() {
        return (java.util.Map) this.LJLJLJ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this, PanelOpenCostTimesSetting.INSTANCE.getValue().mLimitDuration * 1000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.LJLIL) {
            removeCallbacks(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        long j;
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLIL) {
            super.dispatchDraw(canvas);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        super.dispatchDraw(canvas);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        this.LJLJJLL = uptimeMillis2;
        this.LJLJJL = uptimeMillis2 - uptimeMillis;
        this.LJLJL++;
        java.util.Map<String, Long> mCostTimesMap = getMCostTimesMap();
        long j2 = this.LJLJJLL - this.LJLILLLLZI;
        Long l = mCostTimesMap.get("traversal_total_duration");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j2 > j) {
            mCostTimesMap.put("traversal_start_time", Long.valueOf(this.LJLILLLLZI));
            mCostTimesMap.put("measure_duration", Long.valueOf(this.LJLJI));
            mCostTimesMap.put("layout_duration", Long.valueOf(this.LJLJJI));
            mCostTimesMap.put("draw_duration", Long.valueOf(this.LJLJJL));
            mCostTimesMap.put("traversal_end_time", Long.valueOf(this.LJLJJLL));
            mCostTimesMap.put("traversal_total_duration", Long.valueOf(this.LJLJJLL - this.LJLILLLLZI));
            mCostTimesMap.put("current_traversal_times", Long.valueOf(this.LJLJL));
        }
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0L;
        this.LJLJJI = 0L;
        this.LJLJJL = 0L;
        this.LJLJJLL = 0L;
    }

    public final void setTraversalCallBack(InterfaceC88472Yns<? super java.util.Map<String, Long>, C76800UCe> callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LJLJLLL = callBack;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC29886BoA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLJ = C221108m2.LIZIZ(C29887BoB.LJLIL);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLIL) {
            super.onMeasure(i, i2);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.LJLILLLLZI == 0) {
            this.LJLILLLLZI = uptimeMillis;
        }
        super.onMeasure(i, i2);
        this.LJLJI = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJLJI;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LJLIL) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        this.LJLJJI = (SystemClock.uptimeMillis() - uptimeMillis) + this.LJLJJI;
    }
}
