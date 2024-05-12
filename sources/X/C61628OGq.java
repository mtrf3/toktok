package X;

import com.ss.android.ugc.aweme.discover.model.Banner;

/* renamed from: X.OGq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C61628OGq {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[Banner.BannerSchemaType.values().length];
        LIZIZ = iArr;
        try {
            iArr[Banner.BannerSchemaType.MUSIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[Banner.BannerSchemaType.PLAYLIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[EnumC61629OGr.values().length];
        LIZ = iArr2;
        try {
            iArr2[EnumC61629OGr.TAB_TYPE_DISCOVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[EnumC61629OGr.TAB_TYPE_FOR_YOU.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[EnumC61629OGr.TAB_TYPE_COLLECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[EnumC61629OGr.TAB_TYPE_LOCAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[EnumC61629OGr.TAB_TYPE_MORE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
