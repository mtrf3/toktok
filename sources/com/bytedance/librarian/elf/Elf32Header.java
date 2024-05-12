package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Elf32Header extends Elf$Header {
    public final ElfParser LJI;

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$SectionHeader LIZJ() {
        return new Section32Header(this.LJI, this);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$ProgramHeader LIZIZ(long j) {
        return new Program32Header(this.LJI, this, j);
    }

    public Elf32Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.LIZ = z;
        this.LJI = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        elfParser.LIZJ(allocate, 16L);
        this.LIZIZ = elfParser.LIZLLL(allocate, 28L);
        this.LIZJ = elfParser.LIZLLL(allocate, 32L);
        this.LIZLLL = elfParser.LIZJ(allocate, 42L);
        this.LJ = elfParser.LIZJ(allocate, 44L);
        this.LJFF = elfParser.LIZJ(allocate, 46L);
        elfParser.LIZJ(allocate, 48L);
        elfParser.LIZJ(allocate, 50L);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$DynamicStructure LIZ(int i, long j) {
        return new Dynamic32Structure(this.LJI, this, j, i);
    }
}
