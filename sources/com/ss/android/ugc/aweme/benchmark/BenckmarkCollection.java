package com.ss.android.ugc.aweme.benchmark;

import X.C04390Ff;
import X.C0RN;
import X.C1EO;
import X.C275116d;
import X.C275316f;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class BenckmarkCollection implements EE1 {
    @Override // X.EEY
    public String key() {
        return "BenckmarkCollection";
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public /* bridge */ /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    private final void initCollection() {
        C1EO c1eo;
        C04390Ff c04390Ff = C04390Ff.LIZIZ;
        synchronized (c04390Ff) {
            c1eo = c04390Ff.LIZ;
        }
        C275116d c275116d = new C275116d();
        if (BenchmarkRunningGroupId.value() > 0) {
            int value = BenchmarkRunningGroupId.value();
            if (value <= 0) {
                c275116d.LIZ = false;
            } else {
                c275116d.LIZ = true;
                c275116d.LIZIZ = value;
            }
        }
        c1eo.LIZIZ(new C275316f(c275116d));
        C04390Ff.LIZIZ.LIZ().LIZ();
    }

    @Override // X.EEY
    public EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public EFK type() {
        return EFK.APP_BACKGROUND;
    }

    @Override // X.EEY
    public void run(Context context) {
        initCollection();
    }
}
