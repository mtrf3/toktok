package com.bytedance.ies.sdk.widgets;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ElementSpecImplKt {
    public static final void animation(ElementSpecImpl elementSpecImpl, InterfaceC65784Pro<? extends AnimationInfo> init) {
        o.LJIIIZ(elementSpecImpl, "<this>");
        o.LJIIIZ(init, "init");
        elementSpecImpl.setAnimation(init.invoke());
    }

    public static final void onAttach(ElementSpecImpl elementSpecImpl, InterfaceC88472Yns<? super ConstraintProperty, C76800UCe> f) {
        o.LJIIIZ(elementSpecImpl, "<this>");
        o.LJIIIZ(f, "f");
        elementSpecImpl.setOnAttach(f);
    }

    public static final void sceneObserver(ElementSpecImpl elementSpecImpl, InterfaceC65784Pro<? extends SceneObserver> init) {
        o.LJIIIZ(elementSpecImpl, "<this>");
        o.LJIIIZ(init, "init");
        elementSpecImpl.addSceneObserver(init.invoke());
    }

    public static final void animation(ElementSpecImpl elementSpecImpl, AnimationInfo init) {
        o.LJIIIZ(elementSpecImpl, "<this>");
        o.LJIIIZ(init, "init");
        elementSpecImpl.setAnimation(init);
    }
}
