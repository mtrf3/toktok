package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0MW, reason: invalid class name */
/* loaded from: classes.dex */
public class C0MW {
    public final int LIZ;
    public final int LIZIZ;
    public final byte[] LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(");
        LIZ.append(C0MZ.LJJ[this.LIZ]);
        LIZ.append(", data length:");
        return C08380Uo.LIZ(LIZ, this.LIZJ.length, ")", LIZ);
    }

    public static C0MW LIZ(String str) {
        byte[] bytes = C42398GkU.LIZIZ(str, (char) 0).getBytes(C0MZ.LJJIJIL);
        return new C0MW(2, bytes, bytes.length);
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
            if (LJIIIZ instanceof C0MY[]) {
                C0MY[] c0myArr = (C0MY[]) LJIIIZ;
                if (c0myArr.length == 1) {
                    C0MY c0my = c0myArr[0];
                    return c0my.LIZ / c0my.LIZIZ;
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
        if (!(LJIIIZ instanceof C0MY[])) {
            return null;
        }
        C0MY[] c0myArr = (C0MY[]) LJIIIZ;
        while (i < c0myArr.length) {
            sb.append(c0myArr[i].LIZ);
            sb.append('/');
            sb.append(c0myArr[i].LIZIZ);
            i++;
            if (i != c0myArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final Object LJIIIZ(ByteOrder byteOrder) {
        C0MU c0mu;
        byte b;
        byte b2;
        byte[] bArr;
        C0MU c0mu2 = null;
        try {
            c0mu = new C0MU(this.LIZJ);
        } catch (IOException unused) {
            c0mu = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c0mu.LJLILLLLZI = byteOrder;
            int i = 0;
            boolean z = true;
            switch (this.LIZ) {
                case 1:
                case 6:
                    byte[] bArr2 = this.LIZJ;
                    if (bArr2.length == 1 && (b = bArr2[0]) >= 0 && b <= 1) {
                        String str = new String(new char[]{(char) (b + 48)});
                        try {
                            c0mu.close();
                        } catch (IOException unused2) {
                        }
                        return str;
                    }
                    String str2 = new String(bArr2, C0MZ.LJJIJIL);
                    try {
                        c0mu.close();
                    } catch (IOException unused3) {
                    }
                    return str2;
                case 2:
                case 7:
                    if (this.LIZIZ >= C0MZ.LJJIFFI.length) {
                        int i2 = 0;
                        while (true) {
                            bArr = C0MZ.LJJIFFI;
                            if (i2 < bArr.length) {
                                if (this.LIZJ[i2] == bArr[i2]) {
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
                    while (i < this.LIZIZ && (b2 = this.LIZJ[i]) != 0) {
                        if (b2 >= 32) {
                            sb.append((char) b2);
                        } else {
                            sb.append('?');
                        }
                        i++;
                    }
                    String sb2 = sb.toString();
                    try {
                        c0mu.close();
                    } catch (IOException unused4) {
                    }
                    return sb2;
                case 3:
                    int[] iArr = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr[i] = c0mu.readUnsignedShort();
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused5) {
                    }
                    return iArr;
                case 4:
                    long[] jArr = new long[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        jArr[i] = c0mu.readInt() & 4294967295L;
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused6) {
                    }
                    return jArr;
                case 5:
                    C0MY[] c0myArr = new C0MY[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        c0myArr[i] = new C0MY(c0mu.readInt() & 4294967295L, c0mu.readInt() & 4294967295L);
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused7) {
                    }
                    return c0myArr;
                case 8:
                    int[] iArr2 = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr2[i] = c0mu.readShort();
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused8) {
                    }
                    return iArr2;
                case 9:
                    int[] iArr3 = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr3[i] = c0mu.readInt();
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused9) {
                    }
                    return iArr3;
                case 10:
                    C0MY[] c0myArr2 = new C0MY[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        c0myArr2[i] = new C0MY(c0mu.readInt(), c0mu.readInt());
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused10) {
                    }
                    return c0myArr2;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    double[] dArr = new double[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        dArr[i] = c0mu.readFloat();
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused11) {
                    }
                    return dArr;
                case 12:
                    double[] dArr2 = new double[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        dArr2[i] = c0mu.readDouble();
                        i++;
                    }
                    try {
                        c0mu.close();
                    } catch (IOException unused12) {
                    }
                    return dArr2;
                default:
                    try {
                        c0mu.close();
                    } catch (IOException unused13) {
                    }
                    return null;
            }
        } catch (IOException unused14) {
            if (c0mu != null) {
                try {
                    c0mu.close();
                } catch (IOException unused15) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            c0mu2 = c0mu;
            if (c0mu2 != null) {
                try {
                    c0mu2.close();
                } catch (IOException unused16) {
                }
            }
            throw th;
        }
    }

    public static C0MW LIZIZ(long j, ByteOrder byteOrder) {
        return LIZJ(new long[]{j}, byteOrder);
    }

    public static C0MW LIZJ(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0MZ.LJJI[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C0MW(4, wrap.array(), jArr.length);
    }

    public static C0MW LIZLLL(C0MY[] c0myArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0MZ.LJJI[5] * c0myArr.length]);
        wrap.order(byteOrder);
        for (C0MY c0my : c0myArr) {
            wrap.putInt((int) c0my.LIZ);
            wrap.putInt((int) c0my.LIZIZ);
        }
        return new C0MW(5, wrap.array(), c0myArr.length);
    }

    public static C0MW LJ(int i, ByteOrder byteOrder) {
        return LJFF(new int[]{i}, byteOrder);
    }

    public static C0MW LJFF(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0MZ.LJJI[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C0MW(3, wrap.array(), iArr.length);
    }

    public C0MW(int i, byte[] bArr, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = bArr;
    }
}
