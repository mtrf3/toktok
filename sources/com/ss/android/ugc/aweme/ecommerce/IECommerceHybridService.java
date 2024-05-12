package com.ss.android.ugc.aweme.ecommerce;

import X.C38150EyA;
import X.C40197Fq5;
import X.F3T;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IECommerceHybridService {
    List<InterfaceC38186Eyk> LIZ(F3T f3t);

    Map<String, InterfaceC38012Evw> LIZIZ(C38150EyA c38150EyA, WeakReference<Context> weakReference);

    List<ISparkRouterInterceptor> LIZJ();

    void LIZLLL();

    List<IInterceptor> LJ();

    List<C40197Fq5> LJFF();

    List<ISparkRouterInterceptor> LJI(String str);

    InterfaceC38012Evw LJII(C38150EyA c38150EyA, WeakReference<Context> weakReference, String str);
}
