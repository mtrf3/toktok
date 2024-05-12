package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QX7<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public QX7(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.LJLIL)) {
            hashMap.put("phone_number", this.LJLIL);
        }
        hashMap.put("login_type", String.valueOf(this.LJLILLLLZI));
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        ((NetworkProxyAccount) qqc).LJIIJ(QX9.LIZ, hashMap);
        return null;
    }
}
