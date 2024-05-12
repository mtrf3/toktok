package X;

import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* renamed from: X.P9s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63996P9s extends C63997P9t {
    public C63996P9s(SSLSocket sSLSocket) {
        super(sSLSocket);
    }

    @Override // X.C63997P9t, javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.LJLIL.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        super.setEnabledProtocols(strArr);
    }
}
