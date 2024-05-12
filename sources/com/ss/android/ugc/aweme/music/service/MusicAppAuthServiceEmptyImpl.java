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
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicAppAuthServiceEmptyImpl implements IMusicAppAuthService {
    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String str4, String awemeId, String str5, String str6, String str7, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LIZLLL(Music music) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJ(int i, int i2, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJFF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJII(ReportData reportData) {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIIIZZ(Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final String LJIIIZ(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIJ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String awemeId, String str4, String str5, String str6, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJIIL(Music music, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILIIL(DspAuthParam dspAuthParam, ActivityC45651qj activityC45651qj) {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILJJIL(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String awemeId, String str4, String str5, String str6, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJIILL(Music music, String str, boolean z) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILLIIL(int i, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIZILJ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIJ(String str, String enterFrom, String str2, String str3, String str4, String buttonType, FragmentManager fragmentManager, Fragment fragment, Music music, TT2DSPSongInfo tT2DSPSongInfo, boolean z, boolean z2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(buttonType, "buttonType");
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final DspPlatform LJI(Music music) {
        return DspPlatform.UNKNOWN;
    }
}
