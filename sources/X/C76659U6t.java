package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;

/* renamed from: X.U6t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76659U6t implements UC6 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ C76732zl LIZIZ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        String str;
        int i;
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(1171);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":getLayoutMaxMicCountById layoutId = ");
        if (layout != null) {
            str = layout.getLayoutId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        C76732zl c76732zl = this.LIZIZ;
        if (layout != null) {
            i = layout.getMicCount();
        } else {
            i = 4;
        }
        c76732zl.element = i;
    }

    public C76659U6t(U8H u8h, C76732zl c76732zl) {
        this.LIZ = u8h;
        this.LIZIZ = c76732zl;
    }
}
