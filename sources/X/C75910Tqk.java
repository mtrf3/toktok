package X;

import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;

/* renamed from: X.Tqk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75910Tqk implements InterfaceC75414Tik<LeaveGroupResult> {
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLIL;
    public final /* synthetic */ InterfaceC75706TnS<OLS> LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveGroupResult leaveGroupResult) {
        long j;
        LeaveGroupResult value = leaveGroupResult;
        o.LJIIIZ(value, "value");
        this.LJLIL.LLJJ("leave_new_arc");
        BizLeaveJoinGroupResponse cohostRespExtra = value.getCohostRespExtra();
        if (cohostRespExtra != null) {
            j = cohostRespExtra.feedbackShowReason;
        } else {
            j = 0;
        }
        InterfaceC75706TnS<OLS> interfaceC75706TnS = this.LJLILLLLZI;
        if (interfaceC75706TnS != null) {
            String logId = value.getLogId();
            if (logId == null) {
                logId = "";
            }
            interfaceC75706TnS.LJFF(new OLS(logId, j, 4));
        }
    }

    public C75910Tqk(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InterfaceC75706TnS interfaceC75706TnS) {
        this.LJLIL = multiHostCrossAdapterImpl;
        this.LJLILLLLZI = interfaceC75706TnS;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75706TnS<OLS> interfaceC75706TnS = this.LJLILLLLZI;
        if (interfaceC75706TnS != null) {
            interfaceC75706TnS.LIZLLL(new C76003TsF(error.getErrorCode(), error.getErrorMsg()), th);
        }
    }
}
