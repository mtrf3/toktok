package kotlin.jvm.internal;

import X.AbstractC225698tR;
import X.AbstractC65781Prl;
import X.C26045AKb;
import X.C27943Axv;
import X.C32151Nz;
import X.C53438KyA;
import X.C53439KyB;
import X.C53447KyJ;
import X.C53471Kyh;
import X.C53527Kzb;
import X.C56045Lz7;
import X.C56090Lzq;
import X.C57820Mme;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C87277YNd;
import X.InterfaceC88472Yns;
import X.LLY;
import X.O6R;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes10.dex */
public class AqS52S0110000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        LLY forEachObserver = (LLY) obj;
        o.LJIIIZ(forEachObserver, "$this$forEachObserver");
        forEachObserver.s0((AbstractC225698tR) aqS52S0110000_9.l0, aqS52S0110000_9.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        LLY forEachObserver = (LLY) obj;
        o.LJIIIZ(forEachObserver, "$this$forEachObserver");
        forEachObserver.x9((AbstractC225698tR) aqS52S0110000_9.l0, aqS52S0110000_9.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS52S0110000_9 aqS52S0110000_9, Object state) {
        o.LJIIIZ(state, "state");
        if (aqS52S0110000_9.z1) {
            TrendsTabFragment trendsTabFragment = (TrendsTabFragment) aqS52S0110000_9.l0;
            trendsTabFragment.LJLLL = true;
            trendsTabFragment.LJLLLL = false;
            ((C73305Spp) trendsTabFragment._$_findCachedViewById(R.id.kf_)).setVisibility(8);
        } else {
            C26045AKb c26045AKb = new C26045AKb((TrendsTabFragment) aqS52S0110000_9.l0);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            TrendsTabFragment trendsTabFragment2 = (TrendsTabFragment) aqS52S0110000_9.l0;
            if (!trendsTabFragment2.LJLLL) {
                C73305Spp c73305Spp = (C73305Spp) trendsTabFragment2._$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new AqS159S0100000_9((TrendsTabFragment) aqS52S0110000_9.l0, 95));
                c73305Spp.setStatus(c73306Spq);
                TrendsTabFragment trendsTabFragment3 = (TrendsTabFragment) aqS52S0110000_9.l0;
                trendsTabFragment3.LJLLLL = false;
                ((C73305Spp) trendsTabFragment3._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS52S0110000_9 aqS52S0110000_9, Object it) {
        o.LJIIIZ(it, "it");
        if (aqS52S0110000_9.z1) {
            C57820Mme.LIZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), (RelationButton) aqS52S0110000_9.l0);
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$4(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        UserStoryCurrentInfo userStoryCurrentInfo;
        UserStory updateMineUserStory = (UserStory) obj;
        o.LJIIIZ(updateMineUserStory, "$this$updateMineUserStory");
        if (aqS52S0110000_9.z1) {
            UserStoryCurrentInfo userStoryCurrentInfo2 = (UserStoryCurrentInfo) aqS52S0110000_9.l0;
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(userStoryCurrentInfo2, null, null, userStoryCurrentInfo2.getDispatchCode() + 1, 3, null);
        } else {
            userStoryCurrentInfo = (UserStoryCurrentInfo) aqS52S0110000_9.l0;
        }
        return UserStory.copy$default(updateMineUserStory, null, 0L, 0L, false, 0L, 0L, false, false, 0L, false, null, false, 0L, userStoryCurrentInfo, false, false, null, 0, false, 516095, null);
    }

    public static final Object invoke$5(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        Object obj2;
        Object obj3;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LIZLLL("page_name", "mall");
        boolean LIZ = C56090Lzq.LIZ();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!LIZ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_first_install_launch", obj2);
        if (!C56090Lzq.LIZIZ()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        sendLog.LIZLLL("is_first_show_mall", obj3);
        if (aqS52S0110000_9.z1) {
            str = "1";
        }
        sendLog.LIZLLL("is_available", str);
        Map map = (Map) aqS52S0110000_9.l0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                sendLog.LIZLLL((String) entry.getKey(), entry.getValue());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        C53447KyJ avatarSize = (C53447KyJ) obj;
        o.LJIIIZ(avatarSize, "avatarSize");
        int i = -C87277YNd.LJII(avatarSize.LJLIL);
        C53471Kyh c53471Kyh = (C53471Kyh) aqS52S0110000_9.l0;
        boolean z = aqS52S0110000_9.z1;
        c53471Kyh.getClass();
        int LJI = i - C53471Kyh.LJI(z);
        C53471Kyh c53471Kyh2 = (C53471Kyh) aqS52S0110000_9.l0;
        boolean z2 = aqS52S0110000_9.z1;
        c53471Kyh2.getClass();
        return new C53527Kzb(LJI, -C53471Kyh.LJI(z2), 10);
    }

    public static final Object invoke$7(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        C53447KyJ sizeData = (C53447KyJ) obj;
        o.LJIIIZ(sizeData, "sizeData");
        float LJIIL = C87277YNd.LJIIL(sizeData.LJLIL);
        C53471Kyh c53471Kyh = (C53471Kyh) aqS52S0110000_9.l0;
        boolean z = aqS52S0110000_9.z1;
        c53471Kyh.getClass();
        return Float.valueOf(LJIIL + C53471Kyh.LJI(z));
    }

    public static final Object invoke$8(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        C53447KyJ sizeData = (C53447KyJ) obj;
        o.LJIIIZ(sizeData, "sizeData");
        float LJIIL = C87277YNd.LJIIL(sizeData.LJLIL);
        C53471Kyh c53471Kyh = (C53471Kyh) aqS52S0110000_9.l0;
        boolean z = aqS52S0110000_9.z1;
        c53471Kyh.getClass();
        return Float.valueOf(LJIIL + C53471Kyh.LJI(z));
    }

    public static final Object invoke$9(AqS52S0110000_9 aqS52S0110000_9, Object obj) {
        float f;
        int intValue = ((Number) obj).intValue();
        if (intValue <= C53439KyB.LJIIL) {
            f = 0.0f;
        } else if (intValue <= C53439KyB.LJIIJ) {
            f = C53438KyA.LJ;
        } else if (intValue <= C53439KyB.LJIIIIZZ) {
            f = C53438KyA.LIZLLL;
        } else if (intValue <= C53439KyB.LJII) {
            f = C53438KyA.LIZJ;
        } else if (intValue <= C53439KyB.LIZLLL) {
            f = C53438KyA.LIZIZ;
        } else {
            f = C53438KyA.LIZ;
        }
        C53471Kyh c53471Kyh = (C53471Kyh) aqS52S0110000_9.l0;
        boolean z = aqS52S0110000_9.z1;
        c53471Kyh.getClass();
        return Float.valueOf(f - C53471Kyh.LJI(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0110000_9(AbstractC225698tR abstractC225698tR, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC225698tR;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0110000_9(C53471Kyh c53471Kyh, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c53471Kyh;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0110000_9(boolean z, TrendsTabFragment trendsTabFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = trendsTabFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0110000_9(boolean z, UserStoryCurrentInfo userStoryCurrentInfo, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = userStoryCurrentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S0110000_9(boolean z, RelationButton relationButton, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = relationButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS52S0110000_9(boolean z, boolean z2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.z1 = z;
        this.l0 = z2;
    }
}
