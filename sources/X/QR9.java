package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.push.frontier.FrontierPushAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QR9 implements QOQ {
    public static volatile QR9 LJLJJLL;
    public final AtomicReference<QRB> LJLIL = new AtomicReference<>();
    public final Context LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
    }

    public QR9(Context context) {
        this.LJLILLLLZI = context;
        new AtomicBoolean(false);
        this.LJLJJL = false;
        this.LJLJJI = "";
    }

    public static QR9 LIZIZ(Context context) {
        if (LJLJJLL == null) {
            synchronized (QR9.class) {
                if (LJLJJLL == null) {
                    LJLJJLL = new QR9(context);
                }
            }
        }
        return LJLJJLL;
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null || !this.LJLJJL) {
            return;
        }
        if ((this.LJLJI != 1 && wsChannelMsg.channelId != 10006) || 1777 != wsChannelMsg.service || 1777 != wsChannelMsg.method) {
            return;
        }
        try {
            String str = new String(wsChannelMsg.LIZ());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("received message:");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            ((QRC) QRM.LJI()).LJ(FrontierPushAdapter.getFrontierPush(), str);
        } catch (Throwable unused) {
        }
    }
}
