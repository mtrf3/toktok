package X;

import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$setCurTopTabList$1", f = "SlideGuideViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66172ij extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<InterfaceC54080LKi> LJLIL;
    public final /* synthetic */ SlideGuideViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66172ij(List<? extends InterfaceC54080LKi> list, SlideGuideViewModel slideGuideViewModel, InterfaceC67352kd<? super C66172ij> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = slideGuideViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66172ij(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List LLJI = ORZ.LLJI(this.LJLIL);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC54080LKi) it.next()).tag());
        }
        ((ArrayList) this.LJLILLLLZI.LJLLLLLL).clear();
        ((ArrayList) this.LJLILLLLZI.LJLLLLLL).addAll(arrayList);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
