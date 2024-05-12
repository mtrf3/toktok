package X;

import com.ss.bduploader.BDExternalFileReader;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H33 implements BDExternalFileReader {
    public final /* synthetic */ H5G LIZ;
    public final /* synthetic */ XFL LIZIZ;
    public final /* synthetic */ File LIZJ;

    @Override // com.ss.bduploader.BDExternalFileReader
    public final void cancel() {
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final long getValue(int i) {
        if (i == 0 && this.LIZIZ.LJII) {
            return this.LIZJ.length();
        }
        long j = -1;
        if (i == 2) {
            this.LIZ.LJIIJJI().LIZJ();
            try {
                j = this.LIZIZ.LJFF();
            } catch (Exception e) {
                this.LIZ.LJIILJJIL(20007, e);
            }
            this.LIZ.LJIIJJI().LIZLLL();
        }
        return j;
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final long getCrc32ByOffset(long j, int i) {
        return this.LIZIZ.LJ(j, i);
    }

    public H33(H5G h5g, XFL xfl, File file) {
        this.LIZ = h5g;
        this.LIZIZ = xfl;
        this.LIZJ = file;
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final int readSlice(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        this.LIZ.LJIIJJI().LIZJ();
        try {
            XFL xfl = this.LIZIZ;
            if (bArr == null) {
                bArr = new byte[0];
            }
            i4 = xfl.LIZLLL(i, bArr, i2);
        } catch (Exception e) {
            H5G h5g = this.LIZ;
            if (this.LIZIZ.LJIIZILJ == -1) {
                i3 = 20008;
            } else {
                i3 = 20009;
            }
            h5g.LJIILJJIL(i3, e);
            i4 = -1;
        }
        C67996QmO c67996QmO = this.LIZ.LJIIIZ;
        if (c67996QmO != null) {
            c67996QmO.LIZIZ(new H3I("DMVideoUploadTask", i4), EnumC43531H6p.OUTER);
            this.LIZ.LJIIJJI().LIZLLL();
            return i4;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        this.LIZ.LJIIJJI().LIZJ();
        try {
            i4 = this.LIZIZ.LJIIJ(j, bArr, i, i2);
        } catch (Exception e) {
            H5G h5g = this.LIZ;
            if (this.LIZIZ.LJIIZILJ == -1) {
                i3 = 20008;
            } else {
                i3 = 20009;
            }
            h5g.LJIILJJIL(i3, e);
            i4 = -1;
        }
        C67996QmO c67996QmO = this.LIZ.LJIIIZ;
        if (c67996QmO != null) {
            c67996QmO.LIZIZ(new H3I("DMVideoUploadTask", i4), EnumC43531H6p.OUTER);
            this.LIZ.LJIIJJI().LIZLLL();
            return i4;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }
}
