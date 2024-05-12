package X;

import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;

/* renamed from: X.C3z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30723C3z implements IVideoEffectProcessor.FaceDetectListener {
    public final /* synthetic */ C30721C3x LJLIL;

    public C30723C3z(C30721C3x c30721C3x) {
        this.LJLIL = c30721C3x;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.FaceDetectListener
    public final void onFaceDetectResultCallback(int i) {
        boolean z;
        C30721C3x c30721C3x = this.LJLIL;
        if (c30721C3x.LJIILJJIL) {
            C40 c40 = c30721C3x.LJIIJJI;
            if (c40 != null) {
                c40.onResult(-1);
            }
        } else {
            C40 c402 = c30721C3x.LJIIJJI;
            if (c402 != null) {
                c402.onResult(i);
            }
        }
        C41 c41 = this.LJLIL.LJIIL;
        if (c41 != null) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            c41.LIZ(z);
        }
    }
}
