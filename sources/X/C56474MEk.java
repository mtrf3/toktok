package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.MEk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56474MEk extends AbstractC029609s {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ C56473MEj LJLILLLLZI;

    @Override // X.AbstractC029609s
    public final void LIZJ() {
        this.LJLILLLLZI.LLIIJI();
        if (!C79004UzY.LJJIFFI(this.LJLILLLLZI.mmItems)) {
            ActivityC45651qj activityC45651qj = this.LJLIL;
            INetworkStateService createINetworkStateServicebyMonsterPlugin = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
            o.LJI(activityC45651qj);
            boolean LJ = C48203Ivv.LJ(activityC45651qj);
            boolean isWeakNetwork = createINetworkStateServicebyMonsterPlugin.isWeakNetwork();
            int effectiveConnectionType = createINetworkStateServicebyMonsterPlugin.getEffectiveConnectionType();
            if (!LJ || isWeakNetwork) {
                C188727au c188727au = new C188727au();
                HG3.LJIIL();
                c188727au.LJIIIZ("user_id", HG3.LJLJL.LJFF().getCurUserId());
                c188727au.LJFF(C48203Ivv.LIZIZ(activityC45651qj), "network_type");
                c188727au.LJIIIZ("effective_connection_type", String.valueOf(effectiveConnectionType));
                c188727au.LJIIIZ("scene_type", "profile_works");
                FMX.LJIIL("profile_poor_network", c188727au.LIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("current network status connectionType: ");
            LIZ.append(effectiveConnectionType);
            LIZ.append(" isNetAvailable: ");
            LIZ.append(LJ);
            LIZ.append(" isWeakNet: ");
            HH1.LIZIZ(LIZ, isWeakNetwork, LIZ, "Profile.ProfileStatics");
        }
    }

    public C56474MEk(C56473MEj c56473MEj, ActivityC45651qj activityC45651qj) {
        this.LJLILLLLZI = c56473MEj;
        this.LJLIL = activityC45651qj;
    }

    @Override // X.AbstractC029609s
    public final void LIZLLL(int i, int i2) {
        this.LJLILLLLZI.LLIIJI();
    }

    @Override // X.AbstractC029609s
    public final void LJFF(int i, int i2) {
        this.LJLILLLLZI.LLIIJI();
    }

    @Override // X.AbstractC029609s
    public final void LJI(int i, int i2) {
        this.LJLILLLLZI.LLIIJI();
    }

    @Override // X.AbstractC029609s
    public final void LJII(int i, int i2) {
        this.LJLILLLLZI.LLIIJI();
    }

    @Override // X.AbstractC029609s
    public final void LJ(int i, int i2, Object obj) {
        LIZLLL(i, i2);
        this.LJLILLLLZI.LLIIJI();
    }
}
