package X;

import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$onCreate$1$7$1", f = "RecordAddYoursStickerComponent.kt", l = {264}, m = "invokeSuspend")
/* renamed from: X.6UQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C6UV LJLIL;
    public C6UY LJLILLLLZI;
    public C6QO LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C6QO LJLJJL;
    public final /* synthetic */ C6UV LJLJJLL;
    public final /* synthetic */ C6UY LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6UQ(C6QO c6qo, C6UV c6uv, C6UY c6uy, InterfaceC67352kd<? super C6UQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c6qo;
        this.LJLJJLL = c6uv;
        this.LJLJL = c6uy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6UQ(this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C6QO c6qo;
        C6UV c6uv;
        C6UY c6uy;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                c6qo = this.LJLJI;
                c6uy = this.LJLILLLLZI;
                c6uv = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c6qo = this.LJLJJL;
            if (c6qo != null) {
                c6uv = this.LJLJJLL;
                c6uy = this.LJLJL;
                this.LJLIL = c6uv;
                this.LJLILLLLZI = c6uy;
                this.LJLJI = c6qo;
                this.LJLJJI = 1;
                if (c6qo.LJIJJLI(false, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        String string = C78688UuS.LJIJJ(c6uy).getResources().getString(R.string.bd1);
        o.LJIIIIZZ(string, "activity.resources.getSt…aPage_inviteFriends_body)");
        c6uv.cP(true, string, c6qo);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
