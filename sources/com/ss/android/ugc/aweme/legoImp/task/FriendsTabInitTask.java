package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C56672Kh;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC36206EIw;
import X.FMX;
import X.HG3;
import X.InterfaceC36076EDw;
import X.LHM;
import X.OSZ;
import X.RBX;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FriendsTabInitTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FriendsTabInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        LHM lhm = LHM.LIZIZ;
        lhm.LIZ().registerRedDotBytesync();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - C56672Kh.LIZ().LJJIJ;
        lhm.LIZ().runColdStartTaskV2(true, EnumC36206EIw.COLD_START);
        FMX.LJIILL("cold_start_fetch_task_v2", new OSZ(Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "duration"), new OSZ(Long.valueOf(elapsedRealtime2), "delay_from_feed_total"));
    }
}
