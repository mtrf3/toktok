package X;

/* loaded from: classes7.dex */
public final class FJJ<T> implements FTR<T> {
    public final String LIZ;
    public final T LIZIZ;

    @Override // X.FTR
    public final T getValue() {
        return this.LIZIZ;
    }

    @Override // X.FTR
    public final String name() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FJJ(Class cls, String str, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
    }
}
