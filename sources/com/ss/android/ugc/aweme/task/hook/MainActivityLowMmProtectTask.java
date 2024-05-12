package com.ss.android.ugc.aweme.task.hook;

import X.C0RN;
import X.C221108m2;
import X.C36709Eav;
import X.C36711Eax;
import X.C62822Ol8;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import Y.AfS58S0100000_6;
import android.content.Context;
import android.os.Build;
import com.ss.android.agilelogger.ALog;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MainActivityLowMmProtectTask implements EE1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 72));

    @Override // X.EEY
    public final String key() {
        return "MainActivityLowMmProtectTask";
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

    public MainActivityLowMmProtectTask() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("ActivityLowMmProtect", "do HomeActivity tack create");
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
        o.LJIIIZ(context, "context");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLowMmProtect", "HomeActivity task run");
        FFL.LJIIIZ().getClass();
        if (!FFL.LJ(31744, "main_activity_recycled_ab", true, false)) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLowMmProtect", "ABTest off");
        } else if (Build.VERSION.SDK_INT >= 30) {
            C84763XOl.LJII.LJJJJLL().LJJIFFI(C36711Eax.LJLIL).LJJJLIIL(new AfS58S0100000_6(this, 21), C36709Eav.LJLIL);
        }
    }
}
