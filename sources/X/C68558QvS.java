package X;

/* renamed from: X.QvS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68558QvS implements InterfaceC68594Qw2 {
    public static final C68059QnP LIZ;
    public static final C68059QnP LIZIZ;
    public static final C68059QnP LIZJ;
    public static final C68059QnP LIZLLL;
    public static final C68059QnP LJ;
    public static final C68059QnP LJFF;
    public static final C68059QnP LJI;
    public static final C68059QnP LJII;
    public static final C68059QnP LJIIIIZZ;
    public static final C68059QnP LJIIIZ;
    public static final C68059QnP LJIIJ;
    public static final C68059QnP LJIIJJI;

    @Override // X.InterfaceC68594Qw2
    public final void zza() {
    }

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZIZ().LIZ();
        LIZ = LIZ2.LJ("measurement.redaction.app_instance_id", true);
        LIZIZ = LIZ2.LJ("measurement.redaction.client_ephemeral_aiid_generation", true);
        LIZJ = LIZ2.LJ("measurement.redaction.config_redacted_fields", true);
        LIZLLL = LIZ2.LJ("measurement.redaction.device_info", true);
        LJ = LIZ2.LJ("measurement.redaction.e_tag", false);
        LJFF = LIZ2.LJ("measurement.redaction.enhanced_uid", true);
        LJI = LIZ2.LJ("measurement.redaction.populate_ephemeral_app_instance_id", true);
        LJII = LIZ2.LJ("measurement.redaction.google_signals", true);
        LJIIIIZZ = LIZ2.LJ("measurement.redaction.no_aiid_in_config_request", true);
        LJIIIZ = LIZ2.LJ("measurement.redaction.upload_redacted_fields", true);
        LJIIJ = LIZ2.LJ("measurement.redaction.upload_subdomain_override", true);
        LJIIJJI = LIZ2.LJ("measurement.redaction.user_id", true);
        LIZ2.LIZJ(0L, "measurement.id.redaction");
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LIZ() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LIZIZ() {
        return ((Boolean) LIZIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LIZJ() {
        return ((Boolean) LJFF.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LIZLLL() {
        return ((Boolean) LIZJ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJ() {
        return ((Boolean) LIZLLL.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJI() {
        return ((Boolean) LJI.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJII() {
        return ((Boolean) LJII.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJIIIIZZ() {
        return ((Boolean) LJ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJIIJ() {
        return ((Boolean) LJIIJ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJIIJJI() {
        return ((Boolean) LJIIIIZZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJIIL() {
        return ((Boolean) LJIIIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68594Qw2
    public final boolean LJIIZILJ() {
        return ((Boolean) LJIIJJI.LIZIZ()).booleanValue();
    }
}
