package X;

/* renamed from: X.QwF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68607QwF implements InterfaceC68610QwI {
    public static final C68059QnP LIZ;

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ2.LJ("measurement.sdk.collection.enable_extend_user_property_size", true);
        LIZ2.LJ("measurement.sdk.collection.last_deep_link_referrer2", true);
        LIZ = LIZ2.LJ("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        LIZ2.LIZJ(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    @Override // X.InterfaceC68610QwI
    public final boolean zza() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }
}
