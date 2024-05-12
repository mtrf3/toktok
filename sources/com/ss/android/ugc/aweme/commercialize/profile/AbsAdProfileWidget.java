package com.ss.android.ugc.aweme.commercialize.profile;

import X.C207668Da;
import X.C59672NbQ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public abstract class AbsAdProfileWidget extends Widget implements Observer {
    public Aweme LJLJLJ;
    public Fragment LJLJLLL;
    public String LJLL;

    public void LJIILLIIL(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.iv0("AD_PROFILE_PARAMS", this, false);
        }
        DataCenter dataCenter2 = this.LJLJJI;
        if (dataCenter2 != null) {
            dataCenter2.iv0("AD_PROFILE_VISIBILITY_CHANGED", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.kv0(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void LJIIL(View view) {
        C59672NbQ c59672NbQ;
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null && (c59672NbQ = (C59672NbQ) dataCenter.get("AD_PROFILE_PARAMS")) != null) {
            LJIILJJIL(c59672NbQ);
        }
    }

    public void LJIILJJIL(C59672NbQ c59672NbQ) {
        this.LJLJLJ = c59672NbQ.LIZ;
        this.LJLJLLL = c59672NbQ.LIZIZ;
        this.LJLL = c59672NbQ.LIZJ;
    }

    public final <T extends View> T LJIILL(int i) {
        View view = this.LJLJI;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        C207668Da c207668Da = (C207668Da) obj;
        Object obj2 = null;
        if (c207668Da != null && (str = c207668Da.LIZ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1433406312) {
                if (hashCode != -322064775 || !str.equals("AD_PROFILE_VISIBILITY_CHANGED")) {
                    return;
                }
                Object obj3 = c207668Da.LIZIZ;
                if (obj3 != null) {
                    obj2 = obj3;
                }
                Boolean bool = (Boolean) obj2;
                if (bool == null) {
                    return;
                }
                LJIILLIIL(bool.booleanValue());
                return;
            }
            if (!str.equals("AD_PROFILE_PARAMS")) {
                return;
            }
            Object obj4 = c207668Da.LIZIZ;
            if (obj4 != null) {
                obj2 = obj4;
            }
            C59672NbQ c59672NbQ = (C59672NbQ) obj2;
            if (c59672NbQ == null) {
                return;
            }
            LJIILJJIL(c59672NbQ);
        }
    }
}
