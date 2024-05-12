package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleSingleMediaSystemShare$1$1", f = "SystemShareActivity.kt", l = {265}, m = "invokeSuspend")
/* renamed from: X.2qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70812qD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SystemShareActivity LJLILLLLZI;
    public final /* synthetic */ android.net.Uri LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70812qD(SystemShareActivity systemShareActivity, android.net.Uri uri, InterfaceC67352kd<? super C70812qD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = systemShareActivity;
        this.LJLJI = uri;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70812qD(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            SystemShareActivity systemShareActivity = this.LJLILLLLZI;
            android.net.Uri it = this.LJLJI;
            o.LJIIIIZZ(it, "it");
            String LIZJ = C36949Een.LIZJ(systemShareActivity, it, this.LJLILLLLZI.LJLJLJ, false);
            if (LIZJ == null) {
                LIZJ = "";
            }
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C45834Hyo c45834Hyo = new C45834Hyo(LIZJ, this.LJLJI, this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c45834Hyo, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
