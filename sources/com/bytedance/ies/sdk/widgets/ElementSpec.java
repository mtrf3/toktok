package com.bytedance.ies.sdk.widgets;

import X.C018205i;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public interface ElementSpec {
    void attach(ConstraintProperty constraintProperty);

    void dispose();

    AnimationInfo getAnimation();

    C018205i getConstraintWidget();

    int getId();

    InterfaceC88472Yns<ConstraintProperty, C76800UCe> getOnAttach();

    List<SceneObserver> getSceneObservers();

    void onDispose();

    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static void onDispose(ElementSpec elementSpec) {
        }

        public static void dispose(ElementSpec elementSpec) {
            elementSpec.onDispose();
            AnimationInfo animation = elementSpec.getAnimation();
            if (animation != null) {
                animation.cancelShowAnimation();
            }
            AnimationInfo animation2 = elementSpec.getAnimation();
            if (animation2 != null) {
                animation2.cancelHideAnimation();
            }
        }

        public static void attach(ElementSpec elementSpec, ConstraintProperty constraintProperty) {
            o.LJIIIZ(constraintProperty, "constraintProperty");
            InterfaceC88472Yns<ConstraintProperty, C76800UCe> onAttach = elementSpec.getOnAttach();
            if (onAttach != null) {
                onAttach.invoke(constraintProperty);
            }
        }
    }
}
