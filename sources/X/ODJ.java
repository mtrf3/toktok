package X;

/* loaded from: classes11.dex */
public class ODJ extends OEL<Long> {
    public final /* synthetic */ ODK LIZJ;

    @Override // X.OEL
    public final int LIZIZ() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OEL
    public final void LIZ() {
        InterfaceC61584OEy interfaceC61584OEy;
        if (ODK.LJ.contains(Long.valueOf(((Long) this.LIZIZ).longValue())) && (interfaceC61584OEy = this.LIZJ.LIZLLL) != null) {
            OEP oep = (OEP) interfaceC61584OEy;
            if (oep.LIZIZ == null) {
                return;
            }
            if (oep.LIZ == null) {
                oep.LIZ = OAR.LIZ.LIZ();
            }
            oep.LIZ.execute(new C61544ODk(oep, oep.hashCode()));
        }
    }

    public ODJ(ODK odk) {
        this.LIZJ = odk;
    }
}
