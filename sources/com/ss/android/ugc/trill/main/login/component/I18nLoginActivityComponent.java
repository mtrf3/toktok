package com.ss.android.ugc.trill.main.login.component;

import X.C16880lQ;
import X.C4L0;
import X.JJ4;
import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;

/* loaded from: classes9.dex */
public class I18nLoginActivityComponent extends BaseLoginActivityComponent implements C4L0 {
    public Activity LJLILLLLZI;
    public Fragment LJLJI;
    public JJ4 LJLJJI;
    public Bundle LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS44S0100000_8 LJLJLJ = new ARunnableS44S0100000_8(this, 67);

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent
    public final void onDestroy() {
        super.onDestroy();
        ComponentCallbacks2 componentCallbacks2 = this.LJLILLLLZI;
        if (componentCallbacks2 instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2).getLifecycle().removeObserver(this);
        }
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJL = null;
        this.LJLJJI = null;
    }

    @Override // X.C4L0
    public final void run(Object obj) {
        Handler handler;
        Fragment fragment;
        Boolean bool = (Boolean) obj;
        if (this.LJLILLLLZI == null && ((fragment = this.LJLJI) == null || fragment.mo49getActivity() == null)) {
            return;
        }
        Activity activity = this.LJLILLLLZI;
        if (activity == null) {
            activity = this.LJLJI.mo49getActivity();
        }
        if (bool == null || bool.booleanValue() || activity == null || activity.isFinishing() || (handler = this.LJLIL) == null) {
            return;
        }
        handler.removeCallbacks(this.LJLJLJ);
        this.LJLIL.post(this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, X.J9O
    public final void LIZ(Fragment fragment, String str, String str2, Bundle bundle, JJ4 jj4) {
        if (fragment == null || fragment.mo49getActivity() == null || fragment.mo49getActivity().isFinishing()) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        super.LIZ(fragment, str, str2, bundle, jj4);
        this.LJLJI = fragment;
        this.LJLILLLLZI = fragment.mo49getActivity();
        this.LJLJJL = bundle;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJJI = jj4;
        if (bundle.getBoolean("is_disable_animation", false)) {
            this.LJLJLJ.run();
        } else {
            this.LJLIL.removeCallbacks(this.LJLJLJ);
            this.LJLIL.post(this.LJLJLJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, X.J9O
    public final void LIZIZ(Activity activity, String str, String str2, Bundle bundle, JJ4 jj4) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        super.LIZIZ(activity, str, str2, bundle, jj4);
        this.LJLJI = null;
        this.LJLILLLLZI = activity;
        this.LJLJJL = bundle;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJJI = jj4;
        if (bundle.getBoolean("is_disable_animation", false)) {
            this.LJLJLJ.run();
        } else {
            this.LJLIL.removeCallbacks(this.LJLJLJ);
            this.LJLIL.post(this.LJLJLJ);
        }
    }
}
