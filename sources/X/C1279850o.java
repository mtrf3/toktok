package X;

import com.ss.ugc.android.editor.track.TrackState;

/* renamed from: X.50o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C1279850o {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TrackState.values().length];
        try {
            iArr[TrackState.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackState.PIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackState.VIDEOEFFECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrackState.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TrackState.AUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TrackState.AUDIORECORD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
