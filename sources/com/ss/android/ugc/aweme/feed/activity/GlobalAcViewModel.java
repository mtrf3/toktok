package com.ss.android.ugc.aweme.feed.activity;

import X.ActivityC45651qj;
import X.C61192ah;
import X.C77397UZd;
import X.LNQ;
import X.LV0;
import X.QD3;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class GlobalAcViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJL = 0;
    public WeakReference<ViewGroup> LJLIL;
    public WeakReference<ActivityC45651qj> LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI = new MutableLiveData<>();
    public C77397UZd LJLJJI;
    public final LNQ LJLJJL;
    public final GlobalAcViewModel$mainActivityLifecycleObserver$1 LJLJJLL;

    public final void gv0() {
        WeakReference<ViewGroup> weakReference;
        ViewGroup viewGroup;
        ActivityC45651qj activityC45651qj;
        if (LV0.LJI) {
            UgAwemeActivitySetting ugAwemeActivitySetting = LV0.LJII.LIZ;
            if (ugAwemeActivitySetting != null) {
                WeakReference<ActivityC45651qj> weakReference2 = this.LJLILLLLZI;
                ActivityC45651qj activityC45651qj2 = null;
                if (weakReference2 != null && weakReference2.get() != null && (weakReference = this.LJLIL) != null && weakReference.get() != null) {
                    WeakReference<ViewGroup> weakReference3 = this.LJLIL;
                    if (weakReference3 != null) {
                        viewGroup = weakReference3.get();
                    } else {
                        viewGroup = null;
                    }
                    o.LJI(viewGroup);
                    WeakReference<ActivityC45651qj> weakReference4 = this.LJLILLLLZI;
                    if (weakReference4 != null) {
                        activityC45651qj = weakReference4.get();
                    } else {
                        activityC45651qj = null;
                    }
                    o.LJI(activityC45651qj);
                    this.LJLJJI = new C77397UZd(viewGroup, activityC45651qj, ugAwemeActivitySetting);
                    Boolean value = this.LJLJI.getValue();
                    if (value == null) {
                        value = Boolean.TRUE;
                    }
                    value.booleanValue();
                    C77397UZd c77397UZd = this.LJLJJI;
                    if (c77397UZd != null) {
                        WeakReference<ActivityC45651qj> weakReference5 = this.LJLILLLLZI;
                        if (weakReference5 != null) {
                            activityC45651qj2 = weakReference5.get();
                        }
                        c77397UZd.LIZJ(activityC45651qj2);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LV0 lv0 = LV0.LJII;
        LNQ callback = this.LJLJJL;
        lv0.getClass();
        o.LJIIIZ(callback, "callback");
        ((ArrayList) lv0.LIZIZ).add(new WeakReference(callback));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$mainActivityLifecycleObserver$1] */
    public GlobalAcViewModel() {
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLJJL = new LNQ(this);
        this.LJLJJLL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$mainActivityLifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                EventBus.LIZJ().LJIJ(GlobalAcViewModel.this);
            }
        };
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLiveSkyShowEvent(C61192ah event) {
        o.LJIIIZ(event, "event");
        C77397UZd c77397UZd = this.LJLJJI;
        if (c77397UZd != null) {
            c77397UZd.LJII = event.LJLIL;
            c77397UZd.LIZ(false);
        }
    }
}
