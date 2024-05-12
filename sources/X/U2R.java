package X;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U2R extends U2N {
    public final U2U LJLL;
    public List<? extends LinkPlayerInfo> LJLLI;
    public final C75271TgR LJLLILLLL;
    public final DataChannel LJLLJ;
    public final Long LJLLL;

    @Override // X.U2N
    public final void LJJIIZ() {
        this.LJLJLLL.LJLZ(C76553U2r.class, new U2S(new U2T(this), this.LJLLJ));
        this.LJLJLLL.LJLZ(C74900TaS.class, new C75140TeK(null));
    }

    @Override // X.U2N, X.U2M
    public final void LJJIIJZLJL() {
        super.LJJIIJZLJL();
        ConstraintLayout constraintLayout = this.LJLJLJ;
        if (constraintLayout != null) {
            C87277YNd.LJJIIZ(constraintLayout);
        }
        LiveIconView liveIconView = this.LJLJJLL;
        if (liveIconView != null) {
            C87277YNd.LJJIIZ(liveIconView);
        }
        LiveIconView liveIconView2 = this.LJLJJL;
        if (liveIconView2 != null) {
            C87277YNd.LJJIIZ(liveIconView2);
        }
        LJJIIZI(this.LJLLILLLL);
    }

    public final void LJJIIZI(C75271TgR c75271TgR) {
        boolean z;
        C0NB.LIZIZ("LiveShowGuestListDialog", "LiveShowGuestListDialog");
        if (c75271TgR == null) {
            return;
        }
        C73129Smz c73129Smz = this.LJLJLLL;
        CJ2 cj2 = new CJ2();
        ShowListUser showListUser = c75271TgR.LIZ;
        if (showListUser != null) {
            cj2.add(new C76553U2r(showListUser, true, -1));
        }
        List<ShowListUser> list = c75271TgR.LIZIZ;
        if (list != null) {
            Iterator<ShowListUser> it = list.iterator();
            while (it.hasNext()) {
                cj2.add(new C76553U2r(it.next(), true, -1));
            }
        }
        List<ShowListUser> list2 = c75271TgR.LIZJ;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ndb);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_mu…showPanel_finished_title)");
                cj2.add(new C74900TaS(LJIILJJIL, 6));
            }
            for (ShowListUser showListUser2 : list2) {
                List<? extends LinkPlayerInfo> list3 = this.LJLLI;
                if (list3 != null) {
                    Iterator<? extends LinkPlayerInfo> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LinkPlayerInfo next = it2.next();
                        if (o.LJ(next.mInteractIdStr, showListUser2.linkmicIdStr)) {
                            if (next != null) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                cj2.add(new C76553U2r(showListUser2, z, -1));
            }
        }
        c73129Smz.LJZ(cj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2R(Context context, U2U listener, List<? extends LinkPlayerInfo> list, C75271TgR c75271TgR, DataChannel dataChannel, Long l) {
        super(context, 2);
        o.LJIIIZ(listener, "listener");
        this.LJLL = listener;
        this.LJLLI = list;
        this.LJLLILLLL = c75271TgR;
        this.LJLLJ = dataChannel;
        this.LJLLL = l;
    }
}
