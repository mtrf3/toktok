package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: X.XWq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C84976XWq {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC84975XWp.values().length];
        LIZIZ = iArr;
        try {
            iArr[EnumC84975XWp.COLLECT_MUSIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[EnumC84975XWp.LOCAL_MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[EnumC84975XWp.SECOND_PAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[EnumC84975XWp.FOR_YOU_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[MusicModel.MusicItemType.values().length];
        LIZ = iArr2;
        try {
            iArr2[MusicModel.MusicItemType.SEE_MORE_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[MusicModel.MusicItemType.MUSIC_SECTION_TITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[MusicModel.MusicItemType.LOADING_VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
