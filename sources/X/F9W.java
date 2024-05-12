package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class F9W implements Callable {
    public static Pattern LJLILLLLZI;
    public final String LJLIL;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.LJLIL);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (LJLILLLLZI == null) {
                        LJLILLLLZI = PatternProtector.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
                    }
                    if (!TextUtils.isEmpty(hostAddress) && hostAddress.length() >= 7 && hostAddress.length() <= 15 && LJLILLLLZI.matcher(hostAddress).matches()) {
                        arrayList.add(hostAddress);
                    }
                }
            }
            if (C73343SqR.LJLJJL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("succeed, host= ");
                LIZ.append(this.LJLIL);
                LIZ.append(", ips= ");
                LIZ.append(arrayList);
                X1D.LIZIZ(LIZ);
            }
            return new C36783Ec7(this.LJLIL, arrayList);
        } catch (UnknownHostException e) {
            C16880lQ.LLLLIIL(e);
            if (C73343SqR.LJLJJL) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("failed, host= ");
                LIZ2.append(this.LJLIL);
                X1D.LIZIZ(LIZ2);
            }
            return new C36783Ec7(this.LJLIL, null);
        }
    }

    public F9W(String str) {
        this.LJLIL = str;
    }
}
