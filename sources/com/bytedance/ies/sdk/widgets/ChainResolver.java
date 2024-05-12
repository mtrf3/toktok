package com.bytedance.ies.sdk.widgets;

import X.C47261Igj;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ChainResolver {
    public final int chainStyle;
    public final int endId;
    public final int[] ids;
    public final int spacing;
    public final int startId;

    public final int getChainStyle() {
        return this.chainStyle;
    }

    public final int getEndId() {
        return this.endId;
    }

    public final int[] getIds() {
        return this.ids;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getStartId() {
        return this.startId;
    }

    public final void resolveChain(List<? extends ConstraintProperty> properties) {
        o.LJIIIZ(properties, "properties");
        for (ConstraintProperty constraintProperty : properties) {
            constraintProperty.removeConstraints(6);
            constraintProperty.removeConstraints(7);
            constraintProperty.apply();
        }
        ArrayList arrayList = new ArrayList();
        for (ConstraintProperty constraintProperty2 : properties) {
            if (constraintProperty2.getView().getVisibility() != 8) {
                arrayList.add(constraintProperty2);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    ConstraintProperty constraintProperty3 = (ConstraintProperty) next;
                    if (i == 0) {
                        constraintProperty3.addToHorizontalChainHeadRtl(this.startId);
                    } else {
                        constraintProperty3.addToHorizontalChainRtl(((ConstraintProperty) ListProtector.get(arrayList, i - 1)).id(), 0);
                    }
                    constraintProperty3.horizontalChainStyle(this.chainStyle);
                    constraintProperty3.horizontalBias(0.0f);
                    if (i > 0) {
                        constraintProperty3.margin(6, this.spacing);
                    }
                    if (i == C47261Igj.LJJI(arrayList)) {
                        constraintProperty3.addToHorizontalChainTailRtl(this.endId);
                    }
                    constraintProperty3.apply();
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public ChainResolver(int i, int i2, int i3, int i4, int... ids) {
        o.LJIIIZ(ids, "ids");
        this.startId = i;
        this.endId = i2;
        this.chainStyle = i3;
        this.spacing = i4;
        this.ids = ids;
    }
}
