package X;

/* renamed from: X.QwK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68612QwK implements InterfaceC68621QwT {
    public static final C68059QnP LIZ;

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ2.LIZJ(0L, "measurement.id.lifecycle.app_in_background_parameter");
        LIZ2.LJ("measurement.lifecycle.app_backgrounded_tracking", true);
        LIZ = LIZ2.LJ("measurement.lifecycle.app_in_background_parameter", false);
        LIZ2.LIZJ(0L, "measurement.id.lifecycle.app_backgrounded_tracking");
    }

    @Override // X.InterfaceC68621QwT
    public final boolean zza() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }
}
