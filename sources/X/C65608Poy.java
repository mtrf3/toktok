package X;

/* renamed from: X.Poy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65608Poy<T> extends AbstractC65598Poo<T> {
    public static final C65608Poy LJLJJL = new C65608Poy(new Object[0]);
    public final T[] LJLJI;
    public final int LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C65608Poy(Object[] objArr) {
        super(0, 0);
        this.LJLJI = objArr;
        this.LJLJJI = 0;
    }

    @Override // X.AbstractC65598Poo
    public final T LIZ(int i) {
        return this.LJLJI[this.LJLJJI + i];
    }
}
