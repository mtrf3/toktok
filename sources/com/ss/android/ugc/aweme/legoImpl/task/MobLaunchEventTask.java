package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C36922EeM;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import X.FUA;
import android.content.Context;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobLaunchEventTask implements EE1 {
    public final boolean LJLIL;
    public final long LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "MobLaunchEventTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        String str;
        o.LJIIIZ(context, "context");
        C36922EeM.LJ("MobLaunchEventTask");
        String str2 = "first_launch_time";
        if (this.LJLIL) {
            str = "first_launch_time";
        } else {
            str = "launch_time";
        }
        FUA.LJ("aweme_app_performance", str, (float) this.LJLILLLLZI);
        MobClick obtain = MobClick.obtain();
        if (!this.LJLIL) {
            str2 = "launch_time";
        }
        obtain.setEventName(str2);
        obtain.setLabelName("perf_monitor");
        obtain.setExtValueLong(this.LJLILLLLZI);
        FMX.onEvent(obtain);
    }

    public MobLaunchEventTask(boolean z, long j) {
        this.LJLIL = z;
        this.LJLILLLLZI = j;
    }
}
