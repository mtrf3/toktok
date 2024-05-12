package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSF implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList> LJLIL;
    public final /* synthetic */ GameLinkGuestPresenter LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
        TYP.LIZ("GameLinkGuestPresenter", "leave channel succeed", false);
        InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC60987Nwd = this.LJLIL;
        long currentUserId = B83.LIZ().LIZIZ().getCurrentUserId();
        o.LJIIIZ(interfaceC60987Nwd, "<this>");
        Iterator<LinkPlayerInfo> it = interfaceC60987Nwd.LIZIZ().iterator();
        while (it.hasNext()) {
            if (it.next().mUser.getId() == currentUserId) {
                it.remove();
            }
        }
    }

    public TSF(TU4 tu4, GameLinkGuestPresenter gameLinkGuestPresenter) {
        this.LJLIL = tu4;
        this.LJLILLLLZI = gameLinkGuestPresenter;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave channel failed, ");
        LIZ.append(this.LJLILLLLZI.getThrowableMsg(th));
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ), false);
    }
}
