package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.ShareActionHelperKt$showDeleteConfirmDialog$6", f = "ShareActionHelper.kt", l = {148}, m = "invokeSuspend")
/* renamed from: X.2h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65112h1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ InterfaceC72642tA<C50420Jqa> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65112h1(Aweme aweme, Context context, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, String str, String str2, String str3, String str4, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C65112h1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = aweme;
        this.LJLJI = context;
        this.LJLJJI = interfaceC72642tA;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65112h1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
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
            Aweme aweme = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = C227738wj.LIZIZ(aweme, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C227738wj.LJII(((Boolean) obj).booleanValue(), this.LJLJI, this.LJLJJI, this.LJLILLLLZI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
