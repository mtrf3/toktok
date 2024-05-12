package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aRI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93464aRI extends FrameLayout {
    public final int LJLIL;
    public List<? extends PointF> LJLILLLLZI;
    public InterfaceC93891aYB LJLJI;

    public final List<PointF> getKeyPointList() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC93891aYB getPointActionCallback() {
        return this.LJLJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0011, code lost:
    
        if (r4 > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
    
        r1 = getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "context");
        r2 = new X.C93463aRH(r5, r1);
        r0 = r5.LJLIL;
        r1 = new android.widget.FrameLayout.LayoutParams(r0, r0);
        r0 = X.C93742aVm.LIZJ(15.0f);
        r2.setPadding(r0, r0, r0, r0);
        addView(r2, r1);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r3 >= r4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        r5.LJLILLLLZI = r6;
        requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setKeyPointList(java.util.List<? extends android.graphics.PointF> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            int r4 = r6.size()
            java.util.List<? extends android.graphics.PointF> r0 = r5.LJLILLLLZI
            int r0 = r0.size()
            int r4 = r4 - r0
            r3 = 0
            if (r4 <= 0) goto L39
        L13:
            X.aRH r2 = new X.aRH
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r5, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r0 = r5.LJLIL
            r1.<init>(r0, r0)
            r0 = 1097859072(0x41700000, float:15.0)
            int r0 = X.C93742aVm.LIZJ(r0)
            r2.setPadding(r0, r0, r0, r0)
            r5.addView(r2, r1)
            int r3 = r3 + 1
            if (r3 >= r4) goto L39
            goto L13
        L39:
            r5.LJLILLLLZI = r6
            r5.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93464aRI.setKeyPointList(java.util.List):void");
    }

    public final void setPointActionCallback(InterfaceC93891aYB interfaceC93891aYB) {
        this.LJLJI = interfaceC93891aYB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93464aRI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLIL = C93742aVm.LIZJ(40.0f);
        this.LJLILLLLZI = C61878OQg.INSTANCE;
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator<Integer> it = C78842Uww.LJJ(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View view = getChildAt(((AbstractC118224kU) it).nextInt());
            o.LJIIIIZZ(view, "view");
            view.setTranslationX(((int) (((PointF) ListProtector.get(this.LJLILLLLZI, r4)).x * getWidth())) - (this.LJLIL / 2.0f));
            view.setTranslationY(((int) (((PointF) ListProtector.get(this.LJLILLLLZI, r4)).y * getHeight())) - (this.LJLIL / 2.0f));
        }
    }
}
