package com.bytedance.ies.ugc.aweme.commercialize.compliance.service;

import X.C58096Mr6;
import X.G10;
import X.GKF;
import X.X1D;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.ConsistentContentAndAdChoiceFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;

/* loaded from: classes8.dex */
public final class ConsistentContentAndAdChoiceServiceImpl implements IConsistentContentAndAdChoiceService {
    public GKF LIZ;
    public String LIZIZ;
    public JourneyConsistentContentAndAdChoicesStruct LIZJ;

    public static IConsistentContentAndAdChoiceService LJII() {
        Object LIZ = C58096Mr6.LIZ(IConsistentContentAndAdChoiceService.class, false);
        if (LIZ != null) {
            return (IConsistentContentAndAdChoiceService) LIZ;
        }
        if (C58096Mr6.LJIIZILJ == null) {
            synchronized (IConsistentContentAndAdChoiceService.class) {
                if (C58096Mr6.LJIIZILJ == null) {
                    C58096Mr6.LJIIZILJ = new ConsistentContentAndAdChoiceServiceImpl();
                }
            }
        }
        return C58096Mr6.LJIIZILJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final JourneyConsistentContentAndAdChoicesStruct LIZ() {
        boolean z;
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("return data is null? ");
        if (this.LIZJ == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        return journeyConsistentContentAndAdChoicesStruct;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final ConsistentContentAndAdChoiceFragment LIZLLL() {
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct = this.LIZJ;
        if (journeyConsistentContentAndAdChoicesStruct != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("keyAdChoiceData", journeyConsistentContentAndAdChoicesStruct);
            ConsistentContentAndAdChoiceFragment consistentContentAndAdChoiceFragment = new ConsistentContentAndAdChoiceFragment();
            consistentContentAndAdChoiceFragment.setArguments(bundle);
            return consistentContentAndAdChoiceFragment;
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final GKF LJ() {
        return this.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final String LJFF() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final void LIZIZ(G10 g10) {
        this.LIZ = g10;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final void LIZJ(JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct) {
        boolean z;
        boolean z2;
        this.LIZJ = journeyConsistentContentAndAdChoicesStruct;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preSaveAdChoiceData is null? ");
        boolean z3 = true;
        if (journeyConsistentContentAndAdChoicesStruct == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", chooseYourExperienceData is null? ");
        if (journeyConsistentContentAndAdChoicesStruct == null || journeyConsistentContentAndAdChoicesStruct.chooseYourExperienceData == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ.append(z2);
        LIZ.append(", customizeYourExperienceData is null? ");
        if (journeyConsistentContentAndAdChoicesStruct != null && journeyConsistentContentAndAdChoicesStruct.customizeYourExperienceData != null) {
            z3 = false;
        }
        LIZ.append(z3);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService
    public final void LJI(String str) {
        this.LIZIZ = str;
    }
}
