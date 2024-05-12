package X;

import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MuteMicViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3AnchorDestroyChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZ2 implements InterfaceC75414Tik<DestroyChannelResult> {
    public final /* synthetic */ TZJ LJLIL;
    public final /* synthetic */ EnumC74778TWk LJLILLLLZI;
    public final /* synthetic */ C74843TYx LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(DestroyChannelResult value) {
        DataChannel dataChannel;
        o.LJIIIZ(value, "value");
        if (this.LJLIL.finishReason == 10001) {
            C30868C9o.LIZJ(R.string.ne_);
        }
        TYQ.LIZJ("LinkIn_finish_Success");
        TZJ tzj = this.LJLIL;
        if (tzj == TZJ.USER_CLICK) {
            C75457TjR.LJIIIZ("manual_close", this.LJLILLLLZI);
        } else if (tzj == TZJ.INTERRUPT_BY_CO_HOST) {
            C75457TjR.LJIIIZ("accept_anchor_invite", this.LJLILLLLZI);
        }
        C74843TYx c74843TYx = this.LJLJI;
        c74843TYx.LJLJLJ = false;
        TZK tzk = c74843TYx.LJLJL;
        if (tzk != null) {
            tzk.LJIJJ();
        }
        C74740TUy.LIZLLL().LJI(0);
        DataChannel dataChannel2 = this.LJLJI.LJLJJI;
        if (dataChannel2 != null) {
            dataChannel2.qv0(InteractStateChangeEvent.class, new TW6(8));
        }
        DataChannel dataChannel3 = this.LJLJI.LJLJJI;
        if (dataChannel3 != null) {
            dataChannel3.pv0(MultiGuestV3AnchorDestroyChannel.class);
        }
        this.LJLJI.getMultiGuestDataHolder().LJIILL("destroy_channel");
        if (C74838TYs.LJ().LJJJI && (dataChannel = this.LJLJI.LJLJJI) != null) {
            dataChannel.qv0(MuteMicViewStateChangeEvent.class, Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            this.LJLJI.logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mUnrecoverableErrorHappened:");
        this.LJLJI.getClass();
        LIZ.append(false);
        LIZ.append("; throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_finish_Failed", X1D.LIZIZ(LIZ));
        C74843TYx c74843TYx = this.LJLJI;
        c74843TYx.LJLJLJ = false;
        c74843TYx.getClass();
        TZK tzk = this.LJLJI.LJLJL;
        if (tzk != null) {
            tzk.LJIJ(th);
        }
    }

    public TZ2(TZJ tzj, EnumC74778TWk enumC74778TWk, C74843TYx c74843TYx) {
        this.LJLIL = tzj;
        this.LJLILLLLZI = enumC74778TWk;
        this.LJLJI = c74843TYx;
    }
}
