package com.ss.android.ugc.aweme.commerce.tools.common.record;

import X.C58096Mr6;
import X.H92;

/* loaded from: classes8.dex */
public final class CommerceToolsRecordApiComponent implements ICommerceToolsRecordApiComponent {
    @Override // com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent
    public void mm0() {
        H92.LJLIL.setInCommercialSoundPage(false);
    }

    public static ICommerceToolsRecordApiComponent LIZIZ(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsRecordApiComponent.class, z);
        if (LIZ != null) {
            return (ICommerceToolsRecordApiComponent) LIZ;
        }
        return new CommerceToolsRecordApiComponent();
    }
}
