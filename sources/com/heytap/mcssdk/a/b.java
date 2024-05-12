package com.heytap.mcssdk.a;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.StringUtils;

/* loaded from: classes28.dex */
public abstract class b {
    public final byte f = 61;
    public final int g;
    public byte[] h;
    public int i;
    public boolean j;
    public int k;
    public int l;

    /* renamed from: n, reason: collision with root package name */
    public final int f119n;
    public final int o;
    public final int p;
    public int q;

    public b(int i, int i2, int i3, int i4) {
        this.f119n = i;
        this.o = i2;
        this.g = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.p = i4;
    }

    private void a() {
        byte[] bArr = this.h;
        if (bArr == null) {
            this.h = new byte[d()];
            this.i = 0;
            this.q = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.h = bArr2;
        }
    }

    public static boolean c(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    private void e() {
        this.h = null;
        this.i = 0;
        this.q = 0;
        this.k = 0;
        this.l = 0;
        this.j = false;
    }

    public void a(int i) {
        byte[] bArr = this.h;
        if (bArr == null || bArr.length < this.i + i) {
            a();
        }
    }

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void b(byte[] bArr, int i, int i2);

    public boolean b() {
        return this.h != null;
    }

    public abstract boolean b(byte b);

    public boolean b(byte[] bArr, boolean z) {
        byte b;
        for (int i = 0; i < bArr.length; i++) {
            if (!b(bArr[i]) && (!z || ((b = bArr[i]) != 61 && !c(b)))) {
                return false;
            }
        }
        return true;
    }

    public int c() {
        if (this.h != null) {
            return this.i - this.q;
        }
        return 0;
    }

    public int c(byte[] bArr, int i, int i2) {
        if (this.h == null) {
            return this.j ? -1 : 0;
        }
        int min = Math.min(c(), i2);
        System.arraycopy(this.h, this.q, bArr, i, min);
        int i3 = this.q + min;
        this.q = i3;
        if (i3 >= this.i) {
            this.h = null;
        }
        return min;
    }

    public byte[] c(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    public int d() {
        return FileUtils.BUFFER_SIZE;
    }

    public boolean d(String str) {
        return b(StringUtils.getBytesUtf8(str), true);
    }

    public Object decode(Object obj) {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return c((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] decode(byte[] bArr) {
        e();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        b(bArr, 0, bArr.length);
        b(bArr, 0, -1);
        int i = this.i;
        byte[] bArr2 = new byte[i];
        c(bArr2, 0, i);
        return bArr2;
    }

    public Object encode(Object obj) {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public byte[] encode(byte[] bArr) {
        e();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a(bArr, 0, bArr.length);
        a(bArr, 0, -1);
        int i = this.i - this.q;
        byte[] bArr2 = new byte[i];
        c(bArr2, 0, i);
        return bArr2;
    }

    public String j(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String k(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public boolean l(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || b(b)) {
                return true;
            }
        }
        return false;
    }

    public long m(byte[] bArr) {
        int length = bArr.length;
        int i = this.f119n;
        long j = (((length + i) - 1) / i) * this.o;
        int i2 = this.g;
        return i2 > 0 ? j + ((((i2 + j) - 1) / i2) * this.p) : j;
    }
}
