package X;

/* renamed from: X.Sy3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73815Sy3<T> extends AbstractC73672Svk<T> {
    public final InterfaceC73650SvO<? extends T> LJLIL;

    public C73815Sy3(InterfaceC73650SvO<? extends T> interfaceC73650SvO) {
        this.LJLIL = interfaceC73650SvO;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL.subscribe(new C73814Sy2(interfaceC116954iR));
    }
}
