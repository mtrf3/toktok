package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ah7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94445ah7 extends C29701Eo {
    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
        C54339LUh.LIZ(this);
    }

    public C94445ah7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94445ah7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        setAnimation(R.raw.dots_loading_lottie);
        setRepeatCount(-1);
    }
}
