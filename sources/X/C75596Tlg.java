package X;

import Y.AfS65S0100000_13;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.TopicQuitEvent;
import com.bytedance.android.live.liveinteract.api.TopicSetEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.AudioPunishEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostAudienceAreaExpandChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStreamStatsEvent;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiSubSceneTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiHostGiftTrayOptForHostSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.TopicSetContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tlg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75596Tlg extends AbstractC31497CXt<InterfaceC75599Tlj> implements OnMessageListener, InterfaceC75451TjL {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public Room LJLJI;
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final C31657Cbd LJLJJL = new C31657Cbd("LINK_MESSAGE_CENTER");
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C75606Tlq.LJLIL);
    public final AqS195S0100000_13 LJLJL = new AqS195S0100000_13(this, 73);
    public final C75605Tlp LJLJLJ = C75605Tlp.LJLIL;

    static {
        TBT tbt = new TBT(C75596Tlg.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        U8O LJJIIZI;
        IMessageManager iMessageManager;
        C0NB.LJIIIZ("MultiCoHostPresenter", "detachView");
        this.LJLILLLLZI = true;
        if (this.LJLIL) {
            C75621Tm5.LJIIIIZZ();
        } else {
            C75621Tm5.LJIIJJI();
        }
        ((LinkCrossRoomDataHolder) this.LJLJJLL.getValue()).LJIIIIZZ(false);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLJJI.LIZLLL();
        C8E.LIZLLL().LJZI(C75607Tlr.class, this.LJLJL);
        if (this.LJLIL && C8E.LIZLLL().LLII().atLeast(EnumC75620Tm4.Prepared)) {
            C8E.LIZLLL().LJLLJ(new OLX("leave_with_detach_view", 0L, 62), null);
        }
        C8E.LIZLLL().LLF();
        LJJJJJ("detachView");
        C74597TPl.LIZ();
        RandomLinkMicManager.LIZJ(true);
        C75650TmY.LJ();
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) this.LJLJJL.LIZ(this, LJLJLLL[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.jv0(this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        if (LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI = LJJIJL.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
            LJJIIZI.setPlayerInfoProvider(C75185Tf3.LIZ);
        }
        super.detachView();
    }

    public static void LJJJJJL(boolean z) {
        RtcUserInfo LLLLLJIL;
        String linkMicId;
        InterfaceC75441TjB LJJIJL;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC75441TjB LJJIJL2 = C8E.LIZLLL().LJJIJL();
        if (LJJIJL2 != null && (LLLLLJIL = LJJIJL2.LLLLLJIL()) != null && (linkMicId = LLLLLJIL.getLinkMicId()) != null && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LLIIJLIL = LJJIJL.LLIIJLIL()) != null) {
            LLIIJLIL.LJFF(linkMicId, z);
        }
    }

    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC75599Tlj interfaceC75599Tlj) {
        boolean z;
        Room room;
        InterfaceC75441TjB LJJIJL;
        U8H LJJZZI;
        U8O LJJIIZI;
        Boolean bool;
        IMessageManager iMessageManager;
        super.attachView((C75596Tlg) interfaceC75599Tlj);
        C0NB.LJIIIZ("MultiCoHostPresenter", "attachView");
        this.LJLILLLLZI = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLIL = z;
        ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).oT();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            room = (Room) dataChannel3.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJI = room;
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) this.LJLJJL.LIZ(this, LJLJLLL[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(this);
        }
        MultiCohostAreaExpandSetting.INSTANCE.setLastCohostLayoutId("");
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.mv0(MultiCoHostStateChannel.class, this, new AqS179S0100000_13(this, 594));
            dataChannel4.ov0((LifecycleOwner) this.mView, MuteMicChannel.class, new AqS179S0100000_13(this, 595));
            dataChannel4.lv0((LifecycleOwner) this.mView, TopicSetEvent.class, new AqS179S0100000_13(this, 596));
            dataChannel4.lv0((LifecycleOwner) this.mView, TopicQuitEvent.class, new AqS179S0100000_13(this, 597));
            dataChannel4.lv0((LifecycleOwner) this.mView, BattleStateChannel.class, new AqS179S0100000_13(this, 598));
            dataChannel4.lv0((LifecycleOwner) this.mView, CoHostAudienceAreaExpandChannel.class, new AqS179S0100000_13(this, 599));
            dataChannel4.lv0((LifecycleOwner) this.mView, MultiCoHostStreamStatsEvent.class, new AqS179S0100000_13(this, 600));
        }
        DataChannelGlobal.LJLJJI.pv0(AudioPunishEvent.class, this, new AqS179S0100000_13(this, 601));
        C8E.LIZLLL().LJJJZ(C75607Tlr.class, this.LJLJL);
        C8E.LIZLLL().LJJJZ(C56882Lc.class, this.LJLJLJ);
        if (this.LJLIL && LinkMicSeiSubSceneTechSwitchSetting.INSTANCE.enable() && (LJJIJL = C8E.LIZLLL().LJJIJL()) != null && (LJJZZI = LJJIJL.LJJZZI()) != null && (LJJIIZI = LJJZZI.LJJIIZI()) != null) {
            LJJIIZI.setPlayerInfoProvider(new C75184Tf2(this));
        }
    }

    public final void LJJJJI(boolean z) {
        C74735TUt c74735TUt;
        C74735TUt c74735TUt2;
        if (!LiveMultiHostGiftTrayOptSetting.INSTANCE.isOptimizeMultiHost()) {
            C0NB.LJIIIZ("live_host_change", "dealCoHostSceneGiftPanelChange return");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" Sei lastLayoutId = ");
        MultiCohostAreaExpandSetting multiCohostAreaExpandSetting = MultiCohostAreaExpandSetting.INSTANCE;
        LIZ.append(multiCohostAreaExpandSetting.getLastCohostLayoutId());
        C0NB.LJIIIZ("live_host_change", X1D.LIZIZ(LIZ));
        if (this.LJLIL && !multiCohostAreaExpandSetting.getValue() && !MultiHostGiftTrayOptForHostSetting.INSTANCE.isEnable()) {
            return;
        }
        int size = C8E.LIZLLL().LJIILJJIL().size();
        QZP.LIZJ("host count is ", size, "live_host_change");
        Boolean bool = null;
        if (size >= 3) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (c74735TUt2 = (C74735TUt) dataChannel.kv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class)) != null) {
                bool = Boolean.valueOf(c74735TUt2.LJLIL);
            }
            if (C29306Beo.LJIILLIIL(bool) || z) {
                C0NB.LJIIIZ("live_host_change", "more than 2");
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C74735TUt(true, 2));
                    return;
                }
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (c74735TUt = (C74735TUt) dataChannel3.kv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class)) != null) {
            bool = Boolean.valueOf(c74735TUt.LJLIL);
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            return;
        }
        C0NB.LJIIIZ("live_host_change", "less than 3");
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 == null) {
            return;
        }
        dataChannel4.rv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C74735TUt(false, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJJ(String str) {
        Room room;
        String str2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        String str3;
        Object[] objArr6;
        Long l;
        FP1.LJFF("unloadModule, source = ", str, "MultiCoHostPresenter");
        InterfaceC75599Tlj interfaceC75599Tlj = (InterfaceC75599Tlj) this.mView;
        if (interfaceC75599Tlj != null) {
            interfaceC75599Tlj.XA();
        }
        long j = 0;
        String str4 = "1";
        if (this.LJLIL) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                C75642TmQ c75642TmQ = C75642TmQ.LIZ;
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                if (LIZIZ.LJJJJLL) {
                    C75642TmQ.LJIJJLI().clear();
                    if (LIZIZ.LJJIIZI > 0) {
                        if (LIZIZ.LJJLIL != 0) {
                            User owner = room.getOwner();
                            if (owner != null) {
                                j = owner.getId();
                            }
                            c75642TmQ.LJJII(j, "left");
                        } else if (!B5G.LIZIZ().LJL.isEmpty()) {
                            List<Long> list = B5G.LIZIZ().LJL;
                            ArrayList arrayList = new ArrayList();
                            for (Long l2 : list) {
                                Long l3 = l2;
                                long ownerUserId = room.getOwnerUserId();
                                if (l3 == null || l3.longValue() != ownerUserId) {
                                    arrayList.add(l2);
                                }
                            }
                            if ((!arrayList.isEmpty()) && (l = (Long) ListProtector.get(arrayList, 0)) != null) {
                                C75642TmQ.LIZ.LJJII(l.longValue(), "left");
                            }
                        }
                    }
                    LIZIZ.LJJJJLL = false;
                    HashMap hashMap = new HashMap();
                    C75642TmQ.LJII(c75642TmQ, hashMap);
                    C75642TmQ.LJIIZILJ(c75642TmQ, hashMap);
                    C32039Chn c32039Chn = new C32039Chn();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - LIZIZ.LJJIJ;
                    if (LIZIZ.LJJIIZI > 0) {
                        elapsedRealtime = SystemClock.elapsedRealtime() - LIZIZ.LJJIIZI;
                    }
                    long j2 = elapsedRealtime / 1000;
                    c32039Chn.LIZJ = String.valueOf(j2);
                    hashMap.put("connection_type", "anchor");
                    String LJIJJ = C75642TmQ.LJIJJ();
                    o.LJIIIIZZ(LJIJJ, "getConnectionType()");
                    hashMap.put("before_connection_status", LJIJJ);
                    hashMap.put("invited_room_id", String.valueOf(LIZIZ.LJIIIIZZ));
                    hashMap.put("connection_inviter_id", String.valueOf(LIZIZ.LJJLIIIJL));
                    hashMap.put("connection_invitee_id", String.valueOf(LIZIZ.LJJLIIIJLJLI));
                    LIZIZ.LJJLIIIJLJLI = 0L;
                    LIZIZ.LJJLIIIJL = 0L;
                    String label = B5G.LIZIZ().LJJJLIIL.getLabel();
                    EnumC75672Tmu enumC75672Tmu = EnumC75672Tmu.IDLE;
                    if (!o.LJ(label, enumC75672Tmu.getLabel())) {
                        hashMap.put("anchor_type", label);
                    } else if (!o.LJ(B5G.LIZIZ().LJJJLZIJ, enumC75672Tmu.getLabel())) {
                        hashMap.put("anchor_type", B5G.LIZIZ().LJJJLZIJ);
                    }
                    if (!TextUtils.isEmpty(C75642TmQ.LJIJJ)) {
                        hashMap.put("request_id", C75642TmQ.LJIJJ);
                    }
                    if (B5G.LIZIZ().LJJIJL) {
                        str2 = "positive_over";
                    } else {
                        str2 = "negative_over";
                    }
                    hashMap.put("over_type", str2);
                    if (B5G.LIZIZ().LJJIJLIJ) {
                        hashMap.put("is_live_end", "1");
                    }
                    C75545Tkr.LIZLLL(hashMap, B5G.LIZIZ().LJIIJ, !o.LJ(label, EnumC75672Tmu.INVITEE.getLabel()));
                    if (j2 > 10) {
                        objArr = "1";
                    } else {
                        objArr = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_effective_connection", objArr);
                    hashMap.put("connection_duration", String.valueOf(elapsedRealtime));
                    hashMap.put("event_type", String.valueOf(B5G.LIZIZ().LJIIJ.getType()));
                    C75545Tkr.LJFF(hashMap);
                    C75642TmQ.LIZJ(hashMap);
                    C75642TmQ.LJIIZILJ(c75642TmQ, hashMap);
                    hashMap.put("current_connection_cnts", String.valueOf(B5G.LIZIZ().LJL.size()));
                    hashMap.put("uid_list", B5G.LIZIZ().LJL.toString());
                    B5G.LIZIZ().LJL = C61878OQg.INSTANCE;
                    String str5 = "";
                    if (B5G.LIZIZ().LJIIL) {
                        String str6 = B5G.LIZIZ().LJJLIIIIJ;
                        B5G.LIZIZ().LJJLIIIIJ = "";
                        B5G.LIZIZ().LJJLIIIJ = "";
                        B5G.LIZIZ().LJJLIIIJILLIZJL = false;
                        if (str6 != null && o.LJ(str6, String.valueOf(B5G.LIZIZ().LJI))) {
                            objArr6 = "1";
                        } else {
                            objArr6 = CardStruct.IStatusCode.DEFAULT;
                        }
                        hashMap.put("is_icon_show_anchor", objArr6);
                    }
                    ((HashMap) B5G.LIZIZ().LJJZZIII).clear();
                    long j3 = LIZIZ.LJFF;
                    if (j3 != 0) {
                        hashMap.put("channel_id", String.valueOf(j3));
                    }
                    String str7 = B5G.LIZIZ().LJJLI;
                    if (str7 != null) {
                        str5 = str7;
                    }
                    hashMap.put("log_id", str5);
                    hashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
                    if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
                        objArr2 = "1";
                    } else {
                        objArr2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_quick_recommend", objArr2);
                    if (B5G.LIZIZ().LJJLJLI) {
                        objArr3 = "1";
                    } else {
                        objArr3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("for_lineup_end", objArr3);
                    if (B5G.LIZIZ().LJJLJLI) {
                        if (!BM1.LIZIZ) {
                            str3 = "1";
                        } else {
                            str3 = "2";
                        }
                        hashMap.put("lineup_end_type", str3);
                    }
                    if (B5G.LIZIZ().LJJLL) {
                        objArr4 = "1";
                    } else {
                        objArr4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_lineup_start", objArr4);
                    if (B5G.LIZIZ().LJJZ) {
                        objArr5 = "1";
                    } else {
                        objArr5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_lineup_end", objArr5);
                    if (o.LJ(label, EnumC75672Tmu.INVITER.getLabel()) || o.LJ(label, EnumC75672Tmu.APPLY.getLabel())) {
                        hashMap.put("click_time", C44432HcC.LJIIIIZZ().getType());
                    }
                    if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVED_INVITE || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVATION_BUBBLE_INVITE) {
                        if (!C75893TqT.LJFF) {
                            str4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        hashMap.put("is_reservation_sender", str4);
                    }
                    if (C75893TqT.LJI != 0) {
                        if (C76265TwT.LIZ.LJ() == EnumC76178Tv4.PUNISH) {
                            C75893TqT.LJIIIIZZ = C75893TqT.LJI;
                        }
                        hashMap.put("reservation_id", String.valueOf(C75893TqT.LJI));
                    }
                    long j4 = C75893TqT.LJII;
                    if (j4 != 0) {
                        hashMap.put("pk_mapping_id", String.valueOf(j4));
                        C75893TqT.LJII = 0L;
                    }
                    C75642TmQ.LJIJ(hashMap);
                    hashMap.put("topic_hot_single_score", String.valueOf(C75633TmH.LJFF));
                    C75642TmQ.LJIILLIIL(hashMap, LIZIZ.LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
                    C75642TmQ.LJIIJJI(hashMap);
                    hashMap.put("overload_score", C1H.LJ());
                    BZI LIZ = C28787BRn.LIZ("connection_over");
                    BZJ bzj = LIZ.LIZ;
                    if (bzj != null) {
                        bzj.LIZLLL(c32039Chn);
                    }
                    LIZ.LJJIFFI(hashMap);
                    LIZ.LJIIZILJ();
                    LIZ.LJJIIJZLJL();
                }
                C0NB.LIZIZ("LiveInteractFeatureCollector", "onCoHostEnd");
                if (C75597Tlh.LIZJ == 0 && C75597Tlh.LIZLLL == 0) {
                    C20940ry.LIZ(C75597Tlh.LIZ(), "match_invite_during_co_host_result", new JSONObject().putOpt("proposed_two_match_times", 0).putOpt("proposed_multi_match_times", 0), 2, 8);
                }
                C75597Tlh.LIZJ = 0;
                C75597Tlh.LIZLLL = 0;
            }
            CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
            if (cohostTopic != null) {
                C75642TmQ.LJJIJIL(EnumC75598Tli.DISCONNECT.getValue(), cohostTopic.totalHeat, C75633TmH.LJII);
            }
        } else {
            C75642TmQ.LJJJJI(SystemClock.elapsedRealtime() - C75585TlV.LIZ, this.LJLJI);
            long j5 = B5G.LIZIZ().LJFF;
            Room room2 = this.LJLJI;
            if (C75585TlV.LIZ > 0) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - C75585TlV.LIZ;
                C75585TlV.LIZ = -1L;
                C75585TlV.LIZ();
                B5G.LIZIZ();
                List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIILJJIL, 10));
                Iterator<C75883TqJ> it = LJIILJJIL.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(it.next().LIZ));
                }
                BZI LIZ2 = C28787BRn.LIZ("connection_watch_duration");
                LIZ2.LJIIJJI("live_detail");
                LIZ2.LJIIIZ("live");
                LIZ2.LJIIL("other");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(arrayList2.toString(), "uid_list");
                LIZ2.LJIJJ(Integer.valueOf(arrayList2.size()), "current_connection_cnts");
                long j6 = 1000;
                LIZ2.LJIJJ(String.valueOf(elapsedRealtime2 / j6), "watch_connection_duration");
                LIZ2.LJIJJ("anchor", "connection_type");
                LIZ2.LJIJJ(String.valueOf(C75585TlV.LIZJ.getFirst().longValue() / j6), "multi_connection_watch_duration");
                LIZ2.LJIJJ(String.valueOf(C75585TlV.LIZIZ.getFirst().longValue() / j6), "double_connection_watch_duration");
                LIZ2.LJIJJ(C1H.LJ(), "overload_score");
                LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
                long j7 = LinkCrossRoomDataHolder.LJLJJI;
                if (j7 != 0) {
                    LIZ2.LJIJJ(String.valueOf(j7), "channel_id");
                } else if (j5 != 0) {
                    LIZ2.LJIJJ(Long.valueOf(j5), "channel_id");
                }
                LinkCrossRoomDataHolder.LJLJJI = 0L;
                if (arrayList2.size() == 2) {
                    LIZ2.LJIJJ(ListProtector.get(arrayList2, 1), "right_user_id");
                }
                if (!((IMicRoomService) CN1.LIZ(IMicRoomService.class)).jT(room2)) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.LJIJJ(str4, "is_lineup_status");
                HashMap hashMap2 = new HashMap();
                C75642TmQ.LJIILIIL(hashMap2);
                hashMap2.put("is_two_apply_two", String.valueOf(C8E.LIZLLL().q3() ? 1 : 0));
                LIZ2.LJJIFFI(hashMap2);
                C75585TlV.LIZJ = new OSZ<>(0L, -1L);
                C75585TlV.LIZIZ = new OSZ<>(0L, -1L);
                C75585TlV.LIZ = -1L;
                C75585TlV.LIZLLL = 0;
                LIZ2.LJJIIJZLJL();
            }
        }
        C75633TmH.LIZ();
        C73943T0h.LIZ().LIZIZ(new C75514TkM());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof PerceptionMessage) {
            C1Z.LIZIZ((PerceptionMessage) iMessage, new AqS179S0100000_13(this, 602), null);
        }
    }

    @Override // X.InterfaceC75451TjL
    public final void r8(CohostTopicMessage message) {
        long j;
        Long l;
        o.LJIIIZ(message, "message");
        long LJJLI = C8E.LIZLLL().LJJLI();
        TopicSetContent topicSetContent = message.topicSetContent;
        if (topicSetContent != null && topicSetContent.action == 0) {
            CohostTopic cohostTopic = message.topic;
            if (cohostTopic != null) {
                Long valueOf = Long.valueOf(cohostTopic.id);
                CohostTopic cohostTopic2 = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(Long.valueOf(LJJLI));
                if (cohostTopic2 != null) {
                    l = Long.valueOf(cohostTopic2.id);
                } else {
                    l = null;
                }
                if (valueOf.equals(l)) {
                    return;
                }
            }
            TopicSetContent topicSetContent2 = message.topicSetContent;
            if (topicSetContent2 != null) {
                j = topicSetContent2.setSuccTime;
            } else {
                j = 0;
            }
            if (j < C75633TmH.LIZIZ) {
                return;
            }
        }
        ((InterfaceC75599Tlj) this.mView).r8(message);
    }

    @Override // X.InterfaceC75451TjL
    public final void u2(CohostTopicMessage message) {
        o.LJIIIZ(message, "message");
        ((InterfaceC75599Tlj) this.mView).u2(message);
    }

    public static void LJJJJIZL(C75596Tlg c75596Tlg, EnumC75601Tll enumC75601Tll, long j, long j2, long j3, int i) {
        long j4 = j2;
        long j5 = j3;
        if ((i & 4) != 0) {
            j4 = 0;
        }
        if ((i & 8) != 0) {
            j5 = 0;
        }
        if (!c75596Tlg.LJLIL) {
            return;
        }
        c75596Tlg.LJLJJI.LIZ(C1EW.LIZ(((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).topicSet(enumC75601Tll.getValue(), j, C8E.LIZLLL().LJJLI(), j4, j5)).LJJJLIIL(new AfS65S0100000_13(enumC75601Tll, 228), new AfS65S0100000_13(enumC75601Tll, 229)));
    }
}
