package com.ss.android.ugc.aweme.service;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C47261Igj;
import X.C54029LIj;
import X.C54859Lfz;
import X.C54860Lg0;
import X.C54861Lg1;
import X.C54863Lg3;
import X.C54864Lg4;
import X.C54865Lg5;
import X.C54866Lg6;
import X.C54867Lg7;
import X.C54868Lg8;
import X.C54869Lg9;
import X.C54870LgA;
import X.C54871LgB;
import X.C56662Kg;
import X.C61878OQg;
import X.C62822Ol8;
import X.C68894R2c;
import X.C73318Sq2;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC54862Lg2;
import X.InterfaceC64592gB;
import X.LWK;
import X.LWL;
import X.RBX;
import X.T16;
import Y.AfS2S0000200_9;
import Y.AfS61S0100000_9;
import Y.IDuS320S0100000_9;
import Y.IDuS79S0200000_9;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsTabDbService implements IFriendsTabDbService {
    public static final /* synthetic */ int LIZJ = 0;
    public final C73318Sq2 LIZ = new C73318Sq2();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C68894R2c.LJLIL);

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk<List<C54859Lfz>> LIZJ() {
        return AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 4)).LJJL(T16.LIZ()).LJIJJLI(C54864Lg4.LJLIL).LJIJJ(C54865Lg5.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LIZLLL() {
        this.LIZ.LIZ(AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 3)).LJJL(T16.LIZ()).LJJJLIIL(C54870LgA.LJLIL, C54871LgB.LJLIL));
    }

    public final InterfaceC54862Lg2 LJIIL() {
        return (InterfaceC54862Lg2) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LIZ() {
        try {
            return LJIIL().LIZJ();
        } catch (Exception unused) {
            return C61878OQg.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LJ() {
        try {
            int i = (int) FriendsTabRedDotOptimizationSettings.LIZ().playedItemsCountLimit;
            InterfaceC54862Lg2 LJIIL = LJIIL();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            return LJIIL.LJIIJ(i, curUserId);
        } catch (Exception unused) {
            return C61878OQg.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LJFF() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - C56662Kg.LIZ().LJIIJJI;
        this.LIZ.LIZ(AbstractC73672Svk.LJIIJ(new C54860Lg0(this, System.currentTimeMillis() - (FriendsTabRedDotOptimizationSettings.LIZ().expireTimeSeconds * 1000))).LJJL(T16.LIZ()).LJJJLIIL(new AfS2S0000200_9(j, elapsedRealtime, 0), new AfS2S0000200_9(j, elapsedRealtime, 1)));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LJIIIZ() {
        try {
            return LJIIL().LIZ();
        } catch (Exception unused) {
            return C61878OQg.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final List<C54859Lfz> LJIIJ() {
        try {
            return LJIIL().LIZLLL(C54029LIj.LIZIZ.LJIILL());
        } catch (Exception unused) {
            return C61878OQg.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LIZIZ(C54859Lfz c54859Lfz) {
        AbstractC73672Svk.LJIIJ(new IDuS79S0200000_9(this, c54859Lfz, 2)).LJJL(T16.LIZ()).LJIJJLI(C54868Lg8.LJLIL).LJIJJ(C54869Lg9.LJLIL).LJJJJZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk<C76800UCe> LJI(List<C54859Lfz> list) {
        return AbstractC73672Svk.LJIIJ(new IDuS79S0200000_9(this, list, 1)).LJJL(T16.LIZ()).LJIJJLI(C54866Lg6.LJLIL).LJIJJ(C54867Lg7.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final void LJII(C54859Lfz c54859Lfz) {
        LJI(C47261Igj.LJII(c54859Lfz)).LJJJLIIL(new LWL(), LWK.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk<Integer> LJIIIIZZ(List<String> awemeIds) {
        o.LJIIIZ(awemeIds, "awemeIds");
        return AbstractC73672Svk.LJIIJ(new IDuS79S0200000_9(this, awemeIds, 0)).LJJL(T16.LIZ()).LJIJJLI(new AfS61S0100000_9(this, 23)).LJIJJ(C54863Lg3.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsTabDbService
    public final AbstractC73672Svk LJIIJJI(long j) {
        return AbstractC73672Svk.LJIIJ(new C54861Lg1(this, j)).LJJL(T16.LIZ()).LJIJJLI(new AfS61S0100000_9(this, 46)).LJIJJ(new InterfaceC64592gB() { // from class: X.9FY
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
