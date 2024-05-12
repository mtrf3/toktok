package com.bytedance.android.live.browser;

import X.AbstractC31219CNb;
import X.BNW;
import X.C30882CAc;
import X.C30892CAm;
import X.C30939CCh;
import X.C31239CNv;
import X.InterfaceC06390Mx;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes.dex */
public interface IBrowserService extends InterfaceC06390Mx {
    BNW K90(String str, String str2);

    C30882CAc Lu();

    PopupContainerFragment Mo(PopupConfig popupConfig);

    Fragment P(Context context, Bundle bundle);

    void Qd0(boolean z);

    C30939CCh To0();

    <T> T Wn(Context context, String str);

    C30892CAm Yd0();

    void dr(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner);

    String fQ();

    void kD(Context context, PopupConfig popupConfig);

    C31239CNv kF();

    AbstractC31219CNb nb(Uri uri, String str, Context context);

    void qk0(Context context, Object obj, String str);

    TTLiveBrowserFragment u40(Bundle bundle);

    <T> void zb(Context context, String str);
}
