package Y;

import X.AbstractC73672Svk;
import X.AnonymousClass030;
import X.C00F;
import X.C0NB;
import X.C15380j0;
import X.C16530kr;
import X.C16880lQ;
import X.C176996x5;
import X.C18520o4;
import X.C1EW;
import X.C26338AVi;
import X.C29162BcU;
import X.C29306Beo;
import X.C29401Dk;
import X.C30868C9o;
import X.C31597Caf;
import X.C32257ClJ;
import X.C32444CoK;
import X.C34K;
import X.C46748IWi;
import X.C47061t0;
import X.C4BT;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73969T1h;
import X.C75838Tpa;
import X.C75870Tq6;
import X.C75989Ts1;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76288Twq;
import X.C76312TxE;
import X.C76766UAw;
import X.C77119UOl;
import X.C77267UUd;
import X.C77268UUe;
import X.C77269UUf;
import X.C77270UUg;
import X.C77271UUh;
import X.C77272UUi;
import X.C78173Um9;
import X.C78203Umd;
import X.C78866UxK;
import X.C78886Uxe;
import X.C81185Vtd;
import X.C84924XUq;
import X.C8E;
import X.EnumC38440F6u;
import X.I9W;
import X.InterfaceC173976sD;
import X.InterfaceC29856Bng;
import X.InterfaceC32251ClD;
import X.InterfaceC65818PsM;
import X.InterfaceC75579TlP;
import X.InterfaceC75871Tq7;
import X.InterfaceC76347Txn;
import X.InterfaceC76348Txo;
import X.InterfaceC76622U5i;
import X.InterfaceC78204Ume;
import X.InterfaceC78212Umm;
import X.InterfaceC92693kP;
import X.NZ9;
import X.Q7L;
import X.RunnableC31065CHd;
import X.TBF;
import X.U1X;
import X.U1Y;
import X.U46;
import X.U4R;
import X.U5I;
import X.U5K;
import X.U5M;
import X.U67;
import X.U7F;
import X.U7T;
import X.U8H;
import X.X1D;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostInviteListFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListUpgradeFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilterImpl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ARunnableS17S0101000_13 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public final void LIZ$10() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state machine state change to ");
        LIZ.append(this.i1);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7T u7t = (U7T) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        int i = this.i1;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LLI(i, u7t);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Room room;
        long j;
        if (((C76288Twq) this.l0).LJLJLLL) {
            return;
        }
        long LIZJ = C76265TwT.LIZ.LIZJ();
        ((C76288Twq) this.l0).getClass();
        if (!C76288Twq.LJJJJL()) {
            C76272Twa.LJJIIZ(C77119UOl.LJIIJ(this.i1));
        } else {
            C76271TwZ.LIZ.LJJIJLIJ(C77119UOl.LJIIJ(this.i1));
        }
        DataChannel dataChannel = ((C76288Twq) this.l0).dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        LinkBattleApi linkBattleApi = (LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class);
        long j2 = 0;
        if (room != null) {
            j = room.getId();
            j2 = room.getOwnerUserId();
        } else {
            j = 0;
        }
        InterfaceC29856Bng interfaceC29856Bng = (InterfaceC29856Bng) linkBattleApi.getInfo(j, LIZJ, 0L, j2, 2).LIZJ(((C76288Twq) this.l0).activityAutoDisposeWithTransformer());
        C76288Twq c76288Twq = (C76288Twq) this.l0;
        interfaceC29856Bng.LIZJ(new AfS39S0101000_13(this.i1, c76288Twq, 0), new AfS65S0100000_13(c76288Twq, 18));
    }

    public final void LIZ$1() {
        long LIZ = (this.i1 / C15380j0.LIZ(40.0f)) * 1000;
        C34K c34k = new C34K();
        ValueAnimator valueAnimator = ((U5I) this.l0).LJLJLJ;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((U5I) this.l0).LJLJLJ = ValueAnimator.ofInt(0, this.i1);
        U5I u5i = (U5I) this.l0;
        ValueAnimator valueAnimator2 = u5i.LJLJLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS37S0201000_13(u5i, this.i1, c34k, 0));
        }
        U5I u5i2 = (U5I) this.l0;
        ValueAnimator valueAnimator3 = u5i2.LJLJLJ;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new IDAListenerS80S0100000_13(u5i2, 5));
        }
        U5I u5i3 = (U5I) this.l0;
        ValueAnimator valueAnimator4 = u5i3.LJLJLJ;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new IDAListenerS80S0100000_13(u5i3, 4));
        }
        ValueAnimator valueAnimator5 = ((U5I) this.l0).LJLJLJ;
        if (valueAnimator5 != null) {
            valueAnimator5.setDuration(LIZ);
        }
        ValueAnimator valueAnimator6 = ((U5I) this.l0).LJLJLJ;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void LIZ$11() {
        long LIZ = (this.i1 / C15380j0.LIZ(40.0f)) * 1000;
        C34K c34k = new C34K();
        ValueAnimator valueAnimator = ((U5M) this.l0).LJLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((U5M) this.l0).LJLL = ValueAnimator.ofInt(0, this.i1);
        U5M u5m = (U5M) this.l0;
        ValueAnimator valueAnimator2 = u5m.LJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS1S0201100_13(u5m, this.i1, c34k, LIZ, 1));
        }
        U5M u5m2 = (U5M) this.l0;
        ValueAnimator valueAnimator3 = u5m2.LJLL;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new IDAListenerS80S0100000_13(u5m2, 19));
        }
        U5M u5m3 = (U5M) this.l0;
        ValueAnimator valueAnimator4 = u5m3.LJLL;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new IDAListenerS80S0100000_13(u5m3, 18));
        }
        ValueAnimator valueAnimator5 = ((U5M) this.l0).LJLL;
        if (valueAnimator5 != null) {
            valueAnimator5.setDuration(LIZ);
        }
        ValueAnimator valueAnimator6 = ((U5M) this.l0).LJLL;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void LIZ$12() {
        int i = this.i1;
        if (i != 4) {
            if (i != 5) {
                if (LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.INSTANCE.getValue().reportWhenNotReachFrameLinked) {
                    U67 u67 = (U67) this.l0;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("stateChangeTo");
                    LIZ.append(this.i1);
                    u67.LIZLLL(20008, X1D.LIZIZ(LIZ));
                    return;
                }
                U67 u672 = (U67) this.l0;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("stateChangeTo");
                LIZ2.append(this.i1);
                u672.LIZJ(X1D.LIZIZ(LIZ2));
                return;
            }
            U67 u673 = (U67) this.l0;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("stateChangeTo");
            LIZ3.append(this.i1);
            u673.LIZJ(X1D.LIZIZ(LIZ3));
            return;
        }
        if (!LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.INSTANCE.getValue().reportWhenNotReachFrameLinked) {
            U67 u674 = (U67) this.l0;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("stateChangeTo");
            LIZ4.append(this.i1);
            u674.LIZJ(X1D.LIZIZ(LIZ4));
        }
        U67 u675 = (U67) this.l0;
        u675.getClass();
        U4R.LIZLLL("FirstFrameNotReceiveExpMonitorForGuest", "startCountDown");
        u675.LJLJJI = new C18520o4();
        u675.LJLJI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(u675.LJLILLLLZI, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJJZI(new AfS65S0100000_13(u675, 232));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r2.intValue() != 3) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L1b
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings r0 = r0.multiLiveUserSettings
            if (r0 == 0) goto L1b
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings r0 = r0.multiLiveUserApplySettings
            if (r0 == 0) goto L1b
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission r0 = r0.multiLiveUserApplyPermission
            if (r0 == 0) goto L1b
            int r0 = r0.multiLiveApplyPermission
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 1
            if (r2 != 0) goto L53
        L1b:
            r4 = 0
        L1c:
            int r5 = r6.i1
            com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting r2 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.INSTANCE
            double r0 = com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting.getSAMPLE_100()
            java.lang.String r3 = "livesdk_linkmic_multi_guest_icon_show"
            boolean r0 = r2.isReport(r3, r0)
            if (r0 != 0) goto L2e
        L2d:
            return
        L2e:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.TWL.LIZ(r2)
            java.lang.String r1 = "scene"
            java.lang.String r0 = "audience_get_anchor_pannel_setting"
            r2.put(r1, r0)
            java.lang.String r1 = "response_status"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r2.put(r1, r0)
            java.lang.String r1 = "is_visible"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.put(r1, r0)
            X.TWL.LJIL(r3, r2)
            goto L2d
        L53:
            int r0 = r2.intValue()
            if (r0 == r4) goto L1c
            int r1 = r2.intValue()
            r0 = 2
            if (r1 == r0) goto L1c
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L1b
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS17S0101000_13.LIZ$2():void");
    }

    public final void LIZ$3() {
        long LIZ = (this.i1 / C15380j0.LIZ(40.0f)) * 1000;
        C34K c34k = new C34K();
        ValueAnimator valueAnimator = ((U5K) this.l0).LJLLILLLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((U5K) this.l0).LJLLILLLL = ValueAnimator.ofInt(0, this.i1);
        U5K u5k = (U5K) this.l0;
        ValueAnimator valueAnimator2 = u5k.LJLLILLLL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS1S0201100_13(u5k, this.i1, c34k, LIZ, 0));
        }
        U5K u5k2 = (U5K) this.l0;
        ValueAnimator valueAnimator3 = u5k2.LJLLILLLL;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new IDAListenerS80S0100000_13(u5k2, 11));
        }
        U5K u5k3 = (U5K) this.l0;
        ValueAnimator valueAnimator4 = u5k3.LJLLILLLL;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new IDAListenerS80S0100000_13(u5k3, 10));
        }
        ValueAnimator valueAnimator5 = ((U5K) this.l0).LJLLILLLL;
        if (valueAnimator5 != null) {
            valueAnimator5.setDuration(LIZ);
        }
        ValueAnimator valueAnimator6 = ((U5K) this.l0).LJLLILLLL;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    public final void LIZ$4() {
        long LIZ = (this.i1 / C15380j0.LIZ(40.0f)) * 1000;
        ValueAnimator valueAnimator = ((U1X) this.l0).LLFII;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((U1X) this.l0).LLFII = ValueAnimator.ofInt(0, this.i1);
        U1X u1x = (U1X) this.l0;
        ValueAnimator valueAnimator2 = u1x.LLFII;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS73S0101000_13(this.i1, u1x, 1));
        }
        ValueAnimator valueAnimator3 = ((U1X) this.l0).LLFII;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(LIZ);
        }
        ValueAnimator valueAnimator4 = ((U1X) this.l0).LLFII;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final void LIZ$5() {
        AnimatorSet animatorSet = ((U46) this.l0).LJLLLL;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = ((U46) this.l0).LJLLLL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        U46 u46 = (U46) this.l0;
        int i = this.i1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u46.LIZ(R.id.mq7), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(tv_victory_activ…tips, View.ALPHA, 1f, 0f)");
        ValueAnimator ofInt = ValueAnimator.ofInt(C15380j0.LIZ(9.0f), i);
        o.LJIIIIZZ(ofInt, "ofInt(ResUtil.dp2Px(9f), tipsRaiseLength)");
        ofInt.addUpdateListener(new AUListenerS100S0100000_13(u46, 68));
        int height = u46.LIZ(R.id.g71).getHeight();
        int LIZ = C15380j0.LIZ(35.0f);
        int LIZJ = AnonymousClass030.LIZJ(height, LIZ, 2, LIZ);
        C34K c34k = new C34K();
        c34k.element = true;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(height, LIZ);
        o.LJIIIIZZ(ofInt2, "ofInt(viewheight, targrtHeight)");
        ofInt2.addUpdateListener(new AUListenerS37S0201000_13(u46, LIZJ, c34k, 1));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ofFloat.setDuration(100L);
        ofInt2.setDuration(200L);
        ofInt.setDuration(200L);
        animatorSet3.play(ofFloat);
        animatorSet3.play(ofInt2).with(ofInt).after(ofFloat);
        u46.LJLLLL = animatorSet3;
        AnimatorSet animatorSet4 = ((U46) this.l0).LJLLLL;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        U46 u462 = (U46) this.l0;
        u462.removeCallbacks(u462.LJLJL);
        U46 u463 = (U46) this.l0;
        u463.LJLJL = new ARunnableS49S0100000_13(u463, 113);
        C75838Tpa victoryLapActivityListener = u463.getVictoryLapActivityListener();
        if (victoryLapActivityListener != null) {
            victoryLapActivityListener.LIZJ(C15380j0.LIZ(35.0f) + this.i1, true);
        }
        U46 u464 = (U46) this.l0;
        u464.postDelayed(u464.LJLJL, 200L);
    }

    public final void LIZ$6() {
        C47061t0 c47061t0 = ((U1Y) this.l0).LJLJI;
        if (c47061t0 != null && c47061t0.getVisibility() == 8) {
            C47061t0 c47061t02 = ((U1Y) this.l0).LJLJI;
            if (c47061t02 != null) {
                c47061t02.setActualImageResource(this.i1);
            }
            C47061t0 c47061t03 = ((U1Y) this.l0).LJLJI;
            if (c47061t03 != null) {
                c47061t03.setVisibility(0);
            }
            C47061t0 c47061t04 = ((U1Y) this.l0).LJLJI;
            if (c47061t04 != null) {
                c47061t04.setAlpha(1.0f);
            }
        }
        TBF tbf = ((U1Y) this.l0).LJLJJI;
        if (tbf != null && tbf.getVisibility() == 8) {
            U1Y u1y = (U1Y) this.l0;
            if (u1y.LJLJJI != null) {
                u1y.getRingColor();
            }
            TBF tbf2 = ((U1Y) this.l0).LJLJJI;
            if (tbf2 != null) {
                tbf2.setVisibility(0);
            }
        }
        C31597Caf c31597Caf = ((U1Y) this.l0).LJLILLLLZI;
        if (c31597Caf == null) {
            return;
        }
        c31597Caf.setVisibility(0);
    }

    public final void LIZ$7() {
        AnimatorSet animatorSet;
        int i;
        AnimatorSet animatorSet2 = ((U46) this.l0).LJLLILLLL;
        if (animatorSet2 != null) {
            C16880lQ.LJLJJL(animatorSet2);
        }
        AnimatorSet animatorSet3 = ((U46) this.l0).LJLLILLLL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        U46 u46 = (U46) this.l0;
        u46.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lottie_trigger_activity height is ");
        LIZ.append(u46.LIZ(R.id.ga8).getHeight());
        LIZ.append(", ll_victory_activity_tips height is ");
        LIZ.append(u46.LIZ(R.id.g71).getHeight());
        C0NB.LIZIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ));
        if (u46.LIZ(R.id.ga8).getHeight() == 0 || u46.LIZ(R.id.g71).getHeight() == 0) {
            animatorSet = new AnimatorSet();
        } else {
            float LIZ2 = C15380j0.LIZ(8.0f) / u46.LIZ(R.id.g71).getHeight();
            float height = (u46.LIZ(R.id.g71).getHeight() / u46.LIZ(R.id.ga8).getHeight()) + LIZ2;
            int LIZLLL = C81185Vtd.LIZLLL() / 2;
            View ll_victory_activity_tips = u46.LIZ(R.id.g71);
            o.LJIIIIZZ(ll_victory_activity_tips, "ll_victory_activity_tips");
            ViewGroup.LayoutParams layoutParams = ll_victory_activity_tips.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                i = 0;
            }
            float f = LIZLLL - i;
            float f2 = height - LIZ2;
            float f3 = 2;
            float width = f - ((u46.LIZ(R.id.ga8).getWidth() * f2) / f3);
            if (C15380j0.LJIIZILJ()) {
                width = -width;
            }
            float y = (u46.LIZ(R.id.g71).getY() - u46.LIZ(R.id.ga8).getY()) - (((1 - f2) / f3) * u46.LIZ(R.id.ga8).getHeight());
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u46.LIZ(R.id.ga8), (Property<View, Float>) View.TRANSLATION_X, 0.0f, -width);
            o.LJIIIIZZ(ofFloat, "ofFloat(lottie_trigger_a…ATION_X, 0f, -translateX)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u46.LIZ(R.id.ga8), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, y);
            o.LJIIIIZZ(ofFloat2, "ofFloat(lottie_trigger_a…LATION_Y, 0f, translateY)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u46.LIZ(R.id.ga8), (Property<View, Float>) View.SCALE_X, 1.0f, height);
            o.LJIIIIZZ(ofFloat3, "ofFloat(lottie_trigger_a… View.SCALE_X, 1f, scale)");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u46.LIZ(R.id.ga8), (Property<View, Float>) View.SCALE_Y, 1.0f, height);
            o.LJIIIIZZ(ofFloat4, "ofFloat(lottie_trigger_a… View.SCALE_Y, 1f, scale)");
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(u46.LIZ(R.id.g71), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            o.LJIIIIZZ(ofFloat5, "ofFloat(ll_victory_activ…tips, View.ALPHA, 0f, 1f)");
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u46.LIZ(R.id.mq7), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            o.LJIIIIZZ(ofFloat6, "ofFloat(tv_victory_activ…tips, View.ALPHA, 0f, 1f)");
            ofFloat.setInterpolator(u46.LJZ);
            ofFloat2.setInterpolator(u46.LJZ);
            ofFloat3.setInterpolator(u46.LJZ);
            ofFloat4.setInterpolator(u46.LJZ);
            animatorSet = new AnimatorSet();
            ofFloat.setDuration(200L);
            ofFloat2.setDuration(200L);
            ofFloat3.setDuration(200L);
            ofFloat4.setDuration(200L);
            ofFloat5.setDuration(200L);
            ofFloat6.setDuration(200L);
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
            animatorSet.play(ofFloat6).after(ofFloat5);
        }
        u46.LJLLILLLL = animatorSet;
        AnimatorSet animatorSet4 = ((U46) this.l0).LJLLILLLL;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        C75838Tpa victoryLapActivityListener = ((U46) this.l0).getVictoryLapActivityListener();
        if (victoryLapActivityListener != null) {
            victoryLapActivityListener.LIZJ(C15380j0.LIZ(10.0f) + ((U46) this.l0).LIZ(R.id.g71).getHeight(), true);
        }
        C75838Tpa victoryLapActivityListener2 = ((U46) this.l0).getVictoryLapActivityListener();
        if (victoryLapActivityListener2 != null) {
            victoryLapActivityListener2.LIZ("explanation");
        }
        U46 u462 = (U46) this.l0;
        u462.removeCallbacks(u462.LJLJJLL);
        U46 u463 = (U46) this.l0;
        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(u463, 121);
        u463.LJLJJLL = aRunnableS49S0100000_13;
        u463.postDelayed(aRunnableS49S0100000_13, this.i1 * 1000);
    }

    public final void LIZ$8() {
        int i;
        U46 u46 = (U46) this.l0;
        View ll_victory_activity_tips = u46.LIZ(R.id.g71);
        o.LJIIIIZZ(ll_victory_activity_tips, "ll_victory_activity_tips");
        Integer valueOf = Integer.valueOf(C15380j0.LIZ(12.0f));
        View ll_victory_activity_tips2 = u46.LIZ(R.id.g71);
        o.LJIIIIZZ(ll_victory_activity_tips2, "ll_victory_activity_tips");
        ViewGroup.LayoutParams layoutParams = ll_victory_activity_tips2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        boolean z = false;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        C26338AVi.LJI(ll_victory_activity_tips, valueOf, Integer.valueOf(i), Integer.valueOf(C15380j0.LIZ(12.0f)), Integer.valueOf(C15380j0.LIZ(9.0f)), false, 16);
        View ll_victory_activity_tips3 = u46.LIZ(R.id.g71);
        o.LJIIIIZZ(ll_victory_activity_tips3, "ll_victory_activity_tips");
        C78866UxK.LJJLIL(ll_victory_activity_tips3, -2);
        View ll_victory_activity_tips4 = u46.LIZ(R.id.g71);
        o.LJIIIIZZ(ll_victory_activity_tips4, "ll_victory_activity_tips");
        C78866UxK.LJJLJ(-1, ll_victory_activity_tips4);
        C29306Beo.LJJLJLI(u46.LIZ(R.id.g71));
        C29306Beo.LJI(u46.LIZ(R.id.jcw));
        C29306Beo.LJJLJLI(u46.LIZ(R.id.mq7));
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = C76265TwT.LIZ.LJJJLIIL;
        if (battleTruthOrDareTriggerGuideV2 != null && battleTruthOrDareTriggerGuideV2.isFirstTime) {
            z = true;
        }
        if (z) {
            C29306Beo.LJJLIIIIJ(C15380j0.LIZ(32.0f), u46.LIZ(R.id.mq7));
            C29306Beo.LJJLJLI(u46.LIZ(R.id.exa));
        } else {
            C29306Beo.LJJLIIIIJ(C15380j0.LIZ(12.0f), u46.LIZ(R.id.mq7));
            C29306Beo.LJI(u46.LIZ(R.id.exa));
        }
        ((U46) this.l0).LIZ(R.id.g71).setAlpha(0.0f);
        ((U46) this.l0).LIZ(R.id.mq7).setAlpha(0.0f);
        U46 u462 = (U46) this.l0;
        u462.post(new ARunnableS17S0101000_13(this.i1, u462, 9));
    }

    public final void LIZ$9() {
        long j;
        long j2;
        InterfaceC76347Txn LIZ;
        InterfaceC75871Tq7 LIZIZ;
        C75989Ts1 LJFF;
        InterfaceC76347Txn LIZ2;
        InterfaceC75871Tq7 LIZIZ2;
        InterfaceC75871Tq7 LIZIZ3;
        C75989Ts1 LJFF2;
        InterfaceC76348Txo interfaceC76348Txo = ((C76312TxE) this.l0).LIZ;
        if (interfaceC76348Txo == null) {
            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, return by viewInterface");
            return;
        }
        InterfaceC76347Txn LIZ3 = interfaceC76348Txo.LIZ();
        long j3 = 0;
        if (LIZ3 != null && (LIZIZ3 = LIZ3.LIZIZ()) != null && (LJFF2 = LIZIZ3.LJFF()) != null) {
            j = LJFF2.LIZJ;
        } else {
            j = 0;
        }
        InterfaceC76348Txo interfaceC76348Txo2 = ((C76312TxE) this.l0).LIZ;
        if (interfaceC76348Txo2 != null && (LIZ2 = interfaceC76348Txo2.LIZ()) != null && (LIZIZ2 = LIZ2.LIZIZ()) != null) {
            j2 = LIZIZ2.LIZ();
        } else {
            j2 = 0;
        }
        InterfaceC76348Txo interfaceC76348Txo3 = ((C76312TxE) this.l0).LIZ;
        if (interfaceC76348Txo3 != null && (LIZ = interfaceC76348Txo3.LIZ()) != null && (LIZIZ = LIZ.LIZIZ()) != null && (LJFF = LIZIZ.LJFF()) != null) {
            j3 = LJFF.LIZIZ;
        }
        C75870Tq6 c75870Tq6 = new C75870Tq6();
        AbstractC73672Svk LIZ4 = C1EW.LIZ(((LinkBattleApi) Q7L.LIZIZ(LinkBattleApi.class)).getInfo(j, j2, j3));
        C76312TxE c76312TxE = (C76312TxE) this.l0;
        InterfaceC92693kP LJJJLIIL = LIZ4.LJJJLIIL(new AfS33S0201000_13(this.i1, c75870Tq6, c76312TxE, 1), new AfS62S0200000_13(c75870Tq6, c76312TxE, 23));
        C73318Sq2 cb = ((C76312TxE) this.l0).LIZIZ;
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
    }

    public static final void run$0(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        View view;
        try {
            FrameLayout frameLayout = ((WindowMaskAssem) aRunnableS17S0101000_13.l0).LJLLILLLL;
            Object obj = null;
            if (frameLayout != null) {
                obj = frameLayout.getParent();
            }
            if ((obj instanceof View) && (view = (View) obj) != null) {
                int height = view.getHeight();
                FrameLayout frameLayout2 = ((WindowMaskAssem) aRunnableS17S0101000_13.l0).LJLLILLLL;
                if (frameLayout2 != null) {
                    C29306Beo.LJJJJLI(height - aRunnableS17S0101000_13.i1, frameLayout2);
                }
                InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
                if (LJJJIL != null) {
                    ((U8H) LJJJIL).LJJJJI();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        switch (aRunnableS17S0101000_13.i1) {
            case 0:
                C29162BcU c29162BcU = (C29162BcU) aRunnableS17S0101000_13.l0;
                if (c29162BcU.LIZ) {
                    return;
                }
                LiveAppBundleUtils.ensurePluginAvailable(EnumC38440F6u.CMAF);
                LiveAppBundleUtils.ensurePluginAvailable(EnumC38440F6u.QUIC);
                LiveAppBundleUtils.ensurePluginAvailable(EnumC38440F6u.RTS);
                c29162BcU.LIZ = true;
                return;
            case 1:
                ((InterfaceC65818PsM) aRunnableS17S0101000_13.l0).LIZ();
                return;
            case 2:
                C4BT c4bt = (C4BT) aRunnableS17S0101000_13.l0;
                View findViewById = c4bt.getRootView().findViewById(R.id.edy);
                if (findViewById != null) {
                    c4bt.LJLZ = findViewById.getHeight();
                    c4bt.LJFF();
                    return;
                }
                return;
            case 3:
                ((C84924XUq) aRunnableS17S0101000_13.l0).LIZLLL.LJ.LLLLZLL(false, true);
                return;
            default:
                BmfVQScoreFilterImpl.LIZIZ((BmfVQScoreFilterImpl) aRunnableS17S0101000_13.l0);
                return;
        }
    }

    public static final void run$12(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        InterfaceC173976sD interfaceC173976sD;
        switch (aRunnableS17S0101000_13.i1) {
            case 0:
                ((LinkControlWidget) aRunnableS17S0101000_13.l0).LJLLLL.LJFF(8, 16);
                return;
            case 1:
                LocalPlayerController localPlayerController = (LocalPlayerController) aRunnableS17S0101000_13.l0;
                localPlayerController.cancel();
                localPlayerController.LIZJ(true, 0, 0, "Time out when set datasource");
                localPlayerController.LIZ(null);
                InterfaceC32251ClD LIZJ = C32257ClJ.LIZJ();
                if (LIZJ != null) {
                    LIZJ.ensureNotReachHere(new C78173Um9(), "gift_effect_play_setdata_timeout");
                    return;
                }
                return;
            case 2:
                Fragment fragment = ((C176996x5) aRunnableS17S0101000_13.l0).LJLJI;
                if ((fragment instanceof CommentListFragment) && (interfaceC173976sD = ((CommentListFragment) fragment).LLLILZJ) != null) {
                    interfaceC173976sD.show();
                    return;
                }
                return;
            case 3:
            default:
                ((LiveStream) aRunnableS17S0101000_13.l0).doBackgroundResume();
                return;
            case 4:
                ((I9W) aRunnableS17S0101000_13.l0).bi0();
                return;
            case 5:
                C46748IWi.LJJIJIL((C46748IWi) aRunnableS17S0101000_13.l0);
                return;
        }
    }

    public static final void run$13(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean z;
        boolean z2 = false;
        switch (aRunnableS17S0101000_13.i1) {
            case 0:
                ((LinkControlWidget) aRunnableS17S0101000_13.l0).LJLLLL.LJFF(0, 16);
                return;
            case 1:
                C78203Umd c78203Umd = (C78203Umd) aRunnableS17S0101000_13.l0;
                InterfaceC78212Umm interfaceC78212Umm = c78203Umd.LJI;
                if (interfaceC78212Umm != null) {
                    interfaceC78212Umm.LIZ();
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC78204Ume interfaceC78204Ume = c78203Umd.LJFF;
                if (interfaceC78204Ume != null && interfaceC78204Ume.isPlaying()) {
                    z2 = true;
                }
                StringBuilder LIZLLL = C00F.LIZLLL("timer start :message = ", z, ", media-playing = ", z2, ", playEnd = ");
                LIZLLL.append(c78203Umd.LJIIIIZZ);
                C32444CoK.LIZ("GiftCtlManager", X1D.LIZIZ(LIZLLL));
                if (z || z2 || !c78203Umd.LJIIIIZZ) {
                    c78203Umd.LIZIZ();
                    return;
                } else {
                    c78203Umd.LIZ();
                    return;
                }
            case 2:
                ((NZ9) aRunnableS17S0101000_13.l0).LIZ.LJIJJ();
                return;
            default:
                DetailFragmentPanel.LJJJJJL((DetailFragmentPanel) aRunnableS17S0101000_13.l0);
                return;
        }
    }

    public static final void run$14(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        String LJIILJJIL;
        C29401Dk c29401Dk;
        try {
            Throwable th = (Throwable) aRunnableS17S0101000_13.l0;
            if (!(th instanceof C29401Dk) || (c29401Dk = (C29401Dk) th) == null || (LJIILJJIL = c29401Dk.getPrompt()) == null || LJIILJJIL.length() <= 0) {
                LJIILJJIL = C15380j0.LJIILJJIL(aRunnableS17S0101000_13.i1);
            }
            C30868C9o.LJI(LJIILJJIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            U7F u7f = (U7F) aRunnableS17S0101000_13.l0;
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
            int i = aRunnableS17S0101000_13.i1;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LLI(i, u7f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            int i = aRunnableS17S0101000_13.i1;
            if (i == 0) {
                ((RemoveMLBBFriendsUnit) aRunnableS17S0101000_13.l0).LJIIJ(C77267UUd.LJLIL);
            } else if (i == 1) {
                ((RemoveMLBBFriendsUnit) aRunnableS17S0101000_13.l0).LJIIJ(C77268UUe.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            int i = aRunnableS17S0101000_13.i1;
            if (i == 0) {
                ((RemoveContactsUnit) aRunnableS17S0101000_13.l0).LJIIJ(C77269UUf.LJLIL);
            } else if (i == 1) {
                ((RemoveContactsUnit) aRunnableS17S0101000_13.l0).LJIIJ(C77270UUg.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            int i = aRunnableS17S0101000_13.i1;
            if (i == 0) {
                ((RemoveFBFriendsUnit) aRunnableS17S0101000_13.l0).LJIIJ(C77271UUh.LJLIL);
            } else if (i == 1) {
                ((RemoveFBFriendsUnit) aRunnableS17S0101000_13.l0).LJIIJ(C77272UUi.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            MultiCoHostInviteListFragment multiCoHostInviteListFragment = (MultiCoHostInviteListFragment) aRunnableS17S0101000_13.l0;
            if (multiCoHostInviteListFragment.mStatusViewValid) {
                multiCoHostInviteListFragment.Ol().LJLIL(aRunnableS17S0101000_13.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            MultiHostInviteListUpgradeFragment multiHostInviteListUpgradeFragment = (MultiHostInviteListUpgradeFragment) aRunnableS17S0101000_13.l0;
            if (multiHostInviteListUpgradeFragment.mStatusViewValid) {
                multiHostInviteListUpgradeFragment.Ol().LJLIL(aRunnableS17S0101000_13.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            RunnableC31065CHd runnableC31065CHd = ((RankListFragment) aRunnableS17S0101000_13.l0).LJLLLLLL;
            if (runnableC31065CHd != null) {
                boolean z = true;
                if (!runnableC31065CHd.LJJJLL()) {
                    if (aRunnableS17S0101000_13.i1 <= 10) {
                        z = false;
                    }
                    runnableC31065CHd.setHasFixedSize(z);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS17S0101000_13 aRunnableS17S0101000_13) {
        boolean LIZ;
        try {
            aRunnableS17S0101000_13.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS17S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
