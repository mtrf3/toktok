package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Dynamic32Structure extends Elf$DynamicStructure {
    public Dynamic32Structure(ElfParser elfParser, Elf$Header elf$Header, long j, int i) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + (i * 8);
        this.LIZ = elfParser.LIZLLL(allocate, j2);
        this.LIZIZ = elfParser.LIZLLL(allocate, j2 + 4);
    }
}
