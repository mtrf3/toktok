package X;

/* renamed from: X.XFb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84519XFb implements P85 {
    public final /* synthetic */ HV5 LIZ;

    public C84519XFb(HV5 hv5) {
        this.LIZ = hv5;
    }

    @Override // X.P85
    public final void onException(Throwable th) {
        InterfaceC84524XFg interfaceC84524XFg = (InterfaceC84524XFg) ((XFZ) this.LIZ).LJII.getValue();
        if (interfaceC84524XFg != null) {
            interfaceC84524XFg.ensureNotReachHere(th);
        }
    }
}
