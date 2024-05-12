package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.H2x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43435H2x implements InterfaceC43894HKo {
    public final /* synthetic */ C43423H2l LIZ;
    public final /* synthetic */ XFL LIZIZ;
    public final /* synthetic */ File LIZJ;

    @Override // X.InterfaceC43894HKo
    public final void cancel() {
    }

    public final C41767GaJ LIZ(Exception exc) {
        if (this.LIZIZ.LJIIZILJ == -1) {
            return new C41767GaJ(C43339Gzf.LIZ(-6666601), exc);
        }
        return new C41767GaJ(C43339Gzf.LIZ(-39995), exc);
    }

    @Override // X.InterfaceC43894HKo
    public final long getValue(int i) {
        Number number;
        if (i == 0) {
            if (this.LIZIZ.LJII) {
                return this.LIZJ.length();
            }
            return -1L;
        }
        if (i == 1) {
            this.LIZ.LJIILL().LIZJ();
            try {
                number = Long.valueOf(this.LIZIZ.LJFF());
            } catch (Exception e) {
                this.LIZ.LJIILLIIL(new C41767GaJ(C43339Gzf.LIZ(-39994), e));
                number = -1;
            }
            long longValue = number.longValue();
            this.LIZ.LJIILL().LIZLLL();
            return longValue;
        }
        return -1L;
    }

    @Override // X.InterfaceC43894HKo
    public final long getCrc32ByOffset(long j, int i) {
        return this.LIZIZ.LJ(j, i);
    }

    public C43435H2x(C43423H2l c43423H2l, XFL xfl, File file) {
        this.LIZ = c43423H2l;
        this.LIZIZ = xfl;
        this.LIZJ = file;
    }

    @Override // X.InterfaceC43894HKo
    public final int readSlice(int i, byte[] bArr, int i2) {
        int i3;
        this.LIZ.LJIILL().LIZJ();
        try {
            i3 = this.LIZIZ.LIZLLL(i, bArr, i2);
        } catch (Exception e) {
            this.LIZ.LJIILLIIL(LIZ(e));
            i3 = -1;
        }
        C67996QmO c67996QmO = this.LIZ.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZIZ(new H3I("WaveUploadVideoTask", i3), EnumC43531H6p.OUTER);
            this.LIZ.LJIILL().LIZLLL();
            return i3;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // X.InterfaceC43894HKo
    public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
        int i3;
        this.LIZ.LJIILL().LIZJ();
        try {
            i3 = this.LIZIZ.LJIIJ(j, bArr, i, i2);
        } catch (Exception e) {
            this.LIZ.LJIILLIIL(LIZ(e));
            i3 = -1;
        }
        C67996QmO c67996QmO = this.LIZ.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZIZ(new H3I("WaveUploadVideoTask", i3), EnumC43531H6p.OUTER);
            this.LIZ.LJIILL().LIZLLL();
            return i3;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
