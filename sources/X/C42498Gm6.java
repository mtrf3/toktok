package X;

import com.ss.android.ugc.aweme.commerce.tools.music.experiment.MusicUsageCheckboxConfig;

/* renamed from: X.Gm6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42498Gm6 {
    public static final MusicUsageCheckboxConfig LIZ = new MusicUsageCheckboxConfig(true, MusicUsageCheckboxConfig.PostAction.NO_ACTION, true);

    static {
        new MusicUsageCheckboxConfig(false, MusicUsageCheckboxConfig.PostAction.TOAST, false);
        new MusicUsageCheckboxConfig(false, MusicUsageCheckboxConfig.PostAction.DIALOG, false);
    }

    public static MusicUsageCheckboxConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        MusicUsageCheckboxConfig musicUsageCheckboxConfig = LIZ;
        LJIIIZ.getClass();
        MusicUsageCheckboxConfig musicUsageCheckboxConfig2 = (MusicUsageCheckboxConfig) FFL.LJIJ(true, "csp_music_usage_checkbox", 31744, MusicUsageCheckboxConfig.class, musicUsageCheckboxConfig);
        if (musicUsageCheckboxConfig2 == null) {
            return musicUsageCheckboxConfig;
        }
        return musicUsageCheckboxConfig2;
    }
}
