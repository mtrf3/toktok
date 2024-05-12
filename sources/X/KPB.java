package X;

/* loaded from: classes9.dex */
public enum KPB {
    CLOSED,
    OPENING,
    OPENED;

    public static final KPC Companion = new KPC();

    public static KPB valueOf(String str) {
        return (KPB) V0N.LJJJ(KPB.class, str);
    }
}
