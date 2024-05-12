package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C34710Djm;
import X.C56662Kg;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public class ColdBootPreloadPlayerSoTask implements EE1, InterfaceC36076EDw {
    public static final String[] LJLIL = {"c++_shared", "ttffmpeg", "ttmplayer"};

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "ColdBootPreloadPlayerSoTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.IO;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (((Number) C34710Djm.LJIJ.getValue()).intValue() > 0) {
                for (String str : LJLIL) {
                    C16880lQ.LLJJJIL(str);
                }
            }
        } catch (Throwable unused) {
        }
        C56662Kg.LIZ().LIZLLL(System.currentTimeMillis() - currentTimeMillis, "preload_data_player_so_duration");
    }
}
