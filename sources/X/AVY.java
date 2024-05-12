package X;

/* loaded from: classes5.dex */
public final class AVY<T> implements InterfaceC86003Zc {
    public static final AVY<T> LJLIL = new AVY<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<String> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(((RBX) HG3.LJIILL()).queryUserPermission().toString());
        interfaceC73573Su9.onComplete();
    }
}
