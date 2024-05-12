package com.ss.android.ugc.aweme.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PersonalizationModel extends F9E {

    @InterfaceC65349Pkn("biz_name")
    public final String bizName;

    @InterfaceC65349Pkn("need_personalization")
    public final boolean needPersonalization;

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalizationModel() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PersonalizationModel copy$default(PersonalizationModel personalizationModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalizationModel.bizName;
        }
        if ((i & 2) != 0) {
            z = personalizationModel.needPersonalization;
        }
        return personalizationModel.copy(str, z);
    }

    public final PersonalizationModel copy(String bizName, boolean z) {
        o.LJIIIZ(bizName, "bizName");
        return new PersonalizationModel(bizName, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.bizName, Boolean.valueOf(this.needPersonalization)};
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final boolean getNeedPersonalization() {
        return this.needPersonalization;
    }

    public PersonalizationModel(String bizName, boolean z) {
        o.LJIIIZ(bizName, "bizName");
        this.bizName = bizName;
        this.needPersonalization = z;
    }

    public /* synthetic */ PersonalizationModel(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
