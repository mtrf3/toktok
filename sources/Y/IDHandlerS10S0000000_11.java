package Y;

import X.C15280iq;
import X.C64811Pc7;
import X.C66009PvR;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes12.dex */
public class IDHandlerS10S0000000_11 extends Handler {
    public final int $t;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS10S0000000_11(Looper looper, int i) {
        super(looper);
        this.$t = i;
    }

    public static final void handleMessage$0(IDHandlerS10S0000000_11 iDHandlerS10S0000000_11, Message message) {
        super.handleMessage(message);
        if (message == null || !(message.obj instanceof C64811Pc7)) {
            return;
        }
        Bundle data = message.getData();
        data.getSerializable("callback_dnsresult_key");
        if (data.getSerializable("callback_dnsresult_job_key") == null) {
            Logger.debug();
        } else {
            if (message.what != 1) {
                return;
            }
            Logger.debug();
            throw null;
        }
    }

    public static final void handleMessage$1(IDHandlerS10S0000000_11 iDHandlerS10S0000000_11, Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C15280iq.LIZ();
        } else {
            Object obj = message.obj;
            if (obj == null || !(obj instanceof C66009PvR)) {
                return;
            }
            ALog.handleAsyncLog((C66009PvR) obj);
        }
    }
}
