package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I36 extends I35 {
    public final C82622Wbi LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.WSH
    public final WT3 provideScene() {
        return (WT3) this.LJLJI.getValue();
    }

    public I36(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLILLLLZI = diContainer;
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 757));
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        I38 i38 = I38.LIVE;
        String string = ((Context) this.LJLILLLLZI.LJ(ActivityC45651qj.class, null)).getString(i38.getNameResId());
        o.LJIIIIZZ(string, "context.getString(this)");
        return new WSF(string, i38.getTag(), "live", c45850Hz4.LIZLLL().mToLive, new I33(c45850Hz4, this));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        RecordLiveViewModel recordLiveViewModel = (RecordLiveViewModel) ((ViewModelProvider) this.LJLILLLLZI.LJ(ViewModelProvider.class, null)).get(RecordLiveViewModel.class);
        IRecordingOperationPanel iRecordingOperationPanel = c45850Hz4.LIZIZ;
        if (iRecordingOperationPanel != null) {
            recordLiveViewModel.LJLIL = iRecordingOperationPanel;
            recordLiveViewModel.LJLILLLLZI = c45850Hz4.LIZIZ();
            recordLiveViewModel.LJLJJI = c45850Hz4.LIZLLL();
            recordLiveViewModel.LJLJI = c45850Hz4.LIZJ();
            WUF wuf = C44172HVg.LJIILLIIL;
            ActivityC45651qj LIZ = c45850Hz4.LIZ();
            wuf.getClass();
            LiveOuterService.LJJJLL().LJJI().getClass();
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).onLiveTabShow(LIZ);
            return;
        }
        o.LJIJI("recordingOperationPanel");
        throw null;
    }
}
