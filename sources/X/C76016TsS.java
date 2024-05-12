package X;

import Y.AfS62S0200000_13;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListUpgradeFragment;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListItemUIBugFixSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TsS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76016TsS extends AbstractC75977Trp {
    public List<? extends Room> LLFFF;
    public List<? extends Room> LLFII;
    public List<? extends Room> LLFZ;
    public List<? extends Room> LLI;
    public List<? extends Room> LLIFFJFJJ;
    public long LLII;
    public long LLIIII;
    public C76033Tsj LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public java.util.Map<Long, ? extends RivalsListsData.TopHostInfo> LLIIJI;
    public final C73318Sq2 LLIIJLIL;
    public CohostTopic LLIIL;
    public TopicExtraInfo LLIILII;
    public boolean LLIILZL;
    public int LLIIZ;
    public boolean LLIL;
    public int LLILII;
    public RivalsListsData.BannerText LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C76011TsN LLILZ;

    @Override // X.AbstractC76019TsV
    public final int LJII() {
        return this.LLFZ.size();
    }

    @Override // X.AbstractC75977Trp
    public final boolean LJIJJ() {
        if (!C32151Nz.LJJIIJZLJL(this.LLFZ) || !this.LLILL || !C32151Nz.LJJIIJZLJL(this.LLFFF) || !C32151Nz.LJJIIJZLJL(this.LLI) || !C32151Nz.LJJIIJZLJL(this.LLFII)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJ() {
        RivalExtraInfo.ReserveInfo reserveInfo;
        boolean z;
        boolean z2;
        double d;
        EnumC76042Tss enumC76042Tss;
        this.LJLLILLLL = new CJ2();
        this.LJLLJ = new CJ2();
        LJIJJLI(this.LLIIL, this.LLIILII);
        if (!this.LLFZ.isEmpty()) {
            CJ2 cj2 = this.LJLLILLLL;
            String LJIILL = C15380j0.LJIILL(R.string.na0, Integer.valueOf(this.LLFZ.size()));
            o.LJIIIIZZ(LJIILL, "getString(R.string.pm_mu…count, reservedList.size)");
            if (this.LJLL) {
                enumC76042Tss = EnumC76042Tss.SHRINK;
            } else {
                enumC76042Tss = EnumC76042Tss.EXTENSION;
            }
            cj2.add(new C76046Tsw(LJIILL, enumC76042Tss, this.LJLLILLLL.size()));
        }
        InterfaceC28306B9a interfaceC28306B9a = null;
        if (!this.LLFZ.isEmpty()) {
            Iterator it = ORZ.LLJJI(this.LLFZ).iterator();
            while (true) {
                C199797sl c199797sl = (C199797sl) it;
                if (!c199797sl.hasNext()) {
                    break;
                }
                Room room = (Room) ((C2058786d) c199797sl.next()).LIZIZ;
                RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) C279417u.LIZ(room, this.LLD);
                if (rivalExtraInfo != null) {
                    reserveInfo = rivalExtraInfo.reserveInfo;
                } else {
                    reserveInfo = null;
                }
                if (reserveInfo != null) {
                    RivalsListsData.TopHostInfo topHostInfo = (RivalsListsData.TopHostInfo) C279417u.LIZ(room, this.LLIIJI);
                    if (topHostInfo == null) {
                        topHostInfo = RivalsListsData.TopHostInfo.LIZ;
                    }
                    o.LJIIIIZZ(topHostInfo, "mTopHostInfo[room.id] ?:…stsData.TopHostInfo.EMPTY");
                    EnumC75614Tly enumC75614Tly = EnumC75614Tly.RESERVED_INVITE;
                    String str = this.LJZL;
                    EnumC76024Tsa enumC76024Tsa = EnumC76024Tsa.IDLE;
                    if (this.LLFZ.size() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJLLJ.add(new C75984Trw(room, topHostInfo, enumC75614Tly, rivalExtraInfo, str, enumC76024Tsa, z, true));
                } else if (rivalExtraInfo != null && rivalExtraInfo.optPairInfo != null) {
                    RivalsListsData.TopHostInfo topHostInfo2 = (RivalsListsData.TopHostInfo) C279417u.LIZ(room, this.LLIIJI);
                    if (topHostInfo2 == null) {
                        topHostInfo2 = RivalsListsData.TopHostInfo.LIZ;
                    }
                    o.LJIIIIZZ(topHostInfo2, "mTopHostInfo[room.id] ?:…stsData.TopHostInfo.EMPTY");
                    EnumC75614Tly enumC75614Tly2 = EnumC75614Tly.PAIRING_ON_RESERVE_INVITE;
                    String str2 = this.LJZL;
                    EnumC76024Tsa enumC76024Tsa2 = EnumC76024Tsa.IDLE;
                    if (this.LLFZ.size() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LJLLJ.add(new C75984Trw(room, topHostInfo2, enumC75614Tly2, rivalExtraInfo, str2, enumC76024Tsa2, z2, false));
                }
            }
            if (!this.LJLL) {
                this.LJLLILLLL.add(new C76014TsQ(this.LJLLJ));
            }
        }
        if (!this.LLILL) {
            return;
        }
        boolean z3 = this.LLILLJJLI;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (z3) {
            C30554Byw<Double> c30554Byw = InterfaceC30442Bx8.LLILII;
            Double LIZ = c30554Byw.LIZ();
            if (LIZ != null) {
                d = LIZ.doubleValue();
            } else {
                d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            c30554Byw.LIZJ(Double.valueOf(d + 1));
            CJ2 cj22 = this.LJLLILLLL;
            C76060TtA c76060TtA = new C76060TtA();
            c76060TtA.LJLILLLLZI = this.LLILLIZIL;
            cj22.add(c76060TtA);
        }
        if (!this.LLILLIZIL) {
            CJ2 cj23 = this.LJLLILLLL;
            RivalsListsData.BannerText bannerText = this.LLILIL;
            if (bannerText != null) {
                interfaceC28306B9a = new C76067TtH(bannerText);
            }
            cj23.add(interfaceC28306B9a);
        } else {
            CJ2 cj24 = this.LJLLILLLL;
            RivalsListsData.BannerText bannerText2 = this.LLILIL;
            if (bannerText2 != null) {
                interfaceC28306B9a = new C76068TtI(bannerText2);
            }
            cj24.add(interfaceC28306B9a);
        }
        if (this.LLILLL) {
            C30554Byw<Double> c30554Byw2 = InterfaceC30442Bx8.LLILII;
            Double LIZ2 = c30554Byw2.LIZ();
            if (LIZ2 != null) {
                d2 = LIZ2.doubleValue();
            }
            c30554Byw2.LIZJ(Double.valueOf(d2 + 1));
            CJ2 cj25 = this.LJLLILLLL;
            C76061TtB c76061TtB = new C76061TtB();
            c76061TtB.LJLILLLLZI = this.LLILLIZIL;
            cj25.add(c76061TtB);
        }
        this.LJLLI = this.LJLLILLLL.size() - 1;
    }

    @Override // X.AbstractC75977Trp, com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LIZIZ() {
        super.LIZIZ();
        ((LinkedHashMap) C75642TmQ.LIZIZ).clear();
        this.LLIIJLIL.LIZLLL();
        C75893TqT.LJIIJJI = false;
        DataChannel dataChannel = this.LJZI;
        dataChannel.getClass();
        dataChannel.jv0(this);
        C74838TYs.LJ().LJI.remove(this.LLILZ);
    }

    @Override // X.AbstractC76019TsV
    public final void LJFF(int i) {
        long j;
        long j2;
        long j3;
        this.LLF.LIZLLL();
        boolean z = false;
        C75893TqT.LJIIJJI = false;
        ((LinkedHashMap) C75642TmQ.LIZIZ).clear();
        C75642TmQ.LIZJ.clear();
        C75877TqD.LJIIIIZZ = AbstractC75977Trp.LJIJ();
        String clientLogId = C75877TqD.LJIIIIZZ;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LJLILLLLZI;
        if (multiCoHostInviteListContract$AbsView != null && multiCoHostInviteListContract$AbsView.LJLJJLL) {
            z = true;
        }
        this.LLIIIZ = z;
        if (multiCoHostInviteListContract$AbsView != null) {
            j = multiCoHostInviteListContract$AbsView.LJLJJI;
        } else {
            j = 0;
        }
        this.LLII = j;
        if (multiCoHostInviteListContract$AbsView != null) {
            j2 = multiCoHostInviteListContract$AbsView.LJLJJL;
        } else {
            j2 = 0;
        }
        this.LLIIII = j2;
        EnumC55972Lxw enumC55972Lxw = EnumC55972Lxw.NEW;
        o.LJIIIZ(enumC55972Lxw, "<set-?>");
        this.LJZ = enumC55972Lxw;
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
        ((InterfaceC29856Bng) C1EW.LIZ(C29554Bio.LIZ(coHostApi, j3, i, Calendar.getInstance().getTimeZone().getID(), Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000, this.LLII, this.LL, this.LLIIII, this.LJZ.getVersion(), clientLogId)).LIZJ(LIZ())).LIZJ(new AfS62S0200000_13(this, c75878TqE2, 71), new AfS62S0200000_13(this, c75878TqE2, 72));
    }

    @Override // X.AbstractC76019TsV
    public final void LJI(int i) {
        this.LJLLILLLL.remove(i);
        this.LJLL = true;
        if (CoHostInviteListItemUIBugFixSetting.isEnable()) {
            if (this.LLIILZL) {
                this.LJLJJLL--;
            }
            if (this.LLIL) {
                this.LJLJLLL--;
            }
        }
    }

    @Override // X.AbstractC76019TsV
    public final void LJIIIZ(int i) {
        this.LJLLILLLL.remove(i);
        this.LJLLI--;
        if (this.LLIILZL) {
            this.LJLJJLL--;
        }
        if (this.LLIL) {
            this.LJLJLLL--;
        }
    }

    @Override // X.AbstractC76019TsV
    public final void LJIILJJIL(int i) {
        this.LJLLILLLL.add(i, new C76014TsQ(this.LJLLJ));
        this.LJLL = false;
        if (CoHostInviteListItemUIBugFixSetting.isEnable()) {
            if (this.LLIILZL) {
                this.LJLJJLL++;
            }
            if (this.LLIL) {
                this.LJLJLLL++;
            }
        }
    }

    @Override // X.AbstractC76019TsV
    public final void LJIILL(EnumC76039Tsp inviteListType) {
        int i;
        int i2;
        o.LJIIIZ(inviteListType, "inviteListType");
        if (inviteListType == EnumC76039Tsp.FRIEND_LIST_TYPE) {
            i = this.LJLJJLL - 1;
            i2 = this.LJLJJL;
            this.LJLJJI = true;
        } else {
            i = this.LJLJLLL - 1;
            i2 = this.LJLJLJ;
            this.LJLJL = true;
        }
        if (i < 0) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            this.LJLLILLLL.remove(i);
            i3++;
            i--;
        }
        if (inviteListType == EnumC76039Tsp.FRIEND_LIST_TYPE) {
            this.LJLJJLL = i + 1;
            if (CoHostInviteListItemUIBugFixSetting.isEnable() && this.LLIL) {
                this.LJLJLLL -= i2;
                return;
            }
            return;
        }
        this.LJLJLLL = i + 1;
    }

    @Override // X.AbstractC76019TsV
    public final void LJIILLIIL(EnumC76039Tsp inviteListType) {
        List<? extends Room> list;
        int i;
        int i2;
        EnumC75614Tly enumC75614Tly;
        o.LJIIIZ(inviteListType, "inviteListType");
        if (inviteListType == EnumC76039Tsp.FRIEND_LIST_TYPE) {
            list = this.LLFFF;
            i = this.LJLJJLL - 1;
            i2 = this.LLIIZ;
            this.LJLJJI = false;
        } else {
            list = this.LLI;
            i = this.LJLJLLL - 1;
            i2 = this.LLILII;
            this.LJLJL = false;
        }
        int size = list.size();
        for (int i3 = i2; i3 < size; i3++) {
            if (inviteListType == EnumC76039Tsp.FRIEND_LIST_TYPE) {
                enumC75614Tly = EnumC75614Tly.FOLLOW_INVITE;
            } else {
                enumC75614Tly = EnumC75614Tly.MAY_KNOW_INVITE;
            }
            if (i3 < list.size()) {
                Room room = (Room) ListProtector.get(list, i3);
                RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) C279417u.LIZ(room, this.LLD);
                if (rivalExtraInfo != null) {
                    RivalsListsData.TopHostInfo topHostInfo = (RivalsListsData.TopHostInfo) C279417u.LIZ(room, this.LLIIJI);
                    if (topHostInfo == null) {
                        topHostInfo = RivalsListsData.TopHostInfo.LIZ;
                    }
                    o.LJIIIIZZ(topHostInfo, "mTopHostInfo[it.id] ?: R…stsData.TopHostInfo.EMPTY");
                    C76033Tsj c76033Tsj = new C76033Tsj(room, topHostInfo, enumC75614Tly, rivalExtraInfo, this.LJZL, EnumC76024Tsa.IDLE);
                    C75893TqT.LIZ(c76033Tsj);
                    i++;
                    this.LJLLILLLL.add(i, c76033Tsj);
                }
            }
        }
        if (inviteListType == EnumC76039Tsp.FRIEND_LIST_TYPE) {
            this.LJLJJLL = i + 1;
            if (CoHostInviteListItemUIBugFixSetting.isEnable() && this.LLIL) {
                this.LJLJLLL = (list.size() - i2) + this.LJLJLLL;
                return;
            }
            return;
        }
        this.LJLJLLL = i + 1;
    }

    public final void LJJI(EnumC76027Tsd enumC76027Tsd) {
        C76050Tt0 c76050Tt0;
        if (this.LLIIII != 0 && !this.LLIIIZ && enumC76027Tsd == EnumC76027Tsd.TYPE_MAY_KNOW_TITLE) {
            this.LLIIIL = this.LJLLILLLL.size();
        }
        CJ2 cj2 = this.LJLLILLLL;
        int ordinal = enumC76027Tsd.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        String LJIILL = C15380j0.LJIILL(R.string.na0, Integer.valueOf(this.LLFZ.size()));
                        o.LJIIIIZZ(LJIILL, "getString(R.string.pm_mu…count, reservedList.size)");
                        c76050Tt0 = new C76050Tt0(LJIILL, 2);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.km1);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_cohost_suggestedCreators)");
                    c76050Tt0 = new C76050Tt0(LJIILJJIL, 2);
                }
            } else {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kk4);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_cohost_peopleYouMayKnow)");
                c76050Tt0 = new C76050Tt0(LJIILJJIL2, 1);
            }
        } else {
            String LJIILL2 = C15380j0.LJIILL(R.string.kie, Integer.valueOf(this.LLFFF.size()));
            o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_co…scount, mFriendList.size)");
            c76050Tt0 = new C76050Tt0(LJIILL2, 0);
        }
        cj2.add(c76050Tt0);
        if (this.LLII != 0 && this.LLIIIZ && enumC76027Tsd == EnumC76027Tsd.TYPE_FRIEND_TITLE) {
            this.LLIIIJ = this.LJLLILLLL.size();
        }
    }

    public final void LJJII(EnumC76026Tsc enumC76026Tsc) {
        List<? extends Room> LLILLL;
        List<? extends Room> list;
        int ordinal = enumC76026Tsc.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                LLILLL = this.LLFII;
            } else {
                if (this.LLILII < this.LLI.size()) {
                    this.LJLJL = true;
                    this.LJLJLJ = this.LLI.size() - this.LLILII;
                }
                LLILLL = ORZ.LLILLL(this.LLI, this.LLILII);
            }
        } else {
            if (this.LLIIZ < this.LLFFF.size()) {
                this.LJLJJI = true;
                this.LJLJJL = this.LLFFF.size() - this.LLIIZ;
            }
            LLILLL = ORZ.LLILLL(this.LLFFF, this.LLIIZ);
        }
        EnumC76024Tsa enumC76024Tsa = EnumC76024Tsa.IDLE;
        EnumC76026Tsc enumC76026Tsc2 = EnumC76026Tsc.TYPE_FRIEND_USER;
        if (enumC76026Tsc == enumC76026Tsc2) {
            list = this.LLFFF;
        } else {
            list = this.LLI;
        }
        Room room = (Room) ORZ.LJLLLLLL(0, list);
        if (enumC76026Tsc == enumC76026Tsc2 && room != null && this.LLII == room.getOwnerUserId()) {
            enumC76024Tsa = EnumC76024Tsa.TOP_LIVING_FRIEND;
        } else if (enumC76026Tsc == EnumC76026Tsc.TYPE_MAY_KNOW_USER && room != null && this.LLIIII == room.getOwnerUserId()) {
            enumC76024Tsa = EnumC76024Tsa.TOP_LIVING_MAY_KNOW;
        }
        if (this.LLIIII != 0 && !this.LLIIIZ && enumC76026Tsc == EnumC76026Tsc.TYPE_MAY_KNOW_USER) {
            this.LLIIIJ = this.LJLLILLLL.size();
        }
        LJJIFFI(LLILLL, enumC76024Tsa, new AqS144S0200000_13(this, enumC76026Tsc, 100));
    }

    public C76016TsS(MultiHostInviteListUpgradeFragment multiHostInviteListUpgradeFragment, DataChannel dataChannel) {
        super(multiHostInviteListUpgradeFragment, dataChannel);
        C75559Tl5.LIZIZ.LIZLLL(this);
        dataChannel.mv0(MultiCoHostCountDownEvent.class, this, new AqS179S0100000_13(this, 603));
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LLFFF = c61878OQg;
        this.LLFII = c61878OQg;
        this.LLFZ = c61878OQg;
        this.LLI = c61878OQg;
        this.LLIFFJFJJ = c61878OQg;
        this.LLIIIJ = -1;
        this.LLIIJI = C113554cx.LJJJLIIL();
        this.LLIIJLIL = new C73318Sq2();
        new HashSet();
        this.LLILZ = new C76011TsN(this, multiHostInviteListUpgradeFragment);
    }

    public final void LJJIFFI(List<? extends Room> list, EnumC76024Tsa enumC76024Tsa, InterfaceC88472Yns<? super Room, ? extends EnumC75614Tly> interfaceC88472Yns) {
        boolean z;
        boolean z2;
        EnumC76024Tsa enumC76024Tsa2 = enumC76024Tsa;
        CJ2 cj2 = this.LJLLILLLL;
        for (Room room : list) {
            RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) C279417u.LIZ(room, this.LLD);
            if (rivalExtraInfo != null) {
                RivalsListsData.TopHostInfo topHost = (RivalsListsData.TopHostInfo) C279417u.LIZ(room, this.LLIIJI);
                if (topHost == null) {
                    topHost = RivalsListsData.TopHostInfo.LIZ;
                }
                o.LJIIIIZZ(topHost, "topHost");
                EnumC75614Tly invoke = interfaceC88472Yns.invoke(room);
                String str = this.LJZL;
                EnumC76024Tsa enumC76024Tsa3 = EnumC76024Tsa.IDLE;
                C76033Tsj c76033Tsj = new C76033Tsj(room, topHost, invoke, rivalExtraInfo, str, enumC76024Tsa3);
                C75893TqT.LIZ(c76033Tsj);
                long ownerUserId = room.getOwnerUserId();
                boolean z3 = true;
                C75883TqJ LJJZ = C8E.LIZLLL().LJJZ(ownerUserId, true);
                if (LJJZ != null) {
                    z = LJJZ.LJ();
                } else {
                    z = false;
                }
                C75883TqJ LJJZ2 = C8E.LIZLLL().LJJZ(ownerUserId, false);
                if (LJJZ2 != null) {
                    z2 = LJJZ2.LJ();
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    z3 = false;
                }
                c76033Tsj.LJLLI = z3;
                c76033Tsj.LJLLLLLL = this.LJLZ;
                if (enumC76024Tsa2 != enumC76024Tsa3 && this.LJLLLL) {
                    this.LLIIIILZ = c76033Tsj;
                    o.LJIIIZ(enumC76024Tsa2, "<set-?>");
                    c76033Tsj.LJLJJLL = enumC76024Tsa2;
                    enumC76024Tsa2 = enumC76024Tsa3;
                } else {
                    cj2.add(c76033Tsj);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fillUserList,  item.isCancelBySelf = ");
                FT5.LJ(LIZ, c76033Tsj.LJLLI, LIZ, "MultiCoHostUpgradeListPresenter");
            }
        }
    }
}
