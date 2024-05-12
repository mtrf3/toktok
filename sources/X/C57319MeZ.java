package X;

import Y.IDfS13S0300000_9;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.presenter.MusicDetailHelper$queryList$1", f = "MusicDetailHelper.kt", l = {279}, m = "invokeSuspend")
/* renamed from: X.MeZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57319MeZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C57316MeW LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ MJ0 LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<MusicAwemeList, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57319MeZ(boolean z, C57316MeW c57316MeW, boolean z2, MJ0 mj0, InterfaceC88472Yns<? super MusicAwemeList, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C57319MeZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = c57316MeW;
        this.LJLJJI = z2;
        this.LJLJJL = mj0;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57319MeZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC199577sP enumC199577sP;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI) {
                enumC199577sP = EnumC199577sP.NetWhenCacheMiss;
            } else {
                enumC199577sP = EnumC199577sP.NetworkOnly;
            }
            XGL LIZ = XGJ.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mota: ");
            LIZ2.append(LIZ.LIZ);
            LIZ2.append(", ");
            LIZ2.append(o.LJ(LIZ.LIZ, XH8.LIZ));
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            try {
                C78977Uz7.LJJJJJL(LIZ.LIZ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C36922EeM.LJ("mota retrofitInstance is empty");
            }
            XGR LIZIZ = LIZ.LIZIZ(this.LJLJI);
            if (this.LJLJJI) {
                AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) MJ0.LIZLLL.getValue();
                if (o.LJ(C57318MeY.class, C57318MeY.class)) {
                    LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, null, null, C57318MeY.class, C57318MeY.class)));
                    C78977Uz7.LJJIJL(LIZIZ, enumC199577sP);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("po is ");
                    LIZ3.append(C57318MeY.class);
                    LIZ3.append(", do is ");
                    LIZ3.append(C57318MeY.class);
                    LIZ3.append(", please pass the onFetchCache and onQueryNet param to map cache");
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
                }
            }
            InterfaceC65462ha LIZIZ3 = LIZIZ.LIZIZ();
            IDfS13S0300000_9 iDfS13S0300000_9 = new IDfS13S0300000_9(this.LJLJJL, this.LJLJJLL, this.LJLJL, 0);
            this.LJLIL = 1;
            if (LIZIZ3.collect(iDfS13S0300000_9, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
