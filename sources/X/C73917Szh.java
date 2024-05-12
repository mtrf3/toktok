package X;

/* JADX INFO: Add missing generic type declarations: [V, K1, K] */
/* renamed from: X.Szh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73917Szh<K, K1, V> extends AbstractC65781Prl implements InterfaceC88471Ynr<K, V, K1> {
    public static final C73917Szh LJLIL = new C73917Szh();

    public C73917Szh() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final K1 invoke(K k, V v) {
        if (!(k instanceof Object) || k == 0) {
            throw new RuntimeException();
        }
        return k;
    }
}
