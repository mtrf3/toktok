package com.bytedance.android.livesdk.widgets.giftwidget;

import X.B83;
import X.BCW;
import X.BEA;
import X.BRU;
import X.BZI;
import X.C0K2;
import X.C0NB;
import X.C0TS;
import X.C15380j0;
import X.C20990s3;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29927Bop;
import X.C29948BpA;
import X.C30076BrE;
import X.C30725C4b;
import X.C30868C9o;
import X.C31263COt;
import X.C31583CaR;
import X.C31592Caa;
import X.C31593Cab;
import X.C31989Cgz;
import X.C32001ChB;
import X.C32004ChE;
import X.C32005ChF;
import X.C32088Cia;
import X.C32089Cib;
import X.C32090Cic;
import X.C32091Cid;
import X.C32092Cie;
import X.C32094Cig;
import X.C32097Cij;
import X.C32100Cim;
import X.C32101Cin;
import X.C32102Cio;
import X.C32104Ciq;
import X.C32105Cir;
import X.C32108Ciu;
import X.C32111Cix;
import X.C32115Cj1;
import X.C32120Cj6;
import X.C32125CjB;
import X.C32128CjE;
import X.C32129CjF;
import X.C32136CjM;
import X.C32146CjW;
import X.C32172Cjw;
import X.C32260ClM;
import X.C32275Clb;
import X.C32348Cmm;
import X.C32351Cmp;
import X.C32366Cn4;
import X.C32394CnW;
import X.C32463Cod;
import X.C32502CpG;
import X.C32569CqL;
import X.C32650Cre;
import X.C32710Csc;
import X.C32785Ctp;
import X.C32787Ctr;
import X.C32803Cu7;
import X.C32833Cub;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73943T0h;
import X.C78072UkW;
import X.C78983UzD;
import X.C79359VCp;
import X.CLB;
import X.CN1;
import X.CZI;
import X.EnumC29607Bjf;
import X.EnumC31997Ch7;
import X.EnumC32093Cif;
import X.EnumC32096Cii;
import X.EnumC32466Cog;
import X.EnumC32766CtW;
import X.EnumC35487DwJ;
import X.F9J;
import X.InterfaceC05190Ih;
import X.InterfaceC30132Bs8;
import X.InterfaceC31587CaV;
import X.InterfaceC31765CdN;
import X.InterfaceC32103Cip;
import X.InterfaceC32109Civ;
import X.InterfaceC32478Cos;
import X.InterfaceC65784Pro;
import X.UVX;
import X.V10;
import X.X1D;
import X.XWV;
import Y.ARunnableS41S0100000_5;
import Y.AfS1S0200100_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.ai.impl.pitaya.services.GiftPanelOpenPredictService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingApi;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveLandScapeGiftDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.GiftLeafRootWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.hotword.HotWordGiftWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftRenderSparkOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeQuickGift;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelCacheOptSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalDetailWebLinkSetting;
import com.bytedance.android.livesdk.livesetting.gift.NewsAccountGiftSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.dataChannel.AnchorTicketCountChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class GiftWidget extends LiveRecyclableWidget implements InterfaceC31587CaV, InterfaceC30132Bs8, InterfaceC31765CdN {
    public LiveLandScapeGiftDialog LJLIL;
    public AbsNormalGiftAnimWidget LJLILLLLZI;
    public LiveNewVideoGiftWidget LJLJI;
    public GiftLeafRootWidget LJLJJI;
    public HotWordGiftWidget LJLJJL;
    public C30076BrE LJLJJLL;
    public IMessageManager LJLJL;
    public C32001ChB LJLJLLL;
    public C32787Ctr LJLL;
    public CLB LJLLI;
    public C32005ChF LJLLILLLL;
    public C32100Cim LJLLJ;
    public C32102Cio LJLLL;
    public C32088Cia LJLLLL;
    public C0TS LJLLLLLL;
    public CZI LJLZ;
    public C29948BpA LJZ;
    public C32115Cj1 LJZI;
    public BRU LJZL;
    public XWV LL;
    public Room LLD;
    public boolean LLF;
    public C32172Cjw LLFF;
    public ValueAnimator LLFFF;
    public C32275Clb LLFII;
    public C31583CaR LLIIIJ;
    public int LLIIIL;
    public final WidgetCreateTimeUtil LJLJLJ = new WidgetCreateTimeUtil();
    public final C73318Sq2 LLFZ = new C73318Sq2();
    public final C32089Cib LLI = new C32089Cib();
    public final UVX LLIFFJFJJ = new UVX(new C32111Cix(this));
    public List<GiftPage> LLII = new ArrayList();
    public final C32092Cie LLIIII = new InterfaceC32478Cos() { // from class: X.Cie
        @Override // X.InterfaceC32478Cos
        public final void LIZ(GiftListResult giftListResult, int i) {
            GiftWidget giftWidget = GiftWidget.this;
            giftWidget.getClass();
            if ((i == 2 || i == 3) && giftListResult.giftPages != null) {
                giftWidget.LLII = new ArrayList(giftListResult.giftPages);
                String str = giftListResult.responseHash;
                GiftLeafRootWidget giftLeafRootWidget = giftWidget.LJLJJI;
                if (giftLeafRootWidget != null) {
                    if (str == null) {
                        str = "";
                    }
                    List<GiftPage> giftPages = giftListResult.giftPages;
                    o.LJIIIZ(giftPages, "giftPages");
                    C32094Cig c32094Cig = giftLeafRootWidget.LJLIL;
                    c32094Cig.getClass();
                    c32094Cig.LJLIL = giftPages;
                    C32094Cig c32094Cig2 = giftLeafRootWidget.LJLIL;
                    c32094Cig2.getClass();
                    c32094Cig2.LJLILLLLZI = str;
                }
            }
        }
    };
    public final C31263COt LLIIIILZ = new InterfaceC32478Cos() { // from class: X.COt
        @Override // X.InterfaceC32478Cos
        public final void LIZ(GiftListResult giftListResult, int i) {
            BroadcastSettingResponse second;
            GiftWidget giftWidget = GiftWidget.this;
            giftWidget.getClass();
            if (i == 2) {
                C0NB.LIZIZ("HotWordGift", "[gift/list] complete (SOURCE_ENTER_ROOM)");
                HotWordGiftWidget hotWordGiftWidget = giftWidget.LJLJJL;
                if (hotWordGiftWidget != null) {
                    hotWordGiftWidget.LJZ();
                }
                ((GiftRetrofitApi) Q7L.LIZIZ(GiftRetrofitApi.class)).getGiftGuideInfo(giftWidget.LLD.getId()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C32288Clo.LJLIL, C32277Cld.LJLIL);
                Context context = giftWidget.getContext();
                DataChannel dataChannel = giftWidget.dataChannel;
                if (!NewsAccountGiftSettings.isFeatureEnable()) {
                    return;
                }
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                OSZ<Long, ? extends BroadcastSettingResponse> osz = C31264COu.LIZJ;
                if (osz != null && currentUserId == osz.getFirst().longValue()) {
                    OSZ<Long, ? extends BroadcastSettingResponse> osz2 = C31264COu.LIZJ;
                    if (osz2 == null || (second = osz2.getSecond()) == null) {
                        return;
                    }
                    if (dataChannel != null) {
                        dataChannel.rv0(BroadcastSettingResponseChannel.class, second);
                    }
                    ((IGiftService) C31264COu.LIZIZ.getValue()).toggleGiftBehavior(context, dataChannel, second.LIZ());
                    return;
                }
                C1EW.LIZ(((BroadcastSettingApi) C31264COu.LIZ.getValue()).fetchUserPermission()).LJJJLIIL(new AfS1S0200100_5(currentUserId, context, dataChannel, 14), C28700BOe.LJLIL);
            }
        }
    };

    @Override // X.InterfaceC30132Bs8
    public final void LJJIIZI() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.doj;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LJZI() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void LJZL() {
        IMessageManager iMessageManager;
        C31583CaR c31583CaR = this.LLIIIJ;
        if (!c31583CaR.LJLIL.LJLILLLLZI) {
            c31583CaR.LJLIL.dispose();
        }
        DataChannel dataChannel = c31583CaR.LJLJJL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(c31583CaR);
        }
        C31592Caa c31592Caa = c31583CaR.LJLJJLL;
        c31592Caa.getClass();
        GiftReceiveMsgThreadSetting.INSTANCE.postToThread(new ARunnableS41S0100000_5(c31592Caa, 220));
        C32803Cu7.LIZ("GiftWidget unLoad");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        try {
            LJZL();
            GiftManager.inst().unRegisterGiftListListener(this.LLIIII);
            GiftManager.inst().unRegisterGiftListListener(this.LLIIIILZ);
            this.LLI.LIZIZ();
            this.LLFZ.LIZLLL();
            C32787Ctr c32787Ctr = this.LJLL;
            if (c32787Ctr != null && (dataChannel2 = c32787Ctr.LIZJ) != null) {
                dataChannel2.jv0(c32787Ctr);
            }
            C29948BpA c29948BpA = this.LJZ;
            if (c29948BpA != null) {
                IMessageManager iMessageManager3 = c29948BpA.LJLJJL;
                if (iMessageManager3 != null) {
                    iMessageManager3.removeMessageListener(c29948BpA);
                }
                c29948BpA.LJLJJLL.dismissAllowingStateLoss();
                c29948BpA.LJLJJI.LIZLLL();
                c29948BpA.LJLL.clear();
                if (LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue()) {
                    C32502CpG.LIZ();
                }
            }
            C32005ChF c32005ChF = this.LJLLILLLL;
            if (c32005ChF != null) {
                c32005ChF.LJIIIIZZ = null;
                c32005ChF.LJII.LIZLLL();
            }
            CLB clb = this.LJLLI;
            if (clb != null && (dataChannel = clb.LIZIZ) != null) {
                dataChannel.jv0(clb);
            }
            C32102Cio c32102Cio = this.LJLLL;
            if (c32102Cio != null && (iMessageManager2 = c32102Cio.LJLIL) != null) {
                iMessageManager2.removeMessageListener(c32102Cio);
            }
            C32088Cia c32088Cia = this.LJLLLL;
            if (c32088Cia != null) {
                c32088Cia.onDestroy();
            }
            CZI czi = this.LJLZ;
            if (czi != null && (iMessageManager = czi.LJLJI) != null) {
                iMessageManager.removeMessageListener(czi);
            }
            C32115Cj1 c32115Cj1 = this.LJZI;
            if (c32115Cj1 != null) {
                IMessageManager iMessageManager4 = c32115Cj1.LJLIL;
                if (iMessageManager4 != null) {
                    iMessageManager4.removeMessageListener(c32115Cj1);
                }
                C73411SrX c73411SrX = c32115Cj1.LJLJJL;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
            }
            BRU bru = this.LJZL;
            if (bru != null) {
                IMessageManager iMessageManager5 = bru.LJLILLLLZI;
                if (iMessageManager5 != null) {
                    iMessageManager5.removeMessageListener(bru);
                }
                BEA.LIZ.getClass();
                BEA.LJJIJIIJI = null;
            }
            C32172Cjw c32172Cjw = this.LLFF;
            if (c32172Cjw != null) {
                c32172Cjw.LJ.LIZLLL();
            }
            ValueAnimator valueAnimator = this.LLFFF;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C32833Cub.LIZ();
            C73943T0h.LIZ().LIZIZ(new C32120Cj6());
            LiveLandScapeGiftDialog liveLandScapeGiftDialog = this.LJLIL;
            if (liveLandScapeGiftDialog != null) {
                liveLandScapeGiftDialog.dismiss();
            }
            if (!LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                this.LJLJLJ.send();
            }
            C32275Clb c32275Clb = this.LLFII;
            if (c32275Clb != null) {
                DataChannel dataChannel3 = this.dataChannel;
                if (LiveGiftPanelCacheOptSettings.INSTANCE.enable() && dataChannel3 != null && !C29306Beo.LJIIJ(dataChannel3)) {
                    ((GiftPanelOpenPredictService) C20990s3.LIZ()).LJ((C32101Cin) c32275Clb.LIZIZ.getValue());
                }
            }
            C32091Cid.LIZ(hashCode(), this.dataChannel);
            this.LLIFFJFJJ.LIZ();
            C32129CjF.LIZ.LJJII = false;
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "gift_widget_unload_exception");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "gift_widget_unload_exception");
                C0K2.LJI("gift_core_monitor", jSONObject, new JSONObject(), new JSONObject());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC30132Bs8
    public final void LJLLLLLL(XWV xwv) {
        this.LL = xwv;
    }

    public final void LJLZ(int i) {
        View view;
        View findViewById;
        if (!isViewValid() || getContext() == null || (view = this.contentView) == null || (findViewById = view.findViewById(R.id.h35)) == null) {
            return;
        }
        if (LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled()) {
            findViewById.setTranslationX(i);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMarginStart(i);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    public final void LJZ(C32004ChE c32004ChE) {
        EnumC35487DwJ enumC35487DwJ;
        int i;
        long j;
        Gift fastGift;
        String str = "icon";
        if (!C32097Cij.LIZ(EnumC32096Cii.GIFT_DIALOG)) {
            String str2 = c32004ChE.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            C32710Csc.LJIIJ(4, str, Boolean.valueOf(this.LLF), 0);
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) this.dataChannel.kv0(C29494Bhq.class);
        User user = null;
        C32785Ctp.LJIILIIL.LIZ = null;
        C73943T0h.LIZ().LIZIZ(new Object() { // from class: X.0jf
        });
        String str3 = "gift_guide_bubble";
        if (this.LLF) {
            User user2 = c32004ChE.LIZ;
            if (user2 == null || this.LLD == null || user2.getId() == this.LLD.getOwnerUserId()) {
                C32128CjE c32128CjE = C32129CjF.LIZ;
                EnumC35487DwJ enumC35487DwJ2 = EnumC35487DwJ.ANCHOR;
                c32128CjE.getClass();
                o.LJIIIZ(enumC35487DwJ2, "<set-?>");
                c32128CjE.LIZLLL = enumC35487DwJ2;
            } else {
                C32128CjE c32128CjE2 = C32129CjF.LIZ;
                EnumC35487DwJ enumC35487DwJ3 = EnumC35487DwJ.GUEST;
                c32128CjE2.getClass();
                o.LJIIIZ(enumC35487DwJ3, "<set-?>");
                c32128CjE2.LIZLLL = enumC35487DwJ3;
            }
            C32128CjE c32128CjE3 = C32129CjF.LIZ;
            c32128CjE3.getClass();
            String str4 = c32004ChE.LIZIZ;
            if (C32650Cre.LIZ && o.LJ("icon", str4)) {
                c32128CjE3.LJ = "gift_guide_bubble";
            } else {
                if (str4 != null) {
                    str = str4;
                }
                c32128CjE3.LJ = str;
            }
            User user3 = c32004ChE.LIZ;
            if (user3 == null) {
                user3 = ((Room) this.dataChannel.kv0(RoomChannel.class)).getOwner();
            }
            c32128CjE3.LIZJ = user3;
            c32128CjE3.LIZIZ = Long.valueOf(c32004ChE.LJIIIIZZ);
            c32128CjE3.LJIILIIL = c32004ChE.LJIIJ;
            c32128CjE3.LIZ = c32004ChE.LJIIJJI;
            c32128CjE3.LJIILJJIL = c32004ChE.LJ;
            c32128CjE3.LJIILL = c32004ChE.LJFF;
            c32128CjE3.LJIJ = c32004ChE.LJI;
            c32128CjE3.LJIJI = c32004ChE.LJII;
            c32128CjE3.LJJIFFI = c32004ChE.LJIILJJIL;
            c32128CjE3.LJIJJ = c32004ChE.LJIIIZ;
            boolean z = c32004ChE.LJIILLIIL;
            c32128CjE3.LJIJJLI = z;
            if (z && LiveFirstRechargeQuickGift.INSTANCE.inExp()) {
                long id = this.LLD.getId();
                if (id != 0 && (fastGift = GiftManager.inst().getFastGift(id)) != null) {
                    c32128CjE3.LIZIZ = Long.valueOf(fastGift.id);
                }
            }
            if (c32004ChE.LJIIL == 0) {
                c32004ChE.LJIIL = SystemClock.uptimeMillis();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                BZI LIZ = C28787BRn.LIZ("gift_click_time_not_init");
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
                C0K2.LJI("gift_click_time_not_init", jSONObject3, jSONObject2, jSONObject);
            }
            c32128CjE3.LJIIJ = c32004ChE.LJIIL;
            c32128CjE3.LJIIZILJ = c32004ChE.LJIILIIL;
            ((GiftLeafRootViewModel) ViewModelProviders.of(this.widgetCallback.getFragment()).get(GiftLeafRootViewModel.class)).LJLILLLLZI.LIZ(new C32348Cmm(c32004ChE.LIZLLL));
            return;
        }
        C32128CjE c32128CjE4 = C32129CjF.LIZ;
        String str5 = c32004ChE.LIZIZ;
        c32128CjE4.getClass();
        if (C32650Cre.LIZ && o.LJ("icon", str5)) {
            c32128CjE4.LJ = "gift_guide_bubble";
        } else {
            if (str5 == null) {
                str5 = "icon";
            }
            c32128CjE4.LJ = str5;
        }
        c32128CjE4.LJIIJ = c32004ChE.LJIIL;
        Room room = this.LLD;
        if (room != null) {
            user = room.getOwner();
        }
        Room room2 = this.LLD;
        User user4 = c32004ChE.LIZ;
        if (user4 != null) {
            user = user4;
        }
        EnumC29607Bjf type = c32004ChE.LIZJ;
        String src = c32004ChE.LIZIZ;
        Runnable runnable = c32004ChE.LIZLLL;
        long j2 = c32004ChE.LJIIIIZZ;
        List<GiftPage> pages = this.LLII;
        long j3 = c32004ChE.LJIILL;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(src, "src");
        o.LJIIIZ(pages, "pages");
        LiveLandScapeGiftDialog liveLandScapeGiftDialog = new LiveLandScapeGiftDialog();
        if (user == null || (room2 != null && user.getId() == room2.getOwnerUserId())) {
            enumC35487DwJ = EnumC35487DwJ.ANCHOR;
        } else {
            enumC35487DwJ = EnumC35487DwJ.GUEST;
        }
        liveLandScapeGiftDialog.LJLJJL = enumC35487DwJ;
        liveLandScapeGiftDialog.LJLILLLLZI = room2;
        if (!C32650Cre.LIZ || !o.LJ("icon", src)) {
            str3 = src;
        }
        liveLandScapeGiftDialog.LJLLJ = str3;
        C79359VCp c79359VCp = new C79359VCp(0);
        liveLandScapeGiftDialog.LJLJLLL = c79359VCp;
        C32104Ciq c32104Ciq = new C32104Ciq();
        liveLandScapeGiftDialog.LJLL = c32104Ciq;
        c32104Ciq.LJLJI = str3;
        c79359VCp.LIZIZ = user;
        C32136CjM c32136CjM = new C32136CjM();
        if (EnumC29607Bjf.DEFAULT != type) {
            c32136CjM.LIZIZ.setValue(Integer.valueOf(type.value));
        } else {
            MutableLiveData<Integer> mutableLiveData = c32136CjM.LIZIZ;
            GiftManager inst = GiftManager.inst();
            Context LIZLLL = C15380j0.LIZLLL();
            if (LIZLLL == null) {
                i = 1;
            } else {
                i = F9J.LIZIZ(LIZLLL, 0, "gift_dialog_storage").getInt("sp_gift_page_type", 1);
            }
            mutableLiveData.setValue(Integer.valueOf(inst.checkTabCanDisplay(i)));
        }
        if (o.LJ("gift_panel", str3) && GiftManager.inst().getTabByGiftId(j2) != -1) {
            c32136CjM.LIZIZ.setValue(Integer.valueOf(GiftManager.inst().getTabByGiftId(j2)));
        }
        c32136CjM.LJI.setValue(Long.valueOf(j2));
        c32136CjM.LIZ = user;
        c32136CjM.LJII = j3;
        MutableLiveData<EnumC32766CtW> mutableLiveData2 = c32136CjM.LJIIIIZZ;
        Room room3 = liveLandScapeGiftDialog.LJLILLLLZI;
        if (room3 != null) {
            j = room3.getId();
        } else {
            j = 0;
        }
        mutableLiveData2.setValue(C32569CqL.LIZ(j));
        liveLandScapeGiftDialog.LJLJJLL = c32136CjM;
        liveLandScapeGiftDialog.LJLLL = runnable;
        liveLandScapeGiftDialog.LJLIL = pages;
        this.LJLIL = liveLandScapeGiftDialog;
        if (fragmentManager == null) {
            return;
        }
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
        this.LJLIL.show(fragmentManager, "LiveNewGiftDialog");
    }

    public final void LLF(C32004ChE c32004ChE) {
        Boolean bool;
        String str = c32004ChE.LIZIZ;
        String str2 = "icon";
        if (str == null) {
            str = "icon";
        }
        if (C31593Cab.LIZIZ(this.dataChannel)) {
            C31593Cab.LJ(getView(), this.dataChannel);
            C32710Csc.LJIIJ(3, str, Boolean.valueOf(this.LLF), 0);
            return;
        }
        IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
        if (iGiftService.isNewsAccount(this.dataChannel)) {
            iGiftService.showGiftBannedPopup(getContext(), false);
            return;
        }
        C32100Cim c32100Cim = this.LJLLJ;
        if (c32100Cim != null) {
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
            o.LJIIIIZZ(interfaceC05190Ih, "getInstance().user().currentUser");
            boolean z = true;
            if (interfaceC05190Ih.childrenManagerForbidWalletFunctions()) {
                C30868C9o.LIZLLL(R.string.so_, c32100Cim.LIZ);
            } else if (((IHostUser) CN1.LIZ(IHostUser.class)).isNeedProtectMinor()) {
                C30868C9o.LIZJ(R.string.sw3);
            } else {
                DataChannel dataChannel = c32100Cim.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.qv0(HideShareLeadEvent.class, Boolean.TRUE);
                }
                GiftWidget giftWidget = c32100Cim.LIZJ;
                if (giftWidget == null) {
                    return;
                }
                giftWidget.LJZ(c32004ChE);
                return;
            }
            String str3 = c32004ChE.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            DataChannel dataChannel2 = c32100Cim.LIZIZ;
            if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
                z = bool.booleanValue();
            }
            C32710Csc.LJIIJ(3, str2, Boolean.valueOf(z), 0);
            return;
        }
        C32710Csc.LJIIJ(5, str, Boolean.valueOf(this.LLF), 0);
    }

    public final void LLFF(String str) {
        String value = LiveStreamGoalDetailWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            buildUpon.appendQueryParameter("goal_id", str);
            buildUpon.appendQueryParameter("entrance", "stream_goal_im");
            buildUpon.appendQueryParameter("capsule_message_from", "finished_goal");
            value = buildUpon.build().toString();
        } catch (Exception unused) {
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.context, value);
    }

    public final void LLFFF(List<GiftPage> list) {
        String responseHash;
        if (this.LLF) {
            GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
            GiftLeafRootWidget giftLeafRootWidget = this.LJLJJI;
            if (giftLeafRootWidget != null && giftListResult != null) {
                List<GiftPage> giftPages = giftListResult.giftPages;
                if (TextUtils.isEmpty(giftListResult.responseHash)) {
                    responseHash = "";
                } else {
                    responseHash = giftListResult.responseHash;
                }
                o.LJIIIZ(giftPages, "giftPages");
                o.LJIIIZ(responseHash, "responseHash");
                C32094Cig c32094Cig = giftLeafRootWidget.LJLIL;
                c32094Cig.getClass();
                c32094Cig.LJLIL = giftPages;
                C32094Cig c32094Cig2 = giftLeafRootWidget.LJLIL;
                c32094Cig2.getClass();
                c32094Cig2.LJLILLLLZI = responseHash;
            }
            GiftLeafRootViewModel giftLeafRootViewModel = (GiftLeafRootViewModel) ViewModelProviders.of(this.widgetCallback.getFragment()).get(GiftLeafRootViewModel.class);
            giftLeafRootViewModel.LJLJI.LIZ(new C32125CjB(list));
            if (C29306Beo.LJJII(this.dataChannel)) {
                giftLeafRootViewModel.LJLJJL.LIZ(new C32351Cmp());
                return;
            }
            return;
        }
        LiveLandScapeGiftDialog liveLandScapeGiftDialog = this.LJLIL;
        if (liveLandScapeGiftDialog == null) {
            return;
        }
        if (list != null) {
            liveLandScapeGiftDialog.xl(list);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = liveLandScapeGiftDialog.LJLJJI;
        if (liveNewGiftPanelWidget == null) {
            return;
        }
        liveNewGiftPanelWidget.LJZI = false;
        liveNewGiftPanelWidget.LJLZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0736  */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object... r17) {
        /*
            Method dump skipped, instructions count: 2898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget.onLoad(java.lang.Object[]):void");
    }

    public final void LL(GiftMessage giftMessage, boolean z) {
        Boolean bool;
        User user;
        long j;
        C32105Cir c32105Cir;
        Gift gift;
        AssetsModel LIZJ;
        InterfaceC32109Civ interfaceC32109Civ;
        InterfaceC65784Pro interfaceC65784Pro;
        long j2;
        InterfaceC65784Pro interfaceC65784Pro2;
        InterfaceC65784Pro interfaceC65784Pro3;
        long j3;
        InterfaceC65784Pro interfaceC65784Pro4;
        User user2;
        if (!isViewValid()) {
            return;
        }
        long j4 = giftMessage.fanTicketCount;
        Room room = this.LLD;
        long j5 = 0;
        if (room != null && room.getOwner() != null && (((user2 = giftMessage.toUser) == null || 0 == user2.getId() || giftMessage.toUser.getId() == this.LLD.getOwner().getId()) && (!giftMessage.LJLILLLLZI || j4 != 0))) {
            this.dataChannel.rv0(AnchorTicketCountChannel.class, Long.valueOf(j4));
        }
        if (z && !giftMessage.LJLILLLLZI && giftMessage.repeatEnd != 1) {
            C32463Cod.LJI(new C78072UkW(giftMessage), EnumC32093Cif.SELF_MESSAGE_DISABLE, EnumC32466Cog.ENQUEUE);
            return;
        }
        Gift gift2 = giftMessage.mGift;
        if (gift2 == null) {
            C32463Cod.LJI(new C78072UkW(giftMessage), EnumC32093Cif.SERVER_NO_GIFT_MODEL, EnumC32466Cog.ENQUEUE);
            return;
        }
        EnumC31997Ch7 giftType = GiftManager.inst().getGiftType(gift2);
        CLB clb = this.LJLLI;
        clb.getClass();
        if (giftType != null) {
            C0NB.LJIIIZ("STICK", "review message ");
            InterfaceC32103Cip interfaceC32103Cip = (InterfaceC32103Cip) ((HashMap) C31989Cgz.LIZ).get(giftType);
            DataChannel dataChannel = clb.LIZIZ;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            } else {
                bool = null;
            }
            if (interfaceC32103Cip != null && (((user = giftMessage.toUser) == null || user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) && (giftMessage.toUser != null || bool == null || bool.booleanValue()))) {
                User user3 = giftMessage.toUser;
                if (user3 != null) {
                    j = user3.getId();
                } else {
                    j = -1;
                }
                StringBuilder LIZJ2 = V10.LIZJ("check message if user is anchor passed toID: ", j, " currentID : ");
                LIZJ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                C0NB.LJIIIZ("STICK", X1D.LIZIZ(LIZJ2));
                Gift gift3 = giftMessage.mGift;
                if (gift3 != null && gift3.type == 4) {
                    c32105Cir = new C32105Cir();
                    String str = giftMessage.mLogId;
                    o.LJIIIIZZ(str, "message.mLogId");
                    c32105Cir.LIZ = str;
                    c32105Cir.LIZIZ = C30725C4b.LIZ();
                } else {
                    c32105Cir = null;
                }
                interfaceC32103Cip.LIZJ(giftMessage, new C32090Cic(c32105Cir));
                interfaceC32103Cip.LIZIZ();
            }
        }
        if (GiftRenderSparkOptimizeSetting.INSTANCE.isPreCreateWhenReceiveGiftMsg() && !giftMessage.isLocalInsertMsg && (((gift = giftMessage.mGift) != null || (gift = GiftManager.inst().findGiftById(giftMessage.giftId)) != null) && gift.type == 2 && (LIZJ = C32366Cn4.LIZJ(C32394CnW.LIZ(gift, giftMessage.colorId))) != null && LIZJ.resourceType == AssetsModel.RESOURCE_TYPE_LYNX && (interfaceC32109Civ = (InterfaceC32109Civ) C32260ClM.LIZ(InterfaceC32109Civ.class)) != null)) {
            C32108Ciu.LIZ(interfaceC32109Civ, null, 3);
        }
        this.LJLILLLLZI.LJZL(giftMessage);
        C32089Cib c32089Cib = this.LLI;
        DataChannel dataChannel2 = this.dataChannel;
        c32089Cib.getClass();
        GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting = GiftReceiveMsgThreadSetting.INSTANCE;
        List<Long> list = c32089Cib.LJLIL;
        if (giftReceiveMsgThreadSetting.getMultiThread()) {
            synchronized (list) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator<Long> it = c32089Cib.LJLIL.iterator();
                while (it.hasNext()) {
                    if (elapsedRealtime - it.next().longValue() > 30000) {
                        it.remove();
                    }
                }
                c32089Cib.LJLIL.add(Long.valueOf(elapsedRealtime));
                int size = c32089Cib.LJLIL.size();
                LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = LiveGiftGuideClientAISettings.INSTANCE;
                if (size >= liveGiftGuideClientAISettings.getValue().massiveGiftCount) {
                    if (dataChannel2 == null || (interfaceC65784Pro4 = (InterfaceC65784Pro) dataChannel2.kv0(WatchDurationChannel.class)) == null) {
                        j3 = 0;
                    } else {
                        j3 = ((Number) interfaceC65784Pro4.invoke()).longValue();
                    }
                    if (j3 >= liveGiftGuideClientAISettings.getValue().frequencyControlTaskDelay) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("massive_gift_num", c32089Cib.LJLIL.size());
                        C32146CjW.LIZJ(dataChannel2, "massive_gifts", jSONObject);
                    }
                }
                if (giftMessage.repeatCount >= liveGiftGuideClientAISettings.getValue().giftComboCount || giftMessage.comboCount >= liveGiftGuideClientAISettings.getValue().giftComboCount) {
                    if (dataChannel2 != null && (interfaceC65784Pro3 = (InterfaceC65784Pro) dataChannel2.kv0(WatchDurationChannel.class)) != null) {
                        j5 = ((Number) interfaceC65784Pro3.invoke()).longValue();
                    }
                    if (j5 >= liveGiftGuideClientAISettings.getValue().frequencyControlTaskDelay) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("combo_gift_num", giftMessage.comboCount);
                        C32146CjW.LIZJ(dataChannel2, "after_gift_combo", jSONObject2);
                    }
                }
            }
            return;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Iterator<Long> it2 = c32089Cib.LJLIL.iterator();
        while (it2.hasNext()) {
            if (elapsedRealtime2 - it2.next().longValue() > 30000) {
                it2.remove();
            }
        }
        c32089Cib.LJLIL.add(Long.valueOf(elapsedRealtime2));
        int size2 = c32089Cib.LJLIL.size();
        LiveGiftGuideClientAISettings liveGiftGuideClientAISettings2 = LiveGiftGuideClientAISettings.INSTANCE;
        if (size2 >= liveGiftGuideClientAISettings2.getValue().massiveGiftCount) {
            if (dataChannel2 != null && (interfaceC65784Pro2 = (InterfaceC65784Pro) dataChannel2.kv0(WatchDurationChannel.class)) != null) {
                j2 = ((Number) interfaceC65784Pro2.invoke()).longValue();
            } else {
                j2 = 0;
            }
            if (j2 < liveGiftGuideClientAISettings2.getValue().frequencyControlTaskDelay) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("massive_gift_num", c32089Cib.LJLIL.size());
            C32146CjW.LIZJ(dataChannel2, "massive_gifts", jSONObject3);
        }
        if (giftMessage.repeatCount < liveGiftGuideClientAISettings2.getValue().giftComboCount && giftMessage.comboCount < liveGiftGuideClientAISettings2.getValue().giftComboCount) {
            return;
        }
        if (dataChannel2 != null && (interfaceC65784Pro = (InterfaceC65784Pro) dataChannel2.kv0(WatchDurationChannel.class)) != null) {
            j5 = ((Number) interfaceC65784Pro.invoke()).longValue();
        }
        if (j5 < liveGiftGuideClientAISettings2.getValue().frequencyControlTaskDelay) {
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("combo_gift_num", giftMessage.comboCount);
        C32146CjW.LIZJ(dataChannel2, "after_gift_combo", jSONObject4);
    }
}
