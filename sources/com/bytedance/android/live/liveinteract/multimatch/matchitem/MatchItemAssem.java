package com.bytedance.android.live.liveinteract.multimatch.matchitem;

import X.B83;
import X.BJM;
import X.C04750Gp;
import X.C05170If;
import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C15490jB;
import X.C15610jN;
import X.C16880lQ;
import X.C1JD;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C25620zW;
import X.C278817o;
import X.C29374Bfu;
import X.C29701Eo;
import X.C29927Bop;
import X.C2K0;
import X.C30725C4b;
import X.C31220CNc;
import X.C32364Cn2;
import X.C32647Crb;
import X.C37203Eit;
import X.C39214FaE;
import X.C44999HlL;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C72242sW;
import X.C72818Shy;
import X.C73943T0h;
import X.C75832TpU;
import X.C76052yf;
import X.C76265TwT;
import X.C76280Twi;
import X.C76433TzB;
import X.C76442TzK;
import X.C76450TzS;
import X.C76455TzX;
import X.C76457TzZ;
import X.C76466Tzi;
import X.C78528Urs;
import X.C78847Ux1;
import X.C78926UyI;
import X.C7MY;
import X.C8HI;
import X.CFX;
import X.CN1;
import X.EnumC76178Tv4;
import X.EnumC76330TxW;
import X.EnumC76461Tzd;
import X.InterfaceC29405BgP;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.RunnableC76460Tzc;
import X.TBT;
import X.UCK;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCriticalDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSmokeDebuffTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateCriticalEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateEffectEnterAnimationChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemTeamMateSmokeEffectTimeLeft;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemCardLynxUrlSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MatchItemAssem extends UISlotAssem implements InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public DataChannel LJLLI;
    public boolean LJLLILLLL;
    public Room LJLLJ;
    public C29701Eo LJLLL;
    public C29701Eo LJLLLL;
    public long LJLLLLLL;
    public BattleItem4FEModel LJLZ;
    public BattleItem4FEModel LJZ;
    public final String LJZI;
    public final String LJZL;
    public final int LL;
    public final int LLD;
    public final ARunnableS49S0100000_13 LLF;
    public final ARunnableS49S0100000_13 LLFF;
    public boolean LLFFF;
    public final ConcurrentLinkedDeque<ItemInfo4FE> LLFII;
    public long LLFZ;
    public long LLI;
    public long LLIFFJFJJ;
    public long LLII;
    public long LLIIII;
    public long LLIIIILZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.dbl;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        InterfaceC55235Lm3 LJIIZILJ;
        C0NB.LJ("MatchItemAssem", "onDestory");
        C15610jN.LIZLLL(this.LLFF);
        C15610jN.LIZLLL(this.LLF);
        this.LLFZ = -1L;
        this.LLI = -1L;
        this.LLIFFJFJJ = -1L;
        this.LLII = -1L;
        C29701Eo c29701Eo = this.LJLLLL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        C29701Eo c29701Eo2 = this.LJLLLL;
        if (c29701Eo2 != null) {
            c29701Eo2.setAlpha(0.0f);
        }
        this.LJLZ = null;
        this.LJZ = null;
        this.LLFFF = false;
        this.LLFII.clear();
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIILL(LJIIZILJ, IMatchItemAbility.class, null);
    }

    public MatchItemAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(MatchItemViewModel.class);
        this.LJLJLLL = new C214298b3(new AqS162S0100000_12(LIZ, 61), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C76466Tzi.INSTANCE, LIZ);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, C76450TzS.class, null), checkSupervisorPrepared());
        MatchItemCardLynxUrlSetting matchItemCardLynxUrlSetting = MatchItemCardLynxUrlSetting.INSTANCE;
        this.LJZI = matchItemCardLynxUrlSetting.getMatchItemsShortTouch();
        this.LJZL = matchItemCardLynxUrlSetting.getMatchItemsGuide();
        this.LL = C15380j0.LIZ(40.0f);
        this.LLD = C15380j0.LIZ(15.0f);
        this.LLF = new ARunnableS49S0100000_13(this, 49);
        this.LLFF = new ARunnableS49S0100000_13(this, 50);
        this.LLFII = new ConcurrentLinkedDeque<>();
        this.LLFZ = -1L;
        this.LLI = -1L;
        this.LLIFFJFJJ = -1L;
        this.LLII = -1L;
        this.LLIIII = -1L;
        this.LLIIIILZ = -1L;
    }

    public final void M3(boolean z) {
        Object obj;
        Object obj2;
        C29701Eo c29701Eo;
        float f;
        if (this.LJLLLL == null) {
            return;
        }
        DataChannel dataChannel = this.LJLLI;
        Float f2 = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleSmokeDebuffChannel.class);
        } else {
            obj = null;
        }
        if (obj == EnumC76461Tzd.EFFECTING) {
            return;
        }
        DataChannel dataChannel2 = this.LJLLI;
        if (dataChannel2 != null) {
            obj2 = dataChannel2.kv0(BattleStateChannel.class);
        } else {
            obj2 = null;
        }
        if (obj2 != EnumC76178Tv4.START) {
            C29701Eo c29701Eo2 = this.LJLLLL;
            if (c29701Eo2 == null) {
                return;
            }
            c29701Eo2.setVisibility(8);
            return;
        }
        float f3 = 0.0f;
        if (!z) {
            C29701Eo c29701Eo3 = this.LJLLLL;
            if (c29701Eo3 != null) {
                f2 = Float.valueOf(c29701Eo3.getAlpha());
            }
            if (o.LIZJ(f2, 0.0f)) {
                return;
            }
        } else if (z && (c29701Eo = this.LJLLLL) != null && c29701Eo.getAlpha() >= 0.5f) {
            return;
        }
        if (z) {
            C29701Eo c29701Eo4 = this.LJLLLL;
            if (c29701Eo4 != null) {
                c29701Eo4.setVisibility(0);
            }
            C29701Eo c29701Eo5 = this.LJLLLL;
            if (c29701Eo5 != null) {
                c29701Eo5.setAlpha(0.0f);
            }
            C15490jB.LJIIL(this.LJLLLL, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_interaction_demand_2"), "match_blood_smoke_anim.zip", "images", true, null, null, 96);
            C0NB.LIZIZ("MatchItemAssem", "Self_Smoke_show_start");
            C29701Eo c29701Eo6 = this.LJLLLL;
            if (c29701Eo6 != null) {
                c29701Eo6.setRepeatCount(-1);
            }
        } else {
            C0NB.LIZIZ("MatchItemAssem", "Self_Smoke_show_end");
            UCK uck = UCK.SMOKE_CARD;
            C76457TzZ.LJFF(0L, uck.getValue(), this.LJLLILLLL);
            C76457TzZ.LIZLLL(uck.getValue(), this.LJLLILLLL);
        }
        C29701Eo c29701Eo7 = this.LJLLLL;
        if (c29701Eo7 != null) {
            f = c29701Eo7.getAlpha();
        } else {
            f = 0.0f;
        }
        if (z) {
            f3 = 0.5f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("self smoke effect---->>>>startAlpha = ");
        LIZ.append(f);
        LIZ.append(" end =");
        LIZ.append(f3);
        C0NB.LJIIIZ("MatchItemHealthbar", X1D.LIZIZ(LIZ));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLLL, (Property<C29701Eo, Float>) View.ALPHA, f, f3);
        ofFloat.setDuration(530L);
        ofFloat.start();
    }

    public final void N3(boolean z) {
        Object obj;
        float f;
        long j;
        Float f2;
        C29701Eo c29701Eo = this.LJLLLL;
        if (c29701Eo == null) {
            return;
        }
        float f3 = 1.0f;
        if (z && o.LIZJ(Float.valueOf(c29701Eo.getAlpha()), 1.0f)) {
            return;
        }
        Object obj2 = null;
        if (!z) {
            C29701Eo c29701Eo2 = this.LJLLLL;
            if (c29701Eo2 != null) {
                f2 = Float.valueOf(c29701Eo2.getAlpha());
            } else {
                f2 = null;
            }
            if (o.LIZJ(f2, 0.0f)) {
                return;
            }
        }
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            C29701Eo c29701Eo3 = this.LJLLLL;
            if (c29701Eo3 == null) {
                return;
            }
            c29701Eo3.setVisibility(8);
            return;
        }
        if (z) {
            C29701Eo c29701Eo4 = this.LJLLLL;
            if (c29701Eo4 != null) {
                c29701Eo4.setVisibility(0);
            }
            C29701Eo c29701Eo5 = this.LJLLLL;
            if (c29701Eo5 != null) {
                c29701Eo5.setAlpha(0.0f);
            }
            C15490jB.LJIIL(this.LJLLLL, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_interaction_demand_2"), "match_blood_smoke_anim.zip", "images", true, null, null, 96);
            C29701Eo c29701Eo6 = this.LJLLLL;
            if (c29701Eo6 != null) {
                c29701Eo6.setRepeatCount(-1);
            }
            C0NB.LJIIIZ("MatchItemHealthbar", "init smoke lottie");
        } else {
            UCK uck = UCK.SMOKE_CARD;
            C76457TzZ.LJFF(0L, uck.getValue(), this.LJLLILLLL);
            C76457TzZ.LIZLLL(uck.getValue(), this.LJLLILLLL);
        }
        C29701Eo c29701Eo7 = this.LJLLLL;
        if (c29701Eo7 != null) {
            f = c29701Eo7.getAlpha();
        } else {
            f = 0.0f;
        }
        if (!z) {
            f3 = 0.0f;
        }
        DataChannel dataChannel2 = this.LJLLI;
        if (dataChannel2 != null) {
            obj2 = dataChannel2.kv0(BattleSmokeCardEffectChannel.class);
        }
        if (obj2 == EnumC76461Tzd.EFFECTING) {
            j = 260;
            if (!z) {
                f3 = 0.5f;
            }
        } else {
            j = 530;
        }
        C0NB.LJIIIZ("MatchItemHealthbar", "show Appear Animation---");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLLLL, (Property<C29701Eo, Float>) View.ALPHA, f, f3);
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    public final void P3(C76442TzK c76442TzK) {
        int i;
        long j;
        String str;
        IMessageManager iMessageManager;
        LinkMicBattleItemCard linkMicBattleItemCard = new LinkMicBattleItemCard();
        boolean z = true;
        if (c76442TzK.LIZ == 1) {
            i = 10;
        } else {
            i = 20;
        }
        linkMicBattleItemCard.msgType = i;
        linkMicBattleItemCard.isLocalInsertMsg = true;
        CommonMessageData commonMessageData = new CommonMessageData();
        Room room = this.LJLLJ;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        commonMessageData.createTime = System.currentTimeMillis();
        commonMessageData.messageId = System.currentTimeMillis();
        linkMicBattleItemCard.baseMessage = commonMessageData;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.insertMessage(linkMicBattleItemCard);
        }
        C0NB.LIZIZ("MatchItemAssem", "send mvp award show public screen ");
        C75832TpU c75832TpU = C75832TpU.LIZ;
        int i2 = c76442TzK.LIZ;
        long j2 = c76442TzK.LIZIZ;
        long j3 = c76442TzK.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_inviter_id", String.valueOf(C75832TpU.LJIILLIIL()));
        linkedHashMap.put("user_type", "user");
        linkedHashMap.put("match_item_type", C1JD.LJII(i2));
        linkedHashMap.put("pk_id", String.valueOf(j2));
        linkedHashMap.put("channel_id", String.valueOf(j3));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (str = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
            str = "";
        }
        linkedHashMap.put("user_id", str);
        if (C76265TwT.LJIILJJIL != EnumC76330TxW.MATCH_TYPE_2V2) {
            z = false;
        }
        if (z) {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_mvp_get_match_item_notice_show", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_mvp_get_match_item_notice_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U3(String str) {
        Object obj;
        ItemInfo4FE poll;
        T t;
        StringBuilder LIZIZ = C25620zW.LIZIZ("Call fissssssss source = ", str, " & selfUseAnimating = ");
        LIZIZ.append(this.LLFFF);
        LIZIZ.append(" & waitingAnimatingList.isEmpty() = ");
        LIZIZ.append(this.LLFII.isEmpty());
        C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZIZ));
        if (this.LLFFF || this.LLFII.isEmpty()) {
            return;
        }
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START || (poll = this.LLFII.poll()) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("waiting List size  111111 = ");
        LIZ.append(this.LLFII.isEmpty());
        LIZ.append(" & iteminFoType = ");
        LIZ.append(poll);
        C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ));
        this.LLFFF = true;
        ImageModel imageModel = poll.avatarThumb;
        C68322mC c68322mC = new C68322mC();
        if (poll.itemType == 1) {
            t = "use_match_item_baoji_1st.zip";
        } else {
            t = "use_match_item_smoke_1st.zip";
        }
        c68322mC.element = t;
        C72242sW c72242sW = new C72242sW();
        if (poll.isTeamMate) {
            DataChannel dataChannel2 = this.LJLLI;
            if (dataChannel2 != null) {
                dataChannel2.rv0(BattleItemTeamMateEffectEnterAnimationChannel.class, new C76433TzB(30L, poll, false));
            }
            c72242sW.element = 1130L;
        }
        String rM = ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).rM(imageModel);
        o.LJIIIIZZ(rM, "getService(IHostFrescoHe…ageFilePath(senderAvatar)");
        Bitmap decodeFile = BitmapFactory.decodeFile(rM);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ddl, null, false);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.m1p);
        textView.setGravity(17);
        textView.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        LLLLIILL.measure(View.MeasureSpec.makeMeasureSpec(this.LL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLD, 1073741824));
        LLLLIILL.layout(0, 0, LLLLIILL.getMeasuredWidth(), LLLLIILL.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(LLLLIILL.getWidth(), LLLLIILL.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(LLLLIILL, canvas);
        C29701Eo c29701Eo = this.LJLLL;
        if (c29701Eo != null) {
            c29701Eo.postDelayed(new RunnableC76460Tzc(this, c68322mC, poll, c72242sW, imageModel, decodeFile, createBitmap), c72242sW.element);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC55235Lm3 LJIIZILJ;
        long j;
        User owner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C0NB.LJ("MatchItemAssem", "bind Ability");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        Room room = null;
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIJJI(LJIIZILJ, (MatchItemViewModel) this.LJLJLLL.getValue(), IMatchItemAbility.class, null);
        this.LJLLL = (C29701Eo) view.findViewById(R.id.f5s);
        this.LJLLLL = (C29701Eo) view.findViewById(R.id.f4j);
        view.findViewById(R.id.g7d);
        this.LJLLI = ((C76450TzS) this.LJLL.getValue()).LJLILLLLZI;
        this.LJLLILLLL = ((C76450TzS) this.LJLL.getValue()).LJLIL;
        DataChannel dataChannel = ((C76450TzS) this.LJLL.getValue()).LJLILLLLZI;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        }
        this.LJLLJ = room;
        if (room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        this.LJLLLLLL = j;
        DataChannel dataChannel2 = this.LJLLI;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, BattleTimeLeftChannel.class, new AqS179S0100000_13(this, 213));
            dataChannel2.lv0(this, BattleStateChannel.class, new AqS179S0100000_13(this, 214));
        }
        selectSubscribe(r5, new TBT() { // from class: X.TzM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C76439TzH) obj).LJLJJL;
            }
        }, new TBT() { // from class: X.TzN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C76439TzH) obj).LJLIL;
            }
        }, new TBT() { // from class: X.TzO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C76439TzH) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.TzP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C76439TzH) obj).LJLJI;
            }
        }, new TBT() { // from class: X.TzQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C76439TzH) obj).LJLJJI;
            }
        }, C213688a4.LIZIZ(((AssemViewModel) this.LJLJLLL.getValue()).usedInReusedScene), null, new C76455TzX(this));
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 2142927800) {
            return null;
        }
        return (MatchItemViewModel) this.LJLJLLL.getValue();
    }

    public static void L3(Integer num, Long l) {
        C73943T0h.LIZ().LIZIZ(new C32647Crb(num, l));
    }

    public final void H3(int i, BattleItem4FEModel battleItem4FEModel) {
        Long l;
        List<ItemInfo4FE> list;
        long j;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BattleTimeLeftChannel.class)) != null) {
            long longValue = l.longValue();
            if (longValue < 1) {
                C0NB.LJ("MatchItemAssem", "PK left time too late");
                return;
            }
            List<ItemInfo4FE> list2 = battleItem4FEModel.itemList;
            if (list2 != null && !list2.isEmpty() && (list = battleItem4FEModel.itemList) != null) {
                Integer valueOf = Integer.valueOf(list.size());
                if (valueOf != null) {
                    ItemInfo4FE itemInfo4FE = (ItemInfo4FE) ListProtector.get(list, valueOf.intValue() - 1);
                    if (itemInfo4FE != null) {
                        long j2 = itemInfo4FE.effectStartTimeSec;
                        if (itemInfo4FE != null) {
                            j = itemInfo4FE.effectLastDuration;
                        } else {
                            j = 30;
                        }
                        long j3 = j2 + j;
                        if (j3 <= 30 || C30725C4b.LIZIZ() / 1000 > j3) {
                            return;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            this.LLIFFJFJJ = longValue - (j3 - (C30725C4b.LIZIZ() / 1000));
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("calculateBuffCountDownSceond ---->>>smokeBuffEndInPKTime = ");
                            LIZ.append(this.LLIFFJFJJ);
                            C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ));
                            if (this.LLIFFJFJJ >= 0) {
                                return;
                            }
                            this.LLIFFJFJJ = 0L;
                            return;
                        }
                        this.LLII = longValue - (j3 - (C30725C4b.LIZIZ() / 1000));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("calculateBuffCountDownSceond ---->>>criticalBuffEndInPKTime = ");
                        LIZ2.append(this.LLII);
                        C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ2));
                        if (this.LLII >= 0) {
                            return;
                        }
                        this.LLII = 0L;
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void O3(int i, BattleItem4FEModel battleItem4FEModel) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        User owner;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("initalizeShortTouch short Touch ", i, "  & cardModel Json = ");
        Gson gson = C09650Zl.LIZIZ;
        LJ.append(GsonProtectorUtils.toJson(gson, battleItem4FEModel));
        C0NB.LIZIZ("MatchItemAssem", X1D.LIZIZ(LJ));
        String str5 = this.LJZI;
        if (i == 1) {
            str = "shortTouchMatchItemsStrike";
        } else {
            str = "shortTouchMatchItemsSmoke";
        }
        Uri.Builder appendQueryParameter = UriProtector.parse(str5).buildUpon().appendQueryParameter("initial_data", GsonProtectorUtils.toJson(gson, battleItem4FEModel));
        C76280Twi c76280Twi = C76265TwT.LIZ;
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("pk_id", String.valueOf(c76280Twi.LIZIZ())).appendQueryParameter("channel_id", String.valueOf(c76280Twi.LIZJ()));
        Room room = this.LJLLJ;
        if (room == null || (owner = room.getOwner()) == null || (str2 = C278817o.LIZIZ(owner)) == null) {
            str2 = "";
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("anchor_id", str2);
        if (this.LJLLILLLL) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("user_type", str3);
        String str6 = "1";
        if (this.LJLLILLLL) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("is_anchor", str4);
        if (C76265TwT.LJIILJJIL != EnumC76330TxW.MATCH_TYPE_2V2) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri uri = appendQueryParameter5.appendQueryParameter("is_team_match", str6).build();
        IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
        Context context = getContext();
        o.LJIIIIZZ(uri, "uri");
        C31220CNc FX = iShortTouchService.FX(context, uri, str, true);
        if (FX != null) {
            ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).B10(FX, null);
        }
    }

    public final void W3(int i, BattleItem4FEModel battleItem4FEModel) {
        Object obj;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("update short Touch ", i, "  & cardModel Json = ");
        Gson gson = C09650Zl.LIZIZ;
        LJ.append(GsonProtectorUtils.toJson(gson, battleItem4FEModel));
        C0NB.LIZIZ("MatchItemAssem", X1D.LIZIZ(LJ));
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(new JSONObject(GsonProtectorUtils.toJson(gson, battleItem4FEModel))), "EVENT_MATCH_ITEM_UPDATE"));
    }

    public final void I3(int i, long j, ItemInfo4FE itemInfo4FE) {
        Long l;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BattleTimeLeftChannel.class)) != null) {
            long longValue = l.longValue();
            if (longValue < 1) {
                C0NB.LJ("MatchItemAssem", "PK left time too late");
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                long j2 = this.LLFZ;
                if (j2 < 0) {
                    this.LLFZ = longValue - j;
                } else {
                    this.LLFZ = j2 - j;
                }
                DataChannel dataChannel2 = this.LJLLI;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(BattleItemSmokeDebuffTimeLeft.class, new C76433TzB(j, itemInfo4FE, true));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("calculateBuffCountDownSceond ---->>>smokeDebuffEndInPKTime = ");
                LIZ.append(this.LLFZ);
                LIZ.append(" countDownSecond = ");
                LIZ.append(j);
                C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ));
                return;
            }
            long j3 = this.LLI;
            if (j3 < 0) {
                this.LLI = longValue - j;
            } else {
                this.LLI = j3 - j;
            }
            DataChannel dataChannel3 = this.LJLLI;
            if (dataChannel3 != null) {
                dataChannel3.rv0(BattleItemCriticalDebuffTimeLeft.class, new C76433TzB(j, itemInfo4FE, true));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("calculateBuffCountDownSceond ---->>>criticalDebuffEndInPKTime = ");
            LIZ2.append(this.LLI);
            LIZ2.append(" countDownSecond = ");
            LIZ2.append(j);
            C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ2));
        }
    }

    public final void K3(int i, ItemInfo4FE itemInfo4FE, boolean z) {
        Long l;
        long LIZIZ;
        long j;
        long j2;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BattleTimeLeftChannel.class)) != null) {
            long longValue = l.longValue();
            long j3 = 1;
            if (longValue < 1) {
                C0NB.LJ("MatchItemAssem", "PK left time too late");
                return;
            }
            if (itemInfo4FE.effectStartTimeSec * 1000 >= C30725C4b.LIZIZ()) {
                LIZIZ = itemInfo4FE.effectLastDuration;
            } else {
                LIZIZ = itemInfo4FE.effectLastDuration - ((C30725C4b.LIZIZ() - (itemInfo4FE.effectStartTimeSec * 1000)) / 1000);
                j3 = 1;
            }
            if (LIZIZ <= j3) {
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                long j4 = this.LLIIII;
                if (j4 < 0) {
                    j2 = longValue - LIZIZ;
                } else {
                    j2 = j4 - LIZIZ;
                }
                this.LLIIII = j2;
                DataChannel dataChannel2 = this.LJLLI;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(BattleItemTeamMateSmokeEffectTimeLeft.class, new C76433TzB(LIZIZ, itemInfo4FE, z));
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("calculateBuffCountDownSceond ---->>>smokeDebuffEndInPKTime = ");
                LIZ.append(this.LLIIII);
                LIZ.append(" countDownSecond = ");
                LIZ.append(LIZIZ);
                C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ));
                return;
            }
            long j5 = this.LLIIIILZ;
            if (j5 < 0) {
                j = longValue - LIZIZ;
            } else {
                j = j5 - LIZIZ;
            }
            this.LLIIIILZ = j;
            DataChannel dataChannel3 = this.LJLLI;
            if (dataChannel3 != null) {
                dataChannel3.rv0(BattleItemTeamMateCriticalEffectTimeLeft.class, new C76433TzB(LIZIZ, itemInfo4FE, z));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("calculateBuffCountDownSceond ---->>>criticalTeamMateEndInPKTime = ");
            LIZ2.append(this.LLIIIILZ);
            LIZ2.append(" countDownSecond = ");
            LIZ2.append(LIZIZ);
            C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ2));
        }
    }

    public final void Q3(ItemInfo4FE itemInfo4FE, long j, long j2) {
        User user;
        String str;
        String str2;
        User owner;
        C32364Cn2 c32364Cn2 = new C32364Cn2(this.LJZL);
        c32364Cn2.LIZIZ(this.LJLLLLLL, "anchor_id");
        c32364Cn2.LIZJ("video_id", BJM.LJIJ());
        Room room = this.LJLLJ;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        c32364Cn2.LIZJ("anchor_name", C05170If.LIZ(user));
        c32364Cn2.LIZ(itemInfo4FE.itemType, "item_type");
        c32364Cn2.LIZIZ(itemInfo4FE.itemMultiple, "multiple");
        c32364Cn2.LIZIZ(itemInfo4FE.itemProbabilityLow, "probability_low");
        c32364Cn2.LIZIZ(itemInfo4FE.itemProbabilityHigh, "probability_high");
        c32364Cn2.LIZIZ(j, "pk_id");
        c32364Cn2.LIZIZ(j2, "channel_id");
        c32364Cn2.LIZJ("is_team_match", String.valueOf(itemInfo4FE.isTeamMatch));
        Room room2 = this.LJLLJ;
        if (room2 == null || (owner = room2.getOwner()) == null || (str = C278817o.LIZIZ(owner)) == null) {
            str = "";
        }
        c32364Cn2.LIZJ("anchor_id", str);
        if (this.LJLLILLLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c32364Cn2.LIZJ("is_anchor", str2);
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(getContext(), parse);
    }

    public static void R3(Bitmap roundedBitmap, C04750Gp c04750Gp, boolean z, boolean z2) {
        if (c04750Gp != null) {
            if (z2) {
                c04750Gp.LJI = null;
            } else {
                if (roundedBitmap == null) {
                    return;
                }
                if (z) {
                    roundedBitmap = C44999HlL.LIZ(roundedBitmap);
                }
                o.LJIIIIZZ(roundedBitmap, "roundedBitmap");
                c04750Gp.LJI = C78847Ux1.LJJL(c04750Gp.LIZ, c04750Gp.LIZIZ, roundedBitmap);
            }
        }
    }
}
