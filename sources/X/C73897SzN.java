package X;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* renamed from: X.SzN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73897SzN<T, R> extends AbstractC73638SvC<R> {
    public final Iterable<? extends InterfaceC73471SsV<? extends T>> LJLIL;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLILLLLZI;

    public C73897SzN(Iterable iterable) {
        C54841Lfh c54841Lfh = C54841Lfh.LJLILLLLZI;
        this.LJLIL = iterable;
        this.LJLILLLLZI = c54841Lfh;
    }

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super R> interfaceC73463SsN) {
        InterfaceC73471SsV[] interfaceC73471SsVArr = new InterfaceC73471SsV[8];
        try {
            int i = 0;
            for (InterfaceC73471SsV<? extends T> interfaceC73471SsV : this.LJLIL) {
                if (interfaceC73471SsV == null) {
                    EnumC73538Sta.error(new NullPointerException("One of the sources is null"), interfaceC73463SsN);
                    return;
                }
                if (i == interfaceC73471SsVArr.length) {
                    interfaceC73471SsVArr = (InterfaceC73471SsV[]) Arrays.copyOf(interfaceC73471SsVArr, (i >> 2) + i);
                }
                interfaceC73471SsVArr[i] = interfaceC73471SsV;
                i++;
            }
            if (i == 0) {
                EnumC73538Sta.error(new NoSuchElementException(), interfaceC73463SsN);
                return;
            }
            if (i == 1) {
                interfaceC73471SsVArr[0].LIZ(new C73633Sv7(interfaceC73463SsN, new C73900SzQ(this)));
                return;
            }
            C73896SzM c73896SzM = new C73896SzM(interfaceC73463SsN, i, this.LJLILLLLZI);
            interfaceC73463SsN.onSubscribe(c73896SzM);
            for (int i2 = 0; i2 < i && !c73896SzM.isDisposed(); i2++) {
                interfaceC73471SsVArr[i2].LIZ(c73896SzM.LJLJI[i2]);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            EnumC73538Sta.error(th, interfaceC73463SsN);
        }
    }
}
