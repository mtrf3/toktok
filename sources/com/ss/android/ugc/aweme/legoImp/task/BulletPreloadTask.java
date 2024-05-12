package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C33798DOg;
import X.C80001VaX;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import java.util.List;

/* loaded from: classes7.dex */
public final class BulletPreloadTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "BulletPreloadTask";
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
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (C33798DOg.LIZ()) {
            return EE4.IO;
        }
        return EE4.CPU;
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
        System.currentTimeMillis();
        BulletService.LIZ().LJI();
        if (context != null) {
            try {
                new C80001VaX(context, null);
                new TuxTextView(context, null, 6, 0);
            } catch (Throwable unused) {
            }
        }
    }
}
