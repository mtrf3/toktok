package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2QZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QZ extends FrameLayout {
    public final ArrayList<View.OnTouchListener> LJLIL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator<View.OnTouchListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onTouch(this, motionEvent);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2QZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList<>();
    }
}
