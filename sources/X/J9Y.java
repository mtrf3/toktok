package X;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes9.dex */
public final class J9Y extends TextureView implements J9X {
    public InterfaceC47258Igg LJLIL;

    @Override // X.J9X
    public InterfaceC47258Igg getRelatedSurfaceHolder() {
        return this.LJLIL;
    }

    public J9Y(Context context) {
        super(context);
    }

    public void setRelatedSurfaceHolder(InterfaceC47258Igg interfaceC47258Igg) {
        this.LJLIL = interfaceC47258Igg;
    }
}
