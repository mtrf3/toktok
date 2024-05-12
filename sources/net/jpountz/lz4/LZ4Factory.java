package net.jpountz.lz4;

import X.C16880lQ;
import X.X1D;
import defpackage.a1;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

/* loaded from: classes15.dex */
public final class LZ4Factory {
    public static LZ4Factory JAVA_SAFE_INSTANCE;
    public static LZ4Factory JAVA_UNSAFE_INSTANCE;
    public static LZ4Factory NATIVE_INSTANCE;
    public final LZ4Compressor fastCompressor;
    public final LZ4FastDecompressor fastDecompressor;
    public final LZ4Compressor highCompressor;
    public final LZ4Compressor[] highCompressors;
    public final String impl;
    public final LZ4SafeDecompressor safeDecompressor;

    public static synchronized LZ4Factory nativeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            lZ4Factory = NATIVE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory safeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            lZ4Factory = JAVA_SAFE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            lZ4Factory = JAVA_UNSAFE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (Utils.isUnalignedAccessAllowed()) {
            try {
                return unsafeInstance();
            } catch (Throwable unused) {
                return safeInstance();
            }
        }
        return safeInstance();
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(LZ4Factory.class));
        LIZ.append(":");
        LIZ.append(this.impl);
        return X1D.LIZIZ(LIZ);
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LZ4Factory(String str) {
        LZ4Compressor[] lZ4CompressorArr = new LZ4Compressor[18];
        this.highCompressors = lZ4CompressorArr;
        this.impl = str;
        this.fastCompressor = (LZ4Compressor) classInstance(a1.LJ("net.jpountz.lz4.LZ4", str, "Compressor"));
        LZ4Compressor lZ4Compressor = (LZ4Compressor) classInstance(a1.LJ("net.jpountz.lz4.LZ4HC", str, "Compressor"));
        this.highCompressor = lZ4Compressor;
        this.fastDecompressor = (LZ4FastDecompressor) classInstance(a1.LJ("net.jpountz.lz4.LZ4", str, "FastDecompressor"));
        this.safeDecompressor = (LZ4SafeDecompressor) classInstance(a1.LJ("net.jpountz.lz4.LZ4", str, "SafeDecompressor"));
        Constructor<?> declaredConstructor = lZ4Compressor.getClass().getDeclaredConstructor(Integer.TYPE);
        lZ4CompressorArr[9] = lZ4Compressor;
        int i = 1;
        loop0: while (true) {
            this.highCompressors[i] = declaredConstructor.newInstance(Integer.valueOf(i));
            do {
                i++;
                if (i > 17) {
                    break loop0;
                }
            } while (i == 9);
        }
        byte[] bArr = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        for (LZ4Compressor lZ4Compressor2 : Arrays.asList(this.fastCompressor, this.highCompressor)) {
            int maxCompressedLength = lZ4Compressor2.maxCompressedLength(20);
            byte[] bArr2 = new byte[maxCompressedLength];
            int compress = lZ4Compressor2.compress(bArr, 0, 20, bArr2, 0, maxCompressedLength);
            byte[] bArr3 = new byte[20];
            this.fastDecompressor.decompress(bArr2, 0, bArr3, 0, 20);
            if (Arrays.equals(bArr, bArr3)) {
                Arrays.fill(bArr3, (byte) 0);
                if (this.safeDecompressor.decompress(bArr2, 0, compress, bArr3, 0) != 20 || !Arrays.equals(bArr, bArr3)) {
                    throw new AssertionError();
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    public static <T> T classInstance(String str) {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fastest instance is ");
        LIZ.append(fastestInstance());
        printStream.println(X1D.LIZIZ(LIZ));
        PrintStream printStream2 = System.out;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Fastest Java instance is ");
        LIZ2.append(fastestJavaInstance());
        printStream2.println(X1D.LIZIZ(LIZ2));
    }

    public LZ4Compressor highCompressor(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.highCompressors[i];
    }
}
