package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import X.C10K;
import X.C84369X9h;
import X.EF7;
import X.InterfaceC84368X9g;
import X.M5A;
import X.XSL;
import Y.ACallableS118S0100000_15;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ContinuousTimeCalculator implements M5A, WeakHandler.IHandler {
    public static final C84369X9h Companion = new C84369X9h();
    public static ContinuousTimeCalculator mInstance;
    public static Integer sBackgroundValue;
    public static Integer sCheckGap;
    public boolean hasCheckOnLaunch;
    public final ArrayList<InterfaceC84368X9g> observers = new ArrayList<>();
    public final WeakHandler mHandler = new WeakHandler(this);

    @Override // X.M5A
    public void onAppEnterBackGround() {
        int i;
        WeakHandler weakHandler = this.mHandler;
        Companion.getClass();
        if (sBackgroundValue == null) {
            if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                i = 20000;
            } else {
                i = 30000;
            }
            sBackgroundValue = Integer.valueOf(i);
        }
        o.LJI(sBackgroundValue);
        weakHandler.sendEmptyMessageDelayed(100004, r0.intValue());
    }

    @Override // X.M5A
    public void onAppEnterForeground() {
        this.mHandler.removeMessages(100004);
        startCounting();
    }

    public void onMainActivityResumed() {
        if (!this.hasCheckOnLaunch) {
            this.hasCheckOnLaunch = true;
            notifyTime(0L);
        }
    }

    public final void startCounting() {
        if (!this.observers.isEmpty() && !this.mHandler.hasMessages(100003)) {
            WeakHandler weakHandler = this.mHandler;
            Companion.getClass();
            weakHandler.sendEmptyMessageDelayed(100003, C84369X9h.LIZ());
        }
    }

    public final void unregisterAll() {
        this.observers.clear();
    }

    public ContinuousTimeCalculator() {
        resetObserver();
        startCounting();
    }

    public final void resetObserver() {
        unregisterAll();
        registerObserver(new XSL());
    }

    private final void notifyTime(long j) {
        C10K.LIZJ(new ACallableS118S0100000_15(this, j, 1));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        switch (msg.what) {
            case 100003:
                if (!(!this.observers.isEmpty())) {
                    return;
                }
                WeakHandler weakHandler = this.mHandler;
                Companion.getClass();
                weakHandler.sendEmptyMessageDelayed(100003, C84369X9h.LIZ());
                notifyTime(C84369X9h.LIZ());
                return;
            case 100004:
                this.mHandler.removeMessages(100003);
                return;
            default:
                return;
        }
    }

    public final void registerObserver(InterfaceC84368X9g observer) {
        o.LJIIIZ(observer, "observer");
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }
}
