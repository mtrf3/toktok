package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C221018lt;
import X.C32I;
import X.C57571Mid;
import X.C58080Mqq;
import X.C58620MzY;
import X.C76800UCe;
import X.C8RL;
import X.EnumC58046MqI;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import X.N4D;
import X.N4N;
import X.N4O;
import X.N5J;
import X.OT1;
import X.OTS;
import X.P2J;
import X.V1M;
import X.X1D;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class AqS59S0201000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS59S0201000_10 aqS59S0201000_10, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestPresenter) aqS59S0201000_10.l0).showBeautySettingDialog((Long) aqS59S0201000_10.l1, aqS59S0201000_10.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS59S0201000_10 aqS59S0201000_10, Object it) {
        o.LJIIIZ(it, "it");
        C188727au vl = ((BaseI18nAuthorizedFragment) aqS59S0201000_10.l0).vl();
        vl.LIZLLL(aqS59S0201000_10.i2, "has_switch_account_button");
        vl.LJFF(((AuthorizedCheckResult) aqS59S0201000_10.l1).getResultCode(), "error_code");
        FMX.LJIIL("auth_error_got_it", vl.LIZ);
        BaseI18nAuthorizedFragment.Gl((BaseI18nAuthorizedFragment) aqS59S0201000_10.l0, OT1.LIZ(-1, OTS.SERVER_ERROR, null));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS59S0201000_10 aqS59S0201000_10, Object obj) {
        P2J p2j;
        EnumC58046MqI platform;
        C58080Mqq vmState = (C58080Mqq) obj;
        o.LJIIIZ(vmState, "vmState");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on ");
        LIZ.append((EnumC58046MqI) aqS59S0201000_10.l0);
        LIZ.append(" auth sync complete!");
        C221018lt.LJFF("[ffp]_RecFriends", X1D.LIZIZ(LIZ));
        List<InterfaceC57784Mm4> list = vmState.LJLJI;
        EnumC58046MqI enumC58046MqI = (EnumC58046MqI) aqS59S0201000_10.l0;
        int i = aqS59S0201000_10.i2;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (C8RL c8rl : list) {
            if ((c8rl instanceof P2J) && (platform = (p2j = (P2J) c8rl).LJLIL) == enumC58046MqI) {
                C57571Mid trackInfo = p2j.LJLJJI;
                o.LJIIIZ(platform, "platform");
                o.LJIIIZ(trackInfo, "trackInfo");
                c8rl = new P2J(platform, true, i, trackInfo);
            }
            arrayList.add(c8rl);
        }
        ((RecFriendsVM) aqS59S0201000_10.l1).setState(new AqS176S0100000_10(arrayList, (List<? extends User>) 66));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS59S0201000_10 aqS59S0201000_10, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        log.LJIJJ((MusicModel) aqS59S0201000_10.l0, ((N4N) ListProtector.get(((N4O) V1M.LIZLLL(((N5J) aqS59S0201000_10.l1).LJLJJI.LJLJI).getValue()).LJLIL, aqS59S0201000_10.i2)).LJLIL);
        N4D.LIZ.getClass();
        log.LJII(N4D.LJFF, Integer.valueOf(aqS59S0201000_10.i2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS59S0201000_10 aqS59S0201000_10, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        log.LJIJJ((Aweme) aqS59S0201000_10.l0, (MusicDetail) aqS59S0201000_10.l1);
        N4D.LIZ.getClass();
        log.LJII(N4D.LJFF, Integer.valueOf(aqS59S0201000_10.i2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS59S0201000_10 aqS59S0201000_10, Object obj) {
        C58620MzY log = (C58620MzY) obj;
        o.LJIIIZ(log, "$this$log");
        log.LJIJJ((Aweme) aqS59S0201000_10.l0, (MusicDetail) aqS59S0201000_10.l1);
        N4D.LIZ.getClass();
        log.LJII(N4D.LJFF, Integer.valueOf(aqS59S0201000_10.i2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0201000_10(int i, Aweme aweme, MusicDetail musicDetail, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = aweme;
        this.l1 = musicDetail;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0201000_10(EnumC58046MqI enumC58046MqI, RecFriendsVM recFriendsVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC58046MqI;
        this.l1 = recFriendsVM;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0201000_10(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, Long l, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiGuestV3GuestPresenter;
        this.l1 = l;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0201000_10(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, int i, AuthorizedCheckResult authorizedCheckResult, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baseI18nAuthorizedFragment;
        this.i2 = i;
        this.l1 = authorizedCheckResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS59S0201000_10(MusicModel musicModel, N5J n5j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = musicModel;
        this.l1 = n5j;
        this.i2 = i;
    }
}
