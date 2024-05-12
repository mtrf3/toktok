package X;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.UdH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77623UdH extends Exception {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final Exception LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final int LJLJLJ;

    public static /* synthetic */ C77623UdH copy$default(C77623UdH c77623UdH, int i, int i2, int i3, String str, Exception exc, String str2, String str3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = c77623UdH.LJLIL;
        }
        if ((i5 & 2) != 0) {
            i2 = c77623UdH.LJLILLLLZI;
        }
        if ((i5 & 4) != 0) {
            i3 = c77623UdH.LJLJI;
        }
        if ((i5 & 8) != 0) {
            str = c77623UdH.LJLJJI;
        }
        if ((i5 & 16) != 0) {
            exc = c77623UdH.LJLJJL;
        }
        if ((i5 & 32) != 0) {
            str2 = c77623UdH.LJLJJLL;
        }
        if ((i5 & 64) != 0) {
            str3 = c77623UdH.LJLJL;
        }
        if ((i5 & 128) != 0) {
            i4 = c77623UdH.LJLJLJ;
        }
        return c77623UdH.copy(i, i2, i3, str, exc, str2, str3, i4);
    }

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, Integer.valueOf(this.LJLJLJ)};
    }

    public final C77623UdH copy(int i, int i2, int i3, String serviceName, Exception exception, String productId, String orderId, int i4) {
        o.LJIIIZ(serviceName, "serviceName");
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(orderId, "orderId");
        return new C77623UdH(i, i2, i3, serviceName, exception, productId, orderId, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C77623UdH) {
            return C78966Uyw.LJIIIZ(((C77623UdH) obj).LIZ(), LIZ());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(LIZ());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C78966Uyw.LJJJLL("PayErrorInfo:%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public final int getAction() {
        return this.LJLIL;
    }

    public final int getCheckOrderRetryCount() {
        return this.LJLJLJ;
    }

    public final int getDetailCode() {
        return this.LJLJI;
    }

    public final int getErrorCode() {
        return this.LJLILLLLZI;
    }

    public final Exception getException() {
        return this.LJLJJL;
    }

    public final String getOrderId() {
        return this.LJLJL;
    }

    public final String getProductId() {
        return this.LJLJJLL;
    }

    public final String getServiceName() {
        return this.LJLJJI;
    }

    public C77623UdH(int i, int i2, int i3, String serviceName, Exception exception, String productId, String orderId, int i4) {
        o.LJIIIZ(serviceName, "serviceName");
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(orderId, "orderId");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = serviceName;
        this.LJLJJL = exception;
        this.LJLJJLL = productId;
        this.LJLJL = orderId;
        this.LJLJLJ = i4;
    }

    public /* synthetic */ C77623UdH(int i, int i2, int i3, String str, Exception exc, String str2, String str3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, exc, (i5 & 32) != 0 ? "" : str2, (i5 & 64) == 0 ? str3 : "", (i5 & 128) != 0 ? 0 : i4);
    }
}
