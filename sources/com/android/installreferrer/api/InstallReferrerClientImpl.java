package com.android.installreferrer.api;

import X.C16880lQ;
import X.InterfaceC40642FxG;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClientImpl;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public class InstallReferrerClientImpl extends InstallReferrerClient {
    public int clientState;
    public final Context mApplicationContext;
    public InterfaceC40642FxG service;
    public ServiceConnection serviceConnection;

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    private boolean isPlayStoreCompatible() {
        if (C16880lQ.LLLLLLZ(this.mApplicationContext.getPackageManager(), "com.android.vending", 128).versionCode < 80837300) {
            return false;
        }
        return true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.mApplicationContext.getPackageName());
            try {
                return new ReferrerDetails(this.service.LLL(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.clientState = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    public InstallReferrerClientImpl(Context context) {
        this.mApplicationContext = C16880lQ.LLLLL(context);
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(final InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.clientState;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = ((ResolveInfo) ListProtector.get(queryIntentServices, 0)).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null && isPlayStoreCompatible()) {
                Intent intent2 = new Intent(intent);
                ServiceConnection serviceConnection = new ServiceConnection(installReferrerStateListener) { // from class: X.0Hq
                    public final InstallReferrerStateListener LJLIL;

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
                        InstallReferrerClientImpl.this.service = null;
                        InstallReferrerClientImpl.this.clientState = 0;
                        this.LJLIL.onInstallReferrerServiceDisconnected();
                    }

                    {
                        if (installReferrerStateListener != null) {
                            this.LJLIL = installReferrerStateListener;
                            return;
                        }
                        throw new RuntimeException("Please specify a listener to know when setup is done.");
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        InterfaceC40642FxG c40641FxF;
                        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
                        InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
                        if (iBinder == null) {
                            c40641FxF = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                            if (queryLocalInterface instanceof InterfaceC40642FxG) {
                                c40641FxF = (InterfaceC40642FxG) queryLocalInterface;
                            } else {
                                c40641FxF = new C40641FxF(iBinder);
                            }
                        }
                        installReferrerClientImpl.service = c40641FxF;
                        InstallReferrerClientImpl.this.clientState = 2;
                        this.LJLIL.onInstallReferrerSetupFinished(0);
                    }
                };
                this.serviceConnection = serviceConnection;
                if (C16880lQ.LLLJL(this.mApplicationContext, intent2, serviceConnection, 1)) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.clientState = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        this.clientState = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
