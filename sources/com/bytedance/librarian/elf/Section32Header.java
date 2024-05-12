package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Section32Header extends Elf$SectionHeader {
    public Section32Header(ElfParser elfParser, Elf$Header elf$Header) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.LIZ = elfParser.LIZLLL(allocate, elf$Header.LIZJ + (0 * elf$Header.LJFF) + 28);
    }
}
