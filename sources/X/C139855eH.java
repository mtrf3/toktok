package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.5eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139855eH extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139855eH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Drawable LIZ = C78885Uxd.LIZ(context, attributeSet);
        if (LIZ != null) {
            setBackground(LIZ);
        }
    }
}
