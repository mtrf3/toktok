package Y;

import X.C116144h8;
import X.C116484hg;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C23220ve;
import X.C242989gE;
import X.C26227ARb;
import X.C26335AVf;
import X.C26336AVg;
import X.C34K;
import X.C36922EeM;
import X.C38816FLg;
import X.C3C5;
import X.C40443Fu3;
import X.C47261Igj;
import X.C53035Krf;
import X.C53268KvQ;
import X.C55495LqF;
import X.C55888Lwa;
import X.C56599MJf;
import X.C56600MJg;
import X.C56601MJh;
import X.C56639MKt;
import X.C56706MNi;
import X.C56708MNk;
import X.C56757MPh;
import X.C57009MYz;
import X.C57051MaF;
import X.C57407Mfz;
import X.C57408Mg0;
import X.C57412Mg4;
import X.C62394OeE;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73040SlY;
import X.C73969T1h;
import X.C75792yF;
import X.C76800UCe;
import X.C78685UuP;
import X.C80796VnM;
import X.C86036Xpg;
import X.C86308Xu4;
import X.C86478Xwo;
import X.EnumC36206EIw;
import X.FMX;
import X.INB;
import X.InterfaceC55057LjB;
import X.InterfaceC55496LqG;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.L0U;
import X.LF2;
import X.LFR;
import X.LFS;
import X.LFT;
import X.LH7;
import X.LHH;
import X.LN0;
import X.LVB;
import X.LVK;
import X.M8L;
import X.ML5;
import X.ML6;
import X.RunnableC37609EpR;
import X.T16;
import X.UC0;
import X.X1D;
import X.YFM;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AppOpenedTimesData;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeDailyUsage;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.ui.TrendsTabFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class ACallableS112S0100000_9 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$31(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        return ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
    }

    public static final /* synthetic */ Object call$32(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        return ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
    }

    public static final /* synthetic */ Object call$36(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        return ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            case 28:
                return call$28(this);
            case 29:
                return call$29(this);
            case 30:
                return call$30(this);
            case 31:
                return call$31(this);
            case 32:
                return call$32(this);
            case 33:
                return call$33(this);
            case 34:
                return call$34(this);
            case 35:
                return call$35(this);
            case 36:
                return call$36(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C221018lt.LIZJ("PerfExt", "asyncCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C221018lt.LIZJ("PerfExt", "serialCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        AppLogNewUtils.onEventV3("push_first_frame", (JSONObject) aCallableS112S0100000_9.l0);
        return null;
    }

    public static final Object call$11(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        int i;
        C34K c34k = new C34K();
        JSONObject jSONObject = new JSONObject();
        C57009MYz c57009MYz = (C57009MYz) aCallableS112S0100000_9.l0;
        try {
            long j = c57009MYz.LIZJ - c57009MYz.LIZIZ;
            int i2 = 1;
            if (j < 0 || j > 600000) {
                c34k.element = true;
            }
            jSONObject.put("skylight_network_time", j);
            long j2 = c57009MYz.LIZLLL - c57009MYz.LIZ;
            if (j2 < 0 || j2 > 600000) {
                c34k.element = true;
            }
            jSONObject.put("total_data_time", j2);
            List<? extends InterfaceC57784Mm4> list = c57009MYz.LJ;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                    InterfaceC57784Mm4 interfaceC57784Mm42 = interfaceC57784Mm4;
                    if (!(interfaceC57784Mm42 instanceof C116144h8) || ((C116144h8) interfaceC57784Mm42).LJLILLLLZI) {
                        arrayList.add(interfaceC57784Mm4);
                    }
                }
                i = arrayList.size();
            } else {
                i = 0;
            }
            jSONObject.put("total_data_count", i);
            if (!c34k.element) {
                i2 = 0;
            }
            C3C5.m7constructorimpl(jSONObject.put("invalid_metrics", i2));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        FMX.LJIILJJIL("inbox_skylight_perf", jSONObject);
        ((C57009MYz) aCallableS112S0100000_9.l0).LJFF.set(0);
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        Integer num;
        int i;
        int i2;
        Activity activity = (Activity) aCallableS112S0100000_9.l0;
        o.LJIIIIZZ(activity, "activity");
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(((Activity) aCallableS112S0100000_9.l0).getString(R.string.iqc));
        Activity activity2 = (Activity) aCallableS112S0100000_9.l0;
        Object[] objArr = new Object[1];
        UserNightScreenTimeSettings LIZIZ = C86308Xu4.LIZIZ();
        Integer num2 = null;
        if (LIZIZ != null) {
            num = LIZIZ.getSleepTimeStartHour();
        } else {
            num = null;
        }
        UserNightScreenTimeSettings LIZIZ2 = C86308Xu4.LIZIZ();
        if (LIZIZ2 != null) {
            num2 = LIZIZ2.getSleepTimeStartMinute();
        }
        if (num != null) {
            i = num.intValue() * 60;
        } else {
            i = 0;
        }
        int i3 = i * 60;
        if (num2 != null) {
            i2 = num2.intValue() * 60;
        } else {
            i2 = 0;
        }
        int i4 = (i3 + i2) * 1000;
        objArr[0] = C86036Xpg.LIZ((new Date(i4).getTimezoneOffset() * 60000) + i4, "lt");
        c26227ARb.LIZIZ(activity2.getString(R.string.iqb, objArr));
        Activity activity3 = (Activity) aCallableS112S0100000_9.l0;
        o.LJIIIIZZ(activity3, "activity");
        C242989gE c242989gE = new C242989gE(activity3);
        Activity activity4 = (Activity) aCallableS112S0100000_9.l0;
        c242989gE.LIZJ();
        String string = activity4.getString(R.string.iqa);
        o.LJIIIIZZ(string, "activity.getString(R.str…rsleep_editreminder_link)");
        c242989gE.LIZLLL(string);
        c242989gE.LJ(new AqS175S0100000_9(activity4, 380));
        c26227ARb.LJIIJJI = c242989gE;
        UC0.LIZJ(c26227ARb, new AqS175S0100000_9((Activity) aCallableS112S0100000_9.l0, 381));
        Activity activity5 = (Activity) aCallableS112S0100000_9.l0;
        o.LJIIIIZZ(activity5, "activity");
        C78685UuP.LJIJJ(c26227ARb, C57408Mg0.LIZ(activity5, R.drawable.bat));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        int i;
        Integer LIZJ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) aCallableS112S0100000_9.l0, null)).LIZJ();
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public static final Object call$14(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(((TrendsTabFragment) aCallableS112S0100000_9.l0).getContext()), R.layout.an7, (ViewGroup) ((TrendsTabFragment) aCallableS112S0100000_9.l0)._$_findCachedViewById(R.id.fuc), false);
        TrendsTabFragment trendsTabFragment = (TrendsTabFragment) aCallableS112S0100000_9.l0;
        o.LJI(LLLLIILL);
        DiscoverBannerViewHolder discoverBannerViewHolder = new DiscoverBannerViewHolder(trendsTabFragment, LLLLIILL);
        Map<InterfaceC65350Pko<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map = ((TrendsTabFragment) aCallableS112S0100000_9.l0).LJLLJ;
        C65776Prg LIZ = C65352Pkq.LIZ(DiscoverBannerViewHolder.class);
        LinkedList linkedList = new LinkedList();
        linkedList.offer(discoverBannerViewHolder);
        map.put(LIZ, linkedList);
        TrendsTabFragment trendsTabFragment2 = (TrendsTabFragment) aCallableS112S0100000_9.l0;
        if (trendsTabFragment2.isViewValid()) {
            ((C56600MJg) trendsTabFragment2._$_findCachedViewById(R.id.at7)).setHeader(LLLLIILL);
        }
        TrendsTabFragment trendsTabFragment3 = (TrendsTabFragment) aCallableS112S0100000_9.l0;
        trendsTabFragment3.LJZ = discoverBannerViewHolder;
        if (trendsTabFragment3.LJZI == null) {
            trendsTabFragment3.LJZI = new C56601MJh(trendsTabFragment3.mo49getActivity(), ((TrendsTabFragment) aCallableS112S0100000_9.l0).LJZ);
        }
        int i = 0;
        do {
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(((TrendsTabFragment) aCallableS112S0100000_9.l0).getContext()), R.layout.an8, (ViewGroup) ((TrendsTabFragment) aCallableS112S0100000_9.l0)._$_findCachedViewById(R.id.fuc), false);
            o.LJI(LLLLIILL2);
            TrendingTopicViewHolder trendingTopicViewHolder = new TrendingTopicViewHolder(LLLLIILL2, (RecyclerView.RecycledViewPool) ((TrendsTabFragment) aCallableS112S0100000_9.l0).LJLLLLLL.getValue(), (TrendsTabFragment) aCallableS112S0100000_9.l0);
            TrendsTabFragment trendsTabFragment4 = (TrendsTabFragment) aCallableS112S0100000_9.l0;
            trendingTopicViewHolder.LJZ = new C56599MJf(trendsTabFragment4);
            if (((LinkedHashMap) trendsTabFragment4.LJLLJ).get(C65352Pkq.LIZ(TrendingTopicViewHolder.class)) == null) {
                Map<InterfaceC65350Pko<? extends RecyclerView.ViewHolder>, Queue<? extends RecyclerView.ViewHolder>> map2 = trendsTabFragment4.LJLLJ;
                C65776Prg LIZ2 = C65352Pkq.LIZ(TrendingTopicViewHolder.class);
                LinkedList linkedList2 = new LinkedList();
                linkedList2.offer(trendingTopicViewHolder);
                map2.put(LIZ2, linkedList2);
            } else {
                Queue queue = (Queue) ((LinkedHashMap) trendsTabFragment4.LJLLJ).get(C65352Pkq.LIZ(TrendingTopicViewHolder.class));
                if (queue != null) {
                    ((LinkedList) queue).offer(trendingTopicViewHolder);
                }
            }
            i++;
        } while (i < 8);
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            LVB.LIZLLL.storeString("keva_name_group_filter", C75792yF.LIZIZ().LJIILLIIL((List) aCallableS112S0100000_9.l0, new LVK().getType()));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C86478Xwo.LIZJ("Extends", "serialCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$17(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C86478Xwo.LIZJ("Extends", "asyncCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C86478Xwo.LIZJ("Extends", "mainCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$19(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        ((LHH) aCallableS112S0100000_9.l0).runColdStartTaskV2(false, EnumC36206EIw.LOGIN_SUCCESS);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            return ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C221018lt.LIZJ("PerfExt", "asyncCall error", th);
            return null;
        }
    }

    public static final Object call$20(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        return ((C62394OeE) aCallableS112S0100000_9.l0).LJ();
    }

    public static final Object call$21(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        C56706MNi c56706MNi = C56706MNi.LJI;
        boolean z = ((C56708MNk) aCallableS112S0100000_9.l0).LJLIL;
        if (c56706MNi.LJI()) {
            c56706MNi.LJ = "new_followers";
            C56706MNi.LJIIIZ = z;
        }
        MultiApiManager.API LIZ = MultiApiManager.LIZ();
        C56708MNk c56708MNk = (C56708MNk) aCallableS112S0100000_9.l0;
        return LIZ.fetchFollowPageData(c56708MNk.LJLIL, 1, 20, c56708MNk.LJLILLLLZI, c56708MNk.LJLJI, c56708MNk.LJLJJI, 21, C53268KvQ.LIZ()).LIZLLL();
    }

    public static final Object call$22(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        if (C57408Mg0.LIZLLL(System.currentTimeMillis())) {
            C57412Mg4.LIZIZ(3, C47261Igj.LJJIJIL(new ScreenTimeDailyUsage(C57408Mg0.LIZIZ(), 0, 600)), System.currentTimeMillis());
        } else {
            C57412Mg4.LIZIZ(3, C47261Igj.LJJIJIL(new ScreenTimeDailyUsage(C57408Mg0.LIZIZ(), 600, 0)), System.currentTimeMillis());
        }
        ((C57407Mfz) aCallableS112S0100000_9.l0).LJLIL.storeLong(C57408Mg0.LIZJ("start_time"), System.currentTimeMillis());
        ((C57407Mfz) aCallableS112S0100000_9.l0).LJLIL.storeLong(C57408Mg0.LIZJ("duration_time"), 0L);
        return null;
    }

    public static final Object call$23(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        TrendingTopicViewHolder trendingTopicViewHolder = (TrendingTopicViewHolder) aCallableS112S0100000_9.l0;
        trendingTopicViewHolder.withState((JediViewModel) trendingTopicViewHolder.LJZI.getValue(), new AqS175S0100000_9((TrendingTopicViewHolder) aCallableS112S0100000_9.l0, 457));
        return C76800UCe.LIZ;
    }

    public static final Object call$24(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C221018lt.LIZJ("PerfExt", "serialCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$25(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        ((LH7) aCallableS112S0100000_9.l0).runColdStartTaskV2(false, EnumC36206EIw.LOGIN_SUCCESS);
        return C76800UCe.LIZ;
    }

    public static final Object call$26(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        InterfaceC55496LqG interfaceC55496LqG = ((C55495LqF) aCallableS112S0100000_9.l0).LIZIZ;
        if (interfaceC55496LqG != null) {
            interfaceC55496LqG.LJJIIJZLJL();
            return null;
        }
        o.LJIJI("mainAdSceneCallBack");
        throw null;
    }

    public static final Object call$27(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        if (!LF2.LIZIZ((Activity) aCallableS112S0100000_9.l0)) {
            ((Activity) aCallableS112S0100000_9.l0).setRequestedOrientation(1);
        } else {
            ((Activity) aCallableS112S0100000_9.l0).setRequestedOrientation(13);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$28(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        LFR.LIZJ(((Activity) aCallableS112S0100000_9.l0).getResources().getConfiguration().orientation, (Activity) aCallableS112S0100000_9.l0, "on_create");
        if (LFT.LIZ == null) {
            C34K c34k = new C34K();
            c34k.element = true;
            CountDownTimer countDownTimer = new CountDownTimer(Long.MAX_VALUE, 60000L, new LFS(c34k));
            LFT.LIZ = countDownTimer;
            countDownTimer.start();
        }
        LFR.LIZ((Activity) aCallableS112S0100000_9.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$29(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        return Boolean.valueOf(((C56757MPh) aCallableS112S0100000_9.l0).LJIIJJI());
    }

    public static final Object call$3(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C221018lt.LIZJ("Extends", "mainCall error", th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$30(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        C73040SlY.LJII(((LN0) aCallableS112S0100000_9.l0).LJLILLLLZI, "personal_homepage", "click");
        C116484hg.LIZ("network_status", String.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()), "me_page_click");
        return null;
    }

    public static final Object call$33(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        JSONObject jSONObject = new JSONObject();
        C57051MaF c57051MaF = (C57051MaF) aCallableS112S0100000_9.l0;
        try {
            jSONObject.put("type", c57051MaF.LIZ);
            jSONObject.put("digg_type", c57051MaF.LIZIZ);
            jSONObject.put("group_type", c57051MaF.LIZJ);
            jSONObject.put("nid", c57051MaF.LIZLLL);
            jSONObject.put("cost", c57051MaF.LJIIIZ - c57051MaF.LJFF);
            jSONObject.put("api_cost", c57051MaF.LJIIIIZZ - c57051MaF.LJI);
            jSONObject.put("api_status", c57051MaF.LJII);
            jSONObject.put("log_id", c57051MaF.LJ);
            C3C5.m7constructorimpl(jSONObject.put("render_cost", c57051MaF.LJIIIZ - c57051MaF.LJIIIIZZ));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        FMX.LJIILJJIL("notice_enter_detail_perf", jSONObject);
        return C76800UCe.LIZ;
    }

    public static final Object call$34(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        if (InboxSampleRate.LIZ(1.0f, "inbox_enter_perf")) {
            C34K c34k = new C34K();
            ML5 ml5 = (ML5) aCallableS112S0100000_9.l0;
            long j = ml5.LIZIZ - ml5.LIZ;
            LIZ$0(j, c34k);
            ML5 ml52 = (ML5) aCallableS112S0100000_9.l0;
            long j2 = ml52.LJII - ml52.LIZ;
            LIZ$0(j2, c34k);
            ML5 ml53 = (ML5) aCallableS112S0100000_9.l0;
            long j3 = ml53.LJII - ml53.LJI;
            LIZ$0(j3, c34k);
            JSONObject jSONObject = new JSONObject();
            ML5 ml54 = (ML5) aCallableS112S0100000_9.l0;
            try {
                jSONObject.put("cost", j2);
                jSONObject.put("construct_cost", j);
                jSONObject.put("render_cost", j3);
                ml54.LIZJ.LIZ(jSONObject);
                ML6<Integer> ml6 = ml54.LJFF;
                if (ml6 != null) {
                    int i = 0;
                    String str = "";
                    if (ml6.LIZIZ != null) {
                        jSONObject.put("api_notice_status", 1);
                        String message = ml6.LIZIZ.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        jSONObject.put("api_notice_error", message);
                    } else {
                        jSONObject.put("api_notice_status", 0);
                    }
                    Integer num = ml6.LIZ;
                    if (num != null) {
                        i = num.intValue();
                    }
                    jSONObject.put("api_notice_count", i);
                    String str2 = ml6.LIZJ;
                    if (str2 != null) {
                        str = str2;
                    }
                    jSONObject.put("api_notice_log_id", str);
                }
                jSONObject.put("inbox_type", INB.LIZ());
                jSONObject.put("refactor_type", ((Number) L0U.LIZ.getValue()).intValue());
                jSONObject.put("perf_level", C55888Lwa.LIZIZ.LJIIJJI());
                C3C5.m7constructorimpl(jSONObject.put("invalid_metrics", c34k.element ? 1 : 0));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            FMX.LJIILJJIL("inbox_enter_perf", jSONObject);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$35(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        int i;
        if (InboxSampleRate.LIZ(1.0f, "inbox_enter_perf_v1")) {
            C34K c34k = new C34K();
            C56639MKt c56639MKt = (C56639MKt) aCallableS112S0100000_9.l0;
            long j = c56639MKt.LJIIJJI - c56639MKt.LIZ;
            LIZ$1(j, c34k);
            C56639MKt c56639MKt2 = (C56639MKt) aCallableS112S0100000_9.l0;
            long j2 = c56639MKt2.LIZIZ - c56639MKt2.LIZ;
            LIZ$1(j2, c34k);
            C56639MKt c56639MKt3 = (C56639MKt) aCallableS112S0100000_9.l0;
            long j3 = c56639MKt3.LJ - c56639MKt3.LIZLLL;
            LIZ$1(j3, c34k);
            C56639MKt c56639MKt4 = (C56639MKt) aCallableS112S0100000_9.l0;
            long j4 = c56639MKt4.LJI - c56639MKt4.LJFF;
            LIZ$1(j4, c34k);
            C56639MKt c56639MKt5 = (C56639MKt) aCallableS112S0100000_9.l0;
            long j5 = c56639MKt5.LJIIIIZZ - c56639MKt5.LJII;
            LIZ$1(j5, c34k);
            C56639MKt c56639MKt6 = (C56639MKt) aCallableS112S0100000_9.l0;
            long j6 = c56639MKt6.LJIIJ - c56639MKt6.LJIIIZ;
            LIZ$1(j6, c34k);
            JSONObject jSONObject = new JSONObject();
            C56639MKt c56639MKt7 = (C56639MKt) aCallableS112S0100000_9.l0;
            try {
                jSONObject.put("cost", j);
                jSONObject.put("construct_cost", j2);
                jSONObject.put("im_cost", j3);
                jSONObject.put("multi_cost", j4);
                jSONObject.put("recommend_cost", j5);
                jSONObject.put("contact_cost", j6);
                c56639MKt7.LIZJ.LIZ(jSONObject);
                if (c34k.element) {
                    i = 1;
                } else {
                    i = 0;
                }
                C3C5.m7constructorimpl(jSONObject.put("invalid_metrics", i));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            FMX.LJIILJJIL("inbox_enter_perf_v1", jSONObject);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        try {
            return ((InterfaceC65784Pro) aCallableS112S0100000_9.l0).invoke();
        } catch (Throwable th) {
            C221018lt.LIZJ("PerfExt", "serialCall error", th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$5(Y.ACallableS112S0100000_9 r5) {
        /*
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ad.comment.pitaya.CommentEmotionCheck r0 = (com.ss.android.ugc.aweme.ad.comment.pitaya.CommentEmotionCheck) r0
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto Ld
        La:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Ld:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ad.comment.pitaya.CommentEmotionCheck r0 = (com.ss.android.ugc.aweme.ad.comment.pitaya.CommentEmotionCheck) r0
            r0.getClass()
            int r0 = X.EF7.LJIIIZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.bytedance.pitaya.api.feature.FeatureCoreFactory r0 = com.bytedance.pitaya.api.feature.FeatureCoreFactory.INSTANCE
            com.bytedance.pitaya.api.feature.IFeatureCore r1 = r0.getFeatureCore(r1)
            if (r1 != 0) goto L23
            goto La
        L23:
            java.lang.String r0 = "tiktok_clientai_cloud_local_predict"
            com.bytedance.pitaya.api.feature.IKVStore r0 = r1.createInMemoryKVStore(r0)
            org.json.JSONObject r5 = r0.getKVData()
            r4 = 0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "app_m10n_client_ai_pitaya_download_settings"
            java.lang.Class<com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings$PitayaKeyNameModel> r0 = com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel.class
            java.lang.Object r0 = r2.LJIIIIZZ(r1, r0, r4)     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings$PitayaKeyNameModel r0 = (com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel) r0     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L43
            goto L45
        L3f:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L43:
            r0 = r4
            goto L47
        L45:
            java.util.List<java.lang.String> r0 = r0.keyNameList
        L47:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            if (r0 == 0) goto L6a
            java.util.Iterator r2 = r0.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r5 == 0) goto L68
            java.lang.Object r0 = r5.opt(r1)
        L64:
            r3.put(r1, r0)
            goto L52
        L68:
            r0 = r4
            goto L64
        L6a:
            com.bytedance.keva.Keva r2 = X.C55384LoS.LIZ
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "client_ai_download_json_str"
            r2.storeString(r0, r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS112S0100000_9.call$5(Y.ACallableS112S0100000_9):java.lang.Object");
    }

    public static final Object call$6(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        C57412Mg4.LIZIZ.uploadAppOpenedTimes((AppOpenedTimesData) aCallableS112S0100000_9.l0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS308S0100000_9((AppOpenedTimesData) aCallableS112S0100000_9.l0, 2));
        return C76800UCe.LIZ;
    }

    public static final Object call$7(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        InterfaceC55057LjB LIZ = C40443Fu3.LIZ(((FullFeedFragmentPanel) aCallableS112S0100000_9.l0).param.getEventType());
        C80796VnM c80796VnM = ((FullFeedFragmentPanel) aCallableS112S0100000_9.l0).mViewPager;
        if (c80796VnM != null) {
            c80796VnM.post(new ARunnableS28S0200000_9(aCallableS112S0100000_9, LIZ, 13));
            return null;
        }
        return null;
    }

    public static final Object call$8(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        List<Aweme> items;
        Long l;
        Long l2;
        FeedItemList feedItemList = (FeedItemList) aCallableS112S0100000_9.l0;
        Long l3 = null;
        if (feedItemList != null && (items = feedItemList.getItems()) != null) {
            for (Aweme aweme : items) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null && statistics.getDiggCount() > C53035Krf.LIZ() && statistics.getCommentCount() > C53035Krf.LIZ() && statistics.getCollectCount() == 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("illegal aweme: ");
                    LIZ.append(aweme.getAid());
                    LIZ.append(", collectCount: ");
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    if (statistics2 != null) {
                        l = Long.valueOf(statistics2.getCollectCount());
                    } else {
                        l = null;
                    }
                    LIZ.append(l);
                    LIZ.append(", diggCount: ");
                    AwemeStatistics statistics3 = aweme.getStatistics();
                    if (statistics3 != null) {
                        l2 = Long.valueOf(statistics3.getDiggCount());
                    } else {
                        l2 = null;
                    }
                    LIZ.append(l2);
                    LIZ.append(",  commentCount: ");
                    AwemeStatistics statistics4 = aweme.getStatistics();
                    if (statistics4 != null) {
                        l3 = Long.valueOf(statistics4.getCommentCount());
                    }
                    LIZ.append(l3);
                    M8L.LIZ(X1D.LIZIZ(LIZ));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS112S0100000_9 aCallableS112S0100000_9) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aCallableS112S0100000_9.l0;
        awemeListFragmentImpl.getClass();
        try {
            YFM.LIZIZ.checkToTransformMusDraft();
            C26336AVg Ll = AwemeListFragmentImpl.Ll();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" -> finish query draft info, draft count = ");
            LIZ.append(Ll.LIZ);
            C221018lt.LJFF("profile.AwemeListFragmentImpl.draftBox", X1D.LIZIZ(LIZ));
            int i = 1;
            if (!awemeListFragmentImpl.LLLIIIL && AVExternalServiceImpl.LIZ().draftService().enableAddDraftLossMonitor()) {
                awemeListFragmentImpl.LLLIIIL = true;
                C26335AVf.LJI(Ll, "query_draft_info_from_db");
            }
            C38816FLg.LIZJ(new RunnableC37609EpR(i, awemeListFragmentImpl, Ll));
            return null;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" -> query draft info error: ");
            LIZ2.append(th);
            C221018lt.LJFF("profile.AwemeListFragmentImpl.draftBox", X1D.LIZIZ(LIZ2));
            C36922EeM.LJFF(th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS112S0100000_9(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.$t = interfaceC65784Pro2;
        switch (interfaceC65784Pro2) {
            case null:
            case 1:
            case 3:
            case 4:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            case 18:
            case 24:
                this.l0 = interfaceC65784Pro;
                return;
            default:
                this.l0 = interfaceC65784Pro;
                return;
        }
    }

    public static final void LIZ$0(long j, C34K c34k) {
        if (j < 0 || j > 600000) {
            c34k.element = true;
        }
    }

    public static final void LIZ$1(long j, C34K c34k) {
        if (j < 0 || j > 600000) {
            c34k.element = true;
        }
    }

    public ACallableS112S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
