package com.ss.android.ugc.aweme.ttep.ttepcomponent.dockbar;

import X.C82622Wbi;
import X.I0F;
import X.WMH;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTEPRecordDockBarComponent extends I0F {
    @Override // X.I0F, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        setUploadVisibility(8);
    }

    @Override // X.I0F, X.InterfaceC45889Hzh
    public void setUploadVisibility(int i) {
        super.setUploadVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTEPRecordDockBarComponent(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene, diContainer);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
    }
}
