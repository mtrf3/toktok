package com.ss.android.ugc.aweme.creatortools.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShowCaseModel extends F9E {

    @InterfaceC65349Pkn("click_schema")
    public final String clickSchema;

    @InterfaceC65349Pkn("have_permission")
    public final boolean havePermission;

    @InterfaceC65349Pkn("show_entrance")
    public final boolean showEntrance;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.showEntrance), Boolean.valueOf(this.havePermission), this.clickSchema};
    }

    public ShowCaseModel(boolean z, boolean z2, String clickSchema) {
        o.LJIIIZ(clickSchema, "clickSchema");
        this.showEntrance = z;
        this.havePermission = z2;
        this.clickSchema = clickSchema;
    }
}
