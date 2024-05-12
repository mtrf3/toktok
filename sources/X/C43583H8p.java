package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import fjb.a;
import kotlin.jvm.internal.AqS157S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerProcessor$start$1", f = "CreationComposerProcessor.kt", l = {27}, m = "invokeSuspend")
/* renamed from: X.H8p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43583H8p extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ CreationConfigModelCompat LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43583H8p(CreationConfigModelCompat creationConfigModelCompat, Context context, InterfaceC67352kd<? super C43583H8p> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = creationConfigModelCompat;
        this.LJLJJI = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C43583H8p c43583H8p = new C43583H8p(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c43583H8p.LJLILLLLZI = obj;
        return c43583H8p;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C43575H8h c43575H8h = new C43575H8h(this.LJLJI);
            Context context = this.LJLJJI;
            this.LJLIL = 1;
            obj = c43575H8h.LIZ(context, interfaceC70422pa, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Intent intent = (Intent) obj;
        if (intent == null) {
            C6QQ.LIZ(new AqS157S0100000_7(this.LJLJI, 748));
        } else if (this.LJLJI.getMusicShareStoryData() != null) {
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C43584H8q(this.LJLJJI, intent, this.LJLJI, null), 3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
