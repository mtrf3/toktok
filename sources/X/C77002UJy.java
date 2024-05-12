package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UJy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77002UJy extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77002UJy(LayeredElementContext layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.eql);
        elementSpecImpl.addSceneObserver(new C77001UJx());
        ElementSpecImplKt.onAttach(elementSpecImpl, new AqS179S0100000_13(layeredElementContext, 620));
        registerElement(elementSpecImpl);
    }
}
