package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;

/* loaded from: classes14.dex */
public final class U90 implements UC6 {
    public final /* synthetic */ U8H LIZ;

    public U90(U8H u8h) {
        this.LIZ = u8h;
    }

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        if (layout != null) {
            U8H.LJJLIIIJJIZ(this.LIZ, layout, true, false, null, 24);
        } else {
            this.LIZ.l1();
        }
        this.LIZ.LJJIIJ().LIZJ = false;
    }
}
