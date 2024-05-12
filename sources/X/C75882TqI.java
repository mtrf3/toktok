package X;

import Y.AfS4S0010000_13;
import com.bytedance.android.live.liveinteract.api.LinkCoHostLeaveChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownRemoveEvent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import webcast.im.JoinGroupMessageExtra;

/* renamed from: X.TqI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75882TqI extends AbstractC75942TrG {
    public Long LJLJJI;

    @Override // X.AbstractC75942TrG
    public final boolean LIZJ(int i) {
        if (C8E.LIZLLL().zS("isTwoLinkedInCrossArc") && C8E.LIZLLL().LJIILJJIL().size() == 2 && i == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC75942TrG
    public final void LJIIIIZZ(long j) {
        this.LJLJJI = Long.valueOf(j);
    }

    @Override // X.AbstractC75942TrG
    public final void LJIIIZ(boolean z) {
        AbstractC73672Svk<C28467BFf<Void>> LIZ = C29555Bip.LIZ(8, z);
        if (LIZ == null) {
            return;
        }
        ((InterfaceC29856Bng) LIZ.LIZJ(LIZ())).LIZJ(new AfS4S0010000_13(z, 1), C75920Tqu.LJLIL);
    }

    @Override // X.AbstractC75942TrG
    public final void LJIIJ(boolean z) {
        AbstractC73672Svk<C28467BFf<Void>> LIZ = C29555Bip.LIZ(7, z);
        if (LIZ == null) {
            return;
        }
        ((InterfaceC29856Bng) LIZ.LIZJ(LIZ())).LIZJ(new AfS4S0010000_13(z, 2), C75921Tqv.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75882TqI(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment, C75474Tji params) {
        super(multiCoHostBeInvitedFragment);
        o.LJIIIZ(params, "params");
        DataChannel dataChannel = params.LIZ;
        if (dataChannel != null) {
            dataChannel.lv0(multiCoHostBeInvitedFragment, MultiCoHostCountDownEvent.class, new AqS144S0200000_13(this, multiCoHostBeInvitedFragment, 99));
        }
        DataChannel dataChannel2 = params.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.lv0(multiCoHostBeInvitedFragment, MultiCoHostCountDownRemoveEvent.class, new AqS179S0100000_13(multiCoHostBeInvitedFragment, 591));
        }
        DataChannel dataChannel3 = params.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.lv0(multiCoHostBeInvitedFragment, LinkCoHostLeaveChannel.class, C34391Ded.LJLIL);
        }
    }

    @Override // X.AbstractC75942TrG
    public final void LJ(LinkerInviteContent linkerInviteContent, int i, java.util.Map<String, ? extends Object> map) {
        long LJJLI = C8E.LIZLLL().LJJLI();
        LIZLLL(linkerInviteContent, null, i, true, false);
        if (LJJLI <= 0) {
            return;
        }
        long j = linkerInviteContent.fromRoomId;
        long j2 = linkerInviteContent.fromUserId;
        String str = linkerInviteContent.fromLinkmicIdStr;
        if (str == null) {
            str = "";
        }
        C8E.LIZLLL().LJJLJLI(new C75993Ts5(j, j2, null, str, i, null, 100), new C75908Tqi(), map);
    }

    @Override // X.AbstractC75942TrG
    public final void LJFF(C75678Tn0 c75678Tn0, int i, java.util.Map<String, ? extends Object> map) {
        long j;
        long j2;
        String str;
        LIZLLL(new LinkerInviteContent(), c75678Tn0, i, true, false);
        long j3 = 0;
        if (c75678Tn0 != null) {
            j = c75678Tn0.LIZLLL;
            j2 = c75678Tn0.LIZJ;
            j3 = c75678Tn0.LJ;
        } else {
            j = 0;
            j2 = 0;
        }
        if (c75678Tn0 == null || (str = c75678Tn0.LJFF) == null) {
            str = "";
        }
        C8E.LIZLLL().LJJIJLIJ(new C75892TqS(1, j, j2, j3, str, i, map, null, null, C05040Hs.LIZIZ("permitNewArc"), 384), new C75913Tqn());
    }

    @Override // X.AbstractC75942TrG
    public final void LJI(LinkerInviteContent linkerInviteContent, int i, java.util.Map<String, ? extends Object> map) {
        long LJJLI = C8E.LIZLLL().LJJLI();
        LIZLLL(linkerInviteContent, null, i, false, false);
        if (LJJLI <= 0) {
            return;
        }
        if (i == 1 && RandomLinkMicManager.LJIIIIZZ()) {
            RandomLinkMicManager.LJIILIIL();
        }
        C8E.LIZLLL().LLFZ(new C75911Tql(linkerInviteContent.fromRoomId, linkerInviteContent.fromUserId, i, (BizReplyParams) null, 24), new C75907Tqh(), map);
    }

    @Override // X.AbstractC75942TrG
    public final void LJII(C75678Tn0 c75678Tn0, int i, java.util.Map<String, ? extends Object> map) {
        long j;
        long j2;
        MHJoinBizContent mHJoinBizContent;
        JoinGroupMessageExtra joinGroupMessageExtra;
        LIZLLL(new LinkerInviteContent(), c75678Tn0, i, false, false);
        if (i == 1 && RandomLinkMicManager.LJIIIIZZ()) {
            RandomLinkMicManager.LJIILIIL();
        }
        long j3 = 0;
        if (c75678Tn0 != null) {
            j = c75678Tn0.LIZLLL;
            j2 = c75678Tn0.LIZJ;
            j3 = c75678Tn0.LJ;
        } else {
            j = 0;
            j2 = 0;
        }
        int i2 = 0;
        MHJoinReplyBizContent mHJoinReplyBizContent = new MHJoinReplyBizContent(0, 1, null);
        if (c75678Tn0 != null && (mHJoinBizContent = c75678Tn0.LJI) != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
            i2 = (int) joinGroupMessageExtra.sourceType;
        }
        mHJoinReplyBizContent.sourceType = i2;
        C8E.LIZLLL().LJJ(new C75892TqS(0, j, j2, j3, null, i, map, null, mHJoinReplyBizContent, C05040Hs.LIZIZ("replyNewArc"), 144), new C75906Tqg());
    }

    @Override // X.AbstractC75942TrG
    public final void LIZLLL(LinkerInviteContent linkerInviteContent, C75678Tn0 c75678Tn0, int i, boolean z, boolean z2) {
        ArrayList arrayList;
        EnumC75643TmR enumC75643TmR;
        List<InviterRivalExtra> list;
        ArrayList arrayList2;
        EnumC75643TmR enumC75643TmR2;
        JoinGroupMessageExtra joinGroupMessageExtra;
        List<JoinGroupMessageExtra.RivalExtra> list2;
        long LJJLI = C8E.LIZLLL().LJJLI();
        if (c75678Tn0 != null) {
            String valueOf = String.valueOf(LJJLI);
            long j = c75678Tn0.LIZJ;
            MHJoinBizContent mHJoinBizContent = c75678Tn0.LJI;
            if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null && (list2 = joinGroupMessageExtra.otherUsers) != null) {
                arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<JoinGroupMessageExtra.RivalExtra> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(it.next().userId));
                }
            } else {
                arrayList2 = new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            if (j > 0) {
                arrayList3.add(Long.valueOf(j));
            }
            arrayList3.addAll(arrayList2);
            if (z2) {
                enumC75643TmR2 = EnumC75643TmR.INVITE_WITHDRAW;
            } else if (z) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            enumC75643TmR2 = EnumC75643TmR.UNKNOW;
                        } else {
                            enumC75643TmR2 = EnumC75643TmR.OVER_TIME;
                        }
                    } else {
                        enumC75643TmR2 = EnumC75643TmR.REJECT;
                    }
                } else {
                    enumC75643TmR2 = EnumC75643TmR.ACCEPT;
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        enumC75643TmR2 = EnumC75643TmR.UNKNOW;
                    } else {
                        enumC75643TmR2 = EnumC75643TmR.OVER_TIME;
                    }
                } else {
                    enumC75643TmR2 = EnumC75643TmR.REJECT;
                }
            } else {
                enumC75643TmR2 = EnumC75643TmR.ACCEPT;
            }
            C75642TmQ.LJJIIZ(valueOf, enumC75643TmR2.getValue(), arrayList3, z);
            return;
        }
        String valueOf2 = String.valueOf(LJJLI);
        long j2 = linkerInviteContent.fromUserId;
        LinkerInviteMessageExtra linkerInviteMessageExtra = linkerInviteContent.linkerInviteMsgExtra;
        if (linkerInviteMessageExtra != null && (list = linkerInviteMessageExtra.otherRivalExtra) != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<InviterRivalExtra> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().userId));
            }
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList4 = new ArrayList();
        if (j2 > 0) {
            arrayList4.add(Long.valueOf(j2));
        }
        arrayList4.addAll(arrayList);
        if (z2) {
            enumC75643TmR = EnumC75643TmR.INVITE_WITHDRAW;
        } else if (z) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        enumC75643TmR = EnumC75643TmR.UNKNOW;
                    } else {
                        enumC75643TmR = EnumC75643TmR.OVER_TIME;
                    }
                } else {
                    enumC75643TmR = EnumC75643TmR.REJECT;
                }
            } else {
                enumC75643TmR = EnumC75643TmR.ACCEPT;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    enumC75643TmR = EnumC75643TmR.UNKNOW;
                } else {
                    enumC75643TmR = EnumC75643TmR.OVER_TIME;
                }
            } else {
                enumC75643TmR = EnumC75643TmR.REJECT;
            }
        } else {
            enumC75643TmR = EnumC75643TmR.ACCEPT;
        }
        C75642TmQ.LJJIIZ(valueOf2, enumC75643TmR.getValue(), arrayList4, z);
    }
}
