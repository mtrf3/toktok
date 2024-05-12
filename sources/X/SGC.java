package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LevelListDrawable;

/* loaded from: classes13.dex */
public final class SGC implements InterfaceC78660Uu0 {
    public final /* synthetic */ SGB LJLIL;
    public final /* synthetic */ LevelListDrawable LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.LJLILLLLZI.addLevel(1, 1, new BitmapDrawable(this.LJLIL.LIZ.getResources(), bitmap));
        this.LJLILLLLZI.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.LJLILLLLZI.setLevel(1);
        this.LJLIL.LIZIZ.requestLayout();
    }

    public SGC(SGB sgb, LevelListDrawable levelListDrawable) {
        this.LJLIL = sgb;
        this.LJLILLLLZI = levelListDrawable;
    }
}
