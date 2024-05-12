package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;

/* renamed from: X.CCj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30941CCj {
    public static PopupContainerFragment LIZ(PopupConfig popupConfig) {
        PopupContainerFragment popupContainerFragment = new PopupContainerFragment();
        C29261Be5.LIZ(popupConfig.getUrl());
        Bundle bundle = new Bundle();
        bundle.putSerializable("argument_key_config", popupConfig);
        popupContainerFragment.setArguments(bundle);
        return popupContainerFragment;
    }
}
