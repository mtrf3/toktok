package com.ugc.effectcreator.foundation.view;

import X.ViewOnKeyListenerC93617aTl;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class BottomPageFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnKeyListener(new ViewOnKeyListenerC93617aTl(this));
    }
}
