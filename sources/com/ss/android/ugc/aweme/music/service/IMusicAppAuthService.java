package com.ss.android.ugc.aweme.music.service;

import X.ActivityC45651qj;
import X.C9A8;
import X.InterfaceC65784Pro;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.report.model.ReportData;

/* loaded from: classes13.dex */
public interface IMusicAppAuthService {
    void LIZ(String str);

    void LIZIZ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C9A8 c9a8, boolean z);

    void LIZJ();

    boolean LIZLLL(Music music);

    void LJ(int i, int i2, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro);

    boolean LJFF();

    DspPlatform LJI(Music music);

    void LJII(ReportData reportData);

    void LJIIIIZZ(Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro);

    String LJIIIZ(DspPlatform dspPlatform);

    void LJIIJ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9A8 c9a8, boolean z);

    void LJIIJJI(String str, String str2);

    boolean LJIIL(Music music, String str);

    void LJIILIIL(DspAuthParam dspAuthParam, ActivityC45651qj activityC45651qj);

    void LJIILJJIL(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String str4, String str5, String str6, String str7, C9A8 c9a8, boolean z);

    boolean LJIILL(Music music, String str, boolean z);

    void LJIILLIIL(int i, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro);

    void LJIIZILJ(String str);

    void LJIJ(String str, String str2, String str3, String str4, String str5, String str6, FragmentManager fragmentManager, Fragment fragment, Music music, TT2DSPSongInfo tT2DSPSongInfo, boolean z, boolean z2);
}
