package com.ss.android.ugc.feed.platform.panel.system;

import X.C2K0;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes5.dex */
public interface SystemComponentAbility extends C2K0 {
    Handler getPanelHandler();

    void handleMsg(Message message);

    boolean registerDisplayListener(DisplayManager.DisplayListener displayListener);

    boolean registerDisplayListener(DisplayManager.DisplayListener displayListener, Handler handler);

    void unregisterDisplayListener(DisplayManager.DisplayListener displayListener);
}
