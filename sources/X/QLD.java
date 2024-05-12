package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QLD extends PthreadThread implements QJ8 {
    public boolean LJLIL;
    public final /* synthetic */ AppLog LJLILLLLZI;

    public final void LIZLLL() {
        QLQ qlq;
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(this);
        if (!this.LJLILLLLZI.setupLogReaper()) {
            return;
        }
        this.LJLILLLLZI.ensureHeaderCopy();
        this.LJLILLLLZI.checkSessionEnd();
        while (true) {
            synchronized (this.LJLILLLLZI.mQueue) {
                if (!AppLog.sStopped) {
                    if (this.LJLILLLLZI.mQueue.isEmpty()) {
                        try {
                            if (this.LJLIL) {
                                AppLog appLog = this.LJLILLLLZI;
                                appLog.mQueue.wait(appLog.getTerminateSessionInterval());
                            } else {
                                this.LJLILLLLZI.mQueue.wait();
                            }
                        } catch (InterruptedException unused) {
                        }
                        if (!AppLog.sStopped) {
                            if (!this.LJLILLLLZI.mQueue.isEmpty()) {
                                qlq = this.LJLILLLLZI.mQueue.poll();
                            } else {
                                qlq = null;
                            }
                        } else {
                            return;
                        }
                    } else {
                        qlq = this.LJLILLLLZI.mQueue.poll();
                    }
                } else {
                    return;
                }
            }
            if (qlq != null) {
                this.LJLILLLLZI.processItem(qlq);
                this.LJLIL = true;
            } else if (this.LJLIL) {
                this.LJLIL = false;
                this.LJLILLLLZI.checkSessionEnd();
            }
            this.LJLILLLLZI.tryUpdateConfig(true, false);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QLD(AppLog appLog) {
        super("ActionReaper");
        this.LJLILLLLZI = appLog;
    }

    @Override // X.QJ8
    public final void LIZ(boolean z) {
        synchronized (AppLog.class) {
            AppLog.sHasLoadDid = true;
            if (AppLog.sPendingActiveUser) {
                AppLog.activeUserInvokeInternal(this.LJLILLLLZI.mContext);
            }
        }
    }

    @Override // X.QJ8
    public final void LIZIZ(String str, String str2) {
        QLQ qlq = new QLQ(QLI.DEVICE_ID_UPDATE);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            jSONObject.put("install_id", str2);
            qlq.LIZIZ = jSONObject;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJLILLLLZI.enqueue(qlq);
        this.LJLILLLLZI.mHasUpdateConfig = true;
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
        AppLog appLog = this.LJLILLLLZI;
        if (appLog.mHasUpdateConfig) {
            appLog.mHasUpdateConfig = false;
        } else if (z && AppLog.sInitGuard) {
            this.LJLILLLLZI.tryUpdateConfig(false, true, z2);
        }
    }
}
