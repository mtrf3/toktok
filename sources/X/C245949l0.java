package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.aweme.userservice.UserService;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM$blockUser$1", f = "UserProfileBlockVM.kt", l = {30}, m = "invokeSuspend")
/* renamed from: X.9l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245949l0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UserProfileBlockVM LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C245949l0(UserProfileBlockVM userProfileBlockVM, String str, String str2, int i, InterfaceC67352kd<? super C245949l0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userProfileBlockVM;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C245949l0(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC245959l1 interfaceC245959l1 = (InterfaceC245959l1) this.LJLILLLLZI.LJLIL.getValue().getOperator();
                String str = this.LJLJI;
                String str2 = this.LJLJJI;
                int i3 = this.LJLJJL;
                this.LJLIL = 1;
                obj = interfaceC245959l1.LJJIJIIJI(i3, str, str2);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            BlockStruct blockStruct = (BlockStruct) obj;
            NextLiveData<BlockStatus> LJII = UserService.LIZ().LJII();
            String str3 = this.LJLJI;
            if (blockStruct != null) {
                i = blockStruct.blockStatus;
            } else {
                i = 0;
            }
            LJII.postValue(new BlockStatus(str3, i));
            this.LJLILLLLZI.setState(new AqS170S0100000_4(blockStruct, 1054));
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new AqS170S0100000_4(e, 1055));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
