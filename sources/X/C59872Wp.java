package X;

/* renamed from: X.2Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59872Wp extends AbstractC65781Prl implements InterfaceC88473Ynt<Boolean, Long, String, C76800UCe> {
    public static final C59872Wp LJLIL = new C59872Wp();

    public C59872Wp() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Boolean bool, Long l, String str) {
        String str2;
        boolean booleanValue = bool.booleanValue();
        long longValue = l.longValue();
        String str3 = str;
        C188727au LIZLLL = KNV.LIZLLL(str3, "anchorId");
        LIZLLL.LJIIIZ("action_type", "click");
        LIZLLL.LJIIIZ("anchor_id", str3);
        LIZLLL.LJIIIZ("room_id", String.valueOf(longValue));
        LIZLLL.LJIIIZ("enter_from_merge", "homepage_hot");
        LIZLLL.LJIIIZ("enter_method", "video_head");
        if (booleanValue) {
            str2 = "live_on";
        } else {
            str2 = "live_off";
        }
        LIZLLL.LJIIIZ("status", str2);
        FMX.LJIIL("livesdk_live_status_change", LIZLLL.LIZ);
        return C76800UCe.LIZ;
    }
}
