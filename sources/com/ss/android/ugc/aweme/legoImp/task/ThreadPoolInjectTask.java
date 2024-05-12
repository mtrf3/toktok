package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C1DI;
import X.C2310695a;
import X.C35044DpA;
import X.C36071bH;
import X.C38016Ew0;
import X.C38816FLg;
import X.C38995FSd;
import X.C39001FSj;
import X.C39005FSn;
import X.C56662Kg;
import X.C73548Stk;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FSY;
import X.RunnableC39007FSp;
import X.V2B;
import Y.ARunnableS1S0001000_6;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ThreadPoolInjectTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ThreadPoolInjectTask";
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
        return 16777215;
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
        C56662Kg.LIZ().LIZJ("method_thread_pool_inject_duration", false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(FSY.IO);
        arrayList.add(FSY.DEFAULT);
        arrayList.add(FSY.SERIAL);
        arrayList.add(FSY.BACKGROUND);
        C39005FSn c39005FSn = new C39005FSn();
        c39005FSn.LIZ = false;
        c39005FSn.LIZIZ = arrayList;
        List<String> list = C2310695a.LIZ;
        C39001FSj.LIZ(list);
        c39005FSn.LIZJ = list;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(5L);
        C39001FSj.LIZIZ(millis);
        c39005FSn.LIZLLL = millis;
        long millis2 = timeUnit.toMillis(5L);
        C39001FSj.LIZIZ(millis2);
        c39005FSn.LJ = millis2;
        long millis3 = timeUnit.toMillis(15L);
        C39001FSj.LIZIZ(millis3);
        c39005FSn.LJFF = millis3;
        C38995FSd.LIZ = new C39001FSj(c39005FSn);
        if (!C35044DpA.LIZ()) {
            C38995FSd.LIZIZ = new C36071bH();
        }
        V2B.LJLIL = C38995FSd.LIZLLL();
        C38816FLg.LJ(new ARunnableS1S0001000_6(0, 15));
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        RunnableC39007FSp.LJLJI = LIZLLL;
        RunnableC39007FSp.LJLJJI = LIZLLL;
        C38016Ew0.LIZ = C38995FSd.LIZJ();
        C73548Stk.LIZIZ = new C1DI();
        C56662Kg.LIZ().LJFF("method_thread_pool_inject_duration", false);
    }
}
