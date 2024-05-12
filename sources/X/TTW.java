package X;

import Y.AfS62S0200000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInviteModeInterceptionSkipSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTW extends AbstractC31497CXt<InterfaceC31336CRo> implements TQH {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final TTZ LJLIL;
    public final MultiGuestV3GuestPresenter LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C31657Cbd LJLJJI;
    public TY7 LJLJJL;
    public final TTX LJLJJLL;

    static {
        TBT tbt = new TBT(TTW.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    public TTW() {
        this(null, null);
    }

    @Override // X.TQH
    public final TU1 LIZ() {
        int LIZIZ = TRK.LIZIZ(0L);
        if (C78857UxB.LJJJ(LIZIZ)) {
            TU1 tu1 = new TU1(this, 2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideBeInvitedUICtrlCmd(audio only): link permission ");
            LIZ.append(0L);
            LIZ.append(' ');
            LIZ.append(LIZIZ);
            LIZ.append(' ');
            LIZ.append(tu1);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ));
            return tu1;
        }
        if (C78857UxB.LJJJI(LIZIZ)) {
            TU1 tu12 = new TU1(this, 2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("provideBeInvitedUICtrlCmd(video): link permission ");
            LIZ2.append(0L);
            LIZ2.append(' ');
            LIZ2.append(LIZIZ);
            LIZ2.append(' ');
            LIZ2.append(tu12);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ2));
            return tu12;
        }
        TU1 tu13 = new TU1(this, 2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("provideBeInvitedUICtrlCmd: link permission ");
        LIZ3.append(0L);
        LIZ3.append(' ');
        LIZ3.append(LIZIZ);
        LIZ3.append(' ');
        LIZ3.append(tu13);
        TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ3));
        return tu13;
    }

    @Override // X.TQH
    public final void LJIIJ() {
        TY7 ty7;
        C0NB.LIZIZ("MultiGuestV3BeInviteOptPresenter", "autoReplyWhenAnchorAcceptReservation");
        try {
            EnumC38440F6u enumC38440F6u = EnumC38440F6u.LINK_MIC;
            if (!LiveAppBundleUtils.isPluginAvailable(enumC38440F6u)) {
                LiveAppBundleUtils.ensurePluginAvailable$default(enumC38440F6u, null, false, 6, null);
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            }
            if (B5G.LIZIZ().LJ() != 2 && (!MultiGuestInviteModeInterceptionSkipSetting.INSTANCE.isOpt() || !C8E.LIZLLL().eU("multi-guest guest be invite"))) {
                C30868C9o.LIZJ(R.string.mhi);
                return;
            }
            int i = C74838TYs.LJ().LJJ;
            C29556Biq.LIZ().getClass();
            if (i >= C74983Tbn.LJIIIIZZ()) {
                C29556Biq.LIZ().getClass();
                if (C74983Tbn.LJIIIIZZ() != 0) {
                    C30868C9o.LIZJ(R.string.mij);
                    LIZIZ(10049, "leave_with_reply_reserve_accept_failed");
                    return;
                }
            }
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && (ty7 = this.LJLJJL) != null) {
                OQN.LJIIJ(ty7, room.getId(), room.getOwnerUserId(), new TTY(this), room.getOwnerUserId(), 4);
            }
        } catch (IllegalStateException unused) {
            Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room2 != null) {
                TY7 ty72 = this.LJLJJL;
                if (ty72 != null) {
                    long id = room2.getId();
                    long ownerUserId = room2.getOwnerUserId();
                    room2.getOwnerUserId();
                    ty72.LJ(id, ownerUserId);
                }
                C0NB.LJIIIZ("MultiGuestV3BeInviteOptPresenter", "refuse onPluginNotAvailable");
            }
        }
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        super.detachView();
        ((C73318Sq2) this.LJLJI.getValue()).LIZLLL();
    }

    public static final void LJJJJ(TTW ttw) {
        InterfaceC74596TPk interfaceC74596TPk;
        long j;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = ttw.LJLILLLLZI;
        if (multiGuestV3GuestPresenter != null && (interfaceC74596TPk = (InterfaceC74596TPk) multiGuestV3GuestPresenter.mView) != null) {
            ArrayList arrayList = new ArrayList();
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) ttw.LJLJJI.LIZ(ttw, LJLJL[0]);
            if (multiGuestDataHolder != null) {
                j = multiGuestDataHolder.LJJIJLIJ;
            } else {
                j = 0;
            }
            interfaceC74596TPk.tryToShowGoLivePreviewDialogWhenAccepted(false, arrayList, "", j, 1);
        }
    }

    @Override // X.TQH
    public final void LJIIL(InterfaceC65784Pro interfaceC65784Pro) {
        Room room;
        TTZ ttz = this.LJLIL;
        if (ttz == null || (room = ttz.LIZ) == null) {
            return;
        }
        TY7 ty7 = this.LJLJJL;
        if (ty7 != null) {
            OQN.LJIIJ(ty7, room.getId(), this.LJLIL.LIZ.getOwnerUserId(), null, 0L, 24);
        }
        interfaceC65784Pro.invoke();
    }

    @Override // X.TQH
    public final void LJJII(AqS163S0100000_13 aqS163S0100000_13) {
        TTZ ttz = this.LJLIL;
        if (ttz == null || ttz.LIZ == null) {
            return;
        }
        InterfaceC92693kP LJJJLIIL = C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).replyAcceptNotice(this.LJLIL.LIZ.getId(), ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), this.LJLIL.LIZ.getOwnerUserId(), C78886Uxe.LJJJLIIL(C8E.LJ()))).LJJJLIIL(new AfS62S0200000_13(aqS163S0100000_13, this, 66), new AfS62S0200000_13(aqS163S0100000_13, this, 67));
        C73318Sq2 cb = (C73318Sq2) this.LJLJI.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
    }

    @Override // X.AbstractC31497CXt
    public final void attachView(InterfaceC31336CRo interfaceC31336CRo) {
        super.attachView((TTW) interfaceC31336CRo);
        TTZ ttz = this.LJLIL;
        if (ttz == null || ttz.LIZ == null || ttz.LIZJ == null) {
            return;
        }
        this.LJLJJL = new TY7(this.LJLJJLL, this.LJLIL.LIZJ, false);
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final /* bridge */ /* synthetic */ void attachView(InterfaceC2301691o interfaceC2301691o) {
        attachView((TTW) interfaceC2301691o);
    }

    public TTW(TTZ ttz, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter) {
        this.LJLIL = ttz;
        this.LJLILLLLZI = multiGuestV3GuestPresenter;
        this.LJLJI = C221108m2.LIZIZ(TQR.LJLIL);
        this.LJLJJI = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
        this.LJLJJLL = new TTX(this);
    }

    @Override // X.InterfaceC31831CeR
    public final void LIZIZ(int i, String str) {
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLILLLLZI;
        if (multiGuestV3GuestPresenter != null) {
            TQM.exitInteractInNormalWay$default(multiGuestV3GuestPresenter, str, false, i, 2, null);
        }
    }

    @Override // X.TQH
    public final C74749TVh LJIJI(long j, boolean z) {
        int LIZIZ = TRK.LIZIZ(j);
        Room room = null;
        if (C78857UxB.LJJJ(LIZIZ)) {
            MultiGuestV3GuestGoLivePreviewPanelOpt multiGuestV3GuestGoLivePreviewPanelOpt = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE;
            boolean isSupportSilentMic = multiGuestV3GuestGoLivePreviewPanelOpt.isSupportSilentMic();
            boolean isSupportCloseGoLive = multiGuestV3GuestGoLivePreviewPanelOpt.isSupportCloseGoLive();
            TTZ ttz = this.LJLIL;
            if (ttz != null) {
                room = ttz.LIZ;
            }
            C74749TVh c74749TVh = new C74749TVh(isSupportSilentMic, isSupportCloseGoLive, null, this, C78926UyI.LJJIJL(room), false, !z, false, z, -1, 662);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideBeInvitedPreviewDialogUICtrlCmd(audio only): link permission ");
            LIZ.append(j);
            LIZ.append(' ');
            LIZ.append(LIZIZ);
            LIZ.append(' ');
            LIZ.append(c74749TVh);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ));
            return c74749TVh;
        }
        if (!C78857UxB.LJJJI(LIZIZ)) {
            return null;
        }
        MultiGuestV3GuestGoLivePreviewPanelOpt multiGuestV3GuestGoLivePreviewPanelOpt2 = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE;
        boolean isSupportSilentMic2 = multiGuestV3GuestGoLivePreviewPanelOpt2.isSupportSilentMic();
        boolean isSupportCloseGoLive2 = multiGuestV3GuestGoLivePreviewPanelOpt2.isSupportCloseGoLive();
        TTZ ttz2 = this.LJLIL;
        if (ttz2 != null) {
            room = ttz2.LIZ;
        }
        C74749TVh c74749TVh2 = new C74749TVh(isSupportSilentMic2, isSupportCloseGoLive2, null, this, C78926UyI.LJJIJLIJ(room), false, !z, false, z, -1, 662);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("provideBeInvitedPreviewDialogUICtrlCmd: link permission ");
        LIZ2.append(j);
        LIZ2.append(' ');
        LIZ2.append(LIZIZ);
        LIZ2.append(' ');
        LIZ2.append(c74749TVh2);
        TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ2));
        return c74749TVh2;
    }
}
