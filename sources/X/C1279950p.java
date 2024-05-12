package X;

import com.ss.ugc.android.editor.track.TrackState;

/* renamed from: X.50p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C1279950p {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TrackState.values().length];
        try {
            iArr[TrackState.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackState.AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackState.PIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrackState.TEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TrackState.STICKER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TrackState.ADJUST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TrackState.FILTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TrackState.VIDEOEFFECT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        LIZ = iArr;
    }
}
