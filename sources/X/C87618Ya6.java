package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ya6, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87618Ya6 implements InterfaceC43351Gzr {
    public final /* synthetic */ C87612Ya0 LIZ;

    public C87618Ya6(C87612Ya0 c87612Ya0) {
        this.LIZ = c87612Ya0;
    }

    @Override // X.InterfaceC43351Gzr
    public final void LIZ(Object obj, boolean z) {
        this.LIZ.LIZ.LIZ(new C87620Ya8(this, obj, z));
    }

    @Override // X.InterfaceC43351Gzr
    public final void LIZIZ(int i, Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.LIZ.LIZ(new C87617Ya5(this, t, i));
    }

    @Override // X.InterfaceC43351Gzr
    public final void LIZJ(Object obj, EnumC43531H6p dispatchPath) {
        o.LJIIIZ(dispatchPath, "dispatchPath");
        this.LIZ.LIZ.LIZ(new C87619Ya7(this, obj, dispatchPath));
    }
}
