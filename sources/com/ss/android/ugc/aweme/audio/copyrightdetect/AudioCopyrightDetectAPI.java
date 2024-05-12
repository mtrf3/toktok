package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C221108m2;
import X.C3VS;
import X.C62822Ol8;
import X.E4Q;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC37276Ek4;

/* loaded from: classes2.dex */
public final class AudioCopyrightDetectAPI {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C3VS.LJLIL);

    /* loaded from: classes2.dex */
    public interface MusicCheckApi {
        @E4Q("/tiktok/v1/post/settings/")
        InterfaceC37276Ek4<AutoCheckResponse> getAutoCheck();

        @E4T("/aweme/v1/music/precheck/")
        InterfaceC37276Ek4<PreCheckResult> preCheck(@InterfaceC27211Am7 PreCheckRequest preCheckRequest);

        @E4T("/tiktok/v1/post/settings/update/")
        InterfaceC37276Ek4<AutoCheckResponse> updateAutoCheck(@InterfaceC27211Am7 AutoCheckRequest autoCheckRequest);
    }

    public final boolean LIZ() {
        Integer precheck_music;
        try {
            AutoCheckResponse autoCheckResponse = ((MusicCheckApi) this.LIZ.getValue()).getAutoCheck().execute().LIZIZ;
            if (autoCheckResponse != null && (precheck_music = autoCheckResponse.getPrecheck_music()) != null) {
                if (precheck_music.intValue() == 1) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
            e.getMessage();
        }
        return false;
    }

    public final boolean LIZIZ(boolean z) {
        int i;
        try {
            int value = AutoCheckType.PR_CHECK_MUSIC.getValue();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            Integer precheck_music = ((MusicCheckApi) this.LIZ.getValue()).updateAutoCheck(new AutoCheckRequest(value, Integer.valueOf(i))).execute().LIZIZ.getPrecheck_music();
            if (precheck_music == null) {
                return false;
            }
            if (precheck_music.intValue() != 1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.getMessage();
            e.getMessage();
            return false;
        }
    }
}
