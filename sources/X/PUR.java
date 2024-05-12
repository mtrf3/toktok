package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUR {
    public final byte[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public PUR LJFF;
    public PUR LJI;

    public final PUR LIZJ() {
        this.LIZLLL = true;
        return new PUR(this.LIZ, this.LIZIZ, this.LIZJ, true, false);
    }

    public final PUR LIZ() {
        PUR pur;
        PUR pur2 = this.LJFF;
        if (pur2 != this) {
            pur = pur2;
        } else {
            pur = null;
        }
        PUR pur3 = this.LJI;
        if (pur3 != null) {
            pur3.LJFF = pur2;
            PUR pur4 = this.LJFF;
            if (pur4 != null) {
                pur4.LJI = pur3;
                this.LJFF = null;
                this.LJI = null;
                return pur;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public PUR() {
        this.LIZ = new byte[FileUtils.BUFFER_SIZE];
        this.LJ = true;
    }

    public final void LIZIZ(PUR pur) {
        pur.LJI = this;
        pur.LJFF = this.LJFF;
        PUR pur2 = this.LJFF;
        if (pur2 != null) {
            pur2.LJI = pur;
            this.LJFF = pur;
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    public final void LIZLLL(PUR sink, int i) {
        o.LJIIJ(sink, "sink");
        if (sink.LJ) {
            int i2 = sink.LIZJ;
            if (i2 + i > 8192) {
                if (!sink.LIZLLL) {
                    int i3 = sink.LIZIZ;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sink.LIZ;
                        V1M.LIZJ(bArr, i3, 0, bArr, i2 - i3);
                        sink.LIZJ -= sink.LIZIZ;
                        sink.LIZIZ = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            V1M.LIZJ(this.LIZ, this.LIZIZ, sink.LIZJ, sink.LIZ, i);
            sink.LIZJ += i;
            this.LIZIZ += i;
            return;
        }
        "only owner can write".toString();
        throw new IllegalStateException("only owner can write");
    }

    public PUR(byte[] data, int i, int i2, boolean z, boolean z2) {
        o.LJIIJ(data, "data");
        this.LIZ = data;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
