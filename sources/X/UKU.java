package X;

import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKU extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UKU(C1O4 elementContext) {
        super(elementContext);
        o.LJIIIZ(elementContext, "elementContext");
        MultiElementSpecImplKt.groupableElement(this, R.id.i_w, UKW.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.ia5, UKY.LJLIL);
        UKC.LIZ(this, R.id.ia1);
        MultiElementSpecImplKt.groupableElement(this, R.id.ia2, UKX.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.ia7, UKT.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.gis, UKV.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.i_z, new AqS179S0100000_13(elementContext, 10));
        UK5 uk5 = new UK5(R.id.dx6);
        uk5.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(C11110c7.LJII)));
        registerElement(uk5);
        UKC.LIZ(this, R.id.dyg);
    }
}
