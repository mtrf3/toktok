package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class TruthOrDareTip extends F9E {

    @InterfaceC65349Pkn("tip_content")
    public String tipContent;

    @InterfaceC65349Pkn("tip_type")
    public String tipType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.tipType, this.tipContent};
    }
}
