package com.bytedance.pitaya.modules;

import X.InterfaceC93304aOi;
import android.content.Context;
import com.bytedance.pitaya.api.PTYSoLoader;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class NumpyLoader extends SubModule {
    @Override // com.bytedance.pitaya.modules.SubModule
    public boolean load(Context context, PTYSoLoader soLoader, InterfaceC93304aOi errorReporter) {
        o.LJIIJ(soLoader, "soLoader");
        o.LJIIJ(errorReporter, "errorReporter");
        try {
            soLoader.loadSo("py-numpy");
            return true;
        } catch (UnsatisfiedLinkError e) {
            errorReporter.onError(":projects:Pitaya_Android:numpybinder", e);
            return false;
        }
    }
}