package X;

import java.util.Arrays;

/* renamed from: X.Q3p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66385Q3p {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    public final boolean LJLIL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC66385Q3p[] valuesCustom() {
        return (EnumC66385Q3p[]) Arrays.copyOf(values(), 12);
    }

    public final boolean fromInstagram() {
        int i = C66386Q3q.LIZ[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public final boolean canExtendToken() {
        return this.LJLIL;
    }

    EnumC66385Q3p(boolean z) {
        this.LJLIL = z;
    }
}
