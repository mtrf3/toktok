package com.ss.android.ugc.aweme.commercialize.media.impl.handler.banner;

import X.C43684HCm;
import X.H92;
import X.InterfaceC44205HWn;
import X.InterfaceC74236TBo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceMusicBannerTargetPageHandler implements InterfaceC44205HWn {
    @Override // X.InterfaceC44205HWn
    public final void Hw(String str, String str2) {
        H92.LJLIL.getClass();
        C43684HCm c43684HCm = H92.LJLJJLL;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = H92.LJLILLLLZI;
        c43684HCm.LIZIZ(interfaceC74236TBoArr[3], str);
        H92.LJLJL.LIZIZ(interfaceC74236TBoArr[4], str2);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            H92.LJLIL.getClass();
            C43684HCm c43684HCm = H92.LJLJJLL;
            InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = H92.LJLILLLLZI;
            c43684HCm.LIZIZ(interfaceC74236TBoArr[3], null);
            H92.LJLJL.LIZIZ(interfaceC74236TBoArr[4], null);
        }
    }
}
