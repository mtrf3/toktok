package X;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IvF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC48161IvF implements Callable<Void> {
    public final String LJLIL;
    public final C64812Pc8 LJLILLLLZI;
    public final WeakHandler LJLJI;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (InetAddress inetAddress : InetAddress.getAllByName(this.LJLIL)) {
                if (inetAddress instanceof Inet4Address) {
                    arrayList.add(inetAddress.getHostAddress());
                } else if (inetAddress instanceof Inet6Address) {
                    arrayList2.add(inetAddress.getHostAddress());
                } else {
                    Logger.debug();
                }
            }
            Logger.debug();
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                this.LJLILLLLZI.LIZIZ(this.LJLIL, new C64813Pc9(this.LJLIL, System.currentTimeMillis(), arrayList, arrayList2, C64811Pc7.LJ().LJLJL.get()));
            }
        } catch (UnknownHostException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!C64811Pc7.LJ().LJLILLLLZI.get()) {
            Message obtain = Message.obtain();
            obtain.obj = this;
            obtain.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("localdns_completed_host", this.LJLIL);
            obtain.setData(bundle);
            this.LJLJI.sendMessage(obtain);
            Logger.debug();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", this.LJLIL);
                if (arrayList.size() == 0 && arrayList2.size() == 0) {
                    jSONObject.put("status", "failed");
                    jSONObject.put("result", "");
                } else {
                    jSONObject.put("status", "succeed");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(arrayList);
                    jSONObject.put("result", arrayList3);
                }
                jSONObject.put("rtt", currentTimeMillis2);
                Logger.debug();
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        ((ConcurrentHashMap) this.LJLILLLLZI.LIZLLL).remove(this.LJLIL);
        return null;
    }

    public CallableC48161IvF(String str, C64812Pc8 c64812Pc8, WeakHandler weakHandler) {
        C16880lQ.LJLLJ(CallableC48161IvF.class);
        this.LJLIL = str;
        this.LJLILLLLZI = c64812Pc8;
        this.LJLJI = weakHandler;
    }
}
