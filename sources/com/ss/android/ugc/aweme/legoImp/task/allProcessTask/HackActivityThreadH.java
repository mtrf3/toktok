package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0RN;
import X.C36922EeM;
import X.EE1;
import X.EFK;
import X.EK8;
import X.EYB;
import X.EYC;
import X.EYG;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.reflect.Reflect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class HackActivityThreadH implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "HackActivityThreadH";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            Reflect call = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            Class<?> cls = Class.forName("android.app.ActivityThread$H");
            if (call != null) {
                synchronized (cls) {
                    Handler handler = (Handler) call.field("mH", cls).get();
                    if (handler != null) {
                        Reflect on = Reflect.on(handler);
                        EYB eyb = new EYB(handler, (Handler.Callback) on.field("mCallback", Handler.Callback.class).get());
                        if (EYC.LIZ) {
                            ((ArrayList) eyb.LJLILLLLZI).add(new EK8());
                        }
                        ((ArrayList) eyb.LJLILLLLZI).add(new EYG());
                        on.set("mCallback", eyb);
                    }
                }
            }
        } catch (Throwable th) {
            C36922EeM.LJFF(th);
        }
    }
}
