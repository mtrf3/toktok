package com.bytedance.ies.sdk.widgets;

import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class MultiElementSpecImpl<T extends MultiElementSpecImpl<T>> implements MultiElementSpec {
    public final List<ElementSpec> elements;
    public final LayeredElementContext layeredElementContext;

    @Override // com.bytedance.ies.sdk.widgets.MultiElementSpec
    public List<ElementSpec> getElements() {
        return this.elements;
    }

    public final LayeredElementContext getLayeredElementContext() {
        return this.layeredElementContext;
    }

    public MultiElementSpecImpl(LayeredElementContext layeredElementContext) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.layeredElementContext = layeredElementContext;
        this.elements = new ArrayList();
    }

    public final T registerElement(ElementSpec elementSpec) {
        o.LJIIIZ(elementSpec, "elementSpec");
        this.elements.add(elementSpec);
        return this;
    }

    public final T registerElements(MultiElementSpec multiElementSpec) {
        o.LJIIIZ(multiElementSpec, "multiElementSpec");
        Iterator<ElementSpec> it = multiElementSpec.getElements().iterator();
        while (it.hasNext()) {
            registerElement(it.next());
        }
        return this;
    }
}
