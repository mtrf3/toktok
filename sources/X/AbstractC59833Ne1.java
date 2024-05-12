package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.ies.android.base.runtime.IDependOutService;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.runtime.DependOutServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.sticker.service.ICommerceStickerService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceApplicationTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceMainActTask;
import com.ss.android.ugc.aweme.service.IBusinessToolsUtilService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;
import java.util.Objects;

/* renamed from: X.Ne1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59833Ne1 implements IInitAllService {
    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public void LJIIJ(AwemeHostApplication awemeHostApplication) {
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final InitLiveServiceTask LIZIZ() {
        return new InitLiveServiceTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final PreloadInstanceApplicationTask LJFF() {
        return new PreloadInstanceApplicationTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJI() {
        if (C37090Eh4.LIZ.LIZ == null || !(!(r0 instanceof DefaultLocalTestImpl))) {
            return;
        }
        C60608NqW.LIZJ.init(String.valueOf(EF7.LJIIIZ), EF7.LJIILIIL, FKM.LIZ(), new O5D(), new C39579Fg7());
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final PreloadInstanceMainActTask LJIILIIL() {
        return new PreloadInstanceMainActTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJIILJJIL() {
        C39328Fc4.LIZ = FJU.LIZIZ();
        C39328Fc4.LIZIZ = FJU.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJII() {
        C61017Nx7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LIZJ(AwemeHostApplication awemeHostApplication) {
        IDependOutService dependOutServiceImpl;
        ICommerceStickerService commerceStickerServiceImpl;
        Object LIZ = C58096Mr6.LIZ(IDependOutService.class, false);
        if (LIZ != null) {
            dependOutServiceImpl = (IDependOutService) LIZ;
        } else {
            dependOutServiceImpl = new DependOutServiceImpl();
        }
        C59836Ne4 LIZ2 = dependOutServiceImpl.LIZ();
        Objects.requireNonNull(LIZ2);
        synchronized (C59835Ne3.LJIIL) {
            if (!C59835Ne3.LJIIJJI) {
                C59835Ne3.LIZ.LIZIZ(LIZ2.LIZIZ);
                C59835Ne3.LIZIZ.LIZIZ(LIZ2.LIZJ);
                C59835Ne3.LIZJ.LIZIZ(LIZ2.LIZ);
                C59835Ne3.LIZLLL.LIZIZ(LIZ2.LJFF);
                C59835Ne3.LJ.LIZIZ(LIZ2.LIZLLL);
                C59835Ne3.LJFF.LIZIZ(LIZ2.LJI);
                C59835Ne3.LJI.LIZIZ(LIZ2.LJII);
                C59835Ne3.LJII.LIZIZ(null);
                C59835Ne3.LJIIIIZZ.LIZIZ(LIZ2.LJIIIIZZ);
                C59835Ne3.LJIIIZ.LIZIZ(LIZ2.LJIIIZ);
                C59835Ne3.LJIIJ.LIZIZ(LIZ2.LJIIJ);
                C36775Ebz c36775Ebz = C36774Eby.LJI;
                INetworkDepend iNetworkDepend = LIZ2.LJ;
                c36775Ebz.getClass();
                C36774Eby.LJFF.LIZIZ(iNetworkDepend);
                C59835Ne3.LJIIJJI = true;
            }
        }
        ISplashAdService LJJI = SplashAdServiceImpl.LJJI();
        if (LJJI != null) {
            LJJI.LJI(new NW4());
        }
        NH3 nh3 = C58909NAb.LIZ;
        NJR njr = NJR.LIZ;
        nh3.getClass();
        NH6.LIZ.LIZIZ(njr);
        ICommercializeAdService LJ = CommercializeAdServiceImpl.LJ();
        if (LJ != null) {
            LJ.LIZ(awemeHostApplication, !((Boolean) C87549YXp.LJFF.getValue()).booleanValue());
        }
        if (!((Boolean) C87549YXp.LJFF.getValue()).booleanValue()) {
            njr.LIZIZ();
            njr.LIZ();
            njr.LIZJ();
            C59114NHy.LIZ.LIZ();
        }
        ICommerceMediaService LIZJ = CommerceMediaServiceImpl.LIZJ();
        if (LIZJ != null) {
            LIZJ.LJII(new C43264GyS());
        }
        ICommerceChallengeService LIZIZ = CommerceChallengeServiceImpl.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LJIILLIIL(new NTG());
        }
        Object LIZ3 = C58096Mr6.LIZ(ICommerceStickerService.class, false);
        if (LIZ3 != null) {
            commerceStickerServiceImpl = (ICommerceStickerService) LIZ3;
        } else {
            commerceStickerServiceImpl = new CommerceStickerServiceImpl();
        }
        commerceStickerServiceImpl.LIZIZ(new OH4());
        IChallengeDetailProvider LJ2 = ChallengeDetailProvider.LJ();
        if (LJ2 != null) {
            LJ2.LIZJ(new C59851NeJ());
        }
        TcmServiceImpl.LJIJI().LJIIIIZZ(new NHD());
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LIZLLL(Application application) {
        IBusinessToolsUtilService iBusinessToolsUtilService;
        if ((!TextUtils.equals(EF7.LJIILIIL, "business") && !TextUtils.equals(EF7.LJIILIIL, "release_outer_test")) || !FCD.LJI(application)) {
            return;
        }
        if (C59856NeO.LIZ == null) {
            try {
                C59856NeO.LIZ = (IBusinessToolsService) ServiceManager.get().getService(IBusinessToolsService.class);
            } catch (IllegalArgumentException unused) {
                C59856NeO.LIZ = null;
            }
        }
        IBusinessToolsService iBusinessToolsService = C59856NeO.LIZ;
        if ((!TextUtils.equals(EF7.LJIILIIL, "business") && !TextUtils.equals(EF7.LJIILIIL, "release_outer_test")) || iBusinessToolsService == null || (iBusinessToolsUtilService = (IBusinessToolsUtilService) ServiceManager.get().getService(IBusinessToolsUtilService.class)) == null) {
            return;
        }
        iBusinessToolsUtilService.initBusinessToolsLogic(application);
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJIILL(AwemeHostApplication awemeHostApplication) {
        try {
            C59858NeQ.LIZ(C16880lQ.LLLLJI(awemeHostApplication));
        } catch (Exception unused) {
        }
    }
}
