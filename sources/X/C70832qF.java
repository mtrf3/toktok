package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMediaType$1", f = "SystemShareActivity.kt", l = {316}, m = "invokeSuspend")
/* renamed from: X.2qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70832qF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SystemShareActivity LJLILLLLZI;
    public final /* synthetic */ android.net.Uri LJLJI;
    public final /* synthetic */ EnumC70862qI LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70832qF(SystemShareActivity systemShareActivity, android.net.Uri uri, EnumC70862qI enumC70862qI, InterfaceC67352kd<? super C70832qF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = systemShareActivity;
        this.LJLJI = uri;
        this.LJLJJI = enumC70862qI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70832qF(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            android.net.Uri uriPath = this.LJLJI;
            o.LJIIIIZZ(uriPath, "uriPath");
            String LIZJ = C36949Een.LIZJ(systemShareActivity, uriPath, this.LJLILLLLZI.LJLJLJ, true);
            if (LIZJ == null) {
                LIZJ = "";
            }
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C70842qG c70842qG = new C70842qG(this.LJLILLLLZI, this.LJLJJI, LIZJ, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c70842qG, this) == enumC58928NAu) {
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