package com.kakao.sdk.common.util;

import X.C16880lQ;
import X.X1D;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class KakaoResultReceiver<T> extends ResultReceiver {
    public T emitter;
    public final String message;

    public abstract void processError();

    public abstract void receiveCanceled(Bundle bundle);

    public abstract void receiveOk(Bundle bundle);

    public final T getEmitter() {
        return this.emitter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KakaoResultReceiver(String message) {
        super(new Handler(C16880lQ.LLJJJJ()));
        o.LJIIIZ(message, "message");
        this.message = message;
    }

    public final void setEmitter(T t) {
        this.emitter = t;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        SdkLog.Companion companion = SdkLog.Companion;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("***** ");
        LIZ.append(this.message);
        LIZ.append(" Status: ");
        LIZ.append(bundle);
        companion.d(X1D.LIZIZ(LIZ));
        if (i != -1) {
            if (i != 0) {
                processError();
            } else {
                receiveCanceled(bundle);
            }
        } else {
            receiveOk(bundle);
        }
        this.emitter = null;
    }
}
