package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130625As extends View implements C5BC, InterfaceC130745Be {
    public final C130665Aw LJLIL;
    public InterfaceC130925Bw LJLILLLLZI;
    public C5C0 LJLJI;
    public boolean LJLJJI;
    public float LJLJJL;
    public NLETrackSlot LJLJJLL;

    public abstract /* synthetic */ int getBgColor();

    public abstract /* synthetic */ int getBgRadius();

    public abstract /* synthetic */ float getClipLength();

    public abstract /* synthetic */ RectF getClipRectF();

    public abstract /* synthetic */ boolean getDrawDivider();

    public abstract /* synthetic */ float getTimelineScale();

    public abstract /* synthetic */ void setBgColor(int i);

    public abstract /* synthetic */ void setBgRadius(int i);

    public abstract /* synthetic */ void setClipLength(float f);

    public abstract /* synthetic */ void setClipRectF(RectF rectF);

    public abstract /* synthetic */ void setDrawDivider(boolean z);

    public abstract /* synthetic */ void setItemSelected(boolean z);

    public abstract /* synthetic */ void setSegment(NLETrackSlot nLETrackSlot);

    public abstract /* synthetic */ void setTimelineScale(float f);

    @Override // X.InterfaceC130745Be
    public final boolean LIZ() {
        C5C0 c5c0 = this.LJLJI;
        if (c5c0 != null) {
            c5c0.LIZ();
            if (LIZLLL()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC130745Be
    public final NLETrackSlot LJFF() {
        C5C0 c5c0 = this.LJLJI;
        if (c5c0 != null) {
            return c5c0.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC130745Be
    public final void LJII() {
        InterfaceC130925Bw interfaceC130925Bw = this.LJLILLLLZI;
        if (interfaceC130925Bw != null) {
            interfaceC130925Bw.LIZJ();
        }
    }

    @Override // X.InterfaceC130745Be
    public final boolean LJI() {
        return LIZLLL();
    }

    @Override // X.InterfaceC130745Be
    public int getItemHeight() {
        return getMeasuredHeight();
    }

    @Override // X.InterfaceC130745Be
    public int getItemWidth() {
        return getMeasuredWidth();
    }

    public final ViewGroup getParentView() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup parentView = getParentView();
        if (parentView != null) {
            C130665Aw c130665Aw = this.LJLIL;
            AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(parentView, 970);
            c130665Aw.getClass();
            c130665Aw.LJII = aqS152S0100000_2;
        }
    }

    @Override // X.C5BC
    public float getClipStart() {
        return this.LJLJJL;
    }

    public final C5C0 getFrameDelegate() {
        return this.LJLJI;
    }

    public final InterfaceC130925Bw getListener() {
        return this.LJLILLLLZI;
    }

    public final NLETrackSlot getNleTrackSlot$editor_trackpanel_release() {
        return this.LJLJJLL;
    }

    @Override // X.C5BC
    public final void LIZIZ(int i) {
        postInvalidateOnAnimation();
    }

    public void LIZJ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        NLETrackSlot nLETrackSlot = this.LJLJJLL;
        if (nLETrackSlot == null) {
            return;
        }
        this.LJLIL.LIZIZ(canvas, nLETrackSlot);
    }

    @Override // X.InterfaceC130745Be
    public final void LJ(long j) {
        InterfaceC130925Bw interfaceC130925Bw = this.LJLILLLLZI;
        if (interfaceC130925Bw != null) {
            interfaceC130925Bw.LIZIZ(j);
        }
    }

    @Override // X.InterfaceC130745Be
    public final void LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        InterfaceC130925Bw interfaceC130925Bw = this.LJLILLLLZI;
        if (interfaceC130925Bw != null) {
            interfaceC130925Bw.LIZ(nLETrackSlot);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        NLETrackSlot nLETrackSlot;
        super.onDraw(canvas);
        if (canvas == null || (nLETrackSlot = this.LJLJJLL) == null) {
            return;
        }
        this.LJLIL.LIZIZ(canvas, nLETrackSlot);
    }

    @Override // X.C5BC
    public void setClipStart(float f) {
        this.LJLJJL = f;
        this.LJLIL.LJFF = f;
    }

    @Override // X.C5BC
    public void setClipping(boolean z) {
        if (this.LJLJJI == z) {
            return;
        }
        this.LJLJJI = z;
        if (!z) {
            C130665Aw c130665Aw = this.LJLIL;
            c130665Aw.LJ = 0;
            c130665Aw.LJFF = 0.0f;
        }
    }

    public final void setFrameDelegate(C5C0 c5c0) {
        this.LJLJI = c5c0;
    }

    public final void setListener(InterfaceC130925Bw interfaceC130925Bw) {
        this.LJLILLLLZI = interfaceC130925Bw;
    }

    public final void setNleTrackSlot$editor_trackpanel_release(NLETrackSlot nLETrackSlot) {
        this.LJLJJLL = nLETrackSlot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC130625As(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = new C130665Aw(this);
    }
}
