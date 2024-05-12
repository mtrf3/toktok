package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130655Av extends View implements InterfaceC130745Be {
    public final C130665Aw LJLIL;
    public NLETrackSlot LJLILLLLZI;
    public InterfaceC130925Bw LJLJI;
    public InterfaceC130895Bt LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C130655Av(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC130745Be
    public final boolean LIZ() {
        InterfaceC130895Bt interfaceC130895Bt = this.LJLJJI;
        if (interfaceC130895Bt != null) {
            return interfaceC130895Bt.LIZ();
        }
        return false;
    }

    @Override // X.InterfaceC130745Be
    public final NLETrackSlot LJFF() {
        InterfaceC130895Bt interfaceC130895Bt = this.LJLJJI;
        if (interfaceC130895Bt != null) {
            return interfaceC130895Bt.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC130745Be
    public final boolean LJI() {
        InterfaceC130895Bt interfaceC130895Bt = this.LJLJJI;
        if (interfaceC130895Bt != null) {
            return interfaceC130895Bt.LJI();
        }
        return false;
    }

    @Override // X.InterfaceC130745Be
    public final void LJII() {
        InterfaceC130925Bw interfaceC130925Bw = this.LJLJI;
        if (interfaceC130925Bw != null) {
            interfaceC130925Bw.LIZJ();
        }
    }

    public final void LIZIZ() {
        if (getVisibility() == 0 && this.LJLILLLLZI != null) {
            invalidate();
        }
    }

    @Override // X.InterfaceC130745Be
    public int getItemHeight() {
        return getMeasuredHeight();
    }

    @Override // X.InterfaceC130745Be
    public int getItemWidth() {
        return getMeasuredWidth();
    }

    public final InterfaceC130895Bt getCallback() {
        return this.LJLJJI;
    }

    public final InterfaceC130925Bw getFrameSelectChangeChangeListener() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC130745Be
    public final void LJ(long j) {
        InterfaceC130925Bw interfaceC130925Bw = this.LJLJI;
        if (interfaceC130925Bw != null) {
            interfaceC130925Bw.LIZIZ(j);
        }
    }

    @Override // X.InterfaceC130745Be
    public final void LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        InterfaceC130925Bw interfaceC130925Bw = this.LJLJI;
        if (interfaceC130925Bw != null) {
            interfaceC130925Bw.LIZ(nLETrackSlot);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLILLLLZI == null || canvas == null || getVisibility() != 0) {
            return;
        }
        C130665Aw c130665Aw = this.LJLIL;
        NLETrackSlot nLETrackSlot = this.LJLILLLLZI;
        o.LJI(nLETrackSlot);
        c130665Aw.LIZIZ(canvas, nLETrackSlot);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        NLETrackSlot nLETrackSlot = this.LJLILLLLZI;
        if (nLETrackSlot == null) {
            return super.onTouchEvent(motionEvent);
        }
        C130665Aw c130665Aw = this.LJLIL;
        o.LJI(nLETrackSlot);
        c130665Aw.getClass();
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action == 1) {
                long j2 = c130665Aw.LJI;
                if (j2 > 0) {
                    c130665Aw.LIZ.LJ(j2);
                }
            }
        } else {
            Long LIZ = c130665Aw.LIZ(nLETrackSlot, motionEvent.getX());
            if (LIZ != null) {
                j = LIZ.longValue();
            } else {
                j = -1;
            }
            c130665Aw.LJI = j;
            if (!c130665Aw.LIZ.LIZ() || !c130665Aw.LIZ.LJI() || c130665Aw.LJI <= 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCallback(InterfaceC130895Bt interfaceC130895Bt) {
        this.LJLJJI = interfaceC130895Bt;
    }

    public final void setFrameSelectChangeChangeListener(InterfaceC130925Bw interfaceC130925Bw) {
        this.LJLJI = interfaceC130925Bw;
    }

    public final void setFrameViewCallback(InterfaceC130895Bt frameViewCallback) {
        o.LJIIIZ(frameViewCallback, "frameViewCallback");
        this.LJLJJI = frameViewCallback;
        C130665Aw c130665Aw = this.LJLIL;
        AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 626);
        c130665Aw.getClass();
        c130665Aw.LJII = aqS152S0100000_2;
    }

    public final void setSlot(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        this.LJLILLLLZI = slot;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C130655Av(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
            X.5Aw r0 = new X.5Aw
            r0.<init>(r1)
            r1.LJLIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130655Av.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
