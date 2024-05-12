package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.TXt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74813TXt extends TY3 {
    public final GameLinkGuestPresenter LIZIZ;
    public final Room LIZJ;
    public final DataChannel LIZLLL;
    public int LJFF;
    public boolean LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final Keva LJIIIZ;
    public int LJ = 1;
    public String LJI = "";

    @Override // X.TY3
    public final void LIZLLL() {
        TTR gamelinkManager;
        InterfaceC75441TjB R6;
        if (this.LIZJ != null) {
            TVD LJI = LJI();
            LJI.LJIILLIIL = 2;
            C74740TUy.LIZLLL().LJIIJJI = LJI.LJIILLIIL;
            this.LJ = 2;
            C74740TUy.LIZLLL().LJ = this.LJFF;
            C74740TUy.LIZLLL().LJFF = null;
            C74740TUy.LIZLLL().LJIIIIZZ = this.LJI;
            this.LJII = true;
            BizReplyParams bizReplyParams = new BizReplyParams(this.LJ, 0, 2, null);
            Room room = this.LIZJ;
            if (room != null) {
                C75911Tql c75911Tql = new C75911Tql(room.getId(), room.getOwnerUserId(), 1, bizReplyParams, 16);
                GameLinkGuestPresenter gameLinkGuestPresenter = this.LIZIZ;
                if (gameLinkGuestPresenter != null && (gamelinkManager = gameLinkGuestPresenter.getGamelinkManager()) != null && (R6 = gamelinkManager.R6()) != null) {
                    R6.LJJLIIIJL(c75911Tql, new C74816TXw(this));
                }
            }
        }
    }

    public final TVD LJI() {
        return (TVD) this.LJIIIIZZ.getValue();
    }

    @Override // X.TY3
    public final ImageModel LIZJ() {
        return B83.LIZ().LIZIZ().getCurrentUser().getAvatarThumb();
    }

    @Override // X.TY3
    public final void LIZ(TWQ twq) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        LIZLLL.LJIIIZ = false;
        LIZLLL.LJIIJ = 0;
        TVD LJI = LJI();
        LJI.LJIILLIIL = 2;
        C74740TUy.LIZLLL().LJIIJJI = LJI.LJIILLIIL;
        this.LJ = 2;
        int i = LJI().LJIIZILJ;
        InterfaceC74810TXq interfaceC74810TXq = this.LIZ;
        if (interfaceC74810TXq != null) {
            interfaceC74810TXq.getContext();
        }
        Object obj = this.LIZ;
        if ((obj instanceof GameLinkUserInfoFragment) && (fragment = (Fragment) obj) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            TWL.LJI = "application_pannel";
            C74768TWa.LIZ(true, 0, mo49getActivity, Long.valueOf(i), new AqS144S0200000_13(this, twq, 105), new AqS163S0100000_13(this, 738), new AqS163S0100000_13(this, 739));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TY3
    public final void LIZIZ(InterfaceC74812TXs interfaceC74812TXs) {
        this.LIZ = interfaceC74812TXs;
        this.LJFF = this.LJIIIZ.getInt("live_interact_beauty_level", 2);
    }

    @Override // X.TY3
    public final void LJ(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LJI = str2;
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        if (str == null) {
            str = "";
        }
        LIZLLL.LJIIIIZZ = str;
    }

    @Override // X.TY3
    public final void LJFF(int i) {
        this.LJ = i;
    }

    public C74813TXt(GameLinkGuestPresenter gameLinkGuestPresenter, Room room, DataChannel dataChannel) {
        this.LIZIZ = gameLinkGuestPresenter;
        this.LIZJ = room;
        this.LIZLLL = dataChannel;
        new C73318Sq2();
        this.LJIIIIZZ = C221108m2.LIZIZ(TWC.LJLIL);
        this.LJIIIZ = Keva.getRepo("live-app-core-sdk");
    }
}
