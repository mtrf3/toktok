package X;

import android.net.ProxyInfo;

/* loaded from: classes7.dex */
public class F66 {
    public static final F66 LJ = new F66(0, "", "", new String[0]);
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String[] LIZLLL;

    public static F66 LIZ(ProxyInfo proxyInfo) {
        String str = null;
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        android.net.Uri pacFileUrl = proxyInfo.getPacFileUrl();
        if (host == null) {
            host = "";
        }
        int port = proxyInfo.getPort();
        if (!android.net.Uri.EMPTY.equals(pacFileUrl)) {
            str = pacFileUrl.toString();
        }
        return new F66(port, host, str, proxyInfo.getExclusionList());
    }

    public F66(int i, String str, String str2, String[] strArr) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = strArr;
    }
}
