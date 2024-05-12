package com.ss.android.ugc.feed.platform.panel.system;

import X.C221108m2;
import X.C2K0;
import X.C37179EiV;
import X.C55096Ljo;
import X.C5H3;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.KTT;
import X.KTU;
import X.KTV;
import X.KTW;
import X.KTX;
import X.M89;
import Y.ARunnableS2S1100000_1;
import android.app.KeyguardManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SystemComponent extends BasePanelComponent implements SystemComponentAbility, WeakHandler.IHandler, InterfaceC55102Lju {
    public static final KTX Companion = new KTX();
    public WeakHandler handler;
    public final C5H3 displayListeners$delegate = C221108m2.LIZIZ(KTV.LJLIL);
    public final C5H3 handleMessageCallbacks$delegate = C221108m2.LIZIZ(KTW.LJLIL);
    public final C5H3 keyguardManager$delegate = C221108m2.LIZIZ(KTU.INSTANCE);
    public final C5H3 displayManager$delegate = C221108m2.LIZIZ(KTT.INSTANCE);

    @Override // X.InterfaceC55102Lju
    public C2K0 provideAbility(String str) {
        if (str.hashCode() != 438363465) {
            return null;
        }
        return this;
    }

    private final ConcurrentHashSet<Integer> getDisplayListeners() {
        return (ConcurrentHashSet) this.displayListeners$delegate.getValue();
    }

    private final DisplayManager getDisplayManager() {
        return (DisplayManager) this.displayManager$delegate.getValue();
    }

    private final ConcurrentHashSet<Handler.Callback> getHandleMessageCallbacks() {
        return (ConcurrentHashSet) this.handleMessageCallbacks$delegate.getValue();
    }

    private final KeyguardManager getKeyguardManager() {
        return (KeyguardManager) this.keyguardManager$delegate.getValue();
    }

    public boolean isKeyguardLocked() {
        KeyguardManager keyguardManager = getKeyguardManager();
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardLocked();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public void onCreate() {
        super.onCreate();
        this.handler = new WeakHandler(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        getHandleMessageCallbacks().clear();
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.C8W0
    public void onPause() {
        String str;
        super.onPause();
        M89 m89 = getPanelContext().LIZJ;
        if (m89 == null || (str = m89.getEventType()) == null) {
            str = "";
        }
        C37179EiV.LIZ().postDelayed(new ARunnableS2S1100000_1(this, str, 4), 500L);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public Handler getPanelHandler() {
        return this.handler;
    }

    public static final SystemComponentAbility getSystemComponent(InterfaceC55235Lm3 vScope) {
        Companion.getClass();
        o.LJIIIZ(vScope, "vScope");
        return (SystemComponentAbility) C55096Ljo.LIZ(vScope, SystemComponentAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null || getHandleMessageCallbacks().isEmpty()) {
            return;
        }
        Iterator<Handler.Callback> it = getHandleMessageCallbacks().iterator();
        while (it.hasNext()) {
            it.next().handleMessage(message);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public boolean registerDisplayListener(DisplayManager.DisplayListener displayListener) {
        return registerDisplayListener(displayListener, this.handler);
    }

    public void registerHandlerMessageCallback(Handler.Callback callback) {
        o.LJIIIZ(callback, "callback");
        if (!getHandleMessageCallbacks().contains(callback)) {
            getHandleMessageCallbacks().add(callback);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public void unregisterDisplayListener(DisplayManager.DisplayListener displayListener) {
        if (displayListener != null) {
            DisplayManager displayManager = getDisplayManager();
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(displayListener);
            }
            getDisplayListeners().remove(Integer.valueOf(displayListener.hashCode()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public boolean registerDisplayListener(DisplayManager.DisplayListener displayListener, Handler handler) {
        if (displayListener == null) {
            return false;
        }
        try {
            if (getDisplayListeners().contains(Integer.valueOf(displayListener.hashCode()))) {
                return false;
            }
            DisplayManager displayManager = getDisplayManager();
            if (displayManager != null) {
                displayManager.registerDisplayListener(displayListener, handler);
            }
            getDisplayListeners().add(Integer.valueOf(displayListener.hashCode()));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
