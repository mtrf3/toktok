package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$gotoPublishPage$1$etData$1", f = "MainFragment.kt", l = {1383, 1385}, m = "invokeSuspend")
/* renamed from: X.amb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94785amb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super EffectPackageData>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C94786amc LJLJI;
    public final /* synthetic */ C68322mC LJLJJI;
    public final /* synthetic */ C68322mC LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94785amb(C94786amc c94786amc, C68322mC c68322mC, C68322mC c68322mC2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c94786amc;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94785amb(this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super EffectPackageData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EffectPackageData Ml;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Ml = (EffectPackageData) this.LJLIL;
                    C141335gf.LIZJ(obj);
                    C93677aUj.LJIIIIZZ((String) this.LJLJJL.element, Ml);
                    return Ml;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            MainFragment mainFragment = this.LJLJI.LJLJI;
            String str = (String) this.LJLJJI.element;
            this.LJLILLLLZI = 1;
            mainFragment.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C94914aog(str, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        long longValue = ((Number) obj).longValue();
        Ml = this.LJLJI.LJLJI.Ml();
        C94010aa6.LIZIZ(Ml, 2);
        Ml.LJLJL = longValue;
        MainFragment mainFragment2 = this.LJLJI.LJLJI;
        String str2 = (String) this.LJLJJI.element;
        this.LJLIL = Ml;
        this.LJLILLLLZI = 2;
        if (mainFragment2.Hl(Ml, str2, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        C93677aUj.LJIIIIZZ((String) this.LJLJJL.element, Ml);
        return Ml;
    }
}
