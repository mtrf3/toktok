package com.bytedance.ies.sdk.widgets;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class GroupableElementSpecImpl extends ElementSpecImpl implements GroupableElementSpec {
    public final List<Integer> bindingGroup;

    @Override // com.bytedance.ies.sdk.widgets.GroupableElementSpec
    public List<Integer> getGroupIds() {
        return this.bindingGroup;
    }

    public GroupableElementSpecImpl(int i) {
        super(i);
        this.bindingGroup = new ArrayList();
    }

    public final GroupableElementSpecImpl bindGroup(int i) {
        this.bindingGroup.add(Integer.valueOf(i));
        return this;
    }

    public final GroupableElementSpecImpl bindGroups(List<Integer> ids) {
        o.LJIIIZ(ids, "ids");
        this.bindingGroup.addAll(ids);
        return this;
    }

    public final GroupableElementSpecImpl removeGroup(int i) {
        this.bindingGroup.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupableElementSpecImpl(int i, List<Integer> groupIds) {
        this(i);
        o.LJIIIZ(groupIds, "groupIds");
        this.bindingGroup.addAll(groupIds);
    }
}
