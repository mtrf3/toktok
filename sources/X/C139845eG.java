package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.a1;

/* renamed from: X.5eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139845eG extends RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139845eG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Drawable LIZ = C78885Uxd.LIZ(context, attributeSet);
        if (LIZ != null) {
            setBackground(LIZ);
        }
    }
}
