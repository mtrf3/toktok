package X;

import Y.AfS56S0100000_4;
import com.ss.android.ugc.aweme.anchor.AddAnchorViewModel;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.AnchorLinkValidateApi;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkValidateResult;
import fjb.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.anchor.AddAnchorViewModel$editLink$2", f = "AddAnchorViewModel.kt", l = {100}, m = "invokeSuspend")
/* renamed from: X.9Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237819Uz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AddAnchorViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237819Uz(AddAnchorViewModel addAnchorViewModel, String str, InterfaceC67352kd<? super C237819Uz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = addAnchorViewModel;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237819Uz(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.9Ri] */
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(2000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJLIL = s.LJZI(this.LJLJI).toString();
        final AddAnchorViewModel addAnchorViewModel = this.LJLILLLLZI;
        addAnchorViewModel.setState(C236839Rf.LJLIL);
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            addAnchorViewModel.setState(C236849Rg.LJLIL);
        } else {
            ((C73318Sq2) addAnchorViewModel.LJLJI.getValue()).LIZLLL();
            C73318Sq2 c73318Sq2 = (C73318Sq2) addAnchorViewModel.LJLJI.getValue();
            AnchorLinkValidateApi.LIZ.getClass();
            C73596SuW c73596SuW = new C73596SuW(C9V0.LIZ().validate(EnumC42934Gt8.ARTICLE_PHOTO_MODE.getTYPE(), addAnchorViewModel.LJLIL).LJIIL(C73969T1h.LIZIZ()).LJIJJ(T16.LIZ()), C73674Svm.LJI);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ?? r8 = new InterfaceC73504St2() { // from class: X.9Ri
                @Override // X.InterfaceC73504St2
                public final void LIZ(InterfaceC73509St7<? super LinkValidateResult> it) {
                    o.LJIIIZ(it, "it");
                    AddAnchorViewModel.this.setState(C236859Rh.LJLIL);
                }
            };
            AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
            C73320Sq4.LIZ(timeUnit, "unit is null");
            C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
            c73318Sq2.LIZ(new C73584SuK(c73596SuW, new C73520StI(Math.max(0L, 30000L), timeUnit, abstractC73946T0k), r8).LJIIIIZZ(new AfS56S0100000_4(addAnchorViewModel, 76)).LJIILLIIL(new AfS56S0100000_4(addAnchorViewModel, 77)));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
