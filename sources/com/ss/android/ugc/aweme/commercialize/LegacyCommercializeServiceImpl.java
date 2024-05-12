package com.ss.android.ugc.aweme.commercialize;

import X.C31309CQn;
import X.C58096Mr6;
import X.C61491OBj;
import X.C78253UnR;
import X.FWC;
import X.InterfaceC31408CUi;
import X.NQL;
import X.OJY;
import X.UCH;
import X.V9W;
import com.ss.android.ugc.aweme.services.CommerceDataServiceImpl;

/* loaded from: classes11.dex */
public class LegacyCommercializeServiceImpl implements ILegacyCommercializeService {
    public OJY LIZ;
    public CommerceDataServiceImpl LIZIZ;
    public V9W LIZJ;
    public C61491OBj LIZLLL;
    public C31309CQn LJ;
    public C78253UnR LJFF;
    public UCH LJI;

    public static ILegacyCommercializeService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(ILegacyCommercializeService.class, false);
        if (LIZ != null) {
            return (ILegacyCommercializeService) LIZ;
        }
        if (C58096Mr6.LLLIILIL == null) {
            synchronized (ILegacyCommercializeService.class) {
                if (C58096Mr6.LLLIILIL == null) {
                    C58096Mr6.LLLIILIL = new LegacyCommercializeServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final FWC LIZJ() {
        if (FWC.LJ == null) {
            synchronized (FWC.class) {
                if (FWC.LJ == null) {
                    FWC.LJ = new FWC();
                }
            }
        }
        return FWC.LJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final C78253UnR LIZLLL() {
        if (this.LJFF == null) {
            this.LJFF = new C78253UnR();
        }
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final V9W LJ() {
        if (this.LIZJ == null) {
            this.LIZJ = new V9W();
        }
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final CommerceDataServiceImpl LJFF() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new CommerceDataServiceImpl();
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final InterfaceC31408CUi LJI() {
        if (this.LJ == null) {
            this.LJ = new C31309CQn();
        }
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final C61491OBj LJII() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C61491OBj();
        }
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final UCH LJIIIIZZ() {
        if (this.LJI == null) {
            this.LJI = new UCH();
        }
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final OJY LJIIIZ() {
        if (this.LIZ == null) {
            this.LIZ = new OJY();
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final NQL LIZIZ() {
        return NQL.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final void LIZ() {
    }
}
