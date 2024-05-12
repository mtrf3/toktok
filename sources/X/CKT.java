package X;

import com.ss.ttlivestreamer.livestreamv2.ILiveStream;

/* loaded from: classes6.dex */
public final class CKT implements ILiveStream.ILiveStreamErrorListener {
    public final /* synthetic */ CKO LJLIL;

    public CKT(CKO cko) {
        this.LJLIL = cko;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamErrorListener
    public final void onError(int i, int i2, Exception exc) {
        CKO cko = this.LJLIL;
        cko.LJIIL.post(new CKS(cko, i, exc, i2));
        this.LJLIL.LIZ.LJIJJ.e(C48263Iwt.LIZLLL("code1:", i, ",code2:", i2), exc);
        ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener = this.LJLIL.LIZJ;
        if (iLiveStreamErrorListener != null) {
            iLiveStreamErrorListener.onError(i, i2, exc);
        }
    }
}
