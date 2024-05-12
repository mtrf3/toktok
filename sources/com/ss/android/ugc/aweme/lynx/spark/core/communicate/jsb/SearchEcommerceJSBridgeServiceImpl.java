package com.ss.android.ugc.aweme.lynx.spark.core.communicate.jsb;

import X.C113554cx;
import X.C37593EpB;
import X.C38150EyA;
import X.C38534FAk;
import X.C39469FeL;
import X.C47261Igj;
import X.C61878OQg;
import X.C71868SIm;
import X.C72837SiH;
import X.F3T;
import X.InterfaceC37666EqM;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SearchEcommerceJSBridgeServiceImpl implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final InterfaceC38012Evw LIZJ(C38150EyA c38150EyA, String name) {
        o.LJIIIZ(name, "name");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC37666EqM>> LIZLLL() {
        return C47261Igj.LJJIJIIJI(C38534FAk.class, C72837SiH.class, C39469FeL.class, C71868SIm.class, C37593EpB.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<InterfaceC38186Eyk> LIZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final Map LIZIZ(C38150EyA c38150EyA) {
        return C113554cx.LJJJLIIL();
    }
}
