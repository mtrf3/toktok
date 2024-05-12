package com.bytedance.pia.core.bridge.methods;

import X.C37364ElU;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC37408EmC;
import X.InterfaceC65349Pkn;
import com.bytedance.pia.core.bridge.methods.CacheUpdateManifestMethod;
import com.google.gson.m;

/* loaded from: classes7.dex */
public final class CacheUpdateManifestMethod implements InterfaceC37405Em9<Params, Void> {
    public static final C37403Em7<Params, Void> LIZ = new C37403Em7<>("pia.internal.cache.updateManifest", EnumC37404Em8.All, new InterfaceC37408EmC() { // from class: X.Elx
        @Override // X.InterfaceC37408EmC
        public final Object create() {
            return new CacheUpdateManifestMethod();
        }

        @Override // X.InterfaceC37408EmC
        public final Object LIZ(Object obj) {
            return create();
        }
    });

    /* loaded from: classes7.dex */
    public static class Params {

        @InterfaceC65349Pkn("manifest")
        public m manifest;
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        m mVar = ((Params) obj).manifest;
        if (mVar == null) {
            C37364ElU.LIZ("'manifest' must bu not null!", c37400Em4);
        } else {
            c37449Emr.LIZIZ.LJIILIIL.LIZ(mVar);
            c37399Em3.accept(null);
        }
    }
}
