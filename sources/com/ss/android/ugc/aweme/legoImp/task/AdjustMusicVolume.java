package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C10K;
import X.C235779Nd;
import X.C36821Ecj;
import X.C54293LSn;
import X.DOI;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.AgS47S0000000_8;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public class AdjustMusicVolume implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AdjustMusicVolume";
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
        if (((Boolean) DOI.LJ.getValue()).booleanValue()) {
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
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJFF == null) {
            c54293LSn.LJFF = new C36821Ecj<>("i18n_audio_volume", Boolean.FALSE);
        }
        if (!c54293LSn.LJFF.LIZ().booleanValue()) {
            C10K.LJII(500L).LIZLLL(new AgS47S0000000_8(0));
            if (c54293LSn.LJFF == null) {
                c54293LSn.LJFF = new C36821Ecj<>("i18n_audio_volume", Boolean.FALSE);
            }
            c54293LSn.LJFF.LIZLLL(Boolean.TRUE);
        }
    }
}
