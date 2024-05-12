package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestOpenWaitingDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.TqQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75890TqQ implements InterfaceC75414Tik<InviteGroupResult> {
    public final /* synthetic */ C75883TqJ LJLIL;
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLILLLLZI;
    public final /* synthetic */ C76690U7y LJLJI;
    public final /* synthetic */ InterfaceC75414Tik<InviteGroupResult> LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(InviteGroupResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJI(EnumC75909Tqj.INVITED);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLILLLLZI.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = C44432HcC.LJI();
        }
        MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = this.LJLILLLLZI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = multiHostCrossAdapterImpl.LJLJLLL;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LJJLIIJ = this.LJLJI.LIZIZ;
            linkCrossRoomDataHolder2.LJFF = multiHostCrossAdapterImpl.LJJLI();
        }
        InterfaceC75414Tik<InviteGroupResult> interfaceC75414Tik = this.LJLJJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJLLLLLL.LJ(this.LJLIL.LIZ, "inviteGroup");
        InterfaceC75414Tik<InviteGroupResult> interfaceC75414Tik = this.LJLJJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (error.getErrorCode() == C75925Tqz.LIZLLL.LJLJJI) {
            DataChannelGlobal.LJLJJI.rv0(MultiGuestOpenWaitingDialog.class);
        }
        this.LJLILLLLZI.LLJLLIL(this.LJLJI.LIZIZ, "inviteGroup");
    }

    public C75890TqQ(C75883TqJ c75883TqJ, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, C76690U7y c76690U7y, C75903Tqd c75903Tqd) {
        this.LJLIL = c75883TqJ;
        this.LJLILLLLZI = multiHostCrossAdapterImpl;
        this.LJLJI = c76690U7y;
        this.LJLJJI = c75903Tqd;
    }
}
