package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes17.dex */
public class Elf64Header extends Elf$Header {
    public final ElfParser LJI;

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$SectionHeader LIZJ() {
        return new Section64Header(this.LJI, this);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$ProgramHeader LIZIZ(long j) {
        return new Program64Header(this.LJI, this, j);
    }

    public Elf64Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.LIZ = z;
        this.LJI = elfParser;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        elfParser.LIZJ(allocate, 16L);
        elfParser.LIZIZ(allocate, 32L, 8);
        this.LIZIZ = allocate.getLong();
        elfParser.LIZIZ(allocate, 40L, 8);
        this.LIZJ = allocate.getLong();
        this.LIZLLL = elfParser.LIZJ(allocate, 54L);
        this.LJ = elfParser.LIZJ(allocate, 56L);
        this.LJFF = elfParser.LIZJ(allocate, 58L);
        elfParser.LIZJ(allocate, 60L);
        elfParser.LIZJ(allocate, 62L);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$DynamicStructure LIZ(int i, long j) {
        return new Dynamic64Structure(this.LJI, this, j, i);
    }
}
