package X;

import com.bytedance.ies.nle.editor_jni.INLEAsyncRenderPlayStatusListener;

/* loaded from: classes16.dex */
public final class Y52 extends INLEAsyncRenderPlayStatusListener {
    public final /* synthetic */ Y50 LIZ;

    @Override // com.bytedance.ies.nle.editor_jni.INLEAsyncRenderPlayStatusListener
    public final void onPauseInner() {
        this.LIZ.LJIIIIZZ.set(System.currentTimeMillis());
        this.LIZ.LIZIZ.postValue(Boolean.FALSE);
        Y50 y50 = this.LIZ;
        y50.LJIIJ.postDelayed(y50.LJIILIIL, 4000L);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEAsyncRenderPlayStatusListener
    public final void onPlayInner() {
        this.LIZ.LIZLLL.set(System.currentTimeMillis() - this.LIZ.LJIIIIZZ.get());
        this.LIZ.LIZIZ.postValue(Boolean.TRUE);
        Y50 y50 = this.LIZ;
        y50.LJIIJ.removeCallbacks(y50.LJIILIIL);
    }

    public Y52(Y50 y50) {
        this.LIZ = y50;
    }
}
