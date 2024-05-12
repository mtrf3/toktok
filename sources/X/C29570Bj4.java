package X;

import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bj4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29570Bj4 implements CRX {
    @Override // X.CRX
    public final void LIZLLL(CUN cun) {
    }

    @Override // X.CRX
    public final void LIZ(CBL registry) {
        o.LJIIIZ(registry, "registry");
        registry.LIZLLL(LinkMicAnchorGuideMessage.class, new C29327Bf9());
        registry.LIZLLL(LinkMicBattleNoticeMessage.class, new C29571Bj5());
        registry.LIZLLL(LinkMicAudienceNoticeMessage.class, new C29569Bj3());
        registry.LIZLLL(LinkMicBattleItemCard.class, new C29573Bj7());
    }

    @Override // X.CRX
    public final void LIZJ(CT7 ct7) {
        ct7.LLD(C29326Bf8.class, new C29323Bf5());
        ct7.LLD(C29572Bj6.class, new C29317Bez());
        ct7.LLD(C29568Bj2.class, new C29566Bj0());
    }

    @Override // X.CRX
    public final void LJ(InterfaceC31378CTe registry) {
        o.LJIIIZ(registry, "registry");
    }

    @Override // X.CRX
    public final void LJFF(CS7 registry) {
        o.LJIIIZ(registry, "registry");
    }

    @Override // X.CRX
    public final void LJI(InterfaceC29574Bj8 registry) {
        o.LJIIIZ(registry, "registry");
        if (registry.LJIILIIL()) {
            return;
        }
        C31319CQx c31319CQx = (C31319CQx) registry;
        c31319CQx.LJLIIIL(EnumC31509CYf.LINK_MIC_BATTLE_NOTICE.getIntType());
        c31319CQx.LJLIIIL(EnumC31509CYf.LINK_CO_HOST_GUIDE.getIntType());
        c31319CQx.LJLIIIL(EnumC31509CYf.LINK_AUDIENCE_NOTICE.getIntType());
        c31319CQx.LJLIIIL(EnumC31509CYf.LINK_MIC_BATTLE_ITEM_CARD.getIntType());
    }

    @Override // X.CRX
    public final void LJII(C29821Fa registry) {
        o.LJIIIZ(registry, "registry");
        registry.LIZIZ(LinkMicBattleNoticeMessage.class, new C29576BjA());
        registry.LIZIZ(LinkMicAnchorGuideMessage.class, new C29575Bj9());
        registry.LIZIZ(LinkMicAudienceNoticeMessage.class, new C29565Biz());
        registry.LIZIZ(LinkMicBattleItemCard.class, new C29621Bjt(0));
    }

    @Override // X.CRX
    public final void LIZIZ(C0HK registry, CQQ publicScreenContext) {
        DataChannel dataChannel;
        o.LJIIIZ(registry, "registry");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        if (publicScreenContext.LJFF && (dataChannel = publicScreenContext.LJIIIIZZ) != null) {
            C87890YeU c87890YeU = new C87890YeU(dataChannel);
            c87890YeU.LJ();
            registry.LIZ(LinkMicAudienceNoticeMessage.class, c87890YeU);
            C87893YeX c87893YeX = new C87893YeX(dataChannel);
            c87893YeX.LJ();
            registry.LIZ(LinkMicBattleNoticeMessage.class, c87893YeX);
            C87889YeT c87889YeT = new C87889YeT(dataChannel);
            c87889YeT.LJ();
            registry.LIZ(LinkMicAnchorGuideMessage.class, c87889YeT);
        }
    }
}
