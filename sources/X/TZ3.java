package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZ3 implements InterfaceC75414Tik<KickOutResult> {
    public final /* synthetic */ C74842TYw LJLIL;
    public final /* synthetic */ LinkPlayerInfo LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(KickOutResult value) {
        long j;
        o.LJIIIZ(value, "value");
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", "kick out succ");
        TYQ.LIZJ("LinkIn_kickOut_Success");
        C74842TYw c74842TYw = this.LJLIL;
        c74842TYw.getClass();
        this.LJLILLLLZI.LIZLLL = true;
        TZK tzk = c74842TYw.LJLJL;
        if (tzk != null) {
            tzk.LJIILL(this.LJLJI);
        }
        User user = this.LJLILLLLZI.mUser;
        if (user != null) {
            j = user.getFollowInfo().getFollowStatus();
        } else {
            j = -1;
        }
        long j2 = this.LJLJI;
        C29556Biq.LIZ().getClass();
        C74830TYk.LIZIZ(j2, j, C74983Tbn.LIZJ());
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        String str;
        Boolean bool;
        o.LJIIIZ(error, "error");
        String logTAG = this.LJLIL.logTAG(1623);
        Context context = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C32014ChO.LIZJ(logTAG, "kick out failed", str);
        if (th != null) {
            this.LJLIL.logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_kickOut_Failed", X1D.LIZIZ(LIZ));
        C74842TYw c74842TYw = this.LJLIL;
        c74842TYw.getClass();
        TZK tzk = c74842TYw.LJLJL;
        if (tzk != null) {
            tzk.LJJI(th);
        }
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            TZC tzc = (TZC) this.LJLIL.mView;
            if (tzc != null) {
                bool = Boolean.valueOf(tzc.isViewValid());
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.LJLIL.mView;
                if (interfaceC31336CRo != null) {
                    context = interfaceC31336CRo.getContext();
                }
                BPP.LIZLLL(context, th, R.string.su8);
            }
        }
    }

    public TZ3(C74842TYw c74842TYw, LinkPlayerInfo linkPlayerInfo, long j) {
        this.LJLIL = c74842TYw;
        this.LJLILLLLZI = linkPlayerInfo;
        this.LJLJI = j;
    }
}
