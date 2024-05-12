package com.bytedance.android.livesdk.broadcast.obs;

import X.ActivityC45651qj;
import X.B35;
import X.B4U;
import X.B5G;
import X.BCN;
import X.BZI;
import X.C0NB;
import X.C10W;
import X.C11000bw;
import X.C16880lQ;
import X.C18200nY;
import X.C22800uy;
import X.C22880v6;
import X.C28509BGv;
import X.C28787BRn;
import X.C29044Baa;
import X.C29084BbE;
import X.C29306Beo;
import X.C29694Bl4;
import X.C29695Bl5;
import X.C29697Bl7;
import X.C29927Bop;
import X.C2M;
import X.C30196BtA;
import X.C30197BtB;
import X.C30198BtC;
import X.C30199BtD;
import X.C30216BtU;
import X.C30222Bta;
import X.C30554Byw;
import X.C31482CXe;
import X.C32537Cpp;
import X.C40625Fwz;
import X.C47061t0;
import X.C5H3;
import X.C73411SrX;
import X.C78996UzQ;
import X.C7N;
import X.CN1;
import X.EnumC29309Ber;
import X.EnumC30204BtI;
import X.EnumC30213BtR;
import X.EnumC31509CYf;
import X.InterfaceC28605BKn;
import X.InterfaceC30442Bx8;
import X.OJY;
import X.ServiceConnectionC30192Bt6;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenCloseGuide;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenShowGuide;
import com.bytedance.android.livesdk.dataChannel.LiveNotShowGuideAgain;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ObsBroadcastFragment extends BaseBroadcastFragment implements C10W {
    public static final /* synthetic */ int LL = 0;
    public C30196BtA LJLJL;
    public C30216BtU LJLJLJ;
    public C2M LJLJLLL;
    public IMessageManager LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public C29694Bl4 LJLLLL;
    public C11000bw LJLLLLLL;
    public C30198BtC LJLZ;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public final C5H3 LJZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 125));
    public final ServiceConnectionC30192Bt6 LJZI = new ServiceConnectionC30192Bt6(this);

    @Override // X.C10W
    public final void Q3(String floatContext, PunishEventInfo punishEventInfo, int i) {
        o.LJIIIZ(floatContext, "floatContext");
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZL).clear();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Kl() {
        ((IGiftService) CN1.LIZ(IGiftService.class)).destroyGiftBannedManager();
        this.mStatusDestroyed = true;
        Sl();
        C29694Bl4 c29694Bl4 = this.LJLLLL;
        if (c29694Bl4 != null) {
            c29694Bl4.LIZ(true);
            B35 b35 = c29694Bl4.LIZLLL;
            if (b35 != null) {
                b35.stop(true);
            }
            B35 b352 = c29694Bl4.LIZLLL;
            if (b352 != null) {
                b352.recycle();
            }
            ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C29044Baa.class);
            LivePerformanceManager LIZ = B4U.LIZ();
            LIZ.LJJII("stream");
            LIZ.LJJIJIIJI();
            LIZ.release();
            LIZ.LJZL = -1.0f;
            LIZ.LLD = -1.0f;
            LIZ.LL = -1.0d;
            if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
                ((IToolbarService) CN1.LIZ(IToolbarService.class)).d9();
                return;
            }
            return;
        }
        o.LJIJI("mStrategy");
        throw null;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ol() {
        Intent intent;
        if (!this.LJLLILLLL && !this.LJLLJ) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                Context context = getContext();
                if (context != null) {
                    intent = Rl(context);
                } else {
                    intent = null;
                }
                mo49getActivity.bindService(intent, this.LJZI, 1);
            }
            this.LJLLJ = true;
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Pl() {
        if (this.LJLLJ) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.unbindService(this.LJZI);
            }
            this.LJLLJ = false;
        }
    }

    public final void Sl() {
        LiveIllegalPresenter liveIllegalPresenter;
        C73411SrX c73411SrX;
        IMessageManager iMessageManager;
        Intent intent;
        if (!this.LJLLL) {
            this.LJLLL = true;
            try {
                if (this.LJLLI) {
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity != null) {
                        Context context = getContext();
                        if (context != null) {
                            intent = Rl(context);
                        } else {
                            intent = null;
                        }
                        mo49getActivity.stopService(intent);
                    }
                    this.LJLLI = false;
                }
            } catch (Throwable th) {
                C0NB.LIZLLL(th.getMessage());
            }
            C30198BtC c30198BtC = this.LJLZ;
            if (c30198BtC != null) {
                DataChannel dataChannel = c30198BtC.LJLILLLLZI;
                if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                    iMessageManager.removeMessageListener(c30198BtC);
                }
                C40625Fwz.LIZIZ();
                C7N.LJIIZILJ().rE();
                C30216BtU c30216BtU = this.LJLJLJ;
                if (c30216BtU != null && (c73411SrX = c30216BtU.LIZIZ) != null) {
                    c73411SrX.dispose();
                }
                C30196BtA c30196BtA = this.LJLJL;
                if (c30196BtA != null && (liveIllegalPresenter = c30196BtA.LJLJJL) != null) {
                    liveIllegalPresenter.resetStatusToNormal();
                }
                C30196BtA c30196BtA2 = this.LJLJL;
                if (c30196BtA2 != null) {
                    c30196BtA2.LJLJL = true;
                    LiveIllegalPresenter liveIllegalPresenter2 = c30196BtA2.LJLJJL;
                    if (liveIllegalPresenter2 != null) {
                        liveIllegalPresenter2.detachView();
                    }
                }
                C7N.LJIILL().release(xl().getId());
                C7N.LJIILL().retryReleaseAll();
                B5G.LIZJ(xl().getId(), "BgBroadcastFragment_OnDestroy");
                return;
            }
            o.LJIJI("obsBroadcastIMStation");
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final boolean isViewValid() {
        return !this.mStatusDestroyed;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Gl() {
        C31482CXe c31482CXe;
        long j;
        C40625Fwz.LIZ();
        C40625Fwz.LIZJ();
        B5G.LIZ(getRoomId(), LJIIL(), "BgBroadcastFragment_OnActivityCreated");
        this.LJLJL = new C30196BtA(xl(), getContext(), LJIIL(), this);
        new C29084BbE(xl(), getContext(), LJIIL(), this, this);
        C30216BtU c30216BtU = new C30216BtU(xl());
        c30216BtU.LIZ();
        this.LJLJLJ = c30216BtU;
        C29694Bl4 c29694Bl4 = this.LJLLLL;
        Intent intent = null;
        if (c29694Bl4 != null) {
            C29306Beo.LJJLJLI(c29694Bl4.LJFF);
            C29306Beo.LJJLJLI(c29694Bl4.LJ);
            C29306Beo.LJI(c29694Bl4.LJI);
            ActivityC45651qj activityC45651qj = c29694Bl4.LJIIL;
            if (activityC45651qj != null) {
                c31482CXe = (C31482CXe) activityC45651qj.findViewById(R.id.n9f);
            } else {
                c31482CXe = null;
            }
            c29694Bl4.LJIIIZ = c31482CXe;
            if (c29694Bl4.LIZ.getStreamUrl() != null) {
                j = c29694Bl4.LIZ.getStreamUrl().streamDelayMs;
            } else {
                j = 0;
            }
            RoomPlayer2 Ha = C7N.LJIJ().Ha(c29694Bl4.LIZ.getId(), c29694Bl4.LIZ.getMultiStreamData(), c29694Bl4.LIZ.getMultiStreamDefaultQualitySdkKey(), c29694Bl4.LIZ.getStreamType(), c29694Bl4.LIZ.getStreamSrConfig(), c29694Bl4.LJIIIZ, c29694Bl4, c29694Bl4.LJIIL, j);
            Ha.setSeiOpen(!c29694Bl4.LJIIJ);
            Ha.startWithNewLivePlayer();
            c29694Bl4.LIZLLL = Ha;
            c29694Bl4.LJIIIIZZ = false;
            EnumC30204BtI.STREAM_KEY.load(c29694Bl4.LIZJ, new C29695Bl5(c29694Bl4));
            if (Build.VERSION.SDK_INT >= 26) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    Context context = getContext();
                    if (context != null) {
                        intent = Rl(context);
                    }
                    mo49getActivity.startForegroundService(intent);
                }
            } else {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        intent = Rl(context2);
                    }
                    mo49getActivity2.startService(intent);
                }
            }
            this.LJLLI = true;
            C18200nY.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && room.getOwner().getSecUid() != null) {
                ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).sf0(LJIIL(), Long.valueOf(room.getId()), room.getOwner().getSecUid());
                return;
            }
            return;
        }
        o.LJIJI("mStrategy");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.ugc.live.sdk.message.interfaces.IMessageManager, O] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Il() {
        InterfaceC28605BKn ho;
        C22800uy.LIZIZ();
        C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.Q0;
        Boolean bool = Boolean.TRUE;
        c30554Byw.LIZJ(bool);
        C29694Bl4 c29694Bl4 = new C29694Bl4(xl(), this, LJIIL());
        EnumC29309Ber.OBS.config();
        this.LJLLLL = c29694Bl4;
        C30197BtB c30197BtB = new C30197BtB(xl());
        c30197BtB.LIZIZ = new C30199BtD(this);
        this.LJLLLLLL = new C11000bw(c30197BtB);
        IMessageManager iMessageManager = (IMessageManager) LJIIL().kv0(C29927Bop.class);
        this.LJLL = iMessageManager;
        if (iMessageManager == null) {
            this.LJLL = C7N.LJIILL().messageManagerProvider(xl().getId(), true, getContext());
        }
        ((C32537Cpp) LJIIL().gv0(C29927Bop.class)).LIZ = this.LJLL;
        vl();
        C30198BtC c30198BtC = new C30198BtC(xl());
        DataChannel LJIIL = LJIIL();
        c30198BtC.LJLILLLLZI = LJIIL;
        IMessageManager iMessageManager2 = (IMessageManager) LJIIL.kv0(C29927Bop.class);
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), c30198BtC);
        }
        this.LJLZ = c30198BtC;
        DataChannel LJIIL2 = LJIIL();
        LJIIL2.lv0(this, LiveExtendedScreenShowGuide.class, new AqS171S0100000_5(this, 854));
        LJIIL2.lv0(this, LiveExtendedScreenCloseGuide.class, new AqS171S0100000_5(this, 855));
        LJIIL2.lv0(this, LiveNotShowGuideAgain.class, new AqS171S0100000_5(this, 856));
        ((C32537Cpp) LJIIL2.gv0(BCN.class)).LIZ = Long.valueOf(xl().getId());
        LJIIL2.rv0(UserIsAnchorChannel.class, bool);
        LJIIL().lv0(this, MemberMessageChannel.class, new AqS171S0100000_5(this, 857));
        LJIIL().ov0(this, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 858));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.nv0(this, this, ShowEndPageEvent.class, new AqS171S0100000_5(this, 859));
        dataChannelGlobal.nv0(this, this, EndLiveWithoutEndPage.class, new AqS171S0100000_5(this, 860));
        dataChannelGlobal.tv0(BroadcastShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
        IPullStreamService iPullStreamService = (IPullStreamService) CN1.LIZ(IPullStreamService.class);
        if (iPullStreamService != null && (ho = iPullStreamService.ho()) != null) {
            ho.LIZ();
        }
    }

    @Override // X.C10W
    public final void Lc(int i) {
        Integer num;
        Creator creator = xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            OJY.LJIIL(i, Al(), getRoomId(), false, num.intValue());
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void Ql(View view) {
        C47061t0 c47061t0;
        C47061t0 c47061t02;
        View view2;
        Integer num;
        o.LJIIIZ(view, "view");
        ((IDebugService) CN1.LIZ(IDebugService.class)).IC(getContext(), LJIIL(), EnumC30213BtR.BROADCAST);
        ((IGiftService) CN1.LIZ(IGiftService.class)).initGiftBannedManager(xl(), LJIIL(), true);
        C7N.LJIIZILJ().Dq0(xl().getId());
        C29694Bl4 c29694Bl4 = this.LJLLLL;
        String str = null;
        if (c29694Bl4 != null) {
            ActivityC45651qj activityC45651qj = c29694Bl4.LJIIL;
            if (activityC45651qj != null) {
                c47061t0 = (C47061t0) activityC45651qj.findViewById(R.id.af5);
            } else {
                c47061t0 = null;
            }
            c29694Bl4.LJFF = c47061t0;
            ActivityC45651qj activityC45651qj2 = c29694Bl4.LJIIL;
            if (activityC45651qj2 != null) {
                c47061t02 = (C47061t0) activityC45651qj2.findViewById(R.id.n4h);
            } else {
                c47061t02 = null;
            }
            c29694Bl4.LJI = c47061t02;
            ActivityC45651qj activityC45651qj3 = c29694Bl4.LJIIL;
            if (activityC45651qj3 != null) {
                view2 = activityC45651qj3.findViewById(R.id.g94);
            } else {
                view2 = null;
            }
            c29694Bl4.LJ = view2;
            C22880v6.LIZ(c29694Bl4.LJFF, c29694Bl4.LIZ);
            Creator creator = xl().creator;
            if (creator != null && (num = creator.roomContinue) != null) {
                int intValue = num.intValue();
                Integer num2 = xl().creator.roomContinue;
                if (num2 != null && num2.intValue() == 2) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_back_to_live");
                    LIZ.LJIILLIIL(LJIIL());
                    LIZ.LJJIIJ(xl().getIdStr());
                    LIZ.LJFF(String.valueOf(xl().getOwnerUserId()));
                    LiveMode streamType = xl().getStreamType();
                    if (streamType != null) {
                        str = C28509BGv.LIZ(streamType);
                    }
                    LIZ.LJIJ(str);
                    LIZ.LIZJ("exempt");
                    LIZ.LJJIIJZLJL();
                }
                C29697Bl7.LJIILL(intValue);
                return;
            }
            return;
        }
        o.LJIJI("mStrategy");
        throw null;
    }

    public final Intent Rl(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, C7N.LJIIJJI().getBgBroadcastServiceName()));
        return intent;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View Jl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.cu_, viewGroup, false);
    }

    @Override // X.C10W
    public final void Ta(int i, Cert cert) {
        o.LJIIIZ(cert, "cert");
        Sl();
        Tl(i, -1);
    }

    public final void Tl(int i, int i2) {
        if (this.mStatusDestroyed) {
            return;
        }
        C11000bw c11000bw = this.LJLLLLLL;
        if (c11000bw != null) {
            c11000bw.LJFF(i);
            C30222Bta.LIZ(xl(), LJIIL());
            this.LJLLILLLL = true;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.setRequestedOrientation(1);
            }
            Bundle bundle = new Bundle();
            if (i2 == 30003 || i2 == 30003001) {
                bundle.putInt("live_end_error_code", i2);
            }
            C2M c2m = this.LJLJLLL;
            if (c2m != null) {
                c2m.LIZ(bundle);
            }
            C29694Bl4 c29694Bl4 = this.LJLLLL;
            if (c29694Bl4 != null) {
                c29694Bl4.LJIIIIZZ = true;
                C29306Beo.LJI(c29694Bl4.LJFF);
                C29306Beo.LJI(c29694Bl4.LJ);
                C29306Beo.LJJLJLI(c29694Bl4.LJI);
                c29694Bl4.LIZ(false);
                return;
            }
            o.LJIJI("mStrategy");
            throw null;
        }
        o.LJIJI("mStatusService");
        throw null;
    }
}
