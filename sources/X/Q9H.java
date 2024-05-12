package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes12.dex */
public final class Q9H {
    public Q9I LIZ;
    public long LIZIZ;
    public int LIZLLL;
    public long LIZJ = Long.MAX_VALUE;
    public int LJ = 2;
    public int LJFF = -1;
    public long LJI = -1;
    public int LJII = -1;

    public final long LIZIZ() {
        if (this.LJ == 2) {
            long j = this.LIZJ;
            long j2 = j - this.LIZIZ;
            this.LJ = 6;
            this.LIZIZ = j;
            this.LIZJ = this.LJI;
            this.LJI = -1L;
            return j2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public final long LIZJ() {
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unexpected call to beginMessage(), detail:\n");
        LIZ.append(LIZLLL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final String LIZLLL() {
        String str;
        StringBuilder sb = new StringBuilder("{pos:");
        sb.append(this.LIZIZ);
        sb.append(", limit:");
        sb.append(this.LIZJ);
        sb.append(", recursionDepth:");
        sb.append(this.LIZLLL);
        switch (this.LJ) {
            case 0:
                str = "STATE_VARINT";
                break;
            case 1:
                str = "STATE_FIXED64";
                break;
            case 2:
                str = "STATE_LENGTH_DELIMITED";
                break;
            case 3:
                str = "STATE_START_GROUP";
                break;
            case 4:
                str = "STATE_END_GROUP";
                break;
            case 5:
                str = "STATE_FIXED32";
                break;
            case 6:
                str = "STATE_TAG";
                break;
            case 7:
                str = "STATE_PACKED_TAG";
                break;
            default:
                str = "";
                break;
        }
        C1DI.LIZIZ(sb, ", state:", str, ", tag:");
        sb.append(this.LJFF);
        sb.append(", pushedLimit:");
        sb.append(this.LJI);
        sb.append(", nextFieldEncoding:");
        sb.append(this.LJII);
        sb.append("}\n");
        Q9I q9i = this.LIZ;
        if (q9i instanceof Q9M) {
            byte[] bArr = ((Q9M) q9i).LIZIZ;
            char[] cArr = new char[bArr.length << 1];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                char[] cArr2 = C43001GuD.LJLILLLLZI;
                cArr[i] = cArr2[(b & 240) >>> 4];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            sb.append("data:");
            sb.append(cArr);
        } else {
            sb.append("data is InputStreamSource.");
        }
        return sb.toString();
    }

    public final int LJFF() {
        int i;
        this.LIZIZ++;
        byte readByte = this.LIZ.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.LIZIZ++;
        byte readByte2 = this.LIZ.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.LIZIZ++;
            byte readByte3 = this.LIZ.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.LIZIZ++;
                byte readByte4 = this.LIZ.readByte();
                if (readByte4 >= 0) {
                    i = readByte4 << 21;
                } else {
                    this.LIZIZ++;
                    byte readByte5 = this.LIZ.readByte();
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21) | (readByte5 << 28);
                    if (readByte5 >= 0) {
                        return i3;
                    }
                    int i4 = 0;
                    do {
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

    public final int LJI() {
        int i = this.LJ;
        if (i == 7) {
            this.LJ = 2;
            return this.LJFF;
        }
        if (i == 6) {
            while (this.LIZIZ < this.LIZJ && this.LIZ.LJJIII()) {
                int LJFF = LJFF();
                if (LJFF != 0) {
                    int i2 = LJFF >> 3;
                    this.LJFF = i2;
                    int i3 = LJFF & 7;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 == 5) {
                                            this.LJII = 5;
                                            this.LJ = 5;
                                            return i2;
                                        }
                                        throw new ProtocolException(KMP.LJ("Unexpected field encoding: ", i3));
                                    }
                                    throw new ProtocolException("Unexpected end group");
                                }
                                LJIILIIL(i2);
                            } else {
                                this.LJII = 2;
                                this.LJ = 2;
                                int LJFF2 = LJFF();
                                if (LJFF2 >= 0) {
                                    if (this.LJI == -1) {
                                        long j = this.LIZJ;
                                        this.LJI = j;
                                        long j2 = this.LIZIZ + LJFF2;
                                        this.LIZJ = j2;
                                        if (j2 <= j) {
                                            return this.LJFF;
                                        }
                                        throw new EOFException();
                                    }
                                    throw new IllegalStateException();
                                }
                                throw new ProtocolException(KMP.LJ("Negative length: ", LJFF2));
                            }
                        } else {
                            this.LJII = 1;
                            this.LJ = 1;
                            return i2;
                        }
                    } else {
                        this.LJII = 0;
                        this.LJ = 0;
                        return i2;
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unexpected call to nextTag(), detail:\n");
        LIZ.append(LIZLLL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final int LJIIIIZZ() {
        int i = this.LJ;
        if (i == 5 || i == 2) {
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

    public final long LJIIIZ() {
        int i = this.LJ;
        if (i == 1 || i == 2) {
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

    public final int LJIIJ() {
        int i = this.LJ;
        if (i == 0 || i == 2) {
            int LJFF = LJFF();
            LIZ(0);
            return LJFF;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        LIZ.append(this.LJ);
        throw new ProtocolException(X1D.LIZIZ(LIZ));
    }

    public final long LJIIJJI() {
        int i = this.LJ;
        if (i == 0 || i == 2) {
            long j = 0;
            int i2 = 0;
            do {
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

    public final byte[] LJII() {
        return this.LIZ.LJJII(LIZIZ());
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

    public final void LJ(long j) {
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
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("No corresponding call to beginMessage(), detail:\n");
            LIZ2.append(LIZLLL());
            throw new IllegalStateException(X1D.LIZIZ(LIZ2));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Unexpected call to endMessage(), detail:\n");
        LIZ3.append(LIZLLL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ3));
    }

    public final void LJIIL(Q9I q9i) {
        this.LIZ = q9i;
        this.LIZIZ = 0L;
        this.LIZJ = Long.MAX_VALUE;
        this.LIZLLL = 0;
        this.LJ = 2;
        this.LJFF = -1;
        this.LJI = -1L;
        this.LJII = -1;
    }

    public final void LJIILIIL(int i) {
        while (this.LIZIZ < this.LIZJ && this.LIZ.LJJIII()) {
            int LJFF = LJFF();
            if (LJFF != 0) {
                int i2 = LJFF >> 3;
                int i3 = LJFF & 7;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        this.LJ = 5;
                                        LJIIIIZZ();
                                    } else {
                                        throw new ProtocolException(KMP.LJ("Unexpected field encoding: ", i3));
                                    }
                                } else if (i2 == i) {
                                    return;
                                } else {
                                    throw new ProtocolException("Unexpected end group");
                                }
                            } else {
                                LJIILIIL(i2);
                            }
                        } else {
                            long LJFF2 = LJFF();
                            this.LIZIZ += LJFF2;
                            this.LIZ.skip(LJFF2);
                        }
                    } else {
                        this.LJ = 1;
                        LJIIIZ();
                    }
                } else {
                    this.LJ = 0;
                    LJIIJJI();
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }
}
