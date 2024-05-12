package X;

import com.ss.bduploader.BDExternalFileReader;

/* renamed from: X.HKn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43893HKn implements BDExternalFileReader {
    public final /* synthetic */ InterfaceC43894HKo LIZ;

    @Override // com.ss.bduploader.BDExternalFileReader
    public final void cancel() {
        this.LIZ.cancel();
    }

    public C43893HKn(C43435H2x c43435H2x) {
        this.LIZ = c43435H2x;
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final long getValue(int i) {
        if (i != 0) {
            if (i != 2) {
                return -1L;
            }
            return this.LIZ.getValue(1);
        }
        return this.LIZ.getValue(0);
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final long getCrc32ByOffset(long j, int i) {
        return this.LIZ.getCrc32ByOffset(j, i);
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final int readSlice(int i, byte[] bArr, int i2) {
        InterfaceC43894HKo interfaceC43894HKo = this.LIZ;
        if (bArr == null) {
            bArr = new byte[0];
        }
        return interfaceC43894HKo.readSlice(i, bArr, i2);
    }

    @Override // com.ss.bduploader.BDExternalFileReader
    public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
        return this.LIZ.readSliceByOffset(j, bArr, i, i2);
    }
}
