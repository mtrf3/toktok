package X;

/* loaded from: classes16.dex */
public final class YOR implements InterfaceC134025Nu {
    public final /* synthetic */ YOG LIZ;

    public YOR(YOG yog) {
        this.LIZ = yog;
    }

    @Override // X.InterfaceC134025Nu
    public final void LIZ() {
        InterfaceC134025Nu interfaceC134025Nu;
        if (this.LIZ.LIZIZ.compareAndSet(false, true) && (interfaceC134025Nu = this.LIZ.LIZJ) != null) {
            interfaceC134025Nu.LIZ();
        }
    }
}
