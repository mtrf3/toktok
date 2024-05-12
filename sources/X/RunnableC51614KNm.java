package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KNm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC51614KNm implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        C55369LoD c55369LoD;
        switch (this.LJLIL) {
            case 0:
                C40624Fwy c40624Fwy = (C40624Fwy) this.LJLILLLLZI;
                if (!c40624Fwy.LJIIIIZZ) {
                    return;
                }
                c40624Fwy.LIZ();
                c40624Fwy.LJIJJ = -1L;
                c40624Fwy.LJIJJLI = false;
                return;
            case 1:
                C55366LoA c55366LoA = ((DetailFragmentPanel) this.LJLILLLLZI).LLIIIL;
                if (c55366LoA != null && c55366LoA.LIZ(R.id.n7s).getVisibility() == 0 && (c55369LoD = c55366LoA.LJLIL) != null) {
                    c55369LoD.LIZIZ();
                    return;
                }
                return;
            case 2:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) this.LJLILLLLZI;
                if (ecBaseDiscoverAndSearchFragmentNew.mStatusDestroyed) {
                    return;
                }
                if (C39774FjG.LIZ() && !TextUtils.isEmpty(ecBaseDiscoverAndSearchFragmentNew.LJLJI.getText())) {
                    return;
                }
                ecBaseDiscoverAndSearchFragmentNew.hm(false);
                return;
            case 3:
                WO1.LIZIZ((WO1) this.LJLILLLLZI);
                return;
            case 4:
                ((VideoEditContainerScene) this.LJLILLLLZI).LLFFF = true;
                return;
            case 5:
                ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) this.LJLILLLLZI;
                exteriorVideoRecordScene.LLLJIL();
                Activity activity = exteriorVideoRecordScene.mActivity;
                if (activity == null || activity.isFinishing() || !exteriorVideoRecordScene.mArguments.getBoolean("auto_start_recording", false)) {
                    return;
                }
                exteriorVideoRecordScene.LLILLL.Tf0();
                return;
            default:
                DVideoPreloadManager this$0 = (DVideoPreloadManager) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                this$0.LJII.countDown();
                return;
        }
    }

    public /* synthetic */ RunnableC51614KNm(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
