package com.ss.videoarch.live.ttquic;

import X.C16880lQ;
import X.YR3;
import X.YR4;
import X.YR5;
import Y.ARunnableS1S1102000_15;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class TTLogManager implements YR5 {
    public static final String TAG = C16880lQ.LJLLILLLL(TTLogManager.class);
    public static final String[] mAlogEventKey = {"live_client_log_reserved", "live_client_log_request_start", "live_client_log_response", "live_client_log_net_info", "live_client_log_request_end"};
    public YR5 mListener;
    public Handler mLogHandler;
    public final Object mLogLock;
    public HandlerThread mLogThread;

    private void deInit() {
        Handler handler = this.mLogHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mLogHandler = null;
        }
        HandlerThread handlerThread = this.mLogThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mLogThread = null;
        }
    }

    private void init() {
        if (this.mLogThread == null) {
            HandlerThread handlerThread = new HandlerThread("ttquic_log_manager");
            this.mLogThread = handlerThread;
            handlerThread.start();
        }
        if (this.mLogHandler == null) {
            this.mLogHandler = new Handler(this.mLogThread.getLooper());
        }
    }

    public TTLogManager() {
        this.mLogLock = new Object();
        init();
    }

    public static TTLogManager getInstance() {
        return YR4.LIZ;
    }

    public static int sdk_int() {
        return Build.VERSION.SDK_INT;
    }

    public /* synthetic */ TTLogManager(YR3 yr3) {
        this();
    }

    public void setLogListener(YR5 yr5) {
        synchronized (this.mLogLock) {
            this.mListener = yr5;
        }
    }

    public void onAlog(int i, int i2, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        Handler handler = this.mLogHandler;
        if (handler != null && jSONObject != null) {
            handler.post(new YR3(this, i, i2, jSONObject));
        }
    }

    @Override // X.YR5
    public void onMonitoryLog(int i, int i2, String str) {
        Handler handler = this.mLogHandler;
        if (handler != null) {
            handler.post(new ARunnableS1S1102000_15(this, i, i2, str, 1));
        }
    }
}
