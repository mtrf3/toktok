package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.sync.SyncSDK;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.QSi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67028QSi implements QOQ {
    public static C67028QSi LJLJJI;
    public InterfaceC67030QSk LJLIL;
    public final Context LJLILLLLZI;
    public volatile AtomicBoolean LJLJI = new AtomicBoolean(false);

    public C67028QSi(Context context) {
        new AtomicBoolean(false);
        this.LJLILLLLZI = context;
    }

    public static C67028QSi LIZIZ(Context context) {
        if (LJLJJI == null) {
            synchronized (C67028QSi.class) {
                if (LJLJJI == null) {
                    LJLJJI = new C67028QSi(context);
                }
            }
        }
        return LJLJJI;
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        SyncSDK.onReceiveWsEvent(wsChannelMsg);
    }

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        boolean z;
        AtomicBoolean atomicBoolean = this.LJLJI;
        if (c66930QOo.LIZIZ == EnumC66933QOr.CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        throw null;
    }
}
