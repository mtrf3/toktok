package X;

/* renamed from: X.EpK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37602EpK implements InterfaceC37489EnV {
    public final /* synthetic */ InterfaceC37276Ek4 LIZ;

    public C37602EpK(InterfaceC37276Ek4 interfaceC37276Ek4) {
        this.LIZ = interfaceC37276Ek4;
    }

    @Override // X.InterfaceC37489EnV
    public final void release() {
        this.LIZ.cancel();
    }
}
