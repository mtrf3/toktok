package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC36908Ee8;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;

/* loaded from: classes8.dex */
public final class STSAuthConfig extends AbstractC36908Ee8 {

    @InterfaceC195777mH
    @InterfaceC65349Pkn("access_key_id")
    public String accessKeyId;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("secret_access_key")
    public String secretAccessKey;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("session_token")
    public String sessionToken;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("space_name")
    public String spaceName;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("STSAuthConfig{accessKeyId='");
        LIZ.append(this.accessKeyId);
        LIZ.append("', secretAccessKey='");
        LIZ.append(this.secretAccessKey);
        LIZ.append("', sessionToken='");
        LIZ.append(this.sessionToken);
        LIZ.append("', spaceName='");
        return JBR.LJFF(LIZ, this.spaceName, "'}", LIZ);
    }
}
