package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DraftOperationLog extends F9E {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("e_code")
    public final List<DraftOperationCode> errorCode;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("success_count")
    public final int successCount;

    public DraftOperationLog() {
        this(null, 0, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftOperationLog copy$default(DraftOperationLog draftOperationLog, String str, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = draftOperationLog.name;
        }
        if ((i3 & 2) != 0) {
            i = draftOperationLog.count;
        }
        if ((i3 & 4) != 0) {
            list = draftOperationLog.errorCode;
        }
        if ((i3 & 8) != 0) {
            i2 = draftOperationLog.successCount;
        }
        return draftOperationLog.copy(str, i, list, i2);
    }

    public final DraftOperationLog copy(String name, int i, List<DraftOperationCode> errorCode, int i2) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(errorCode, "errorCode");
        return new DraftOperationLog(name, i, errorCode, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, Integer.valueOf(this.count), this.errorCode, Integer.valueOf(this.successCount)};
    }

    public final int getCount() {
        return this.count;
    }

    public final List<DraftOperationCode> getErrorCode() {
        return this.errorCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public DraftOperationLog(String name, int i, List<DraftOperationCode> errorCode, int i2) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(errorCode, "errorCode");
        this.name = name;
        this.count = i;
        this.errorCode = errorCode;
        this.successCount = i2;
    }

    public DraftOperationLog(String str, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C61878OQg.INSTANCE : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
