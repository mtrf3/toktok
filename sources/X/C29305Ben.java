package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;

/* renamed from: X.Ben, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29305Ben extends ConstraintLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public final float LJLJLLL;
    public final int LJLL;
    public final float LJLLI;
    public float LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public DataChannel LJLLLL;

    public final DataChannel getDataChannel() {
        return this.LJLLLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r1 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29305Ben.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLLLL = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29305Ben(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJLLL = C87277YNd.LJIIJ(12);
        this.LJLL = AnonymousClass391.LIZ(1.5d);
        this.LJLLI = C87277YNd.LJIIJ(30);
    }
}
