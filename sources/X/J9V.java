package X;

import android.content.Context;
import android.view.SurfaceView;

/* loaded from: classes9.dex */
public final class J9V extends SurfaceView implements J9X {
    public InterfaceC47258Igg LJLIL;

    @Override // X.J9X
    public InterfaceC47258Igg getRelatedSurfaceHolder() {
        return this.LJLIL;
    }

    public J9V(Context context) {
        super(context);
    }

    public void setRelatedSurfaceHolder(InterfaceC47258Igg interfaceC47258Igg) {
        this.LJLIL = interfaceC47258Igg;
    }
}
