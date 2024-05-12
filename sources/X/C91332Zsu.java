package X;

/* renamed from: X.Zsu, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91332Zsu implements InterfaceC91059ZoV {
    public final /* synthetic */ C91330Zss LIZ;

    public C91332Zsu(C91330Zss c91330Zss) {
        this.LIZ = c91330Zss;
    }

    @Override // X.InterfaceC91059ZoV
    public final void LIZ(long j, boolean z) {
        EnumC91311ZsZ enumC91311ZsZ;
        InterfaceC91289ZsD interfaceC91289ZsD = this.LIZ.LJLIL;
        if (z) {
            enumC91311ZsZ = EnumC91311ZsZ.SEEK_SUCCESS;
        } else {
            enumC91311ZsZ = EnumC91311ZsZ.SEEK_FAILED;
        }
        interfaceC91289ZsD.onSeekStateChanged(enumC91311ZsZ, j);
    }
}
