package net.jpountz.xxhash;

import X.C16880lQ;
import X.X1D;
import defpackage.a1;
import defpackage.i0;
import java.io.PrintStream;
import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.StreamingXXHash64;

/* loaded from: classes15.dex */
public final class XXHashFactory {
    public static XXHashFactory JAVA_SAFE_INSTANCE;
    public static XXHashFactory JAVA_UNSAFE_INSTANCE;
    public static XXHashFactory NATIVE_INSTANCE;
    public final XXHash32 hash32;
    public final XXHash64 hash64;
    public final String impl;
    public final StreamingXXHash32.Factory streamingHash32Factory;
    public final StreamingXXHash64.Factory streamingHash64Factory;

    public static synchronized XXHashFactory nativeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            xXHashFactory = NATIVE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory safeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            xXHashFactory = JAVA_SAFE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory unsafeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            xXHashFactory = JAVA_UNSAFE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static XXHashFactory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static XXHashFactory fastestJavaInstance() {
        if (Utils.isUnalignedAccessAllowed()) {
            try {
                return unsafeInstance();
            } catch (Throwable unused) {
                return safeInstance();
            }
        }
        return safeInstance();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(XXHashFactory.class));
        LIZ.append(":");
        LIZ.append(this.impl);
        return X1D.LIZIZ(LIZ);
    }

    public XXHash32 hash32() {
        return this.hash32;
    }

    public XXHash64 hash64() {
        return this.hash64;
    }

    public XXHashFactory(String str) {
        this.impl = str;
        XXHash32 xXHash32 = (XXHash32) classInstance(i0.LJFF("net.jpountz.xxhash.XXHash32", str));
        this.hash32 = xXHash32;
        this.streamingHash32Factory = (StreamingXXHash32.Factory) classInstance(a1.LJ("net.jpountz.xxhash.StreamingXXHash32", str, "$Factory"));
        XXHash64 xXHash64 = (XXHash64) classInstance(i0.LJFF("net.jpountz.xxhash.XXHash64", str));
        this.hash64 = xXHash64;
        this.streamingHash64Factory = (StreamingXXHash64.Factory) classInstance(a1.LJ("net.jpountz.xxhash.StreamingXXHash64", str, "$Factory"));
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int nextInt = random.nextInt();
        int hash = xXHash32.hash(bArr, 0, 100, nextInt);
        StreamingXXHash32 newStreamingHash32 = newStreamingHash32(nextInt);
        newStreamingHash32.update(bArr, 0, 100);
        int value = newStreamingHash32.getValue();
        long j = nextInt;
        long hash2 = xXHash64.hash(bArr, 0, 100, j);
        StreamingXXHash64 newStreamingHash64 = newStreamingHash64(j);
        newStreamingHash64.update(bArr, 0, 100);
        long value2 = newStreamingHash64.getValue();
        if (hash == value) {
            if (hash2 == value2) {
                return;
            } else {
                throw new AssertionError();
            }
        }
        throw new AssertionError();
    }

    public static <T> T classInstance(String str) {
        ClassLoader classLoader = XXHashFactory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static XXHashFactory instance(String str) {
        try {
            return new XXHashFactory(str);
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

    public StreamingXXHash32 newStreamingHash32(int i) {
        return this.streamingHash32Factory.newStreamingHash(i);
    }

    public StreamingXXHash64 newStreamingHash64(long j) {
        return this.streamingHash64Factory.newStreamingHash(j);
    }
}
