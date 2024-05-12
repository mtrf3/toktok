package X;

import Y.ARunnableS20S0200000_1;
import Y.IDdS378S0100000_6;
import com.bytedance.retrofit2.RequestFactory;
import com.bytedance.retrofit2.SsHttpCall;
import kotlin.jvm.internal.AqS177S0100000_11;

/* renamed from: X.Pk6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65306Pk6<ResponseT> extends AbstractC64962PeY<ResponseT, Object> {
    public final InterfaceC65014PfO<ResponseT, InterfaceC37276Ek4<ResponseT>> LIZIZ;
    public final boolean LIZJ;

    public C65306Pk6(RequestFactory requestFactory, InterfaceC65014PfO interfaceC65014PfO) {
        super(requestFactory);
        this.LIZIZ = interfaceC65014PfO;
        this.LIZJ = false;
    }

    @Override // X.AbstractC64962PeY
    public final Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr) {
        InterfaceC37276Ek4 interfaceC37276Ek4 = (InterfaceC37276Ek4) this.LIZIZ.LIZIZ(ssHttpCall);
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) objArr[objArr.length - 1];
        try {
            if (this.LIZJ) {
                XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
                xks.LJIIL();
                xks.LJIILIIL(new AqS177S0100000_11(interfaceC37276Ek4, 8));
                interfaceC37276Ek4.enqueue(new C37275Ek3(xks));
                return xks.LJIIJJI();
            }
            XKS xks2 = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
            xks2.LJIIL();
            xks2.LJIILIIL(new AqS177S0100000_11(interfaceC37276Ek4, 7));
            interfaceC37276Ek4.enqueue(new IDdS378S0100000_6(xks2, 3));
            return xks2.LJIIJJI();
        } catch (Exception e) {
            C78613UtF.LIZ.dispatch(interfaceC67352kd.getContext(), new ARunnableS20S0200000_1(interfaceC67352kd, e, 2));
            return EnumC58928NAu.COROUTINE_SUSPENDED;
        }
    }
}
