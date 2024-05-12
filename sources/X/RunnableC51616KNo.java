package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KNo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC51616KNo implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((C38646FEs) this.LJLILLLLZI).LJIILJJIL(true);
                return;
            case 1:
                ((DetailFragmentPanel) this.LJLILLLLZI).LLIIIJ.LIZ();
                return;
            case 2:
                InterfaceC51123K4p inflater = ((InterfaceC45601Hv3) this.LJLILLLLZI).getInflater();
                if (inflater instanceof AbstractC51620KNs) {
                    AbstractC51620KNs abstractC51620KNs = (AbstractC51620KNs) inflater;
                    abstractC51620KNs.getClass();
                    C208108Es c208108Es = new C208108Es(abstractC51620KNs);
                    c208108Es.LIZ(R.layout.ap0, 10);
                    c208108Es.LIZ(R.layout.aoz, 8);
                    c208108Es.LIZ(R.layout.ap1, 2);
                    abstractC51620KNs.LIZJ(c208108Es, 0L);
                    return;
                }
                return;
            case 3:
                ((BaseListFragmentPanel) this.LJLILLLLZI).lambda$onPageSelected$7();
                return;
            case 4:
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) this.LJLILLLLZI;
                fTCVideoRecordNewActivity.LLILIL();
                if (fTCVideoRecordNewActivity.isFinishing() || !fTCVideoRecordNewActivity.getIntent().getBooleanExtra("auto_start_recording", false)) {
                    return;
                }
                fTCVideoRecordNewActivity.LLIIJLIL.Tf0();
                return;
            case 5:
                BaseDiscoverAndSearchFragmentNew.mm((BaseDiscoverAndSearchFragmentNew) this.LJLILLLLZI);
                return;
            case 6:
                ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) this.LJLILLLLZI;
                if (exteriorVideoRecordScene.LLIIIJ) {
                    exteriorVideoRecordScene.LLIIIJ = false;
                    H78.LIZ("JSBVideoRecordScene => addFragment by postDelay");
                    exteriorVideoRecordScene.LLLJIL();
                    Activity activity = exteriorVideoRecordScene.mActivity;
                    if (activity == null || activity.isFinishing() || !exteriorVideoRecordScene.mArguments.getBoolean("auto_start_recording", false)) {
                        return;
                    }
                    exteriorVideoRecordScene.LLILLL.Tf0();
                    return;
                }
                return;
            case 7:
                C46748IWi.LJJJ((C46748IWi) this.LJLILLLLZI);
                return;
            case 8:
                InterfaceC65784Pro tmp0 = (InterfaceC65784Pro) this.LJLILLLLZI;
                o.LJIIIZ(tmp0, "$tmp0");
                tmp0.invoke();
                return;
            default:
                AbstractC65189PiD abstractC65189PiD = (AbstractC65189PiD) this.LJLILLLLZI;
                abstractC65189PiD.getClass();
                try {
                    abstractC65189PiD.LIZJ.LIZJ();
                    return;
                } catch (Exception unused) {
                    C78841Uwv.LJJI(abstractC65189PiD.LIZ);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC51616KNo(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
