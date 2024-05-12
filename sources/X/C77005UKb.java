package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.UKb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77005UKb extends MultiElementSpecImpl<C77005UKb> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77005UKb(C1O4 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(UKD.LIZ);
        elementSpecImpl.addSceneObserver(new C77006UKc());
        registerElement(elementSpecImpl);
    }
}
