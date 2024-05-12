package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DraftOperationCode extends F9E {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("code")
    public final String code;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftOperationCode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftOperationCode copy$default(DraftOperationCode draftOperationCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftOperationCode.code;
        }
        return draftOperationCode.copy(str);
    }

    public final DraftOperationCode copy(String code) {
        o.LJIIIZ(code, "code");
        return new DraftOperationCode(code);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.code};
    }

    public final String getCode() {
        return this.code;
    }

    public DraftOperationCode(String code) {
        o.LJIIIZ(code, "code");
        this.code = code;
    }

    public /* synthetic */ DraftOperationCode(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
