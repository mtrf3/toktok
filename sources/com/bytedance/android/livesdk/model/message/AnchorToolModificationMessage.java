package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class AnchorToolModificationMessage extends CR6 {

    @InterfaceC65349Pkn("modification")
    public AnchorToolModification modification;

    public AnchorToolModificationMessage() {
        this.type = EnumC31509CYf.ANCHOR_TOOL_MODIFICATION_MESSAGE;
        this.modification = new AnchorToolModification();
    }
}
