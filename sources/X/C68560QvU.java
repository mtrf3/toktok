package X;

/* renamed from: X.QvU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68560QvU implements InterfaceC68551QvL {
    public static final C68059QnP LIZ;
    public static final C68059QnP LIZIZ;
    public static final C68059QnP LIZJ;
    public static final C68059QnP LIZLLL;

    @Override // X.InterfaceC68551QvL
    public final void zza() {
    }

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZIZ().LIZ();
        LIZ = LIZ2.LJ("measurement.enhanced_campaign.client", true);
        LIZIZ = LIZ2.LJ("measurement.enhanced_campaign.service", true);
        LIZJ = LIZ2.LJ("measurement.enhanced_campaign.srsltid.client", true);
        LIZLLL = LIZ2.LJ("measurement.enhanced_campaign.srsltid.service", true);
    }

    @Override // X.InterfaceC68551QvL
    public final boolean LIZ() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68551QvL
    public final boolean LIZIZ() {
        return ((Boolean) LIZIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68551QvL
    public final boolean LIZLLL() {
        return ((Boolean) LIZJ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68551QvL
    public final boolean LJ() {
        return ((Boolean) LIZLLL.LIZIZ()).booleanValue();
    }
}
