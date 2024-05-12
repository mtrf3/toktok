package X;

import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$doRefresh$2", f = "MixVideosViewModel.kt", l = {223, 1050}, m = "invokeSuspend")
/* renamed from: X.8zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229438zT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MixVideosViewModel LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C72242sW LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229438zT(MixVideosViewModel mixVideosViewModel, C76732zl c76732zl, C72242sW c72242sW, int i, long j, InterfaceC67352kd<? super C229438zT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mixVideosViewModel;
        this.LJLJI = c76732zl;
        this.LJLJJI = c72242sW;
        this.LJLJJL = i;
        this.LJLJJLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C229438zT(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C141335gf.LIZJ(obj2);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            MixVideosViewModel mixVideosViewModel = this.LJLILLLLZI;
            C229468zW c229468zW = mixVideosViewModel.LJLIL.LIZ;
            String str = mixVideosViewModel.LJLJJI;
            String str2 = mixVideosViewModel.LJLJJL;
            int i3 = this.LJLJI.element;
            String mv0 = mixVideosViewModel.mv0();
            String kv0 = this.LJLILLLLZI.kv0();
            long j = this.LJLJJI.element;
            Integer num = new Integer(this.LJLJJL);
            MixVideosViewModel mixVideosViewModel2 = this.LJLILLLLZI;
            boolean z = mixVideosViewModel2.LL;
            if (mixVideosViewModel2.LLD) {
                i = 2;
            } else {
                i = 1;
            }
            this.LJLIL = 1;
            obj2 = c229468zW.LJJJIL(str, str2, j, i3, mv0, kv0, z, num, i);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        final MixVideosViewModel mixVideosViewModel3 = this.LJLILLLLZI;
        final C76732zl c76732zl = this.LJLJI;
        final long j2 = this.LJLJJLL;
        InterfaceC64672gJ<XGX<C229538zd>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<C229538zd>>() { // from class: X.8zY
            @Override // X.InterfaceC64672gJ
            public final Object emit(XGX<C229538zd> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                Object LJI;
                XGX<C229538zd> xgx2 = xgx;
                if ((xgx2 instanceof XGW) && (LJI = XKX.LJI(C36636EZk.LIZ, new C229478zX(MixVideosViewModel.this, xgx2, c76732zl, j2, null), interfaceC67352kd)) == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    return LJI;
                }
                return C76800UCe.LIZ;
            }
        };
        this.LJLIL = 2;
        if (((InterfaceC65462ha) obj2).collect(interfaceC64672gJ, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
