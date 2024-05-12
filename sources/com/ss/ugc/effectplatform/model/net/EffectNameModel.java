package com.ss.ugc.effectplatform.model.net;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class EffectNameModel extends F9E {
    public String name;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectNameModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EffectNameModel copy$default(EffectNameModel effectNameModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectNameModel.name;
        }
        return effectNameModel.copy(str);
    }

    public final EffectNameModel copy(String str) {
        return new EffectNameModel(str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name};
    }

    public final String getName() {
        return this.name;
    }

    public EffectNameModel(String str) {
        this.name = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public /* synthetic */ EffectNameModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
