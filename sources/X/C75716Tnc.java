package X;

import com.bytedance.android.live.liveinteract.api.MultiCoHostFeedbackDialogOpenEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Tnc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75716Tnc implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ C75883TqJ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult leaveChannelResult) {
        long j;
        LeaveChannelResult value = leaveChannelResult;
        o.LJIIIZ(value, "value");
        B5G.LIZIZ();
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        C75883TqJ c75883TqJ = this.LJLIL;
        if (c75883TqJ != null) {
            j = c75883TqJ.LIZ;
        } else {
            j = 0;
        }
        LIZIZ.LJJLIL = j;
        if (value.getFeedbackShowReason() > 0 && C30457BxN.LIZ()) {
            AnonymousClass030.LJFF(InterfaceC30442Bx8.LLILZ);
            DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiCoHostFeedbackDialogOpenEvent.class, new C35753E1l(this.LJLILLLLZI, this.LJLJI, value.getFeedbackShowReason()));
            }
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(411, "leave multi_cohost link mic failed", th, null);
        }
    }

    public C75716Tnc(C75883TqJ c75883TqJ, long j, long j2) {
        this.LJLIL = c75883TqJ;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
