package com.samsung.sdk.sperf;

import X.C16880lQ;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import com.samsung.android.perfsdkservice.IPerfSDKService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes12.dex */
public class SessionControl {
    public static SessionControl instance;
    public LocalSocket client;
    public DataInputStream in;
    public Object localSocketObject;
    public IPerfSDKService mService;
    public DataOutputStream out;
    public Vector<SPerfListener> perfSDKListerners;
    public LocalServerSocket server;
    public String socketName = "PERFSDK_SOC_" + Long.toString(Double.doubleToLongBits(Math.random()), 36).substring(0, 5);

    public SessionControl() {
        createServer();
        SPerfUtil.log("Make Server for connection with PerfSDK Server");
        this.localSocketObject = getService();
        this.perfSDKListerners = new Vector<>();
    }

    public static SessionControl createInstance() {
        if (instance == null) {
            instance = new SessionControl();
        }
        SessionControl sessionControl = instance;
        if (sessionControl == null || !(sessionControl.getDataInputStream() == null || sessionControl.getDataOutputStream() == null)) {
            return instance;
        }
        instance = null;
        return null;
    }

    private void createServer() {
        new PthreadThread(new Runnable() { // from class: com.samsung.sdk.sperf.SessionControl.1
            public void com_samsung_sdk_sperf_SessionControl$1__run$___twin___() {
                try {
                    SessionControl.this.server = new LocalServerSocket(SessionControl.this.socketName);
                    SessionControl sessionControl = SessionControl.this;
                    sessionControl.client = sessionControl.server.accept();
                    SessionControl.this.in = new DataInputStream(SessionControl.this.client.getInputStream());
                    SessionControl.this.out = new DataOutputStream(SessionControl.this.client.getOutputStream());
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                    try {
                        SessionControl.this.server.close();
                        SessionControl.this.server = null;
                    } catch (IOException unused) {
                        SessionControl.this.server = null;
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                com_samsung_sdk_sperf_SessionControl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_samsung_sdk_sperf_SessionControl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_samsung_sdk_sperf_SessionControl$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, "essionControl").start();
    }

    public void addListerner(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector == null) {
            return;
        }
        vector.add(sPerfListener);
    }

    public Object callback(Object obj) {
        return obj;
    }

    public DataInputStream getDataInputStream() {
        return this.in;
    }

    public DataOutputStream getDataOutputStream() {
        return this.out;
    }

    public Object getService() {
        if (this.localSocketObject == null) {
            try {
                IBinder service = ServiceManager.getService("perfsdkservice");
                if (service != null) {
                    this.mService = IPerfSDKService.Stub.asInterface(service);
                    SPerfUtil.log("Get mService Interface");
                }
                IPerfSDKService iPerfSDKService = this.mService;
                if (iPerfSDKService != null) {
                    try {
                        this.localSocketObject = Integer.valueOf(iPerfSDKService.initPerfSDK(this.socketName));
                        String allowedPkgName = this.mService.getAllowedPkgName();
                        if (allowedPkgName != null && allowedPkgName.length() > 0) {
                            Boost.setNativePkgName(allowedPkgName);
                        }
                        SPerfUtil.log("Do initPerfSDK");
                    } catch (RemoteException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            } catch (NoSuchMethodError e2) {
                e2.printStackTrace();
            }
        }
        return this.localSocketObject;
    }

    public void notifyReleaseToListener() {
        Iterator<SPerfListener> it = this.perfSDKListerners.iterator();
        while (it.hasNext()) {
            it.next().onReleasedByTimeout();
        }
    }

    public void notifyyWarningLevelToListener(int i) {
        Iterator<SPerfListener> it = this.perfSDKListerners.iterator();
        while (it.hasNext()) {
            it.next().onHighTempWarning(i);
        }
    }

    public boolean removeListener(SPerfListener sPerfListener) {
        Vector<SPerfListener> vector = this.perfSDKListerners;
        if (vector == null) {
            return false;
        }
        return vector.remove(sPerfListener);
    }
}
