package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Program64Header extends Elf$ProgramHeader {
    public Program64Header(ElfParser elfParser, Elf$Header elf$Header, long j) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (j * elf$Header.LIZLLL) + elf$Header.LIZIZ;
        this.LIZ = elfParser.LIZLLL(allocate, j2);
        elfParser.LIZIZ(allocate, 8 + j2, 8);
        this.LIZIZ = allocate.getLong();
        elfParser.LIZIZ(allocate, 16 + j2, 8);
        this.LIZJ = allocate.getLong();
        elfParser.LIZIZ(allocate, j2 + 40, 8);
        this.LIZLLL = allocate.getLong();
    }
}
