package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJZ extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJZ(C1O4 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        UJX ujx = new UJX(layeredElementContext);
        UJP ujp = new UJP(layeredElementContext, layeredElementContext.getContext(), layeredElementContext.getDataChannel(), new UJY(ujx), new C76984UJg(ujx), new C76985UJh(ujx));
        MultiElementSpecImplKt.element(this, ujx);
        MultiElementSpecImplKt.element(this, ujp);
        C76987UJj c76987UJj = new C76987UJj(layeredElementContext);
        MultiElementSpecImplKt.element(this, c76987UJj);
        MultiElementSpecImplKt.element(this, R.id.eqg);
        MultiElementSpecImplKt.element(this, new C76973UIv(layeredElementContext, new C76986UJi(c76987UJj)));
        MultiElementSpecImplKt.element(this, R.id.eqa);
        MultiElementSpecImplKt.element(this, R.id.eqb);
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.eqd);
        ElementSpecImplKt.onAttach(elementSpecImpl, new AqS179S0100000_13(layeredElementContext, 580));
        registerElement(elementSpecImpl);
        MultiElementSpecImplKt.element(this, R.id.apg);
        MultiElementSpecImplKt.element(this, R.id.apf);
        registerElement(new UJM(layeredElementContext, this));
    }

    public static boolean LIZ(LayeredElementContext layeredElementContext) {
        if (C76128TuG.LIZIZ(layeredElementContext.getDataChannel(), false, 6) && ((IInteractService) CN1.LIZ(IInteractService.class)).yr() == 1) {
            return false;
        }
        return true;
    }
}
