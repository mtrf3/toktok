package com.bytedance.router.fragment;

import X.ActivityC45651qj;
import X.C08Y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NavigationUtils {
    public static final NavigationUtils INSTANCE = new NavigationUtils();

    /* JADX WARN: Multi-variable type inference failed */
    public static final FindNavigationContainerResult findNavigationContainer(Fragment fragment) {
        ActivityC45651qj activityC45651qj;
        for (Fragment fragment2 = fragment; fragment2 != 0; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof FragmentNavigationContainer) {
                FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "current.childFragmentManager");
                return new FindNavigationContainerResult(childFragmentManager, (FragmentNavigationContainer) fragment2);
            }
        }
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        return findNavigationContainer(activityC45651qj);
    }

    public static final Fragment findTopFragment(Fragment fragment) {
        FindNavigationContainerResult findNavigationContainer = findNavigationContainer(fragment);
        if (findNavigationContainer != null) {
            return INSTANCE.findTopFragment(findNavigationContainer);
        }
        return null;
    }

    private final Fragment findTopFragmentByBackStack(FragmentManager fragmentManager) {
        int LJJJJIZL = fragmentManager.LJJJJIZL();
        if (LJJJJIZL <= 0) {
            return null;
        }
        C08Y LJJJJI = fragmentManager.LJJJJI(LJJJJIZL - 1);
        o.LJIIIIZZ(LJJJJI, "manager.getBackStackEntryAt(stackCount - 1)");
        return fragmentManager.LJJJIL(LJJJJI.getName());
    }

    private final Fragment findTopFragmentByVisible(FragmentManager fragmentManager) {
        List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "manager.fragments");
        for (Fragment it : LJJJJLI) {
            o.LJIIIIZZ(it, "it");
            if (it.isVisible()) {
                return it;
            }
        }
        return null;
    }

    public static final FindNavigationContainerResult findNavigationContainer(ActivityC45651qj activityC45651qj) {
        Object obj;
        if (!(activityC45651qj instanceof FragmentNavigationContainer)) {
            obj = null;
        } else {
            obj = activityC45651qj;
        }
        FragmentNavigationContainer fragmentNavigationContainer = (FragmentNavigationContainer) obj;
        if (fragmentNavigationContainer == null) {
            return null;
        }
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        return new FindNavigationContainerResult(supportFragmentManager, fragmentNavigationContainer);
    }

    private final Fragment findTopFragment(FindNavigationContainerResult findNavigationContainerResult) {
        FragmentManager fragmentManager = findNavigationContainerResult.getFragmentManager();
        Fragment findTopFragmentByBackStack = findTopFragmentByBackStack(fragmentManager);
        if (findTopFragmentByBackStack == null) {
            return findTopFragmentByVisible(fragmentManager);
        }
        return findTopFragmentByBackStack;
    }

    public final Fragment findTopFragment(ActivityC45651qj activityC45651qj) {
        FindNavigationContainerResult findNavigationContainer = findNavigationContainer(activityC45651qj);
        if (findNavigationContainer != null) {
            return findTopFragment(findNavigationContainer);
        }
        return null;
    }
}
