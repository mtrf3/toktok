package com.bytedance.effectcreatormobile.objectselect.prefab;

import X.ActivityC45651qj;
import X.C93480aRY;
import X.C93971aZT;
import X.InterfaceC93647aUF;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IMessageIntroSheet;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public abstract class AbstractPrefabFragment extends BottomDrawerFragment {
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewModelStoreOwner wl() {
        Fragment fragment = this;
        while (fragment != 0) {
            fragment = fragment.getParentFragment();
            if (fragment instanceof InterfaceC93647aUF) {
                return ((InterfaceC93647aUF) fragment).getViewModelStoreOwner();
            }
        }
        throw new IllegalStateException("Among the ancestors of the current fragment, there is no PrefabScopeViewModelStoreOwner");
    }

    public final void xl() {
        FragmentManager fragmentManager;
        IMessageIntroSheet iMessageIntroSheet = (IMessageIntroSheet) ((IService) C93971aZT.LIZ().LIZ(IMessageIntroSheet.class));
        if (iMessageIntroSheet != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                fragmentManager = mo49getActivity.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            o.LJI(fragmentManager);
            iMessageIntroSheet.show(fragmentManager, new C93480aRY("https://p-tiktok-creator-center-sg.byteintl.net/tos-alisg-i-0oet5r4bc6-sg/animation_3.webp~tplv-0oet5r4bc6-image.image", getString(R.string.hv), getString(R.string.hu), false, getString(R.string.see), 9), null);
        }
    }
}
