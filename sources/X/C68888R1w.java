package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.R1w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C68888R1w {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final byte[] LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(");
        LIZ.append(C68887R1v.LJJJI[this.LIZ]);
        LIZ.append(", data length:");
        return C08380Uo.LIZ(LIZ, this.LIZLLL.length, ")", LIZ);
    }

    public static C68888R1w LIZ(String str) {
        byte[] bytes = C42398GkU.LIZIZ(str, (char) 0).getBytes(C68887R1v.LJJJLIIL);
        return new C68888R1w(2, bytes, bytes.length);
    }

    public final double LJI(ByteOrder byteOrder) {
        Object LJIIIZ = LJIIIZ(byteOrder);
        if (LJIIIZ != null) {
            if (LJIIIZ instanceof String) {
                return CastDoubleProtector.parseDouble((String) LJIIIZ);
            }
            if (LJIIIZ instanceof long[]) {
                if (((long[]) LJIIIZ).length == 1) {
                    return r4[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (LJIIIZ instanceof int[]) {
                if (((int[]) LJIIIZ).length == 1) {
                    return r4[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (LJIIIZ instanceof double[]) {
                double[] dArr = (double[]) LJIIIZ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (LJIIIZ instanceof C68891R1z[]) {
                C68891R1z[] c68891R1zArr = (C68891R1z[]) LJIIIZ;
                if (c68891R1zArr.length == 1) {
                    C68891R1z c68891R1z = c68891R1zArr[0];
                    return c68891R1z.LIZ / c68891R1z.LIZIZ;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int LJII(ByteOrder byteOrder) {
        Object LJIIIZ = LJIIIZ(byteOrder);
        if (LJIIIZ != null) {
            if (LJIIIZ instanceof String) {
                return CastIntegerProtector.parseInt((String) LJIIIZ);
            }
            if (LJIIIZ instanceof long[]) {
                long[] jArr = (long[]) LJIIIZ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (LJIIIZ instanceof int[]) {
                int[] iArr = (int[]) LJIIIZ;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String LJIIIIZZ(ByteOrder byteOrder) {
        Object LJIIIZ = LJIIIZ(byteOrder);
        if (LJIIIZ == null) {
            return null;
        }
        if (LJIIIZ instanceof String) {
            return (String) LJIIIZ;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (LJIIIZ instanceof long[]) {
            long[] jArr = (long[]) LJIIIZ;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (LJIIIZ instanceof int[]) {
            int[] iArr = (int[]) LJIIIZ;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (LJIIIZ instanceof double[]) {
            double[] dArr = (double[]) LJIIIZ;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(LJIIIZ instanceof C68891R1z[])) {
            return null;
        }
        C68891R1z[] c68891R1zArr = (C68891R1z[]) LJIIIZ;
        while (i < c68891R1zArr.length) {
            sb.append(c68891R1zArr[i].LIZ);
            sb.append('/');
            sb.append(c68891R1zArr[i].LIZIZ);
            i++;
            if (i != c68891R1zArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final Object LJIIIZ(ByteOrder byteOrder) {
        C68889R1x c68889R1x;
        byte b;
        byte b2;
        byte[] bArr;
        C68889R1x c68889R1x2 = null;
        try {
            c68889R1x = new C68889R1x(this.LIZLLL);
        } catch (IOException unused) {
            c68889R1x = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c68889R1x.LJLILLLLZI = byteOrder;
            int i = 0;
            boolean z = true;
            switch (this.LIZ) {
                case 1:
                case 6:
                    byte[] bArr2 = this.LIZLLL;
                    if (bArr2.length == 1 && (b = bArr2[0]) >= 0 && b <= 1) {
                        String str = new String(new char[]{(char) (b + 48)});
                        try {
                            c68889R1x.close();
                        } catch (IOException unused2) {
                        }
                        return str;
                    }
                    String str2 = new String(bArr2, C68887R1v.LJJJLIIL);
                    try {
                        c68889R1x.close();
                    } catch (IOException unused3) {
                    }
                    return str2;
                case 2:
                case 7:
                    if (this.LIZIZ >= C68887R1v.LJJJJ.length) {
                        int i2 = 0;
                        while (true) {
                            bArr = C68887R1v.LJJJJ;
                            if (i2 < bArr.length) {
                                if (this.LIZLLL[i2] == bArr[i2]) {
                                    i2++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                        if (z) {
                            i = bArr.length;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i < this.LIZIZ && (b2 = this.LIZLLL[i]) != 0) {
                        if (b2 >= 32) {
                            sb.append((char) b2);
                        } else {
                            sb.append('?');
                        }
                        i++;
                    }
                    String sb2 = sb.toString();
                    try {
                        c68889R1x.close();
                    } catch (IOException unused4) {
                    }
                    return sb2;
                case 3:
                    int[] iArr = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr[i] = c68889R1x.readUnsignedShort();
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused5) {
                    }
                    return iArr;
                case 4:
                    long[] jArr = new long[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        jArr[i] = c68889R1x.readInt() & 4294967295L;
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused6) {
                    }
                    return jArr;
                case 5:
                    C68891R1z[] c68891R1zArr = new C68891R1z[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        c68891R1zArr[i] = new C68891R1z(c68889R1x.readInt() & 4294967295L, c68889R1x.readInt() & 4294967295L);
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused7) {
                    }
                    return c68891R1zArr;
                case 8:
                    int[] iArr2 = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr2[i] = c68889R1x.readShort();
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused8) {
                    }
                    return iArr2;
                case 9:
                    int[] iArr3 = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr3[i] = c68889R1x.readInt();
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused9) {
                    }
                    return iArr3;
                case 10:
                    C68891R1z[] c68891R1zArr2 = new C68891R1z[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        c68891R1zArr2[i] = new C68891R1z(c68889R1x.readInt(), c68889R1x.readInt());
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused10) {
                    }
                    return c68891R1zArr2;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    double[] dArr = new double[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        dArr[i] = c68889R1x.readFloat();
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused11) {
                    }
                    return dArr;
                case 12:
                    double[] dArr2 = new double[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        dArr2[i] = c68889R1x.readDouble();
                        i++;
                    }
                    try {
                        c68889R1x.close();
                    } catch (IOException unused12) {
                    }
                    return dArr2;
                default:
                    try {
                        c68889R1x.close();
                    } catch (IOException unused13) {
                    }
                    return null;
            }
        } catch (IOException unused14) {
            if (c68889R1x != null) {
                try {
                    c68889R1x.close();
                } catch (IOException unused15) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            c68889R1x2 = c68889R1x;
            if (c68889R1x2 != null) {
                try {
                    c68889R1x2.close();
                } catch (IOException unused16) {
                }
            }
            throw th;
        }
    }

    public static C68888R1w LIZIZ(long j, ByteOrder byteOrder) {
        return LIZJ(new long[]{j}, byteOrder);
    }

    public static C68888R1w LIZJ(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C68887R1v.LJJJIL[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C68888R1w(4, wrap.array(), jArr.length);
    }

    public static C68888R1w LIZLLL(C68891R1z[] c68891R1zArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C68887R1v.LJJJIL[5] * c68891R1zArr.length]);
        wrap.order(byteOrder);
        for (C68891R1z c68891R1z : c68891R1zArr) {
            wrap.putInt((int) c68891R1z.LIZ);
            wrap.putInt((int) c68891R1z.LIZIZ);
        }
        return new C68888R1w(5, wrap.array(), c68891R1zArr.length);
    }

    public static C68888R1w LJ(int i, ByteOrder byteOrder) {
        return LJFF(new int[]{i}, byteOrder);
    }

    public static C68888R1w LJFF(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C68887R1v.LJJJIL[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C68888R1w(3, wrap.array(), iArr.length);
    }

    public C68888R1w(int i, byte[] bArr, int i2) {
        this(i, -1L, bArr, i2);
    }

    public C68888R1w(int i, long j, byte[] bArr, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = bArr;
    }
}
