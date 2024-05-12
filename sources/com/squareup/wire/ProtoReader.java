package com.squareup.wire;

import X.C64537PUn;
import X.KMP;
import X.PW3;
import X.X1D;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes12.dex */
public final class ProtoReader {
    public final PW3 LIZ;
    public long LIZIZ;
    public int LIZLLL;
    public FieldEncoding LJII;
    public long LIZJ = Long.MAX_VALUE;
    public int LJ = 2;
    public int LJFF = -1;
    public long LJI = -1;

    public final long LIZIZ() {
        if (this.LJ == 2) {
            long j = this.LIZJ - this.LIZIZ;
            this.LIZ.a(j);
            this.LJ = 6;
            this.LIZIZ = this.LIZJ;
            this.LIZJ = this.LJI;
            this.LJI = -1L;
            return j;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public final int LIZJ() {
        int i;
        this.LIZ.a(1L);
        this.LIZIZ++;
        byte readByte = this.LIZ.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.LIZ.a(1L);
        this.LIZIZ++;
        byte readByte2 = this.LIZ.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.LIZ.a(1L);
            this.LIZIZ++;
            byte readByte3 = this.LIZ.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.LIZ.a(1L);
                this.LIZIZ++;
                byte readByte4 = this.LIZ.readByte();
                if (readByte4 >= 0) {
                    i = readByte4 << 21;
                } else {
                    this.LIZ.a(1L);
                    this.LIZIZ++;
                    byte readByte5 = this.LIZ.readByte();
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21) | (readByte5 << 28);
                    if (readByte5 >= 0) {
                        return i3;
                    }
                    int i4 = 0;
                    do {
                        this.LIZ.a(1L);
                        this.LIZIZ++;
                        if (this.LIZ.readByte() >= 0) {
                            return i3;
                        }
                        i4++;
                    } while (i4 < 5);
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return i2 | i;
    }

    public long beginMessage() {
        if (this.LJ == 2) {
            int i = this.LIZLLL + 1;
            this.LIZLLL = i;
            if (i <= 65) {
                long j = this.LJI;
                this.LJI = -1L;
                this.LJ = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    public int nextTag() {
        int i = this.LJ;
        if (i == 7) {
            this.LJ = 2;
            return this.LJFF;
        }
        if (i == 6) {
            while (this.LIZIZ < this.LIZJ && !this.LIZ.LLJ()) {
                int LIZJ = LIZJ();
                if (LIZJ != 0) {
                    int i2 = LIZJ >> 3;
                    this.LJFF = i2;
                    int i3 = LIZJ & 7;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 == 5) {
                                            this.LJII = FieldEncoding.FIXED32;
                                            this.LJ = 5;
                                            return i2;
                                        }
                                        throw new ProtocolException(KMP.LJ("Unexpected field encoding: ", i3));
                                    }
                                    throw new ProtocolException("Unexpected end group");
                                }
                                LIZLLL(i2);
                            } else {
                                this.LJII = FieldEncoding.LENGTH_DELIMITED;
                                this.LJ = 2;
                                int LIZJ2 = LIZJ();
                                if (LIZJ2 >= 0) {
                                    if (this.LJI == -1) {
                                        long j = this.LIZJ;
                                        this.LJI = j;
                                        long j2 = this.LIZIZ + LIZJ2;
                                        this.LIZJ = j2;
                                        if (j2 <= j) {
                                            return this.LJFF;
                                        }
                                        throw new EOFException();
                                    }
                                    throw new IllegalStateException();
                                }
                                throw new ProtocolException(KMP.LJ("Negative length: ", LIZJ2));
                            }
                        } else {
                            this.LJII = FieldEncoding.FIXED64;
                            this.LJ = 1;
                            return i2;
                        }
                    } else {
                        this.LJII = FieldEncoding.VARINT;
                        this.LJ = 0;
                        return i2;
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        }
        throw new IllegalStateException("Unexpected call to nextTag()");
    }

    public int readFixed32() {
        int i = this.LJ;
        if (i == 5 || i == 2) {
            this.LIZ.a(4L);
            this.LIZIZ += 4;
            int LJIIZILJ = this.LIZ.LJIIZILJ();
            LIZ(5);
            return LJIIZILJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected FIXED32 or LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public long readFixed64() {
        int i = this.LJ;
        if (i == 1 || i == 2) {
            this.LIZ.a(8L);
            this.LIZIZ += 8;
            long LJIIIIZZ = this.LIZ.LJIIIIZZ();
            LIZ(1);
            return LJIIIIZZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected FIXED64 or LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public int readVarint32() {
        int i = this.LJ;
        if (i == 0 || i == 2) {
            int LIZJ = LIZJ();
            LIZ(0);
            return LIZJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public long readVarint64() {
        int i = this.LJ;
        if (i == 0 || i == 2) {
            long j = 0;
            int i2 = 0;
            do {
                this.LIZ.a(1L);
                this.LIZIZ++;
                j |= (r2 & Byte.MAX_VALUE) << i2;
                if ((this.LIZ.readByte() & 128) == 0) {
                    LIZ(0);
                    return j;
                }
                i2 += 7;
            } while (i2 < 64);
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public void skip() {
        int i = this.LJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        readFixed32();
                        return;
                    }
                    throw new IllegalStateException("Unexpected call to skip()");
                }
                this.LIZ.skip(LIZIZ());
                return;
            }
            readFixed64();
            return;
        }
        readVarint64();
    }

    public C64537PUn readBytes() {
        long LIZIZ = LIZIZ();
        this.LIZ.a(LIZIZ);
        return this.LIZ.LJLIIIL(LIZIZ);
    }

    public String readString() {
        long LIZIZ = LIZIZ();
        this.LIZ.a(LIZIZ);
        return this.LIZ.LJJIFFI(LIZIZ);
    }

    public FieldEncoding peekFieldEncoding() {
        return this.LJII;
    }

    public ProtoReader(PW3 pw3) {
        this.LIZ = pw3;
    }

    public final void LIZ(int i) {
        if (this.LJ == i) {
            this.LJ = 6;
            return;
        }
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        if (j <= j2) {
            if (j == j2) {
                this.LIZJ = this.LJI;
                this.LJI = -1L;
                this.LJ = 6;
                return;
            }
            this.LJ = 7;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected to end at ");
        LIZ.append(this.LIZJ);
        LIZ.append(" but was ");
        LIZ.append(this.LIZIZ);
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    public final void LIZLLL(int i) {
        while (this.LIZIZ < this.LIZJ && !this.LIZ.LLJ()) {
            int LIZJ = LIZJ();
            if (LIZJ != 0) {
                int i2 = LIZJ >> 3;
                int i3 = LIZJ & 7;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        this.LJ = 5;
                                        readFixed32();
                                    } else {
                                        throw new ProtocolException(KMP.LJ("Unexpected field encoding: ", i3));
                                    }
                                } else if (i2 == i) {
                                    return;
                                } else {
                                    throw new ProtocolException("Unexpected end group");
                                }
                            } else {
                                LIZLLL(i2);
                            }
                        } else {
                            long LIZJ2 = LIZJ();
                            this.LIZIZ += LIZJ2;
                            this.LIZ.skip(LIZJ2);
                        }
                    } else {
                        this.LJ = 1;
                        readFixed64();
                    }
                } else {
                    this.LJ = 0;
                    readVarint64();
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    public void endMessage(long j) {
        if (this.LJ == 6) {
            int i = this.LIZLLL - 1;
            this.LIZLLL = i;
            if (i >= 0 && this.LJI == -1) {
                if (this.LIZIZ == this.LIZJ || i == 0) {
                    this.LIZJ = j;
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Expected to end at ");
                LIZ.append(this.LIZJ);
                LIZ.append(" but was ");
                LIZ.append(this.LIZIZ);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        throw new IllegalStateException("Unexpected call to endMessage()");
    }
}
