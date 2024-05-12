package com.ss.android.ugc.aweme.node;

import X.ActivityC45651qj;
import X.LCZ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfilePageNode extends TabFragmentNode {
    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return "page_profile";
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
        return "page_profile";
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return HomePageUIFrameServiceImpl.LIZ().getFragmentClass("page_profile");
    }

    public ProfilePageNode(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
    }
}
