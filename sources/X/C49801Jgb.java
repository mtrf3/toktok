package X;

import Y.ALAdapterS6S0100000_8;
import Y.AUListenerS70S0101000_8;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM$startHideAnimatorDelay$1", f = "SearchContainerHeaderVM.kt", l = {261}, m = "invokeSuspend")
/* renamed from: X.Jgb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49801Jgb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchContainerHeaderVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49801Jgb(SearchContainerHeaderVM searchContainerHeaderVM, InterfaceC67352kd<? super C49801Jgb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchContainerHeaderVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49801Jgb(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            this.LJLILLLLZI.LL = true;
            long intValue = ((Number) C49806Jgg.LIZ.getValue()).intValue();
            this.LJLIL = 1;
            if (C1JD.LIZJ(intValue, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SearchContainerHeaderVM searchContainerHeaderVM = this.LJLILLLLZI;
        searchContainerHeaderVM.LL = false;
        if (searchContainerHeaderVM.LJLLL || !searchContainerHeaderVM.LLFFF) {
            return C76800UCe.LIZ;
        }
        searchContainerHeaderVM.LJLLLL = EnumC49652JeC.START;
        searchContainerHeaderVM.LJZI.setValue(Boolean.TRUE);
        SearchContainerHeaderVM searchContainerHeaderVM2 = this.LJLILLLLZI;
        int[] iArr = new int[2];
        iArr[0] = 0;
        Integer num = (Integer) searchContainerHeaderVM2.LJLLJ.getValue();
        if (num == null) {
            num = new Integer(0);
        }
        iArr[1] = num.intValue();
        searchContainerHeaderVM2.LJLZ = ValueAnimator.ofInt(iArr);
        SearchContainerHeaderVM searchContainerHeaderVM3 = this.LJLILLLLZI;
        ValueAnimator valueAnimator = searchContainerHeaderVM3.LJLZ;
        if (valueAnimator != null) {
            valueAnimator.setDuration(300L);
            valueAnimator.setInterpolator(C55953Lxd.LIZLLL());
            valueAnimator.addUpdateListener(new AUListenerS70S0101000_8(searchContainerHeaderVM3, 3));
            valueAnimator.addListener(new ALAdapterS6S0100000_8(searchContainerHeaderVM3, 15));
            valueAnimator.start();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
