package X;

import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;

/* renamed from: X.QEq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66672QEq extends NetworkExceptionImpl {
    @Override // com.ttnet.org.chromium.net.impl.NetworkExceptionImpl, X.AbstractC66670QEo
    public boolean immediatelyRetryable() {
        int i = this.mCronetInternalErrorCode;
        if (i != -358 && i != -352) {
            return super.immediatelyRetryable();
        }
        return true;
    }

    public C66672QEq(String str, int i, int i2) {
        super(str, i, i2);
    }
}
