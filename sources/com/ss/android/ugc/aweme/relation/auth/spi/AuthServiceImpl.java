package com.ss.android.ugc.aweme.relation.auth.spi;

import X.AbstractC63778P1i;
import X.AbstractC63795P1z;
import X.C162476Zf;
import X.C47261Igj;
import X.C57148Mbo;
import X.C57393Mfl;
import X.C57394Mfm;
import X.C63781P1l;
import X.C63798P2c;
import X.C77135UPb;
import X.C77136UPc;
import X.EFM;
import X.EMN;
import X.EnumC58046MqI;
import X.EnumC77147UPn;
import X.InterfaceC237509Tu;
import X.InterfaceC237529Tw;
import X.InterfaceC58007Mpf;
import X.InterfaceC70352pT;
import X.OAC;
import X.OAD;
import X.P1W;
import X.USC;
import X.USO;
import X.UTL;
import X.UTM;
import X.UTO;
import X.UTP;
import X.UTQ;
import X.UTR;
import X.UTX;
import X.X1D;
import com.ss.android.ugc.aweme.relation.auth.IAuthService;
import com.ss.android.ugc.aweme.relation.auth.lego.EmailUploadRequest;
import com.ss.android.ugc.aweme.relation.auth.lego.PermissionRequestAndUploadLegoTask;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AuthServiceImpl implements IAuthService {
    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final List<EFM> LJII() {
        return C47261Igj.LJJIJIIJI(new PermissionRequestAndUploadLegoTask(), new EmailUploadRequest());
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final USO LIZ() {
        return (USC) UTM.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC63795P1z LIZIZ() {
        return new C63781P1l();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC237529Tw LIZJ() {
        return new EMN();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC63778P1i LJ() {
        return new P1W();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC237509Tu LJI() {
        return new UTX(0);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final OAD LJIIIIZZ() {
        return new OAC();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final UTL LIZLLL(EnumC77147UPn platform) {
        o.LJIIIZ(platform, "platform");
        int i = C63798P2c.LIZIZ[platform.ordinal()];
        if (i != 3) {
            if (i == 4) {
                return C77136UPc.LIZ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("wrong relationAuthPlatform: ");
            LIZ.append(platform);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalStateException(LIZIZ);
        }
        return C77135UPb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC58007Mpf LJFF(EnumC58046MqI platform) {
        o.LJIIIZ(platform, "platform");
        int i = C63798P2c.LIZ[platform.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C57393Mfl.LIZ;
            }
            throw new C162476Zf();
        }
        return C57394Mfm.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC70352pT<C57148Mbo> LJIIIZ(EnumC77147UPn platform) {
        o.LJIIIZ(platform, "platform");
        int i = C63798P2c.LIZIZ[platform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return UTP.LIZ;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("wrong relationAuthPlatform: ");
                    LIZ.append(platform);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalStateException(LIZIZ);
                }
                return UTR.LIZ;
            }
            return UTQ.LIZ;
        }
        return UTO.LIZ;
    }
}
