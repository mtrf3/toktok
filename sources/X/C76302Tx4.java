package X;

import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchIconVisibleEvent;
import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveTwoMatchLinkOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tx4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76302Tx4 extends AbstractC31497CXt<InterfaceC76362Ty2> {
    public int LJLIL;
    public InterfaceC92693kP LJLILLLLZI;
    public C73411SrX LJLJI;
    public final C76305Tx7 LJLJJI = new C76305Tx7(this);

    public final void LJJJJI() {
        boolean z;
        C34K c34k = new C34K();
        if (this.LJLIL == LiveTwoMatchLinkOptSetting.INSTANCE.getValue().permission_retry_count) {
            z = true;
        } else {
            z = false;
        }
        c34k.element = z;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        C76271TwZ.LJIILJJIL = C30725C4b.LIZ();
        C76271TwZ.LJJZZIII(c76271TwZ, "battle_permission_request", FT5.LIZLLL("role_type", "anchor"), FT5.LIZLLL("role_type", "anchor"), null, false, 8);
        ((InterfaceC29856Bng) ((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).checkPermission().LIZJ(autoDisposeWithTransformer())).LIZJ(new AfS65S0100000_13(this, 15), new AfS62S0200000_13(this, c34k, 3));
    }

    public final void LJJJJIZL() {
        InterfaceC92693kP interfaceC92693kP;
        InterfaceC92693kP interfaceC92693kP2 = this.LJLILLLLZI;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.LJLILLLLZI) != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLIL = 0;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        IMessageManager iMessageManager;
        LJJJJIZL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this.LJLJJI);
        }
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            Object viewInterface = this.mView;
            o.LJIIIIZZ(viewInterface, "viewInterface");
            dataChannel2.jv0(viewInterface);
        }
        super.detachView();
        C0NB.LJ("MultiMatchAnchorPresent", "detachView");
    }

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC76362Ty2 interfaceC76362Ty2) {
        IMessageManager iMessageManager;
        super.attachView((C76302Tx4) interfaceC76362Ty2);
        C76265TwT.LJIIIZ = false;
        LJJJJIZL();
        LJJJJI();
        this.LJLJI = (C73411SrX) C73943T0h.LIZ().LJ(C29843BnT.class).LJJJLIIL(new AfS65S0100000_13(this, 17), new InterfaceC64592gB() { // from class: X.9Ca
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            Object viewInterface = this.mView;
            o.LJIIIIZZ(viewInterface, "viewInterface");
            dataChannel.mv0(LinkBattleGuideEvent.class, viewInterface, new AqS179S0100000_13(this, 53));
            dataChannel.lv0((LifecycleOwner) this.mView, BattleStateChannel.class, C76346Txm.LJLIL);
            dataChannel.lv0((LifecycleOwner) this.mView, MatchIconVisibleEvent.class, new AqS179S0100000_13(this, 54));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE.getIntType(), this.LJLJJI);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attachView ");
        LIZ.append(this);
        C0NB.LJ("MultiMatchAnchorPresent", X1D.LIZIZ(LIZ));
    }
}
