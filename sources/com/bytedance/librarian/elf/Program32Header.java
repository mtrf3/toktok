package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Program32Header extends Elf$ProgramHeader {
    public Program32Header(ElfParser elfParser, Elf$Header elf$Header, long j) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (j * elf$Header.LIZLLL) + elf$Header.LIZIZ;
        this.LIZ = elfParser.LIZLLL(allocate, j2);
        this.LIZIZ = elfParser.LIZLLL(allocate, 4 + j2);
        this.LIZJ = elfParser.LIZLLL(allocate, 8 + j2);
        this.LIZLLL = elfParser.LIZLLL(allocate, j2 + 20);
    }
}
