package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Oxd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63597Oxd {
    public final String LIZ;
    public final byte[] LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EncodeResult(encodeType=");
        LIZ.append(this.LIZ);
        LIZ.append(", payload=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int i;
        String str = this.LIZ;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        byte[] bArr = this.LIZIZ;
        if (bArr != null) {
            i2 = Arrays.hashCode(bArr);
        }
        return i3 + i2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C63597Oxd.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.im.core.internal.fetcher.EncodeAndDecodeStrategy.EncodeResult");
        C63597Oxd c63597Oxd = (C63597Oxd) obj;
        if (!o.LJ(this.LIZ, c63597Oxd.LIZ)) {
            return false;
        }
        byte[] bArr = this.LIZIZ;
        if (bArr != null) {
            byte[] bArr2 = c63597Oxd.LIZIZ;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c63597Oxd.LIZIZ != null) {
            return false;
        }
        return true;
    }

    public C63597Oxd(String str, byte[] bArr) {
        this.LIZ = str;
        this.LIZIZ = bArr;
    }
}
