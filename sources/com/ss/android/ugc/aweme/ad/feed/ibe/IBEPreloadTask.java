package com.ss.android.ugc.aweme.ad.feed.ibe;

import X.C0RN;
import X.C162476Zf;
import X.C34613DiD;
import X.C35664DzA;
import X.C38799FKp;
import X.C38805FKv;
import X.C78983UzD;
import X.E3F;
import X.E3G;
import X.E3I;
import X.E3J;
import X.EE1;
import X.EFK;
import X.EnumC35665DzB;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes7.dex */
public final class IBEPreloadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "IBEPreloadTask";
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

    @Override // X.EE1
    public final EFK type() {
        Object LIZJ = E3F.LIZJ("IBEPreloadBootfinish", E3I.LJLIL, E3J.LJLIL, ((Boolean) C34613DiD.LJIIIIZZ.getValue()).booleanValue());
        if (LIZJ != null) {
            return (EFK) LIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (context == null) {
            C78983UzD.LJIILJJIL();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AqS156S0100000_6(this, 6));
        C35664DzA c35664DzA = new C35664DzA(((Boolean) C34613DiD.LJIIIZ.getValue()).booleanValue(), EnumC35665DzB.SPARSE_BG, Integer.valueOf(LiveNetAdaptiveHurryTimeSetting.DEFAULT));
        C38805FKv c38805FKv = C38805FKv.LIZ;
        c38805FKv.getClass();
        c38805FKv.LJ(null, null, null);
        if (c35664DzA.LIZIZ) {
            if (E3G.LIZIZ[c35664DzA.LIZJ.ordinal()] == 1) {
                C38799FKp.LIZ.LIZIZ(c35664DzA.LIZLLL, c35664DzA.LIZ, arrayList);
                return;
            }
            throw new C162476Zf();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC65784Pro) it.next()).invoke();
        }
    }
}
