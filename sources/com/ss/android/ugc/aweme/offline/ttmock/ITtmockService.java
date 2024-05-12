package com.ss.android.ugc.aweme.offline.ttmock;

import X.InterfaceC64917Pdp;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public interface ITtmockService {
    Class<? extends Fragment> getClassName();

    InterfaceC64917Pdp getTTMockBlocker();

    String getTTMockFakeImgUrl();

    void hideFloatView();

    void initFastBot(Application application);

    void initFastConfig(Activity activity);

    void initTTMock();

    void injectViewListener(View view);

    boolean interceptScanResult(String str, Context context);

    boolean isBlackMode();

    boolean isOpen();

    boolean isStopPlay();

    void openFastConfig(String str, Context context);

    void setIsLoggedIn(boolean z);

    void startShowFloatView(Activity activity);

    void ttmockInject(Activity activity, String str);
}
