package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I8Y extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C46118I8c LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I8Y(C46118I8c c46118I8c) {
        super(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 2);
        this.LJLJJLL = c46118I8c;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        AnonymousClass632.LIZIZ(this.LJLJJLL.getSceneContext());
        C41658GWo LIZLLL = C41658GWo.LIZLLL();
        C46118I8c c46118I8c = this.LJLJJLL;
        LIZLLL.LJFF = c46118I8c.LJLJL.creativeModel.privacySettingModel.isSubscribeOnly;
        AVExternalServiceImpl.LIZ().provideAVPerformance().start(OpenMusicPanelPerformanceMonitor.INSTANCE, "start_choose_music");
        ShortVideoContextViewModel shortVideoContextViewModel = c46118I8c.LJLLI;
        if (shortVideoContextViewModel != null) {
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.LJLIL;
            ICommerceToolsMissionService LJIIJ = CommerceToolsMissionService.LJIIJ();
            Activity requireActivity = c46118I8c.requireActivity();
            ShortVideoContextViewModel shortVideoContextViewModel2 = c46118I8c.LJLLI;
            if (shortVideoContextViewModel2 != null) {
                LJIIJ.LJ(requireActivity, shortVideoContextViewModel2.LJLIL);
                if (C6ZS.LIZ(v)) {
                    return;
                }
                C60903NvH.LJIIJJI().LJJI().sceneReport("click_music_entrance_shoot");
                if (shortVideoContext.LJJIJIIJI()) {
                    return;
                }
                c46118I8c.LJLJJI.LJLLLL.LJII(C76800UCe.LIZ);
                I3Q.LIZ(I3P.CHOOSE_MUSIC);
                return;
            }
            o.LJIJI("shortVideoContextViewModel");
            throw null;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }
}
