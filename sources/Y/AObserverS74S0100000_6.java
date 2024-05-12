package Y;

import X.AbstractC029409q;
import X.AbstractC73391SrD;
import X.ActivityC45651qj;
import X.C1B3;
import X.C35874E6c;
import X.C37243EjX;
import X.C38350F3i;
import X.C38995FSd;
import X.C40736Fym;
import X.C40739Fyp;
import X.C40741Fyr;
import X.C40751Fz1;
import X.C45828Hyi;
import X.C47261Igj;
import X.C56616MJw;
import X.C73305Spp;
import X.C73454SsE;
import X.C76800UCe;
import X.C8HS;
import X.DJQ;
import X.E4A;
import X.E4B;
import X.E4G;
import X.E4M;
import X.E4Y;
import X.E5L;
import X.E5M;
import X.E5O;
import X.EnumC35839E4t;
import X.G15;
import X.G2U;
import X.InterfaceC79713Ax;
import X.InterfaceC88472Yns;
import X.O6R;
import X.T16;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.ConsistentContentAndAdChoiceFragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.experiments.UnLoginDiggExperiment2022;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment;
import com.ss.android.ugc.aweme.legoImp.task.observer_task.CohortSubscriptionObserver;
import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponseData;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.OnboardingFlowData;
import com.ss.android.ugc.aweme.plugin.realtimecohorts.CohortSubscribeData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AObserverS74S0100000_6 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            default:
                return;
        }
    }

    public AObserverS74S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        Integer num;
        String str;
        IPluginService.PreviousLoginData previousLoginData;
        List<IPluginService.ABExperimentNode> list;
        IPluginService.ABExperimentNode aBExperimentNode;
        IPluginService.PreviousLoginData previousLoginData2;
        List<IPluginService.PreviousLoginNode> list2;
        IPluginService.PreviousLoginNode previousLoginNode;
        IPluginService.PreviousLoginData previousLoginData3;
        List<IPluginService.PreviousLoginNode> list3;
        IPluginService.PreviousLoginNode previousLoginNode2;
        E4G e4g = (E4G) obj;
        IPluginService.PluginDataWrapper value = e4g.getValue();
        String str2 = null;
        if (value != null && (previousLoginData3 = value.previousLoginData) != null && (list3 = previousLoginData3.previousLoginNodes) != null && (previousLoginNode2 = (IPluginService.PreviousLoginNode) ListProtector.get(list3, 0)) != null) {
            num = previousLoginNode2.method;
        } else {
            num = null;
        }
        IPluginService.PluginDataWrapper value2 = e4g.getValue();
        if (value2 != null && (previousLoginData2 = value2.previousLoginData) != null && (list2 = previousLoginData2.previousLoginNodes) != null && (previousLoginNode = (IPluginService.PreviousLoginNode) ListProtector.get(list2, 0)) != null) {
            str = previousLoginNode.detail;
        } else {
            str = null;
        }
        IPluginService.PluginDataWrapper value3 = e4g.getValue();
        if (value3 != null && (previousLoginData = value3.previousLoginData) != null && (list = previousLoginData.abExperimentNodes) != null && (aBExperimentNode = (IPluginService.ABExperimentNode) ListProtector.get(list, 0)) != null) {
            str2 = aBExperimentNode.abGroup;
        }
        PrevLoginPlatformService.LJIIL().LJIIJ(num, str2, str);
        InterfaceC79713Ax interfaceC79713Ax = ((E4M) aObserverS74S0100000_6.l0).LIZ;
        if (interfaceC79713Ax != null) {
            interfaceC79713Ax.onComplete();
        }
    }

    public static final void onChanged$1(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        List<IPluginService.SpKvItem> list;
        int i;
        int i2;
        for (E4G e4g : (List) obj) {
            if (!UnLoginDiggExperiment2022.LIZLLL && (value = e4g.getValue()) != null && (simplePluginData = value.simplePluginData) != null && (list = simplePluginData.kvList) != null) {
                ((E4A) aObserverS74S0100000_6.l0).getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (IPluginService.SpKvItem spKvItem : list) {
                    if (spKvItem != null) {
                        String str = spKvItem.stringValue;
                        if (str != null) {
                            linkedHashMap.put(spKvItem.key, str);
                        }
                        String str2 = spKvItem.boolValue;
                        if (str2 != null) {
                            linkedHashMap.put(spKvItem.key, str2);
                        }
                        String str3 = spKvItem.intValue;
                        if (str3 != null) {
                            linkedHashMap.put(spKvItem.key, str3);
                        }
                    }
                }
                String valueOf = String.valueOf(simplePluginData.abGroup);
                if (valueOf == null) {
                    valueOf = "";
                }
                linkedHashMap.put("ab_group", valueOf);
                String str4 = (String) linkedHashMap.get("ab_group");
                if (str4 != null) {
                    i = CastIntegerProtector.parseInt(str4);
                } else {
                    i = -1;
                }
                int i3 = 0;
                String str5 = (String) linkedHashMap.get("precise_exp_vid");
                if (str5 == null) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                String str6 = (String) linkedHashMap.get("active_days");
                if (str6 != null) {
                    i2 = CastIntegerProtector.parseInt(str6);
                } else {
                    i2 = -1;
                }
                UnLoginDiggExperiment2022.UnLoginDiggExperimentModel unLoginDiggExperimentModel = new UnLoginDiggExperiment2022.UnLoginDiggExperimentModel(i, i3, i3, i3, str5, i3, i3, i2, 0L, 366, null);
                UnLoginDiggExperiment2022.LIZJ = unLoginDiggExperimentModel;
                C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(unLoginDiggExperimentModel, 83));
            }
        }
        InterfaceC79713Ax interfaceC79713Ax = ((E4A) aObserverS74S0100000_6.l0).LIZ;
        if (interfaceC79713Ax != null) {
            interfaceC79713Ax.onComplete();
        }
    }

    public static final void onChanged$10(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        String str;
        E5L e5l = (E5L) obj;
        C35874E6c c35874E6c = (C35874E6c) aObserverS74S0100000_6.l0;
        if (e5l == null || E5M.LIZ[e5l.ordinal()] != 1) {
            str = "Hybrid AB request failure";
        } else {
            str = "Hybrid AB request success";
        }
        c35874E6c.LJII(str);
    }

    public static final void onChanged$11(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        OnboardingFlowData onboardingFlowData;
        IPluginService.PluginDataWrapper value = ((E4G) obj).getValue();
        if (value != null && (onboardingFlowData = value.onboardingFlowData) != null) {
            C40736Fym c40736Fym = (C40736Fym) aObserverS74S0100000_6.l0;
            c40736Fym.LIZIZ = onboardingFlowData;
            InterfaceC88472Yns<? super NewUserJourneyStep, C76800UCe> interfaceC88472Yns = c40736Fym.LIZJ;
            if (interfaceC88472Yns != null) {
                NewUserJourneyStep newUserJourneyStep = c40736Fym.LIZLLL;
                if (newUserJourneyStep != null) {
                    interfaceC88472Yns.invoke(newUserJourneyStep);
                }
                c40736Fym.LIZJ = null;
            }
            c40736Fym.LJ = true;
            InterfaceC79713Ax interfaceC79713Ax = c40736Fym.LIZ;
            if (interfaceC79713Ax != null) {
                interfaceC79713Ax.onComplete();
            }
        }
    }

    public static final void onChanged$12(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        G15 g15;
        Boolean isSwitch = (Boolean) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observeSwitchFramework isSwitch:");
        LIZ.append(isSwitch);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(isSwitch, "isSwitch");
        if (isSwitch.booleanValue() && (g15 = C40751Fz1.LIZ) != null) {
            g15.LIZLLL((C40739Fyp) aObserverS74S0100000_6.l0);
        }
    }

    public static final void onChanged$13(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        int LJJIIZ;
        Float f = (Float) obj;
        DJQ djq = ((C37243EjX) aObserverS74S0100000_6.l0).LJLJJLL;
        if (djq != null) {
            double floatValue = f.floatValue();
            if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= floatValue && floatValue <= 1.0d) {
                float floatValue2 = f.floatValue();
                if (Build.VERSION.SDK_INT >= 26) {
                    LJJIIZ = djq.getMin() + O6R.LJJIIZ((djq.getMax() - djq.getMin()) * floatValue2);
                } else {
                    LJJIIZ = O6R.LJJIIZ(djq.getMax() * floatValue2);
                }
                djq.setProgress(LJJIIZ);
            }
        }
    }

    public static final void onChanged$14(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        DJQ djq;
        E4Y e4y = (E4Y) obj;
        if (e4y == null) {
            return;
        }
        int i = E4B.LIZ[e4y.ordinal()];
        if (i != 1) {
            if (i != 2 || (djq = ((C37243EjX) aObserverS74S0100000_6.l0).LJLJJLL) == null) {
                return;
            }
            djq.setVisibility(0);
            return;
        }
        DJQ djq2 = ((C37243EjX) aObserverS74S0100000_6.l0).LJLJJLL;
        if (djq2 == null) {
            return;
        }
        djq2.setVisibility(8);
    }

    public static final void onChanged$15(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        Boolean bool;
        List list = (List) obj;
        Observer observer = (Observer) aObserverS74S0100000_6.l0;
        if (list != null) {
            bool = Boolean.valueOf(list.isEmpty());
        } else {
            bool = null;
        }
        observer.onChanged(bool);
    }

    public static final void onChanged$16(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        IPluginService createIPluginServicebyMonsterPlugin;
        List<E4G> currentPluginList;
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        if (obj == E5L.REQUEST_SUCCESS && (createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false)) != null && (currentPluginList = createIPluginServicebyMonsterPlugin.getCurrentPluginList()) != null) {
            Iterator<E4G> it = currentPluginList.iterator();
            while (true) {
                if (it.hasNext()) {
                    e4g = it.next();
                    if (e4g.getType() == EnumC35839E4t.UB_TRACKING_CONFIG) {
                        break;
                    }
                } else {
                    e4g = null;
                    break;
                }
            }
            E4G e4g2 = e4g;
            if (e4g2 != null && (value = e4g2.getValue()) != null && (simplePluginData = value.simplePluginData) != null && simplePluginData.abGroup == 1) {
                G2U.LIZ(new E5O(true, AwemeConfigCenter.LIZIZ(), C47261Igj.LJII("/passport/"), 8), (Context) aObserverS74S0100000_6.l0);
            }
        }
        InterfaceC79713Ax interfaceC79713Ax = G2U.LIZ;
        if (interfaceC79713Ax != null) {
            interfaceC79713Ax.onComplete();
        }
    }

    public static final void onChanged$2(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        ScanCommonResponse scanCommonResponse = (ScanCommonResponse) obj;
        if (scanCommonResponse != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS74S0100000_6.l0;
            if (TextUtils.equals("success", scanCommonResponse.message)) {
                ActivityC45651qj mo49getActivity = baseI18nAuthorizedFragment.mo49getActivity();
                if (mo49getActivity != null) {
                    mo49getActivity.finish();
                    return;
                }
                return;
            }
            String string = baseI18nAuthorizedFragment.requireActivity().getString(R.string.ima);
            o.LJIIIIZZ(string, "requireActivity().getStr…tring.network_error_code)");
            baseI18nAuthorizedFragment.Hl(string);
        }
    }

    public static final void onChanged$3(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        String str;
        int i;
        String str2;
        String str3;
        Integer LJJIL;
        BCAuthorizationResponse bCAuthorizationResponse = (BCAuthorizationResponse) obj;
        if (bCAuthorizationResponse != null) {
            BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) aObserverS74S0100000_6.l0;
            BCAuthorizationResponseData bCAuthorizationResponseData = bCAuthorizationResponse.data;
            String str4 = null;
            if (bCAuthorizationResponseData != null) {
                str = bCAuthorizationResponseData.redirectUrl;
            } else {
                str = null;
            }
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "errorCode");
            if (queryParameter != null && (LJJIL = C38350F3i.LJJIL(queryParameter)) != null) {
                i = LJJIL.intValue();
            } else {
                i = C45828Hyi.LJFF.LIZ;
            }
            BCAuthorizationResponseData bCAuthorizationResponseData2 = bCAuthorizationResponse.data;
            if (bCAuthorizationResponseData2 != null) {
                str2 = bCAuthorizationResponseData2.redirectUrl;
            } else {
                str2 = null;
            }
            baseI18nAuthorizedFragment.Ll(i, String.valueOf(UriProtector.getQueryParameter(UriProtector.parse(str2), "description")), TextUtils.equals("success", bCAuthorizationResponse.message));
            if (TextUtils.equals("success", bCAuthorizationResponse.message)) {
                ActivityC45651qj mo49getActivity = baseI18nAuthorizedFragment.mo49getActivity();
                if (mo49getActivity != null) {
                    mo49getActivity.finish();
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(baseI18nAuthorizedFragment.getContext(), "aweme://webview");
                BCAuthorizationResponseData bCAuthorizationResponseData3 = bCAuthorizationResponse.data;
                if (bCAuthorizationResponseData3 != null) {
                    str4 = bCAuthorizationResponseData3.redirectUrl;
                }
                buildRoute.withParam(UriProtector.parse(str4));
                buildRoute.withParam("hide_nav_bar", true);
                buildRoute.open();
                return;
            }
            BCAuthorizationResponseData bCAuthorizationResponseData4 = bCAuthorizationResponse.data;
            if (bCAuthorizationResponseData4 == null || (str3 = bCAuthorizationResponseData4.description) == null) {
                str3 = "error";
            }
            baseI18nAuthorizedFragment.Hl(str3);
        }
    }

    public static final void onChanged$4(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        CohortSubscribeData cohortSubscribeData;
        String str;
        String str2;
        for (E4G e4g : (List) obj) {
            IPluginService.PluginDataWrapper value = e4g.getValue();
            if (value != null && (cohortSubscribeData = value.cohortSubscribeData) != null && (str = cohortSubscribeData.path) != null && (str2 = cohortSubscribeData.queryString) != null) {
                String valueOf = String.valueOf(e4g.LIZ());
                if (!((Keva) ((CohortSubscriptionObserver) aObserverS74S0100000_6.l0).LIZIZ.getValue()).getBoolean(valueOf, false)) {
                    ((Keva) ((CohortSubscriptionObserver) aObserverS74S0100000_6.l0).LIZIZ.getValue()).storeBoolean(valueOf, true);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    CohortSubscriptionObserver.CohortSubscriptionApi cohortSubscriptionApi = (CohortSubscriptionObserver.CohortSubscriptionApi) ((CohortSubscriptionObserver) aObserverS74S0100000_6.l0).LIZJ.getValue();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(str2);
                    C73454SsE LJJJ = cohortSubscriptionApi.request(X1D.LIZIZ(LIZ)).LJJL(T16.LIZ()).LJJJ(T16.LIZ());
                    CohortSubscriptionObserver cohortSubscriptionObserver = (CohortSubscriptionObserver) aObserverS74S0100000_6.l0;
                    LJJJ.LJJJLIIL(new AfS1S2100100_6(elapsedRealtime, str2, str, cohortSubscriptionObserver, 0), new AfS1S2100100_6(elapsedRealtime, str2, str, cohortSubscriptionObserver, 1));
                }
            }
        }
    }

    public static final void onChanged$5(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        ((AbstractC73391SrD) aObserverS74S0100000_6.l0).onNext(obj);
    }

    public static final void onChanged$6(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        AbstractC029409q abstractC029409q;
        List list = (List) obj;
        RecyclerView recyclerView = ((KidsAwemeGridFragment) aObserverS74S0100000_6.l0).LJLIL;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        o.LJII(abstractC029409q, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridAdapter");
        ((C8HS) abstractC029409q).setData(list);
        if (list.isEmpty()) {
            ((KidsAwemeGridFragment) aObserverS74S0100000_6.l0).Dl();
        }
    }

    public static final void onChanged$7(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 0) {
                C73305Spp c73305Spp = ((KidsAwemeGridFragment) aObserverS74S0100000_6.l0).LJLJJLL;
                if (c73305Spp == null) {
                    return;
                }
                c73305Spp.setVisibility(8);
                return;
            }
            if (num.intValue() == -2) {
                ((KidsAwemeGridFragment) aObserverS74S0100000_6.l0).Gl();
                return;
            }
        }
        ((KidsAwemeGridFragment) aObserverS74S0100000_6.l0).Dl();
    }

    public static final void onChanged$8(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 0) {
                C56616MJw c56616MJw = ((KidsAwemeGridFragment) aObserverS74S0100000_6.l0).LJLJJL;
                if (c56616MJw == null) {
                    return;
                }
                c56616MJw.resetLoadMoreState();
                return;
            }
            if (num.intValue() == -2) {
                KidsAwemeGridFragment kidsAwemeGridFragment = (KidsAwemeGridFragment) aObserverS74S0100000_6.l0;
                C56616MJw c56616MJw2 = kidsAwemeGridFragment.LJLJJL;
                if (c56616MJw2 == null) {
                    return;
                }
                c56616MJw2.showPullUpLoadMore(kidsAwemeGridFragment.LJLIL, false);
                return;
            }
        }
        KidsAwemeGridFragment kidsAwemeGridFragment2 = (KidsAwemeGridFragment) aObserverS74S0100000_6.l0;
        C56616MJw c56616MJw3 = kidsAwemeGridFragment2.LJLJJL;
        if (c56616MJw3 != null) {
            c56616MJw3.showLoadMoreEmpty();
        }
        kidsAwemeGridFragment2.Al();
    }

    public static final void onChanged$9(AObserverS74S0100000_6 aObserverS74S0100000_6, Object obj) {
        FragmentManager supportFragmentManager = ((ConsistentContentAndAdChoiceFragment) aObserverS74S0100000_6.l0).requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ((Fragment) ((ConsistentContentAndAdChoiceFragment) aObserverS74S0100000_6.l0).LJLL.getValue(), "customizeYourExperience", R.id.j71);
        c1b3.LJI();
    }
}
