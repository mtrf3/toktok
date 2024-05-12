package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import webcast.im.JoinGroupMessageExtra;

/* renamed from: X.Tn1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75679Tn1 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75678Tn0>, C76800UCe> {
    public static final C75679Tn1 LJLIL = new C75679Tn1();

    public C75679Tn1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC75441TjB session, C75732Tns<C75678Tn0> c75732Tns) {
        Integer num;
        JoinGroupMessageExtra joinGroupMessageExtra;
        JoinGroupMessageExtra joinGroupMessageExtra2;
        C75732Tns<C75678Tn0> message = c75732Tns;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
        if (message.LIZ.LIZIZ == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("receiveInvitationMessageSubscriber, isCrossArc = ");
            C19U.LIZJ(LIZ, message.LIZ.LJIIIZ, LIZ, "TopicPairManager");
            MHJoinBizContent mHJoinBizContent = message.LIZ.LJI;
            if (mHJoinBizContent != null && (joinGroupMessageExtra2 = mHJoinBizContent.bizExtra) != null) {
                num = Integer.valueOf((int) joinGroupMessageExtra2.sourceType);
            } else {
                num = null;
            }
            EnumC75614Tly enumC75614Tly = EnumC75614Tly.TOPIC_PAIR;
            int type = enumC75614Tly.getType();
            if (num == null || num.intValue() != type) {
                EnumC75614Tly.TOPIC_RECOMMEND.getType();
                if (num != null) {
                    num.intValue();
                }
            } else if (C75650TmY.LIZJ()) {
                C0NB.LIZIZ("TopicPairManager", "receive topic pair invite msg, auto reply");
                B5G.LIZIZ().LJIIJJI(EnumC75672Tmu.INVITEE);
                C75650TmY.LIZ(true);
                C75678Tn0 c75678Tn0 = message.LIZ;
                long j = c75678Tn0.LIZLLL;
                long j2 = c75678Tn0.LIZJ;
                long j3 = c75678Tn0.LJ;
                HashMap hashMap = new HashMap();
                hashMap.put("source_type", Integer.valueOf(enumC75614Tly.getType()));
                int i = 0;
                MHJoinReplyBizContent mHJoinReplyBizContent = new MHJoinReplyBizContent(0, 1, null);
                MHJoinBizContent mHJoinBizContent2 = c75678Tn0.LJI;
                if (mHJoinBizContent2 != null && (joinGroupMessageExtra = mHJoinBizContent2.bizExtra) != null) {
                    i = (int) joinGroupMessageExtra.sourceType;
                }
                mHJoinReplyBizContent.sourceType = i;
                C75892TqS c75892TqS = new C75892TqS(0, j, j2, j3, null, 1, hashMap, "topic_pair_auto_reply", mHJoinReplyBizContent, C05040Hs.LIZIZ("topic_pair_auto_reply"), 16);
                C75877TqD.LJIILLIIL = "topic_pair";
                C8E.LIZLLL().LJJ(c75892TqS, new C77117UOj());
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("receive topic pair msg in wrong state, state = ");
                LIZ2.append(C75650TmY.LJI);
                C0NB.LJIIIZ("TopicPairManager", X1D.LIZIZ(LIZ2));
            }
        }
        return C76800UCe.LIZ;
    }
}
