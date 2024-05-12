package X;

import com.ss.ugc.android.editor.track.TrackState;

/* renamed from: X.50m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C1279650m {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[EnumC1280050q.values().length];
        try {
            iArr[EnumC1280050q.USER_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1280050q.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1280050q.AUTO_PLAY_SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC123864ta.values().length];
        try {
            iArr2[EnumC123864ta.STICKER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC123864ta.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC123864ta.AUDIO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC123864ta.EFFECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC123864ta.FILTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[TrackState.values().length];
        try {
            iArr3[TrackState.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[TrackState.PIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[TrackState.VIDEOEFFECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[TrackState.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[TrackState.AUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[TrackState.AUDIORECORD.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[TrackState.STICKER.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[TrackState.ADJUST.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[TrackState.FILTER.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        LIZJ = iArr3;
    }
}
