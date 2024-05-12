package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class SupportedActionsWrapper extends F9E {

    @InterfaceC65349Pkn("key")
    public Long actionType;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("value")
    public Boolean f9switch;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportedActionsWrapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.actionType, this.f9switch};
    }

    public SupportedActionsWrapper(Long l, Boolean bool) {
        this.actionType = l;
        this.f9switch = bool;
    }

    public /* synthetic */ SupportedActionsWrapper(Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : bool);
    }
}
