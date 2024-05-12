package com.ss.android.ugc.aweme.port.in;

import X.InterfaceC40960G5s;
import android.app.Activity;

/* loaded from: classes8.dex */
public interface IAVMixFeedService {
    boolean needCreateFirstMix();

    boolean needShowAddOrRemoveButton();

    void showAddToMixInPublishPage(Activity activity, InterfaceC40960G5s interfaceC40960G5s, String str, String str2, String str3, String str4);

    void updateFeedEvent();
}
