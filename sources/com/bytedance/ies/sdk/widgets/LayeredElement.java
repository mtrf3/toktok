package com.bytedance.ies.sdk.widgets;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class LayeredElement extends XmlViewHolderConstraintElement {
    public final ConstraintProperty constraintProperty;

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        return this.constraintProperty;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayeredElement(View view, PropertyResolver propertyResolver) {
        super(view, propertyResolver);
        o.LJIIIZ(view, "view");
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = propertyResolver;
        this.constraintProperty = constraintProperty;
    }
}
