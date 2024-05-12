package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class SwitchExtraBase extends F9E {

    @InterfaceC65349Pkn("schema_for_check")
    public String schemaForCheck;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.schemaForCheck;
        return new Object[]{str, str};
    }
}
