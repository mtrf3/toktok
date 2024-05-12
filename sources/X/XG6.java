package X;

import java.io.IOException;

/* loaded from: classes16.dex */
public final class XG6 extends IOException {
    public XG6() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public XG6(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public XG6(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }
}
