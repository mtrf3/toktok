package X;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* renamed from: X.SzQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73900SzQ<R, T> implements InterfaceC48038ItG<T, R> {
    public final /* synthetic */ C73897SzN LJLIL;

    public C73900SzQ(C73897SzN c73897SzN) {
        this.LJLIL = c73897SzN;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.lang.Object] */
    @Override // X.InterfaceC48038ItG
    public final R apply(T t) {
        R apply = this.LJLIL.LJLILLLLZI.apply(new Object[]{t});
        C73320Sq4.LIZ(apply, "The zipper returned a null value");
        return apply;
    }
}
