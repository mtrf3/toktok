package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestOpenWaitingDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.TqR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75891TqR implements InterfaceC75414Tik<ApplyGroupResult> {
    public final /* synthetic */ C75883TqJ LJLIL;
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLILLLLZI;
    public final /* synthetic */ C76689U7x LJLJI;
    public final /* synthetic */ InterfaceC75414Tik<ApplyGroupResult> LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ApplyGroupResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJI(EnumC75909Tqj.APPLIED);
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
        InterfaceC75414Tik<ApplyGroupResult> interfaceC75414Tik = this.LJLJJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("applyGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<ApplyGroupResult> interfaceC75414Tik = this.LJLJJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (error.getErrorCode() == C75925Tqz.LIZLLL.LJLJJI) {
            DataChannelGlobal.LJLJJI.rv0(MultiGuestOpenWaitingDialog.class);
        }
        this.LJLILLLLZI.LLJLLIL(C44432HcC.LJI(), "applyGroup");
    }

    public C75891TqR(C75883TqJ c75883TqJ, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, C76689U7x c76689U7x, C75902Tqc c75902Tqc) {
        this.LJLIL = c75883TqJ;
        this.LJLILLLLZI = multiHostCrossAdapterImpl;
        this.LJLJI = c76689U7x;
        this.LJLJJI = c75902Tqc;
    }
}
