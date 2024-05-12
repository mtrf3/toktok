package X;

/* renamed from: X.EkA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37282EkA implements InterfaceC37283EkB {
    public final /* synthetic */ InterfaceC67352kd<Long> LIZ;

    public C37282EkA(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC37283EkB
    public final void LIZ(long j, boolean z) {
        InterfaceC67352kd<Long> interfaceC67352kd = this.LIZ;
        if (!z || j <= 0) {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        C3C5.m7constructorimpl(valueOf);
        interfaceC67352kd.resumeWith(valueOf);
    }
}
