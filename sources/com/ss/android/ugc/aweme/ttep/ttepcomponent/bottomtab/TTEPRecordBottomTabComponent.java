package com.ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab;

import X.C82329WSv;
import X.C82622Wbi;
import X.SFS;
import X.WIF;
import X.WMH;
import X.WSH;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TTEPRecordBottomTabComponent extends C82329WSv {
    @Override // X.C82329WSv, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        showBottomTab(false);
    }

    @Override // X.C82329WSv, X.InterfaceC45979I2t
    public void showBottomTab(boolean z) {
        WIF wif = (WIF) getDiContainer().LJIIIIZZ(null, WIF.class);
        if (wif != null) {
            wif.P1(-SFS.LJI(28.0d));
        }
        super.showBottomTab(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTEPRecordBottomTabComponent(WMH parentScene, C82622Wbi diContainer, List<? extends WSH> bottoms) {
        super(parentScene, diContainer, bottoms);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(bottoms, "bottoms");
    }
}
