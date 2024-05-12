package X;

import android.text.TextUtils;
import com.byted.cast.common.Logger;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.IPreemptListener;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Zl8, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90850Zl8 implements IPreemptListener {
    public final /* synthetic */ C90547ZgF LIZ;

    @Override // com.byted.cast.common.sink.IPreemptListener
    public final /* synthetic */ void onPreempt(ClientInfo clientInfo) {
        C90157ZZx.LIZ(this, clientInfo);
    }

    public C90850Zl8(C90547ZgF c90547ZgF) {
        this.LIZ = c90547ZgF;
    }

    @Override // com.byted.cast.common.sink.IPreemptListener
    public final void onPreempt(String str, ClientInfo clientInfo) {
        synchronized (this) {
            this.LIZ.getClass();
            for (String str2 : ((ConcurrentHashMap) this.LIZ.LJIIIIZZ).keySet()) {
                ICastSink iCastSink = (ICastSink) ((ConcurrentHashMap) this.LIZ.LJIIIIZZ).get(str2);
                if (!TextUtils.equals(str, str2)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("notify not allow execute:");
                    LIZ.append(str2);
                    Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
                    iCastSink.notifyPreempt(false, clientInfo);
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("notify allow execute:");
            LIZ2.append(str);
            Logger.i("ByteCastSinkImpl", X1D.LIZIZ(LIZ2));
            ICastSink iCastSink2 = (ICastSink) ((ConcurrentHashMap) this.LIZ.LJIIIIZZ).get(str);
            if (iCastSink2 != null) {
                iCastSink2.notifyPreempt(true, clientInfo);
            }
        }
    }
}
