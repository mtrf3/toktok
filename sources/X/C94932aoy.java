package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$showHintSelectionDialog$1", f = "MainFragment.kt", l = {952}, m = "invokeSuspend")
/* renamed from: X.aoy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94932aoy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ MainFragment LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94932aoy(MainFragment mainFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = mainFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94932aoy(this.LJLJJL, completion);
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
            xl = this.LJLJJL.xl();
            MainFragment mainFragment = this.LJLJJL;
            this.LJLIL = xl;
            this.LJLILLLLZI = xl;
            obj2 = "project_size";
            this.LJLJI = "project_size";
            this.LJLJJI = 1;
            mainFragment.getClass();
            obj = C48841JEv.LJI(new C94920aom(mainFragment, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
            map = xl;
        }
        xl.put(obj2, String.valueOf(((Number) obj).longValue()));
        map.put("ame_page", "preview_page");
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != 0) {
            LIZ.onEvent("show_ame_effect_hint_pop_up", map);
        }
        this.LJLJJL.wl(map);
        StatisticReporter LIZ2 = C93670aUc.LIZ();
        if (LIZ2 != 0) {
            LIZ2.onEvent("click_ame_effect_hint_menu", map);
        }
        return C76800UCe.LIZ;
    }
}
