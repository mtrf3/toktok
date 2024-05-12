package X;

/* renamed from: X.Xoz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85993Xoz {
    FACEBOOK,
    TWITTER,
    GOOGLE,
    LINE,
    KAKAOTALK,
    INSTAGRAM,
    VK,
    GOOGLE_ONETAP;

    public String getPassportPlatformName() {
        switch (C85995Xp1.LIZ[ordinal()]) {
            case 1:
                return "facebook";
            case 2:
                return "twitter";
            case 3:
            case 4:
                return "google";
            case 5:
                return "line";
            case 6:
                return "instagram";
            case 7:
                return "kakaotalk";
            case 8:
                return "vk";
            default:
                return "";
        }
    }

    public boolean isSupportedForLogin() {
        if (!getPassportPlatformName().isEmpty() && !"instagram".equals(getPassportPlatformName())) {
            return true;
        }
        return false;
    }

    public static EnumC85993Xoz valueOf(String str) {
        return (EnumC85993Xoz) V0N.LJJJ(EnumC85993Xoz.class, str);
    }
}
