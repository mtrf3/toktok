package com.ss.android.ugc.aweme.setting.viewmodel;

import X.C70839Rr9;
import X.F9E;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AuthInfoState extends F9E implements InterfaceC61312at {
    public static final int $stable = 8;
    public final ListState listState;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthInfoState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthInfoState copy$default(AuthInfoState authInfoState, ListState listState, int i, Object obj) {
        if ((i & 1) != 0) {
            listState = authInfoState.listState;
        }
        return authInfoState.copy(listState);
    }

    public final AuthInfoState copy(ListState listState) {
        o.LJIIIZ(listState, "listState");
        return new AuthInfoState(listState);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.listState};
    }

    public final ListState getListState() {
        return this.listState;
    }

    public AuthInfoState(ListState listState) {
        o.LJIIIZ(listState, "listState");
        this.listState = listState;
    }

    public /* synthetic */ AuthInfoState(ListState listState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ListState(new C70839Rr9(3), null, null, null, null, 30, null) : listState);
    }
}
