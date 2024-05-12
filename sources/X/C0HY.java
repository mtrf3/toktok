package X;

/* renamed from: X.0HY, reason: invalid class name */
/* loaded from: classes.dex */
public class C0HY {
    public String LIZ;
    public String LIZIZ;

    public final C0HZ LIZ() {
        if (!"first_party".equals(this.LIZIZ)) {
            if (this.LIZ != null) {
                if (this.LIZIZ != null) {
                    return new C0HZ(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
