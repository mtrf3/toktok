package X;

/* renamed from: X.UzK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78990UzK extends QNA {
    public final /* synthetic */ InterfaceC78991UzL LIZ;

    @Override // X.QNA
    public final void LIZ() {
        InterfaceC78991UzL interfaceC78991UzL = this.LIZ;
        if (interfaceC78991UzL != null) {
            interfaceC78991UzL.LIZJ();
        }
    }

    @Override // X.QNA
    public final void LIZJ() {
        InterfaceC78991UzL interfaceC78991UzL = this.LIZ;
        if (interfaceC78991UzL != null) {
            interfaceC78991UzL.LJFF();
        }
    }

    @Override // X.QNA
    public final void LIZLLL() {
        InterfaceC78991UzL interfaceC78991UzL = this.LIZ;
        if (interfaceC78991UzL != null) {
            interfaceC78991UzL.LJI();
        }
    }

    public C78990UzK(InterfaceC78991UzL interfaceC78991UzL) {
        this.LIZ = interfaceC78991UzL;
    }

    @Override // X.QNA
    public final void LIZIZ(int i, boolean z) {
        InterfaceC78991UzL interfaceC78991UzL;
        if (z && (interfaceC78991UzL = this.LIZ) != null) {
            interfaceC78991UzL.onSuccess();
        }
    }
}
