package X;

/* renamed from: X.Evz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38015Evz {
    SG("https://jsb-sg.byteoversea.com/src/server/v2/package"),
    US("https://jsb-va.byteoversea.com/src/server/v2/package");

    public String url;

    public static EnumC38015Evz valueOf(String str) {
        return (EnumC38015Evz) V0N.LJJJ(EnumC38015Evz.class, str);
    }

    EnumC38015Evz(String str) {
        this.url = str;
    }
}
