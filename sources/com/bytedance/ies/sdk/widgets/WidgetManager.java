package com.bytedance.ies.sdk.widgets;

import X.ActivityC45651qj;
import X.C08Z;
import X.C15X;
import X.C15Y;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C78598Ut0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes13.dex */
public class WidgetManager extends Fragment {
    public static final String TAG = C16880lQ.LJLLILLLL(WidgetManager.class);
    public C15Y asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public Fragment parentFragment;
    public LayoutInflater syncLayoutInflater;
    public Widget.WidgetCallback widgetCallback = new Widget.WidgetCallback() { // from class: com.bytedance.ies.sdk.widgets.WidgetManager.1
        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public Fragment getFragment() {
            return WidgetManager.this;
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends ViewModel> T getViewModel(Class<T> cls) {
            WidgetManager widgetManager = WidgetManager.this;
            Fragment fragment = widgetManager.parentFragment;
            if (fragment != null) {
                return (T) ViewModelProviders.of(fragment).get(cls);
            }
            return (T) ViewModelProviders.of(widgetManager.mo49getActivity()).get(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent) {
            WidgetManager widgetManager = WidgetManager.this;
            C78598Ut0.LJIJJ(intent, widgetManager);
            widgetManager.startActivity(intent);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public <T extends ViewModel> T getViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
            WidgetManager widgetManager = WidgetManager.this;
            Fragment fragment = widgetManager.parentFragment;
            if (fragment != null) {
                return (T) ViewModelProviders.of(fragment, factory).get(cls);
            }
            return (T) ViewModelProviders.of(widgetManager.mo49getActivity(), factory).get(cls);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivity(Intent intent, Bundle bundle) {
            WidgetManager widgetManager = WidgetManager.this;
            C78598Ut0.LJIJJ(intent, widgetManager);
            widgetManager.startActivity(intent, bundle);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i) {
            WidgetManager widgetManager = WidgetManager.this;
            C78598Ut0.LJIJJ(intent, widgetManager);
            widgetManager.startActivityForResult(intent, i);
        }

        @Override // com.bytedance.ies.sdk.widgets.Widget.WidgetCallback
        public void startActivityForResult(Intent intent, int i, Bundle bundle) {
            WidgetManager widgetManager = WidgetManager.this;
            C78598Ut0.LJIJJ(intent, widgetManager);
            widgetManager.startActivityForResult(intent, i, bundle);
        }
    };
    public List<Widget> widgets = new CopyOnWriteArrayList();
    public Map<Widget, ViewGroup> widgetViewGroupHashMap = new HashMap();
    public C08Z parentDestroyedCallback = new C08Z() { // from class: com.bytedance.ies.sdk.widgets.WidgetManager.2
        @Override // X.C08Z
        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            WidgetManager widgetManager = WidgetManager.this;
            if (fragment == widgetManager.parentFragment) {
                fragmentManager.LJLJJLL(widgetManager.parentDestroyedCallback);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                childFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJJI(WidgetManager.this);
                c1b3.LJII();
            }
        }
    };

    /* renamed from: com.bytedance.ies.sdk.widgets.WidgetManager$3, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            $SwitchMap$android$arch$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.DESTROYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.RESUMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.dataCenter = null;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        this.widgets.add(widget);
        getLifecycle().addObserver(widget);
        return this;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Widget> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().onConfigurationChanged(configuration);
        }
    }

    public WidgetManager setDataCenter(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
        Iterator<Widget> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().dataCenter = dataCenter;
        }
        return this;
    }

    public WidgetManager unload(Widget widget) {
        if (widget == null) {
            return this;
        }
        getLifecycle().removeObserver(widget);
        if (widget.isViewValid) {
            int i = AnonymousClass3.$SwitchMap$android$arch$lifecycle$Lifecycle$State[getLifecycle().getCurrentState().ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            widget.onPause();
                            widget.onStop();
                            widget.onDestroy();
                        }
                    } else {
                        widget.onStop();
                        widget.onDestroy();
                    }
                } else {
                    widget.onDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.onDestroy();
            }
        }
        widget.containerView = null;
        widget.context = null;
        widget.widgetCallback = null;
        widget.dataCenter = null;
        this.widgets.remove(widget);
        if (this.widgetViewGroupHashMap.containsKey(widget)) {
            this.widgetViewGroupHashMap.get(widget).removeAllViews();
            this.widgetViewGroupHashMap.remove(widget);
        }
        return this;
    }

    public static WidgetManager of(Fragment fragment, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(null, fragment, view, fragment.getContext());
        return widgetManager;
    }

    public WidgetManager load(int i, Widget widget) {
        load(i, widget, true);
        return this;
    }

    public static WidgetManager of(ActivityC45651qj activityC45651qj, View view) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(activityC45651qj, null, view, activityC45651qj);
        return widgetManager;
    }

    public void continueLoad(Widget widget, ViewGroup viewGroup, View view) {
        if (widget.containerView == null) {
            return;
        }
        widget.contentView = view;
        if (viewGroup != null && view != null) {
            viewGroup.addView(view);
        }
        this.widgets.add(widget);
        getLifecycle().addObserver(widget);
    }

    public WidgetManager load(int i, final Widget widget, boolean z) {
        if (widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.dataCenter = this.dataCenter;
        final ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(i);
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        if (widget.getLayoutId() == 0) {
            continueLoad(widget, viewGroup, null);
            return this;
        }
        if (z) {
            this.asyncLayoutInflater.LIZ(widget.getLayoutId(), viewGroup, new C15X() { // from class: X.SgO
                @Override // X.C15X
                public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                    WidgetManager.this.lambda$load$0(widget, viewGroup, view, i2, viewGroup2);
                }
            });
            return this;
        }
        continueLoad(widget, viewGroup, C16880lQ.LLLLIILL(this.syncLayoutInflater, widget.getLayoutId(), viewGroup, false));
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<Widget> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public void config(ActivityC45651qj activityC45651qj, Fragment fragment, View view, Context context) {
        FragmentManager childFragmentManager;
        if (this.configured) {
            return;
        }
        if (activityC45651qj != null) {
            childFragmentManager = activityC45651qj.getSupportFragmentManager();
        } else if (fragment == null) {
            return;
        } else {
            childFragmentManager = fragment.getChildFragmentManager();
        }
        this.parentFragment = fragment;
        this.contentView = view;
        this.context = context;
        this.asyncLayoutInflater = new C15Y(context);
        this.syncLayoutInflater = C16880lQ.LLZIL(context);
        if (fragment != null && fragment.getFragmentManager() != null) {
            fragment.getFragmentManager().LJJLIL(this.parentDestroyedCallback, false);
        }
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(0, 1, this, TAG);
        LIZ.LJII();
        this.configured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (isRemoving() || isDetached() || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        continueLoad(widget, viewGroup, view);
    }
}
