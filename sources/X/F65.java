package X;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Bundle;
import com.ttnet.org.chromium.net.ProxyChangeListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final /* synthetic */ class F65 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        F66 LIZ;
        switch (this.LJLIL) {
            case 0:
                java.util.Set set = (java.util.Set) this.LJLILLLLZI;
                java.util.Map map = (java.util.Map) this.LJLJI;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    List list = (List) map.get(it.next());
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((F67) it2.next()).onChanged();
                        }
                    }
                }
                return;
            case 1:
                C37477EnJ c37477EnJ = (C37477EnJ) this.LJLILLLLZI;
                ((HashSet) c37477EnJ.LIZIZ).add(this.LJLJI);
                return;
            default:
                ProxyChangeListener proxyChangeListener = (ProxyChangeListener) this.LJLILLLLZI;
                Intent intent = (Intent) this.LJLJI;
                proxyChangeListener.getClass();
                ProxyInfo defaultProxy = ((ConnectivityManager) C16880lQ.LLILL(O6T.LIZ, "connectivity")).getDefaultProxy();
                if (defaultProxy == null) {
                    LIZ = F66.LJ;
                } else if (Build.VERSION.SDK_INT >= 29 && "localhost".equals(defaultProxy.getHost()) && defaultProxy.getPort() == -1) {
                    Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                    if (LLJJIJI == null) {
                        LIZ = null;
                    } else {
                        LIZ = F66.LIZ((ProxyInfo) C16880lQ.LLJJIII(LLJJIJI, "android.intent.extra.PROXY_INFO"));
                    }
                } else {
                    LIZ = F66.LIZ(defaultProxy);
                }
                proxyChangeListener.LIZ(LIZ);
                return;
        }
    }

    public /* synthetic */ F65(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
