package com.ss.android.ugc.now.interaction.service;

import X.C1804976n;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.now.interaction.api.IInteractionService;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionSyncVM;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionService implements IInteractionService {
    @Override // com.ss.android.ugc.now.interaction.api.IInteractionService
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(InteractionBubbleListAssem.class);
    }

    public static IInteractionService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IInteractionService.class, false);
        if (LIZ != null) {
            return (IInteractionService) LIZ;
        }
        if (C58096Mr6.K8 == null) {
            synchronized (IInteractionService.class) {
                if (C58096Mr6.K8 == null) {
                    C58096Mr6.K8 = new InteractionService();
                }
            }
        }
        return C58096Mr6.K8;
    }

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionService
    public final InteractionSyncVM LIZIZ(Fragment fragment) {
        AqS60S0110000_3 LJJ;
        o.LJIIIZ(fragment, "fragment");
        C65776Prg LIZ = C65352Pkq.LIZ(InteractionSyncVM.class);
        C1804976n c1804976n = C1804976n.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(fragment, false);
        } else {
            LJJ = C78926UyI.LJJ(fragment, true);
        }
        return (InteractionSyncVM) new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C184077Kh.LJLIL, c1804976n, LJJ, C78926UyI.LJIILLIIL(fragment, true)).getValue();
    }
}
