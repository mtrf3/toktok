package X;

import com.ss.bduploader.BDImageXUploaderAbstractListener;

/* loaded from: classes8.dex */
public final class H05 extends BDImageXUploaderAbstractListener {
    public final /* synthetic */ H06 LIZ;

    public H05(H02 h02) {
        this.LIZ = h02;
    }

    @Override // com.ss.bduploader.BDImageXUploaderAbstractListener
    public final String getStringFromExtern(int i) {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.bduploader.BDImageXUploaderAbstractListener
    public final void onUploadStage(int i, long j) {
        this.LIZ.LIZIZ(i);
    }
}
