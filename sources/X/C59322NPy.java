package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.LiveProduct;
import kotlin.jvm.internal.o;

/* renamed from: X.NPy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59322NPy implements InterfaceC36621EYv<LiveAdCardModel> {
    public final /* synthetic */ InterfaceC67352kd<LiveAdCardModel> LJLIL;

    public C59322NPy(C84654XKg c84654XKg) {
        this.LJLIL = c84654XKg;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<LiveAdCardModel> call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd = this.LJLIL;
        C3C4 LIZ = C141335gf.LIZ(new Throwable("app_tech_problem"));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<LiveAdCardModel> call, C64797Pbt<LiveAdCardModel> response) {
        ComponentData componentData;
        CardStruct cardInfo;
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (!response.LIZIZ() || response.LIZIZ.getComponentData() == null || (componentData = response.LIZIZ.getComponentData()) == null || componentData.getCardInfo() == null) {
            InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd = this.LJLIL;
            C3C4 LIZ = C141335gf.LIZ(new Throwable("no_live_product"));
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd.resumeWith(LIZ);
            return;
        }
        String componentFailReason = response.LIZIZ.getComponentFailReason();
        if (componentFailReason != null) {
            InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd2 = this.LJLIL;
            C3C4 LIZ2 = C141335gf.LIZ(new Throwable(componentFailReason));
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd2.resumeWith(LIZ2);
            return;
        }
        LiveProduct liveProductCase = response.LIZIZ.getLiveProductCase();
        Object frontendExtraData = response.LIZIZ.getFrontendExtraData();
        if (liveProductCase != null) {
            if (liveProductCase.getProductStatus() != 1) {
                InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd3 = this.LJLIL;
                C3C4 LIZ3 = C141335gf.LIZ(new Throwable("sold_out"));
                C3C5.m7constructorimpl(LIZ3);
                interfaceC67352kd3.resumeWith(LIZ3);
                return;
            }
        } else if (frontendExtraData == null) {
            InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd4 = this.LJLIL;
            C3C4 LIZ4 = C141335gf.LIZ(new Throwable("no_live_product"));
            C3C5.m7constructorimpl(LIZ4);
            interfaceC67352kd4.resumeWith(LIZ4);
            return;
        }
        ComponentData componentData2 = response.LIZIZ.getComponentData();
        if (componentData2 != null && (cardInfo = componentData2.getCardInfo()) != null && o.LJ(cardInfo.getOnlyTrackEventNotShow(), Boolean.TRUE)) {
            InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd5 = this.LJLIL;
            C3C4 LIZ5 = C141335gf.LIZ(new Throwable("only_track"));
            C3C5.m7constructorimpl(LIZ5);
            interfaceC67352kd5.resumeWith(LIZ5);
            return;
        }
        InterfaceC67352kd<LiveAdCardModel> interfaceC67352kd6 = this.LJLIL;
        LiveAdCardModel liveAdCardModel = response.LIZIZ;
        C3C5.m7constructorimpl(liveAdCardModel);
        interfaceC67352kd6.resumeWith(liveAdCardModel);
    }
}
