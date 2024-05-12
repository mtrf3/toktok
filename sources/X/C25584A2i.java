package X;

import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem$setupRatingUI$1", f = "PaidContentCollectionDetailDescriptionAssem.kt", l = {1718}, m = "invokeSuspend")
/* renamed from: X.A2i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25584A2i extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CollectionDetailModel LJLILLLLZI;
    public final /* synthetic */ PaidContentCollectionDetailDescriptionAssem LJLJI;
    public final /* synthetic */ TuxTextView LJLJJI;
    public final /* synthetic */ TuxIconView LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ float LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25584A2i(CollectionDetailModel collectionDetailModel, PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem, TuxTextView tuxTextView, TuxIconView tuxIconView, long j, float f, InterfaceC67352kd<? super C25584A2i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = collectionDetailModel;
        this.LJLJI = paidContentCollectionDetailDescriptionAssem;
        this.LJLJJI = tuxTextView;
        this.LJLJJL = tuxIconView;
        this.LJLJJLL = j;
        this.LJLJL = f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25584A2i(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            C79863Bm c79863Bm = A4S.LIZIZ;
            C25586A2k c25586A2k = new C25586A2k(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
            this.LJLIL = 1;
            if (c79863Bm.collect(c25586A2k, this) == enumC58928NAu) {
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
