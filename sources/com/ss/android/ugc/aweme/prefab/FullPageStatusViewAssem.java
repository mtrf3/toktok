package com.ss.android.ugc.aweme.prefab;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C73305Spp;
import X.EV9;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class FullPageStatusViewAssem extends DynamicAssem implements RefreshSuccessSubscriber, RefreshErrorSubscriber, RefreshLoadingSubscriber {
    public final C62822Ol8 LJLJLLL;
    public NetworkHelper LJLL;
    public C73305Spp LJLLI;

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void assembleChildren() {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public FullPageStatusViewAssem() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 792));
    }

    public void J80() {
        NetworkHelper networkHelper = this.LJLL;
        if (networkHelper != null) {
            networkHelper.LIZIZ(this.LJLLI);
        }
        NetworkHelper networkHelper2 = this.LJLL;
        if (networkHelper2 != null) {
            networkHelper2.LIZLLL(this.LJLLI);
        }
    }

    public void pN() {
        NetworkHelper networkHelper = this.LJLL;
        if (networkHelper != null) {
            networkHelper.LIZJ(this.LJLLI);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        E3(c73305Spp);
        super.onCreateView();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(view, "view");
        assembleChildren();
        C73305Spp c73305Spp = (C73305Spp) view;
        this.LJLLI = c73305Spp;
        c73305Spp.setLayoutVariant(0);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1649);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(this, 1650);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        String str = (String) this.LJLJLLL.getValue();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            lifecycleOwner = LIZLLL.getViewLifecycleOwner();
        } else {
            lifecycleOwner = null;
        }
        this.LJLL = new NetworkHelper(aqS153S0100000_3, aqS153S0100000_32, null, null, LIZ, str, 0, lifecycleOwner, UserLevelGeckoUpdateSetting.DEFAULT);
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL2, null);
            C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ, RefreshSuccessSubscriber.class, null);
            if (LIZ2 == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, RefreshSuccessSubscriber.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ2);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ2);
                    Object newProxyInstance = Proxy.newProxyInstance(RefreshSuccessSubscriber.class.getClassLoader(), new Class[]{RefreshSuccessSubscriber.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, RefreshSuccessSubscriber.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber");
                    }
                }
            }
            C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ, RefreshErrorSubscriber.class, null);
            if (LIZ3 == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, RefreshErrorSubscriber.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ3);
                    if (invocationHandler2 instanceof EV9) {
                        ((EV9) invocationHandler2).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused2) {
                    EV9 ev92 = new EV9();
                    ev92.LIZ.add(this);
                    ev92.LIZ.add(LIZ3);
                    Object newProxyInstance2 = Proxy.newProxyInstance(RefreshErrorSubscriber.class.getClassLoader(), new Class[]{RefreshErrorSubscriber.class}, ev92);
                    if (newProxyInstance2 != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance2, RefreshErrorSubscriber.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber");
                    }
                }
            }
            C2K0 LIZ4 = C55096Ljo.LIZ(LIZJ, RefreshLoadingSubscriber.class, null);
            if (LIZ4 == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, RefreshLoadingSubscriber.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ4);
                if (invocationHandler3 instanceof EV9) {
                    ((EV9) invocationHandler3).LIZ.add(this);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused3) {
                EV9 ev93 = new EV9();
                ev93.LIZ.add(this);
                ev93.LIZ.add(LIZ4);
                Object newProxyInstance3 = Proxy.newProxyInstance(RefreshLoadingSubscriber.class.getClassLoader(), new Class[]{RefreshLoadingSubscriber.class}, ev93);
                if (newProxyInstance3 != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance3, RefreshLoadingSubscriber.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber");
            }
        }
    }

    public void s6(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        NetworkHelper networkHelper = this.LJLL;
        if (networkHelper != null) {
            networkHelper.LIZ(throwable, this.LJLLI);
        }
    }
}
