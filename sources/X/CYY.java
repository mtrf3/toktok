package X;

import Y.AObjectS125S0200000_5;
import Y.AObjectS134S0100000_5;
import Y.AfS57S0100000_5;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.livesdk.dataChannel.AnchorRankEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.livesetting.rank.ECRankSupportSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.model.RankEntrance;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CYY implements OnMessageListener {
    public final Fragment LJLIL;
    public final DataChannel LJLILLLLZI;
    public final InterfaceC31506CYc LJLJI;
    public final Layer2PriorityManager LJLJJI;
    public RankEntranceWidget LJLJJL;
    public RankEntranceWidget LJLJJLL;
    public final List<C31510CYg> LJLJL;
    public final IMessageManager LJLJLJ;
    public final Room LJLJLLL;
    public final boolean LJLL;
    public boolean LJLLI;
    public final C31511CYh LJLLILLLL;

    public final void LIZ() {
        IMessageManager iMessageManager = this.LJLJLJ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.RANK_UPDATE_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LJLJLJ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.HOURLY_RANK_REWARD_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.LJLJLJ;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(EnumC31509CYf.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.LJLJLJ;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(EnumC31509CYf.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager5 = this.LJLJLJ;
        if (iMessageManager5 != null) {
            iMessageManager5.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
        }
        C72818Shy.LIZLLL("liveLastGiftRankOpen", this.LJLLILLLL);
        C72818Shy.LIZLLL("ttlive_anchor_ranking_open_event", this.LJLLILLLL);
        if (this.LJLIL.isAdded()) {
            DataChannelGlobal.LJLJJI.nv0(this, this.LJLIL, AnchorRankEvent.class, new AqS171S0100000_5(this, 887));
        }
    }

    public final boolean LIZIZ() {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
            return false;
        }
        Room room2 = this.LJLJLLL;
        if (((room2 == null || room2.getRoomAuthStatus() != null) && (room = this.LJLJLLL) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.getRankState() == 2) || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
            return false;
        }
        return true;
    }

    public final void LIZLLL() {
        Room room;
        if (this.LJLILLLLZI != null && this.LJLIL.isAdded() && (room = (Room) this.LJLILLLLZI.kv0(RoomChannel.class)) != null && room.getOwner() != null) {
            if (CYZ.LIZJ == 0) {
                CYZ.LIZJ = System.currentTimeMillis();
            }
            C1EW.LIZ(((RankApi) Q7L.LIZIZ(RankApi.class)).queryRankEntrancesV3(room.getOwner().getId(), room.getId())).LJII(BTJ.LIZIZ(this.LJLIL)).LJJJLIIL(new AfS57S0100000_5(this, 362), new AfS57S0100000_5(this, 363));
            return;
        }
        this.LJLJJI.setFirstScreenDone(true);
    }

    public final void LJ() {
        C31510CYg c31510CYg;
        C31510CYg c31510CYg2;
        RankEntranceWidget rankEntranceWidget;
        RankEntranceWidget rankEntranceWidget2;
        if (1 < ((ArrayList) this.LJLJL).size()) {
            c31510CYg = (C31510CYg) ListProtector.get(this.LJLJL, 1);
        } else {
            c31510CYg = null;
        }
        RankEntranceWidget rankEntranceWidget3 = this.LJLJJL;
        if (rankEntranceWidget3 == null) {
            if (c31510CYg != null) {
                if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue() && this.LJLJI.LIZJ() != null) {
                    RecyclableWidgetManager LIZJ = this.LJLJI.LIZJ();
                    if (LIZJ != null) {
                        rankEntranceWidget2 = (RankEntranceWidget) LIZJ.getRecyclableWidgetFromCacheOrNew(RankEntranceWidget.class, new Object[]{c31510CYg, this.LJLJJI}, new AObjectS125S0200000_5(c31510CYg, this, 2));
                        InterfaceC31506CYc interfaceC31506CYc = this.LJLJI;
                        o.LJIIIIZZ(rankEntranceWidget2, "this");
                        interfaceC31506CYc.LIZIZ(rankEntranceWidget2);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    rankEntranceWidget2 = new RankEntranceWidget(c31510CYg, this.LJLJJI);
                    this.LJLJI.LIZIZ(rankEntranceWidget2);
                }
                this.LJLJJL = rankEntranceWidget2;
            }
        } else {
            rankEntranceWidget3.LL(c31510CYg, false);
        }
        if (((ArrayList) this.LJLJL).size() > 0) {
            c31510CYg2 = (C31510CYg) ListProtector.get(this.LJLJL, 0);
        } else {
            c31510CYg2 = null;
        }
        RankEntranceWidget rankEntranceWidget4 = this.LJLJJLL;
        if (rankEntranceWidget4 == null) {
            if (c31510CYg2 != null) {
                if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue() && this.LJLJI.LIZJ() != null) {
                    RecyclableWidgetManager LIZJ2 = this.LJLJI.LIZJ();
                    if (LIZJ2 != null) {
                        rankEntranceWidget = (RankEntranceWidget) LIZJ2.getRecyclableWidgetFromCacheOrNew(RankEntranceWidget.class, new C31510CYg[]{c31510CYg2, null}, new AObjectS134S0100000_5(c31510CYg2, 5));
                        InterfaceC31506CYc interfaceC31506CYc2 = this.LJLJI;
                        o.LJIIIIZZ(rankEntranceWidget, "this");
                        interfaceC31506CYc2.LIZ(rankEntranceWidget);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    rankEntranceWidget = new RankEntranceWidget(c31510CYg2, null);
                    this.LJLJI.LIZ(rankEntranceWidget);
                }
                this.LJLJJLL = rankEntranceWidget;
                return;
            }
            return;
        }
        rankEntranceWidget4.LL(c31510CYg2, false);
    }

    public final void LJFF(List<RankEntranceV3Response.EntranceGroup> list) {
        C31510CYg c31510CYg;
        List<RankEntrance> list2;
        ((ArrayList) this.LJLJL).clear();
        for (RankEntranceV3Response.EntranceGroup entranceGroup : list) {
            RankEntranceV3Response.EntranceGroup.Data data = entranceGroup.data;
            if (data != null && data.entrances != null) {
                int i = 0;
                if (data == null || (list2 = data.entrances) == null || !list2.isEmpty()) {
                    if (entranceGroup.groupType != EnumC31514CYk.E_COMMERCE.getType() || ECRankSupportSetting.INSTANCE.getValue()) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < ((ArrayList) this.LJLJL).size()) {
                                if (((C31510CYg) ListProtector.get(this.LJLJL, i2)).LIZIZ.getType() == entranceGroup.groupType) {
                                    c31510CYg = (C31510CYg) ListProtector.get(this.LJLJL, i2);
                                    c31510CYg.LIZJ(entranceGroup);
                                    ListProtector.remove(this.LJLJL, i2);
                                    break;
                                }
                                i2++;
                            } else {
                                c31510CYg = new C31510CYg();
                                c31510CYg.LIZJ(entranceGroup);
                                break;
                            }
                        }
                        while (i < ((ArrayList) this.LJLJL).size() && c31510CYg.LIZ > ((C31510CYg) ListProtector.get(this.LJLJL, i)).LIZ) {
                            i++;
                        }
                        ListProtector.add(this.LJLJL, i, c31510CYg);
                    }
                }
            }
        }
        LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
    
        continue;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r14) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYY.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void LIZJ(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_rank_message_send");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        C06490Nh.LIZLLL(LIZ, str, "message_type", str2, "rank_type");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CYY(androidx.fragment.app.Fragment r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, X.InterfaceC31506CYc r11, com.bytedance.ies.sdk.widgets.Layer2PriorityManager r12) {
        /*
            r8 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "layer2PriorityManager"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r8.<init>()
            r8.LJLIL = r9
            r8.LJLILLLLZI = r10
            r8.LJLJI = r11
            r8.LJLJJI = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.LJLJL = r0
            r7 = 0
            if (r10 == 0) goto Ldf
            java.lang.Class<X.Bop> r0 = X.C29927Bop.class
            java.lang.Object r0 = r10.kv0(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = (com.ss.ugc.live.sdk.message.interfaces.IMessageManager) r0
        L27:
            r8.LJLJLJ = r0
            r0 = 1
            r8.LJLLI = r0
            X.CYh r0 = new X.CYh
            r0.<init>(r8)
            r8.LJLLILLLL = r0
            if (r10 == 0) goto L3e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r7 = r10.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r7
        L3e:
            r8.LJLJLLL = r7
            r3 = 0
            if (r10 == 0) goto Ldc
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r0 = r10.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Ldc
            boolean r2 = r0.booleanValue()
        L51:
            r8.LJLL = r2
            com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankQueryEntranceDelaySetting r0 = com.bytedance.android.livesdk.livesetting.rank.LiveHourlyRankQueryEntranceDelaySetting.INSTANCE
            int r1 = r0.getValue()
            if (r1 <= 0) goto Ld5
            if (r2 != 0) goto La5
        L5d:
            X.BcU r6 = X.C29162BcU.LIZJ
            X.B7I r1 = r6.LIZIZ
            if (r1 == 0) goto La1
            X.3kP r0 = r1.LIZ
            if (r0 == 0) goto La1
            if (r1 == 0) goto La1
            long r4 = r1.LIZIZ
            if (r7 == 0) goto L9e
            long r1 = r7.getId()
        L71:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto La1
            X.B7I r2 = r6.LIZIZ
            if (r2 == 0) goto L85
            X.CYV r1 = new X.CYV
            r1.<init>(r8)
            X.1Oe r0 = r2.LIZJ
            if (r0 == 0) goto L98
            r1.LIZ(r0)
        L85:
            boolean r0 = r9.isAdded()
            if (r0 == 0) goto L97
            androidx.fragment.app.FragmentManager r1 = r9.requireFragmentManager()
            X.CYa r0 = new X.CYa
            r0.<init>(r8)
            r1.LJJLIL(r0, r3)
        L97:
            return
        L98:
            java.util.ArrayList<X.B7J> r0 = r2.LIZLLL
            r0.add(r1)
            goto L85
        L9e:
            r1 = 0
            goto L71
        La1:
            r8.LIZLLL()
            goto L85
        La5:
            boolean r0 = r9.isAdded()
            if (r0 == 0) goto L85
            long r1 = (long) r1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.SrN r1 = X.AbstractC73672Svk.LJJLIIIJLJLI(r1, r0)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.Cdf r0 = X.BTJ.LIZIZ(r9)
            X.Svk r2 = r1.LJII(r0)
            Y.AfS57S0100000_5 r1 = new Y.AfS57S0100000_5
            r0 = 361(0x169, float:5.06E-43)
            r1.<init>(r8, r0)
            r2.LJJJJZI(r1)
            goto L85
        Ld5:
            if (r2 != 0) goto Ld8
            goto L5d
        Ld8:
            r8.LIZLLL()
            goto L85
        Ldc:
            r2 = 0
            goto L51
        Ldf:
            r0 = r7
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYY.<init>(androidx.fragment.app.Fragment, com.bytedance.ies.sdk.datachannel.DataChannel, X.CYc, com.bytedance.ies.sdk.widgets.Layer2PriorityManager):void");
    }
}
