package X;

import Y.ALAdapterS6S0100000_8;
import Y.AUListenerS70S0101000_8;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM$startShowAnimator$1", f = "SearchContainerHeaderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Jgc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49802Jgc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchContainerHeaderVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49802Jgc(SearchContainerHeaderVM searchContainerHeaderVM, InterfaceC67352kd<? super C49802Jgc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchContainerHeaderVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C49802Jgc(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SearchContainerHeaderVM searchContainerHeaderVM = this.LJLIL;
        int[] iArr = new int[2];
        Integer num = (Integer) searchContainerHeaderVM.LJLLJ.getValue();
        if (num == null) {
            num = new Integer(0);
        }
        iArr[0] = num.intValue();
        iArr[1] = 0;
        searchContainerHeaderVM.LJZ = ValueAnimator.ofInt(iArr);
        SearchContainerHeaderVM searchContainerHeaderVM2 = this.LJLIL;
        ValueAnimator valueAnimator = searchContainerHeaderVM2.LJZ;
        if (valueAnimator != null) {
            valueAnimator.setDuration(300L);
            valueAnimator.setInterpolator(C55953Lxd.LIZLLL());
            valueAnimator.addUpdateListener(new AUListenerS70S0101000_8(searchContainerHeaderVM2, 0));
            valueAnimator.addListener(new ALAdapterS6S0100000_8(searchContainerHeaderVM2, 4));
            valueAnimator.start();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
