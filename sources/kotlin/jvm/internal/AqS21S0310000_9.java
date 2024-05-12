package kotlin.jvm.internal;

import X.ARH;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C188727au;
import X.C55783Lut;
import X.C56386MBa;
import X.C56424MCm;
import X.C56849MSv;
import X.C76800UCe;
import X.C78966Uyw;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LJJ;
import X.MB3;
import X.MT0;
import X.MTT;
import X.ORZ;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class AqS21S0310000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS21S0310000_9 aqS21S0310000_9, Object obj) {
        String str;
        String str2;
        boolean LJ;
        String str3;
        Map<String, String> map;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        C56386MBa it = (C56386MBa) obj;
        o.LJIIIZ(it, "it");
        String Xl = ((TrendingDetailPageFragment) aqS21S0310000_9.l0).Xl();
        boolean z = !aqS21S0310000_9.z3;
        Aweme aweme = (Aweme) aqS21S0310000_9.l1;
        Aweme aweme2 = (Aweme) aqS21S0310000_9.l2;
        TrendingDetailOperatorWrapper Yl = ((TrendingDetailPageFragment) aqS21S0310000_9.l0).Yl();
        Aweme aweme3 = (Aweme) aqS21S0310000_9.l1;
        Map<String, String> map2 = null;
        if (aweme3 != null) {
            str = aweme3.getTrendingId();
        } else {
            str = null;
        }
        Aweme aweme4 = (Aweme) aqS21S0310000_9.l1;
        if (aweme4 != null) {
            str2 = aweme4.getAid();
        } else {
            str2 = null;
        }
        if (!Yl.LJLJI.containsKey(str)) {
            LJ = false;
        } else {
            LJ = o.LJ(((LinkedHashMap) Yl.LJLJI).get(str), str2);
        }
        Boolean valueOf = Boolean.valueOf(LJ);
        TrendingEventModel trendingEventModel = (TrendingEventModel) ORZ.LLFII(it.LJLJJL);
        if (trendingEventModel != null) {
            str3 = trendingEventModel.getEventId();
        } else {
            str3 = null;
        }
        Boolean valueOf2 = Boolean.valueOf(o.LJ(str3, it.LJLILLLLZI.getEventId()));
        if (aweme != null && aweme2 != null) {
            AwemeTrendingBar trendingBarFYP = aweme.getTrendingBarFYP();
            if (trendingBarFYP != null) {
                map = trendingBarFYP.getTrackMap();
            } else {
                map = null;
            }
            AwemeTrendingBar trendingBarFYP2 = aweme2.getTrendingBarFYP();
            if (trendingBarFYP2 != null) {
                map2 = trendingBarFYP2.getTrackMap();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", MB3.LIZ);
            c188727au.LJIIIZ("trending_entrance", Xl);
            String aid = aweme.getAid();
            String str13 = "";
            if (aid == null) {
                aid = "";
            }
            c188727au.LJIIIZ("from_group_id", aid);
            c188727au.LJIIIZ("from_trending_topic", aweme.getTrendingName());
            String trendingId = aweme.getTrendingId();
            trendingId.toString();
            c188727au.LJIIIZ("from_trending_topic_id", trendingId);
            if (map == null || (str4 = map.get("trending_topic_source")) == null) {
                str4 = "";
            }
            c188727au.LJIIIZ("from_trending_topic_source", str4);
            if (C56424MCm.LIZ()) {
                if (map == null || (str11 = map.get("topic_rank")) == null) {
                    str11 = "";
                }
                c188727au.LJIIIZ("from_topic_rank", str11);
                if (map2 == null || (str12 = map2.get("topic_rank")) == null) {
                    str12 = "";
                }
                c188727au.LJI("to_topic_rank", str12);
            }
            if (map == null || (str5 = map.get("topic_group_rank")) == null) {
                str5 = "";
            }
            c188727au.LJIIIZ("from_topic_group_rank", str5);
            if (map == null || (str6 = map.get("topic_group_num")) == null) {
                str6 = "";
            }
            c188727au.LJIIIZ("from_topic_group_num", str6);
            c188727au.LJIIIZ("to_trending_topic", aweme2.getTrendingName());
            String trendingId2 = aweme2.getTrendingId();
            trendingId2.toString();
            c188727au.LJIIIZ("to_trending_topic_id", trendingId2);
            if (map2 == null || (str7 = map2.get("trending_topic_source")) == null) {
                str7 = "";
            }
            c188727au.LJIIIZ("to_trending_topic_source", str7);
            if (map2 == null || (str8 = map2.get("topic_group_rank")) == null) {
                str8 = "";
            }
            c188727au.LJIIIZ("to_topic_group_rank", str8);
            if (map2 != null && (str10 = map2.get("topic_group_num")) != null) {
                str13 = str10;
            }
            c188727au.LJIIIZ("to_topic_group_num", str13);
            Boolean bool = Boolean.TRUE;
            c188727au.LIZLLL(o.LJ(valueOf2, bool) ? 1 : 0, "is_end_topic");
            c188727au.LIZLLL(o.LJ(valueOf, bool) ? 1 : 0, "is_end_group");
            if (z) {
                str9 = "trending_inflow_slide_down";
            } else {
                str9 = "trending_inflow_slide_up";
            }
            FMX.LJIIL(str9, c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS21S0310000_9 aqS21S0310000_9, Object obj) {
        int i;
        int i2;
        PrivacyUserSettingsV2 privacyUserSettings;
        Integer M;
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        LJJ LJI = ((C55783Lut) aqS21S0310000_9.l0).LJI();
        User user = (User) aqS21S0310000_9.l1;
        boolean z = aqS21S0310000_9.z3;
        LJI.getClass();
        o.LJIIIZ(user, "user");
        if (user.getFollowerStatus() == 1) {
            if (z) {
                i = LJI.LJIIIIZZ;
            } else {
                i = LJI.LJIIIZ;
            }
        } else if (z) {
            i = LJI.LJI;
        } else {
            i = LJI.LJII;
        }
        buttonGroup.LJ(i, new AqS140S0200000_9((C55783Lut) aqS21S0310000_9.l0, (Aweme) aqS21S0310000_9.l2, 46));
        LJJ LJI2 = ((C55783Lut) aqS21S0310000_9.l0).LJI();
        boolean z2 = aqS21S0310000_9.z3;
        LJI2.getClass();
        if (z2 && !C78966Uyw.LJJIJ().LIZIZ() && ((privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("direct_message")) == null || M.intValue() != 3)) {
            i2 = R.string.gzi;
        } else {
            i2 = R.string.hj6;
        }
        buttonGroup.LJI(i2, new AqS140S0200000_9((C55783Lut) aqS21S0310000_9.l0, (Aweme) aqS21S0310000_9.l2, 47));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS21S0310000_9 aqS21S0310000_9, Object obj) {
        MT0 setState = (MT0) obj;
        o.LJIIIZ(setState, "$this$setState");
        AbstractC72932td abstractC72932td = (AbstractC72932td) aqS21S0310000_9.l0;
        MTT mtt = (MTT) aqS21S0310000_9.l1;
        C56849MSv c56849MSv = (C56849MSv) aqS21S0310000_9.l2;
        C56849MSv c56849MSv2 = null;
        if (c56849MSv != null) {
            c56849MSv2 = C56849MSv.L(c56849MSv, true, null, aqS21S0310000_9.z3, 2);
        }
        return MT0.LIZ(setState, null, null, null, null, null, abstractC72932td, mtt, false, false, c56849MSv2, 927);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS21S0310000_9(AbstractC72932td abstractC72932td, AbstractC72932td<? extends List<? extends MusNotice>> abstractC72932td2, MTT mtt, C56849MSv c56849MSv, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = abstractC72932td;
        this.l1 = abstractC72932td2;
        this.l2 = mtt;
        this.z3 = c56849MSv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S0310000_9(C55783Lut c55783Lut, User user, boolean z, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = c55783Lut;
        this.l1 = user;
        this.z3 = z;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S0310000_9(TrendingDetailPageFragment trendingDetailPageFragment, boolean z, Aweme aweme, Aweme aweme2, int i) {
        super(1);
        this.$t = i;
        this.l0 = trendingDetailPageFragment;
        this.z3 = z;
        this.l1 = aweme;
        this.l2 = aweme2;
    }
}
