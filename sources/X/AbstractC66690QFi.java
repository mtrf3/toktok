package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.ss.android.agilelogger.ALog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QFi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66690QFi implements InterfaceC79523VIx {
    public InterfaceC66693QFl LIZ;
    public int LIZIZ = -1;
    public final String LIZJ;
    public final Context LIZLLL;
    public final C46590IQg LJ;

    @Override // X.InterfaceC79523VIx
    public final void LIZIZ() {
        int i;
        synchronized (this) {
            i = this.LIZIZ;
        }
        if (i != -1) {
            C66691QFj c66691QFj = (C66691QFj) this;
            try {
                try {
                    C44378HbK c44378HbK = c66691QFj.LJFF;
                    if (c44378HbK != null) {
                        ((IWsClient) c44378HbK.LJLIL).stopConnection();
                    }
                } finally {
                    InterfaceC66693QFl interfaceC66693QFl = c66691QFj.LIZ;
                    if (interfaceC66693QFl != null) {
                        interfaceC66693QFl.LIZIZ("stop connect", false);
                    }
                }
            } catch (Throwable unused) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("Task.ttnet", "stopConnection error");
            }
            LIZLLL(-1);
        }
    }

    public final void LJ() {
        NetworkInfo LJJLI;
        String str;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(this.LIZLLL, "connectivity");
            if (connectivityManager != null && (LJJLI = C16880lQ.LJJLI(connectivityManager)) != null && LJJLI.isConnected()) {
                if (LJJLI.getState() == NetworkInfo.State.CONNECTED) {
                    C66691QFj c66691QFj = (C66691QFj) this;
                    C44378HbK c44378HbK = c66691QFj.LJFF;
                    if (c44378HbK != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        JSONObject jSONObject = c66691QFj.LJ.LIZIZ;
                        if (jSONObject != null) {
                            Iterator<String> keys = jSONObject.keys();
                            o.LJFF(keys, "keys()");
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (next.length() != 0) {
                                    Object opt = jSONObject.opt(next);
                                    if (opt == null || (str = opt.toString()) == null) {
                                        str = "";
                                    }
                                    hashMap2.put(next, str);
                                }
                            }
                        }
                        JSONArray jSONArray = c66691QFj.LJ.LIZJ;
                        if (jSONArray != null) {
                            int length = jSONArray.length();
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < length; i++) {
                                sb.append(jSONArray.optString(i));
                                if (i != length - 1) {
                                    sb.append(",");
                                }
                            }
                            String sb2 = sb.toString();
                            o.LJFF(sb2, "protocolBuilder.toString()");
                            if (sb2.length() > 0) {
                                hashMap2.put("Sec-WebSocket-Protocol", sb2);
                            }
                        }
                        List<String> LJJIJ = C47261Igj.LJJIJ(c66691QFj.LJ.LIZ);
                        if (LJJIJ.isEmpty()) {
                            return;
                        }
                        ((IWsClient) c44378HbK.LJLIL).openConnection(hashMap, hashMap2, LJJIJ, false, false);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            ALog.stacktrace(6, C66689QFh.LIZ, e.getStackTrace());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("net error, url = ");
        LIZ.append(this.LIZJ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("Task.base", X1D.LIZIZ(LIZ));
        InterfaceC66693QFl interfaceC66693QFl = this.LIZ;
        if (interfaceC66693QFl != null) {
            interfaceC66693QFl.onFailed("net error");
        }
    }

    public final synchronized void LIZLLL(int i) {
        this.LIZIZ = i;
    }

    public AbstractC66690QFi(Context context, C46590IQg c46590IQg) {
        this.LIZLLL = context;
        this.LJ = c46590IQg;
        this.LIZJ = c46590IQg.LIZ;
    }
}
