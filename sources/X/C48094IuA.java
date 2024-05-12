package X;

import java.io.IOException;

/* renamed from: X.IuA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48094IuA extends IOException {
    public int errorCode;

    public C48094IuA(String str) {
        super(str);
        this.errorCode = 1;
    }

    public C48094IuA(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
