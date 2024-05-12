package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6cE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164066cE extends SmartImageView {
    public boolean LJLJLJ;

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C164066cE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164066cE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
