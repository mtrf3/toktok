package com.ugc.effectcreator.foundation.pagestatus;

import X.C93430aQk;
import X.C94160acW;
import X.C94161acX;
import X.EnumC93477aRV;
import X.InterfaceC93645aUD;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.pagestatus.IStatusPageProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class StatusPageProviderImpl implements IStatusPageProvider {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.pagestatus.IStatusPageProvider
    public InterfaceC93645aUD provideStatusPage(EnumC93477aRV style) {
        o.LJIIIZ(style, "style");
        if (C93430aQk.LIZ[style.ordinal()] != 1) {
            return new C94160acW();
        }
        return new C94161acX();
    }
}
