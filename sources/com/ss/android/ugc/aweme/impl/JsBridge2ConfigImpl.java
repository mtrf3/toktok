package com.ss.android.ugc.aweme.impl;

import X.C35576Dxk;
import X.C38007Evr;
import X.C58096Mr6;
import X.DOI;
import X.InterfaceC37086Eh0;
import X.InterfaceC38033EwH;
import X.InterfaceC38071Ewt;
import com.bytedance.ies.web.jsbridge2.IJsBridge2Config;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;

/* loaded from: classes7.dex */
public class JsBridge2ConfigImpl implements IJsBridge2Config {
    public static IJsBridge2Config LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IJsBridge2Config.class, false);
        if (LIZ != null) {
            return (IJsBridge2Config) LIZ;
        }
        return new JsBridge2ConfigImpl();
    }

    @Override // com.bytedance.ies.web.jsbridge2.IJsBridge2Config
    public final InterfaceC37086Eh0 LIZ() {
        if (DOI.LIZJ()) {
            return new C35576Dxk();
        }
        return null;
    }

    @Override // com.bytedance.ies.web.jsbridge2.IJsBridge2Config
    public final InterfaceC38033EwH LIZIZ() {
        if (DOI.LIZJ()) {
            return new JsBridge2PermissionConfigurator();
        }
        return null;
    }

    @Override // com.bytedance.ies.web.jsbridge2.IJsBridge2Config
    public final InterfaceC38071Ewt LIZJ() {
        if (DOI.LIZJ()) {
            return new C38007Evr();
        }
        return null;
    }
}
