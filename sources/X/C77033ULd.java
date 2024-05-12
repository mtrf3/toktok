package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ULd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77033ULd extends LayerSpecImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77033ULd(UL8 elementContext) {
        super(elementContext);
        o.LJIIIZ(elementContext, "elementContext");
        MultiElementSpecImplKt.element(this, new ULZ(elementContext));
        MultiElementSpecImplKt.element(this, new C77030ULa(elementContext));
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.bkr);
        ElementSpecImplKt.onAttach(elementSpecImpl, new AqS179S0100000_13(elementContext, 621));
        registerElement(elementSpecImpl);
        ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(R.id.n85);
        elementSpecImpl2.addSceneObserver(new C77035ULf(elementContext));
        ElementSpecImplKt.onAttach(elementSpecImpl2, new AqS179S0100000_13(elementContext, 622));
        registerElement(elementSpecImpl2);
        ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(R.id.n9_);
        elementSpecImpl3.addSceneObserver(new C77034ULe());
        registerElement(elementSpecImpl3);
        ElementSpecImpl elementSpecImpl4 = new ElementSpecImpl(R.id.n5l);
        elementSpecImpl4.addSceneObserver(new C77036ULg(elementContext));
        ElementSpecImplKt.onAttach(elementSpecImpl4, new AqS179S0100000_13(elementContext, 623));
        registerElement(elementSpecImpl4);
        ElementSpecImpl elementSpecImpl5 = new ElementSpecImpl(R.id.n4l);
        elementSpecImpl5.addSceneObserver(new C77039ULj());
        registerElement(elementSpecImpl5);
        ElementSpecImpl elementSpecImpl6 = new ElementSpecImpl(R.id.n6f);
        elementSpecImpl6.addSceneObserver(new C77037ULh());
        registerElement(elementSpecImpl6);
        ElementSpecImpl elementSpecImpl7 = new ElementSpecImpl(R.id.n7p);
        elementSpecImpl7.addSceneObserver(new C77038ULi());
        registerElement(elementSpecImpl7);
    }
}
