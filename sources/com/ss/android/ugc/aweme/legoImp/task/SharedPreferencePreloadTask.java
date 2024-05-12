package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import android.content.Context;
import com.bytedance.keva.KevaImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class SharedPreferencePreloadTask implements EE1 {
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
        return EFK.BACKGROUND;
    }

    public final void LIZLLL(Context context, String str) {
        o.LJIIIZ(context, "context");
        KevaImpl.getRepoSync(str, 0);
    }

    public final void LJ(Context context, String str) {
        o.LJIIIZ(context, "context");
        KevaImpl.getRepoFromSpSync(context, str, 0);
    }

    public final void LJII(Context context, int i, String str) {
        o.LJIIIZ(context, "context");
        F9J.LIZIZ(context, 0, str).getInt("tiktok", 0);
    }
}
