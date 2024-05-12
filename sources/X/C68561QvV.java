package X;

/* renamed from: X.QvV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68561QvV implements InterfaceC68602QwA {
    public static final C68059QnP LIZ;
    public static final C68059QnP LIZIZ;
    public static final C68059QnP LIZJ;
    public static final C68059QnP LIZLLL;
    public static final C68059QnP LJ;
    public static final C68059QnP LJFF;

    @Override // X.InterfaceC68602QwA
    public final void zza() {
    }

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZIZ().LIZ();
        LIZ = LIZ2.LJ("measurement.adid_zero.app_instance_id_fix", true);
        LIZIZ = LIZ2.LJ("measurement.adid_zero.service", true);
        LIZJ = LIZ2.LJ("measurement.adid_zero.adid_uid", true);
        LIZLLL = LIZ2.LJ("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        LJ = LIZ2.LJ("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        LJFF = LIZ2.LJ("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // X.InterfaceC68602QwA
    public final boolean LIZ() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68602QwA
    public final boolean LIZIZ() {
        return ((Boolean) LIZIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68602QwA
    public final boolean LIZJ() {
        return ((Boolean) LJFF.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68602QwA
    public final boolean LIZLLL() {
        return ((Boolean) LIZJ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68602QwA
    public final boolean LJ() {
        return ((Boolean) LIZLLL.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68602QwA
    public final boolean LJIIIIZZ() {
        return ((Boolean) LJ.LIZIZ()).booleanValue();
    }
}
