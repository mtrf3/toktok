package X;

import com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment;
import fjb.a;
import kotlin.jvm.internal.AqS62S1100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.following.ui.FollowRelationTabFragment$newAuthDialogCenter$1", f = "FollowRelationTabFragment.kt", l = {641}, m = "invokeSuspend")
/* renamed from: X.2py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70662py extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FollowRelationTabFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70662py(FollowRelationTabFragment followRelationTabFragment, String str, InterfaceC67352kd<? super C70662py> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = followRelationTabFragment;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70662py c70662py = new C70662py(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c70662py.LJLILLLLZI = obj;
        return c70662py;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C3 LIZJ;
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
            InterfaceC70542pm LJJIII = C78609UtB.LJJIII(this.LJLJI, new AqS62S1100000_9((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, 1));
            if (LJJIII != null && (LIZJ = ((C77202URq) LJJIII).LIZJ()) != null) {
                this.LJLIL = 1;
                if (V1M.LJII(LIZJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
