package X;

/* renamed from: X.3GR, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3GR {
    CONFIG_SYNC(23),
    GECKO_ONLINE_SYNC(8),
    GECKO_BOE_SYNC(57),
    IM_CONTACT_SYNC_DID(38),
    IM_CONTACT_SYNC_UID(40),
    IM_CONTACT_BOE_SYNC(150),
    RELATION_STORAGE_ONLINE(41),
    RELATION_STORAGE_BOE(153),
    SOCIAL_2_TAB_RED_DOT_ONLINE(47),
    SOCIAL_2_TAB_RED_DOT_BOE(154);

    public final long LJLIL;

    public static C3GR valueOf(String str) {
        return (C3GR) V0N.LJJJ(C3GR.class, str);
    }

    public final long getServerId() {
        return this.LJLIL;
    }

    C3GR(long j) {
        this.LJLIL = j;
    }
}
