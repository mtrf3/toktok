package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6O implements UC4 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ LayoutDSLConfig LIZIZ;

    @Override // X.UC4
    public final void LIZ(DslLayout dslLayout) {
        o.LJIIIZ(dslLayout, "dslLayout");
        U8H u8h = this.LIZ;
        u8h.LJIILIIL = dslLayout;
        u8h.LIZ.LJFF.LJIIZILJ(u8h.LJIIL.LJLIL, this.LIZIZ.getLayoutId(), new U6P(this.LIZ));
    }

    public U6O(U8H u8h, LayoutDSLConfig layoutDSLConfig) {
        this.LIZ = u8h;
        this.LIZIZ = layoutDSLConfig;
    }
}
