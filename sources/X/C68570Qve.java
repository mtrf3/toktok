package X;

/* renamed from: X.Qve, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68570Qve implements InterfaceC68603QwB {
    public static final C68059QnP LIZ;
    public static final C68059QnP LIZIZ;
    public static final C68059QnP LIZJ;

    @Override // X.InterfaceC68603QwB
    public final void zza() {
    }

    static {
        C68559QvT LIZ2 = new C68559QvT(C48261Iwr.LIZ(), false, false).LIZ();
        LIZ2.LJ("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        LIZ = LIZ2.LJ("measurement.audience.refresh_event_count_filters_timestamp", false);
        LIZIZ = LIZ2.LJ("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        LIZJ = LIZ2.LJ("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // X.InterfaceC68603QwB
    public final boolean LIZ() {
        return ((Boolean) LIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68603QwB
    public final boolean LIZIZ() {
        return ((Boolean) LIZIZ.LIZIZ()).booleanValue();
    }

    @Override // X.InterfaceC68603QwB
    public final boolean LIZLLL() {
        return ((Boolean) LIZJ.LIZIZ()).booleanValue();
    }
}
