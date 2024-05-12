package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A9E extends C80766Vms {
    public Aweme LLJJJIL;
    public ViewParent LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public VideoViewCell LLJJL;

    public final Aweme getAweme() {
        return this.LLJJJIL;
    }

    public final float getDownX() {
        return this.LLJJJJJIL;
    }

    public final float getDownY() {
        return this.LLJJJJLIIL;
    }

    public final ViewParent getRealParent() {
        return this.LLJJJJ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A9E(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        LongPressLayout longPressLayout;
        VideoViewCell videoViewCell = this.LLJJL;
        if (videoViewCell != null && (longPressLayout = videoViewCell.LLILLJJLI) != null) {
            longPressLayout.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                C2U8.LIZ(new A9H(A9F.ACTION_DOWN));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onTouchEvent: ACTION_DOWN x = ");
                LIZ.append(motionEvent.getX());
                LPR.LIZIZ(X1D.LIZIZ(LIZ));
            } else if (valueOf.intValue() == 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onTouchEvent: ACTION_MOVE x = ");
                LIZ2.append(motionEvent.getX());
                LPR.LIZIZ(X1D.LIZIZ(LIZ2));
            } else if (valueOf.intValue() == 1) {
                C2U8.LIZ(new A9H(A9F.ACTION_UP));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onTouchEvent: ACTION_UP x = ");
                LIZ3.append(motionEvent.getX());
                LPR.LIZIZ(X1D.LIZIZ(LIZ3));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAweme(Aweme aweme) {
        this.LLJJJIL = aweme;
    }

    public final void setDownX(float f) {
        this.LLJJJJJIL = f;
    }

    public final void setDownY(float f) {
        this.LLJJJJLIIL = f;
    }

    public final void setRealParent(ViewParent viewParent) {
        this.LLJJJJ = viewParent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
