package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewCloseCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.PreviewHasPermissionEvent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TY0 implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ C74815TXv LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;

    public TY0(C74815TXv c74815TXv) {
        this.LJLIL = c74815TXv;
    }

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        BizReplyResponseData bizReplyResponseData;
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        this.LJLIL.getClass();
        BizReplyResponse bizReplyResponse = value.multiGuestRespExtra;
        if (bizReplyResponse != null) {
            bizReplyResponseData = bizReplyResponse.responseData;
        } else {
            bizReplyResponseData = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bizReplyResponseData ");
        LIZ.append(bizReplyResponseData);
        C0NB.LIZIZ("HybridKit", X1D.LIZIZ(LIZ));
        if (bizReplyResponseData != null) {
            long j = bizReplyResponseData.linkTypePermission;
            C74815TXv c74815TXv = this.LJLIL;
            MultiGuestDataHolder multiGuestDataHolder = c74815TXv.LJLLI;
            if (multiGuestDataHolder != null) {
                multiGuestDataHolder.LJIIZILJ(j);
            }
            if (j == 2) {
                MultiGuestDataHolder multiGuestDataHolder2 = c74815TXv.LJLLI;
                if (multiGuestDataHolder2 != null) {
                    multiGuestDataHolder2.LIZ();
                }
                if (c74815TXv.LJLJLJ != 2) {
                    C30868C9o.LIZJ(R.string.nep);
                }
                DataChannel dataChannel = c74815TXv.LJLJL;
                if (dataChannel != null) {
                    dataChannel.pv0(PreviewCloseCameraEvent.class);
                }
                c74815TXv.LJLJLJ = 2;
                return;
            }
        }
        TY2 ty2 = (TY2) ((InterfaceC29082BbC) this.LJLIL.LJLIL);
        if (ty2 != null) {
            ty2.LLILIL();
        }
        if (!this.LJLILLLLZI) {
            C74815TXv c74815TXv2 = this.LJLIL;
            C74776TWi.LJII(c74815TXv2.LJLJI, c74815TXv2.LJLJL, false);
        } else {
            C74815TXv c74815TXv3 = this.LJLIL;
            C74776TWi.LJII(c74815TXv3.LJLJI, c74815TXv3.LJLJL, true);
        }
        if (this.LJLILLLLZI) {
            DataChannel dataChannel2 = this.LJLIL.LJLJL;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(PreviewHasPermissionEvent.class);
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder3 = this.LJLIL.LJLLI;
        if (multiGuestDataHolder3 == null) {
            return;
        }
        multiGuestDataHolder3.LJJIJLIJ = -1;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        TY2 ty2;
        o.LJIIIZ(error, "error");
        C74815TXv c74815TXv = this.LJLIL;
        c74815TXv.getClass();
        if ((th instanceof C29401Dk) && (ty2 = (TY2) ((InterfaceC29082BbC) c74815TXv.LJLIL)) != null) {
            ty2.LLLLZLLLI(th);
        }
    }
}
