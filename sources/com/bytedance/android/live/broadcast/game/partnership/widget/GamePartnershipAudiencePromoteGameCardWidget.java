package com.bytedance.android.live.broadcast.game.partnership.widget;

import X.AbstractC60811Ntn;
import X.ActivityC45651qj;
import X.B83;
import X.BCX;
import X.BJM;
import X.BZI;
import X.C0JE;
import X.C0NB;
import X.C113554cx;
import X.C15380j0;
import X.C16880lQ;
import X.C199097rd;
import X.C1JD;
import X.C221108m2;
import X.C24170xB;
import X.C25270yx;
import X.C28509BGv;
import X.C28787BRn;
import X.C28835BTj;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29927Bop;
import X.C30118Bru;
import X.C30128Bs4;
import X.C30451BxH;
import X.C30581Hy;
import X.C30588BzU;
import X.C30591BzX;
import X.C32537Cpp;
import X.C36261ba;
import X.C36271bb;
import X.C38489F8r;
import X.C38995FSd;
import X.C40941j8;
import X.C46931sn;
import X.C46941so;
import X.C46951sp;
import X.C46961sq;
import X.C47261Igj;
import X.C55592Gd;
import X.C62822Ol8;
import X.C72818Shy;
import X.C76052yf;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.JBR;
import X.ORZ;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import Y.ARunnableS7S0000100_5;
import Y.IDRunnableS2S0300000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.event.PartnershipAudiencePromotingCardClose;
import com.bytedance.android.livesdk.event.PartnershipAudiencePromotingTaskChannel;
import com.bytedance.android.livesdk.event.PartnershipRoomExitEvent;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.model.message.PartnershipCardChangeMessage;
import com.bytedance.android.livesdk.model.message.PartnershipDownloadCountMessage;
import com.bytedance.android.livesdk.model.message.PartnershipDropsUpdateMessage;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.model.message.PartnershipPunishMessage;
import com.bytedance.android.livesdk.model.message.PartnershipTaskShowMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.google.gson.m;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.p0;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* loaded from: classes.dex */
public final class GamePartnershipAudiencePromoteGameCardWidget extends RoomRecycleWidget implements InterfaceC72822Si2, OnMessageListener {
    public static C36261ba LJLLLLLL;
    public static C36271bb LJLZ = new C36271bb(0, CardStruct.IStatusCode.DEFAULT);
    public ViewGroup LJLIL;
    public boolean LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public Room LJLJJL;
    public IMessageManager LJLJL;
    public AudienceRoomInfoResponse.EsportsBriefTournamentInfo LJLLILLLL;
    public boolean LJLJJI = true;
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    public long LJLJLJ = System.currentTimeMillis();
    public Map<String, m> LJLJLLL = new LinkedHashMap();
    public long LJLL = System.currentTimeMillis();
    public long LJLLI = -1;
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C46931sn.LJLIL);
    public final C40941j8 LJLLL = new LynxViewClient() { // from class: X.1j8
        @Override // com.lynx.tasm.LynxViewClient
        public final void LJII() {
            long j;
            C0NB.LIZIZ("PartnershipAudience", "FloatingGameCard onFirstScreen");
            long currentTimeMillis = System.currentTimeMillis() - GamePartnershipAudiencePromoteGameCardWidget.this.LJLL;
            StringBuilder LIZJ = V10.LIZJ("FloatingGameCard on first screen : ", currentTimeMillis, " , firstLoad = ");
            LIZJ.append(GamePartnershipAudiencePromoteGameCardWidget.this.LJLJJI);
            C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZJ));
            p0.LIZ(currentTimeMillis, "first_screen");
            if (GamePartnershipAudiencePromoteGameCardWidget.this.LJLJJI) {
                j = 1;
            } else {
                j = 0;
            }
            p0.LIZ(j, "first_load");
            GamePartnershipAudiencePromoteGameCardWidget.this.LJLJJI = false;
        }

        @Override // com.lynx.tasm.LynxViewClient
        public final void onTimingSetup(java.util.Map<String, Object> map) {
            Object obj;
            java.util.Map map2;
            Object obj2;
            Long l;
            Object obj3;
            java.util.Map map3;
            Object obj4;
            long j;
            Long l2 = null;
            if (map == null) {
                obj = null;
            } else {
                try {
                    obj = map.get("metrics");
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    return;
                }
            }
            if (obj instanceof java.util.Map) {
                map2 = (java.util.Map) obj;
            } else {
                map2 = null;
            }
            if (map2 == null) {
                obj2 = null;
            } else {
                obj2 = map2.get("fcp");
            }
            if (obj2 instanceof Long) {
                l = (Long) obj2;
            } else {
                l = null;
            }
            if (map == null) {
                obj3 = null;
            } else {
                obj3 = map.get("metrics");
            }
            if (obj3 instanceof java.util.Map) {
                map3 = (java.util.Map) obj3;
            } else {
                map3 = null;
            }
            if (map3 == null) {
                obj4 = null;
            } else {
                obj4 = map3.get("lynx_fcp");
            }
            if (obj4 instanceof Long) {
                l2 = (Long) obj4;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FloatingGameCard onTimingSetup  fcp=");
            LIZ.append(l);
            LIZ.append("  lynxFcp=");
            LIZ.append(l2);
            C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZ));
            long j2 = 0;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            p0.LIZ(j, "fcp");
            if (l2 != null) {
                j2 = l2.longValue();
            }
            p0.LIZ(j2, "lynx_fcp");
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        }
    };
    public final C46941so LJLLLL = new AbstractC60811Ntn() { // from class: X.1so
        @Override // X.AbstractC60673NrZ
        public final void LJJJJJ(InterfaceC60761Nsz view) {
            o.LJIIIZ(view, "view");
            long currentTimeMillis = System.currentTimeMillis() - GamePartnershipAudiencePromoteGameCardWidget.this.LJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FloatingGameCard, Finish: ");
            LIZ.append(currentTimeMillis);
            C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZ));
            p0.LIZ(currentTimeMillis, "on_finish");
        }

        @Override // X.AbstractC60673NrZ
        public final void LJJJJZ(EnumC39924Flg kitType) {
            o.LJIIIZ(kitType, "kitType");
            long currentTimeMillis = System.currentTimeMillis() - GamePartnershipAudiencePromoteGameCardWidget.this.LJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FloatingGameCard, RuntimeReady: ");
            LIZ.append(currentTimeMillis);
            C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZ));
            p0.LIZ(currentTimeMillis, "on_runtime_ready");
        }

        @Override // X.AbstractC60673NrZ
        public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
            int i;
            BriefGameTask briefGameTask;
            long j;
            String str;
            String str2;
            BriefGame briefGame;
            String str3;
            PartnershipTask partnershipTask;
            PartnershipTask partnershipTask2;
            o.LJIIIZ(view, "view");
            o.LJIIIZ(url, "url");
            GamePartnershipAudiencePromoteGameCardWidget.this.hide();
            GamePartnershipAudiencePromoteGameCardWidget gamePartnershipAudiencePromoteGameCardWidget = GamePartnershipAudiencePromoteGameCardWidget.this;
            Room room = gamePartnershipAudiencePromoteGameCardWidget.LJLJJL;
            DataChannel dataChannel = gamePartnershipAudiencePromoteGameCardWidget.dataChannel;
            Integer num = c60704Ns4.LIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            Integer valueOf = Integer.valueOf(i);
            Long l = null;
            if (dataChannel != null) {
                briefGameTask = (BriefGameTask) dataChannel.kv0(C30591BzX.class);
            } else {
                briefGameTask = null;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_module_popup");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIJJ("user", "user_type");
            LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            if (briefGameTask != null && (partnershipTask2 = briefGameTask.task) != null) {
                str = partnershipTask2.idStr;
            } else {
                str = null;
            }
            String str4 = "";
            if (str == null) {
                str = "";
            }
            LIZ.LJIJJ(str, "task_id");
            if (briefGameTask == null || (partnershipTask = briefGameTask.task) == null || (str2 = partnershipTask.gameIdStr) == null) {
                str2 = "";
            }
            LIZ.LJIJJ(str2, "game_id");
            if (briefGameTask != null && (briefGame = briefGameTask.briefGame) != null && (str3 = briefGame.name) != null) {
                str4 = str3;
            }
            LIZ.LJIJJ(str4, "game_name");
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            }
            LIZ.LJIJJ(String.valueOf(l), "anchor_id");
            LIZ.LJIJJ(valueOf, "error_code");
            LIZ.LJJIIJZLJL();
        }
    };

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.doi;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        LLFF("conflict");
        LJZL(false, null, "", null);
    }

    public final C25270yx LJZ() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return (C25270yx) dataChannel.kv0(C55592Gd.class);
        }
        return null;
    }

    public final void LLFFF() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            if (this.LJLILLLLZI) {
                viewGroup.getLayoutParams().height = C15380j0.LIZ(138.0f);
                viewGroup.getLayoutParams().width = C15380j0.LIZ(108.0f);
                return;
            }
            viewGroup.getLayoutParams().height = C15380j0.LIZ(90.0f);
            viewGroup.getLayoutParams().width = -1;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        C0NB.LIZIZ("PartnershipAudience", "show");
        super.show();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        this.LJLJI = null;
        C72818Shy.LJII("closeGamePartnershipCard", this);
        C72818Shy.LJII("gamePartnershipNeedFillAge", this);
        C72818Shy.LJII("gamePartnershipAgeNotMatch", this);
        IMessageManager iMessageManager = this.LJLJL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLJL = null;
        this.LJLILLLLZI = false;
        this.LJLJJLL.removeMessages(0);
    }

    public final void LLF(Map<String, String> map) {
        if (this.context == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLL = currentTimeMillis;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (this.LJLJI != null) {
            long j = this.LJLLI;
            if (j != -1) {
                C38995FSd.LIZIZ().submit(new ARunnableS7S0000100_5(currentTimeMillis - j, 3));
                this.LJLLI = -1L;
            }
            C29682Bks LIZ = C29683Bkt.LIZ(C24170xB.LIZ.pageIntroCard);
            LIZ.LJJIFFI(map);
            LIZ.LJJI("click_time", String.valueOf(System.currentTimeMillis()));
            String uri = LIZ.LIZ().toString();
            o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIILL(uri, null);
                return;
            }
            return;
        }
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        C40941j8 lynxViewClient = this.LJLLL;
        C46941so loadCallback = this.LJLLLL;
        o.LJIIIZ(lynxViewClient, "lynxViewClient");
        o.LJIIIZ(loadCallback, "loadCallback");
        String str = C24170xB.LIZ.pageIntroCard;
        C29682Bks LIZ2 = C29683Bkt.LIZ(str);
        LIZ2.LJJIFFI(map);
        LIZ2.LJJI("click_time", String.valueOf(System.currentTimeMillis()));
        if (str.length() != 0) {
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            String uri2 = LIZ2.LIZ().toString();
            o.LJIIIIZZ(uri2, "sparkPopupSchemaBuilder.build().toString()");
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = iHybridContainerService.cZ(context, uri2, false, new IDqS172S0200000(loadCallback, lynxViewClient, 78));
        }
        this.LJLJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    public final void LLFF(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        long j;
        BriefGameTask briefGameTask;
        BriefGame briefGame;
        BriefGameTask briefGameTask2;
        BriefGame briefGame2;
        if (LJZ() == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_module_duration");
        LIZ.LJIILLIIL(this.dataChannel);
        if (C28835BTj.LIZLLL(this.dataChannel)) {
            obj = "ad";
        } else {
            obj = "normal";
        }
        LIZ.LJIJJ(obj, "live_traffic_source");
        C25270yx LJZ = LJZ();
        Object obj5 = null;
        if (LJZ != null && (briefGameTask2 = LJZ.LIZ) != null && (briefGame2 = briefGameTask2.briefGame) != null) {
            obj2 = briefGame2.name;
        } else {
            obj2 = null;
        }
        LIZ.LJIJJ(obj2, "game_name");
        C25270yx LJZ2 = LJZ();
        if (LJZ2 != null && (briefGameTask = LJZ2.LIZ) != null && (briefGame = briefGameTask.briefGame) != null) {
            obj5 = briefGame.id;
        }
        LIZ.LJIJJ(obj5, "game_id");
        LIZ.LJIJJ("intro_card", "module_name");
        LIZ.LJIJJ("live_detail", "page_name");
        LIZ.LJIJJ(Integer.valueOf(this.LJLILLLLZI ? 1 : 0), "is_fullscreen");
        C25270yx LJZ3 = LJZ();
        if (LJZ3 != null && LJZ3.LJ) {
            obj3 = "enter";
        } else {
            obj3 = "live";
        }
        LIZ.LJIJJ(obj3, "show_time");
        LIZ.LJIJJ("user", "user_type");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJIJJ(String.valueOf(BJM.LJ()), "host_id");
        LIZ.LJIJJ(String.valueOf(BJM.LJIILJJIL()), "content_id");
        if (o.LJ(str, "click")) {
            obj4 = "active";
        } else {
            obj4 = "passive";
        }
        LIZ.LJIJJ(obj4, "intro_card_close_type");
        LIZ.LJIJJ(str, "intro_card_close_sub_type");
        long currentTimeMillis = System.currentTimeMillis();
        C25270yx LJZ4 = LJZ();
        if (LJZ4 != null) {
            j = LJZ4.LIZIZ;
        } else {
            j = 0;
        }
        LIZ.LJIJJ(Long.valueOf((currentTimeMillis - j) / 1000), "duration");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        DataChannel dataChannel;
        View findViewById;
        if (objArr != null) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(objArr);
            while (true) {
                if (!LJJIIJZLJL.hasNext()) {
                    break;
                }
                Object next = LJJIIJZLJL.next();
                if (next instanceof Boolean) {
                    this.LJLILLLLZI = ((Boolean) next).booleanValue();
                    break;
                }
            }
        }
        View view = this.contentView;
        if (view != null && (findViewById = view.findViewById(R.id.dq5)) != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            this.LJLIL = viewGroup;
            viewGroup.setVisibility(4);
        }
        this.LJLLI = System.currentTimeMillis();
        LLF(C113554cx.LJJJLIIL());
        LLFFF();
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJL = room;
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.PARTNERSHIP_CARD_CHANGE_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LJLJL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.PARTNERSHIP_PUNISH_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.LJLJL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(EnumC31509CYf.PARTNERSHIP_GAME_OFFLINE_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.LJLJL;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(EnumC31509CYf.PARTNERSHIP_TASK_SHOW_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager5 = this.LJLJL;
        if (iMessageManager5 != null) {
            iMessageManager5.addAsyncMessageListener(EnumC31509CYf.PARTNERSHIP_DOWNLOAD_COUNT_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager6 = this.LJLJL;
        if (iMessageManager6 != null) {
            iMessageManager6.addAsyncMessageListener(EnumC31509CYf.PARTNERSHIP_DROPS_UPDATE_MESSAGE.getIntType(), this);
        }
        C72818Shy.LIZLLL("closeGamePartnershipCard", this);
        C72818Shy.LIZLLL("gamePartnershipNeedFillAge", this);
        C72818Shy.LIZLLL("gamePartnershipAgeNotMatch", this);
        if (!o.LJ(this.dataChannel.kv0(C30128Bs4.class), Boolean.TRUE) && (dataChannel = this.dataChannel) != null) {
            dataChannel.ov0(this, PartnershipAudiencePromotingTaskChannel.class, new IDqS416S0100000(this, 321));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, QuestionCardVisibilityEvent.class, new IDqS416S0100000(this, 318));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.ov0(this, FrameL2SlotVisibilityChannel.class, new IDqS416S0100000(this, 319));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.ov0(this, FrameL3SlotVisibilityChannel.class, new IDqS416S0100000(this, 320));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.qv0(this, this, PartnershipAudiencePromotingCardClose.class, new IDqS416S0100000(this, 322));
        dataChannelGlobal.nv0(this, this, PartnershipRoomExitEvent.class, new IDqS416S0100000(this, 323));
        this.LJLJJLL.post(new IDRunnableS85S0100000(this, 52));
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [com.bytedance.android.livesdk.game.model.BriefGameTask, O] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.android.livesdk.game.model.BriefGameTask, O] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Room room;
        PartnershipInfo partnershipInfo;
        PartnershipInfo partnershipInfo2;
        String str;
        Long l;
        BriefGameTask briefGameTask;
        PartnershipTask partnershipTask;
        boolean z;
        BriefGameTask briefGameTask2;
        PartnershipTask partnershipTask2;
        String str2;
        Long l2;
        BriefGameTask briefGameTask3;
        PartnershipTask partnershipTask3;
        Long l3;
        BriefGameTask briefGameTask4;
        PartnershipTask partnershipTask4;
        String str3;
        Room room2;
        Integer num;
        IGamePartnershipService gameService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
        String str4 = "";
        Long l4 = null;
        boolean z2 = false;
        if (iMessage instanceof PartnershipCardChangeMessage) {
            PartnershipCardChangeMessage partnershipCardChangeMessage = (PartnershipCardChangeMessage) iMessage;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on game card change message, message.changeMode = ");
            LIZ.append(partnershipCardChangeMessage.changeMode);
            C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LIZ));
            C0JE.LIZ();
            LLFF("unpin");
            if (partnershipCardChangeMessage.changeMode == 0) {
                LJZL(false, null, "", null);
                return;
            }
            String str5 = partnershipCardChangeMessage.taskId;
            o.LJIIIIZZ(str5, "message.taskId");
            LLFII(str5, "from_message");
            return;
        }
        if (iMessage instanceof PartnershipPunishMessage) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(25, 26);
            PunishEventInfo punishEventInfo = ((PartnershipPunishMessage) iMessage).punishInfo;
            if (punishEventInfo != null) {
                num = punishEventInfo.punishTypeId;
            } else {
                num = null;
            }
            if (!ORZ.LJLJJI(num, LJJIJIIJI)) {
                return;
            }
            C0JE.LIZ();
            LJZL(false, null, "", null);
            LLFF("punish");
            this.dataChannel.rv0(GamePartnershipEntranceHide.class, Boolean.TRUE);
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "gamePartnershipPunished"));
            return;
        }
        if (iMessage instanceof PartnershipGameOfflineMessage) {
            PartnershipGameOfflineMessage partnershipGameOfflineMessage = (PartnershipGameOfflineMessage) iMessage;
            o.LJIIIIZZ(gameService, "gameService");
            List<PartnershipGameOfflineMessage.OfflineGameInfo> list = partnershipGameOfflineMessage.offlineGameList;
            ArrayList LIZIZ = s1.LIZIZ(list, "message.offlineGameList");
            for (PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo : list) {
                if (offlineGameInfo.offlineType == 2) {
                    LIZIZ.add(offlineGameInfo);
                }
            }
            C30451BxH zi0 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).zi0();
            if (zi0 != null) {
                zi0.LIZJ(LIZIZ);
            }
            List<PartnershipGameOfflineMessage.OfflineGameInfo> offlineGameList = partnershipGameOfflineMessage.offlineGameList;
            o.LJIIIIZZ(offlineGameList, "offlineGameList");
            if ((!offlineGameList.isEmpty()) && (room2 = this.LJLJJL) != null && gameService.Rj0(room2.getId(), offlineGameList)) {
                this.dataChannel.rv0(GamePartnershipEntranceHide.class, Boolean.TRUE);
            }
            Iterator<PartnershipGameOfflineMessage.OfflineGameInfo> it = offlineGameList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PartnershipGameOfflineMessage.OfflineGameInfo next = it.next();
                String str6 = next.taskId;
                str6.toString();
                C36261ba c36261ba = LJLLLLLL;
                if (c36261ba != null) {
                    str3 = c36261ba.LJLIL;
                } else {
                    str3 = null;
                }
                if (o.LJ(str6, str3)) {
                    if (next != null) {
                        C0JE.LIZ();
                    }
                }
            }
            for (PartnershipGameOfflineMessage.OfflineGameInfo offlineGameInfo2 : offlineGameList) {
                String str7 = offlineGameInfo2.taskId;
                C25270yx LJZ = LJZ();
                if (LJZ != null && (briefGameTask4 = LJZ.LIZ) != null && (partnershipTask4 = briefGameTask4.task) != null) {
                    l3 = partnershipTask4.id;
                } else {
                    l3 = null;
                }
                if (o.LJ(str7, String.valueOf(l3))) {
                    if (offlineGameInfo2 == null) {
                        return;
                    }
                    LLFF("offline");
                    LJZL(false, null, "", null);
                    ((C32537Cpp) this.dataChannel.gv0(C30591BzX.class)).LIZ = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).OL();
                    return;
                }
            }
            return;
        }
        if (iMessage instanceof PartnershipTaskShowMessage) {
            PartnershipTaskShowMessage partnershipTaskShowMessage = (PartnershipTaskShowMessage) iMessage;
            o.LJIIIIZZ(gameService, "gameService");
            if (partnershipTaskShowMessage.changeMode == 1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("taskId", partnershipTaskShowMessage.taskId);
                C1JD.LJJIJL("gamePartnershipTaskShowChange", jSONObject, 4);
                String str8 = partnershipTaskShowMessage.taskId;
                C36261ba c36261ba2 = LJLLLLLL;
                if (c36261ba2 != null) {
                    str2 = c36261ba2.LJLIL;
                } else {
                    str2 = null;
                }
                if (o.LJ(str8, str2)) {
                    C0JE.LIZ();
                }
                String str9 = partnershipTaskShowMessage.taskId;
                C25270yx LJZ2 = LJZ();
                if (LJZ2 != null && (briefGameTask3 = LJZ2.LIZ) != null && (partnershipTask3 = briefGameTask3.task) != null) {
                    l2 = partnershipTask3.id;
                } else {
                    l2 = null;
                }
                if (o.LJ(str9, String.valueOf(l2))) {
                    LLFF("task_hide");
                    LJZL(false, null, "", null);
                }
            } else {
                C36261ba c36261ba3 = LJLLLLLL;
                if (c36261ba3 != null && !o.LJ(partnershipTaskShowMessage.taskId, c36261ba3.LJLIL)) {
                    C0JE.LIZ();
                }
                if (LJZ() != null) {
                    String str10 = partnershipTaskShowMessage.taskId;
                    C25270yx LJZ3 = LJZ();
                    if (LJZ3 != null && (briefGameTask = LJZ3.LIZ) != null && (partnershipTask = briefGameTask.task) != null) {
                        l = partnershipTask.id;
                    } else {
                        l = null;
                    }
                    if (!o.LJ(str10, String.valueOf(l))) {
                        LLFF("task_change");
                        LJZL(false, null, "", null);
                    }
                }
            }
            C25270yx LJZ4 = LJZ();
            if (LJZ4 != null) {
                String str11 = partnershipTaskShowMessage.taskId;
                C25270yx LJZ5 = LJZ();
                if (LJZ5 != null && (briefGameTask2 = LJZ5.LIZ) != null && (partnershipTask2 = briefGameTask2.task) != null) {
                    l4 = partnershipTask2.id;
                }
                if (o.LJ(str11, String.valueOf(l4))) {
                    if (partnershipTaskShowMessage.changeMode == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LJZ4.LJI = z;
                }
            }
            Room room3 = this.LJLJJL;
            if (room3 == null) {
                return;
            }
            Boolean Ac = gameService.Ac(room3.getId());
            long id = room3.getId();
            String str12 = partnershipTaskShowMessage.taskId;
            o.LJIIIIZZ(str12, "message.taskId");
            if (partnershipTaskShowMessage.changeMode == 1) {
                z2 = true;
            }
            boolean GB = gameService.GB(id, str12, z2);
            ((C32537Cpp) this.dataChannel.gv0(C30591BzX.class)).LIZ = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).OL();
            if (!GB) {
                ((C32537Cpp) this.dataChannel.gv0(C30118Bru.class)).LIZ = "task_show";
            }
            if (o.LJ(Boolean.valueOf(GB), Ac)) {
                return;
            }
            this.dataChannel.rv0(GamePartnershipEntranceHide.class, Boolean.valueOf(GB));
            return;
        }
        if (iMessage instanceof PartnershipDownloadCountMessage) {
            PartnershipDownloadCountMessage partnershipDownloadCountMessage = (PartnershipDownloadCountMessage) iMessage;
            LJLZ = new C36271bb(partnershipDownloadCountMessage.downloadedCount, partnershipDownloadCountMessage.gameId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("downloadedCount", String.valueOf(partnershipDownloadCountMessage.downloadedCount));
            jSONObject2.put("gameId", partnershipDownloadCountMessage.gameId);
            C1JD.LJJIJL("gamePartnershipUpdateDownloadedCount", jSONObject2, 4);
            return;
        }
        if (!(iMessage instanceof PartnershipDropsUpdateMessage)) {
            return;
        }
        o.LJIIIIZZ(gameService, "gameService");
        PartnershipDropsUpdateMessage partnershipDropsUpdateMessage = (PartnershipDropsUpdateMessage) iMessage;
        C30451BxH zi02 = gameService.zi0();
        int i = partnershipDropsUpdateMessage.changeMode;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (zi02 != null) {
                    C30451BxH.LJ();
                }
                C30588BzU.LJI("close", "im");
                return;
            }
            C30588BzU.LJI("update", "im");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("dropsId", partnershipDropsUpdateMessage.dropsId);
            jSONObject3.put("taskId", partnershipDropsUpdateMessage.taskId);
            jSONObject3.put("eventId", partnershipDropsUpdateMessage.eventId);
            jSONObject3.put("anchorUid", partnershipDropsUpdateMessage.anchorUid);
            C1JD.LJJIJL("gamePartnershipDropsProgressUpdate", jSONObject3, 4);
            return;
        }
        if (zi02 != null && C30451BxH.LIZIZ()) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("dropsId", partnershipDropsUpdateMessage.dropsId);
            jSONObject4.put("taskId", partnershipDropsUpdateMessage.taskId);
            jSONObject4.put("eventId", partnershipDropsUpdateMessage.eventId);
            jSONObject4.put("anchorUid", partnershipDropsUpdateMessage.anchorUid);
            C1JD.LJJIJL("gamePartnershipDropsProgressUpdate", jSONObject4, 4);
            return;
        }
        Room room4 = this.LJLJJL;
        if (room4 != null && (partnershipInfo2 = room4.partnershipInfo) != null && (str = partnershipInfo2.promotingDropsId) != null) {
            str4 = str;
        }
        if (partnershipDropsUpdateMessage.dropsId.length() > 0 && ((str4.length() == 0 || o.LJ(str4, CardStruct.IStatusCode.DEFAULT)) && (room = this.LJLJJL) != null && (partnershipInfo = room.partnershipInfo) != null)) {
            partnershipInfo.promotingDropsId = partnershipDropsUpdateMessage.dropsId;
        }
        this.LJLJJLL.postAtFrontOfQueue(new IDRunnableS2S0300000(zi02, this, partnershipDropsUpdateMessage, 12));
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Context context;
        String LJJIJIL;
        Context context2;
        ActivityC45651qj LIZIZ;
        String LJJIJIL2;
        String str = c199097rd.LJLIL;
        int hashCode = str.hashCode();
        String str2 = "";
        if (hashCode != -1825482305) {
            if (hashCode != -1664409398) {
                if (hashCode != -1649822732 || !str.equals("gamePartnershipNeedFillAge") || (context2 = this.context) == null || (LIZIZ = C29306Beo.LIZIZ(context2)) == null) {
                    return;
                }
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
                InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns != null && (LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns, "request_page", "")) != null) {
                    str2 = LJJIJIL2;
                }
                iGamePartnershipService.dk(LIZIZ, "user", str2, new IDqS416S0100000(c199097rd, 40));
                return;
            }
            if (!str.equals("closeGamePartnershipCard") || System.currentTimeMillis() - this.LJLJLJ < 500) {
                return;
            }
            this.LJLJLJ = System.currentTimeMillis();
            LLFF("click");
            LJZL(false, null, "", null);
            return;
        }
        if (!str.equals("gamePartnershipAgeNotMatch") || (context = this.context) == null) {
            return;
        }
        IGamePartnershipService iGamePartnershipService2 = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
        InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns2 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns2, "request_page", "")) != null) {
            str2 = LJJIJIL;
        }
        iGamePartnershipService2.Np(context, "user", str2);
    }

    public final Map<String, String> LJZI(BriefGameTask briefGameTask, UserInfo userInfo) {
        String str;
        String json;
        String str2;
        String str3;
        String str4;
        LiveMode liveMode;
        OSZ[] oszArr = new OSZ[14];
        boolean LJ = o.LJ(briefGameTask.task.gameIdStr, LJLZ.LJLILLLLZI);
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (LJ) {
            str = String.valueOf(LJLZ.LJLIL);
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("downloaded_count", str);
        m mVar = this.LJLJLLL.get(briefGameTask.task.idStr);
        Long l = null;
        if (mVar == null || (json = mVar.toString()) == null) {
            json = GsonProtectorUtils.toJson(new Gson(), briefGameTask);
            o.LJIIIIZZ(json, "Gson().toJson(showTask)");
        }
        oszArr[1] = new OSZ("card_info", json);
        oszArr[2] = new OSZ("esports_info", GsonProtectorUtils.toJson((Gson) this.LJLLJ.getValue(), this.LJLLILLLL));
        oszArr[3] = new OSZ("user_info", GsonProtectorUtils.toJson((Gson) this.LJLLJ.getValue(), userInfo));
        if (C28835BTj.LIZLLL(this.dataChannel)) {
            str2 = "ad";
        } else {
            str2 = "normal";
        }
        oszArr[4] = new OSZ("live_traffic_source", str2);
        oszArr[5] = new OSZ("is_host", CardStruct.IStatusCode.DEFAULT);
        Room room = this.LJLJJL;
        if (room != null) {
            str3 = room.getRequestId();
        } else {
            str3 = null;
        }
        oszArr[6] = new OSZ("request_id", String.valueOf(str3));
        oszArr[7] = new OSZ("action_type", BJM.LIZLLL());
        oszArr[8] = new OSZ("enter_method", BJM.LJIIIIZZ());
        oszArr[9] = new OSZ("enter_from_merge", BJM.LJFF());
        Room room2 = this.LJLJJL;
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        }
        oszArr[10] = new OSZ("content_id", String.valueOf(l));
        oszArr[11] = new OSZ("host_id", String.valueOf(BJM.LJ()));
        if (this.LJLILLLLZI) {
            str5 = "1";
        }
        oszArr[12] = new OSZ("is_landscape", str5);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str4 = C28509BGv.LIZ(liveMode);
        } else {
            str4 = "";
        }
        oszArr[13] = new OSZ("live_type", str4);
        return C113554cx.LJJL(oszArr);
    }

    public final void LLFII(String str, String str2) {
        Room room;
        if (this.context != null && this.dataChannel != null && (room = this.LJLJJL) != null) {
            IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            iGamePartnershipService.Bc0(context, room, dataChannel, new C46961sq(this, str2, str));
        }
    }

    public final void LJZL(boolean z, BriefGameTask briefGameTask, String str, UserInfo userInfo) {
        StringBuilder LJI = JBR.LJI("playAnimation isFromShowCard ", z, " , isLandscape =");
        LJI.append(this.LJLILLLLZI);
        C0NB.LIZIZ("PartnershipAudience", X1D.LIZIZ(LJI));
        C46951sp c46951sp = new C46951sp(this, briefGameTask, userInfo, str, z);
        if (z) {
            this.LJLJJLL.post(new IDRunnableS85S0100000(c46951sp, 53));
        } else {
            this.LJLJJLL.postAtFrontOfQueue(new IDRunnableS85S0100000(c46951sp, 53));
        }
    }
}
