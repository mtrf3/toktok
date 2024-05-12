package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.5eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C139835eF extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139835eF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Drawable LIZ = C78885Uxd.LIZ(context, attributeSet);
        if (LIZ != null) {
            setBackground(LIZ);
        }
    }
}
