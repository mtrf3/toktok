package X;

import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService;
import com.ss.android.ugc.aweme.service.FriendsTabDbService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LW8 implements IFriendsTabDbService {
    public static final LW8 LIZIZ = new LW8();
    public final /* synthetic */ IFriendsTabDbService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LIZIZ(C54859Lfz c54859Lfz) {
        this.LIZ.LIZIZ(c54859Lfz);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk<List<C54859Lfz>> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LJFF() {
        this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk<C76800UCe> LJI(List<C54859Lfz> list) {
        return this.LIZ.LJI(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LJII(C54859Lfz c54859Lfz) {
        this.LIZ.LJII(c54859Lfz);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk<Integer> LJIIIIZZ(List<String> awemeIds) {
        o.LJIIIZ(awemeIds, "awemeIds");
        return this.LIZ.LJIIIIZZ(awemeIds);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk LJIIJJI(long j) {
        return this.LIZ.LJIIJJI(j);
    }

    public LW8() {
        IFriendsTabDbService iFriendsTabDbService;
        Object LIZ = C58096Mr6.LIZ(IFriendsTabDbService.class, false);
        if (LIZ != null) {
            iFriendsTabDbService = (IFriendsTabDbService) LIZ;
        } else {
            if (C58096Mr6.V4 == null) {
                synchronized (IFriendsTabDbService.class) {
                    if (C58096Mr6.V4 == null) {
                        C58096Mr6.V4 = new FriendsTabDbService();
                    }
                }
            }
            iFriendsTabDbService = C58096Mr6.V4;
        }
        this.LIZ = iFriendsTabDbService;
    }
}
