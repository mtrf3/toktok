package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Tn6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75684Tn6 extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC75620Tm4, C76800UCe> {
    public static final C75684Tn6 LJLIL = new C75684Tn6();

    public C75684Tn6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC75620Tm4 enumC75620Tm4) {
        EnumC75620Tm4 state = enumC75620Tm4;
        o.LJIIIZ(state, "state");
        int i = C75699TnL.LIZ[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C0NB.LIZIZ("QuickPairManager", "MultiHostState change to Finished");
                if (C8E.LIZLLL().eU("finish quick link-mic") && !B5G.LIZIZ().LJJIJL && C31073CHl.LIZLLL() && RandomLinkMicManager.LJLJLJ.compareTo(EnumC75692TnE.LINKING) >= 0) {
                    RandomLinkMicManager.LJLIL.getClass();
                    RandomLinkMicManager.LJIIZILJ();
                } else {
                    RandomLinkMicManager.LJLIL.getClass();
                    RandomLinkMicManager.LJLILLLLZI = null;
                }
            }
        } else {
            C0NB.LIZIZ("QuickPairManager", "MultiHostState change to Linked, dealWhenFirstFrameRander()");
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLJLJ == EnumC75692TnE.WAITING || RandomLinkMicManager.LJLJLJ == EnumC75692TnE.INVITING || RandomLinkMicManager.LJLJLJ == EnumC75692TnE.LINKING) {
                C32208CkW c32208CkW = new C32208CkW(6);
                DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
                if (dataChannel != null) {
                    dataChannel.rv0(LinkCrossRoomStateChangeEvent.class, c32208CkW);
                }
                C73411SrX c73411SrX = RandomLinkMicManager.LJLJJLL;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
                C73411SrX c73411SrX2 = RandomLinkMicManager.LJLJL;
                if (c73411SrX2 != null) {
                    c73411SrX2.dispose();
                }
                RandomLinkMicManager.LJLLI = System.currentTimeMillis() / 1000;
                RandomLinkMicPreviewDialog randomLinkMicPreviewDialog = RandomLinkMicManager.LJLL;
                if (randomLinkMicPreviewDialog != null && randomLinkMicPreviewDialog.isShowing()) {
                    randomLinkMicPreviewDialog.dismiss();
                }
                RandomLinkMicManager.LJIJI(EnumC75692TnE.LINKING_SUCCESS);
                Iterator it = ((ArrayList) RandomLinkMicManager.LJLJLLL).iterator();
                while (it.hasNext()) {
                    ((AbstractC75563Tl9) it.next()).LIZ();
                }
                RandomLinkMicManager.LJLLL = null;
                RandomLinkMicManager.LJLLJ = null;
            }
        }
        return C76800UCe.LIZ;
    }
}
