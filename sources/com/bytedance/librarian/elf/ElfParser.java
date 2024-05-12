package com.bytedance.librarian.elf;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes17.dex */
public class ElfParser implements Closeable {
    public final FileChannel LJLIL;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        return java.util.Collections.unmodifiableList(r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> LIZ() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.elf.ElfParser.LIZ():java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public ElfParser(File file) {
        if (file.exists()) {
            this.LJLIL = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    public final int LIZJ(ByteBuffer byteBuffer, long j) {
        LIZIZ(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    public final long LIZLLL(ByteBuffer byteBuffer, long j) {
        LIZIZ(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }

    public final void LIZIZ(ByteBuffer byteBuffer, long j, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.LJLIL.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
