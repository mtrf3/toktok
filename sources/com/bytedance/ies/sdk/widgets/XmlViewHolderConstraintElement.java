package com.bytedance.ies.sdk.widgets;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class XmlViewHolderConstraintElement extends GroupHolderConstraintElement {
    public final View view;

    public final View getView() {
        return this.view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmlViewHolderConstraintElement(View view, PropertyResolver propertyResolver) {
        super(propertyResolver);
        o.LJIIIZ(view, "view");
        this.view = view;
    }
}
