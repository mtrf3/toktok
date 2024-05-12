package com.bytedance.ext_power_list;

import X.ActivityC45651qj;
import X.C8RL;
import X.C8YF;
import X.InterfaceC212998Xn;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AssemReusedVHContainer<R extends InterfaceC212998Xn<R, ITEM>, ITEM extends C8RL> extends AssemReusedContainer<R, ITEM> {
    public final LifecycleOwner LJLLILLLL;
    public final View LJLLJ;
    public final ActivityC45651qj LJLLL;
    public final InterfaceC55235Lm3 LJLLLL;
    public final LifecycleOwner LJLLLLLL;
    public final LifecycleOwner LJLZ;

    public AssemReusedVHContainer() {
        throw null;
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLLLLLL;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LJJLI() {
        return this.LJLZ;
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLLL;
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLLJ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssemReusedVHContainer(LifecycleOwner lifecycleOwner, C8YF proxyer, View containerView) {
        super(proxyer);
        ActivityC45651qj activityC45651qj;
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        if (context instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) context;
        } else {
            if (context instanceof ContextThemeWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext() instanceof ActivityC45651qj) {
                    Context baseContext = contextWrapper.getBaseContext();
                    o.LJII(baseContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    activityC45651qj = (ActivityC45651qj) baseContext;
                }
            }
            activityC45651qj = null;
        }
        o.LJIIIZ(proxyer, "proxyer");
        o.LJIIIZ(containerView, "containerView");
        this.LJLLILLLL = lifecycleOwner;
        this.LJLLJ = containerView;
        this.LJLLL = activityC45651qj;
        this.LJLLLL = null;
        this.LJLLLLLL = lifecycleOwner;
        this.LJLZ = lifecycleOwner;
    }
}
