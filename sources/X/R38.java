package X;

import com.bytedance.retrofit2.SsHttpCall;

/* loaded from: classes12.dex */
public final class R38<T> extends AbstractC73672Svk<C64797Pbt<T>> {
    public final InterfaceC37276Ek4<T> LJLIL;

    public R38(SsHttpCall ssHttpCall) {
        this.LJLIL = ssHttpCall;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super C64797Pbt<T>> interfaceC116954iR) {
        InterfaceC37276Ek4<T> m31clone = this.LJLIL.m31clone();
        C73402SrO c73402SrO = new C73402SrO(m31clone, interfaceC116954iR);
        interfaceC116954iR.onSubscribe(c73402SrO);
        m31clone.enqueue(c73402SrO);
    }
}
