package X;

import Y.AfS62S0200000_13;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostInviteListFragment;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.platform.core.LinkerManager;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TsR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76015TsR extends AbstractC75977Trp {
    public List<? extends Room> LLFFF;
    public List<? extends Room> LLFII;
    public List<? extends Room> LLFZ;
    public List<? extends Room> LLI;
    public java.util.Map<Long, ? extends RivalsListsData.TopHostInfo> LLIFFJFJJ;
    public boolean LLII;
    public int LLIIII;
    public final HashSet<Long> LLIIIILZ;
    public RivalsListsData.BannerText LLIIIJ;
    public boolean LLIIIL;
    public final C73318Sq2 LLIIIZ;
    public long LLIIJI;
    public long LLIIJLIL;
    public C76035Tsl LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public boolean LLIIZ;
    public List<? extends Room> LLIL;
    public CohostTopic LLILII;

    @InterfaceC75558Tl4(name = "LINKER_MANAGER")
    public LinkerManager mLinkerManager;

    @Override // X.AbstractC75977Trp
    public final boolean LJIJJ() {
        if (!C32151Nz.LJJIIJZLJL(this.LLFFF) || !C32151Nz.LJJIIJZLJL(this.LLFII)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC75977Trp, com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LIZIZ() {
        super.LIZIZ();
        C75893TqT.LJIIJJI = false;
        DataChannel dataChannel = this.LJZI;
        dataChannel.getClass();
        dataChannel.jv0(this);
        this.LLIIIZ.LIZLLL();
    }

    public static final boolean LJJIFFI(long j) {
        boolean z;
        boolean z2;
        C75883TqJ LJJZ = C8E.LIZLLL().LJJZ(j, true);
        if (LJJZ != null) {
            z = LJJZ.LJ();
        } else {
            z = false;
        }
        C75883TqJ LJJZ2 = C8E.LIZLLL().LJJZ(j, false);
        if (LJJZ2 != null) {
            z2 = LJJZ2.LJ();
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC76019TsV
    public final void LJFF(int i) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        this.LLF.LIZLLL();
        C75893TqT.LJIIJJI = false;
        C75642TmQ.LIZJ.clear();
        EnumC55972Lxw enumC55972Lxw = EnumC55972Lxw.OLD;
        o.LJIIIZ(enumC55972Lxw, "<set-?>");
        this.LJZ = enumC55972Lxw;
        C75877TqD.LJIIIIZZ = AbstractC75977Trp.LJIJ();
        String clientLogId = C75877TqD.LJIIIIZZ;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null && multiCoHostInviteListContract$AbsView.LJLJJLL) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIZ = z;
        if (multiCoHostInviteListContract$AbsView != null) {
            j = multiCoHostInviteListContract$AbsView.LJLJJI;
        } else {
            j = 0;
        }
        this.LLIIJI = j;
        if (multiCoHostInviteListContract$AbsView != null) {
            j2 = multiCoHostInviteListContract$AbsView.LJLJJL;
        } else {
            j2 = 0;
        }
        this.LLIIJLIL = j2;
        String str = B5G.LIZIZ().LJLI;
        if (str != null && str.length() != 0) {
            if (B5G.LIZIZ().LJLIIIL) {
                String str2 = B5G.LIZIZ().LJLI;
                if (str2 != null) {
                    j5 = CastLongProtector.parseLong(str2);
                } else {
                    j5 = 0;
                }
                this.LLIIJI = j5;
                this.LLIIZ = true;
            } else {
                String str3 = B5G.LIZIZ().LJLI;
                if (str3 != null) {
                    j4 = CastLongProtector.parseLong(str3);
                } else {
                    j4 = 0;
                }
                this.LLIIJLIL = j4;
            }
        }
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        LIZIZ.LJLI = null;
        LIZIZ.LJLIIIL = false;
        LIZIZ.LJLIIL = null;
        C58418MwI.LIZLLL.LJIIIZ("fetch_rivals_data", null);
        C75878TqE c75878TqE = new C75878TqE();
        o.LJIIIZ(clientLogId, "clientLogId");
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "client_log_id", clientLogId, true);
        c75878TqE.LJIILLIIL("fetch_rivals_request");
        C75878TqE c75878TqE2 = new C75878TqE();
        CoHostApi coHostApi = (CoHostApi) TTL.LIZ(CoHostApi.class, "get().getService(CoHostApi::class.java)");
        if (room != null) {
            j3 = room.getId();
        } else {
            j3 = 0;
        }
        ((InterfaceC29856Bng) C1EW.LIZ(C29554Bio.LIZ(coHostApi, j3, i, Calendar.getInstance().getTimeZone().getID(), Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000, this.LLIIJI, this.LL, this.LLIIJLIL, this.LJZ.getVersion(), clientLogId)).LIZJ(LIZ())).LIZJ(new AfS62S0200000_13(this, c75878TqE2, 69), new AfS62S0200000_13(this, c75878TqE2, 70));
    }

    @Override // X.AbstractC76019TsV
    public final void LJIILL(EnumC76039Tsp inviteListType) {
        o.LJIIIZ(inviteListType, "inviteListType");
        int i = this.LJLJJLL;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        int i3 = this.LJLJJL;
        int i4 = 0;
        while (i4 < i3) {
            this.LJLLILLLL.remove(i2);
            i4++;
            i2--;
        }
        this.LJLJJLL = i2 + 1;
        this.LJLJJI = true;
    }

    @Override // X.AbstractC76019TsV
    public final void LJIILLIIL(EnumC76039Tsp inviteListType) {
        o.LJIIIZ(inviteListType, "inviteListType");
        int i = this.LJLJJLL - 1;
        int size = this.LLFFF.size();
        for (int i2 = this.LLIIII; i2 < size; i2++) {
            if (i2 < this.LLFFF.size()) {
                Room room = (Room) ListProtector.get(this.LLFFF, i2);
                RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) C279417u.LIZ(room, this.LLD);
                if (rivalExtraInfo != null) {
                    RivalsListsData.TopHostInfo topHostInfo = (RivalsListsData.TopHostInfo) C279417u.LIZ(room, this.LLIFFJFJJ);
                    if (topHostInfo == null) {
                        topHostInfo = RivalsListsData.TopHostInfo.LIZ;
                    }
                    o.LJIIIIZZ(topHostInfo, "mTopHostInfos[it.id] ?: …stsData.TopHostInfo.EMPTY");
                    C76035Tsl c76035Tsl = new C76035Tsl(room, topHostInfo, EnumC75614Tly.FOLLOW_INVITE, rivalExtraInfo, this.LJZL, EnumC76024Tsa.IDLE);
                    C75893TqT.LIZ(c76035Tsl);
                    i++;
                    this.LJLLILLLL.add(i, c76035Tsl);
                }
            }
        }
        this.LJLJJLL = i + 1;
        this.LJLJJI = false;
    }

    public final void LJJ(EnumC76028Tse enumC76028Tse) {
        C74900TaS c74900TaS;
        if (this.LLIIJLIL != 0 && !this.LLIIZ && enumC76028Tse == EnumC76028Tse.TYPE_RECOMMEND_TITLE) {
            this.LLIILZL = this.LJLLILLLL.size();
        }
        CJ2 cj2 = this.LJLLILLLL;
        EnumC76028Tse enumC76028Tse2 = EnumC76028Tse.TYPE_FRIEND_TITLE;
        if (enumC76028Tse == enumC76028Tse2) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.knb);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_comment_friends)");
            c74900TaS = new C74900TaS(LJIILJJIL, -1);
        } else {
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lzm);
            o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_invitelist_suggested)");
            c74900TaS = new C74900TaS(LJIILJJIL2, -1);
        }
        cj2.add(c74900TaS);
        if (this.LLIIJI != 0 && this.LLIIZ && enumC76028Tse == enumC76028Tse2) {
            this.LLIILII = this.LJLLILLLL.size();
        }
    }

    public final void LJJI(EnumC76025Tsb enumC76025Tsb) {
        List<? extends Room> list;
        List<? extends Room> list2;
        EnumC75614Tly enumC75614Tly;
        C75981Trt c76034Tsk;
        Boolean bool;
        EnumC76025Tsb enumC76025Tsb2 = EnumC76025Tsb.TYPE_FRIEND_USER;
        if (enumC76025Tsb == enumC76025Tsb2) {
            if (this.LLIIII < this.LLFFF.size()) {
                this.LJLJJI = true;
                this.LJLJJL = this.LLFFF.size() - this.LLIIII;
            }
            list = ORZ.LLILLL(this.LLFFF, this.LLIIII);
        } else if (enumC76025Tsb == EnumC76025Tsb.TYPE_RECOMMEND_USER) {
            list = this.LLFII;
        } else if (enumC76025Tsb == EnumC76025Tsb.TYPE_BEST_TEAMMATE_USER) {
            list = this.LLIL;
        } else {
            list = this.LLI;
        }
        EnumC76024Tsa enumC76024Tsa = EnumC76024Tsa.IDLE;
        if (enumC76025Tsb == enumC76025Tsb2) {
            list2 = this.LLFFF;
        } else {
            list2 = this.LLFII;
        }
        Room room = (Room) ORZ.LJLLLLLL(0, list2);
        if (enumC76025Tsb == enumC76025Tsb2 && room != null && this.LLIIJI == room.getOwnerUserId()) {
            enumC76024Tsa = EnumC76024Tsa.TOP_LIVING_FRIEND;
        } else if (enumC76025Tsb == EnumC76025Tsb.TYPE_RECOMMEND_USER && room != null && this.LLIIJLIL == room.getOwnerUserId()) {
            enumC76024Tsa = EnumC76024Tsa.TOP_LIVING_RECOMMEND;
        }
        if (this.LLIIJLIL != 0 && !this.LLIIZ && enumC76025Tsb == EnumC76025Tsb.TYPE_RECOMMEND_USER) {
            this.LLIILII = this.LJLLILLLL.size();
        }
        CJ2 cj2 = this.LJLLILLLL;
        for (Room room2 : list) {
            RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) C279417u.LIZ(room2, this.LLD);
            if (rivalExtraInfo != null) {
                if (this.LL) {
                    enumC75614Tly = EnumC75614Tly.MIC_ROOM_INVITE;
                } else if (enumC76025Tsb == EnumC76025Tsb.TYPE_FRIEND_USER) {
                    enumC75614Tly = EnumC75614Tly.FOLLOW_INVITE;
                } else if (enumC76025Tsb == EnumC76025Tsb.TYPE_RECOMMEND_USER) {
                    enumC75614Tly = EnumC75614Tly.RECOMMEND_INVITE;
                } else if (enumC76025Tsb == EnumC76025Tsb.TYPE_BEST_TEAMMATE_USER) {
                    enumC75614Tly = EnumC75614Tly.BEST_TEAMMATE_INVITE;
                } else {
                    enumC75614Tly = EnumC75614Tly.PAIRING_INVITE;
                }
                if (!this.LLIIIILZ.contains(Long.valueOf(room2.getOwnerUserId()))) {
                    RivalsListsData.TopHostInfo topHost = (RivalsListsData.TopHostInfo) C279417u.LIZ(room2, this.LLIFFJFJJ);
                    if (topHost == null) {
                        topHost = RivalsListsData.TopHostInfo.LIZ;
                    }
                    EnumC76024Tsa enumC76024Tsa2 = EnumC76024Tsa.IDLE;
                    if (enumC76024Tsa != enumC76024Tsa2 && this.LJLLLL) {
                        o.LJIIIIZZ(topHost, "topHost");
                        C76035Tsl c76035Tsl = new C76035Tsl(room2, topHost, enumC75614Tly, rivalExtraInfo, this.LJZL, enumC76024Tsa);
                        C75893TqT.LIZ(c76035Tsl);
                        this.LLIIL = c76035Tsl;
                        c76035Tsl.LJLLI = LJJIFFI(room2.getOwnerUserId());
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("fillUserList,  item.isCancelBySelf = ");
                        C76035Tsl c76035Tsl2 = this.LLIIL;
                        if (c76035Tsl2 != null) {
                            bool = Boolean.valueOf(c76035Tsl2.LJLLI);
                        } else {
                            bool = null;
                        }
                        LIZ.append(bool);
                        C0NB.LJIIIZ("CoHostInviteListPresenter", X1D.LIZIZ(LIZ));
                        enumC76024Tsa = enumC76024Tsa2;
                    } else {
                        int i = C75733Tnt.LIZ[enumC75614Tly.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                o.LJIIIIZZ(topHost, "topHost");
                                c76034Tsk = new C76035Tsl(room2, topHost, enumC75614Tly, rivalExtraInfo, this.LJZL, enumC76024Tsa);
                                C75893TqT.LIZ(c76034Tsk);
                            } else {
                                o.LJIIIIZZ(topHost, "topHost");
                                c76034Tsk = new C76036Tsm(room2, topHost, enumC75614Tly, rivalExtraInfo, this.LJZL, enumC76024Tsa);
                            }
                        } else {
                            o.LJIIIIZZ(topHost, "topHost");
                            c76034Tsk = new C76034Tsk(room2, topHost, enumC75614Tly, rivalExtraInfo, this.LJZL, enumC76024Tsa);
                        }
                        c76034Tsk.LJLLI = LJJIFFI(room2.getOwnerUserId());
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("fillUserList,  item.isCancelBySelf = ");
                        LIZ2.append(c76034Tsk.LJLLI);
                        C0NB.LJIIIZ("CoHostInviteListPresenter", X1D.LIZIZ(LIZ2));
                        cj2.add(c76034Tsk);
                    }
                }
            }
        }
    }

    public C76015TsR(MultiCoHostInviteListFragment multiCoHostInviteListFragment, DataChannel dataChannel) {
        super(multiCoHostInviteListFragment, dataChannel);
        C75559Tl5.LIZIZ.LIZLLL(this);
        dataChannel.mv0(MultiCoHostCountDownEvent.class, this, new AqS179S0100000_13(this, 592));
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LLFFF = c61878OQg;
        this.LLFII = c61878OQg;
        this.LLFZ = c61878OQg;
        this.LLI = c61878OQg;
        this.LLIFFJFJJ = C113554cx.LJJJLIIL();
        this.LLIIIILZ = new HashSet<>();
        new HashSet();
        this.LLIIIZ = new C73318Sq2();
        this.LLIILII = -1;
        this.LLIL = c61878OQg;
    }
}
