package X;

import com.ss.optimizer.live.sdk.dns.NativeConnect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class F9X implements Callable<List<String>> {
    public final List<String> LJLIL;
    public final List<String> LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final List<String> call() {
        ArrayList arrayList = new ArrayList();
        NativeConnect nativeConnect = new NativeConnect();
        for (String str : this.LJLIL) {
            if (this.LJLILLLLZI.isEmpty() || !this.LJLILLLLZI.contains(str)) {
                int connect = nativeConnect.connect(str, "8080");
                if (connect == -1) {
                    if (C73343SqR.LJLJJL) {
                        C1JX.LJIIIIZZ("preconnect fails, ip= ", str);
                    }
                } else if (connect == 0) {
                    arrayList.add(str);
                    if (C73343SqR.LJLJJL) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("put ip: ");
                        LIZ.append(str);
                        LIZ.append(" into preconnresult");
                        X1D.LIZIZ(LIZ);
                    }
                }
            }
        }
        return arrayList;
    }

    public F9X(List<String> list, List<String> list2) {
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
    }
}
