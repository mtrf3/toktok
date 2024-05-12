package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aca, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94164aca extends ConstraintLayout {
    public final List<View.OnTouchListener> LJLIL;
    public final List<View.OnTouchListener> LJLILLLLZI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Iterator<View.OnTouchListener> it = this.LJLIL.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                if (it.next().onTouch(this, motionEvent) || z) {
                    z = true;
                }
            }
        }
        if (z) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!onTouchEvent) {
            Iterator<View.OnTouchListener> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                if (it.next().onTouch(this, motionEvent) || onTouchEvent) {
                    onTouchEvent = true;
                } else {
                    onTouchEvent = false;
                }
            }
        }
        return onTouchEvent;
    }

    public C94164aca(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94164aca(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
    }
}
