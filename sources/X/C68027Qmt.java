package X;

/* renamed from: X.Qmt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68027Qmt extends AbstractC68102Qo6 {
    public final /* synthetic */ C68022Qmo LJ;

    @Override // X.AbstractC68102Qo6
    public final void LIZIZ() {
        C68022Qmo c68022Qmo = this.LJ;
        c68022Qmo.LJFF();
        if (!c68022Qmo.LJIIJJI()) {
            return;
        }
        c68022Qmo.LIZ.LIZJ().LJIILIIL.LIZ("Inactivity, disconnecting from the service");
        c68022Qmo.LJIJJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68027Qmt(C68022Qmo c68022Qmo, InterfaceC68124QoS interfaceC68124QoS) {
        super(interfaceC68124QoS);
        this.LJ = c68022Qmo;
    }
}
