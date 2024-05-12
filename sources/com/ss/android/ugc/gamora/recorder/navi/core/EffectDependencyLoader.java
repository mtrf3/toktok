package com.ss.android.ugc.gamora.recorder.navi.core;

import X.ActivityC45651qj;
import X.C0MT;
import X.C1FJ;
import X.C221108m2;
import X.C62822Ol8;
import X.C6QQ;
import X.C72710SgE;
import X.H78;
import X.InterfaceC83624Wrs;
import X.X1D;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bef.effectsdk.message.MessageCenter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS79S1100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EffectDependencyLoader implements GenericLifecycleObserver, MessageCenter.Listener {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC83624Wrs LJLILLLLZI;
    public final Set<String> LJLJI;
    public final Map<String, List<C72710SgE>> LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLJJL = true;
        MessageCenter.removeListener(this);
        ((LinkedHashMap) this.LJLJJI).clear();
        this.LJLJI.clear();
        ((Lifecycle) this.LJLJJLL.getValue()).removeObserver(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public EffectDependencyLoader(ActivityC45651qj activity, InterfaceC83624Wrs cameraView) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraView, "cameraView");
        this.LJLIL = activity;
        this.LJLILLLLZI = cameraView;
        this.LJLJI = new LinkedHashSet();
        this.LJLJJI = new LinkedHashMap();
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 964));
        this.LJLJJLL = LIZIZ;
        if (((Lifecycle) LIZIZ.getValue()).getCurrentState() != Lifecycle.State.DESTROYED) {
            ((Lifecycle) LIZIZ.getValue()).addObserver(this);
            MessageCenter.addListener(this);
        }
    }

    public final void LIZ(int i, long j, String arg3, String str) {
        o.LJIIIZ(arg3, "arg3");
        if (this.LJLJJL) {
            return;
        }
        if (str == null || this.LJLJI.contains(str)) {
            LIZIZ(i, j, 0L, arg3);
            return;
        }
        if (!this.LJLJJI.containsKey(str)) {
            this.LJLJJI.put(str, new ArrayList());
        }
        List list = (List) ((LinkedHashMap) this.LJLJJI).get(str);
        if (list != null) {
            list.add(new C72710SgE(i, j, arg3));
        }
    }

    public final void LIZIZ(int i, long j, long j2, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        if (this.LJLJJL) {
            return;
        }
        StringBuilder LIZLLL = C1FJ.LIZLLL("send Message, messageType=", i, ", arg1=", j);
        C0MT.LIZLLL(LIZLLL, ", arg2=", j2, ", arg3=");
        LIZLLL.append(arg3);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZLLL));
        this.LJLILLLLZI.LJJIJL(i, j, j2, arg3);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17 && i2 == 3 && str != null) {
            C6QQ.LIZ(new AqS79S1100000_12(this, str, 3));
        }
    }
}
