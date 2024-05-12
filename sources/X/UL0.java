package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL0 extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL0(UL8 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        MultiElementSpecImplKt.element(this, R.id.cww);
        C77023UKt c77023UKt = new C77023UKt(R.id.gbh);
        ElementSpecImplKt.onAttach(c77023UKt, UL4.LJLIL);
        registerElement(c77023UKt);
        MultiElementSpecImplKt.groupableElement(this, R.id.gbg, UL3.LJLIL);
        MultiElementSpecImplKt.element(this, new ULT(layeredElementContext));
        MultiElementSpecImplKt.element(this, R.id.kc6);
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.bkq);
        elementSpecImpl.setAnimation(new UL7(layeredElementContext, elementSpecImpl.getId()));
        registerElement(elementSpecImpl);
        MultiElementSpecImplKt.groupableElement(this, R.id.g9v, C77029UKz.LJLIL);
        C77023UKt c77023UKt2 = new C77023UKt(R.id.b97);
        int i = C77019UKp.LIZLLL;
        c77023UKt2.bindGroup(i);
        registerElement(c77023UKt2);
        C77023UKt c77023UKt3 = new C77023UKt(R.id.kxc);
        c77023UKt3.bindGroup(i);
        ElementSpecImplKt.onAttach(c77023UKt3, new AqS179S0100000_13(layeredElementContext, 627));
        registerElement(c77023UKt3);
        C77023UKt c77023UKt4 = new C77023UKt(R.id.jto);
        c77023UKt4.bindGroup(i);
        ElementSpecImplKt.onAttach(c77023UKt4, new AqS179S0100000_13(layeredElementContext, 628));
        registerElement(c77023UKt4);
        MultiElementSpecImplKt.groupableElement(this, R.id.kpy, UL1.LJLIL);
        registerElement(new UL2(layeredElementContext));
        ULM ulm = new ULM(layeredElementContext);
        ulm.bindGroups(C77019UKp.LJFF);
        registerElement(ulm);
        MultiElementSpecImplKt.groupableElement(this, R.id.bjy, new AqS179S0100000_13(layeredElementContext, 626));
    }
}
