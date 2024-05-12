package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119594mh extends C62354Oda {
    @Override // X.C62354Oda, com.bytedance.lighten.loader.SmartImageView
    public final void LIZIZ() {
        super.LIZIZ();
        V92 hierarchy = getHierarchy();
        V8L v8l = new V8L();
        v8l.LJFF(KL2.LIZJ(getContext(), 6.0f));
        v8l.LIZLLL(KL2.LIZJ(getContext(), 3.0f));
        v8l.LJFF = -1;
        hierarchy.LJIL(v8l);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119594mh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119594mh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
