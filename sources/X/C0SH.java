package X;

import android.content.Context;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0SH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SH extends EdgeEffect {
    public final float LIZ;
    public float LIZIZ;

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.LIZIZ = 0.0f;
        super.onRelease();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SH(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZ = C78847Ux1.LIZIZ(context).LJJJJIZL(1);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.LIZIZ = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.LIZIZ = 0.0f;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.LIZIZ = 0.0f;
        super.onPull(f, f2);
    }
}
