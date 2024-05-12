package X;

/* renamed from: X.3yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101503yc {
    EVERYONE("EVERYONE", "Everyone"),
    SUGGESTED_FRIENDS("SUGGESTED_FRIENDS", "Suggested_friends"),
    FRIENDS("FRIENDS", "Friends"),
    NO_ONE("NO_ONE", "No_one");

    public final String LJLIL;
    public final int LJLILLLLZI;

    public static EnumC101503yc valueOf(String str) {
        return (EnumC101503yc) V0N.LJJJ(EnumC101503yc.class, str);
    }

    public final int getEventTrackingInt() {
        return this.LJLILLLLZI;
    }

    public final String getEventTrackingString() {
        return this.LJLIL;
    }

    EnumC101503yc(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
