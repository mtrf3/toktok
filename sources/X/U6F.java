package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;

/* loaded from: classes14.dex */
public final class U6F implements UC6 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ C76732zl LIZIZ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        String str;
        int i;
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(1198);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":getVersionByLayoutId layoutId = ");
        if (layout != null) {
            str = layout.getLayoutId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        C76732zl c76732zl = this.LIZIZ;
        if (layout != null) {
            i = layout.getVersion();
        } else {
            i = this.LIZ.LJIIL.LJLIL;
        }
        c76732zl.element = i;
    }

    public U6F(U8H u8h, C76732zl c76732zl) {
        this.LIZ = u8h;
        this.LIZIZ = c76732zl;
    }
}
