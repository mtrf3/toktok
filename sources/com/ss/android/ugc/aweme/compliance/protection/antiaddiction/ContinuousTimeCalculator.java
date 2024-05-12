package com.ss.android.ugc.aweme.compliance.protection.antiaddiction;

import X.C10K;
import X.C44428Hc8;
import X.C57098Mb0;
import X.C57103Mb5;
import X.C57160Mc0;
import X.C57161Mc1;
import X.InterfaceC57163Mc3;
import X.M5A;
import Y.ACallableS20S0100100_9;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class ContinuousTimeCalculator implements M5A, WeakHandler.IHandler {
    public static Integer sBackgroundValue;
    public static Integer sCheckGap;
    public C57160Mc0 timeTicker;
    public final ArrayList<InterfaceC57163Mc3> observers = new ArrayList<>();
    public final C44428Hc8 mStopwatch = new C44428Hc8();
    public final WeakHandler mHandler = new WeakHandler(this);

    public void onMainActivityResumed() {
    }

    public static int getBackgroundValue() {
        if (sBackgroundValue == null) {
            sBackgroundValue = 30000;
        }
        return sBackgroundValue.intValue();
    }

    public static int getCheckGap() {
        if (sCheckGap == null) {
            sCheckGap = 5000;
        }
        return sCheckGap.intValue();
    }

    @Override // X.M5A
    public void onAppEnterForeground() {
        this.mHandler.removeMessages(100004);
        if (!this.mHandler.hasMessages(100003)) {
            this.mHandler.sendEmptyMessageDelayed(100003, getCheckGap());
        }
        C44428Hc8 c44428Hc8 = this.mStopwatch;
        if (!c44428Hc8.LIZIZ) {
            c44428Hc8.LIZLLL();
        }
    }

    public void unregisterAll() {
        this.observers.clear();
    }

    public ContinuousTimeCalculator() {
        unregisterAll();
        registerObserver(new C57160Mc0());
        registerObserver(new C57103Mb5());
        registerObserver(new C57098Mb0());
        PipServiceImpl.LJJII().LJ(new C57161Mc1(this));
    }

    @Override // X.M5A
    public void onAppEnterBackGround() {
        if (!PipServiceImpl.LJJII().isInPipMode()) {
            this.mHandler.sendEmptyMessageDelayed(100004, getBackgroundValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$notifyTime$0(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<InterfaceC57163Mc3> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().LIZ(currentTimeMillis, j);
        }
        return null;
    }

    private void notifyTime(long j) {
        C10K.LIZJ(new ACallableS20S0100100_9(j, this, 1));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.mHandler.sendEmptyMessageDelayed(100003, getCheckGap());
                notifyTime(this.mStopwatch.LIZIZ(TimeUnit.MILLISECONDS));
                return;
            case 100004:
                this.mHandler.removeMessages(100003);
                this.mStopwatch.LIZJ();
                Iterator<InterfaceC57163Mc3> it = this.observers.iterator();
                while (it.hasNext()) {
                    it.next().onCleared();
                }
                return;
            default:
                return;
        }
    }

    public void registerObserver(InterfaceC57163Mc3 interfaceC57163Mc3) {
        if (!this.observers.contains(interfaceC57163Mc3)) {
            this.observers.add(interfaceC57163Mc3);
        }
    }

    public void unregisterObserver(InterfaceC57163Mc3 interfaceC57163Mc3) {
        this.observers.remove(interfaceC57163Mc3);
    }
}
