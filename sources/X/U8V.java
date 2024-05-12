package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Insets;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArrayList;

/* loaded from: classes14.dex */
public final class U8V extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76710U8s> {
    public final /* synthetic */ C68322mC<Layout> LJLIL;
    public final /* synthetic */ U8O LJLILLLLZI;
    public final /* synthetic */ Insets LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8V(C68322mC<Layout> c68322mC, U8O u8o, Insets insets, int i, int i2) {
        super(1);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = u8o;
        this.LJLJI = insets;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76710U8s invoke(Integer num) {
        LayoutArrayList layoutMaskConfigListByOnlineMicCount;
        java.util.Map<String, LayoutArray> indexLayoutArrayMap;
        float f;
        int intValue = num.intValue();
        if (!this.LJLIL.element.isFixedType() || (layoutMaskConfigListByOnlineMicCount = this.LJLIL.element.getLayoutMaskConfigListByOnlineMicCount(this.LJLILLLLZI.LJ.LJIIIIZZ())) == null || (indexLayoutArrayMap = layoutMaskConfigListByOnlineMicCount.getIndexLayoutArrayMap()) == null) {
            return null;
        }
        if (this.LJLJI.lessThanRatioAlign() == 256) {
            f = this.LJLJI.getStreamOffset();
        } else {
            f = 0.0f;
        }
        U8O u8o = this.LJLILLLLZI;
        int i = this.LJLJJI;
        int i2 = this.LJLJJL;
        Layout LIZJ = u8o.LIZIZ.LIZJ(false);
        if (LIZJ == null) {
            return null;
        }
        Insets viewForCanvas = LIZJ.getViewForCanvas();
        u8o.LIZLLL.getClass();
        C76710U8s LIZ = U8O.LIZ(intValue, U8P.LIZIZ(i / i2, viewForCanvas), indexLayoutArrayMap);
        if (LIZ == null) {
            return null;
        }
        LIZ.LIZIZ += f;
        return LIZ;
    }
}
