package X;

import defpackage.i0;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;

/* renamed from: X.PUn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64537PUn implements Serializable, Comparable<C64537PUn> {
    public static final long serialVersionUID = 1;
    public transient int LJLIL;
    public transient String LJLILLLLZI;
    public final byte[] LJLJI;
    public static final C64528PUe Companion = new C64528PUe();
    public static final char[] HEX_DIGITS = C64529PUf.LIZ;
    public static final C64537PUn EMPTY = C64529PUf.LIZIZ;

    public static final C64537PUn encodeUtf8(String str) {
        Companion.getClass();
        return C64528PUe.LIZ(str);
    }

    public static final C64537PUn of(byte... bArr) {
        Companion.getClass();
        return C64528PUe.LIZIZ(bArr);
    }

    public static final C64537PUn read(InputStream inputStream, int i) {
        Companion.getClass();
        return C64528PUe.LIZLLL(inputStream, i);
    }

    public String base64() {
        return C64541PUr.LIZ(getData$jvm(), C64541PUr.LIZ);
    }

    public String base64Url() {
        return C64541PUr.LIZ(getData$jvm(), C64541PUr.LIZIZ);
    }

    public int getSize$jvm() {
        return getData$jvm().length;
    }

    public int hashCode() {
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        byte[] a = getData$jvm();
        o.LJIIJ(a, "a");
        setHashCode$jvm(Arrays.hashCode(a));
        return getHashCode$jvm();
    }

    public String hex() {
        char[] cArr = new char[getData$jvm().length * 2];
        int i = 0;
        for (byte b : getData$jvm()) {
            int i2 = i + 1;
            Companion.getClass();
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final int indexOf(C64537PUn c64537PUn) {
        return indexOf$default(this, c64537PUn, 0, 2, (Object) null);
    }

    public int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public byte[] internalArray$jvm() {
        return getData$jvm();
    }

    public final int lastIndexOf(C64537PUn c64537PUn) {
        return lastIndexOf$default(this, c64537PUn, 0, 2, (Object) null);
    }

    public int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public C64537PUn substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public C64537PUn substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public C64537PUn toAsciiLowercase() {
        byte b;
        for (int i = 0; i < getData$jvm().length; i++) {
            byte b2 = getData$jvm()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$jvm = getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                o.LJFF(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C64537PUn(copyOf);
            }
        }
        return this;
    }

    public C64537PUn toAsciiUppercase() {
        byte b;
        for (int i = 0; i < getData$jvm().length; i++) {
            byte b2 = getData$jvm()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$jvm = getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                o.LJFF(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new C64537PUn(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$jvm = getData$jvm();
        byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
        o.LJFF(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r1 <= 1114111) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (55296 <= r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r1 >= r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r1 == 10) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (r1 == 13) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (31 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
    
        if (127 <= r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        if (159 < r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        if (r1 != 65533) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009c, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
    
        if (r1 >= 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        r6 = r6 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a2, code lost:
    
        if (r1 >= 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a4, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a5, code lost:
    
        r10 = r10 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a8, code lost:
    
        if (r1 >= 2048) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00aa, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ac, code lost:
    
        if (r1 >= 65536) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ae, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b0, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b2, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0089, code lost:
    
        if (57343 < r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64537PUn.toString():java.lang.String");
    }

    public String utf8() {
        String utf8$jvm = getUtf8$jvm();
        if (utf8$jvm == null) {
            byte[] receiver = getData$jvm();
            o.LJIIJ(receiver, "$receiver");
            String str = new String(receiver, PVC.LIZ);
            setUtf8$jvm(str);
            return str;
        }
        return utf8$jvm;
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.LJLJI).asReadOnlyBuffer();
        o.LJFF(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public C64537PUn md5() {
        return LIZJ("MD5");
    }

    public C64537PUn sha1() {
        return LIZJ("SHA-1");
    }

    public C64537PUn sha256() {
        return LIZJ("SHA-256");
    }

    public C64537PUn sha512() {
        return LIZJ("SHA-512");
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m29deprecated_size() {
        return size();
    }

    public final int size() {
        return getSize$jvm();
    }

    public final byte[] getData$jvm() {
        return this.LJLJI;
    }

    public final int getHashCode$jvm() {
        return this.LJLIL;
    }

    public final String getUtf8$jvm() {
        return this.LJLILLLLZI;
    }

    public C64537PUn(byte[] data) {
        o.LJIIJ(data, "data");
        this.LJLJI = data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r1 != '/') goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C64537PUn decodeBase64(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64537PUn.decodeBase64(java.lang.String):X.PUn");
    }

    public static final C64537PUn decodeHex(String receiver) {
        Companion.getClass();
        o.LJIIJ(receiver, "$receiver");
        if (receiver.length() % 2 == 0) {
            int length = receiver.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (C64529PUf.LIZIZ(receiver.charAt(i2 + 1)) + (C64529PUf.LIZIZ(receiver.charAt(i2)) << 4));
            }
            return new C64537PUn(bArr);
        }
        String LJFF = i0.LJFF("Unexpected hex string: ", receiver);
        LJFF.toString();
        throw new IllegalArgumentException(LJFF);
    }

    public static final C64537PUn of(ByteBuffer receiver) {
        Companion.getClass();
        o.LJIIJ(receiver, "$receiver");
        byte[] bArr = new byte[receiver.remaining()];
        receiver.get(bArr);
        return new C64537PUn(bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        Companion.getClass();
        C64537PUn LIZLLL = C64528PUe.LIZLLL(objectInputStream, readInt);
        Field field = C64537PUn.class.getDeclaredField("LJLJI");
        o.LJFF(field, "field");
        field.setAccessible(true);
        field.set(this, LIZLLL.LJLJI);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.LJLJI.length);
        objectOutputStream.write(this.LJLJI);
    }

    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m28deprecated_getByte(int i) {
        return getByte(i);
    }

    public final C64537PUn LIZJ(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.LJLJI);
        o.LJFF(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C64537PUn(digest);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(X.C64537PUn r8) {
        /*
            r7 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            int r6 = r7.size()
            int r5 = r8.size()
            int r4 = java.lang.Math.min(r6, r5)
            r3 = 0
            r2 = 0
        L14:
            if (r2 >= r4) goto L27
            byte r0 = r7.getByte(r2)
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r8.getByte(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L2f
            int r2 = r2 + 1
            goto L14
        L27:
            if (r6 != r5) goto L2a
            goto L32
        L2a:
            if (r6 >= r5) goto L2d
            goto L31
        L2d:
            r3 = 1
            goto L32
        L2f:
            if (r1 >= r0) goto L2d
        L31:
            r3 = -1
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64537PUn.compareTo(X.PUn):int");
    }

    public final boolean endsWith(C64537PUn suffix) {
        o.LJIIJ(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C64537PUn)) {
                return false;
            }
            C64537PUn c64537PUn = (C64537PUn) obj;
            if (c64537PUn.size() != getData$jvm().length || !c64537PUn.rangeEquals(0, getData$jvm(), 0, getData$jvm().length)) {
                return false;
            }
        }
        return true;
    }

    public final byte getByte(int i) {
        return internalGet$jvm(i);
    }

    public C64537PUn hmacSha1(C64537PUn key) {
        o.LJIIJ(key, "key");
        return LIZLLL("HmacSHA1", key);
    }

    public C64537PUn hmacSha256(C64537PUn key) {
        o.LJIIJ(key, "key");
        return LIZLLL("HmacSHA256", key);
    }

    public C64537PUn hmacSha512(C64537PUn key) {
        o.LJIIJ(key, "key");
        return LIZLLL("HmacSHA512", key);
    }

    public byte internalGet$jvm(int i) {
        return getData$jvm()[i];
    }

    public final void setHashCode$jvm(int i) {
        this.LJLIL = i;
    }

    public final void setUtf8$jvm(String str) {
        this.LJLILLLLZI = str;
    }

    public final boolean startsWith(C64537PUn prefix) {
        o.LJIIJ(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public String string(Charset charset) {
        o.LJIIJ(charset, "charset");
        return new String(this.LJLJI, charset);
    }

    public void write(OutputStream out) {
        o.LJIIJ(out, "out");
        out.write(this.LJLJI);
    }

    public void write$jvm(C64533PUj buffer) {
        o.LJIIJ(buffer, "buffer");
        byte[] bArr = this.LJLJI;
        buffer.LJJ(0, bArr, bArr.length);
    }

    public final boolean endsWith(byte[] suffix) {
        o.LJIIJ(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public final boolean startsWith(byte[] prefix) {
        o.LJIIJ(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public static final C64537PUn encodeString(String receiver, Charset charset) {
        Companion.getClass();
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(charset, "charset");
        byte[] bytes = receiver.getBytes(charset);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        return new C64537PUn(bytes);
    }

    public final C64537PUn LIZLLL(String str, C64537PUn c64537PUn) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(str);
            mac.init(new SecretKeySpec(c64537PUn.toByteArray(), str));
            byte[] doFinal = mac.doFinal(this.LJLJI);
            o.LJFF(doFinal, "mac.doFinal(data)");
            return new C64537PUn(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] other, int i) {
        o.LJIIJ(other, "other");
        int length = getData$jvm().length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!C30581Hy.LIZIZ(getData$jvm(), max, 0, other, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] other, int i) {
        o.LJIIJ(other, "other");
        for (int min = Math.min(i, this.LJLJI.length - other.length); min >= 0; min--) {
            if (C30581Hy.LIZIZ(this.LJLJI, min, 0, other, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public C64537PUn substring(int i, int i2) {
        return C64529PUf.LIZ(this, i, i2);
    }

    public final int indexOf(C64537PUn other, int i) {
        o.LJIIJ(other, "other");
        return indexOf(other.internalArray$jvm(), i);
    }

    public final int lastIndexOf(C64537PUn other, int i) {
        o.LJIIJ(other, "other");
        return lastIndexOf(other.internalArray$jvm(), i);
    }

    public static final C64537PUn of(byte[] receiver, int i, int i2) {
        Companion.getClass();
        o.LJIIJ(receiver, "$receiver");
        C30581Hy.LJIIIIZZ(receiver.length, i, i2);
        byte[] bArr = new byte[i2];
        V1M.LIZJ(receiver, i, 0, bArr, i2);
        return new C64537PUn(bArr);
    }

    public boolean rangeEquals(int i, byte[] other, int i2, int i3) {
        o.LJIIJ(other, "other");
        if (i >= 0 && i <= getData$jvm().length - i3 && i2 >= 0 && i2 <= other.length - i3 && C30581Hy.LIZIZ(getData$jvm(), i, i2, other, i3)) {
            return true;
        }
        return false;
    }

    public boolean rangeEquals(int i, C64537PUn other, int i2, int i3) {
        o.LJIIJ(other, "other");
        return other.rangeEquals(i2, getData$jvm(), i, i3);
    }

    public static /* bridge */ /* synthetic */ int indexOf$default(C64537PUn c64537PUn, C64537PUn c64537PUn2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c64537PUn.indexOf(c64537PUn2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* bridge */ /* synthetic */ int lastIndexOf$default(C64537PUn c64537PUn, C64537PUn c64537PUn2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = c64537PUn.size();
            }
            return c64537PUn.lastIndexOf(c64537PUn2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* bridge */ /* synthetic */ C64537PUn substring$default(C64537PUn c64537PUn, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = c64537PUn.size();
            }
            return c64537PUn.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* bridge */ /* synthetic */ int indexOf$default(C64537PUn c64537PUn, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return c64537PUn.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* bridge */ /* synthetic */ int lastIndexOf$default(C64537PUn c64537PUn, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = c64537PUn.size();
            }
            return c64537PUn.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
}
