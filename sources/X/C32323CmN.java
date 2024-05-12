package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.livesetting.gift.LiveWelcomePackShortcutMaxClickTimes;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CmN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32323CmN implements InterfaceC32301Cm1 {
    public final /* synthetic */ C32324CmO LIZ;

    @Override // X.InterfaceC32301Cm1
    public final void LIZJ() {
        DataChannel dataChannel;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" start reload view isShowWelcomePack ");
        LIZ.append(this.LIZ.LJLJJLL);
        LIZ.append(' ');
        C0NB.LJIIIZ("ToolbarFastGiftBehavior", X1D.LIZIZ(LIZ));
        C32324CmO c32324CmO = this.LIZ;
        if (c32324CmO.LJLJJLL && (dataChannel = c32324CmO.LJLJI) != null) {
            c32324CmO.LIZJ(dataChannel);
            c32324CmO.LIZIZ(c32324CmO.LJLILLLLZI, dataChannel, true);
        }
    }

    public C32323CmN(C32324CmO c32324CmO) {
        this.LIZ = c32324CmO;
    }

    @Override // X.InterfaceC32301Cm1
    public final void LIZIZ(boolean z) {
        int i;
        Boolean bool;
        ViewParent viewParent;
        ViewGroup viewGroup;
        boolean z2 = false;
        try {
            i = C5J.LIZ();
        } catch (Exception e) {
            C0NB.LJ("ToolbarFastGiftBehavior", e.getMessage());
            i = 0;
        }
        C0NB.LJIIIZ("ToolbarFastGiftBehavior", "result is " + z + " already show is " + this.LIZ.LJLJL + " click time is " + i);
        InterfaceC30237Btp interfaceC30237Btp = this.LIZ.LJLILLLLZI;
        if (interfaceC30237Btp != null) {
            interfaceC30237Btp.LJII(true);
        }
        InterfaceC30237Btp interfaceC30237Btp2 = this.LIZ.LJLILLLLZI;
        if (interfaceC30237Btp2 != null) {
            interfaceC30237Btp2.setVisibility(0);
        }
        if (z && i < LiveWelcomePackShortcutMaxClickTimes.getValue()) {
            C32324CmO c32324CmO = this.LIZ;
            InterfaceC30237Btp interfaceC30237Btp3 = c32324CmO.LJLILLLLZI;
            DataChannel dataChannel = c32324CmO.LJLJI;
            if (c32324CmO.LJLJL) {
                return;
            }
            c32324CmO.LJLJL = true;
            c32324CmO.LJLJJLL = true;
            C32322CmM c32322CmM = (C32322CmM) C28600BKi.LIZIZ().LIZ(C32324CmO.LIZ(interfaceC30237Btp3, dataChannel), C32322CmM.class);
            c32324CmO.LJLJJL = c32322CmM;
            if (c32322CmM == null) {
                c32324CmO.LJLJJL = new C32322CmM(dataChannel, c32324CmO.LJLIL);
            } else {
                c32322CmM.LJLIL = dataChannel;
                if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BNK.class)) != null) {
                    z2 = bool.booleanValue();
                }
                c32322CmM.LJLJJI = z2;
                c32322CmM.LIZIZ();
            }
            C32322CmM c32322CmM2 = c32324CmO.LJLJJL;
            ViewParent viewParent2 = null;
            if (c32322CmM2 != null) {
                viewParent = c32322CmM2.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                C32322CmM c32322CmM3 = c32324CmO.LJLJJL;
                if (c32322CmM3 != null) {
                    viewParent2 = c32322CmM3.getParent();
                }
                if ((viewParent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent2) != null) {
                    C16880lQ.LJLLL(c32324CmO.LJLJJL, viewGroup);
                }
            }
            if (interfaceC30237Btp3 == null) {
                return;
            }
            interfaceC30237Btp3.LJZI(c32324CmO.LJLJJL);
            interfaceC30237Btp3.LIZIZ();
            return;
        }
        C32324CmO c32324CmO2 = this.LIZ;
        c32324CmO2.LIZIZ(c32324CmO2.LJLILLLLZI, c32324CmO2.LJLJI, false);
    }
}
