package com.ss.android.ugc.aweme.actionai.sdk;

import X.AbstractC73672Svk;
import X.C09G;
import X.C221108m2;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78685UuP;
import X.C83385Wo1;
import X.C83398WoE;
import X.C83416WoW;
import X.C88549Yp7;
import X.InterfaceC88472Yns;
import X.T16;
import Y.AfS57S0200000_8;
import Y.AfS60S0100000_8;
import Y.IDuS324S0100000_14;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.actionai.jni.ActionAIPlatform;
import com.bytedance.ies.actionai.jni.ActionExecutor;
import com.bytedance.ies.actionai.jni.MessageCode;
import com.bytedance.ies.actionai.jni.MessageRequest;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ActionAISDKAgent implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C88549Yp7.LJLIL);
    public static String LJLJJLL;
    public final List<ActionExecutor> LJLIL;
    public ActionAIPlatform LJLILLLLZI;
    public String LJLJI;
    public C83385Wo1 LJLJJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public final void LIZ(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        if (C83398WoE.LIZIZ) {
            interfaceC88472Yns.invoke(null);
            return;
        }
        if (C78685UuP.LJJJZ(this.LJLJI)) {
            String str = this.LJLJI;
            if (str != null) {
                interfaceC88472Yns.invoke(str);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        AbstractC73672Svk.LJIIJ(new IDuS324S0100000_14(this, 0)).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new AfS57S0200000_8(this, interfaceC88472Yns, 2), new AfS60S0100000_8(interfaceC88472Yns, 3));
    }

    public final void LIZIZ(MessageRequest messageRequest) {
        if (C83398WoE.LIZIZ) {
            C83385Wo1 c83385Wo1 = this.LJLJJI;
            if (c83385Wo1 != null) {
                c83385Wo1.onNotify(MessageCode.FAIL, null);
                return;
            }
            return;
        }
        LIZ(new AqS145S0200000_14(this, messageRequest, 4));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZ(this, owner);
        LJLJJLL = null;
        if (C83398WoE.LIZIZ) {
            return;
        }
        this.LJLILLLLZI = new ActionAIPlatform();
        for (ActionExecutor actionExecutor : this.LJLIL) {
            ActionAIPlatform actionAIPlatform = this.LJLILLLLZI;
            if (actionAIPlatform != null) {
                actionAIPlatform.registerAction(actionExecutor);
            }
        }
        LIZ(C83416WoW.LJLIL);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        ActionAIPlatform actionAIPlatform;
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        String str = this.LJLJI;
        if (str != null && (actionAIPlatform = this.LJLILLLLZI) != null) {
            actionAIPlatform.releaseSession(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionAISDKAgent(LifecycleOwner lifecycleOwner, List<? extends ActionExecutor> actions) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(actions, "actions");
        this.LJLIL = actions;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
