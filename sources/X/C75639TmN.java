package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomMatchInvitingFailed;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.TmN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75639TmN extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75677Tmz>, C76800UCe> {
    public static final C75639TmN LJLIL = new C75639TmN();

    public C75639TmN() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC75441TjB session, C75732Tns<C75677Tmz> c75732Tns) {
        int i;
        C75732Tns<C75677Tmz> message = c75732Tns;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(message, "message");
        int i2 = message.LIZ.LIZJ;
        C012403c.LJ("quickPairReplyMessageSubsscriber---replyStatus = ", i2, "QuickPairManager");
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        MHPermitJoinBizContent mHPermitJoinBizContent = message.LIZ.LJI;
        if (mHPermitJoinBizContent != null) {
            i = mHPermitJoinBizContent.sourceType;
        } else {
            i = 0;
        }
        if (i2 != 1) {
            if (i2 != 1) {
                if (RandomLinkMicManager.LJII() && B5G.LIZIZ().LJIIJ != EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
                    B5G.LIZIZ();
                    DataChannel dataChannel = RandomLinkMicManager.LJLILLLLZI;
                    if (dataChannel != null) {
                        dataChannel.qv0(LinkCrossRoomMatchInvitingFailed.class, "");
                    }
                }
                return C76800UCe.LIZ;
            }
        } else {
            if (i != 5) {
                if (i == 7 && RandomLinkMicManager.LJIIIIZZ()) {
                    LIZIZ.LJIIIZ(EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND);
                }
            } else if (RandomLinkMicManager.LJII()) {
                LIZIZ.LJIIIZ(EnumC75614Tly.RANDOM_LINK_MIC_INVITE);
            }
            QZP.LIZJ("setupQuickLinkMicInviteType, inviteType = ", i, "MultiHostSourceTypeHelper");
        }
        if (RandomLinkMicManager.LJII() || (RandomLinkMicManager.LJIIJJI() && B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND)) {
            RandomLinkMicManager.LJLIL.getClass();
            RandomLinkMicManager.LIZIZ("receive quick linkmic reply");
            B5G.LIZIZ().LJIIL = true;
            B5G.LIZIZ().LJIIIZ = true;
            B5G.LIZIZ().LJIIJJI(EnumC75672Tmu.INVITER);
        }
        return C76800UCe.LIZ;
    }
}
