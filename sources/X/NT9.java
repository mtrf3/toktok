package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* loaded from: classes11.dex */
public final class NT9 extends NT7 {
    @Override // X.NT7
    public int getLayoutId$commercialize_feed_impl_release() {
        return R.layout.bc4;
    }

    @Override // X.NT7
    public void setLabelVisibility$commercialize_feed_impl_release(int i) {
        setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NT9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setDefaultBackgroundColor$commercialize_feed_impl_release(C78609UtB.LJJJ(R.attr.gp, context));
    }
}
