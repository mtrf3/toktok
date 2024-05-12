package Y;

import X.B9K;
import X.C03150Al;
import X.C03200Aq;
import X.C05170If;
import X.C0NE;
import X.C15620jO;
import X.C16880lQ;
import X.C28733BPl;
import X.C29494Bhq;
import X.C29504Bi0;
import X.C2A7;
import X.C31415CUp;
import X.C31512CYi;
import X.C31522CYs;
import X.C31526CYw;
import X.C31665Cbl;
import X.C3KP;
import X.C47121t6;
import X.C51029K0z;
import X.C61101NyT;
import X.C65777Prh;
import X.C75883TqJ;
import X.C76244Tw8;
import X.C76534U1y;
import X.C77150UPq;
import X.C77957Uif;
import X.C77959Uih;
import X.C78000UjM;
import X.C78020Ujg;
import X.C78021Ujh;
import X.C78934UyQ;
import X.C83146WkA;
import X.C8E;
import X.CFU;
import X.CXJ;
import X.EnumC31059CGx;
import X.InterfaceC73573Su9;
import X.InterfaceC77978Uj0;
import X.JBR;
import X.OA0;
import X.RunnableC31065CHd;
import X.V3N;
import X.X1D;
import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchBeInvitedFragmentV2;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchInviteFragmentV2;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkFollowAndApplyDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AObserverS76S0200000_13 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onChanged$0(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        C78021Ujh c78021Ujh = (C78021Ujh) obj;
        if (c78021Ujh != null && o.LJ(c78021Ujh.LIZ.LIZIZ, ((RankPageController) aObserverS76S0200000_13.l0).LJIIJ().LJLLL)) {
            ((InterfaceC77978Uj0) aObserverS76S0200000_13.l1).Cj(c78021Ujh);
        }
    }

    public static final void onChanged$1(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        C78020Ujg c78020Ujg = (C78020Ujg) obj;
        if (c78020Ujg != null && o.LJ(c78020Ujg.LIZ.LIZIZ, ((RankPageController) aObserverS76S0200000_13.l0).LJIIJ().LJLLL)) {
            ((InterfaceC77978Uj0) aObserverS76S0200000_13.l1).sb(c78020Ujg);
        }
    }

    public static final void onChanged$10(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        ((MultiMatchBeInvitedFragmentV2) aObserverS76S0200000_13.l0).Gl((List) obj, ((C76244Tw8) aObserverS76S0200000_13.l1).LJI.getValue());
    }

    public static final void onChanged$11(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        ((MultiMatchBeInvitedFragmentV2) aObserverS76S0200000_13.l0).Dl((List) obj, ((C76244Tw8) aObserverS76S0200000_13.l1).LJI.getValue());
    }

    public static final void onChanged$12(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        Map<Long, Boolean> map = (Map) obj;
        ((MultiMatchBeInvitedFragmentV2) aObserverS76S0200000_13.l0).Dl(((C76244Tw8) aObserverS76S0200000_13.l1).LJFF.getValue(), map);
        ((MultiMatchBeInvitedFragmentV2) aObserverS76S0200000_13.l0).Gl(((C76244Tw8) aObserverS76S0200000_13.l1).LJ.getValue(), map);
    }

    public static final void onChanged$13(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
        if (LJIILJJIL != null && LJIILJJIL.size() == 4) {
            Room room = (Room) aObserverS76S0200000_13.l1;
            if (room != null) {
                ArrayList arrayList = new ArrayList();
                for (C75883TqJ c75883TqJ : LJIILJJIL) {
                    if (c75883TqJ.LIZ != room.getOwner().getId()) {
                        arrayList.add(c75883TqJ);
                    }
                }
                C76534U1y c76534U1y = ((MultiMatchInviteFragmentV2) aObserverS76S0200000_13.l0).LLFF;
                if (c76534U1y != null) {
                    c76534U1y.setData(arrayList);
                    return;
                }
                return;
            }
            return;
        }
        ((MultiMatchInviteFragmentV2) aObserverS76S0200000_13.l0).LJLIL.dismiss();
    }

    public static final void onChanged$14(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        ((MultiMatchInviteFragmentV2) aObserverS76S0200000_13.l0).Kl((List) obj, ((C76244Tw8) aObserverS76S0200000_13.l1).LJI.getValue());
    }

    public static final void onChanged$15(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        ((MultiMatchInviteFragmentV2) aObserverS76S0200000_13.l0).Jl((List) obj, ((C76244Tw8) aObserverS76S0200000_13.l1).LJI.getValue());
    }

    public static final void onChanged$16(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        Map<Long, Boolean> map = (Map) obj;
        ((MultiMatchInviteFragmentV2) aObserverS76S0200000_13.l0).Kl(((C76244Tw8) aObserverS76S0200000_13.l1).LJ.getValue(), map);
        ((MultiMatchInviteFragmentV2) aObserverS76S0200000_13.l0).Jl(((C76244Tw8) aObserverS76S0200000_13.l1).LJFF.getValue(), map);
    }

    public static final void onChanged$2(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        FragmentManager fragmentManager;
        MultiGuestFollowAndApplyDialog multiGuestFollowAndApplyDialog;
        DataChannel dataChannel = (DataChannel) aObserverS76S0200000_13.l0;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (multiGuestFollowAndApplyDialog = ((FansRequiredInterceptor) aObserverS76S0200000_13.l1).LIZIZ) != null) {
            multiGuestFollowAndApplyDialog.show(fragmentManager, "MultiGuestFollowAndApplyDialog");
        }
    }

    public static final void onChanged$3(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        List<?> list;
        int i;
        RankListV2Response.RankView rankView;
        RankListV2Response.RankInfo rankInfo;
        RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra;
        RunnableC31065CHd runnableC31065CHd;
        RankListV2Response.RankView rankView2;
        List<?> list2 = (List) obj;
        if (((RankListFragment) aObserverS76S0200000_13.l0).vl() && (rankView2 = ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI) != null) {
            RankListController rankListController = (RankListController) aObserverS76S0200000_13.l1;
            RankListFragment rankListFragment = (RankListFragment) aObserverS76S0200000_13.l0;
            rankListController.LIZIZ().LJLJJL.postValue(new C78021Ujh(rankListFragment.LJLJJI, rankView2.history));
            MutableLiveData<C78020Ujg> mutableLiveData = rankListController.LIZIZ().LJLJLJ;
            C31526CYw c31526CYw = rankListFragment.LJLJJI;
            String str = rankView2.ruleUrl;
            if (str == null) {
                str = "";
            }
            mutableLiveData.postValue(new C78020Ujg(c31526CYw, str));
        }
        C31415CUp c31415CUp = ((RankListFragment) aObserverS76S0200000_13.l0).LJLL;
        if (c31415CUp != null) {
            list = c31415CUp.LJLIL;
            c31415CUp.LJLZ(list2);
        } else {
            list = null;
        }
        RankListFragment rankListFragment2 = (RankListFragment) aObserverS76S0200000_13.l0;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        rankListFragment2.getClass();
        if (C31512CYi.LIZIZ && (runnableC31065CHd = rankListFragment2.LJLLLLLL) != null) {
            runnableC31065CHd.post(new ARunnableS17S0101000_13(i, rankListFragment2, 3));
        }
        if (list == null || list.isEmpty()) {
            C31415CUp c31415CUp2 = ((RankListFragment) aObserverS76S0200000_13.l0).LJLL;
            if (c31415CUp2 != null) {
                c31415CUp2.LJLZ(list2);
            }
            C31415CUp c31415CUp3 = ((RankListFragment) aObserverS76S0200000_13.l0).LJLL;
            if (c31415CUp3 != null) {
                c31415CUp3.notifyDataSetChanged();
            }
        } else if (list2 != null) {
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.bytedance.android.live.rank.impl.list.model.IRankListItem>");
            C03150Al LIZ = C03200Aq.LIZ(new C77959Uih(C65777Prh.LIZIZ(list), list2), true);
            try {
                C31415CUp c31415CUp4 = ((RankListFragment) aObserverS76S0200000_13.l0).LJLL;
                o.LJII(c31415CUp4, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
                LIZ.LIZJ(c31415CUp4);
            } catch (Exception e) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StackTraceElement[] stackTrace = e.getStackTrace();
                LJIILIIL.getClass();
                C0NE.LJIIL(6, stackTrace);
            }
        }
        if (((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI != null) {
            C78000UjM c78000UjM = ((RankListFragment) aObserverS76S0200000_13.l0).LJLLL;
            if (c78000UjM.LIZIZ) {
                c78000UjM.LIZ = true;
                c78000UjM.LIZIZ = false;
                c78000UjM.LIZLLL = System.currentTimeMillis();
                C31522CYs.LJII(((RankListFragment) aObserverS76S0200000_13.l0).LJLJJI, ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI, C51029K0z.LJIILIIL((RankListFragment) aObserverS76S0200000_13.l0), false);
                RankListFragment rankListFragment3 = (RankListFragment) aObserverS76S0200000_13.l0;
                ARunnableS32S0200000_13 aRunnableS32S0200000_13 = new ARunnableS32S0200000_13((RankListController) aObserverS76S0200000_13.l1, rankListFragment3, 28);
                rankListFragment3.LJLLLL = aRunnableS32S0200000_13;
                aRunnableS32S0200000_13.run();
                if (!((RankListFragment) aObserverS76S0200000_13.l0).LJLJJI.LJ) {
                    C3KP.LJLILLLLZI = new WeakReference(((RankListFragment) aObserverS76S0200000_13.l0).LJLLLL);
                }
                RankListV2Response.RankView rankView3 = ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI;
                RankListFragment rankListFragment4 = (RankListFragment) aObserverS76S0200000_13.l0;
                C31522CYs.LJFF(rankView3, rankListFragment4.LJLJJI.LIZIZ.rankName, C51029K0z.LJIILIIL(rankListFragment4));
                RankListV2Response.RankView rankView4 = ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI;
                if (rankView4 != null && !rankView4.isPositionSafe && ((RankListController) aObserverS76S0200000_13.l1).LIZ().LJLJI) {
                    RankListV2Response.RankView rankView5 = ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI;
                    StringBuilder LIZ2 = X1D.LIZ();
                    C31522CYs.LJFF(rankView5, JBR.LJFF(LIZ2, ((RankListFragment) aObserverS76S0200000_13.l0).LJLJJI.LIZIZ.rankName, "_unstable_location", LIZ2), C51029K0z.LJIILIIL((RankListFragment) aObserverS76S0200000_13.l0));
                }
                if ((o.LJ(((RankListFragment) aObserverS76S0200000_13.l0).LJLJJI.LIZIZ, RankTypeV2.LIZJ) || o.LJ(((RankListFragment) aObserverS76S0200000_13.l0).LJLJJI.LIZIZ, RankTypeV2.LJIIJJI)) && ((RankListController) aObserverS76S0200000_13.l1).LIZ().LJLJI && (rankView = ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI) != null && (rankInfo = rankView.ownerRank) != null && (weeklyRookieRankExtra = rankInfo.weeklyRookieRankExtra) != null && weeklyRookieRankExtra.lastrankanchorbeyondthreshold) {
                    RankListV2Response.RankView rankView6 = ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLILLLLZI;
                    StringBuilder LIZ3 = X1D.LIZ();
                    C31522CYs.LJFF(rankView6, JBR.LJFF(LIZ3, ((RankListFragment) aObserverS76S0200000_13.l0).LJLJJI.LIZIZ.rankName, "_bottom_bar", LIZ3), C51029K0z.LJIILIIL((RankListFragment) aObserverS76S0200000_13.l0));
                }
            }
        }
    }

    public static final void onChanged$4(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        boolean z;
        ImageModel imageModel;
        int i;
        int i2;
        RankListFragment rankListFragment;
        FrameLayout frameLayout;
        RunnableC31065CHd runnableC31065CHd;
        RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) obj;
        if (rankInfo == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = ((RankListFragment) aObserverS76S0200000_13.l0).LJLZ;
            if (view != null) {
                view.setVisibility(8);
            }
            FrameLayout frameLayout2 = ((RankListFragment) aObserverS76S0200000_13.l0).LJZ;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            RankListFragment rankListFragment2 = (RankListFragment) aObserverS76S0200000_13.l0;
            C31415CUp c31415CUp = rankListFragment2.LJLL;
            if (c31415CUp == null || (runnableC31065CHd = rankListFragment2.LJLLLLLL) == null) {
                return;
            }
            runnableC31065CHd.setAdapter(c31415CUp);
            return;
        }
        EnumC31059CGx enumC31059CGx = EnumC31059CGx.BOTTOM_BAR;
        Text text = null;
        String str = "";
        if ((enumC31059CGx.getScene() & ((RankListController) aObserverS76S0200000_13.l1).LJII().LJLJLJ) != 0) {
            View view2 = ((RankListFragment) aObserverS76S0200000_13.l0).LJLZ;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            FrameLayout frameLayout3 = ((RankListFragment) aObserverS76S0200000_13.l0).LJZ;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            String LIZ = CFU.LIZ(((RankListController) aObserverS76S0200000_13.l1).LJLJI.LIZIZ.type, enumC31059CGx.getScene());
            if (LIZ != null) {
                str = LIZ;
            }
            if (str.length() == 0 || (frameLayout = (rankListFragment = (RankListFragment) aObserverS76S0200000_13.l0).LJZ) == null) {
                return;
            }
            if (TextUtils.isEmpty(str)) {
                frameLayout.removeAllViews();
                OA0 oa0 = rankListFragment.LJZI;
                if (oa0 != null) {
                    oa0.LIZIZ();
                }
                rankListFragment.LJZI = null;
                return;
            }
            int LIZ2 = (int) B9K.LIZ(rankListFragment.getContext(), 64.0f);
            if (rankListFragment.LJZI == null) {
                Context context = frameLayout.getContext();
                o.LJIIIIZZ(context, "container.context");
                OA0 oa02 = new OA0(context);
                rankListFragment.LJZI = oa02;
                frameLayout.addView(oa02, new ViewGroup.MarginLayoutParams(-1, LIZ2));
            }
            String json = GsonProtectorUtils.toJson(new Gson(), rankInfo);
            OA0 oa03 = rankListFragment.LJZI;
            if (oa03 == null) {
                return;
            }
            oa03.LIZ(LIZ2, C31512CYi.LIZ(str), json);
            return;
        }
        View view3 = ((RankListFragment) aObserverS76S0200000_13.l0).LJLZ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        FrameLayout frameLayout4 = ((RankListFragment) aObserverS76S0200000_13.l0).LJZ;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
        if (((RankListController) aObserverS76S0200000_13.l1).LIZIZ().LJLJI) {
            RankListFragment rankListFragment3 = (RankListFragment) aObserverS76S0200000_13.l0;
            if (rankInfo != null) {
                TextView textView = rankListFragment3.LJZL;
                if (textView != null) {
                    C78934UyQ.LJJIIJZLJL(textView, rankInfo.rankStr, C31512CYi.LIZIZ);
                    textView.setTextColor(C78934UyQ.LJIILL(rankInfo.rank, rankListFragment3.LJLJJI.LIZIZ));
                }
                ImageView imageView = rankListFragment3.LLD;
                User user = rankInfo.user;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                ImageView imageView2 = rankListFragment3.LLD;
                if (imageView2 != null) {
                    i = imageView2.getWidth();
                } else {
                    i = 0;
                }
                ImageView imageView3 = rankListFragment3.LLD;
                if (imageView3 != null) {
                    i2 = imageView3.getHeight();
                } else {
                    i2 = 0;
                }
                C31665Cbl.LJIIJ(imageView, imageModel, i, i2, R.drawable.d1c);
                BorderInfo LIZ3 = C29504Bi0.LIZ(rankInfo.user);
                if (LIZ3 != null) {
                    C15620jO.LIZIZ(LIZ3.icon, rankListFragment3.LLF);
                }
                long j = rankInfo.rank;
                if (j > 0) {
                    int i3 = (int) j;
                    View view4 = rankListFragment3.LJLZ;
                    if (view4 != null) {
                        C16880lQ.LJIIJ(new C77957Uif(rankListFragment3, i3), view4);
                    }
                }
                if (rankInfo.gap.displayType == 1) {
                    View view5 = rankListFragment3.LLFF;
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                    C47121t6 c47121t6 = rankListFragment3.LLFFF;
                    if (c47121t6 != null) {
                        c47121t6.setVisibility(0);
                    }
                    RankListV2Response.Gap gap = rankInfo.gap;
                    int i4 = gap.banInfo;
                    if (i4 != 3) {
                        if (i4 != 5) {
                            C47121t6 c47121t62 = rankListFragment3.LLFFF;
                            if (c47121t62 == null) {
                                return;
                            }
                            c47121t62.setText(CXJ.LJFF(gap.gapDescription, "").toString());
                            return;
                        }
                        C47121t6 c47121t63 = rankListFragment3.LLFFF;
                        if (c47121t63 == null) {
                            return;
                        }
                        c47121t63.setText(CXJ.LJFF(gap.gapDescription, "").toString());
                        return;
                    }
                    Spannable LJFF = CXJ.LJFF(gap.gapDescription, " ");
                    o.LJIIIIZZ(LJFF, "parsePatternAndGetSpanna…(gap.gapDescription, \" \")");
                    rankListFragment3.Hl(LJFF, "rookie_star_rank_bottom_bar");
                    return;
                }
                View view6 = rankListFragment3.LLFF;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
                C47121t6 c47121t64 = rankListFragment3.LLFFF;
                if (c47121t64 != null) {
                    c47121t64.setVisibility(8);
                }
                TextView textView2 = rankListFragment3.LL;
                if (textView2 != null) {
                    textView2.setText(C05170If.LIZ(rankInfo.user));
                }
                TextView textView3 = rankListFragment3.LLFII;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                C2A7 c2a7 = rankListFragment3.LLFZ;
                if (c2a7 != null) {
                    c2a7.setVisibility(8);
                }
                TextView textView4 = rankListFragment3.LLI;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                TextView textView5 = rankListFragment3.LLI;
                if (textView5 == null) {
                    return;
                }
                RankListV2Response.Gap gap2 = rankInfo.gap;
                if (gap2 != null) {
                    text = gap2.gapDescription;
                }
                textView5.setText(CXJ.LJFF(text, "").toString());
                return;
            }
            rankListFragment3.getClass();
            return;
        }
        ((RankListFragment) aObserverS76S0200000_13.l0).Al(rankInfo);
    }

    public static final void onChanged$5(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        FragmentManager fragmentManager;
        GameLinkFollowAndApplyDialog gameLinkFollowAndApplyDialog;
        DataChannel dataChannel = (DataChannel) aObserverS76S0200000_13.l0;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (gameLinkFollowAndApplyDialog = ((com.bytedance.android.livesdk.comp.impl.game.linkmic.interceptor.FansRequiredInterceptor) aObserverS76S0200000_13.l1).LIZIZ) != null) {
            gameLinkFollowAndApplyDialog.show(fragmentManager, "MultiGuestFollowAndApplyDialog");
        }
    }

    public static final void onChanged$6(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            C83146WkA c83146WkA = (C83146WkA) aObserverS76S0200000_13.l0;
            View view = (View) aObserverS76S0200000_13.l1;
            num.intValue();
            V3N.LJJIJL(c83146WkA, view, num.intValue());
        }
    }

    public static final void onChanged$7(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            V3N.LJJIJL((C83146WkA) aObserverS76S0200000_13.l0, (View) aObserverS76S0200000_13.l1, num.intValue());
        }
    }

    public static final void onChanged$8(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C61101NyT c61101NyT = (C61101NyT) aObserverS76S0200000_13.l0;
            if (c61101NyT != null) {
                c61101NyT.LIZIZ();
                return;
            }
            return;
        }
        ((InterfaceC73573Su9) aObserverS76S0200000_13.l1).onNext(new C77150UPq(false, 0, 0, null, 30));
        ((InterfaceC73573Su9) aObserverS76S0200000_13.l1).onComplete();
        C61101NyT c61101NyT2 = (C61101NyT) aObserverS76S0200000_13.l0;
        if (c61101NyT2 == null) {
            return;
        }
        c61101NyT2.LIZ();
    }

    public static final void onChanged$9(AObserverS76S0200000_13 aObserverS76S0200000_13, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            V3N.LJJIJL((C83146WkA) aObserverS76S0200000_13.l0, (View) aObserverS76S0200000_13.l1, num.intValue());
        }
    }

    public AObserverS76S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
