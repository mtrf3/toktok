package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47631tv extends LiveIconView {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        Context context = getContext();
        if (z) {
            i = R.attr.ar7;
        } else {
            i = R.attr.ara;
        }
        setIconTint(C259910h.LIZIZ(i, context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47631tv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47631tv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
