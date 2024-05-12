package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.TDa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74274TDa extends TDG {
    @Override // X.TDG
    public final View LJII(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C8HN c8hn = new C8HN(context);
        c8hn.setLayoutParams(layoutParams);
        c8hn.setGravity(17);
        c8hn.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        return c8hn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74274TDa(Context context, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, boolean z3, boolean z4, int i7, int i8, int i9, int i10) {
        super(context, z, 0, i, i2, 0, 0, i3, z2, 0, 0, i4, i5, 0, 0, i6, z3, z4, i7, i8, i9, i10, 0, false, false, false, 0, 0, false, false, false, false, false, false, 0, -4168096, 7);
        a1.LJFF(context, "context");
    }
}
