package com.bytedance.android.livesdk.ui;

import X.InterfaceC32901Qw;
import X.V10;
import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class EnforceDarkModeFragment extends BaseFragment implements InterfaceC32901Qw {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
