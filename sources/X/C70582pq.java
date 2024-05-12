package X;

import android.content.Context;
import fjb.a;
import kotlin.jvm.internal.AqS62S1100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friends.assem.MainPageFriendsAssem$newAuthDialogCenter$1", f = "MainPageFriendsAssem.kt", l = {81}, m = "invokeSuspend")
/* renamed from: X.2pq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70582pq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70582pq(Context context, String str, InterfaceC67352kd<? super C70582pq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = context;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70582pq c70582pq = new C70582pq(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c70582pq.LJLILLLLZI = obj;
        return c70582pq;
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
            InterfaceC70542pm LJJII = C78609UtB.LJJII(this.LJLJI, new AqS62S1100000_9((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, 4));
            if (LJJII != null && (LIZJ = ((C77202URq) LJJII).LIZJ()) != null) {
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
