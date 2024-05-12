package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$follow$1$2", f = "UserProfileFollowVM.kt", l = {913}, m = "invokeSuspend")
/* renamed from: X.Mdy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57282Mdy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C57285Me1 LJLILLLLZI;
    public final /* synthetic */ UserProfileFollowVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57282Mdy(C57285Me1 c57285Me1, UserProfileFollowVM userProfileFollowVM, InterfaceC67352kd<? super C57282Mdy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c57285Me1;
        this.LJLJI = userProfileFollowVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57282Mdy(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C57368MfM c57368MfM;
        C57364MfI c57364MfI;
        Integer followFrom;
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
            C57285Me1 c57285Me1 = this.LJLILLLLZI;
            Aweme aweme = c57285Me1.LJII;
            String str = c57285Me1.LJIIIIZZ;
            C26175APb iv0 = this.LJLJI.iv0();
            if (iv0 != null && (c57368MfM = iv0.LJLJLJ) != null && (c57364MfI = c57368MfM.LJFF) != null && (followFrom = c57364MfI.getFollowFrom()) != null) {
                this.LJLILLLLZI.LIZLLL = followFrom.intValue();
            }
            C57287Me3 LIZ = C77266UUc.LIZIZ.getRelationService().LIZ(this.LJLILLLLZI);
            C57281Mdx c57281Mdx = new C57281Mdx(this.LJLILLLLZI, aweme, this.LJLJI, str);
            this.LJLIL = 1;
            if (LIZ.collect(c57281Mdx, this) == enumC58928NAu) {
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
