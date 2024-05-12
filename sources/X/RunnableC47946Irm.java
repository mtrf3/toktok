package X;

import com.ss.ttm.net.AVResolver;
import java.net.InetAddress;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Irm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47946Irm implements Runnable {
    public final AVResolver LJLIL;
    public final String LJLILLLLZI;

    public final void LIZ() {
        InetAddress inetAddress;
        String str;
        String str2 = null;
        try {
            inetAddress = InetAddress.getByName(this.LJLILLLLZI);
        } catch (Throwable th) {
            th = th;
            inetAddress = null;
        }
        try {
            str = inetAddress.getHostAddress();
        } catch (Throwable th2) {
            th = th2;
            this.LJLIL.LIZJ = th.getMessage();
            str = null;
            AVResolver aVResolver = this.LJLIL;
            aVResolver.LIZIZ = true;
            if (inetAddress != null) {
                return;
            } else {
                return;
            }
        }
        AVResolver aVResolver2 = this.LJLIL;
        aVResolver2.LIZIZ = true;
        if (inetAddress != null || str == null) {
            return;
        }
        aVResolver2.LIZLLL = r1;
        String[] strArr = {str};
        C47947Irn c47947Irn = new C47947Irn();
        c47947Irn.LIZIZ = System.currentTimeMillis();
        c47947Irn.LIZ = str;
        String str3 = this.LJLILLLLZI;
        synchronized (AVResolver.class) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Hashtable<String, C47947Irn> hashtable = AVResolver.LJI;
                if (hashtable.size() > 128) {
                    Iterator<Map.Entry<String, C47947Irn>> it = hashtable.entrySet().iterator();
                    C47947Irn c47947Irn2 = null;
                    while (it.hasNext()) {
                        C47947Irn value = it.next().getValue();
                        str2 = it.next().getKey();
                        if (value != null) {
                            long j = value.LIZIZ;
                            if (j < currentTimeMillis) {
                                c47947Irn2 = value;
                                currentTimeMillis = j;
                            }
                        }
                    }
                    if (c47947Irn2 != null && str2 != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("putHostInfo remove host cache");
                        LIZ.append(c47947Irn2.LIZ);
                        X1D.LIZIZ(LIZ);
                        AVResolver.LJI.remove(str2);
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            AVResolver.LJI.put(str3, c47947Irn);
        }
        c47947Irn.LIZIZ = System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47946Irm(AVResolver aVResolver, String str) {
        this.LJLIL = aVResolver;
        this.LJLILLLLZI = str;
    }
}
