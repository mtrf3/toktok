package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import kotlin.jvm.internal.AqS144S0200000_13;

/* loaded from: classes14.dex */
public final class U91 implements UC6 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ SeiAppData LIZIZ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        if (layout != null) {
            U8H u8h = this.LIZ;
            U8H.LJJLIIIJJIZ(u8h, layout, true, false, new AqS144S0200000_13(u8h, this.LIZIZ, 77), 8);
        } else {
            this.LIZ.l1();
        }
        this.LIZ.LJJIIJ().LIZJ = false;
    }

    public U91(U8H u8h, SeiAppData seiAppData) {
        this.LIZ = u8h;
        this.LIZIZ = seiAppData;
    }
}
