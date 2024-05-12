package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134525Ps extends F9E {
    public final C5PL LJLIL;
    public final boolean LJLILLLLZI;

    public C134525Ps() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C134525Ps(int i) {
        this(C5PL.FREE, true);
    }

    public C134525Ps(C5PL currentCropMode, boolean z) {
        o.LJIIIZ(currentCropMode, "currentCropMode");
        this.LJLIL = currentCropMode;
        this.LJLILLLLZI = z;
    }
}
