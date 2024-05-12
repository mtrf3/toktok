package X;

import com.bytedance.android.live.liveinteract.api.LinkMultiCoHostInviteViolationDialogEvent;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75903Tqd implements InterfaceC75414Tik<InviteGroupResult> {
    public final /* synthetic */ InterfaceC75706TnS<OLV> LJLIL;
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLILLLLZI;
    public final /* synthetic */ CMB LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(InviteGroupResult inviteGroupResult) {
        InviteGroupResult value = inviteGroupResult;
        o.LJIIIZ(value, "value");
        InterfaceC75706TnS<OLV> interfaceC75706TnS = this.LJLIL;
        if (interfaceC75706TnS != null) {
            String logId = value.getLogId();
            if (logId == null) {
                logId = "";
            }
            interfaceC75706TnS.LJFF(new OLV(0, logId, 4));
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        DataChannel dataChannel;
        o.LJIIIZ(error, "error");
        if ((th instanceof MultiCoHostViolationException) && (dataChannel = this.LJLILLLLZI.LJLJLJ) != null) {
            dataChannel.qv0(LinkMultiCoHostInviteViolationDialogEvent.class, new CRS(this.LJLJI, ((MultiCoHostViolationException) th).getPerceptionMessage()));
        }
        InterfaceC75706TnS<OLV> interfaceC75706TnS = this.LJLIL;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }

    public C75903Tqd(InterfaceC75706TnS<OLV> interfaceC75706TnS, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, CMB cmb) {
        this.LJLIL = interfaceC75706TnS;
        this.LJLILLLLZI = multiHostCrossAdapterImpl;
        this.LJLJI = cmb;
    }
}
