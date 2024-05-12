package X;

import java.io.InputStream;
import java.io.SequenceInputStream;

/* renamed from: X.EsR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37795EsR extends SequenceInputStream {
    @Override // java.io.SequenceInputStream, java.io.InputStream
    public final int available() {
        return 0;
    }

    public C37795EsR(InputStream inputStream, C37796EsS c37796EsS) {
        super(c37796EsS, inputStream);
    }
}
