package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.TPj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74595TPj implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
        C0NB.LIZIZ("MultiGuestV3GuestPresenter", "leave channel succ");
        TYQ.LIZLLL("LinkIn_leave_Success", "position:leaveChannel");
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL;
        multiGuestV3GuestPresenter.isLeavingChannel = false;
        multiGuestV3GuestPresenter.hasJoinChannel = false;
        multiGuestV3GuestPresenter.isWaitingState = false;
        C74838TYs.LJ().LJJIIZ = true;
        this.LJLIL.leaveAction(this.LJLILLLLZI);
        InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) this.LJLIL.mView;
        if (interfaceC74596TPk != null) {
            interfaceC74596TPk.loadLiveShowAudienceWidget();
        }
    }

    public C74595TPj(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, boolean z) {
        this.LJLIL = multiGuestV3GuestPresenter;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        String logTAG = this.LJLIL.logTAG(2321);
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C32014ChO.LIZJ(logTAG, "leave channel failed,", str);
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL;
        multiGuestV3GuestPresenter.isLeavingChannel = false;
        if (th != null && multiGuestV3GuestPresenter.mView != 0) {
            multiGuestV3GuestPresenter.logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:leaveChannel; throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_leave_Failed", X1D.LIZIZ(LIZ));
        C74838TYs.LJ().LJJIIZ = false;
        this.LJLIL.leaveAction(this.LJLILLLLZI);
        InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) this.LJLIL.mView;
        if (interfaceC74596TPk != null) {
            interfaceC74596TPk.loadLiveShowAudienceWidget();
        }
    }
}
