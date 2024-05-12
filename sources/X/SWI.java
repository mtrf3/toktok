package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.service.IMusicAppAuthService;
import com.ss.android.ugc.aweme.music.service.MusicAppAuthServiceEmptyImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWI implements IMusicAppAuthService {
    public static final SWI LIZIZ = new SWI();
    public final /* synthetic */ IMusicAppAuthService LIZ;

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String str4, String awemeId, String str5, String str6, String str7, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        this.LIZ.LIZIZ(activityC45651qj, fragment, str, str2, str3, str4, awemeId, str5, str6, str7, startAuthFlowStatus, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LIZLLL(Music music) {
        return this.LIZ.LIZLLL(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJ(int i, int i2, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJ(i, i2, intent, activityC45651qj, fragment, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final DspPlatform LJI(Music music) {
        return this.LIZ.LJI(music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJII(ReportData reportData) {
        this.LIZ.LJII(reportData);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIIIZZ(Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJIIIIZZ(intent, activityC45651qj, fragment, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final String LJIIIZ(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        return this.LIZ.LJIIIZ(dspPlatform);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIJ(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String awemeId, String str4, String str5, String str6, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        this.LIZ.LJIIJ(activityC45651qj, fragment, str, str2, str3, awemeId, str4, str5, str6, startAuthFlowStatus, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIJJI(String str, String str2) {
        this.LIZ.LJIIJJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJIIL(Music music, String str) {
        return this.LIZ.LJIIL(music, str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILIIL(DspAuthParam dspAuthParam, ActivityC45651qj activityC45651qj) {
        this.LIZ.LJIILIIL(dspAuthParam, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILJJIL(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2, String str3, String awemeId, String str4, String str5, String str6, C9A8 startAuthFlowStatus, boolean z) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(startAuthFlowStatus, "startAuthFlowStatus");
        this.LIZ.LJIILJJIL(activityC45651qj, fragment, str, str2, str3, awemeId, str4, str5, str6, startAuthFlowStatus, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final boolean LJIILL(Music music, String str, boolean z) {
        return this.LIZ.LJIILL(music, str, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIILLIIL(int i, Intent intent, ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJIILLIIL(i, intent, activityC45651qj, fragment, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIIZILJ(String str) {
        this.LIZ.LJIIZILJ(str);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicAppAuthService
    public final void LJIJ(String str, String enterFrom, String str2, String str3, String str4, String buttonType, FragmentManager fragmentManager, Fragment fragment, Music music, TT2DSPSongInfo tT2DSPSongInfo, boolean z, boolean z2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(buttonType, "buttonType");
        this.LIZ.LJIJ(str, enterFrom, str2, str3, str4, buttonType, fragmentManager, fragment, music, tT2DSPSongInfo, z, z2);
    }

    public SWI() {
        Object LIZ;
        IMusicAppAuthService musicAppAuthServiceEmptyImpl;
        try {
            LIZ = Class.forName("com.ss.android.ugc.aweme.music.app.auth.service.MusicAppAuthServiceImpl");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Class cls = (Class) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (cls != null) {
            ServiceManager serviceManager = ServiceManager.get();
            Class<IMusicAppAuthService> cls2 = SWP.LIZ;
            serviceManager.bind(cls2, new C58605MzJ(cls)).asSingleton();
            musicAppAuthServiceEmptyImpl = (IMusicAppAuthService) ServiceManager.get().getService(cls2);
        } else {
            musicAppAuthServiceEmptyImpl = new MusicAppAuthServiceEmptyImpl();
        }
        this.LIZ = musicAppAuthServiceEmptyImpl;
    }
}
