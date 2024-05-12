package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ugc.effectcreator.main.MainViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainViewModel$setupAndInit$1", f = "MainViewModel.kt", l = {65}, m = "invokeSuspend")
/* renamed from: X.amg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94790amg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MainViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94790amg(MainViewModel mainViewModel, String str, long j, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mainViewModel;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94790amg(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            StateViewModel.hv0(this.LJLILLLLZI.LJLJI, EnumC93933aYr.Loading);
            StateViewModel.hv0(this.LJLILLLLZI.LJLILLLLZI, "");
            C93930aYo c93930aYo = new C93930aYo(this.LJLJI);
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C94906aoY(c93930aYo, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C93928aYm c93928aYm = (C93928aYm) obj;
        if (C93923aYh.LIZ[c93928aYm.LIZJ.ordinal()] != 1) {
            if (c93928aYm.LIZIZ.length() == 0 || c93928aYm.LIZ.length() == 0) {
                StateViewModel.hv0(this.LJLILLLLZI.LJLJI, EnumC93933aYr.Fail);
            } else {
                StateViewModel.hv0(this.LJLILLLLZI.LJLJI, EnumC93933aYr.Success);
                StateViewModel.hv0(this.LJLILLLLZI.LJLILLLLZI, c93928aYm.LIZ);
                MainViewModel mainViewModel = this.LJLILLLLZI;
                long j = this.LJLJJI;
                boolean z = this.LJLJJL;
                mainViewModel.getClass();
                long currentTimeMillis = System.currentTimeMillis() - j;
                StatisticReporter LIZ = C93670aUc.LIZ();
                if (LIZ != null) {
                    OSZ[] oszArr = new OSZ[3];
                    oszArr[0] = new OSZ("time_cost", String.valueOf(currentTimeMillis));
                    if (z) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = "1";
                    }
                    oszArr[1] = new OSZ("is_first", str);
                    oszArr[2] = new OSZ("ame_enter_from", mainViewModel.LJLL);
                    LIZ.onEvent("ame_install", C113554cx.LJJL(oszArr));
                }
            }
        } else {
            StateViewModel.hv0(this.LJLILLLLZI.LJLJI, EnumC93933aYr.Fail);
        }
        return C76800UCe.LIZ;
    }
}
