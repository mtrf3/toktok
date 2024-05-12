package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.KQh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51687KQh extends AbstractC51688KQi {
    public boolean mUserVisibleHint;

    public abstract void initPanel();

    public boolean isRegisterEventBus() {
        return false;
    }

    public Bundle getArguments() {
        Fragment fragment = getFragment();
        if (fragment == null) {
            return null;
        }
        return fragment.getArguments();
    }

    public FragmentManager getChildFragmentManager() {
        Fragment fragment = getFragment();
        if (fragment == null) {
            return null;
        }
        return fragment.getChildFragmentManager();
    }

    public boolean isActive() {
        AbsFragment absFragment = (AbsFragment) getFragment();
        if (absFragment != null && absFragment.isActive()) {
            return true;
        }
        return false;
    }

    public boolean isResumed() {
        Fragment fragment = getFragment();
        if (fragment != null && fragment.isResumed()) {
            return true;
        }
        return false;
    }

    public boolean isViewValid() {
        AbsFragment absFragment = (AbsFragment) getFragment();
        if (absFragment != null && absFragment.isViewValid()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public void onDestroyView() {
        super.onDestroyView();
        if (isRegisterEventBus()) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Override // X.AbstractC51688KQi
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void setUserVisibleHint(boolean z) {
        this.mUserVisibleHint = z;
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (isRegisterEventBus()) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }
}
