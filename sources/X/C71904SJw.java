package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.SJw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71904SJw extends Drawable.ConstantState {
    public final C71902SJu LIZ;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.LIZ;
    }

    public C71904SJw(C71902SJu drawable) {
        o.LJIIIZ(drawable, "drawable");
        this.LIZ = drawable;
    }
}
