package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.SJz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71907SJz extends Drawable.ConstantState {
    public final SY9 LIZ;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.LIZ;
    }

    public C71907SJz(SY9 drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LIZ = drawable;
    }
}
