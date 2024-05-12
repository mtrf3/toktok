package com.ss.android.vesdk;

import X.C63992P9o;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes12.dex */
public class TECryptStream extends InputStream {
    public long cryptor;
    public FileInputStream fileInputStream;
    public long fileSize;
    public int pos;

    public static native long nativeCreateCryptor(String str);

    public static native int nativeDecrypt(long j, byte[] bArr, int i, long j2);

    public static native void nativeDestroyCryptor(long j);

    public static native int nativeGetBdveTagSize(long j, long j2);

    public static native int nativeMatch(long j, byte[] bArr, int i);

    @Override // java.io.InputStream
    public int available() {
        return (int) (this.fileSize - this.pos);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        long j = this.cryptor;
        if (j != 0) {
            nativeDestroyCryptor(j);
        }
        this.cryptor = 0L;
        this.pos = 0;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.pos + 1 >= this.fileSize) {
            return -1;
        }
        int read = this.fileInputStream.read();
        long j = this.cryptor;
        if (j != 0 && read != -1) {
            byte[] bArr = {(byte) read};
            nativeDecrypt(j, bArr, 1, this.pos);
            this.pos++;
            return bArr[0];
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public TECryptStream(String str, String str2) {
        init(new RandomAccessFile(str, "r").getFD(), str2);
    }

    private void init(FileDescriptor fileDescriptor, String str) {
        int nativeGetBdveTagSize;
        this.fileInputStream = new FileInputStream(fileDescriptor);
        this.fileSize = r0.available();
        long nativeCreateCryptor = nativeCreateCryptor(str);
        this.cryptor = nativeCreateCryptor;
        if (nativeCreateCryptor > 0 && (nativeGetBdveTagSize = nativeGetBdveTagSize(nativeCreateCryptor, this.fileSize)) > 0) {
            FileChannel channel = this.fileInputStream.getChannel();
            long position = channel.position();
            long j = nativeGetBdveTagSize;
            channel.position(this.fileSize - j);
            ByteBuffer allocate = ByteBuffer.allocate(nativeGetBdveTagSize);
            channel.read(allocate);
            if (nativeMatch(this.cryptor, allocate.array(), nativeGetBdveTagSize) == 0) {
                channel.position(position);
                this.fileSize -= j;
            } else {
                close();
                throw new C63992P9o("Crypt not match!!!");
            }
        }
    }

    public TECryptStream(FileDescriptor fileDescriptor, String str) {
        init(fileDescriptor, str);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.pos;
        long j = i3 + i2;
        long j2 = this.fileSize;
        if (j >= j2 && (i2 = (int) (j2 - i3)) <= 0) {
            return -1;
        }
        int read = this.fileInputStream.read(bArr, i, i2);
        if (read > 0) {
            int i4 = this.pos;
            this.pos = i4 + read;
            long j3 = this.cryptor;
            if (j3 != 0) {
                return nativeDecrypt(j3, bArr, read, i4);
            }
            return read;
        }
        return read;
    }
}
