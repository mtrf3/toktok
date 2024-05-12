package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.PreviewCloseCameraEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.PreviewHasPermissionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TXw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74816TXw implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ C74813TXt LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;

    public C74816TXw(C74813TXt c74813TXt) {
        this.LJLIL = c74813TXt;
    }

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        BizReplyResponseData bizReplyResponseData;
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        TYP.LIZ("GameLinkInteractDialogPresenter", "reply invite succeed", false);
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
        C0NB.LIZIZ("GameLinkInteractDialogPresenter", X1D.LIZIZ(LIZ));
        if (bizReplyResponseData != null) {
            long j = bizReplyResponseData.linkTypePermission;
            C74813TXt c74813TXt = this.LJLIL;
            TVD LJI = c74813TXt.LJI();
            if (LJI != null) {
                LJI.LIZJ(j);
            }
            if (j == 2) {
                TVD LJI2 = c74813TXt.LJI();
                if (LJI2 != null) {
                    LJI2.LJIIZILJ = 2;
                    LJI2.LJIJJLI = 2;
                    C74740TUy.LIZLLL().LJIIJJI = 2;
                }
                if (c74813TXt.LJ != 2) {
                    C30868C9o.LIZJ(R.string.nep);
                }
                DataChannel dataChannel = c74813TXt.LIZLLL;
                if (dataChannel != null) {
                    dataChannel.pv0(PreviewCloseCameraEvent.class);
                }
                c74813TXt.LJ = 2;
                return;
            }
        }
        InterfaceC74810TXq interfaceC74810TXq = this.LJLIL.LIZ;
        if (interfaceC74810TXq != null) {
            interfaceC74810TXq.LLILIL();
        }
        if (!this.LJLILLLLZI) {
            C74813TXt c74813TXt2 = this.LJLIL;
            TV2.LJII(c74813TXt2.LIZJ, c74813TXt2.LIZLLL, false);
        } else {
            C74813TXt c74813TXt3 = this.LJLIL;
            TV2.LJII(c74813TXt3.LIZJ, c74813TXt3.LIZLLL, true);
        }
        if (this.LJLILLLLZI) {
            DataChannel dataChannel2 = this.LJLIL.LIZLLL;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(PreviewHasPermissionEvent.class);
            return;
        }
        TVD LJI3 = this.LJLIL.LJI();
        if (LJI3 == null) {
            return;
        }
        LJI3.LJIIZILJ = -1;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        InterfaceC74810TXq interfaceC74810TXq;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reply invite failed, ");
        LIZ.append(X4Q.LJIILLIIL(th));
        TYP.LIZ("GameLinkInteractDialogPresenter", X1D.LIZIZ(LIZ), false);
        C74813TXt c74813TXt = this.LJLIL;
        c74813TXt.getClass();
        if ((th instanceof C29401Dk) && (interfaceC74810TXq = c74813TXt.LIZ) != null) {
            interfaceC74810TXq.LLLLZLLLI(th);
        }
    }
}
