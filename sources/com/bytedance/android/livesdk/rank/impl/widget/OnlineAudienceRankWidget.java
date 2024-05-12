package com.bytedance.android.livesdk.rank.impl.widget;

import X.AbstractC029409q;
import X.B4U;
import X.B76;
import X.B83;
import X.B9K;
import X.BCN;
import X.BCW;
import X.BJM;
import X.BM7;
import X.BY3;
import X.BZI;
import X.C03660Ck;
import X.C0K2;
import X.C113554cx;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C199097rd;
import X.C1DG;
import X.C221108m2;
import X.C259710f;
import X.C259910h;
import X.C28394BCk;
import X.C28652BMi;
import X.C28787BRn;
import X.C29044Baa;
import X.C29059Bap;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29701Eo;
import X.C30147BsN;
import X.C30554Byw;
import X.C31012CFc;
import X.C31014CFe;
import X.C31119CJf;
import X.C31153CKn;
import X.C31413CUn;
import X.C31502CXy;
import X.C38995FSd;
import X.C47061t0;
import X.C47261Igj;
import X.C48459J0d;
import X.C5H3;
import X.C62822Ol8;
import X.C68322mC;
import X.C72545SdZ;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73933Szx;
import X.C73943T0h;
import X.C78996UzQ;
import X.C81185Vtd;
import X.C83741Wtl;
import X.CFX;
import X.CN1;
import X.CV6;
import X.CY0;
import X.CY1;
import X.CY2;
import X.CY4;
import X.CY5;
import X.CY6;
import X.CY7;
import X.CY8;
import X.CY9;
import X.CYA;
import X.CYD;
import X.CYJ;
import X.CYK;
import X.CYL;
import X.CYM;
import X.CYO;
import X.CYQ;
import X.CYT;
import X.CYU;
import X.EnumC31154CKo;
import X.EnumC31158CKs;
import X.InterfaceC29856Bng;
import X.InterfaceC30442Bx8;
import X.InterfaceC72822Si2;
import X.OKG;
import X.OSZ;
import X.RunnableC30994CEk;
import Y.ARunnableS1S0220000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDAListenerS74S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.AudienceInProfileListChannel;
import com.bytedance.android.live.broadcast.api.GameFloatingWindowAudienceClickEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.ClickHorizontalPrivilegeCenterEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.LiveBoostCardFreshChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveAudienceRankUrl;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceCodeOptSwitchSettings;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.AudienceRankSettingEvent;
import com.bytedance.android.livesdk.watch.IDisplayOptService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class OnlineAudienceRankWidget extends RoomRecycleFunctionWidget implements CYK, InterfaceC72822Si2 {
    public C31502CXy LJLILLLLZI;
    public ImageView LJLJL;
    public RecyclerView LJLJLJ;
    public int LJLL;
    public boolean LJLLI;
    public FlareInfo LJLLILLLL;
    public long LJLLJ;
    public LiveIconView LJLLL;
    public TextView LJLLLL;
    public View LJLLLLLL;
    public TextView LJLZ;
    public C29701Eo LJZ;
    public View LJZI;
    public C47061t0 LJZL;
    public final int LL;
    public final boolean LLD;
    public int LLF;
    public final boolean LLFF;
    public ARunnableS41S0100000_5 LLFFF;
    public ARunnableS41S0100000_5 LLFII;
    public final C5H3 LLFZ;
    public final C73318Sq2 LLI;
    public Room LLIFFJFJJ;
    public SparkContext LLII;
    public final boolean LLIIII;
    public LinearLayout LLIIIILZ;
    public CY2 LLIIIJ;
    public final boolean LLIIIL;
    public int LLIIIZ;
    public final List<CV6> LLIIJI;
    public boolean LLIIJLIL;
    public long LLIIL;
    public boolean LLIILII;
    public final CY8 LLIILZL;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 269));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 268));
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 267));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 266));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(CYJ.LJLIL);

    @Override // X.CYK
    public final void LJLJLLL() {
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.deg;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLIL = false;
        View view = (View) this.LJLJJL.getValue();
        if (view != null) {
            view.setContentDescription(null);
        }
        ((ArrayList) this.LLIIJI).clear();
        this.LJLLJ = 0L;
        C72818Shy.LJII("ttlive_flare_viewers_list", this);
        C31502CXy c31502CXy = this.LJLILLLLZI;
        if (c31502CXy != null) {
            c31502CXy.LIZJ();
        }
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            this.LLII = null;
        }
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            this.LJLILLLLZI = null;
        }
        this.LJLLI = false;
        this.LJLJLJ = null;
        this.LLIIIILZ = null;
        CY2 cy2 = this.LLIIIJ;
        if (cy2 != null) {
            cy2.LJ = null;
            cy2.LJFF = null;
            cy2.LJIIIIZZ = null;
            cy2.LJIIIZ = null;
            cy2.LJIIJ = null;
            cy2.LJI = null;
            cy2.LJII = null;
        }
        this.LLIIIJ = null;
        this.LLI.LIZLLL();
        C28652BMi.LIZJ(0);
        CYA.LIZIZ = -1L;
        C72818Shy.LJII("audience_ranking_pop_event", this.LLIILZL);
        C72818Shy.LJII("audience_ranking_data", this.LLIILZL);
        View view2 = getView();
        if (view2 != null) {
            view2.removeCallbacks(this.LLFFF);
            view2.removeCallbacks(this.LLFII);
        }
    }

    @Override // X.CYK
    public final void LJIJJ() {
        try {
            if (this.isViewValid) {
                RecyclerView recyclerView = this.LJLJLJ;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                LinearLayout linearLayout = this.LLIIIILZ;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                CY0.LIZJ(0, this.dataChannel, false);
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.CYK
    public final void LJJLIIIJ() {
        try {
            if (this.isViewValid) {
                LLIIIJ(0);
                LLFII().setText(CardStruct.IStatusCode.DEFAULT);
                LLFZ().setVisibility(8);
                LinearLayout linearLayout = this.LLIIIILZ;
                if (linearLayout == null) {
                    return;
                }
                linearLayout.setVisibility(8);
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.CYK
    public final void LJLLI() {
        Room room;
        if (!this.LLIILII) {
            this.LLIILII = true;
            if (!LLII() && (room = this.LLIFFJFJJ) != null) {
                B76.LIZJ(room, "audience_avatar");
            }
        }
    }

    public final void LJLZ() {
        if (this.LLIIIZ >= 0) {
            View view = (View) this.LJLJJL.getValue();
            if (view == null) {
                return;
            }
            Resources resources = this.context.getResources();
            int i = this.LLIIIZ;
            String LJIILIIL = b.LJIILIIL(i);
            o.LJIIIIZZ(LJIILIIL, "getDisplayCountFloor(currentNumber.toLong())");
            Locale locale = Locale.ENGLISH;
            view.setContentDescription(resources.getQuantityString(R.plurals.o8, i, OKG.LIZJ(locale, "ENGLISH", LJIILIIL, locale, "this as java.lang.String).toUpperCase(locale)")));
            return;
        }
        View view2 = (View) this.LJLJJL.getValue();
        if (view2 == null) {
            return;
        }
        view2.setContentDescription(LLFII().getText());
    }

    public final void LJZI() {
        boolean z;
        List<CV6> list = (List) this.dataChannel.kv0(AudienceInProfileListChannel.class);
        if (list != null) {
            ((ArrayList) this.LLIIJI).clear();
            if (!C29306Beo.LJIIJ(this.dataChannel)) {
                LL(list, this.LLIIJI);
                return;
            } else {
                ((ArrayList) this.LLIIJI).addAll(list);
                return;
            }
        }
        if (C15380j0.LJIILLIIL() && LLIIII(2)) {
            ((ArrayList) this.LLIIJI).clear();
            int i = 0;
            do {
                List<CV6> list2 = this.LLIIJI;
                User user = new User();
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    z = C29306Beo.LJIIJ(dataChannel);
                } else {
                    z = false;
                }
                ((ArrayList) list2).add(new CV6(user, 0L, 0L, "", 0L, z));
                i++;
            } while (i < 2);
            return;
        }
        ((ArrayList) this.LLIIJI).clear();
        ((ArrayList) this.LLIIJI).addAll(new ArrayList(2));
    }

    public final List<CV6> LLFF() {
        return (List) this.LJLJLLL.getValue();
    }

    public final C83741Wtl LLFFF() {
        return (C83741Wtl) this.LLFZ.getValue();
    }

    public final CY1 LLFII() {
        return (CY1) this.LJLJJI.getValue();
    }

    public final View LLFZ() {
        return (View) this.LJLJI.getValue();
    }

    public final boolean LLII() {
        IDisplayOptService iDisplayOptService = (IDisplayOptService) CN1.LIZ(IDisplayOptService.class);
        if (iDisplayOptService != null) {
            return iDisplayOptService.bq(this.dataChannel);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLIIIILZ() {
        long j;
        boolean z;
        boolean z2;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        long j6;
        long j7;
        int i4;
        boolean z5;
        boolean z6;
        String str;
        String str2;
        Long l;
        Long l2;
        String str3;
        boolean z7;
        Boolean bool;
        RoomAuthStatus roomAuthStatus;
        boolean z8;
        Long l3;
        DataChannel dataChannel = this.dataChannel;
        HashMap hashMap = new HashMap();
        CY0.LIZ(dataChannel, hashMap);
        C0K2.LJII(0, "ttlive_audience_rank_entrance_click", hashMap);
        LiveMonitorSampleSetting liveMonitorSampleSetting = LiveMonitorSampleSetting.INSTANCE;
        if (liveMonitorSampleSetting.isReportSlardar("ttlive_livesdk_online_audience_rank_event_num_click")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(CYA.LIZ);
            linkedHashMap.put("is_click", 1);
            CYA.LIZ(0, "event_num_click", linkedHashMap);
        }
        Long LIZJ = InterfaceC30442Bx8.LJJJJI.LIZJ();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (l3 = (Long) dataChannel2.kv0(BCN.class)) != null) {
            j = l3.longValue();
        } else {
            j = 0;
        }
        if (LIZJ == null || LIZJ.longValue() != j) {
            z = false;
        } else {
            z = true;
        }
        FlareInfo flareInfo = this.LJLLILLLL;
        if (flareInfo != null && flareInfo.isFlare && !z) {
            BZI LIZ = C28787BRn.LIZ("livesdk_flare_label_click");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
        }
        try {
            if (this.isViewValid) {
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 != null) {
                    if (dataChannel3.kv0(C29494Bhq.class) != null) {
                        C31502CXy c31502CXy = this.LJLILLLLZI;
                        if (c31502CXy != null && c31502CXy.LJLL.onlinePanelClick) {
                            DataChannel dataChannel4 = this.dataChannel;
                            if (dataChannel4 != null) {
                                z2 = o.LJ(dataChannel4.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                ImageView imageView = this.LJLJL;
                                if (imageView != null && imageView.getVisibility() == 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                                Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                                if (room != null) {
                                    long id = room.getId();
                                    long ownerUserId = room.getOwnerUserId();
                                    if (id > 0 && ownerUserId > 0) {
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        linkedHashMap2.put("room_id", String.valueOf(id));
                                        linkedHashMap2.put("anchor_id", String.valueOf(ownerUserId));
                                        if (z8) {
                                            linkedHashMap2.put("has_caution_mark", "1");
                                        }
                                        if (dataChannelGlobal.mv0(C29059Bap.class) == EnumC31158CKs.SHOW) {
                                            linkedHashMap2.put("event_page", "live_extended_comment_filed");
                                        }
                                        BZI LIZ2 = C28787BRn.LIZ("anchor_click_active_user_rank");
                                        LIZ2.LJIIZILJ();
                                        LIZ2.LJJIFFI(linkedHashMap2);
                                        LIZ2.LJJIIJZLJL();
                                        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).upLoadLiveEcoEvent(id, 4);
                                    }
                                }
                                InterfaceC30442Bx8.t1.LIZJ(Boolean.FALSE);
                            }
                            DataChannel dataChannel5 = this.dataChannel;
                            String str4 = "anchor";
                            if (!o.LJ("ttlive_online_audience_load_lynx_all", "ttlive_online_audience_load_lynx_all") || liveMonitorSampleSetting.isReportDolphin("ttlive_online_audience_load_lynx_all", 0.1d)) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("stage", -100);
                                List<Rank> list = CY4.LIZ.ranks;
                                if (list != null) {
                                    i = list.size();
                                } else {
                                    i = 0;
                                }
                                hashMap2.put("cache_data", Integer.valueOf(i));
                                hashMap2.put("cache_user", Integer.valueOf(CY4.LIZJ.LIZ.size()));
                                hashMap2.put("cache_hit", Boolean.valueOf(CY4.LIZ(dataChannel5)));
                                int i5 = CY4.LIZLLL;
                                CY4.LIZLLL = i5 + 1;
                                hashMap2.put("click_times", Integer.valueOf(i5));
                                hashMap2.put("update_api_interval", Long.valueOf(System.currentTimeMillis() - CY4.LJ));
                                hashMap2.put("update_message_interval", Long.valueOf(System.currentTimeMillis() - CY4.LJFF));
                                if (dataChannel5 != null) {
                                    Room room2 = (Room) dataChannel5.kv0(RoomChannel.class);
                                    if (room2 != null) {
                                        j2 = room2.getId();
                                    } else {
                                        j2 = 0;
                                    }
                                    hashMap2.put("room_id", Long.valueOf(j2));
                                    Room room3 = (Room) dataChannel5.kv0(RoomChannel.class);
                                    if (room3 != null) {
                                        j3 = room3.getOwnerUserId();
                                    } else {
                                        j3 = 0;
                                    }
                                    hashMap2.put("anchor_id", Long.valueOf(j3));
                                    hashMap2.put("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                                    if (C29306Beo.LJIIJ(dataChannel5)) {
                                        hashMap2.put("user_type", "anchor");
                                    } else {
                                        hashMap2.put("user_type", "user");
                                    }
                                    hashMap2.put("user_count", Integer.valueOf(C28652BMi.LIZJ));
                                }
                                C0K2.LJII(0, "ttlive_online_audience_load_lynx_all", hashMap2);
                            }
                            DataChannel dataChannel6 = this.dataChannel;
                            CYU.LIZ = 0L;
                            CYU.LIZ = System.currentTimeMillis();
                            if (!o.LJ("ttlive_online_audience_load_lynx_all", "ttlive_online_audience_load_lynx_all") || liveMonitorSampleSetting.isReportDolphin("ttlive_online_audience_load_lynx_all", 0.1d)) {
                                HashMap hashMap3 = new HashMap();
                                if (dataChannel6 != null) {
                                    Room room4 = (Room) dataChannel6.kv0(RoomChannel.class);
                                    if (room4 != null) {
                                        j4 = room4.getId();
                                    } else {
                                        j4 = 0;
                                    }
                                    hashMap3.put("room_id", Long.valueOf(j4));
                                    Room room5 = (Room) dataChannel6.kv0(RoomChannel.class);
                                    if (room5 != null) {
                                        j5 = room5.getOwnerUserId();
                                    } else {
                                        j5 = 0;
                                    }
                                    hashMap3.put("anchor_id", Long.valueOf(j5));
                                    hashMap3.put("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                                    if (C29306Beo.LJIIJ(dataChannel6)) {
                                        hashMap3.put("user_type", "anchor");
                                    } else {
                                        hashMap3.put("user_type", "user");
                                    }
                                    hashMap3.put("user_count", Integer.valueOf(C28652BMi.LIZJ));
                                    hashMap3.put("live_audience_ranking_lynx_3", "2");
                                    hashMap3.put("use_simple_user", Boolean.TRUE);
                                }
                                hashMap3.put("stage", 1);
                                C0K2.LJII(0, "ttlive_online_audience_load_lynx_all", hashMap3);
                            }
                            B4U.LIZ().LJJIFFI("audience_list_lynx", null);
                            CYO boostChartInfo = ((IGiftService) CN1.LIZ(IGiftService.class)).getBoostChartInfo();
                            Room room6 = this.LLIFFJFJJ;
                            if (room6 != null && (roomAuthStatus = room6.getRoomAuthStatus()) != null) {
                                z3 = roomAuthStatus.isEnableGift();
                            } else {
                                z3 = true;
                            }
                            long j8 = 0;
                            if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(false, z4, z3);
                            String value = LiveAudienceRankUrl.INSTANCE.getValue();
                            DataChannel dataChannel7 = this.dataChannel;
                            if (dataChannel7 == null || (bool = (Boolean) dataChannel7.kv0(BCW.class)) == null || bool.booleanValue()) {
                                i2 = 450;
                            } else {
                                i2 = (int) C15380j0.LJIJ(B9K.LIZJ(this.context));
                            }
                            int LJIJ = (int) C15380j0.LJIJ(B9K.LIZJ(this.context));
                            boolean LIZ3 = C31119CJf.LIZ(this.dataChannel);
                            Room room7 = this.LLIFFJFJJ;
                            if (room7 != null) {
                                i3 = room7.cppVersion;
                            } else {
                                i3 = 0;
                            }
                            C29682Bks LIZIZ2 = C29683Bkt.LIZIZ(value);
                            Room room8 = (Room) this.dataChannel.kv0(RoomChannel.class);
                            if (room8 != null) {
                                j6 = room8.getId();
                            } else {
                                j6 = 0;
                            }
                            LIZIZ2.LJJI("room_id", String.valueOf(j6));
                            Room room9 = (Room) this.dataChannel.kv0(RoomChannel.class);
                            if (room9 != null) {
                                j7 = room9.getOwnerUserId();
                            } else {
                                j7 = 0;
                            }
                            LIZIZ2.LJJI("anchor_id", String.valueOf(j7));
                            LIZIZ2.LJJI("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                            if (!C29306Beo.LJIIJ(this.dataChannel)) {
                                str4 = "user";
                            }
                            LIZIZ2.LJJI("user_type", str4);
                            C31502CXy c31502CXy2 = this.LJLILLLLZI;
                            if (c31502CXy2 != null) {
                                i4 = c31502CXy2.LJLJL;
                            } else {
                                i4 = 0;
                            }
                            LIZIZ2.LJJI("user_count", String.valueOf(i4));
                            if (C28652BMi.LIZIZ(this.dataChannel) == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            LIZIZ2.LJJI("opt_on", String.valueOf(z5));
                            if (LIZIZ != EnumC31154CKo.GREY) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            LIZIZ2.LJJI("gift_enable", String.valueOf(z6));
                            LIZIZ2.LJJI("time_stamp", String.valueOf(CYU.LIZ));
                            LIZIZ2.LJJI("request_id", BJM.LJIILIIL());
                            String str5 = CardStruct.IStatusCode.DEFAULT;
                            if (LIZ3) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            LIZIZ2.LJJI("show_anchor_header", str);
                            LIZIZ2.LJJI("cpp_version", String.valueOf(i3));
                            FlareInfo flareInfo2 = this.LJLLILLLL;
                            if (flareInfo2 == null || (str2 = Boolean.valueOf(flareInfo2.isFlare).toString()) == null) {
                                str2 = "false";
                            }
                            LIZIZ2.LJJI("is_flare", str2);
                            if (boostChartInfo != null) {
                                if (boostChartInfo.LIZIZ) {
                                    str5 = "2";
                                } else if (boostChartInfo.LIZJ) {
                                    str5 = "1";
                                }
                            }
                            LIZIZ2.LJJI("boost_status", str5);
                            if (boostChartInfo != null) {
                                l = Long.valueOf(boostChartInfo.LIZ);
                            } else {
                                l = null;
                            }
                            LIZIZ2.LJJI("boost_amount", String.valueOf(l));
                            if (boostChartInfo != null) {
                                l2 = Long.valueOf(boostChartInfo.LIZLLL);
                            } else {
                                l2 = null;
                            }
                            LIZIZ2.LJJI("boost_countdown", String.valueOf(l2));
                            if (boostChartInfo == null || (str3 = boostChartInfo.LJ) == null) {
                                str3 = "";
                            }
                            LIZIZ2.LJJI("boost_icon", str3);
                            LIZIZ2.LJJI("time_diff", String.valueOf(C31012CFc.LIZIZ));
                            String connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
                            o.LJIIIIZZ(connectionType, "getService(IInteractServ…lass.java).connectionType");
                            LIZIZ2.LJJI("connection_type", connectionType);
                            Room room10 = this.LLIFFJFJJ;
                            if (room10 != null) {
                                j8 = room10.liveSubOnly;
                            }
                            LIZIZ2.LJJI("live_sub_only", String.valueOf(j8));
                            LIZIZ2.LJJI("enable_prefetch", "1");
                            LIZIZ2.LJJI("enable_canvas", "1");
                            LIZIZ2.LJJI("live_audience_ranking_lynx_3", "2");
                            LIZIZ2.LJJI("use_simple_user", "true");
                            LIZIZ2.LJJI("enable_code_cache", "1");
                            BY3 by3 = BY3.DP;
                            LIZIZ2.LJIIJ(i2, by3);
                            LIZIZ2.LJIL(LJIJ, by3);
                            C29682Bks.LJIJI(LIZIZ2, 8);
                            LIZIZ2.LJIJJ("bottom");
                            LIZIZ2.LJIIIZ("bottom");
                            LIZIZ2.LJIILJJIL("end");
                            LIZIZ2.LJIILLIIL("end");
                            String uri = LIZIZ2.LIZ().toString();
                            o.LJIIIIZZ(uri, "builder.build().toString()");
                            Context context = this.context;
                            if (context != null) {
                                this.LLII = ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(context, uri, new AqS171S0100000_5(this, 566));
                            }
                            if (!liveMonitorSampleSetting.isReportSlardar("ttlive_rank_lynx_gecko_exist_event")) {
                                return;
                            }
                            HashMap LIZJ2 = C03660Ck.LIZJ("channel", "revenue_client_audience_ranking_lynx");
                            IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
                            if (iHostResource != null) {
                                z7 = iHostResource.Br0("revenue_client_audience_ranking_lynx");
                            } else {
                                z7 = 0;
                            }
                            C0K2.LJII(!z7, "ttlive_rank_lynx_gecko_exist_event", LIZJ2);
                            return;
                        }
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    public OnlineAudienceRankWidget() {
        int i;
        if (C15380j0.LJIIZILJ()) {
            i = -1;
        } else {
            i = 1;
        }
        this.LL = i;
        this.LLD = C15380j0.LJIIZILJ();
        this.LLFF = LiveLikeOptSetting.INSTANCE.isOtherTextViewWidthOpt();
        this.LLFZ = C78996UzQ.LJJIJIIJI(CYM.LJLIL);
        this.LLI = new C73318Sq2();
        this.LLIIII = LiveMatchRequestLayoutSettings.INSTANCE.isRankListEnabled();
        this.LLIIIL = OnlineAudienceCodeOptSwitchSettings.INSTANCE.getValue();
        this.LLIIJI = new ArrayList();
        this.LLIILZL = new CY8(this);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJJJJ() {
        DataChannel dataChannel;
        Room room;
        if (LLII() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            B76.LIZLLL("watch_cnt", room, Long.valueOf(this.LLIIL));
            B76.LIZLLL("audience_avatar", room, Long.valueOf(this.LLIIL));
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJLJI() {
        if (LLII()) {
            this.LLIIL = System.currentTimeMillis();
        }
    }

    public final void LJZL() {
        int i;
        View view = getView();
        int i2 = 0;
        if (view != null) {
            i = view.getWidth();
        } else {
            i = 0;
        }
        int width = i - LLFZ().getWidth();
        int LIZ = C15380j0.LIZ(28.0f);
        if (width > 0) {
            i2 = width / LIZ;
        }
        this.LLF = i2;
    }

    @Override // X.CYK
    public final void LJJJJLI(boolean z) {
        if (this.LLIIII && this.LLIIIL) {
            return;
        }
        C31413CUn c31413CUn = new C31413CUn();
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        c31413CUn.LJLZ(CV6.class, new CY5(dataChannel, z));
        RecyclerView recyclerView = this.LJLJLJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
        RecyclerView recyclerView2 = this.LJLJLJ;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(c31413CUn);
    }

    @Override // X.CYK
    public final void LJJLIIIJJIZ(int i) {
        long j;
        boolean z;
        Long l;
        try {
            if (isViewValid()) {
                C31014CFe.LIZLLL.put("acu_num", String.valueOf(i));
                C31014CFe.LJI = i;
                C28652BMi.LIZJ(i);
                LLFZ().setVisibility(0);
                C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.LJJJJI;
                Long LIZJ = c48459J0d.LIZJ();
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (LIZJ == null || LIZJ.longValue() != j) {
                    z = false;
                } else {
                    z = true;
                }
                FlareInfo flareInfo = this.LJLLILLLL;
                if (flareInfo != null && flareInfo.isFlare && !z) {
                    if (this.LJLLJ == 0) {
                        this.LJLLJ = System.currentTimeMillis();
                        LLFII().setText(C15380j0.LJIILJJIL(R.string.l95));
                        LLIIIJ(-1);
                        BZI LIZ = C28787BRn.LIZ("livesdk_flare_lablel_show");
                        LIZ.LJIILLIIL(this.dataChannel);
                        LIZ.LJJIIJZLJL();
                        return;
                    }
                    if (System.currentTimeMillis() - this.LJLLJ <= 5000) {
                        return;
                    }
                    int width = LLFII().getWidth();
                    TextPaint paint = LLFII().getPaint();
                    String LJIILIIL = b.LJIILIIL(i);
                    o.LJIIIIZZ(LJIILIIL, "getDisplayCountFloor(num.toLong())");
                    Locale ENGLISH = Locale.ENGLISH;
                    o.LJIIIIZZ(ENGLISH, "ENGLISH");
                    String upperCase = LJIILIIL.toUpperCase(ENGLISH);
                    o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    ValueAnimator duration = ValueAnimator.ofInt(width, (int) paint.measureText(upperCase)).setDuration(300L);
                    duration.addUpdateListener(new AUListenerS94S0100000_5(this, 36));
                    duration.addListener(new CY9(this, i));
                    duration.setInterpolator(LLFFF());
                    duration.start();
                    c48459J0d.LIZ(Long.valueOf(j));
                    return;
                }
                String LJIILIIL2 = b.LJIILIIL(i);
                o.LJIIIIZZ(LJIILIIL2, "getDisplayCountFloor(num.toLong())");
                Locale ENGLISH2 = Locale.ENGLISH;
                o.LJIIIIZZ(ENGLISH2, "ENGLISH");
                String upperCase2 = LJIILIIL2.toUpperCase(ENGLISH2);
                o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                LLIIIJ(i);
                if (o.LJ(LLFII().getText(), upperCase2)) {
                    return;
                }
                if (this.LLFF) {
                    CY1 LLFII = LLFII();
                    LLFII.getClass();
                    if (!LLFII.LJZL) {
                        LLFII.LJJJ();
                    }
                    boolean z2 = !o.LJ(LLFII.LJZ, LLFII.getText());
                    if (!z2 && o.LJ(upperCase2, LLFII.getText())) {
                        return;
                    }
                    boolean LJJJIL = LLFII.LJJJIL(upperCase2);
                    if (z2 || LJJJIL) {
                        int i2 = (int) (LLFII.LLFF.LIZLLL + 0.0f);
                        int i3 = LLFII.LLD;
                        if (i2 > i3) {
                            i2 = i3;
                        }
                        if (i2 != LLFII.getLayoutParams().width) {
                            LLFII.getLayoutParams().width = i2;
                            LLFII.setLayoutParams(LLFII.getLayoutParams());
                        }
                    }
                    LLFII.LJZ = upperCase2;
                    LLFII.LJZI = upperCase2;
                    LLFII.setText(upperCase2);
                    return;
                }
                LLFII().setText(upperCase2);
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    public final void LJZ(CYQ cyq) {
        Context context;
        Context context2;
        Context context3;
        if (cyq.LIZ.length() == 0) {
            return;
        }
        C47061t0 c47061t0 = this.LJZL;
        if (c47061t0 != null) {
            C15490jB.LJ(c47061t0, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_interaction_demand_1"), cyq.LIZ);
        }
        C47061t0 c47061t02 = this.LJZL;
        if (c47061t02 != null) {
            c47061t02.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C47061t0 c47061t03 = this.LJZL;
        o.LJI(c47061t03);
        ObjectAnimator LIZJ = C1DG.LIZJ(c47061t03, View.ALPHA, new float[]{0.0f, 1.0f}, "ofFloat(mPopCardIcon!!, View.ALPHA, 0F, 1F)", 200L);
        LIZJ.setInterpolator(LLFFF());
        C47061t0 c47061t04 = this.LJZL;
        o.LJI(c47061t04);
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[2];
        C47061t0 c47061t05 = this.LJZL;
        Context context4 = null;
        if (c47061t05 != null) {
            context = c47061t05.getContext();
        } else {
            context = null;
        }
        fArr[0] = B9K.LIZ(context, 160.0f);
        C47061t0 c47061t06 = this.LJZL;
        if (c47061t06 != null) {
            context2 = c47061t06.getContext();
        } else {
            context2 = null;
        }
        fArr[1] = B9K.LIZ(context2, 160.0f);
        ObjectAnimator LIZJ2 = C1DG.LIZJ(c47061t04, property, fArr, "ofFloat(\n               …ext, 160F),\n            )", 200L);
        LIZJ2.setInterpolator(LLFFF());
        C47061t0 c47061t07 = this.LJZL;
        o.LJI(c47061t07);
        Property property2 = View.TRANSLATION_X;
        float[] fArr2 = new float[2];
        float f = this.LL;
        C47061t0 c47061t08 = this.LJZL;
        if (c47061t08 != null) {
            context3 = c47061t08.getContext();
        } else {
            context3 = null;
        }
        fArr2[0] = B9K.LIZ(context3, 150.0f) * f;
        float f2 = -this.LL;
        C47061t0 c47061t09 = this.LJZL;
        if (c47061t09 != null) {
            context4 = c47061t09.getContext();
        }
        fArr2[1] = B9K.LIZ(context4, 25.0f) * f2;
        ObjectAnimator LIZJ3 = C1DG.LIZJ(c47061t07, property2, fArr2, "ofFloat(\n               …text, 25F),\n            )", 200L);
        LIZJ3.setInterpolator(LLFFF());
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet animatorSet4 = new AnimatorSet();
        C47061t0 c47061t010 = this.LJZL;
        o.LJI(c47061t010);
        ObjectAnimator LIZJ4 = C1DG.LIZJ(c47061t010, View.SCALE_X, new float[]{6.0f, 6.0f}, "ofFloat(mPopCardIcon!!, View.SCALE_X, 6F, 6F)", 80L);
        LIZJ4.setInterpolator(LLFFF());
        C47061t0 c47061t011 = this.LJZL;
        o.LJI(c47061t011);
        ObjectAnimator LIZJ5 = C1DG.LIZJ(c47061t011, View.SCALE_X, new float[]{6.0f, 6.0f}, "ofFloat(mPopCardIcon!!, View.SCALE_X, 6F, 6F)", 80L);
        LIZJ5.setInterpolator(LLFFF());
        C47061t0 c47061t012 = this.LJZL;
        o.LJI(c47061t012);
        ObjectAnimator LIZJ6 = C1DG.LIZJ(c47061t012, View.SCALE_X, new float[]{6.0f, 4.0f}, "ofFloat(mPopCardIcon!!, View.SCALE_X, 6F, 4F)", 120L);
        LIZJ6.setInterpolator(LLFFF());
        C47061t0 c47061t013 = this.LJZL;
        o.LJI(c47061t013);
        ObjectAnimator LIZJ7 = C1DG.LIZJ(c47061t013, View.SCALE_Y, new float[]{6.0f, 4.0f}, "ofFloat(mPopCardIcon!!, View.SCALE_Y, 6F, 4F)", 120L);
        LIZJ7.setInterpolator(LLFFF());
        animatorSet4.playTogether(LIZJ6, LIZJ7);
        animatorSet3.playTogether(LIZJ4, LIZJ5);
        animatorSet2.playSequentially(animatorSet3, animatorSet4);
        C47061t0 c47061t014 = this.LJZL;
        if (c47061t014 != null) {
            c47061t014.setVisibility(0);
        }
        animatorSet.playTogether(LIZJ, animatorSet2, LIZJ2, LIZJ3);
        animatorSet.addListener(new IDAListenerS74S0100000_5(this, 6));
        animatorSet.start();
    }

    public final void LLF(long j) {
        String string;
        TextView textView = this.LJLZ;
        if (textView == null) {
            return;
        }
        if (!this.LLD) {
            string = getContext().getResources().getString(R.string.nnv, ((IGiftService) CN1.LIZ(IGiftService.class)).getAmountString(j));
        } else {
            string = getContext().getResources().getString(R.string.nnw, ((IGiftService) CN1.LIZ(IGiftService.class)).getAmountString(j));
        }
        textView.setText(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLIIII(int r6) {
        /*
            r5 = this;
            X.CXy r1 = r5.LJLILLLLZI
            boolean r0 = r1 instanceof X.C31502CXy
            r4 = 0
            if (r0 == 0) goto L3d
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.presenter.OnlineAudienceRankPresent"
            kotlin.jvm.internal.o.LJII(r1, r0)
            boolean r0 = r1.LJ()
            if (r0 == 0) goto L3d
            r3 = 1
        L13:
            X.CXy r2 = r5.LJLILLLLZI
            boolean r1 = r2 instanceof X.C31502CXy
            r0 = 0
            if (r1 == 0) goto L20
            if (r2 == 0) goto L20
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r5.LLIFFJFJJ
            if (r1 != 0) goto L2c
        L20:
            if (r3 == 0) goto L2b
            if (r0 == 0) goto L2b
            int r0 = r0.intValue()
            if (r0 < r6) goto L2b
            r4 = 1
        L2b:
            return r4
        L2c:
            boolean r0 = r2.LJZI
            if (r0 == 0) goto L38
            long r1 = r1.roomPcu
            int r0 = (int) r1
        L33:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L20
        L38:
            int r0 = r1.getUserCount()
            goto L33
        L3d:
            r3 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget.LLIIII(int):boolean");
    }

    public final void LLIIIJ(int i) {
        if (this.LLIIIZ != i) {
            this.LLIIIZ = i;
            LJLZ();
        }
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget
    public final void onGetRoomInfo(Room room) {
        C31502CXy c31502CXy = this.LJLILLLLZI;
        if (c31502CXy != null) {
            c31502CXy.LIZ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [T, java.util.List<X.CV6>] */
    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long l;
        Long l2;
        int i;
        DataChannel dataChannel;
        C31413CUn c31413CUn;
        RecyclerView recyclerView;
        DataChannel dataChannel2;
        Room room;
        View view;
        int i2;
        Room room2;
        int userCount;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        boolean z;
        User owner;
        super.onLoad(objArr);
        if (!CYT.LIZ && OnlineAudienceGeckoSetting.INSTANCE.getValue().isAudienceListGeckoSettingOn) {
            CYT.LIZ = true;
            C38995FSd.LIZLLL().execute(RunnableC30994CEk.LJLIL);
        }
        CY4.LIZLLL = 1;
        CY4.LIZ = new OnlineRankListResponse();
        CY4.LIZIZ = "";
        CY4.LIZJ.LIZ.clear();
        if (this.LLFF) {
            LLFII().LJJIZ(C47261Igj.LJJIJIIJI("K", "M", "B"));
        } else {
            LLFII().setEnableMeasureOpt(false);
        }
        LLIIIJ(0);
        this.LLIFFJFJJ = (Room) this.dataChannel.kv0(RoomChannel.class);
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        Room room3 = this.LLIFFJFJJ;
        AbstractC029409q abstractC029409q = null;
        if (room3 != null) {
            l = Long.valueOf(room3.getId());
        } else {
            l = null;
        }
        oszArr[1] = new OSZ("room_id", l);
        Room room4 = this.LLIFFJFJJ;
        if (room4 != null && (owner = room4.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        } else {
            l2 = null;
        }
        oszArr[2] = new OSZ("anchor_id", l2);
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            i = o.LJ(dataChannel3.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            i = 0;
        }
        oszArr[3] = new OSZ("is_anchor", Integer.valueOf(i));
        Map<? extends String, ? extends Object> LJJL = C113554cx.LJJL(oszArr);
        Map<String, Object> map = CYA.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(LJJL);
        this.LJLLJ = 0L;
        try {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                this.LJLLILLLL = (FlareInfo) dataChannel4.kv0(BM7.class);
                this.LLF = 0;
                if ((!this.LLIIII || !this.LLIIIL) && (dataChannel = this.dataChannel) != null && o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE)) {
                    this.LJLJLJ = (RecyclerView) findViewById(R.id.j_o);
                }
                DataChannel dataChannel5 = this.dataChannel;
                o.LJIIIIZZ(dataChannel5, "dataChannel");
                C31502CXy c31502CXy = new C31502CXy(dataChannel5);
                this.LJLILLLLZI = c31502CXy;
                c31502CXy.LIZ(this);
                if (this.LLIIII) {
                    this.LLIIIILZ = (LinearLayout) findViewById(R.id.g4w);
                    RecyclerView recyclerView2 = this.LJLJLJ;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    LinearLayout linearLayout = this.LLIIIILZ;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = this.LLIIIILZ;
                    if (linearLayout2 != null) {
                        DataChannel dataChannel6 = this.dataChannel;
                        C31502CXy c31502CXy2 = this.LJLILLLLZI;
                        if ((c31502CXy2 instanceof C31502CXy) && c31502CXy2 != null) {
                            z = c31502CXy2.LJLL.scoreShow;
                        } else {
                            z = true;
                        }
                        this.LLIIIJ = new CY2(dataChannel6, linearLayout2, z);
                    }
                }
                this.LJLLI = false;
                this.LJZ = (C29701Eo) findViewById(R.id.ann);
                this.LJZL = (C47061t0) findViewById(R.id.hwt);
                this.LJLLL = (LiveIconView) findViewById(R.id.ncw);
                if (C259710f.LIZ.LJIIIZ() && C15380j0.LIZ(310.0f) > C81185Vtd.LIZLLL()) {
                    LiveIconView liveIconView = this.LJLLL;
                    if (liveIconView != null && (layoutParams2 = liveIconView.getLayoutParams()) != null) {
                        layoutParams2.width = 0;
                    }
                    LiveIconView liveIconView2 = this.LJLLL;
                    if (liveIconView2 != null && (layoutParams = liveIconView2.getLayoutParams()) != null) {
                        layoutParams.height = 0;
                    }
                }
                LiveIconView liveIconView3 = this.LJLLL;
                if (liveIconView3 != null) {
                    DataChannel dataChannel7 = this.dataChannel;
                    if (dataChannel7 != null && o.LJ(dataChannel7.kv0(BCW.class), Boolean.FALSE)) {
                        liveIconView3.setIconAttr(R.attr.auy);
                        liveIconView3.setIconTint(C259910h.LIZIZ(R.attr.dj, liveIconView3.getContext()));
                    } else {
                        liveIconView3.setImageResource(R.drawable.d5y);
                    }
                }
                DataChannel dataChannel8 = this.dataChannel;
                if (dataChannel8 != null && o.LJ(dataChannel8.kv0(BCW.class), Boolean.FALSE)) {
                    LLFII().setTextColor(C259910h.LIZIZ(R.attr.dk, getContext()));
                }
                View LLFZ = LLFZ();
                LLFZ.setVisibility(4);
                if (C15380j0.LJIILLIIL() && LLIIII(1)) {
                    C31502CXy c31502CXy3 = this.LJLILLLLZI;
                    if ((c31502CXy3 instanceof C31502CXy) && c31502CXy3 != null && (room2 = this.LLIFFJFJJ) != null) {
                        if (c31502CXy3.LJZI) {
                            userCount = (int) room2.roomPcu;
                        } else {
                            userCount = room2.getUserCount();
                        }
                        Integer valueOf = Integer.valueOf(userCount);
                        if (valueOf != null) {
                            i2 = valueOf.intValue();
                            LLIIIJ(i2);
                            CY1 LLFII = LLFII();
                            String LJIILIIL = b.LJIILIIL(i2);
                            o.LJIIIIZZ(LJIILIIL, "getDisplayCountFloor(userCount.toLong())");
                            Locale ENGLISH = Locale.ENGLISH;
                            o.LJIIIIZZ(ENGLISH, "ENGLISH");
                            String upperCase = LJIILIIL.toUpperCase(ENGLISH);
                            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            LLFII.setText(upperCase);
                            LLFZ.setVisibility(0);
                            LJLLI();
                        }
                    }
                    i2 = 0;
                    LLIIIJ(i2);
                    CY1 LLFII2 = LLFII();
                    String LJIILIIL2 = b.LJIILIIL(i2);
                    o.LJIIIIZZ(LJIILIIL2, "getDisplayCountFloor(userCount.toLong())");
                    Locale ENGLISH2 = Locale.ENGLISH;
                    o.LJIIIIZZ(ENGLISH2, "ENGLISH");
                    String upperCase2 = LJIILIIL2.toUpperCase(ENGLISH2);
                    o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    LLFII2.setText(upperCase2);
                    LLFZ.setVisibility(0);
                    LJLLI();
                }
                C16880lQ.LJIIJ(new CYL(this), LLFZ);
                C72818Shy.LIZLLL("ttlive_flare_viewers_list", this);
                RecyclerView recyclerView3 = this.LJLJLJ;
                if (recyclerView3 != null) {
                    recyclerView3.setClickable(false);
                }
                if (this.LLIIII) {
                    LJZI();
                    C68322mC c68322mC = new C68322mC();
                    c68322mC.element = this.LLIIJI;
                    CY6 cy6 = new CY6(this, c68322mC);
                    LinearLayout linearLayout3 = this.LLIIIILZ;
                    if (linearLayout3 != null) {
                        linearLayout3.addOnLayoutChangeListener(cy6);
                    }
                } else {
                    RecyclerView recyclerView4 = this.LJLJLJ;
                    if (recyclerView4 != null) {
                        abstractC029409q = recyclerView4.getAdapter();
                    }
                    if ((abstractC029409q instanceof C31413CUn) && (c31413CUn = (C31413CUn) abstractC029409q) != null && ((recyclerView = this.LJLJLJ) == null || !recyclerView.LJJJLL())) {
                        LJZI();
                        c31413CUn.LJZ(this.LLIIJI);
                        CY7 cy7 = new CY7(this, c31413CUn);
                        RecyclerView recyclerView5 = this.LJLJLJ;
                        if (recyclerView5 != null) {
                            recyclerView5.addOnLayoutChangeListener(cy7);
                        }
                    }
                }
                this.LJLLLL = (TextView) findViewById(R.id.hwp);
                this.LJLLLLLL = findViewById(R.id.hws);
                this.LJLZ = (TextView) findViewById(R.id.hwq);
                this.LJZI = findViewById(R.id.hwr);
                if (C15380j0.LJIIZILJ() && (view = this.LJZI) != null) {
                    view.setBackground(C15380j0.LJI(R.drawable.cjg));
                }
                this.dataChannel.ov0(this, LiveBoostCardFreshChannel.class, new AqS171S0100000_5(this, 565));
                this.LLI.LIZ(C73943T0h.LIZ().LJ(CYQ.class).LJJJJZI(new AfS57S0100000_5(this, 193)));
                if (objArr != null) {
                    int length = objArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        Object obj = objArr[i3];
                        if ((obj instanceof C30147BsN) && ((C30147BsN) obj).LIZ > 0) {
                            if (obj != null) {
                                CYA.LIZIZ = ((C30147BsN) obj).LIZ;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_livesdk_online_audience_rank_widget_load_finished", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.putAll(CYA.LIZ);
                                    long j = CYA.LIZIZ;
                                    long j2 = -1;
                                    if (j != -1) {
                                        j2 = elapsedRealtime - j;
                                    }
                                    linkedHashMap.put("duration", Long.valueOf(j2));
                                    CYA.LIZ(0, "widget_load_finished", linkedHashMap);
                                }
                            }
                        } else {
                            i3++;
                        }
                    }
                }
                DataChannel dataChannel9 = this.dataChannel;
                dataChannel9.lv0(this, UserWannaSendMessageEvent.class, new AqS171S0100000_5(this, 482));
                dataChannel9.lv0(this, ClickHorizontalPrivilegeCenterEvent.class, new AqS171S0100000_5(this, 483));
                dataChannel9.lv0(this, AudienceRankSettingEvent.class, new AqS171S0100000_5(this, 484));
                dataChannel9.lv0(this, GameFloatingWindowAudienceClickEvent.class, new AqS171S0100000_5(this, 481));
                C72818Shy.LIZLLL("audience_ranking_pop_event", this.LLIILZL);
                C72818Shy.LIZLLL("audience_ranking_data", this.LLIILZL);
                ImageView imageView = (ImageView) findViewById(R.id.d10);
                this.LJLJL = imageView;
                if (imageView != null) {
                    C29306Beo.LJI(imageView);
                }
                C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.t1;
                if (!o.LJ(c30554Byw.LIZ(), Boolean.FALSE) && C31119CJf.LIZ(this.dataChannel)) {
                    c30554Byw.LIZJ(Boolean.TRUE);
                    this.LLFII = new ARunnableS41S0100000_5(this, 184);
                    View view2 = getView();
                    if (view2 != null) {
                        view2.postDelayed(this.LLFII, LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
                    }
                }
                if (!this.LLIIJLIL) {
                    this.LLIIJLIL = true;
                    if (!LLII() && (dataChannel2 = this.dataChannel) != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                        B76.LIZJ(room, "watch_cnt");
                    }
                }
                DataChannel dataChannel10 = this.dataChannel;
                if (dataChannel10 != null && C29306Beo.LJIIL(dataChannel10)) {
                    ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIIIZZ.LJJIFFI(new CYD(this)).LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS57S0100000_5(this, 164));
                }
                LJLZ();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "ttlive_flare_viewers_list")) {
            LLIIIILZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LL(List<CV6> list, List<CV6> list2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (CV6 cv6 : list) {
            if (cv6.LIZIZ > 0) {
                arrayList.add(cv6);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list2.add(it.next());
        }
        int min = Math.min(2, C28652BMi.LIZJ) - list2.size();
        for (int i = 0; i < min; i++) {
            User user = new User();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                z = C29306Beo.LJIIJ(dataChannel);
            } else {
                z = false;
            }
            list2.add(new CV6(user, 0L, 0L, "", 0L, z));
        }
    }

    @Override // X.CYK
    public final void LJJIJLIJ(boolean z, boolean z2, List profileItems) {
        o.LJIIIZ(profileItems, "profileItems");
        try {
            if (isViewValid()) {
                if (this.context != null) {
                    boolean z3 = true;
                    if (!this.LJLLI) {
                        RecyclerView recyclerView = this.LJLJLJ;
                        if (recyclerView != null) {
                            recyclerView.setClickable(true);
                        }
                        this.LJLLI = true;
                        Long l = (Long) this.dataChannel.kv0(C28394BCk.class);
                        if (l != null) {
                            l.longValue();
                            C72545SdZ.LJFF(this.dataChannel, "audience_list_widget_load_duration", String.valueOf(System.currentTimeMillis() - l.longValue()));
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!C29306Beo.LJIIJ(this.dataChannel)) {
                        LL(profileItems, arrayList);
                    } else {
                        arrayList.addAll(profileItems);
                    }
                    boolean LJ = o.LJ(LLFF(), arrayList);
                    if (!z || !(!C29306Beo.LJIIJ(this.dataChannel))) {
                        z3 = false;
                    }
                    if (!LJ || z3 || !z2) {
                        if (this.LLIIII) {
                            LinearLayout linearLayout = this.LLIIIILZ;
                            if (linearLayout != null) {
                                linearLayout.post(new ARunnableS1S0220000_5(this, arrayList, z3, z2, 0));
                                return;
                            }
                            return;
                        }
                        RecyclerView recyclerView2 = this.LJLJLJ;
                        if (recyclerView2 == null) {
                            return;
                        }
                        recyclerView2.post(new ARunnableS1S0220000_5(this, arrayList, z3, z2, 1));
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }
}
