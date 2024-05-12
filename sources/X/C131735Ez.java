package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131735Ez extends FrameLayout {
    public InterfaceC131725Ey LJLIL;
    public final List<OSZ<Long, Float>> LJLILLLLZI;
    public final List<List<Float>> LJLJI;

    public final InterfaceC131725Ey getPainter() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC131725Ey interfaceC131725Ey;
        super.dispatchDraw(canvas);
        if (canvas == null) {
            return;
        }
        if ((!((ArrayList) this.LJLILLLLZI).isEmpty() || !((ArrayList) this.LJLJI).isEmpty()) && (interfaceC131725Ey = this.LJLIL) != null) {
            interfaceC131725Ey.LIZ(canvas, this, this.LJLILLLLZI, this.LJLJI);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final void setPainter(InterfaceC131725Ey interfaceC131725Ey) {
        if (!o.LJ(this.LJLIL, interfaceC131725Ey)) {
            this.LJLIL = interfaceC131725Ey;
        }
    }

    public final void setStartRecordTime(long j) {
        InterfaceC131725Ey interfaceC131725Ey = this.LJLIL;
        if (interfaceC131725Ey != null) {
            interfaceC131725Ey.LIZIZ();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        invalidate();
    }

    public final void setWavePointList(List<? extends List<Float>> wavePoints) {
        o.LJIIIZ(wavePoints, "wavePoints");
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJI).addAll(wavePoints);
        invalidate();
    }

    public final void setWavePoints(List<OSZ<Long, Float>> wavePoints) {
        o.LJIIIZ(wavePoints, "wavePoints");
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(wavePoints);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131735Ez(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
    }
}
