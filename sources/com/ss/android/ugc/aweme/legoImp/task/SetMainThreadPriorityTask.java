package com.ss.android.ugc.aweme.legoImp.task;

import X.C00F;
import X.C0RN;
import X.C34321DdV;
import X.C40010Fn4;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.os.Process;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SetMainThreadPriorityTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SetMainThreadPriorityTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        try {
            final int intValue = ((Number) C34321DdV.LIZ.getValue()).intValue();
            if (intValue < -20 || intValue > 19) {
                return;
            }
            try {
                Process.setThreadPriority(intValue);
            } catch (Throwable unused) {
            }
            ProcessLifecycleOwner.get().getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.legoImp.task.SetMainThreadPriorityTask$run$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        onStart();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                public final void onStart() {
                    if (C40010Fn4.LIZJ().LIZLLL() && C00F.LIZ(31744, 0, "power_mode_mainthread_opt_type", true) == 1) {
                        return;
                    }
                    SetMainThreadPriorityTask setMainThreadPriorityTask = SetMainThreadPriorityTask.this;
                    int i = intValue;
                    setMainThreadPriorityTask.getClass();
                    try {
                        Process.setThreadPriority(i);
                    } catch (Throwable unused2) {
                    }
                }
            });
        } catch (Throwable unused2) {
        }
    }
}
