package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import java.util.List;

/* renamed from: X.TyR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76387TyR extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ XJL<Boolean> LJLIL;
    public final /* synthetic */ List<BattleTeamUserArmies> LJLILLLLZI;
    public final /* synthetic */ C76286Two LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76387TyR(XKS xks, List list, C76286Two c76286Two, int i) {
        super(1);
        this.LJLIL = xks;
        this.LJLILLLLZI = list;
        this.LJLJI = c76286Two;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (this.LJLIL.isActive() && booleanValue) {
            StringBuilder LJI = JBR.LJI("Start Battle coroutines isActive call resume,---changePoc = ", booleanValue, " --- armies size ");
            LJI.append(this.LJLILLLLZI.size());
            C0NB.LIZIZ("MultiMatchAudienceViewP", X1D.LIZIZ(LJI));
            XJL<Boolean> xjl = this.LJLIL;
            Boolean bool2 = Boolean.TRUE;
            C3C5.m7constructorimpl(bool2);
            xjl.resumeWith(bool2);
            C76271TwZ.LJJLIIIJ(C76271TwZ.LIZ, C76265TwT.LIZ.LIZIZ(), B5G.LIZIZ().LJFF);
            this.LJLJI.LJFF(this.LJLJJI, this.LJLILLLLZI);
            this.LJLJI.LJIL(this.LJLILLLLZI, 0L, 0L);
        }
        return C76800UCe.LIZ;
    }
}
