package com.ss.android.ugc.aweme.ug.amplify.api;

import X.AbstractC73547Stj;
import X.C86017XpN;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC195797mJ;
import X.InterfaceC64987Pex;

/* loaded from: classes16.dex */
public interface AmplifyApi {
    public static final C86017XpN LIZ = C86017XpN.LIZ;

    @InterfaceC195787mI
    @E4T
    AbstractC73547Stj confirmAction(@InterfaceC195797mJ String str, @InterfaceC64987Pex("select_type") String str2);

    @E4T("/aweme/v2/ug/ugc/permission/user/perm/refuse")
    AbstractC73547Stj refuseAction();
}
