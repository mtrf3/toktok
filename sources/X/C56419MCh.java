package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.library.impl.LibraryReuseServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.question.impl.QuestionDetailServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.tools.detail.ILibraryReuseService;

/* renamed from: X.MCh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56419MCh implements InterfaceC56420MCi {
    @Override // X.InterfaceC56420MCi
    public final void initialize() {
        ILibraryReuseService iLibraryReuseService;
        C61200O0e.LJII = true;
        C61200O0e.LIZ(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSplashActivityClass(), "aweme://main");
        C61200O0e.LIZ(Z8A.LIZIZ.profileActivityClz(), "aweme://profile_edit");
        C61200O0e.LIZ(AVExternalServiceImpl.LIZ().classnameService().getDraftBoxActivity(), "aweme://draft_box");
        C61200O0e.LIZ(ChallengeServiceImpl.LJFF().LIZJ(), "aweme://challenge/detail/:id");
        C61200O0e.LIZ(QuestionDetailServiceImpl.LIZJ().LIZ(), "aweme://qna/detail/:id");
        Class<? extends Activity> LJIIIZ = DetailFeedServiceImpl.LJIIJ().LJIIIZ();
        C61200O0e.LIZ(LJIIIZ, "aweme://aweme/detail/:id");
        C61200O0e.LIZ(LJIIIZ, "aweme://aweme/detaillist/:ids");
        C61200O0e.LIZ(LJIIIZ, "aweme://story/detail");
        C61200O0e.LIZ(CrossPlatformActivity.class, "aweme://webview/");
        C61200O0e.LIZ(CrossPlatformActivity.class, "aweme://webview/");
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        C39466FeI c39466FeI = new C39466FeI();
        LIZLLL.getClass();
        C61200O0e.LIZJ.put("aweme://aweme/challenge/detail/", c39466FeI);
        C61200O0e.LIZ(AVExternalServiceImpl.LIZ().classnameService().getVideoRecordPermissionActivityClass(), "aweme://studio/create");
        C61200O0e.LIZ(PropReuseServiceImpl.LJIIJ().LJII(), "aweme://stickers/detail/:id");
        Object LIZ = C58096Mr6.LIZ(ILibraryReuseService.class, false);
        if (LIZ != null) {
            iLibraryReuseService = (ILibraryReuseService) LIZ;
        } else {
            if (C58096Mr6.r2 == null) {
                synchronized (ILibraryReuseService.class) {
                    if (C58096Mr6.r2 == null) {
                        C58096Mr6.r2 = new LibraryReuseServiceImpl();
                    }
                }
            }
            iLibraryReuseService = C58096Mr6.r2;
        }
        C61200O0e.LIZ(iLibraryReuseService.LIZ(), "aweme://library/detail/:id");
    }
}
