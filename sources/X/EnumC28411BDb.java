package X;

/* renamed from: X.BDb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC28411BDb {
    GUIDE,
    MODERATOR_LIST;

    public static EnumC28411BDb valueOf(String str) {
        return (EnumC28411BDb) V0N.LJJJ(EnumC28411BDb.class, str);
    }

    public final BBP toBroadcastDialogPage() {
        if (C28412BDc.LIZ[ordinal()] == 1) {
            return BBP.MODERATOR_LIST;
        }
        return BBP.GUIDE;
    }
}
