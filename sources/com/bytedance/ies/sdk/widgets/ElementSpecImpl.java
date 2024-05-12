package com.bytedance.ies.sdk.widgets;

import X.C018205i;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.ies.sdk.widgets.ElementSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ElementSpecImpl implements ElementSpec {
    public AnimationInfo animation;
    public C018205i constraintWidget;
    public final int id;
    public InterfaceC88472Yns<? super ConstraintProperty, C76800UCe> onAttach;
    public final List<SceneObserver> sceneObservers = new ArrayList();

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public void dispose() {
        ElementSpec.DefaultImpls.dispose(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public AnimationInfo getAnimation() {
        return this.animation;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public C018205i getConstraintWidget() {
        return this.constraintWidget;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public int getId() {
        return this.id;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public InterfaceC88472Yns<ConstraintProperty, C76800UCe> getOnAttach() {
        return this.onAttach;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public List<SceneObserver> getSceneObservers() {
        return this.sceneObservers;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public void onDispose() {
        ElementSpec.DefaultImpls.onDispose(this);
    }

    public ElementSpecImpl(int i) {
        this.id = i;
    }

    public final ElementSpecImpl addSceneObserver(SceneObserver sceneObserver) {
        o.LJIIIZ(sceneObserver, "sceneObserver");
        if (!this.sceneObservers.contains(sceneObserver)) {
            this.sceneObservers.add(sceneObserver);
        }
        return this;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public void attach(ConstraintProperty constraintProperty) {
        ElementSpec.DefaultImpls.attach(this, constraintProperty);
    }

    public void setAnimation(AnimationInfo animationInfo) {
        this.animation = animationInfo;
    }

    public void setConstraintWidget(C018205i c018205i) {
        this.constraintWidget = c018205i;
    }

    public void setOnAttach(InterfaceC88472Yns<? super ConstraintProperty, C76800UCe> interfaceC88472Yns) {
        this.onAttach = interfaceC88472Yns;
    }
}
