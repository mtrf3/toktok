package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$callApi$2$1$1", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.36U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36U extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C784636c LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36U(C784636c c784636c, InterfaceC67352kd<? super C36U> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c784636c;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36U(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC109664Sc inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
        if (inboxAdapterService == null) {
            return null;
        }
        FragmentManager supportFragmentManager = ((ActivityC45651qj) this.LJLIL.LJLIL).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
        inboxAdapterService.LIZJ(supportFragmentManager, C36W.BLOCK, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
