package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.qna.repo.TranslationContent;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.repo.QnaTranslator$translate$1", f = "QnaTranslator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.T7c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74120T7c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C74119T7b LJLILLLLZI;
    public final /* synthetic */ List<TranslationContent> LJLJI;
    public final /* synthetic */ InterfaceC74129T7l LJLJJI;
    public final /* synthetic */ C69605RTl LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74120T7c(String str, C74119T7b c74119T7b, List<TranslationContent> list, InterfaceC74129T7l interfaceC74129T7l, C69605RTl c69605RTl, String str2, String str3, InterfaceC67352kd<? super C74120T7c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = c74119T7b;
        this.LJLJI = list;
        this.LJLJJI = interfaceC74129T7l;
        this.LJLJJL = c69605RTl;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74120T7c(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C76L LJFF = TranslationServiceImpl.LJJIJ().LJFF(2, this.LJLIL, GsonProtectorUtils.toJson(this.LJLILLLLZI.LIZ, this.LJLJI));
        C74121T7d c74121T7d = new C74121T7d(this.LJLJJI, this.LJLJJL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJL);
        LJFF.LJFF(new RunnableC65751PrH(LJFF, c74121T7d), ExecutorC142245i8.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
