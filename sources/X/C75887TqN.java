package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.api.LinkMultiCoHostInviteViolationDialogEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestOpenWaitingDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.TqN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75887TqN implements InterfaceC75414Tik<InviteResult> {
    public final /* synthetic */ C75878TqE LJLIL;
    public final /* synthetic */ C76180Tv6 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C75883TqJ LJLJJI;
    public final /* synthetic */ MultiHostMultiAdapterImpl LJLJJL;
    public final /* synthetic */ InterfaceC75414Tik<InviteResult> LJLJJLL;
    public final /* synthetic */ CMB LJLJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(InviteResult inviteResult) {
        InviteResult value = inviteResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite, onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJJJZI(this.LJLILLLLZI.LIZIZ, this.LJLJI, value.logId);
        this.LJLJJI.LJI(EnumC75909Tqj.INVITED);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJJL.LJLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = C44432HcC.LJI();
        }
        MultiHostMultiAdapterImpl multiHostMultiAdapterImpl = this.LJLJJL;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = multiHostMultiAdapterImpl.LJLL;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LJJLIIJ = this.LJLILLLLZI.LIZIZ;
            linkCrossRoomDataHolder2.LJFF = multiHostMultiAdapterImpl.LJJLI();
        }
        InterfaceC75414Tik<InviteResult> interfaceC75414Tik = this.LJLJJLL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        DataChannel dataChannel;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite, onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJJJJL(this.LJLILLLLZI.LIZIZ, this.LJLJI, th);
        InterfaceC75414Tik<InviteResult> interfaceC75414Tik = this.LJLJJLL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if ((th instanceof MultiCoHostViolationException) && (dataChannel = this.LJLJJL.LJLJLJ) != null) {
            dataChannel.qv0(LinkMultiCoHostInviteViolationDialogEvent.class, new CRS(this.LJLJL, ((MultiCoHostViolationException) th).getPerceptionMessage()));
        }
        if (error.getErrorCode() == C75925Tqz.LIZLLL.LJLJJI) {
            DataChannelGlobal.LJLJJI.rv0(MultiGuestOpenWaitingDialog.class);
        }
        this.LJLJJL.LLJJJJ(this.LJLILLLLZI.LIZIZ);
    }

    public C75887TqN(C75878TqE c75878TqE, C76180Tv6 c76180Tv6, String str, C75883TqJ c75883TqJ, MultiHostMultiAdapterImpl multiHostMultiAdapterImpl, IDo0S413S0100000_13 iDo0S413S0100000_13, CMB cmb) {
        this.LJLIL = c75878TqE;
        this.LJLILLLLZI = c76180Tv6;
        this.LJLJI = str;
        this.LJLJJI = c75883TqJ;
        this.LJLJJL = multiHostMultiAdapterImpl;
        this.LJLJJLL = iDo0S413S0100000_13;
        this.LJLJL = cmb;
    }
}
