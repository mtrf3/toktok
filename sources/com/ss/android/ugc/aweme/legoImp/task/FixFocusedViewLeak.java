package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C1DH;
import X.C36359EOt;
import X.EE1;
import X.EFK;
import X.EN0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class FixFocusedViewLeak implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "FixFocusedViewLeak";
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
        Application application = (Application) context;
        int i = Build.VERSION.SDK_INT;
        if (i > 25) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(EN0.LIZ));
        if (C1DH.LJJIFFI() && i >= 23) {
            arrayList.add("mLastSrvView");
        }
        application.registerActivityLifecycleCallbacks(new C36359EOt(arrayList));
    }
}
