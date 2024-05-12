package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ActionToReportStruct extends F9E {

    @InterfaceC65349Pkn("click")
    public final boolean click;

    public ActionToReportStruct() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.click)};
    }

    public ActionToReportStruct(boolean z) {
        this.click = z;
    }

    public /* synthetic */ ActionToReportStruct(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
