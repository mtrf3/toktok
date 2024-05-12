package X;

import com.ss.android.ugc.aweme.relation.auth.IAuthService;
import com.ss.android.ugc.aweme.relation.auth.spi.AuthServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UTK implements IAuthService {
    public static final UTK LIZIZ = new UTK();
    public final /* synthetic */ IAuthService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final USO LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC63795P1z LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC237529Tw LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final UTL LIZLLL(EnumC77147UPn platform) {
        o.LJIIIZ(platform, "platform");
        return this.LIZ.LIZLLL(platform);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final AbstractC63778P1i LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC58007Mpf LJFF(EnumC58046MqI platform) {
        o.LJIIIZ(platform, "platform");
        return this.LIZ.LJFF(platform);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC237509Tu LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final List<EFM> LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final OAD LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.IAuthService
    public final InterfaceC70352pT<C57148Mbo> LJIIIZ(EnumC77147UPn platform) {
        o.LJIIIZ(platform, "platform");
        return this.LIZ.LJIIIZ(platform);
    }

    public UTK() {
        IAuthService iAuthService;
        Object LIZ = C58096Mr6.LIZ(IAuthService.class, false);
        if (LIZ != null) {
            iAuthService = (IAuthService) LIZ;
        } else {
            if (C58096Mr6.r4 == null) {
                synchronized (IAuthService.class) {
                    if (C58096Mr6.r4 == null) {
                        C58096Mr6.r4 = new AuthServiceImpl();
                    }
                }
            }
            iAuthService = C58096Mr6.r4;
        }
        this.LIZ = iAuthService;
    }
}
