package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C139865eI extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C139865eI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139865eI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Drawable LIZ = C78885Uxd.LIZ(context, attributeSet);
        if (LIZ != null) {
            setBackground(LIZ);
        }
    }
}
