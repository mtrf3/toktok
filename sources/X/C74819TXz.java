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

/* renamed from: X.TXz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74819TXz implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ C74814TXu LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;

    public C74819TXz(C74814TXu c74814TXu) {
        this.LJLIL = c74814TXu;
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
            C74814TXu c74814TXu = this.LJLIL;
            MultiGuestDataHolder multiGuestDataHolder = c74814TXu.LJLLL;
            if (multiGuestDataHolder != null) {
                multiGuestDataHolder.LJIIZILJ(j);
            }
            if (j == 2) {
                MultiGuestDataHolder multiGuestDataHolder2 = c74814TXu.LJLLL;
                if (multiGuestDataHolder2 != null) {
                    multiGuestDataHolder2.LIZ();
                }
                if (c74814TXu.LJLJLJ != 2) {
                    C30868C9o.LIZJ(R.string.nep);
                }
                DataChannel dataChannel = c74814TXu.LJLJL;
                if (dataChannel != null) {
                    dataChannel.pv0(PreviewCloseCameraEvent.class);
                }
                c74814TXu.LJLJLJ = 2;
                return;
            }
        }
        TY2 ty2 = (TY2) ((InterfaceC29082BbC) this.LJLIL.LJLIL);
        if (ty2 != null) {
            ty2.LLILIL();
        }
        if (!this.LJLILLLLZI) {
            C74814TXu c74814TXu2 = this.LJLIL;
            C74776TWi.LJII(c74814TXu2.LJLJI, c74814TXu2.LJLJL, false);
        } else {
            C74814TXu c74814TXu3 = this.LJLIL;
            C74776TWi.LJII(c74814TXu3.LJLJI, c74814TXu3.LJLJL, true);
        }
        if (this.LJLILLLLZI) {
            C75027TcV.LIZIZ(1);
            DataChannel dataChannel2 = this.LJLIL.LJLJL;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(PreviewHasPermissionEvent.class);
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder3 = this.LJLIL.LJLLL;
        if (multiGuestDataHolder3 == null) {
            return;
        }
        multiGuestDataHolder3.LJJIJLIJ = -1;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        C74814TXu c74814TXu = this.LJLIL;
        c74814TXu.getClass();
        if (th instanceof C29401Dk) {
            TY2 ty2 = (TY2) ((InterfaceC29082BbC) c74814TXu.LJLIL);
            if (ty2 != null) {
                ty2.LLLLZLLLI(th);
            }
            C74824TYe.LJJLIIIIJ(th);
        }
    }
}
