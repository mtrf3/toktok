package X;

import com.ss.android.ugc.aweme.discover.model.Banner;

/* renamed from: X.OGg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C61618OGg {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Banner.BannerSchemaType.values().length];
        LIZ = iArr;
        try {
            iArr[Banner.BannerSchemaType.PLAYLIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[Banner.BannerSchemaType.AI_RECOMMEND_PLAYLIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[Banner.BannerSchemaType.MUSIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[Banner.BannerSchemaType.WEB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
