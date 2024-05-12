package X;

import X.C5BC;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.5B4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5B4<ItemView extends View & C5BC> implements C5A5 {
    public final Context LJLIL;
    public volatile boolean LJLILLLLZI;
    public final RectF LJLJI;

    public abstract ItemView LIZ();

    @Override // X.C5A5
    public final int LJII() {
        return LIZ().getBgColor();
    }

    @Override // X.C5A5
    public final void destroy() {
        ViewGroup viewGroup;
        ItemView LIZ = LIZ();
        ViewParent parent = LIZ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(LIZ, viewGroup);
        }
    }

    @Override // X.C5A5
    public final ItemView getView() {
        return LIZ();
    }

    public C5B4(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLJI = new RectF();
    }

    @Override // X.C5A5
    public final void LIZIZ(int i) {
        LIZ().LIZIZ(i);
    }

    @Override // X.C5A5
    public final void LIZJ(int i) {
        LIZ().setBgRadius(i);
    }

    @Override // X.C5A5
    public final void LIZLLL(boolean z) {
        this.LJLILLLLZI = z;
    }

    @Override // X.C5A5
    public final void LJI(int i) {
        LIZ().setBgColor(i);
    }

    @Override // X.C5A5
    public void setClipping(boolean z) {
        LIZ().setClipping(z);
    }

    @Override // X.C5A5
    public final void setDrawDivider(boolean z) {
        LIZ().setDrawDivider(z);
    }

    @Override // X.C5A5
    public final void setItemSelected(boolean z) {
        LIZ().setItemSelected(z);
        if (!z) {
            LIZ().setClipStart(0.0f);
            LIZ().setClipLength(0.0f);
            LIZ().setClipRectF(new RectF());
        }
    }

    @Override // X.C5A5
    public void setSegment(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        LIZ().setSegment(slot);
    }

    @Override // X.C5A5
    public void setTimelineScale(float f) {
        LIZ().setTimelineScale(f);
    }

    @Override // X.C5A5
    public final void LJFF(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        o.LJIIIZ(canvas, "canvas");
        LIZ().setClipStart(f5);
        LIZ().setClipLength(f6);
        canvas.save();
        this.LJLJI.set(f, f2, f3, f4);
        LIZ().setClipRectF(this.LJLJI);
        canvas.clipRect(this.LJLJI);
        canvas.translate(f, f2);
        LIZ().LIZJ(canvas);
        canvas.restore();
    }
}
