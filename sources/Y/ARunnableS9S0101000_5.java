package Y;

import X.AbstractC32698CsQ;
import X.ActivityC45651qj;
import X.B35;
import X.B4Q;
import X.BV7;
import X.BZI;
import X.C0A2;
import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C16880lQ;
import X.C16970lZ;
import X.C17220ly;
import X.C224748ru;
import X.C23010vJ;
import X.C28157B3h;
import X.C28787BRn;
import X.C29230Bda;
import X.C29306Beo;
import X.C29800Bmm;
import X.C29S;
import X.C30350Bve;
import X.C30351Bvf;
import X.C30896CAq;
import X.C31106CIs;
import X.C31206CMo;
import X.C31255COl;
import X.C31319CQx;
import X.C31371CSx;
import X.C31426CVa;
import X.C31563Ca7;
import X.C31707CcR;
import X.C32128CjE;
import X.C32129CjF;
import X.C32553Cq5;
import X.C32676Cs4;
import X.C32694CsM;
import X.C32710Csc;
import X.C32711Csd;
import X.C32712Cse;
import X.C32722Cso;
import X.C32730Csw;
import X.C32792Ctw;
import X.C32830CuY;
import X.C37449Emr;
import X.C37501Enh;
import X.C37607EpP;
import X.C38836FMa;
import X.C38995FSd;
import X.C39106FWk;
import X.C46748IWi;
import X.C47121t6;
import X.C47687Inb;
import X.C61407O8d;
import X.C66716QGi;
import X.C67003QRj;
import X.C6BL;
import X.C73411SrX;
import X.C73943T0h;
import X.C77413UZt;
import X.C78555UsJ;
import X.C88117Yi9;
import X.CE8;
import X.CK6;
import X.CN1;
import X.CQJ;
import X.CRD;
import X.CSD;
import X.CT0;
import X.CUE;
import X.EnumC31701CcL;
import X.EnumC31730Cco;
import X.EnumC59048NFk;
import X.F9J;
import X.IDP;
import X.IF3;
import X.IS8;
import X.InterfaceC31337CRp;
import X.InterfaceC37591Ep9;
import X.InterfaceC55317LnN;
import X.NDZ;
import X.NPQ;
import X.QRA;
import X.R62;
import X.RunnableC31065CHd;
import X.RunnableC64591PWp;
import X.TextureViewSurfaceTextureListenerC47688Inc;
import X.W55;
import X.WM7;
import X.X1D;
import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotController;
import com.bytedance.android.livesdk.LandscapeInteractionMarginData;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.livesetting.comment.LiveEmoteLoadTimingOptSetting;
import com.bytedance.android.livesdk.livesetting.level.GiftPanelAnimatorConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfNoiseEvaluateFilterImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AqS16S0102000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS9S0101000_5 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        C32128CjE c32128CjE = C32129CjF.LIZ;
        String str = c32128CjE.LJ;
        C32676Cs4 c32676Cs4 = (C32676Cs4) this.l0;
        int i2 = c32676Cs4.LLILL;
        int i3 = c32676Cs4.LLILLIZIL;
        C32694CsM c32694CsM = C32694CsM.LIZ;
        C32710Csc.LJIIIZ(new C32722Cso(str, i2, i3, C32694CsM.LIZLLL, this.i1, false, Math.min(C32694CsM.LJJII + C32694CsM.LJJIFFI, C32694CsM.LJJI), Math.min(C32694CsM.LJJII, C32694CsM.LJJI)), new C32730Csw(c32694CsM), new C32712Cse(c32694CsM, ((C32676Cs4) this.l0).LLJJIJI - c32128CjE.LJIIJ), new C32711Csd(c32694CsM));
        String str2 = c32128CjE.LJ;
        boolean LJIILLIIL = C15380j0.LJIILLIIL();
        C32676Cs4 c32676Cs42 = (C32676Cs4) this.l0;
        String str3 = c32676Cs42.LJLLL;
        String str4 = c32676Cs42.LJLLJ;
        List<Long> list = c32676Cs42.LLI;
        Map<Long, C32830CuY> map = c32676Cs42.LLIFFJFJJ;
        GiftPanelLeafViewModel LJJIJIL = c32676Cs42.LJJIJIL();
        if (LJJIJIL != null && (mutableLiveData = LJJIJIL.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            i = value.size();
        } else {
            i = 0;
        }
        C32792Ctw.LIZJ(str2, LJIILLIIL, str3, str4, list, map, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        String fileName;
        int i;
        List<GiftPanelAnimatorConfig> list = UserLevelSettings.INSTANCE.getUserLevelConfig().giftPanelAnimatorConfig;
        String channel = "";
        int i2 = 0;
        if (list == null) {
            fileName = "";
        } else {
            fileName = "";
            int i3 = 0;
            for (GiftPanelAnimatorConfig giftPanelAnimatorConfig : list) {
                if (giftPanelAnimatorConfig != null) {
                    int i4 = this.i1;
                    int i5 = giftPanelAnimatorConfig.grade;
                    if (i4 <= i5 && (i3 > i5 || i3 == 0)) {
                        channel = giftPanelAnimatorConfig.channel;
                        fileName = giftPanelAnimatorConfig.lightName;
                        i3 = i5;
                    }
                }
            }
        }
        C31563Ca7 c31563Ca7 = (C31563Ca7) this.l0;
        c31563Ca7.LJZ.setVisibility(0);
        C15540jG c15540jG = new C15540jG();
        c15540jG.LJIILIIL = true;
        c15540jG.LIZLLL(c31563Ca7.LJZ);
        o.LJIIIZ(channel, "channel");
        c15540jG.LIZIZ = channel;
        o.LJIIIZ(fileName, "fileName");
        c15540jG.LIZJ = fileName;
        c15540jG.LJFF = true;
        c15540jG.LJ = new CE8(c31563Ca7);
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        if (iHostResource != null) {
            i2 = iHostResource.Br0(channel);
        }
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (gr != null) {
            i = gr.LIZ;
        } else {
            i = -1;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_user_level_gecko_resource_exist");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(i2), "is_exist");
        LIZ.LJIJJ("gift_panel_level_upgrade", WM7.SCENE_SERVICE);
        LIZ.LJIJJ(Integer.valueOf(i), "grade");
        LIZ.LJJIIJZLJL();
        C15490jB.LJI(c15540jG);
    }

    public static final void run$0(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        try {
            RecyclerView recyclerView = ((C32553Cq5) aRunnableS9S0101000_5.l0).LJLJLLL;
            if (recyclerView != null) {
                recyclerView.LJLI(aRunnableS9S0101000_5.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        GridLayoutManager gridLayoutManager;
        try {
            if (aRunnableS9S0101000_5.i1 != -1) {
                ((C32676Cs4) aRunnableS9S0101000_5.l0).LJJL();
                RunnableC31065CHd runnableC31065CHd = ((C32676Cs4) aRunnableS9S0101000_5.l0).LJLZ;
                C0A2 c0a2 = null;
                if (runnableC31065CHd != null) {
                    c0a2 = runnableC31065CHd.getLayoutManager();
                }
                if ((c0a2 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) c0a2) != null) {
                    gridLayoutManager.LJFF(aRunnableS9S0101000_5.i1, 0);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                ((AbsAudienceInteractionFragment) aRunnableS9S0101000_5.l0).loadLike();
                return;
            case 1:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS9S0101000_5.l0;
                int[] iArr = new int[4];
                int[] iArr2 = new int[2];
                B35 b35 = livePlayFragment.LLIIIJ;
                if (b35 != null) {
                    b35.getVideoSize(iArr2);
                }
                livePlayFragment.Xl(iArr, iArr2[0], iArr2[1]);
                if (livePlayFragment.LLLIIL != null) {
                    C28157B3h c28157B3h = new C28157B3h();
                    c28157B3h.LIZ = iArr[0];
                    c28157B3h.LIZIZ = iArr[1];
                    c28157B3h.LIZJ = iArr[2];
                    c28157B3h.LIZLLL = iArr[3];
                    livePlayFragment.LLLIIL.rv0(LandscapeInteractionMarginData.class, c28157B3h);
                    return;
                }
                return;
            case 2:
                ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) aRunnableS9S0101000_5.l0;
                if (challengeAwemeList != null) {
                    List<Aweme> list = challengeAwemeList.items;
                    EnumC59048NFk preloadScene = EnumC59048NFk.AGGREGATION_PAGE;
                    o.LJIIIZ(preloadScene, "preloadScene");
                    NDZ.LIZ(list, preloadScene, null);
                    return;
                }
                return;
            case 3:
                ((View) aRunnableS9S0101000_5.l0).setVisibility(4);
                return;
            default:
                BmfNoiseEvaluateFilterImpl.LIZJ((BmfNoiseEvaluateFilterImpl) aRunnableS9S0101000_5.l0);
                return;
        }
    }

    public static final void run$11(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        try {
            RecyclerView recyclerView = ((LiveNewGiftBottomWidget) aRunnableS9S0101000_5.l0).LJLILLLLZI;
            if (recyclerView != null) {
                recyclerView.LJLI(aRunnableS9S0101000_5.i1);
            } else {
                o.LJIJI("newTabList");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        int i;
        int i2;
        RecyclerView.ViewHolder viewHolder;
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                ((CQJ) aRunnableS9S0101000_5.l0).LLILIL();
                return;
            case 1:
                PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aRunnableS9S0101000_5.l0;
                publicScreenWidget.getClass();
                if (!CUE.LIZ) {
                    SmoothLinearLayoutManager smoothLinearLayoutManager = publicScreenWidget.LLIIII.LIZLLL;
                    if (smoothLinearLayoutManager != null) {
                        i = smoothLinearLayoutManager.LLILLJJLI();
                    } else {
                        i = 0;
                    }
                    SmoothLinearLayoutManager smoothLinearLayoutManager2 = publicScreenWidget.LLIIII.LIZLLL;
                    if (smoothLinearLayoutManager2 != null) {
                        i2 = smoothLinearLayoutManager2.LLILL();
                    } else {
                        i2 = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!publicScreenWidget.LJLLI.LLFZ.isEmpty()) {
                        while (i2 <= i) {
                            C31255COl c31255COl = publicScreenWidget.LLIIII.LIZ;
                            if (c31255COl != null) {
                                viewHolder = c31255COl.LJJIZ(i2);
                            } else {
                                viewHolder = null;
                            }
                            if (viewHolder instanceof CSD) {
                                CSD csd = (CSD) viewHolder;
                                InterfaceC31337CRp interfaceC31337CRp = csd.LJLJI;
                                if ((interfaceC31337CRp instanceof InterfaceC31337CRp) && !interfaceC31337CRp.LJJLJLI().LIZ) {
                                    csd.T(false);
                                    if (interfaceC31337CRp.LJJJJZI() != null) {
                                        arrayList.add(interfaceC31337CRp);
                                    }
                                }
                            }
                            i2++;
                        }
                        C31319CQx c31319CQx = publicScreenWidget.LJLLI;
                        c31319CQx.LLILLJJLI.removeAll(arrayList);
                        Iterator<InterfaceC31337CRp> it = c31319CQx.LLILLJJLI.iterator();
                        while (it.hasNext()) {
                            c31319CQx.LJJ(it.next(), false);
                        }
                    }
                    publicScreenWidget.LLIIZ();
                    return;
                }
                return;
            case 2:
                Dialog dialog = (Dialog) aRunnableS9S0101000_5.l0;
                dialog.getClass();
                try {
                    dialog.dismiss();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                WebView webView = ((C37501Enh) aRunnableS9S0101000_5.l0).LIZIZ.get();
                if (webView != null) {
                    webView.removeJavascriptInterface("pia_props");
                    return;
                }
                return;
            case 4:
                ((C66716QGi) aRunnableS9S0101000_5.l0).LIZJ(false);
                return;
            default:
                F9J.LIZIZ((Context) aRunnableS9S0101000_5.l0, 0, FollowFeedViewStubExperiment.REPO_NAME);
                return;
        }
    }

    public static final void run$13(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                C31319CQx c31319CQx = (C31319CQx) aRunnableS9S0101000_5.l0;
                Iterator it = ((ArrayDeque) c31319CQx.LJLZ).iterator();
                while (it.hasNext()) {
                    c31319CQx.LJLIL.LJIILIIL((CRD) it.next());
                }
                Iterator it2 = ((PriorityQueue) c31319CQx.LJLLLLLL).iterator();
                while (it2.hasNext()) {
                    c31319CQx.LJLIL.LJIILIIL((CRD) it2.next());
                }
                Iterator it3 = ((ArrayDeque) c31319CQx.LJZ).iterator();
                while (it3.hasNext()) {
                    c31319CQx.LJLIL.LJIILIIL((CRD) it3.next());
                }
                return;
            case 1:
                FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aRunnableS9S0101000_5.l0;
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(frameL3SlotWidget.getContext());
                frameL3SlotWidget.LJLL = LIZIZ;
                if (LIZIZ == null) {
                    C31707CcR.LIZ(frameL3SlotWidget.getContext(), "FrameL3SlotWidget");
                    return;
                }
                FrameSlotController frameSlotController = new FrameSlotController(LIZIZ, frameL3SlotWidget, EnumC31701CcL.LAST);
                frameL3SlotWidget.LJLIL = frameSlotController;
                frameSlotController.init(frameL3SlotWidget);
                frameL3SlotWidget.LJLIL.load(frameL3SlotWidget.LJLL, EnumC31730Cco.SLOT_LIVE_WATCHER_L3_POP);
                frameL3SlotWidget.dataChannel.ov0(frameL3SlotWidget, QuestionCardVisibilityEvent.class, new AObjectS42S0101000_5(0, frameL3SlotWidget, 1));
                frameL3SlotWidget.dataChannel.ov0(frameL3SlotWidget, PartnershipPromoteGameCardShowChannel.class, new AObjectS42S0101000_5(0, frameL3SlotWidget, 2));
                frameL3SlotWidget.LJLJJL = (C73411SrX) C73943T0h.LIZ().LJ(B4Q.class).LJJJJZI(new AfS36S0101000_5(0, frameL3SlotWidget, 3));
                frameL3SlotWidget.LJLJJLL = (C73411SrX) C73943T0h.LIZ().LJ(BV7.class).LJJJJZI(new AfS36S0101000_5(0, frameL3SlotWidget, 4));
                frameL3SlotWidget.getLifecycle().addObserver(frameL3SlotWidget.LJLIL);
                return;
            case 2:
                NPQ.LIZIZ.LJ((String) aRunnableS9S0101000_5.l0);
                return;
            case 3:
                C37449Emr c37449Emr = (C37449Emr) aRunnableS9S0101000_5.l0;
                if (c37449Emr.LIZLLL) {
                    return;
                }
                c37449Emr.LIZLLL = true;
                C37607EpP<m> c37607EpP = c37449Emr.LJ;
                c37607EpP.LIZLLL = true;
                c37607EpP.LIZIZ();
                c37607EpP.LIZ.set(null);
                InterfaceC37591Ep9 interfaceC37591Ep9 = c37449Emr.LJFF;
                if (interfaceC37591Ep9 == null) {
                    return;
                }
                interfaceC37591Ep9.close();
                return;
            case 4:
                R62 r62 = (R62) aRunnableS9S0101000_5.l0;
                r62.getClass();
                try {
                    C38836FMa.LIZLLL(r62.LIZ, r62.LIZIZ);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                IDP idp = (IDP) aRunnableS9S0101000_5.l0;
                if (idp.LLL) {
                    return;
                }
                idp.LLL = true;
                if (((Boolean) IF3.LIZIZ.getValue()).booleanValue()) {
                    C38995FSd.LIZIZ().execute(new ARunnableS12S0000000_5(0));
                    return;
                } else {
                    C61407O8d.LIZ();
                    return;
                }
            default:
                QRA.LIZ((Context) aRunnableS9S0101000_5.l0);
                return;
        }
    }

    public static final void run$14(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        try {
            ((C47121t6) aRunnableS9S0101000_5.l0).invalidate();
            if (((C47121t6) aRunnableS9S0101000_5.l0).getLineCount() > 1) {
                C23010vJ.LIZLLL((C47121t6) aRunnableS9S0101000_5.l0, 5, 700);
                ((C47121t6) aRunnableS9S0101000_5.l0).setTextColor(aRunnableS9S0101000_5.i1);
                ((C47121t6) aRunnableS9S0101000_5.l0).setMaxLines(1);
                ((C47121t6) aRunnableS9S0101000_5.l0).setEllipsize(TextUtils.TruncateAt.END);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aRunnableS9S0101000_5.l0;
        int i = aRunnableS9S0101000_5.i1;
        C31371CSx c31371CSx = publicScreenWidget.LLIIII;
        if (c31371CSx == null || i >= c31371CSx.LIZLLL()) {
            return;
        }
        C31371CSx c31371CSx2 = publicScreenWidget.LLIIII;
        c31371CSx2.getClass();
        c31371CSx2.LIZIZ(new AqS16S0102000_5(c31371CSx2, i, 0, 3));
        publicScreenWidget.LJLLLL = false;
        publicScreenWidget.LLILL(CT0.FOCUS, false);
        C31371CSx c31371CSx3 = publicScreenWidget.LLIIII;
        ARunnableS11S0101000_7 aRunnableS11S0101000_7 = new ARunnableS11S0101000_7(0, publicScreenWidget, 15);
        C31255COl c31255COl = c31371CSx3.LIZ;
        if (c31255COl == null) {
            return;
        }
        c31255COl.post(aRunnableS11S0101000_7);
    }

    public static final void run$16(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aRunnableS9S0101000_5.l0;
        liveNewGiftPanelWidget.LJLIL.LJLI(aRunnableS9S0101000_5.i1);
    }

    public static final void run$17(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aRunnableS9S0101000_5.l0;
        liveNewGiftPanelWidget.LJLIL.LJLI(aRunnableS9S0101000_5.i1);
    }

    public static final void run$18(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aRunnableS9S0101000_5.l0;
        C32694CsM c32694CsM = C32694CsM.LIZ;
        int i = aRunnableS9S0101000_5.i1;
        liveNewGiftPanelWidget.getClass();
        C32128CjE c32128CjE = C32129CjF.LIZ;
        C32710Csc.LJIIIZ(new C32722Cso(c32128CjE.LJ, liveNewGiftPanelWidget.LLIIIJ, liveNewGiftPanelWidget.LLIIIL, C32694CsM.LIZLLL, i, true, Math.min(i, Math.max(C32694CsM.LJJIII, C32694CsM.LJJII)), Math.min(i, C32694CsM.LJJII)), new C32730Csw(c32694CsM), new C32712Cse(c32694CsM, liveNewGiftPanelWidget.LLI - c32128CjE.LJIIJ), new C32711Csd(c32694CsM));
    }

    public static final void run$19(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aRunnableS9S0101000_5.l0;
        liveNewGiftPanelWidget.LJLIL.LJLI(aRunnableS9S0101000_5.i1);
    }

    public static final void run$2(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        try {
            aRunnableS9S0101000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        HybridDialogFragment hybridDialogFragment = (HybridDialogFragment) aRunnableS9S0101000_5.l0;
        int i = aRunnableS9S0101000_5.i1;
        View re = hybridDialogFragment.LLIIJI.re();
        if (re != null) {
            C78555UsJ.LJJIJLIJ(C15380j0.LIZ(i), re);
        }
        View view = hybridDialogFragment.LJLLLLLL;
        if (view != null) {
            C78555UsJ.LJJIJLIJ(C15380j0.LIZ(i), view);
        }
    }

    public static final void run$21(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                ((C29230Bda) aRunnableS9S0101000_5.l0).LJ();
                return;
            case 1:
                ((C31206CMo) aRunnableS9S0101000_5.l0).LIZIZ(2);
                return;
            case 2:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aRunnableS9S0101000_5.l0;
                C224748ru c224748ru = keyboardDialogFragment.LJLJL;
                if (c224748ru != null) {
                    keyboardDialogFragment.LLJI = true;
                    int selectionStart = c224748ru.getSelectionStart();
                    Editable text = keyboardDialogFragment.LJLJL.getText();
                    if (text != null) {
                        text.insert(selectionStart, "@");
                        return;
                    }
                    return;
                }
                return;
            case 3:
                InterfaceC55317LnN interfaceC55317LnN = ((DetailFragmentPanel) aRunnableS9S0101000_5.l0).LLII;
                if (interfaceC55317LnN != null) {
                    interfaceC55317LnN.b7();
                    return;
                }
                return;
            case 4:
                ((C6BL) aRunnableS9S0101000_5.l0).LJFF();
                return;
            default:
                ((C31426CVa) aRunnableS9S0101000_5.l0).LIZ.LJFF(1);
                return;
        }
    }

    public static final void run$22(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        try {
            aRunnableS9S0101000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r2.intValue() != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$3(Y.ARunnableS9S0101000_5 r5) {
        /*
            java.lang.Object r0 = r5.l0     // Catch: java.lang.Throwable -> L3c
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r0 == 0) goto L1c
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings r0 = r0.multiLiveUserSettings     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L1c
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings r0 = r0.multiLiveUserApplySettings     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L1c
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission r0 = r0.multiLiveUserApplyPermission     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L1c
            int r0 = r0.multiLiveApplyPermission     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = 1
            if (r2 != 0) goto L1e
        L1c:
            r3 = 0
            goto L32
        L1e:
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            if (r0 == r3) goto L32
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            r0 = 2
            if (r1 == r0) goto L32
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            r0 = 3
            if (r1 != r0) goto L1c
        L32:
            java.lang.String r2 = "audience_get_anchor_pannel_setting"
            int r1 = r5.i1     // Catch: java.lang.Throwable -> L3c
            r0 = 120(0x78, float:1.68E-43)
            X.C74824TYe.LJJLIIIJLLLLLLLZ(r2, r3, r1, r4, r0)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r1 = move-exception
            boolean r0 = X.C39223FaN.LIZ(r1)
            if (r0 == 0) goto L44
        L43:
            return
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S0101000_5.run$3(Y.ARunnableS9S0101000_5):void");
    }

    public static final void run$4(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        boolean z;
        try {
            int i = aRunnableS9S0101000_5.i1;
            if (i >= 0) {
                C30351Bvf c30351Bvf = (C30351Bvf) aRunnableS9S0101000_5.l0;
                if (!c30351Bvf.LJLLJ) {
                    DataChannel dataChannel = c30351Bvf.LJLJI;
                    if (dataChannel != null) {
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dataChannel.qv0(FaceDetectEvent.class, Boolean.valueOf(z));
                    }
                }
            }
            DataChannel dataChannel2 = ((C30351Bvf) aRunnableS9S0101000_5.l0).LJLJI;
            if (dataChannel2 != null) {
                dataChannel2.qv0(FaceDetectEvent.class, Boolean.FALSE);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        boolean LIZ;
        boolean z;
        try {
            int i = aRunnableS9S0101000_5.i1;
            if (i >= 0) {
                C30350Bve c30350Bve = (C30350Bve) aRunnableS9S0101000_5.l0;
                if (!c30350Bve.LJLLJ) {
                    DataChannel dataChannel = c30350Bve.LJLJI;
                    if (dataChannel != null) {
                        if (i == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dataChannel.qv0(FaceDetectEvent.class, Boolean.valueOf(z));
                    }
                }
            }
            DataChannel dataChannel2 = ((C30350Bve) aRunnableS9S0101000_5.l0).LJLJI;
            if (dataChannel2 != null) {
                dataChannel2.qv0(FaceDetectEvent.class, Boolean.FALSE);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aRunnableS9S0101000_5.l0;
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(frameL2SlotWidget.getContext());
                frameL2SlotWidget.LJLJLJ = LIZIZ;
                if (LIZIZ == null) {
                    C31707CcR.LIZ(frameL2SlotWidget.getContext(), "FrameL2SlotWidget");
                    return;
                }
                FrameSlotController frameSlotController = new FrameSlotController(LIZIZ, frameL2SlotWidget, EnumC31701CcL.LAST);
                frameL2SlotWidget.LJLIL = frameSlotController;
                frameSlotController.init(frameL2SlotWidget);
                if (C29306Beo.LJIIL(frameL2SlotWidget.dataChannel)) {
                    frameL2SlotWidget.LJLIL.load(frameL2SlotWidget.LJLJLJ, EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE);
                } else {
                    frameL2SlotWidget.LJLIL.load(frameL2SlotWidget.LJLJLJ, EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR);
                }
                DataChannel dataChannel = frameL2SlotWidget.dataChannel;
                dataChannel.ov0(frameL2SlotWidget, QuestionCardVisibilityEvent.class, new AObjectS42S0101000_5(1, frameL2SlotWidget, 22));
                dataChannel.lv0(frameL2SlotWidget, SubOnlyLiveAudienceStatusChannel.class, new AObjectS42S0101000_5(1, frameL2SlotWidget, 23));
                dataChannel.ov0(frameL2SlotWidget, CustomizedPerksCardVisibilityChannel.class, new AObjectS44S0101000_8(0, frameL2SlotWidget, 0));
                dataChannel.ov0(frameL2SlotWidget, SubGoalCardVisibilityChannel.class, new AObjectS42S0101000_5(0, frameL2SlotWidget, 8));
                DataChannelGlobal.LJLJJI.qv0(frameL2SlotWidget, frameL2SlotWidget, LiveGiftShowPinCardEvent.class, new AObjectS42S0101000_5(0, frameL2SlotWidget, 9));
                frameL2SlotWidget.dataChannel.ov0(frameL2SlotWidget, PartnershipPromoteGameCardShowChannel.class, new AObjectS42S0101000_5(0, frameL2SlotWidget, 10));
                frameL2SlotWidget.LJLJJL = (C73411SrX) C73943T0h.LIZ().LJ(B4Q.class).LJJJJZI(new AfS36S0101000_5(1, frameL2SlotWidget, 39));
                frameL2SlotWidget.getLifecycle().addObserver(frameL2SlotWidget.LJLIL);
                return;
            case 1:
                ((AbsAudienceInteractionFragment) aRunnableS9S0101000_5.l0).loadGift();
                return;
            case 2:
                ((C39106FWk) aRunnableS9S0101000_5.l0).LIZIZ();
                return;
            case 3:
                DetailFragmentPanel.LJJJJIZL((DetailFragmentPanel) aRunnableS9S0101000_5.l0);
                return;
            case 4:
                IEffectService.OnVideoCoverCallback onVideoCoverCallback = (IEffectService.OnVideoCoverCallback) aRunnableS9S0101000_5.l0;
                if (onVideoCoverCallback != null) {
                    onVideoCoverCallback.onGetVideoCoverFailed(-1);
                    return;
                }
                return;
            default:
                ((LiveStream) aRunnableS9S0101000_5.l0).doTriggerEncoderParams();
                return;
        }
    }

    public static final void run$7(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                ARunnableS8S0201000_5 aRunnableS8S0201000_5 = ((LiveRoomFragment) aRunnableS9S0101000_5.l0).LLIFFJFJJ;
                if (aRunnableS8S0201000_5 == null) {
                    return;
                }
                aRunnableS8S0201000_5.run();
                return;
            case 1:
                Fragment fragment = (Fragment) aRunnableS9S0101000_5.l0;
                if (fragment.getContext() == null) {
                    throw new NullPointerException("getResources");
                }
                if (LiveEmoteLoadTimingOptSetting.INSTANCE.getValue() == 0) {
                    C31106CIs.LIZ.LIZIZ(0, fragment.getResources());
                    return;
                }
                return;
            case 2:
                Context context = (Context) aRunnableS9S0101000_5.l0;
                if (((Boolean) C88117Yi9.LJI.getValue()).booleanValue()) {
                    QRA.LIZ(context);
                } else {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS9S0101000_5(6, context, 13));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("method_push_start_bdpush_start");
                int i = QRA.LIZIZ;
                QRA.LIZIZ = i + 1;
                LIZ.append(i);
                C77413UZt.LJI(X1D.LIZIZ(LIZ));
                C67003QRj.LJFF().LJII(context);
                C77413UZt.LJIIJ("method_push_start_bdpush_start");
                return;
            default:
                C47687Inb c47687Inb = ((TextureViewSurfaceTextureListenerC47688Inc) aRunnableS9S0101000_5.l0).LJLIL;
                if (c47687Inb.LJLIL != null) {
                    SurfaceTexture surfaceTexture = c47687Inb.getSurfaceTexture();
                    SurfaceTexture surfaceTexture2 = c47687Inb.LJLIL;
                    if (surfaceTexture != surfaceTexture2) {
                        c47687Inb.setSurfaceTexture(surfaceTexture2);
                        c47687Inb.LJLJJI = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public static final void run$8(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        int i = 0;
        switch (aRunnableS9S0101000_5.i1) {
            case 0:
                VideoWidget.lambda$semisugar$initEffectStage2$0((VideoWidget) aRunnableS9S0101000_5.l0);
                return;
            case 1:
                LiveRoomNotifyWidget liveRoomNotifyWidget = ((CK6) aRunnableS9S0101000_5.l0).LIZIZ;
                liveRoomNotifyWidget.LJZL((RoomNotifyMessage) C17220ly.LIZ(liveRoomNotifyWidget.LJLIL, String.valueOf(R.id.af5)));
                return;
            case 2:
                ((W55) aRunnableS9S0101000_5.l0).LJLIL.LJFF();
                return;
            case 3:
                Fragment fragment = (Fragment) aRunnableS9S0101000_5.l0;
                do {
                    C16970lZ.LJ(R.layout.avs, fragment.mo49getActivity());
                    i++;
                } while (i < 3);
                fragment.getClass();
                return;
            case 4:
                IS8 this$0 = (IS8) aRunnableS9S0101000_5.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.LIZIZ();
                return;
            case 5:
                C46748IWi.LJJIIJZLJL((C46748IWi) aRunnableS9S0101000_5.l0);
                return;
            case 6:
                C29S this$02 = (C29S) aRunnableS9S0101000_5.l0;
                o.LJIIIZ(this$02, "this$0");
                TextView textView = (TextView) this$02.findViewById(R.id.h0u);
                if (textView == null) {
                    return;
                }
                textView.setEnabled(false);
                return;
            default:
                RunnableC64591PWp runnableC64591PWp = (RunnableC64591PWp) aRunnableS9S0101000_5.l0;
                runnableC64591PWp.LJLILLLLZI.execute(runnableC64591PWp);
                return;
        }
    }

    public static final void run$9(ARunnableS9S0101000_5 aRunnableS9S0101000_5) {
        ((LiveEmojiInputDialogFragment) aRunnableS9S0101000_5.l0).Tl(-aRunnableS9S0101000_5.i1);
    }

    public ARunnableS9S0101000_5(LiveNewGiftPanelWidget liveNewGiftPanelWidget, int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 19:
                this.l0 = liveNewGiftPanelWidget;
                this.i1 = i;
                return;
            case 18:
            default:
                this.l0 = liveNewGiftPanelWidget;
                this.i1 = i;
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS9S0101000_5(int r2, X.C32676Cs4 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS9S0101000_5.<init>(int, X.Cs4, int):void");
    }

    public ARunnableS9S0101000_5(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
