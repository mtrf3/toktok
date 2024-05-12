package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.PUm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64536PUm extends C64537PUn {
    public final transient byte[][] LJLJJI;
    public final transient int[] LJLJJL;

    public final C64537PUn LJFF() {
        return new C64537PUn(toByteArray());
    }

    @Override // X.C64537PUn
    public int getSize$jvm() {
        return this.LJLJJL[this.LJLJJI.length - 1];
    }

    @Override // X.C64537PUn
    public byte[] toByteArray() {
        int[] iArr = this.LJLJJL;
        byte[][] bArr = this.LJLJJI;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.LJLJJL;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            V1M.LIZJ(this.LJLJJI[i], i3, i2, bArr2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    private final Object writeReplace() {
        return LJFF();
    }

    @Override // X.C64537PUn
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // X.C64537PUn
    public String base64() {
        return LJFF().base64();
    }

    @Override // X.C64537PUn
    public String base64Url() {
        return LJFF().base64Url();
    }

    @Override // X.C64537PUn
    public int hashCode() {
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        int length = this.LJLJJI.length;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            byte[] bArr = this.LJLJJI[i];
            int[] iArr = this.LJLJJL;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = (i5 - i2) + i4;
            while (i4 < i6) {
                i3 = (i3 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i2 = i5;
        }
        setHashCode$jvm(i3);
        return i3;
    }

    @Override // X.C64537PUn
    public String hex() {
        return LJFF().hex();
    }

    @Override // X.C64537PUn
    public byte[] internalArray$jvm() {
        return toByteArray();
    }

    @Override // X.C64537PUn
    public C64537PUn md5() {
        return LJFF().md5();
    }

    @Override // X.C64537PUn
    public C64537PUn sha1() {
        return LJFF().sha1();
    }

    @Override // X.C64537PUn
    public C64537PUn sha256() {
        return LJFF().sha256();
    }

    @Override // X.C64537PUn
    public C64537PUn sha512() {
        return LJFF().sha512();
    }

    @Override // X.C64537PUn
    public C64537PUn toAsciiLowercase() {
        return LJFF().toAsciiLowercase();
    }

    @Override // X.C64537PUn
    public C64537PUn toAsciiUppercase() {
        return LJFF().toAsciiUppercase();
    }

    @Override // X.C64537PUn
    public String toString() {
        return LJFF().toString();
    }

    @Override // X.C64537PUn
    public String utf8() {
        return LJFF().utf8();
    }

    public final int[] getDirectory() {
        return this.LJLJJL;
    }

    public final byte[][] getSegments() {
        return this.LJLJJI;
    }

    public final int LJ(int i) {
        int binarySearch = Arrays.binarySearch(this.LJLJJL, 0, this.LJLJJI.length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // X.C64537PUn
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C64537PUn) {
            C64537PUn c64537PUn = (C64537PUn) obj;
            if (c64537PUn.size() == size() && rangeEquals(0, c64537PUn, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C64537PUn
    public C64537PUn hmacSha1(C64537PUn key) {
        o.LJIIJ(key, "key");
        return LJFF().hmacSha1(key);
    }

    @Override // X.C64537PUn
    public C64537PUn hmacSha256(C64537PUn key) {
        o.LJIIJ(key, "key");
        return LJFF().hmacSha256(key);
    }

    @Override // X.C64537PUn
    public C64537PUn hmacSha512(C64537PUn key) {
        o.LJIIJ(key, "key");
        return LJFF().hmacSha512(key);
    }

    @Override // X.C64537PUn
    public byte internalGet$jvm(int i) {
        int i2;
        C30581Hy.LJIIIIZZ(this.LJLJJL[this.LJLJJI.length - 1], i, 1L);
        int LJ = LJ(i);
        if (LJ == 0) {
            i2 = 0;
        } else {
            i2 = this.LJLJJL[LJ - 1];
        }
        int[] iArr = this.LJLJJL;
        byte[][] bArr = this.LJLJJI;
        return bArr[LJ][(i - i2) + iArr[bArr.length + LJ]];
    }

    @Override // X.C64537PUn
    public String string(Charset charset) {
        o.LJIIJ(charset, "charset");
        return LJFF().string(charset);
    }

    @Override // X.C64537PUn
    public void write(OutputStream out) {
        o.LJIIJ(out, "out");
        int length = this.LJLJJI.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.LJLJJL;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            out.write(this.LJLJJI[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // X.C64537PUn
    public void write$jvm(C64533PUj buffer) {
        o.LJIIJ(buffer, "buffer");
        int length = this.LJLJJI.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.LJLJJL;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            PUR pur = new PUR(this.LJLJJI[i], i3, (i3 + i4) - i2, true, false);
            PUR pur2 = buffer.LJLIL;
            if (pur2 == null) {
                pur.LJI = pur;
                pur.LJFF = pur;
                buffer.LJLIL = pur;
            } else {
                PUR pur3 = pur2.LJI;
                if (pur3 != null) {
                    pur3.LIZIZ(pur);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            i++;
            i2 = i4;
        }
        buffer.LJLILLLLZI += i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64536PUm(C64533PUj buffer, int i) {
        super(C64537PUn.EMPTY.getData$jvm());
        o.LJIIJ(buffer, "buffer");
        C30581Hy.LJIIIIZZ(buffer.LJLILLLLZI, 0L, i);
        PUR pur = buffer.LJLIL;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (pur != null) {
                int i5 = pur.LIZJ;
                int i6 = pur.LIZIZ;
                if (i5 != i6) {
                    i3 += i5 - i6;
                    i4++;
                    pur = pur.LJFF;
                } else {
                    throw new AssertionError("s.limit == s.pos");
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        byte[][] bArr = new byte[i4];
        this.LJLJJL = new int[i4 * 2];
        PUR pur2 = buffer.LJLIL;
        int i7 = 0;
        while (i2 < i) {
            if (pur2 != null) {
                bArr[i7] = pur2.LIZ;
                int i8 = pur2.LIZJ;
                int i9 = pur2.LIZIZ;
                int i10 = (i8 - i9) + i2;
                if (i10 > i) {
                    i2 = i;
                } else {
                    i2 = i10;
                }
                int[] iArr = this.LJLJJL;
                iArr[i7] = i2;
                iArr[i7 + i4] = i9;
                pur2.LIZLLL = true;
                i7++;
                pur2 = pur2.LJFF;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        this.LJLJJI = bArr;
    }

    @Override // X.C64537PUn
    public int indexOf(byte[] other, int i) {
        o.LJIIJ(other, "other");
        return LJFF().indexOf(other, i);
    }

    @Override // X.C64537PUn
    public int lastIndexOf(byte[] other, int i) {
        o.LJIIJ(other, "other");
        return LJFF().lastIndexOf(other, i);
    }

    @Override // X.C64537PUn
    public C64537PUn substring(int i, int i2) {
        return LJFF().substring(i, i2);
    }

    @Override // X.C64537PUn
    public boolean rangeEquals(int i, byte[] other, int i2, int i3) {
        int i4;
        o.LJIIJ(other, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int LJ = LJ(i);
        while (i3 > 0) {
            if (LJ == 0) {
                i4 = 0;
            } else {
                i4 = this.LJLJJL[LJ - 1];
            }
            int min = Math.min(i3, ((this.LJLJJL[LJ] - i4) + i4) - i);
            int[] iArr = this.LJLJJL;
            byte[][] bArr = this.LJLJJI;
            if (!C30581Hy.LIZIZ(bArr[LJ], (i - i4) + iArr[bArr.length + LJ], i2, other, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            LJ++;
        }
        return true;
    }

    @Override // X.C64537PUn
    public boolean rangeEquals(int i, C64537PUn other, int i2, int i3) {
        int i4;
        o.LJIIJ(other, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int LJ = LJ(i);
        while (i3 > 0) {
            if (LJ == 0) {
                i4 = 0;
            } else {
                i4 = this.LJLJJL[LJ - 1];
            }
            int min = Math.min(i3, ((this.LJLJJL[LJ] - i4) + i4) - i);
            int[] iArr = this.LJLJJL;
            byte[][] bArr = this.LJLJJI;
            if (!other.rangeEquals(i2, bArr[LJ], (i - i4) + iArr[bArr.length + LJ], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            LJ++;
        }
        return true;
    }
}
