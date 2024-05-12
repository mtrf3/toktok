package com.bytedance.router.fragment;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FragmentNavigationRouteIntent extends RouteIntent {
    public FragmentManager fragmentManager;
    public FragmentNavigationContainer fragmentNavigationContainer;
    public PopOp popOp;
    public PushOp pushOp;

    /* loaded from: classes11.dex */
    public static final class Builder extends RouteIntent.Builder {
        public Fragment fragment;
        public FragmentManager fragmentManager;
        public FragmentNavigationContainer fragmentNavigationContainer;
        public PopOp popOp;
        public PushOp pushOp;

        @Override // com.bytedance.router.RouteIntent.Builder
        public FragmentNavigationRouteIntent build() {
            FragmentNavigationRouteIntent fragmentNavigationRouteIntent = new FragmentNavigationRouteIntent();
            apply(fragmentNavigationRouteIntent);
            fragmentNavigationRouteIntent.setFragmentNavigationContainer(this.fragmentNavigationContainer);
            fragmentNavigationRouteIntent.setPushOp(this.pushOp);
            fragmentNavigationRouteIntent.setPopOp(this.popOp);
            fragmentNavigationRouteIntent.setFragment(this.fragment);
            fragmentNavigationRouteIntent.fragmentManager = this.fragmentManager;
            return fragmentNavigationRouteIntent;
        }

        public final Builder withFragment(Fragment fragment) {
            this.fragment = fragment;
            return this;
        }

        public final Builder withFragmentManager(FragmentManager fragmentManager) {
            this.fragmentManager = fragmentManager;
            return this;
        }

        public final Builder withFragmentNavigationContainer(FragmentNavigationContainer container) {
            o.LJIIIZ(container, "container");
            this.fragmentNavigationContainer = container;
            return this;
        }

        public final Builder withPopOp(PopOp popOp) {
            this.popOp = popOp;
            return this;
        }

        public final Builder withPushOp(PushOp pushOp) {
            this.pushOp = pushOp;
            return this;
        }
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final FragmentNavigationContainer getFragmentNavigationContainer() {
        return this.fragmentNavigationContainer;
    }

    public final PopOp getPopOp() {
        return this.popOp;
    }

    public final PushOp getPushOp() {
        return this.pushOp;
    }

    public final Activity getActivity(Context context) {
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            return activity;
        }
        Fragment fragment = getFragment();
        o.LJIIIIZZ(fragment, "fragment");
        return fragment.mo49getActivity();
    }

    public final void setFragmentNavigationContainer(FragmentNavigationContainer fragmentNavigationContainer) {
        this.fragmentNavigationContainer = fragmentNavigationContainer;
    }

    public final void setPopOp(PopOp popOp) {
        this.popOp = popOp;
    }

    public final void setPushOp(PushOp pushOp) {
        this.pushOp = pushOp;
    }
}
