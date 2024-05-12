package X;

import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WU5 implements WUE {
    public final /* synthetic */ WU4 LIZ;

    public WU5(WU4 wu4) {
        this.LIZ = wu4;
    }

    @Override // X.WUE
    public final void onStartLive() {
        H78.LIZ("OnLiveStartListener#onStartLive");
        RecordLiveViewModel recordLiveViewModel = this.LIZ.LJLJJL;
        if (recordLiveViewModel != null) {
            InterfaceC83670Wsc audioController = recordLiveViewModel.gv0().e8().getAudioController();
            C83728WtY c83728WtY = C83728WtY.LIZIZ;
            EnumC83730Wta enumC83730Wta = EnumC83730Wta.STOP_AUDIO_SWITCH_TO_LIVE;
            EnumC158826Le enumC158826Le = EnumC158826Le.USER_OPERATION;
            audioController.LJI(c83728WtY.LIZJ(enumC83730Wta, enumC158826Le), false);
            recordLiveViewModel.gv0().C7(false, c83728WtY.LIZJ(EnumC83730Wta.CLOSE_CAMERA_SWITCH_TO_LIVE, enumC158826Le));
            return;
        }
        o.LJIJI("recordLiveViewModel");
        throw null;
    }
}
