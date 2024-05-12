package com.bytedance.ies.sdk.widgets;

import X.C018905p;
import X.C16880lQ;
import X.X1D;
import android.view.View;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LayerInfoHolderElement extends GroupHolderConstraintElement {
    public ConstraintProperty constraintProperty;
    public final LayeredConstraintLayout container;
    public final int id;
    public final LayerInfo layerInfo;

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        ConstraintProperty constraintProperty = this.constraintProperty;
        if (constraintProperty != null) {
            return constraintProperty;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No view attached. Id is ");
        LIZ.append(this.container.getContext().getResources().getResourceEntryName(this.id));
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final LayeredConstraintLayout getContainer() {
        return this.container;
    }

    public final int getId() {
        return this.id;
    }

    public final LayerInfo getLayerInfo() {
        return this.layerInfo;
    }

    public final void onAttachView(View view, C018905p lp) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(lp, "lp");
        View findViewById = this.container.findViewById(this.id);
        if (findViewById != null) {
            C16880lQ.LLD(this.container, findViewById);
        }
        LayeredConstraintLayout.LayoutParams layoutParams = new LayeredConstraintLayout.LayoutParams(lp);
        layoutParams.setLayer(this.layerInfo.getLayer());
        layoutParams.setOrder(this.layerInfo.getOrder());
        view.setLayoutParams(layoutParams);
        this.container.addViewByWeight(view);
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        this.constraintProperty = constraintProperty;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerInfoHolderElement(int i, LayeredConstraintLayout container, PropertyResolver propertyResolver) {
        super(propertyResolver);
        o.LJIIIZ(container, "container");
        o.LJIIIZ(propertyResolver, "propertyResolver");
        this.id = i;
        this.container = container;
        this.layerInfo = new LayerInfo();
    }
}
