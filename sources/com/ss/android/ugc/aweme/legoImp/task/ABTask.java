package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C34565DhR;
import X.C35820E4a;
import X.C38681FGb;
import X.C38701FGv;
import X.C38702FGw;
import X.C38995FSd;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGZ;
import X.FH5;
import X.FHI;
import X.FHT;
import X.G0D;
import X.InterfaceC38730FHy;
import Y.ARunnableS13S0000000_6;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class ABTask implements EE1 {
    public static volatile boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "ABTask";
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
        return 16777215;
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
    public final boolean meetTrigger() {
        return !LJLIL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!LJLIL) {
            synchronized (ABTask.class) {
                if (!LJLIL) {
                    FHT.LIZ();
                    new G0D();
                    FHI fhi = FHI.LJLIL;
                    LinkedList<InterfaceC38730FHy> linkedList = C38681FGb.LIZIZ;
                    if (!linkedList.contains(fhi)) {
                        linkedList.add(fhi);
                        if (linkedList.size() != 0) {
                            C38681FGb.LIZJ = true;
                        }
                    }
                    FH5.LIZIZ().LIZJ((Application) EF7.LIZIZ(), new FGZ());
                    C38701FGv.LJII.getClass();
                    C38702FGw.LIZ("hybrid_ab");
                    C38702FGw.LIZ("livesdk");
                    LJLIL = true;
                    AwemeConfigCenter.LIZJ.set(true);
                    SettingsManager.LIZLLL().LJIIIZ(fhi);
                    if (!C35820E4a.LIZIZ(context, "optimize_loadabrepo_v2", false) && ((Boolean) C34565DhR.LJIIIZ.getValue()).booleanValue()) {
                        C38995FSd.LIZLLL().execute(new ARunnableS13S0000000_6(16));
                    }
                }
            }
        }
    }
}
