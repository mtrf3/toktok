package com.bytedance.ies.sdk.widgets;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiElementSpecImplKt {
    public static final void element(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        multiElementSpecImpl.registerElement(new ElementSpecImpl(i));
    }

    public static final void element(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, ElementSpec elementSpec) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        o.LJIIIZ(elementSpec, "elementSpec");
        multiElementSpecImpl.registerElement(elementSpec);
    }

    public static final void element(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i, InterfaceC88472Yns<? super ElementSpecImpl, C76800UCe> init) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        o.LJIIIZ(init, "init");
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(i);
        init.invoke(elementSpecImpl);
        multiElementSpecImpl.registerElement(elementSpecImpl);
    }

    public static final void groupableElement(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i, InterfaceC88472Yns<? super GroupableElementSpecImpl, C76800UCe> init) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        o.LJIIIZ(init, "init");
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(i);
        init.invoke(groupableElementSpecImpl);
        multiElementSpecImpl.registerElement(groupableElementSpecImpl);
    }

    public static final void groupableElement(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, GroupableElementSpecImpl elementSpec, InterfaceC88472Yns<? super GroupableElementSpecImpl, C76800UCe> init) {
        o.LJIIIZ(multiElementSpecImpl, "<this>");
        o.LJIIIZ(elementSpec, "elementSpec");
        o.LJIIIZ(init, "init");
        init.invoke(elementSpec);
        multiElementSpecImpl.registerElement(elementSpec);
    }
}
