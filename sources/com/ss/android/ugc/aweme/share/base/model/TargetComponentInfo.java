package com.ss.android.ugc.aweme.share.base.model;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TargetComponentInfo extends F9E {

    @InterfaceC65349Pkn("enable_share_modes")
    public final List<Integer> shareModes;

    @InterfaceC65349Pkn("target_class_name")
    public final String targetClassName;

    @InterfaceC65349Pkn("target_class_name_list")
    public final List<TargetClassItem> targetClassNameList;

    /* JADX WARN: Multi-variable type inference failed */
    public TargetComponentInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.targetClassName, this.shareModes, this.targetClassNameList};
    }

    public TargetComponentInfo(String targetClassName, List<Integer> shareModes, List<TargetClassItem> targetClassNameList) {
        o.LJIIIZ(targetClassName, "targetClassName");
        o.LJIIIZ(shareModes, "shareModes");
        o.LJIIIZ(targetClassNameList, "targetClassNameList");
        this.targetClassName = targetClassName;
        this.shareModes = shareModes;
        this.targetClassNameList = targetClassNameList;
    }

    public /* synthetic */ TargetComponentInfo(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C47261Igj.LJII(0) : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
