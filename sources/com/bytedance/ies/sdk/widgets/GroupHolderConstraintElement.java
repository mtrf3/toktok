package com.bytedance.ies.sdk.widgets;

import X.C74296TDw;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class GroupHolderConstraintElement implements ConstraintElement {
    public ArrayList<C74296TDw> groups;
    public final PropertyResolver propertyResolver;

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public List<C74296TDw> getGroups() {
        return this.groups;
    }

    public final PropertyResolver getPropertyResolver() {
        return this.propertyResolver;
    }

    public GroupHolderConstraintElement(PropertyResolver propertyResolver) {
        this.propertyResolver = propertyResolver;
    }

    public final void addGroup(C74296TDw group) {
        o.LJIIIZ(group, "group");
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        ArrayList<C74296TDw> arrayList = this.groups;
        if (arrayList != null) {
            arrayList.add(group);
        }
    }
}
