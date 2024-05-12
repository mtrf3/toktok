package com.bytedance.nita;

import X.EnumC38909FOv;
import X.FV3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.nita.api.NitaActivityDynamicView;

/* loaded from: classes7.dex */
public final class Nita$beginDynamicInflate$1 extends NitaActivityDynamicView {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ FV3 LJLJJLL;
    public final /* synthetic */ EnumC38909FOv LJLJL;

    @Override // com.bytedance.nita.api.NitaActivityDynamicView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.nita.api.NitaActivityDynamicView, X.InterfaceC39061FUr
    public final EnumC38909FOv LIZ() {
        return this.LJLJL;
    }

    @Override // X.AbstractC39064FUu, X.InterfaceC39061FUr
    public final FV3 LIZLLL() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC39061FUr
    public final String LJII() {
        return this.LJLJJL;
    }

    public Nita$beginDynamicInflate$1(String str, FV3 fv3, EnumC38909FOv enumC38909FOv) {
        this.LJLJJL = str;
        this.LJLJJLL = fv3;
        this.LJLJL = enumC38909FOv;
    }
}
