package X;

import Y.AfS57S0100000_5;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.AudienceInProfileListChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.LiveBoostCardFreshChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveUpdateMemberCountFromAudienceRankSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceShowNumberOptSetting;
import com.bytedance.android.livesdk.livesetting.rank.TtliveAudienceRankingEntranceNumberThresholdSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.Contributor;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.rank.impl.OnlineCountChannel;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CXy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31502CXy implements OnMessageListener, InterfaceC06060Lq {
    public final DataChannel LJLIL;
    public CYK LJLILLLLZI;
    public C73411SrX LJLJI;
    public C73411SrX LJLJJI;
    public C73411SrX LJLJJL;
    public int LJLJL;
    public boolean LJLLI;
    public boolean LJLLJ;
    public boolean LJLLLL;
    public Room LJLLLLLL;
    public boolean LJLJJLL = true;
    public long LJLJLJ = 2;
    public final List<CV6> LJLJLLL = new ArrayList();
    public OnlineRankConfig LJLL = new OnlineRankConfig(false, false, false, 0, false, 31, null);
    public boolean LJLLILLLL = true;
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 446));
    public final C73318Sq2 LJLZ = new C73318Sq2();
    public boolean LJZ = true;
    public final boolean LJZI = OnlineAudienceShowNumberOptSetting.INSTANCE.getValue();

    public final void LIZJ() {
        this.LJLJJLL = true;
        this.LJLZ.LIZLLL();
        this.LJLILLLLZI = null;
        IMessageManager iMessageManager = (IMessageManager) this.LJLIL.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        LJFF(0);
        ((ArrayList) this.LJLJLLL).clear();
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJJI;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        C73411SrX c73411SrX3 = this.LJLJJL;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
        }
        this.LJLL = new OnlineRankConfig(false, false, false, 0, false, 31, null);
        CY0.LIZLLL = 0L;
        CY0.LJ = 0L;
        CY0.LJFF = 0L;
        CY0.LJI = 0L;
        CY0.LIZ = false;
        CY0.LIZIZ = true;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Integer, O] */
    public final void LIZIZ() {
        boolean z;
        boolean z2;
        int i;
        String str;
        boolean z3;
        Object obj;
        String str2;
        String str3;
        try {
            if (this.LJLILLLLZI != null) {
                if (this.LJLLI) {
                    if (this.LJLLILLLL && this.LJLJL <= 0) {
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                    this.LJLJJLL = false;
                    if (!((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Xc(this.LJLLLLLL)) {
                        z = false;
                    } else if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
                        z = true;
                    } else {
                        z = this.LJLL.onlinePanelShow;
                    }
                    if (z) {
                        if (LiveUpdateMemberCountFromAudienceRankSetting.INSTANCE.getValue()) {
                            Integer num = (Integer) this.LJLIL.kv0(C28401BCr.class);
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = 0;
                            }
                            int i2 = this.LJLJL;
                            if (i != i2) {
                                ((C32537Cpp) this.LJLIL.gv0(C28401BCr.class)).LIZ = Integer.valueOf(i2);
                            }
                        }
                        CYK cyk = this.LJLILLLLZI;
                        if (cyk != null) {
                            cyk.LJJLIIIJJIZ(this.LJLJL);
                        }
                        if (this.LJLLILLLL) {
                            DataChannel dataChannel = this.LJLIL;
                            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_active_user_rank_show", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                                LinkedHashMap LIZ = C0JU.LIZ("rank_position", "top_right");
                                if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                                    str = "anchor";
                                } else {
                                    str = "user";
                                }
                                LIZ.put("user_type", str);
                                CYO boostChartInfo = ((IGiftService) CN1.LIZ(IGiftService.class)).getBoostChartInfo();
                                if (boostChartInfo != null && boostChartInfo.LIZJ) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                String str4 = CardStruct.IStatusCode.DEFAULT;
                                if (z3) {
                                    obj = "1";
                                } else {
                                    obj = CardStruct.IStatusCode.DEFAULT;
                                }
                                LIZ.put("boost_card_effective", obj);
                                if (o.LJ("top_right", "top_right")) {
                                    str4 = "-1";
                                } else if (C28652BMi.LIZIZ(dataChannel) == 2) {
                                    str4 = "1";
                                }
                                LIZ.put("is_ranking_turn_off", str4);
                                BZI LIZ2 = C28787BRn.LIZ("livesdk_active_user_rank_show");
                                LIZ2.LJJIFFI(LIZ);
                                if (!o.LJ("top_right", "top_right") && !C29306Beo.LJIIJ(dataChannel) && C28652BMi.LIZIZ(dataChannel) == 2) {
                                    str2 = "ranking_turned_off";
                                } else {
                                    str2 = "null";
                                }
                                LIZ2.LJIJJ(str2, "bottom_bar_content");
                                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                                    LIZ2.LJIILLIIL(dataChannel);
                                    LIZ2.LJJIIJZLJL();
                                } else {
                                    LIZ2.LJJIJ();
                                    LIZ2.LJI();
                                    LIZ2.LJIJJ(BJM.LJLIL.LIZJ(), "live_type");
                                    C28246B6s LJIJI = BJM.LJIJI();
                                    if (LJIJI == null || (str3 = LJIJI.LIZ) == null) {
                                        str3 = "";
                                    }
                                    LIZ2.LJIJJ(str3, "event_page");
                                    LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
                                    LIZ2.LJJIIZI();
                                }
                            }
                        }
                    } else {
                        CYK cyk2 = this.LJLILLLLZI;
                        if (cyk2 != null) {
                            cyk2.LJJLIIIJ();
                        }
                    }
                    if (LJ()) {
                        if (C28652BMi.LIZIZ(this.LJLIL) == 2) {
                            if (C28652BMi.LIZLLL != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.LJLLJ = z2;
                            C28652BMi.LIZLLL = 0L;
                            C28652BMi.LJ = 0L;
                        }
                        CYK cyk3 = this.LJLILLLLZI;
                        if (cyk3 != null) {
                            cyk3.LJLLI();
                        }
                        this.LJLIL.rv0(AudienceInProfileListChannel.class, this.LJLJLLL);
                        CYK cyk4 = this.LJLILLLLZI;
                        if (cyk4 != null) {
                            cyk4.LJJIJLIJ(this.LJLLJ, this.LJZ, this.LJLJLLL);
                        }
                        this.LJLLJ = false;
                        this.LJZ = true;
                    } else {
                        CYK cyk5 = this.LJLILLLLZI;
                        if (cyk5 != null) {
                            cyk5.LJIJJ();
                        }
                    }
                    this.LJLLILLLL = false;
                    return;
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
        }
    }

    public final void LIZLLL() {
        long j;
        long j2;
        try {
            Room room = (Room) this.LJLIL.kv0(RoomChannel.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            Room room2 = (Room) this.LJLIL.kv0(RoomChannel.class);
            if (room2 != null) {
                j2 = room2.getOwnerUserId();
            } else {
                j2 = 0;
            }
            if (j != 0 && j2 != 0) {
                if (CY0.LIZLLL == 0) {
                    CY0.LIZLLL = System.currentTimeMillis();
                }
                if (this.LJZI) {
                    this.LJLJJL = (C73411SrX) C1EW.LIZ(((RankApi) Q7L.LIZIZ(RankApi.class)).getOnlineRoomPCU(j, j2)).LJJJLIIL(new AfS57S0100000_5(this, 385), new InterfaceC64592gB() { // from class: X.9Dm
                        @Override // X.InterfaceC64592gB
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        }
                    });
                }
                this.LJLJI = (C73411SrX) C1EW.LIZ(((RankApi) Q7L.LIZIZ(RankApi.class)).getOnlineRankList(j, j2, 1, true)).LJJJLIIL(new AfS57S0100000_5(this, 383), new AfS57S0100000_5(this, 384));
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    public final boolean LJ() {
        if (!this.LJLLLL || C15380j0.LJIJ(C15380j0.LJIIL()) <= 320.0f || !((Boolean) this.LJLLL.getValue()).booleanValue() || !this.LJLL.avatarShow) {
            return false;
        }
        return true;
    }

    public C31502CXy(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Integer, O] */
    public final void LIZ(CYK view) {
        boolean z;
        int i;
        LifecycleOwner lifecycleOwner;
        long j;
        long j2;
        RoomAuthStatus roomAuthStatus;
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = view;
        Room room = (Room) this.LJLIL.kv0(RoomChannel.class);
        this.LJLLLLLL = room;
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableViewers()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL = z;
        IMessageManager iMessageManager = (IMessageManager) this.LJLIL.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.USER_SEQ.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
        }
        if (this.LJZI) {
            Room room2 = (Room) this.LJLIL.kv0(RoomChannel.class);
            if (room2 != null) {
                j2 = room2.roomPcu;
            } else {
                j2 = 0;
            }
            i = (int) j2;
        } else {
            Room room3 = (Room) this.LJLIL.kv0(RoomChannel.class);
            if (room3 != null) {
                i = room3.getUserCount();
            } else {
                i = 0;
            }
        }
        LJFF(i);
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).c20(this.LJLJL);
        ((C32537Cpp) this.LJLIL.gv0(C28401BCr.class)).LIZ = Integer.valueOf(i);
        CYK cyk = this.LJLILLLLZI;
        if (cyk != null) {
            cyk.LJJJJLI(this.LJLL.scoreShow);
        }
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        CYK cyk2 = this.LJLILLLLZI;
        if (cyk2 instanceof LifecycleOwner) {
            o.LJII(cyk2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            lifecycleOwner = (LifecycleOwner) cyk2;
        } else {
            lifecycleOwner = null;
        }
        this.LJLIL.ov0(lifecycleOwner, LowDevicePerfScalableChannel.class, new AqS171S0100000_5(this, 896));
        this.LJLJJI = (C73411SrX) C265112h.LIZ(AbstractC73672Svk.LJJIJIIJI(2L, TimeUnit.SECONDS)).LJJJJZI(new AfS57S0100000_5(this, 381));
        Room room4 = this.LJLLLLLL;
        if (room4 != null) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).KX(room4.getId(), this);
        }
        this.LJLIL.ov0(lifecycleOwner, LiveBoostCardFreshChannel.class, new AqS171S0100000_5(this, 897));
        if (!this.LJZI) {
            this.LJLIL.lv0(lifecycleOwner, OnlineCountChannel.class, new AqS171S0100000_5(this, 898));
        }
        Boolean bool = (Boolean) this.LJLIL.kv0(UserIsAnchorChannel.class);
        if (bool == null || !bool.booleanValue()) {
            C29162BcU c29162BcU = C29162BcU.LIZJ;
            B7I b7i = c29162BcU.LIZIZ;
            if (b7i != null && b7i.LIZ != null && b7i != null) {
                long j3 = b7i.LIZIZ;
                Room room5 = this.LJLLLLLL;
                if (room5 != null) {
                    j = room5.getId();
                } else {
                    j = 0;
                }
                if (j3 == j) {
                    if (CY0.LJFF == 0) {
                        CY0.LJFF = System.currentTimeMillis();
                    }
                    B7I b7i2 = c29162BcU.LIZIZ;
                    if (b7i2 != null) {
                        C31503CXz c31503CXz = new C31503CXz(this);
                        C32201Oe c32201Oe = b7i2.LIZJ;
                        if (c32201Oe != null) {
                            c31503CXz.LIZ(c32201Oe);
                        } else {
                            b7i2.LIZLLL.add(c31503CXz);
                        }
                    }
                }
            }
            LIZLLL();
        } else {
            LIZLLL();
        }
        this.LJLZ.LIZ(C73943T0h.LIZ().LJ(CYQ.class).LJJJJZI(new AfS57S0100000_5(this, 382)));
    }

    public final void LJFF(int i) {
        this.LJLJJLL = true;
        this.LJLJL = i;
    }

    public final void LJI(int i) {
        LJFF(i);
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).c20(this.LJLJL);
        C29121Bbp.LIZLLL = i;
    }

    @Override // X.InterfaceC06060Lq
    public final void LJJIJ(boolean z) {
        CYK cyk;
        if (!z && (cyk = this.LJLILLLLZI) != null) {
            cyk.LJLJLLL();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, O] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        boolean z2;
        if (iMessage instanceof RoomUserSeqMessage) {
            try {
                if (((RoomUserSeqMessage) iMessage).mContributors != null) {
                    RoomUserSeqMessage message = (RoomUserSeqMessage) iMessage;
                    o.LJIIIZ(message, "message");
                    if (message.mContributors != null) {
                        CY4.LJFF = System.currentTimeMillis();
                        CY4.LIZJ.LIZ.clear();
                        Iterator<Contributor> it = message.mContributors.iterator();
                        while (it.hasNext()) {
                            User user = it.next().mUser;
                            if (user != null) {
                                CY4.LIZJ.LIZ.add(user);
                            }
                        }
                        CY4.LIZJ.getClass();
                    }
                    C29121Bbp.LIZLLL = (int) message.mTotal;
                    ArrayList arrayList = new ArrayList();
                    List<Contributor> list = message.mContributors;
                    o.LJIIIIZZ(list, "message.mContributors");
                    List<Contributor> LLILLL = ORZ.LLILLL(ORZ.LJLL(list), this.LJLL.avatarNumber);
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLILLL, 10));
                    for (Contributor contributor : LLILLL) {
                        if (contributor.mUser == null) {
                            return;
                        }
                        boolean LJIIJ = C29306Beo.LJIIJ(this.LJLIL);
                        User user2 = contributor.mUser;
                        o.LJIIIIZZ(user2, "contributor.mUser");
                        arrayList2.add(new CV6(user2, contributor.mScore, contributor.mRank, "", 0L, LJIIJ));
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                    if (!C29306Beo.LJIIJ(this.LJLIL)) {
                        List<Contributor> list2 = message.mContributors;
                        o.LJIIIIZZ(list2, "message.mContributors");
                        List LJLL = ORZ.LJLL(list2);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = ((ArrayList) LJLL).iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (((Contributor) next).mUser != null) {
                                arrayList3.add(next);
                            }
                        }
                        Iterator it4 = arrayList3.iterator();
                        boolean z3 = false;
                        int i = 0;
                        while (it4.hasNext()) {
                            Contributor contributor2 = (Contributor) it4.next();
                            if (contributor2.mScore > 0) {
                                i++;
                            }
                            User user3 = contributor2.mUser;
                            if (user3 != null && user3.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                                long j = C28652BMi.LIZLLL;
                                long j2 = contributor2.mRank;
                                if (j != j2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.LJLLJ = z2;
                                C28652BMi.LIZLLL = j2;
                                C28652BMi.LJ = contributor2.mScore;
                                z3 = true;
                            }
                            int i2 = OnlineAudienceDisplayStrategySetting.INSTANCE.getValue().displayNumberN + 2;
                            if (this.LJZ) {
                                long j3 = contributor2.mRank;
                                if (1 <= j3 && j3 <= i2) {
                                    CYP LIZ = CYP.LIZ();
                                    long j4 = contributor2.mScore;
                                    long j5 = contributor2.mRank;
                                    if (LIZ.LIZ == null || ((ArrayList) r0).size() < j5 || j5 < 1 || ((Contributor) ListProtector.get(LIZ.LIZ, ((int) j5) - 1)).mScore != j4) {
                                        this.LJZ = false;
                                    }
                                }
                            }
                        }
                        if (!z3) {
                            if (C28652BMi.LIZLLL != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.LJLLJ = z;
                            C28652BMi.LIZLLL = 0L;
                            C28652BMi.LJ = 0L;
                        }
                        CYP.LIZ().LIZ = arrayList3;
                        CYP.LIZ().LIZIZ = i;
                    }
                    ((C32537Cpp) this.LJLIL.gv0(C28401BCr.class)).LIZ = Integer.valueOf((int) message.mTotal);
                    int i3 = (int) message.mTotal;
                    DataChannel dataChannel = this.LJLIL;
                    int i4 = this.LJLJL;
                    long messageId = message.getMessageId();
                    if (Math.abs(i3 - i4) > TtliveAudienceRankingEntranceNumberThresholdSetting.INSTANCE.getValue()) {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        CY0.LIZIZ(dataChannel, jSONObject3);
                        C05630Jz.LJFF(jSONObject3, "msg_id", messageId);
                        C05630Jz.LIZ(i4, "before_acu", jSONObject3);
                        C05630Jz.LIZ(i3, "cur_acu", jSONObject3);
                        C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
                        C0K2.LJI("ttlive_audience_ranking_number_change_error", jSONObject, jSONObject2, jSONObject4);
                    }
                    LJFF(i3);
                    ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).c20(this.LJLJL);
                    ((ArrayList) this.LJLJLLL).clear();
                    ((ArrayList) this.LJLJLLL).addAll(arrayList);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception unused) {
                return;
            }
        }
        if (iMessage instanceof RoomVerifyMessage) {
            int i5 = ((RoomVerifyMessage) iMessage).verifyAction;
            RoomAuthStatus roomAuthStatus = null;
            if (i5 == 34) {
                Room room = this.LJLLLLLL;
                if (room != null) {
                    roomAuthStatus = room.getRoomAuthStatus();
                }
                if (roomAuthStatus != null) {
                    roomAuthStatus.setEnableViewers(true);
                }
                this.LJLLLL = true;
                return;
            }
            if (i5 != 35) {
                return;
            }
            Room room2 = this.LJLLLLLL;
            if (room2 != null) {
                roomAuthStatus = room2.getRoomAuthStatus();
            }
            if (roomAuthStatus != null) {
                roomAuthStatus.setEnableViewers(false);
            }
            this.LJLLLL = false;
        }
    }
}
