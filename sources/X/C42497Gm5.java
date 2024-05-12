package X;

import com.ss.android.ugc.aweme.commerce.tools.music.experiment.MusicUsageCheckboxConfig;

/* renamed from: X.Gm5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C42497Gm5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[MusicUsageCheckboxConfig.PostAction.values().length];
        try {
            iArr[MusicUsageCheckboxConfig.PostAction.DIALOG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MusicUsageCheckboxConfig.PostAction.TOAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MusicUsageCheckboxConfig.PostAction.NO_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
