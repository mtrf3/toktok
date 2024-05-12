package com.ss.android.ugc.aweme.simreporterdt.report;

import X.C46554IOw;
import X.C46575IPr;
import X.C46648ISm;
import X.IPA;
import X.IQY;
import X.IRV;
import X.ISM;
import X.IT2;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;

/* loaded from: classes9.dex */
public interface IPlayerEventReporter {
    void LIZ();

    void LIZIZ(IQY iqy, VideoInfo videoInfo);

    void LIZJ(ISM ism);

    void LIZLLL(int i, VideoInfo videoInfo, IRV irv);

    void LJ(VideoInfo videoInfo, C46554IOw c46554IOw, long j, String str, boolean z);

    void LJFF();

    void LJI(C46575IPr c46575IPr, VideoInfo videoInfo);

    void LJII(IT2 it2, VideoInfo videoInfo);

    void LJIIIIZZ();

    void LJIIIZ(UpdateCallback updateCallback);

    void LJIIJ();

    void LJIIJJI();

    void LJIIL();

    void LJIILIIL();

    void LJIILJJIL(IPA ipa, VideoInfo videoInfo);

    void LJIILL(String str, VideoInfo videoInfo, C46648ISm c46648ISm);

    void init();

    void release();
}
