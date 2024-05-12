package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$showHintSelectionDialog$3$1", f = "MainFragment.kt", l = {968}, m = "invokeSuspend")
/* renamed from: X.ap1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94935ap1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ IDqS419S0100000_42 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94935ap1(IDqS419S0100000_42 iDqS419S0100000_42, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = iDqS419S0100000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94935ap1(this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Map xl;
        Object obj2;
        java.util.Map map;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LJLJI;
                xl = (java.util.Map) this.LJLILLLLZI;
                map = (java.util.Map) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            MainFragment mainFragment = (MainFragment) this.LJLJJL.l0;
            xl = mainFragment.xl();
            mainFragment.wl(xl);
            MainFragment mainFragment2 = (MainFragment) this.LJLJJL.l0;
            this.LJLIL = xl;
            this.LJLILLLLZI = xl;
            obj2 = "project_size";
            this.LJLJI = "project_size";
            this.LJLJJI = 1;
            mainFragment2.getClass();
            obj = C48841JEv.LJI(new C94920aom(mainFragment2, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
            map = xl;
        }
        xl.put(obj2, String.valueOf(((Number) obj).longValue()));
        map.put("ame_page", "preview_page");
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != 0) {
            LIZ.onEvent("select_ame_effect_hint", map);
        }
        return C76800UCe.LIZ;
    }
}
