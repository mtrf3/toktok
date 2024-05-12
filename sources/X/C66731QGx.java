package X;

/* renamed from: X.QGx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66731QGx extends Exception {
    public C66731QGx() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66731QGx(String str) {
        super(str);
        QH7.LJFF("Detail message must not be empty", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66731QGx(String str, Throwable th) {
        super(str, th);
        QH7.LJFF("Detail message must not be empty", str);
    }
}
