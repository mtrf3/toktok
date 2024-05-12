package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.pipfeed.player.AnalyticsController$reportAwemeShowStatus$1", f = "AnalyticsController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JCx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48791JCx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C48233IwP LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C48780JCm LJLJI;
    public final /* synthetic */ IT4 LJLJJI;
    public final /* synthetic */ Aweme LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48791JCx(C48233IwP c48233IwP, String str, C48780JCm c48780JCm, IT4 it4, Aweme aweme, InterfaceC67352kd<? super C48791JCx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c48233IwP;
        this.LJLILLLLZI = str;
        this.LJLJI = c48780JCm;
        this.LJLJJI = it4;
        this.LJLJJL = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C48791JCx(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LJLIL.LJLJLLL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[reportAwemeShowStatus] ");
        LIZ.append(this.LJLILLLLZI);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
        C48780JCm c48780JCm = this.LJLJI;
        String str = c48780JCm.LIZJ;
        int i = c48780JCm.LIZIZ;
        String id = this.LJLJJI.getId();
        int awemeType = this.LJLJJL.getAwemeType();
        Aweme aweme = this.LJLJJL;
        C62682Ois.LIZ(str, i, id, awemeType, aweme, aweme.getRequestId());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
