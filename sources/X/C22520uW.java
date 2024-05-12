package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22520uW {
    public static final byte[] LIZ = {112, 114, 111, 0};
    public static final byte[] LIZIZ = {112, 114, 109, 0};

    public static byte[] LIZ(C22460uQ[] c22460uQArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (C22460uQ c22460uQ : c22460uQArr) {
            i2 += ((C22510uV.LIZ(c22460uQ.LJI, 2, 8, -1) & (-8)) / 8) + (c22460uQ.LJ * 2) + LIZIZ(c22460uQ.LIZ, bArr, c22460uQ.LIZIZ).getBytes(StandardCharsets.UTF_8).length + 16 + c22460uQ.LJFF;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C22530uX.LIZJ)) {
            int length = c22460uQArr.length;
            while (i < length) {
                C22460uQ c22460uQ2 = c22460uQArr[i];
                LJIIJJI(byteArrayOutputStream, c22460uQ2, LIZIZ(c22460uQ2.LIZ, bArr, c22460uQ2.LIZIZ));
                LJIILIIL(byteArrayOutputStream, c22460uQ2);
                LJIIJ(byteArrayOutputStream, c22460uQ2);
                LJIIL(byteArrayOutputStream, c22460uQ2);
                i++;
            }
        } else {
            for (C22460uQ c22460uQ3 : c22460uQArr) {
                LJIIJJI(byteArrayOutputStream, c22460uQ3, LIZIZ(c22460uQ3.LIZ, bArr, c22460uQ3.LIZIZ));
            }
            int length2 = c22460uQArr.length;
            while (i < length2) {
                C22460uQ c22460uQ4 = c22460uQArr[i];
                LJIILIIL(byteArrayOutputStream, c22460uQ4);
                LJIIJ(byteArrayOutputStream, c22460uQ4);
                LJIIL(byteArrayOutputStream, c22460uQ4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("The bytes saved do not match expectation. actual=");
        LIZ2.append(byteArrayOutputStream.size());
        LIZ2.append(" expected=");
        LIZ2.append(i2);
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }

    public static int[] LIZLLL(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C22470uR.LJ(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static void LJIIJ(OutputStream outputStream, C22460uQ c22460uQ) {
        int i = 0;
        for (int i2 : c22460uQ.LJII) {
            Integer valueOf = Integer.valueOf(i2);
            C22470uR.LJI(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    public static void LJIIL(OutputStream outputStream, C22460uQ c22460uQ) {
        byte[] bArr = new byte[(C22510uV.LIZ(c22460uQ.LJI, 2, 8, -1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c22460uQ.LJIIIIZZ.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                int LIZJ = LIZJ(2, intValue, c22460uQ.LJI);
                int i = LIZJ / 8;
                bArr[i] = (byte) ((1 << (LIZJ % 8)) | bArr[i]);
            }
            if ((intValue2 & 4) != 0) {
                int LIZJ2 = LIZJ(4, intValue, c22460uQ.LJI);
                int i2 = LIZJ2 / 8;
                bArr[i2] = (byte) ((1 << (LIZJ2 % 8)) | bArr[i2]);
            }
        }
        outputStream.write(bArr);
    }

    public static void LJIILIIL(OutputStream outputStream, C22460uQ c22460uQ) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c22460uQ.LJIIIIZZ.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C22470uR.LJI(outputStream, intValue - i);
                C22470uR.LJI(outputStream, 0);
                i = intValue;
            }
        }
    }

    public static String LIZIZ(String str, byte[] bArr, String str2) {
        Object obj;
        byte[] bArr2 = C22530uX.LJ;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C22530uX.LIZLLL;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (!":".equals(obj)) {
                return str2;
            }
            return str2.replace("!", ":");
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (!":".equals(obj)) {
                return str2;
            }
            return str2.replace("!", ":");
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
            str3 = ":";
        }
        return JBR.LJFF(LIZ2, str3, str2, LIZ2);
    }

    public static int LIZJ(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw new IllegalStateException(KMP.LJ("Unexpected flag: ", i));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static C22460uQ[] LJFF(InputStream inputStream, int i, C22460uQ[] c22460uQArr) {
        if (inputStream.available() == 0) {
            return new C22460uQ[0];
        }
        if (i == c22460uQArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int LJ = C22470uR.LJ(inputStream);
                iArr[i2] = C22470uR.LJ(inputStream);
                strArr[i2] = new String(C22470uR.LIZIZ(inputStream, LJ), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                C22460uQ c22460uQ = c22460uQArr[i3];
                if (c22460uQ.LIZIZ.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    c22460uQ.LJ = i4;
                    c22460uQ.LJII = LIZLLL(inputStream, i4);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c22460uQArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C22460uQ[] LJII(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, C22530uX.LIZIZ)) {
            int LIZLLL = (int) C22470uR.LIZLLL(inputStream, 1);
            byte[] LIZJ = C22470uR.LIZJ(inputStream, (int) C22470uR.LIZLLL(inputStream, 4), (int) C22470uR.LIZLLL(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(LIZJ);
                try {
                    C22460uQ[] LJIIIIZZ = LJIIIIZZ(LIZLLL, byteArrayInputStream, str);
                    byteArrayInputStream.close();
                    return LJIIIIZZ;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static C22460uQ[] LJIIIIZZ(int i, InputStream inputStream, String str) {
        int i2;
        if (inputStream.available() == 0) {
            return new C22460uQ[0];
        }
        C22460uQ[] c22460uQArr = new C22460uQ[i];
        for (int i3 = 0; i3 < i; i3++) {
            int LJ = C22470uR.LJ(inputStream);
            int LJ2 = C22470uR.LJ(inputStream);
            c22460uQArr[i3] = new C22460uQ(str, new String(C22470uR.LIZIZ(inputStream, LJ), StandardCharsets.UTF_8), C22470uR.LIZLLL(inputStream, 4), LJ2, (int) C22470uR.LIZLLL(inputStream, 4), (int) C22470uR.LIZLLL(inputStream, 4), new int[LJ2], new TreeMap());
        }
        for (int i4 = 0; i4 < i; i4++) {
            C22460uQ c22460uQ = c22460uQArr[i4];
            int available = inputStream.available() - c22460uQ.LJFF;
            int i5 = 0;
            while (inputStream.available() > available) {
                i5 += C22470uR.LJ(inputStream);
                c22460uQ.LJIIIIZZ.put(Integer.valueOf(i5), 1);
                for (int LJ3 = C22470uR.LJ(inputStream); LJ3 > 0; LJ3--) {
                    C22470uR.LJ(inputStream);
                    int LIZLLL = (int) C22470uR.LIZLLL(inputStream, 1);
                    if (LIZLLL != 6 && LIZLLL != 7) {
                        while (LIZLLL > 0) {
                            C22470uR.LIZLLL(inputStream, 1);
                            for (int LIZLLL2 = (int) C22470uR.LIZLLL(inputStream, 1); LIZLLL2 > 0; LIZLLL2--) {
                                C22470uR.LJ(inputStream);
                            }
                            LIZLLL--;
                        }
                    }
                }
            }
            if (inputStream.available() == available) {
                c22460uQ.LJII = LIZLLL(inputStream, c22460uQ.LJ);
                BitSet valueOf = BitSet.valueOf(C22470uR.LIZIZ(inputStream, (C22510uV.LIZ(c22460uQ.LJI, 2, 8, -1) & (-8)) / 8));
                int i6 = 0;
                while (true) {
                    int i7 = c22460uQ.LJI;
                    if (i6 < i7) {
                        if (valueOf.get(LIZJ(2, i6, i7))) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                        if (valueOf.get(LIZJ(4, i6, i7))) {
                            i2 |= 4;
                        }
                        if (i2 != 0) {
                            Integer num = c22460uQ.LJIIIIZZ.get(Integer.valueOf(i6));
                            if (num == null) {
                                num = 0;
                            }
                            c22460uQ.LJIIIIZZ.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() | i2));
                        }
                        i6++;
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c22460uQArr;
    }

    public static boolean LJIIIZ(OutputStream outputStream, byte[] bArr, C22460uQ[] c22460uQArr) {
        int length;
        byte[] bArr2 = C22530uX.LIZ;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C22470uR.LJI(byteArrayOutputStream, c22460uQArr.length);
                int i = 2;
                for (C22460uQ c22460uQ : c22460uQArr) {
                    C22470uR.LJFF(byteArrayOutputStream, c22460uQ.LIZJ, 4);
                    C22470uR.LJFF(byteArrayOutputStream, c22460uQ.LIZLLL, 4);
                    C22470uR.LJFF(byteArrayOutputStream, c22460uQ.LJI, 4);
                    String LIZIZ2 = LIZIZ(c22460uQ.LIZ, bArr2, c22460uQ.LIZIZ);
                    int length2 = LIZIZ2.getBytes(StandardCharsets.UTF_8).length;
                    C22470uR.LJI(byteArrayOutputStream, length2);
                    i = i + 4 + 4 + 4 + 2 + length2;
                    byteArrayOutputStream.write(LIZIZ2.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (i == byteArray.length) {
                    C22540uY c22540uY = new C22540uY(EnumC22480uS.DEX_FILES, byteArray, false);
                    byteArrayOutputStream.close();
                    arrayList.add(c22540uY);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    int i2 = 0;
                    for (int i3 = 0; i3 < c22460uQArr.length; i3++) {
                        try {
                            C22460uQ c22460uQ2 = c22460uQArr[i3];
                            C22470uR.LJI(byteArrayOutputStream2, i3);
                            C22470uR.LJI(byteArrayOutputStream2, c22460uQ2.LJ);
                            i2 = i2 + 2 + 2 + (c22460uQ2.LJ * 2);
                            LJIIJ(byteArrayOutputStream2, c22460uQ2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    if (i2 == byteArray2.length) {
                        C22540uY c22540uY2 = new C22540uY(EnumC22480uS.CLASSES, byteArray2, true);
                        byteArrayOutputStream2.close();
                        arrayList.add(c22540uY2);
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        int i4 = 0;
                        for (int i5 = 0; i5 < c22460uQArr.length; i5++) {
                            try {
                                C22460uQ c22460uQ3 = c22460uQArr[i5];
                                Iterator<Map.Entry<Integer, Integer>> it = c22460uQ3.LJIIIIZZ.entrySet().iterator();
                                int i6 = 0;
                                while (it.hasNext()) {
                                    i6 |= it.next().getValue().intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                try {
                                    LJIIL(byteArrayOutputStream3, c22460uQ3);
                                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                    byteArrayOutputStream3.close();
                                    byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    try {
                                        LJIILIIL(byteArrayOutputStream3, c22460uQ3);
                                        byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                        byteArrayOutputStream3.close();
                                        C22470uR.LJI(byteArrayOutputStream, i5);
                                        int length3 = byteArray3.length + 2 + byteArray4.length;
                                        C22470uR.LJFF(byteArrayOutputStream, length3, 4);
                                        C22470uR.LJI(byteArrayOutputStream, i6);
                                        byteArrayOutputStream.write(byteArray3);
                                        byteArrayOutputStream.write(byteArray4);
                                        i4 = i4 + 2 + 4 + length3;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream.toByteArray();
                        if (i4 == byteArray5.length) {
                            C22540uY c22540uY3 = new C22540uY(EnumC22480uS.METHODS, byteArray5, true);
                            byteArrayOutputStream.close();
                            arrayList.add(c22540uY3);
                            long j = 4;
                            long size = j + j + 4 + (arrayList.size() * 16);
                            C22470uR.LJFF(outputStream, arrayList.size(), 4);
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                C22540uY c22540uY4 = (C22540uY) ListProtector.get(arrayList, i7);
                                C22470uR.LJFF(outputStream, c22540uY4.LIZ.LJLIL, 4);
                                C22470uR.LJFF(outputStream, size, 4);
                                if (c22540uY4.LIZJ) {
                                    byte[] bArr3 = c22540uY4.LIZIZ;
                                    long length4 = bArr3.length;
                                    byte[] LIZ2 = C22470uR.LIZ(bArr3);
                                    arrayList2.add(LIZ2);
                                    C22470uR.LJFF(outputStream, LIZ2.length, 4);
                                    C22470uR.LJFF(outputStream, length4, 4);
                                    length = LIZ2.length;
                                } else {
                                    arrayList2.add(c22540uY4.LIZIZ);
                                    C22470uR.LJFF(outputStream, c22540uY4.LIZIZ.length, 4);
                                    C22470uR.LJFF(outputStream, 0L, 4);
                                    length = c22540uY4.LIZIZ.length;
                                }
                                size += length;
                            }
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                outputStream.write((byte[]) ListProtector.get(arrayList2, i8));
                            }
                            return true;
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Expected size ");
                        LIZ3.append(i4);
                        LIZ3.append(", does not match actual size ");
                        LIZ3.append(byteArray5.length);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Expected size ");
                    LIZ4.append(i2);
                    LIZ4.append(", does not match actual size ");
                    LIZ4.append(byteArray2.length);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ4));
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Expected size ");
                LIZ5.append(i);
                LIZ5.append(", does not match actual size ");
                LIZ5.append(byteArray.length);
                throw new IllegalStateException(X1D.LIZIZ(LIZ5));
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = C22530uX.LIZIZ;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] LIZ6 = LIZ(c22460uQArr, bArr4);
            C22470uR.LJFF(outputStream, c22460uQArr.length, 1);
            C22470uR.LJFF(outputStream, LIZ6.length, 4);
            byte[] LIZ7 = C22470uR.LIZ(LIZ6);
            C22470uR.LJFF(outputStream, LIZ7.length, 4);
            outputStream.write(LIZ7);
            return true;
        }
        byte[] bArr5 = C22530uX.LIZLLL;
        if (Arrays.equals(bArr, bArr5)) {
            C22470uR.LJFF(outputStream, c22460uQArr.length, 1);
            for (C22460uQ c22460uQ4 : c22460uQArr) {
                int size2 = c22460uQ4.LJIIIIZZ.size() * 4;
                String LIZIZ3 = LIZIZ(c22460uQ4.LIZ, bArr5, c22460uQ4.LIZIZ);
                C22470uR.LJI(outputStream, LIZIZ3.getBytes(StandardCharsets.UTF_8).length);
                C22470uR.LJI(outputStream, c22460uQ4.LJII.length);
                C22470uR.LJFF(outputStream, size2, 4);
                C22470uR.LJFF(outputStream, c22460uQ4.LIZJ, 4);
                outputStream.write(LIZIZ3.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it2 = c22460uQ4.LJIIIIZZ.keySet().iterator();
                while (it2.hasNext()) {
                    C22470uR.LJI(outputStream, it2.next().intValue());
                    C22470uR.LJI(outputStream, 0);
                }
                for (int i9 : c22460uQ4.LJII) {
                    C22470uR.LJI(outputStream, i9);
                }
            }
            return true;
        }
        byte[] bArr6 = C22530uX.LIZJ;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] LIZ8 = LIZ(c22460uQArr, bArr6);
            C22470uR.LJFF(outputStream, c22460uQArr.length, 1);
            C22470uR.LJFF(outputStream, LIZ8.length, 4);
            byte[] LIZ9 = C22470uR.LIZ(LIZ8);
            C22470uR.LJFF(outputStream, LIZ9.length, 4);
            outputStream.write(LIZ9);
            return true;
        }
        byte[] bArr7 = C22530uX.LJ;
        if (Arrays.equals(bArr, bArr7)) {
            C22470uR.LJI(outputStream, c22460uQArr.length);
            for (C22460uQ c22460uQ5 : c22460uQArr) {
                String LIZIZ4 = LIZIZ(c22460uQ5.LIZ, bArr7, c22460uQ5.LIZIZ);
                C22470uR.LJI(outputStream, LIZIZ4.getBytes(StandardCharsets.UTF_8).length);
                C22470uR.LJI(outputStream, c22460uQ5.LJIIIIZZ.size());
                C22470uR.LJI(outputStream, c22460uQ5.LJII.length);
                C22470uR.LJFF(outputStream, c22460uQ5.LIZJ, 4);
                outputStream.write(LIZIZ4.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it3 = c22460uQ5.LJIIIIZZ.keySet().iterator();
                while (it3.hasNext()) {
                    C22470uR.LJI(outputStream, it3.next().intValue());
                }
                for (int i10 : c22460uQ5.LJII) {
                    C22470uR.LJI(outputStream, i10);
                }
            }
            return true;
        }
        return false;
    }

    public static void LJIIJJI(OutputStream outputStream, C22460uQ c22460uQ, String str) {
        C22470uR.LJI(outputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C22470uR.LJI(outputStream, c22460uQ.LJ);
        C22470uR.LJFF(outputStream, c22460uQ.LJFF, 4);
        C22470uR.LJFF(outputStream, c22460uQ.LIZJ, 4);
        C22470uR.LJFF(outputStream, c22460uQ.LJI, 4);
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static C22460uQ[] LJ(InputStream inputStream, byte[] bArr, byte[] bArr2, C22460uQ[] c22460uQArr) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr3 = C22530uX.LJFF;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(C22530uX.LIZ, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int LIZLLL = (int) C22470uR.LIZLLL(inputStream, 1);
                    byte[] LIZJ = C22470uR.LIZJ(inputStream, (int) C22470uR.LIZLLL(inputStream, 4), (int) C22470uR.LIZLLL(inputStream, 4));
                    if (inputStream.read() <= 0) {
                        byteArrayInputStream = new ByteArrayInputStream(LIZJ);
                        try {
                            C22460uQ[] LJFF = LJFF(byteArrayInputStream, LIZLLL, c22460uQArr);
                            byteArrayInputStream.close();
                            return LJFF;
                        } finally {
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, C22530uX.LJI)) {
            int LJ = C22470uR.LJ(inputStream);
            byte[] LIZJ2 = C22470uR.LIZJ(inputStream, (int) C22470uR.LIZLLL(inputStream, 4), (int) C22470uR.LIZLLL(inputStream, 4));
            if (inputStream.read() <= 0) {
                byteArrayInputStream = new ByteArrayInputStream(LIZJ2);
                try {
                    C22460uQ[] LJI = LJI(byteArrayInputStream, bArr2, LJ, c22460uQArr);
                    byteArrayInputStream.close();
                    return LJI;
                } finally {
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r2 = r11[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r2.LIZLLL = r0;
        r1 = LIZLLL(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (java.util.Arrays.equals(r9, X.C22530uX.LJ) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r2.LJ = r3;
        r2.LJII = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C22460uQ[] LJI(java.io.InputStream r8, byte[] r9, int r10, X.C22460uQ[] r11) {
        /*
            int r1 = r8.available()
            r0 = 0
            if (r1 != 0) goto La
            X.0uQ[] r0 = new X.C22460uQ[r0]
            return r0
        La:
            int r0 = r11.length
            if (r10 != r0) goto L7d
            r4 = 0
        Le:
            if (r4 >= r10) goto L7c
            X.C22470uR.LJ(r8)
            int r0 = X.C22470uR.LJ(r8)
            java.lang.String r7 = new java.lang.String
            byte[] r1 = X.C22470uR.LIZIZ(r8, r0)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r7.<init>(r1, r0)
            r0 = 4
            long r0 = X.C22470uR.LIZLLL(r8, r0)
            int r3 = X.C22470uR.LJ(r8)
            int r2 = r11.length
            if (r2 > 0) goto L3a
        L2e:
            java.lang.String r0 = "Missing profile key: "
            java.lang.String r1 = defpackage.i0.LJFF(r0, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3a:
            java.lang.String r2 = "!"
            int r2 = r7.indexOf(r2)
            if (r2 >= 0) goto L48
            java.lang.String r2 = ":"
            int r2 = r7.indexOf(r2)
        L48:
            if (r2 <= 0) goto L7a
            int r2 = r2 + 1
            java.lang.String r6 = r7.substring(r2)
        L50:
            r5 = 0
        L51:
            int r2 = r11.length
            if (r5 >= r2) goto L2e
            r2 = r11[r5]
            java.lang.String r2 = r2.LIZIZ
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L77
            r2 = r11[r5]
            if (r2 == 0) goto L2e
            r2.LIZLLL = r0
            int[] r1 = LIZLLL(r8, r3)
            byte[] r0 = X.C22530uX.LJ
            boolean r0 = java.util.Arrays.equals(r9, r0)
            if (r0 == 0) goto L74
            r2.LJ = r3
            r2.LJII = r1
        L74:
            int r4 = r4 + 1
            goto Le
        L77:
            int r5 = r5 + 1
            goto L51
        L7a:
            r6 = r7
            goto L50
        L7c:
            return r11
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22520uW.LJI(java.io.InputStream, byte[], int, X.0uQ[]):X.0uQ[]");
    }
}
