package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import webcast.im.JoinGroupMessageExtra;

/* renamed from: X.Tn2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75680Tn2 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75678Tn0>, C76800UCe> {
    public static final C75680Tn2 LJLIL = new C75680Tn2();

    public C75680Tn2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC75441TjB session, C75732Tns<C75678Tn0> c75732Tns) {
        Long l;
        Object obj;
        JoinGroupMessageExtra joinGroupMessageExtra;
        JoinGroupMessageExtra joinGroupMessageExtra2;
        C75732Tns<C75678Tn0> message = c75732Tns;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
        if (message.LIZ.LIZIZ == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("receiveInvitationMessageSubscriber---, isCrossArc = ");
            C19U.LIZJ(LIZ, message.LIZ.LJIIIZ, LIZ, "QuickPairManager");
            MHJoinBizContent mHJoinBizContent = message.LIZ.LJI;
            if (mHJoinBizContent != null && (joinGroupMessageExtra2 = mHJoinBizContent.bizExtra) != null) {
                l = Long.valueOf(joinGroupMessageExtra2.sourceType);
            } else {
                l = null;
            }
            long type = EnumC75614Tly.RANDOM_LINK_MIC_INVITE.getType();
            if (l == null || l.longValue() != type) {
                long type2 = EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND.getType();
                if (l != null && l.longValue() == type2) {
                    B5G.LIZIZ().LJIIIZ = true;
                }
            } else if (RandomLinkMicManager.LJIIIIZZ()) {
                B5G.LIZIZ().LJIIIZ = true;
                DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
                if (dataChannel != null) {
                    obj = dataChannel.kv0(C29616Bjo.class);
                } else {
                    obj = null;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("showInviteFragmentAndStartLinkCross, permission = ");
                LIZ2.append(obj);
                C0NB.LJIIIZ("QuickPairManager", X1D.LIZIZ(LIZ2));
                RandomLinkMicManager randomLinkMicManager = RandomLinkMicManager.LJLIL;
                C75678Tn0 c75678Tn0 = message.LIZ;
                HashMap hashMap = new HashMap();
                randomLinkMicManager.getClass();
                if (c75678Tn0 != null) {
                    long j = c75678Tn0.LJ;
                    if (j > 0) {
                        C0NB.LIZIZ("QuickPairManager", "auto reply invite request ");
                        long j2 = c75678Tn0.LIZLLL;
                        long j3 = c75678Tn0.LIZJ;
                        int i = 0;
                        MHJoinReplyBizContent mHJoinReplyBizContent = new MHJoinReplyBizContent(0, 1, null);
                        MHJoinBizContent mHJoinBizContent2 = c75678Tn0.LJI;
                        if (mHJoinBizContent2 != null && (joinGroupMessageExtra = mHJoinBizContent2.bizExtra) != null) {
                            i = (int) joinGroupMessageExtra.sourceType;
                        }
                        mHJoinReplyBizContent.sourceType = i;
                        C8E.LIZLLL().LJJ(new C75892TqS(0, j2, j3, j, null, 1, hashMap, null, mHJoinReplyBizContent, C05040Hs.LIZIZ("reply_quick_pair"), 144), new C77876UhM());
                    }
                }
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("receive quick pair msg in wrong state, state = ");
                LIZ3.append(RandomLinkMicManager.LJLJLJ);
                C0NB.LJIIIZ("QuickPairManager", X1D.LIZIZ(LIZ3));
            }
        }
        return C76800UCe.LIZ;
    }
}
