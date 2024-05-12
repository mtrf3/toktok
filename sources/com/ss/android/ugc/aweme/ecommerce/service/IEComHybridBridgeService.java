package com.ss.android.ugc.aweme.ecommerce.service;

import X.C38150EyA;
import X.F3T;
import X.InterfaceC37666EqM;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IEComHybridBridgeService {
    List<Class<? extends InterfaceC37666EqM>> getIDLXBridges();

    InterfaceC38012Evw getJSMethodByName(C38150EyA c38150EyA, WeakReference<Context> weakReference, String str);

    List<InterfaceC38186Eyk> getJSMethods(F3T f3t);

    Map<String, InterfaceC38012Evw> getJSMethods(C38150EyA c38150EyA, WeakReference<Context> weakReference);
}
