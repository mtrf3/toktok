package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashMap;

/* renamed from: X.HzS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45874HzS extends View {
    public InterfaceC45875HzT LJLIL;
    public float LJLILLLLZI;

    public final InterfaceC45875HzT getOnFrameCoverDragListener() {
        return this.LJLIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r1 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            super.onTouchEvent(r6)
            boolean r0 = r5.isEnabled()
            r4 = 0
            if (r0 == 0) goto L87
            int r1 = r6.getAction()
            r3 = 1
            if (r1 == 0) goto L76
            if (r1 == r3) goto L6b
            r0 = 2
            if (r1 == r0) goto L1f
            r0 = 3
            if (r1 == r0) goto L6b
        L1e:
            return r3
        L1f:
            float r2 = r6.getX()
            float r0 = r5.LJLILLLLZI
            float r2 = r2 - r0
            float r1 = java.lang.Math.abs(r2)
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            int r0 = r5.getLeft()
            float r0 = (float) r0
            float r0 = r0 + r2
            int r1 = (int) r0
            int r2 = r5.getMeasuredWidth()
            int r2 = r2 + r1
            if (r1 >= 0) goto L50
            int r2 = r5.getMeasuredWidth()
        L42:
            int r0 = r5.getLeft()
            int r1 = r4 - r0
            X.HzT r0 = r5.LJLIL
            if (r0 == 0) goto L1e
            r0.LIZIZ(r4, r2, r1)
            goto L1e
        L50:
            android.content.Context r0 = r5.getContext()
            int r0 = X.KL2.LJIIJJI(r0)
            if (r2 <= r0) goto L69
            android.content.Context r0 = r5.getContext()
            int r2 = X.KL2.LJIIJJI(r0)
            int r0 = r5.getMeasuredWidth()
            int r4 = r2 - r0
            goto L42
        L69:
            r4 = r1
            goto L42
        L6b:
            r5.setPressed(r4)
            X.HzT r0 = r5.LJLIL
            if (r0 == 0) goto L1e
            r0.LIZJ()
            goto L1e
        L76:
            X.HzT r0 = r5.LJLIL
            if (r0 == 0) goto L7d
            r0.LIZ()
        L7d:
            float r0 = r6.getX()
            r5.LJLILLLLZI = r0
            r6.getY()
            goto L1e
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45874HzS.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnFrameCoverDragListener(InterfaceC45875HzT interfaceC45875HzT) {
        this.LJLIL = interfaceC45875HzT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45874HzS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
    }
}
