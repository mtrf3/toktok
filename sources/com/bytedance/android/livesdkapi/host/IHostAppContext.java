package com.bytedance.android.livesdkapi.host;

import X.InterfaceC06390Mx;
import X.InterfaceC78493UrJ;
import X.InterfaceC78494UrK;
import X.InterfaceC92693kP;
import android.content.Context;
import java.util.Locale;

/* loaded from: classes6.dex */
public interface IHostAppContext extends InterfaceC06390Mx {
    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    String getBoeLane();

    String getBuildNumber();

    String getChannel();

    String getIapKey();

    String getPpeLane();

    String getServerDeviceId();

    String getSessionId();

    int getShortVersionCode();

    int getUpdateVersionCode();

    String getVersionCode();

    int getVersionCodeInt();

    String getVersionName();

    boolean isAppBackground();

    boolean isAppForeground();

    boolean isBoe();

    boolean isInMusicallyRegion();

    boolean isLiveInhouse();

    boolean isLocalTest();

    boolean isOffline();

    boolean isPpe();

    int liveId();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void openQrScannerPage(Context context);

    InterfaceC92693kP registerAppEnterForeBackgroundCallback(InterfaceC78493UrJ interfaceC78493UrJ);

    void registerLifeCycleCallback(InterfaceC78494UrK interfaceC78494UrK);
}
