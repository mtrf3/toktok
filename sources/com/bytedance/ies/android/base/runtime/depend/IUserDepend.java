package com.bytedance.ies.android.base.runtime.depend;

import X.InterfaceC59855NeN;
import android.content.Context;

/* loaded from: classes11.dex */
public interface IUserDepend {
    String getAvatarURL();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    boolean hasBoundPhone();

    boolean hasLogin();

    void login(Context context, InterfaceC59855NeN interfaceC59855NeN);

    void logout(Context context);
}
