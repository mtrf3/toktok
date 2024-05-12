package X;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.PCt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64075PCt {
    public static Pair<ByteBuffer, Long> LIZLLL(RandomAccessFile randomAccessFile, int i) {
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        LJ(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i2 = capacity2 - 22;
            int min = Math.min(i2, 65535);
            int i3 = 0;
            while (true) {
                if (i3 >= min) {
                    break;
                }
                int i4 = i2 - i3;
                if (allocate.getInt(i4) != 101010256 || ((char) allocate.getShort(i4 + 20)) != i3) {
                    i3++;
                } else if (i4 != -1) {
                    allocate.position(i4);
                    ByteBuffer slice = allocate.slice();
                    slice.order(ByteOrder.LITTLE_ENDIAN);
                    return Pair.create(slice, Long.valueOf(capacity + i4));
                }
            }
        }
        return null;
    }

    public static void LJ(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static byte[][] LJII(int[] iArr, InterfaceC47557IlV[] interfaceC47557IlVArr) {
        int i;
        long j;
        int length;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (interfaceC47557IlVArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(LJIIJ(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            LJIILJJIL(i3, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String LJIIIZ = LJIIIZ(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(LJIIIZ);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(LJIIIZ.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            InterfaceC47557IlV interfaceC47557IlV = interfaceC47557IlVArr[i6];
            long a = interfaceC47557IlV.a();
            long j4 = 0;
            while (a > j2) {
                int min = (int) Math.min(a, j);
                LJIILJJIL(min, bArr3);
                for (int i9 = 0; i9 < length; i9++) {
                    messageDigestArr[i9].update(bArr3);
                }
                try {
                    interfaceC47557IlV.LIZ(messageDigestArr, j4, min);
                    for (int i10 = 0; i10 < iArr.length; i10++) {
                        int i11 = iArr[i10];
                        byte[] bArr4 = bArr[i10];
                        int LJIIJ = LJIIJ(i11);
                        MessageDigest messageDigest = messageDigestArr[i10];
                        int digest = messageDigest.digest(bArr4, (i7 * LJIIJ) + 5, LJIIJ);
                        if (digest != LJIIJ) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                    }
                    long j5 = min;
                    j4 += j5;
                    a -= j5;
                    i7++;
                    j2 = 0;
                    j = 1048576;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i7);
                    sb3.append(" of section #");
                    sb3.append(i8);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i8++;
            i6++;
        }
        byte[][] bArr5 = new byte[iArr.length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            byte[] bArr6 = bArr[i12];
            String LJIIIZ2 = LJIIIZ(i13);
            try {
                bArr5[i12] = MessageDigest.getInstance(LJIIIZ2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(LJIIIZ2.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    public static int LJIIIIZZ(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString(i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    public static String LJIIIZ(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int LJIIJ(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static ByteBuffer LJIIJJI(int i, ByteBuffer byteBuffer) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer LJIIL(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return LJIIJJI(i, byteBuffer);
        }
        int remaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new IOException(sb2.toString());
    }

    public static byte[] LJIILIIL(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    public static void LJIILJJIL(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static X509Certificate[][] LIZJ(String str) {
        Pair<ByteBuffer, Long> LIZLLL;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            int i = 0;
            if (randomAccessFile.length() >= 22) {
                LIZLLL = LIZLLL(randomAccessFile, 0);
                if (LIZLLL == null) {
                    LIZLLL = LIZLLL(randomAccessFile, 65535);
                }
            } else {
                LIZLLL = null;
            }
            if (LIZLLL != null) {
                ByteBuffer byteBuffer = (ByteBuffer) LIZLLL.first;
                long longValue = ((Long) LIZLLL.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C64078PCw("ZIP64 APK not supported");
                    }
                }
                LJ(byteBuffer);
                long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j2 < longValue) {
                    LJ(byteBuffer);
                    if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 == longValue) {
                        if (j2 >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(j2 - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                long j3 = allocate.getLong(0);
                                if (j3 >= allocate.capacity() && j3 <= 2147483639) {
                                    int i2 = (int) (8 + j3);
                                    long j4 = j2 - i2;
                                    if (j4 >= 0) {
                                        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                                        allocate2.order(byteOrder);
                                        randomAccessFile.seek(j4);
                                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                        long j5 = allocate2.getLong(0);
                                        if (j5 == j3) {
                                            Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                            long longValue2 = ((Long) create.second).longValue();
                                            if (byteBuffer2.order() == byteOrder) {
                                                int capacity = byteBuffer2.capacity() - 24;
                                                if (capacity >= 8) {
                                                    int capacity2 = byteBuffer2.capacity();
                                                    if (capacity <= byteBuffer2.capacity()) {
                                                        int limit = byteBuffer2.limit();
                                                        int position = byteBuffer2.position();
                                                        try {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(capacity);
                                                            byteBuffer2.position(8);
                                                            ByteBuffer slice = byteBuffer2.slice();
                                                            slice.order(byteBuffer2.order());
                                                            while (slice.hasRemaining()) {
                                                                i++;
                                                                if (slice.remaining() >= 8) {
                                                                    long j6 = slice.getLong();
                                                                    if (j6 >= 4 && j6 <= 2147483647L) {
                                                                        int i3 = (int) j6;
                                                                        int position2 = slice.position() + i3;
                                                                        if (i3 <= slice.remaining()) {
                                                                            if (slice.getInt() == 1896449818) {
                                                                                X509Certificate[][] LJFF = LJFF(randomAccessFile.getChannel(), new C64077PCv(LJIIJJI(i3 - 4, slice), longValue2, j2, longValue, byteBuffer));
                                                                                randomAccessFile.close();
                                                                                return LJFF;
                                                                            }
                                                                            slice.position(position2);
                                                                        } else {
                                                                            int remaining = slice.remaining();
                                                                            StringBuilder sb = new StringBuilder(91);
                                                                            sb.append("APK Signing Block entry #");
                                                                            sb.append(i);
                                                                            sb.append(" size out of range: ");
                                                                            sb.append(i3);
                                                                            sb.append(", available: ");
                                                                            sb.append(remaining);
                                                                            throw new C64078PCw(sb.toString());
                                                                        }
                                                                    } else {
                                                                        StringBuilder sb2 = new StringBuilder(76);
                                                                        sb2.append("APK Signing Block entry #");
                                                                        sb2.append(i);
                                                                        sb2.append(" size out of range: ");
                                                                        sb2.append(j6);
                                                                        throw new C64078PCw(sb2.toString());
                                                                    }
                                                                } else {
                                                                    StringBuilder sb3 = new StringBuilder(70);
                                                                    sb3.append("Insufficient data to read size of APK Signing Block entry #");
                                                                    sb3.append(i);
                                                                    throw new C64078PCw(sb3.toString());
                                                                }
                                                            }
                                                            throw new C64078PCw("No APK Signature Scheme v2 block in APK Signing Block");
                                                        } finally {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(limit);
                                                            byteBuffer2.position(position);
                                                        }
                                                    }
                                                    StringBuilder sb4 = new StringBuilder(41);
                                                    sb4.append("end > capacity: ");
                                                    sb4.append(capacity);
                                                    sb4.append(" > ");
                                                    sb4.append(capacity2);
                                                    throw new IllegalArgumentException(sb4.toString());
                                                }
                                                StringBuilder sb5 = new StringBuilder(38);
                                                sb5.append("end < start: ");
                                                sb5.append(capacity);
                                                sb5.append(" < 8");
                                                throw new IllegalArgumentException(sb5.toString());
                                            }
                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                        }
                                        StringBuilder sb6 = new StringBuilder(103);
                                        sb6.append("APK Signing Block sizes in header and footer do not match: ");
                                        sb6.append(j5);
                                        sb6.append(" vs ");
                                        sb6.append(j3);
                                        throw new C64078PCw(sb6.toString());
                                    }
                                    StringBuilder sb7 = new StringBuilder(59);
                                    sb7.append("APK Signing Block offset out of range: ");
                                    sb7.append(j4);
                                    throw new C64078PCw(sb7.toString());
                                }
                                StringBuilder sb8 = new StringBuilder(57);
                                sb8.append("APK Signing Block size out of range: ");
                                sb8.append(j3);
                                throw new C64078PCw(sb8.toString());
                            }
                            throw new C64078PCw("No APK Signing Block before ZIP Central Directory");
                        }
                        StringBuilder sb9 = new StringBuilder(87);
                        sb9.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb9.append(j2);
                        throw new C64078PCw(sb9.toString());
                    }
                    throw new C64078PCw("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                StringBuilder sb10 = new StringBuilder(122);
                sb10.append("ZIP Central Directory offset out of range: ");
                sb10.append(j2);
                sb10.append(". ZIP End of Central Directory offset: ");
                sb10.append(longValue);
                throw new C64078PCw(sb10.toString());
            }
            long length = randomAccessFile.length();
            StringBuilder sb11 = new StringBuilder(102);
            sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb11.append(length);
            sb11.append(" bytes");
            throw new C64078PCw(sb11.toString());
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String LIZ(String str, String str2) {
        int length = str.length();
        return FP1.LIZLLL(new StringBuilder(length + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static X509Certificate[][] LJFF(FileChannel fileChannel, C64077PCv c64077PCv) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer LJIIL = LJIIL(c64077PCv.LIZ);
                int i = 0;
                while (LJIIL.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(LJI(LJIIL(LJIIL), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        long j = c64077PCv.LIZIZ;
                        long j2 = c64077PCv.LIZJ;
                        long j3 = c64077PCv.LIZLLL;
                        ByteBuffer byteBuffer = c64077PCv.LJ;
                        if (!hashMap.isEmpty()) {
                            C47556IlU c47556IlU = new C47556IlU(fileChannel, 0L, j);
                            C47556IlU c47556IlU2 = new C47556IlU(fileChannel, j2, j3 - j2);
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                            LJ(duplicate);
                            int position = duplicate.position() + 16;
                            if (j >= 0 && j <= 4294967295L) {
                                duplicate.putInt(duplicate.position() + position, (int) j);
                                C64076PCu c64076PCu = new C64076PCu(duplicate);
                                int size = hashMap.size();
                                int[] iArr = new int[size];
                                Iterator it = hashMap.keySet().iterator();
                                int i2 = 0;
                                while (it.hasNext()) {
                                    iArr[i2] = ((Integer) it.next()).intValue();
                                    i2++;
                                }
                                try {
                                    byte[][] LJII = LJII(iArr, new InterfaceC47557IlV[]{c47556IlU, c47556IlU2, c64076PCu});
                                    for (int i3 = 0; i3 < size; i3++) {
                                        int i4 = iArr[i3];
                                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), LJII[i3])) {
                                            throw new SecurityException(LJIIIZ(i4).concat(" digest of contents did not verify"));
                                        }
                                    }
                                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                                } catch (DigestException e2) {
                                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(47);
                            sb2.append("uint32 value of out range: ");
                            sb2.append(j);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        throw new SecurityException("No digests provided");
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    public static String LIZIZ(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(AnonymousClass036.LIZIZ(str.length(), 2, String.valueOf(str2).length(), String.valueOf(str3).length()));
        YE1.LIZLLL(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r10 = LJIIIIZZ(r15);
        r0 = LJIIIIZZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r10 == 1) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r0 == 1) goto L148;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00cb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145 A[Catch: SignatureException -> 0x026a, InvalidKeyException -> 0x026c, InvalidKeySpecException -> 0x026e, NoSuchAlgorithmException -> 0x0270, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0272, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0272, blocks: (B:76:0x012f, B:78:0x0145, B:79:0x0148), top: B:75:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate[] LJI(java.nio.ByteBuffer r16, java.util.Map<java.lang.Integer, byte[]> r17, java.security.cert.CertificateFactory r18) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64075PCt.LJI(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }
}
