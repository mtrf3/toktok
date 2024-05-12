package X;

/* renamed from: X.QRq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67010QRq<T> {
    public volatile T LIZ;

    public abstract C67009QRp LJ();

    public final T LJFF(Object... objArr) {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = (T) LJ();
                }
            }
        }
        return this.LIZ;
    }
}
