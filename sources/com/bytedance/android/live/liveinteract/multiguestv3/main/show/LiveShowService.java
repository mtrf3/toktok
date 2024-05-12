package com.bytedance.android.live.liveinteract.multiguestv3.main.show;

import X.AbstractC73638SvC;
import X.C0NB;
import X.C162476Zf;
import X.C28467BFf;
import X.C74998Tc2;
import X.C75009TcD;
import X.EnumC75006TcA;
import X.InterfaceC75560Tl6;
import X.U34;
import X.U35;
import X.U36;
import X.U38;
import X.U39;
import X.U3H;
import X.X1D;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowContent;

@InterfaceC75560Tl6(name = "LIVE_SHOW_SERVICE")
/* loaded from: classes14.dex */
public final class LiveShowService implements U35 {
    public static boolean LIZJ;
    public final DataChannel LIZ;
    public volatile U39 LIZIZ;

    public LiveShowService() {
        this(null);
    }

    public static boolean LJIILJJIL() {
        if (LIZJ) {
            return true;
        }
        return false;
    }

    @Override // X.U35
    public final void clearCache() {
        this.LIZIZ.LJIIJJI("live-end-success");
    }

    @Override // X.U35
    public final void destroy() {
        this.LIZIZ.destroy();
    }

    @Override // X.U35
    public final ShowContent getContent() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.U35
    public final boolean LIZ() {
        if (LJIILJJIL()) {
            return false;
        }
        return this.LIZIZ.LIZLLL;
    }

    @Override // X.U35
    public final void LJ() {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
        } else {
            this.LIZIZ.LJIIL();
        }
    }

    @Override // X.U35
    public final int LJII() {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call getCurrentLiveShowState after service disabled");
            return 0;
        }
        return this.LIZIZ.LJIILIIL();
    }

    @Override // X.U35
    public final Long LJIIJ() {
        if (LJIILJJIL()) {
            return 0L;
        }
        return this.LIZIZ.LJIILLIIL();
    }

    @Override // X.U35
    public final boolean LJIIJJI() {
        if (LJIILJJIL() || LJII() <= 0) {
            return false;
        }
        return true;
    }

    public LiveShowService(DataChannel dataChannel) {
        U39 u36;
        this.LIZ = dataChannel;
        int i = C75009TcD.LIZ[C74998Tc2.LIZIZ().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                u36 = new U34(dataChannel);
            } else {
                throw new C162476Zf();
            }
        } else {
            u36 = new U36(dataChannel);
        }
        this.LIZIZ = u36;
    }

    @Override // X.U35
    public final void LIZIZ(SeiAppData seiAppData) {
        if (LJIILJJIL()) {
            return;
        }
        this.LIZIZ.LIZIZ(seiAppData);
    }

    @Override // X.U35
    public final void LIZJ(ShowContent showContent) {
        o.LJIIIZ(showContent, "showContent");
        LJIIL(showContent);
        this.LIZIZ.LIZ();
    }

    @Override // X.U35
    public final long LIZLLL(String str) {
        return this.LIZIZ.LJIILJJIL(str);
    }

    @Override // X.U35
    public final void LJFF(U3H listener) {
        o.LJIIIZ(listener, "listener");
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call addLiveShowStateChangeListener after service disabled");
        } else {
            this.LIZIZ.LJIIIZ(listener);
        }
    }

    @Override // X.U35
    public final long LJI(long j) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
            return 0L;
        }
        return this.LIZIZ.LJIILL(j);
    }

    @Override // X.U35
    public final void LJIIIIZZ(U3H listener) {
        o.LJIIIZ(listener, "listener");
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call addLiveShowStateChangeListener after service disabled");
        } else {
            this.LIZIZ.LJIJI(listener);
        }
    }

    @Override // X.U35
    public final void LJIIIZ(EnumC75006TcA role) {
        U39 u36;
        o.LJIIIZ(role, "role");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCurrentRole role=");
        LIZ.append(role);
        C0NB.LIZIZ("LiveShowService", X1D.LIZIZ(LIZ));
        this.LIZIZ.destroy();
        int i = C75009TcD.LIZ[role.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    u36 = new U34(this.LIZ);
                } else {
                    throw new C162476Zf();
                }
            } else {
                u36 = new U38(this.LIZ);
            }
        } else {
            u36 = new U36(this.LIZ);
        }
        this.LIZIZ = u36;
    }

    @Override // X.U35
    public final void LJIIL(ShowContent showContent) {
        o.LJIIIZ(showContent, "showContent");
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
        } else {
            this.LIZIZ.LJIJJ(showContent);
        }
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call createShow after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return this.LIZIZ.createShow(createShowParams);
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call endShow after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return this.LIZIZ.endShow(endShowParams);
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<FinishShowingGuestResponse.ResponseData>> finishGuest(FinishShowingGuestParams finishShowingGuestParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call finishGuest after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return this.LIZIZ.LJI(finishShowingGuestParams);
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call getShowContent after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return this.LIZIZ.getShowContent(getShowContentParams);
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call getShowSetting after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return U39.LJIIZILJ(getShowSettingsParams);
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call showAgainGuest after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return this.LIZIZ.showAgainGuest(showAgainGuestParams);
    }

    @Override // X.U35
    public final AbstractC73638SvC<C28467BFf<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call updateShowContent after service disabled");
            return AbstractC73638SvC.LJIJ(new C28467BFf());
        }
        return this.LIZIZ.updateShowContent(updateShowContentParams);
    }

    @Override // X.U35
    public final void LJIILIIL(long j, long j2) {
        if (LJIILJJIL()) {
            C0NB.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
        } else {
            this.LIZIZ.LJIJJLI(j, j2, "LinkMicFanTicketMethod");
        }
    }
}
