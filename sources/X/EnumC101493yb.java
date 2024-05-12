package X;

/* renamed from: X.3yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101493yb {
    EVERYONE,
    EVERYONE_CREATORS,
    MAF,
    FRIENDS,
    FRIENDS_BEFORE_SEND,
    NO_ONE;

    public static EnumC101493yb valueOf(String str) {
        return (EnumC101493yb) V0N.LJJJ(EnumC101493yb.class, str);
    }

    public final EnumC101503yc toEventTrackingPermission() {
        switch (C101513yd.LIZ[ordinal()]) {
            case 1:
            case 2:
                return EnumC101503yc.EVERYONE;
            case 3:
            case 4:
                return EnumC101503yc.FRIENDS;
            case 5:
                return EnumC101503yc.SUGGESTED_FRIENDS;
            case 6:
                return EnumC101503yc.NO_ONE;
            default:
                throw new C162476Zf();
        }
    }

    public final int toSettingCons() {
        switch (C101513yd.LIZ[ordinal()]) {
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 3;
            default:
                throw new C162476Zf();
        }
    }
}
