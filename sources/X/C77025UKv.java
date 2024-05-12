package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UKv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77025UKv extends MultiElementSpecImpl<C77025UKv> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77025UKv(UL8 landscapeLayeredElementContext) {
        super(landscapeLayeredElementContext);
        o.LJIIIZ(landscapeLayeredElementContext, "landscapeLayeredElementContext");
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(C77019UKp.LIZ);
        elementSpecImpl.addSceneObserver(new C77022UKs(0, new AqS179S0100000_13(landscapeLayeredElementContext, 624)));
        registerElement(elementSpecImpl);
        ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(C77019UKp.LIZIZ);
        elementSpecImpl2.addSceneObserver(new C77022UKs(2, new AqS179S0100000_13(landscapeLayeredElementContext, 625)));
        registerElement(elementSpecImpl2);
        ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(C77019UKp.LIZJ);
        elementSpecImpl3.addSceneObserver(new C77022UKs(1, null));
        registerElement(elementSpecImpl3);
        ElementSpecImpl elementSpecImpl4 = new ElementSpecImpl(C77019UKp.LIZLLL);
        elementSpecImpl4.addSceneObserver(new C77024UKu(landscapeLayeredElementContext));
        registerElement(elementSpecImpl4);
        ElementSpecImpl elementSpecImpl5 = new ElementSpecImpl(C77019UKp.LJ);
        elementSpecImpl5.addSceneObserver(new C77026UKw(landscapeLayeredElementContext));
        registerElement(elementSpecImpl5);
    }
}
