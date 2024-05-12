package com.bytedance.router.fragment;

import X.F9E;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FindNavigationContainerResult extends F9E {
    public final FragmentNavigationContainer container;
    public final FragmentManager fragmentManager;

    public static /* synthetic */ FindNavigationContainerResult copy$default(FindNavigationContainerResult findNavigationContainerResult, FragmentManager fragmentManager, FragmentNavigationContainer fragmentNavigationContainer, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentManager = findNavigationContainerResult.fragmentManager;
        }
        if ((i & 2) != 0) {
            fragmentNavigationContainer = findNavigationContainerResult.container;
        }
        return findNavigationContainerResult.copy(fragmentManager, fragmentNavigationContainer);
    }

    public final FindNavigationContainerResult copy(FragmentManager fragmentManager, FragmentNavigationContainer container) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(container, "container");
        return new FindNavigationContainerResult(fragmentManager, container);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.fragmentManager, this.container};
    }

    public final FragmentNavigationContainer getContainer() {
        return this.container;
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public FindNavigationContainerResult(FragmentManager fragmentManager, FragmentNavigationContainer container) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(container, "container");
        this.fragmentManager = fragmentManager;
        this.container = container;
    }
}
