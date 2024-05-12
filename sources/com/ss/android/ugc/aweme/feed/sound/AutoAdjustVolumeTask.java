package com.ss.android.ugc.aweme.feed.sound;

import X.C0RN;
import X.C10K;
import X.C36152EGu;
import X.C47636Imm;
import X.C88547Yp5;
import X.DOI;
import X.DPP;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.IG3;
import X.J8L;
import android.content.Context;
import java.util.List;

/* loaded from: classes9.dex */
public final class AutoAdjustVolumeTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AutoAdjustVolumeTask";
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
        if (C36152EGu.LJ()) {
            if (DPP.LIZIZ()) {
                return EFK.BACKGROUND;
            }
        } else if (((Boolean) DOI.LIZJ.getValue()).booleanValue()) {
            return EFK.BACKGROUND;
        }
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        double LJII = C47636Imm.LJII(2);
        IG3.LIZJ = LJII;
        C88547Yp5 c88547Yp5 = C88547Yp5.LIZIZ;
        if (!c88547Yp5.LJJI() && c88547Yp5.LJJIIJZLJL()) {
            if (((Boolean) DOI.LIZJ.getValue()).booleanValue()) {
                IG3.LIZ(LJII);
            } else {
                C10K.LJII(500L).LIZLLL(new J8L(LJII));
            }
        }
    }
}
