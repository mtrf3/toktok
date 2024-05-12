package X;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* renamed from: X.SzP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73899SzP<R, T> implements InterfaceC48038ItG<T, R> {
    public final /* synthetic */ C73898SzO LJLIL;

    public C73899SzP(C73898SzO c73898SzO) {
        this.LJLIL = c73898SzO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.lang.Object] */
    @Override // X.InterfaceC48038ItG
    public final R apply(T t) {
        R apply = this.LJLIL.LJLILLLLZI.apply(new Object[]{t});
        C73320Sq4.LIZ(apply, "The zipper returned a null value");
        return apply;
    }
}
