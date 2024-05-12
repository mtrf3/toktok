package X;

/* renamed from: X.Qvb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68567Qvb implements InterfaceC68072Qnc {
    public static final C68059QnP LIZ;

    @Override // X.InterfaceC68072Qnc
    public final void zza() {
    }

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ2.LJ("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        LIZ = LIZ2.LJ("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // X.InterfaceC68072Qnc
    public final boolean LIZ() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }
}
