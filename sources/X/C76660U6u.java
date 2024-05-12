package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;

/* renamed from: X.U6u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76660U6u implements UC6 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        if (layout != null) {
            U8H u8h = this.LIZ;
            boolean z = this.LIZIZ;
            u8h.getClass();
            String LJJJ = U8H.LJJJ(1083);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(u8h.LJJIJ());
            LIZ.append(":switchLayoutById layoutId = ");
            LIZ.append(layout.getLayoutId());
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            U8H.LJJLIIIJJIZ(u8h, layout, z, false, null, 24);
        }
    }

    public C76660U6u(U8H u8h, boolean z) {
        this.LIZ = u8h;
        this.LIZIZ = z;
    }
}
