package com.bytedance.android.live.gift;

import X.AbstractC33791Uh;
import X.InterfaceC06390Mx;
import android.content.Context;

/* loaded from: classes.dex */
public interface IGiftAudioPlayer extends InterfaceC06390Mx {
    void init(Context context);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void pause();

    void release();

    void setListener(AbstractC33791Uh abstractC33791Uh);

    void setVolume(float f);

    void start();

    void stop();
}
