package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Dynamic64Structure extends Elf$DynamicStructure {
    public Dynamic64Structure(ElfParser elfParser, Elf$Header elf$Header, long j, int i) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + (i * 16);
        elfParser.LIZIZ(allocate, j2, 8);
        this.LIZ = allocate.getLong();
        elfParser.LIZIZ(allocate, j2 + 8, 8);
        this.LIZIZ = allocate.getLong();
    }
}
