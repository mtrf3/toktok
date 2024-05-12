package X;

/* renamed from: X.Sw8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73696Sw8<T> extends AbstractC73672Svk<T> {
    public final T[] LJLIL;

    public C73696Sw8(T[] tArr) {
        this.LJLIL = tArr;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        T[] tArr = this.LJLIL;
        C73695Sw7 c73695Sw7 = new C73695Sw7(interfaceC116954iR, tArr);
        interfaceC116954iR.onSubscribe(c73695Sw7);
        if (c73695Sw7.LJLJJI) {
            return;
        }
        int length = tArr.length;
        for (int i = 0; i < length && !c73695Sw7.LJLJJL; i++) {
            T t = tArr[i];
            if (t == null) {
                c73695Sw7.LJLIL.onError(new NullPointerException(C0NY.LIZIZ("The ", i, "th element is null")));
                return;
            }
            c73695Sw7.LJLIL.onNext(t);
        }
        if (c73695Sw7.LJLJJL) {
            return;
        }
        c73695Sw7.LJLIL.onComplete();
    }
}
