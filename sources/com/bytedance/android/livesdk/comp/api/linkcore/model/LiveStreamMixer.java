package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.InterfaceC75807Tp5;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;

/* loaded from: classes14.dex */
public abstract class LiveStreamMixer implements Client.StreamMixer {
    public volatile InteractConfig mConfig;
    public InterfaceC75807Tp5 mPlayerInfoProvider;

    public final InteractConfig getMConfig() {
        return this.mConfig;
    }

    public final InterfaceC75807Tp5 getMPlayerInfoProvider() {
        return this.mPlayerInfoProvider;
    }

    public final InterfaceC75807Tp5 getPlayerInfoProvider() {
        return this.mPlayerInfoProvider;
    }

    public void setConfig(InteractConfig interactConfig) {
        this.mConfig = interactConfig;
    }

    public final void setMConfig(InteractConfig interactConfig) {
        this.mConfig = interactConfig;
    }

    public final void setMPlayerInfoProvider(InterfaceC75807Tp5 interfaceC75807Tp5) {
        this.mPlayerInfoProvider = interfaceC75807Tp5;
    }

    public final void setPlayerInfoProvider(InterfaceC75807Tp5 interfaceC75807Tp5) {
        this.mPlayerInfoProvider = interfaceC75807Tp5;
    }
}
