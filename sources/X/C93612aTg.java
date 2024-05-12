package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aTg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93612aTg extends View {
    public ObjectAnimator LJLIL;
    public boolean LJLILLLLZI;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        ObjectAnimator objectAnimator;
        super.onAttachedToWindow();
        if (this.LJLILLLLZI && (objectAnimator = this.LJLIL) != null) {
            objectAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.LJLIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93612aTg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        setBackgroundResource(R.drawable.dg6);
    }
}
