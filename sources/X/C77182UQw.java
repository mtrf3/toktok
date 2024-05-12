package X;

import fjb.a;
import kotlin.jvm.internal.AqS0S2210000_13;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friends.utils.PermissionDialogManager$newAuthPipelineForContact$1", f = "PermissionDialogManager.kt", l = {1083}, m = "invokeSuspend")
/* renamed from: X.UQw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77182UQw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, String> LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ UR7 LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ URA LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77182UQw(java.util.Map<String, String> map, ActivityC45651qj activityC45651qj, String str, String str2, UR7 ur7, boolean z, URA ura, InterfaceC67352kd<? super C77182UQw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = map;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = ur7;
        this.LJLJLJ = z;
        this.LJLJLLL = ura;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77182UQw c77182UQw = new C77182UQw(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c77182UQw.LJLILLLLZI = obj;
        return c77182UQw;
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
            boolean LJ = o.LJ(this.LJLJI.get("is_followed_pop_up"), "1");
            C3C3 LIZ = ((USE) C77125UOr.LJII(this.LJLJJI, new AqS0S2210000_13(interfaceC70422pa, this.LJLJJL, this.LJLJJLL, this.LJLJL, LJ, 0))).LIZ();
            C77184UQy c77184UQy = new C77184UQy(this.LJLJJL, this.LJLJLJ, this.LJLJLLL, this.LJLJL, LJ);
            this.LJLIL = 1;
            if (LIZ.collect(c77184UQy, this) == enumC58928NAu) {
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
