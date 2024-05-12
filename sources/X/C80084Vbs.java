package X;

import android.content.Context;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vbs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80084Vbs extends C1C9 {
    public final C62822Ol8 LJIILL;
    public float LJIILLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80084Vbs(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJIILL = C221108m2.LIZIZ(new AqS161S0200000_14(this, context, 28));
        this.LJIILLIIL = 1.0f;
    }

    @Override // X.C1C9
    public final int LJIIL(int i) {
        return (int) Math.ceil(Math.abs(i) * this.LJIILLIIL);
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return AnonymousClass030.LIZJ(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
    }
}
