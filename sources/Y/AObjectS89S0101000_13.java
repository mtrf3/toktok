package Y;

import X.BY9;
import X.C0NB;
import X.C74951TbH;
import X.C75681Tn3;
import X.C75732Tns;
import X.C76535U1z;
import X.C76800UCe;
import X.InterfaceC1798974f;
import X.InterfaceC75495Tk3;
import X.InterfaceC88471Ynr;
import X.JHM;
import X.X1D;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.TreeMap;

/* loaded from: classes14.dex */
public class AObjectS89S0101000_13 implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS89S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS89S0101000_13 aObjectS89S0101000_13, Object obj, Object obj2) {
        switch (aObjectS89S0101000_13.i1) {
            case 0:
                GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS89S0101000_13.l0;
                TreeMap treeMap = (TreeMap) obj2;
                C76535U1z c76535U1z = guestMediaManageFragment.LLILZIL;
                if (c76535U1z != null) {
                    C74951TbH.LJIIIZ(treeMap, c76535U1z.LJLIL, guestMediaManageFragment.LLJ);
                    return null;
                }
                return null;
            default:
                JHM jhm = (JHM) aObjectS89S0101000_13.l0;
                jhm.getClass();
                jhm.LJ((String) obj, (String) obj2, InterfaceC1798974f.LIZ);
                return jhm;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AObjectS89S0101000_13 aObjectS89S0101000_13, Object obj, Object obj2) {
        switch (aObjectS89S0101000_13.i1) {
            case 0:
                BY9 by9 = (BY9) aObjectS89S0101000_13.l0;
                C75732Tns c75732Tns = (C75732Tns) obj2;
                if (by9.mView != 0) {
                    if (((C75681Tn3) c75732Tns.LIZ).LIZIZ == 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("onCancelInviteNewArc,  ");
                        LIZ.append(c75732Tns.hashCode());
                        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
                        ((InterfaceC75495Tk3) by9.mView).aF();
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onCancelApplyNewArc,  ");
                        LIZ2.append(c75732Tns.hashCode());
                        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ2));
                        ((InterfaceC75495Tk3) by9.mView).ki0();
                    }
                }
                return C76800UCe.LIZ;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS89S0101000_13.l0;
                videoPublishContainerScene.LL.bindView((View) obj2, videoPublishContainerScene);
                return null;
        }
    }
}
