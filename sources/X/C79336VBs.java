package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.VBs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C79336VBs {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC79337VBt.values().length];
        LIZIZ = iArr;
        try {
            iArr[EnumC79337VBt.RENDERING_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[EnumC79337VBt.MEDIA_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[EnumC79337VBt.PLAY_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[EnumC79337VBt.PREPARED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZIZ[EnumC79337VBt.VIDEO_SIZE_CHANGED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZIZ[EnumC79337VBt.SEI_UPDATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZIZ[EnumC79337VBt.BUFFERING_START.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZIZ[EnumC79337VBt.BUFFERING_END.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZIZ[EnumC79337VBt.RESOLUTION_DEGRADE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            LIZIZ[EnumC79337VBt.ABR_NEW_RESOLUTION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            LIZIZ[EnumC79337VBt.TEXTURE_RENDER_DRAW_FRAME.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr2 = new int[LiveMode.values().length];
        LIZ = iArr2;
        try {
            iArr2[LiveMode.AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            LIZ[LiveMode.THIRD_PARTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            LIZ[LiveMode.SCREEN_RECORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
