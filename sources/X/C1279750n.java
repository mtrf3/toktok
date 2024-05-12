package X;

import com.ss.ugc.android.editor.track.TrackState;

/* renamed from: X.50n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C1279750n {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TrackState.values().length];
        try {
            iArr[TrackState.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackState.STICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackState.TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrackState.PIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TrackState.AUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TrackState.VIDEOEFFECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TrackState.AUDIORECORD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TrackState.ADJUST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TrackState.FILTER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        LIZ = iArr;
    }
}
