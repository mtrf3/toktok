package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UKj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77013UKj extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77013UKj(UL8 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.ia5);
        elementSpecImpl.addSceneObserver(new C77012UKi());
        registerElement(elementSpecImpl);
        C77023UKt c77023UKt = new C77023UKt(R.id.ia7);
        ElementSpecImplKt.onAttach(c77023UKt, C77015UKl.LJLIL);
        registerElement(c77023UKt);
        C77019UKp.LIZ(this, R.id.ia0);
        ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(R.id.i_z);
        ElementSpecImplKt.onAttach(elementSpecImpl2, new AqS179S0100000_13(layeredElementContext, 619));
        elementSpecImpl2.addSceneObserver(new C77011UKh(layeredElementContext));
        registerElement(elementSpecImpl2);
        MultiElementSpecImplKt.groupableElement(this, R.id.dx6, C77014UKk.LJLIL);
        MultiElementSpecImplKt.groupableElement(this, R.id.dqm, C77016UKm.LJLIL);
        MultiElementSpecImplKt.element(this, R.id.jna);
    }
}
