package X;

import Y.ARunnableS22S0300000_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.Pd2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64868Pd2 implements IWsChannelClient, WeakHandler.IHandler {
    public final int LJLIL;
    public Context LJLILLLLZI;
    public C64862Pcw LJLJI;
    public boolean LJLJJI;
    public final java.util.Map<String, Object> LJLJJL = new HashMap();
    public List<String> LJLJJLL;
    public final C64871Pd5 LJLJL;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onConnection(JSONObject jSONObject) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(WsChannelMsg wsChannelMsg) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onServiceConnectEvent(int i, boolean z, String str) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean privateProtocolEnabled() {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void registerService(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(WsChannelMsg wsChannelMsg) {
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void unregisterService(int i) {
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        C64862Pcw c64862Pcw = this.LJLJI;
        c64862Pcw.LJLJLLL.removeMessages(2);
        c64862Pcw.LJLJLLL.removeMessages(1);
        c64862Pcw.LJLJLLL.removeMessages(3);
        c64862Pcw.LJLJLLL.removeMessages(5);
        c64862Pcw.LJII(new ARunnableS47S0100000_11(c64862Pcw, 151));
        try {
            Context context = this.LJLILLLLZI;
            if (context != null) {
                context.getContentResolver().unregisterContentObserver(this.LJLJL);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        if (this.LJLJI.LIZLLL() == 4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        C64862Pcw c64862Pcw = this.LJLJI;
        c64862Pcw.getClass();
        c64862Pcw.LJII(new ARunnableS47S0100000_11(c64862Pcw, 150));
    }

    public static boolean LIZ(Context context) {
        return C66455Q6h.LIZIZ(context).LIZ.LIZIZ("key_ok_impl_enable", true);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i) {
        if (!LIZ(this.LJLILLLLZI)) {
            return;
        }
        C64862Pcw c64862Pcw = this.LJLJI;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c64862Pcw.LJLJLLL.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i) {
        if (!LIZ(this.LJLILLLLZI)) {
            return;
        }
        this.LJLJI.LJLJLLL.obtainMessage(3, Integer.valueOf(i)).sendToTarget();
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        if (!LIZ(this.LJLILLLLZI)) {
            return false;
        }
        return this.LJLJI.LJIIIIZZ(bArr);
    }

    public C64868Pd2(int i, Handler handler) {
        this.LJLIL = i;
        this.LJLJL = new C64871Pd5(this, handler);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLILLLLZI = C16880lQ.LLLLL(context);
        System.currentTimeMillis();
        try {
            Class<?> cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
            if (cls != null) {
                try {
                    cls.getMethod("a", Context.class, Integer.TYPE, java.util.Map.class).invoke(cls, context, 2, null);
                } catch (Throwable unused) {
                }
                System.currentTimeMillis();
            }
        } catch (ClassNotFoundException unused2) {
        }
        C64872Pd6 c64872Pd6 = new C64872Pd6(context);
        c64872Pd6.LIZ = new C48129Iuj(context);
        AbstractC64867Pd1 abstractC64867Pd1 = (AbstractC64867Pd1) ((ConcurrentHashMap) QOW.LJI).get(Integer.valueOf(this.LJLIL));
        if (abstractC64867Pd1 != null) {
            c64872Pd6.LIZIZ = abstractC64867Pd1;
        }
        C64862Pcw c64862Pcw = new C64862Pcw(new C64865Pcz(context, c64872Pd6.LIZ, c64872Pd6.LIZIZ));
        this.LJLJI = c64862Pcw;
        c64862Pcw.LJLLI = new C64869Pd3(this.LJLILLLLZI, iWsChannelClient);
        try {
            context.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.LIZ(context, "key_ok_impl_enable", "boolean"), true, this.LJLJL);
        } catch (Throwable unused3) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(java.util.Map<String, Object> map, List<String> list) {
        if (map != null) {
            ((HashMap) this.LJLJJL).putAll(map);
        }
        this.LJLJJLL = list;
        if (!LIZ(this.LJLILLLLZI)) {
            return;
        }
        C64862Pcw c64862Pcw = this.LJLJI;
        c64862Pcw.getClass();
        if (list.isEmpty()) {
            return;
        }
        c64862Pcw.LJII(new ARunnableS22S0300000_11(c64862Pcw, map, list, 15));
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(java.util.Map<String, Object> map, List<String> list) {
        if (map != null) {
            ((HashMap) this.LJLJJL).putAll(map);
        }
        this.LJLJJLL = list;
        if (!LIZ(this.LJLILLLLZI)) {
            return;
        }
        C64862Pcw c64862Pcw = this.LJLJI;
        c64862Pcw.getClass();
        if (list.isEmpty()) {
            return;
        }
        c64862Pcw.LJII(new ARunnableS22S0300000_11(c64862Pcw, map, list, 14));
    }
}
