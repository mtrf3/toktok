package com.ss.android.ugc.aweme.node;

import X.LCZ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;

/* loaded from: classes10.dex */
public final class MyProfilePageNode extends TabFragmentNode {
    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return "USER";
    }

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        return null;
    }

    @Override // X.AbstractC53895LDf
    public final Bundle LJIIIZ() {
        return null;
    }

    @Override // X.AbstractC53895LDf
    public final String tag() {
        return "USER";
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return HomePageUIFrameServiceImpl.LIZ().getFragmentClass("USER");
    }
}
