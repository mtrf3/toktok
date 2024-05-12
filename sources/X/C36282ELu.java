package X;

import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$findIntersect$3", f = "ContactFilterByPsi.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ELu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36282ELu extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C36281ELt>, Object> {
    public final /* synthetic */ C36283ELv LJLIL;
    public final /* synthetic */ PsiUploadEncryptContactResponseV2 LJLILLLLZI;
    public final /* synthetic */ C36281ELt LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36282ELu(C36283ELv c36283ELv, PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2, C36281ELt c36281ELt, InterfaceC67352kd<? super C36282ELu> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c36283ELv;
        this.LJLILLLLZI = psiUploadEncryptContactResponseV2;
        this.LJLJI = c36281ELt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36282ELu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C36281ELt> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C36283ELv c36283ELv = this.LJLIL;
        PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2 = this.LJLILLLLZI;
        C36281ELt c36281ELt = this.LJLJI;
        c36283ELv.getClass();
        C36283ELv.LIZJ(c36283ELv, c36281ELt.LIZ, psiUploadEncryptContactResponseV2.getBloomFilterBitsEmail(), psiUploadEncryptContactResponseV2.getBloomFilterMEmail(), psiUploadEncryptContactResponseV2.getBloomFilterKEmail(), (byte[]) c36283ELv.LIZJ.getValue());
        C36283ELv.LIZJ(c36283ELv, c36281ELt.LIZIZ, psiUploadEncryptContactResponseV2.getBloomFilterBits(), psiUploadEncryptContactResponseV2.getBloomFilterM(), psiUploadEncryptContactResponseV2.getBloomFilterK(), (byte[]) c36283ELv.LIZJ.getValue());
        return c36281ELt;
    }
}
