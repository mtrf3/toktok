package com.bytedance.android.live.publicscreen.api.binder;

import X.CRD;
import X.CSF;
import X.CSR;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PublicScreenMetricsLayout extends FrameLayout {
    public CSR<? extends CRD, ? extends CSF<? extends CRD>> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicScreenMetricsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final CSR<? extends CRD, ? extends CSF<? extends CRD>> getViewBinder() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        CSR<? extends CRD, ? extends CSF<? extends CRD>> csr = this.LJLIL;
        if (csr != null) {
            csr.LJIIIZ().LJIIJ.LJI(csr);
        }
        super.dispatchDraw(canvas);
        CSR<? extends CRD, ? extends CSF<? extends CRD>> csr2 = this.LJLIL;
        if (csr2 != null) {
            csr2.LJIIIZ().LJIIJ.LJJI(csr2);
        }
    }

    public final void setViewBinder(CSR<? extends CRD, ? extends CSF<? extends CRD>> csr) {
        this.LJLIL = csr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CSR<? extends CRD, ? extends CSF<? extends CRD>> csr = this.LJLIL;
        if (csr != null) {
            csr.LJIIIZ().LJIIJ.LJJJIL(csr);
        }
        super.onMeasure(i, i2);
        CSR<? extends CRD, ? extends CSF<? extends CRD>> csr2 = this.LJLIL;
        if (csr2 != null) {
            csr2.LJIIIZ().LJIIJ.LJJIIJ(csr2);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        if (WatchMemoryLeakOpt.INSTANCE.settingValue() && (obj == null || (obj instanceof Fragment))) {
            return;
        }
        super.setTag(i, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicScreenMetricsLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.api.binder.PublicScreenMetricsLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CSR<? extends CRD, ? extends CSF<? extends CRD>> csr = this.LJLIL;
        if (csr != null) {
            csr.LJIIIZ().LJIIJ.LJIJJ(csr);
        }
        super.onLayout(z, i, i2, i3, i4);
        CSR<? extends CRD, ? extends CSF<? extends CRD>> csr2 = this.LJLIL;
        if (csr2 != null) {
            csr2.LJIIIZ().LJIIJ.LJJIJIIJIL(csr2);
        }
    }
}
