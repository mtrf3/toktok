package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import defpackage.a1;

/* loaded from: classes9.dex */
public final class KGP extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public KGO LJLJJLL;
    public final int[] LJLJL;
    public final C62822Ol8 LJLJLJ;

    private final boolean getAbSwitch() {
        return ((Boolean) this.LJLJLJ.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        if (r6 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
    
        r9.LJLILLLLZI = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        if (r1 == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KGP.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KGP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        this.LJLJJL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJLJL = new int[2];
        this.LJLJLJ = C221108m2.LIZIZ(KGQ.LJLIL);
    }
}
