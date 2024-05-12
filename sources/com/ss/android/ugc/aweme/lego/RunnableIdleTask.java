package com.ss.android.ugc.aweme.lego;

import X.C0RN;
import X.EE1;
import X.EE4;
import X.EE8;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RunnableIdleTask implements EE1, EE8 {
    public final Runnable LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public long LJLJJI;
    public final EE4 LJLJJL;

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

    @Override // X.EE8
    public final boolean LJ() {
        return this.LJLJI;
    }

    @Override // X.EE8
    public final long LJII() {
        return this.LJLJJI;
    }

    @Override // X.EEY
    public final String key() {
        return this.LJLILLLLZI;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE8
    public final EE4 threadType() {
        return this.LJLJJL;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.IDLE;
    }

    @Override // X.EE8
    public final /* bridge */ /* synthetic */ void LIZLLL(Long l) {
        this.LJLJJI = l.longValue();
    }

    @Override // X.EEY
    public final void run(Context context) {
        this.LJLIL.run();
    }

    public /* synthetic */ RunnableIdleTask(Runnable runnable, String str) {
        this(runnable, str, 1000L, EE4.CPU);
    }

    public RunnableIdleTask(Runnable runnable, String str, long j, EE4 threadType) {
        o.LJIIIZ(runnable, "runnable");
        o.LJIIIZ(threadType, "threadType");
        this.LJLIL = runnable;
        this.LJLILLLLZI = str;
        this.LJLJI = true;
        this.LJLJJI = j;
        this.LJLJJL = threadType;
    }
}
