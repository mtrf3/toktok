package X;

/* renamed from: X.QwJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68611QwJ implements InterfaceC68620QwS {
    public static final C68192QpY LIZ;

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ2.LJ("measurement.client.consent_state_v1", true);
        LIZ2.LJ("measurement.client.3p_consent_state_v1", true);
        LIZ2.LJ("measurement.service.consent_state_v1_W36", true);
        LIZ = LIZ2.LIZJ(203600L, "measurement.service.storage_consent_support_version");
    }

    @Override // X.InterfaceC68620QwS
    public final long zza() {
        return ((Long) LIZ.LIZIZ()).longValue();
    }
}
