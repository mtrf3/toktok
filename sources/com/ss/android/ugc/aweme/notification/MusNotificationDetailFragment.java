package com.ss.android.ugc.aweme.notification;

import X.AX6;
import X.AbstractC57014MZe;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C10K;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C45804HyK;
import X.C53355Kwp;
import X.C54154LNe;
import X.C56729MOf;
import X.C57017MZh;
import X.C57020MZk;
import X.C57050MaE;
import X.C57051MaF;
import X.C57053MaH;
import X.C57110MbC;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73318Sq2;
import X.C76800UCe;
import X.C90903hW;
import X.C9NE;
import X.FMX;
import X.InterfaceC03360Bg;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC45040Hm0;
import X.InterfaceC56810MRi;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.LK2;
import X.LKH;
import X.MGN;
import X.MZA;
import X.MZI;
import X.MZK;
import X.MZL;
import X.MZP;
import X.MZQ;
import X.MZX;
import X.OSZ;
import X.QD3;
import X.X1D;
import Y.ARunnableS13S0101000_9;
import Y.AgS126S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.fragment.FindNavigationContainerResult;
import com.bytedance.router.fragment.NavigationUtils;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.notification.vm.SubscribeSettingVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes10.dex */
public final class MusNotificationDetailFragment extends BaseFragment implements InterfaceC03360Bg, InterfaceC191547fS, InterfaceC223218pR<BaseNotice>, InterfaceC45040Hm0, InterfaceC56810MRi, LK2, LKH, JBS {
    public AbstractC57014MZe LJLJI;
    public MZI LJLJJI;
    public MZI LJLJJL;
    public MZK LJLJJLL;
    public MusNewNotificationModel LJLJLJ;
    public C57110MbC LJLJLLL;
    public boolean LJLLILLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final MZL LJLILLLLZI = MZL.LIZ;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C57020MZk.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 344));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C57017MZh.LJLIL);
    public long LJLLJ = -1;
    public String LJLLL = "close";
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 343));

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<BaseNotice> list, boolean z) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemLongClick(int i) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.LKH
    public final boolean LJIIJ() {
        this.LJLLL = "return";
        if (C53355Kwp.LIZ() && NavigationUtils.findNavigationContainer(this) != null && Al()) {
            FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", C54154LNe.LIZIZ(requireActivity())), new OSZ("from_inbox_page", getPageName())));
        }
        return true;
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        MZK mzk = this.LJLJJLL;
        if (mzk != null) {
            if (mzk.mShowFooter) {
                mzk.setShowFooter(false);
                MZK mzk2 = this.LJLJJLL;
                if (mzk2 != null) {
                    mzk2.notifyDataSetChanged();
                    showLoadMoreEmpty();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.h5v)).setRefreshing(false);
            MZK mzk3 = this.LJLJJLL;
            if (mzk3 != null) {
                if (mzk3.getItemCount() == 0) {
                    C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                    C73306Spq c73306Spq = new C73306Spq();
                    MZI mzi = this.LJLJJI;
                    if (mzi != null) {
                        c73306Spq.LIZJ(mzi.LIZIZ());
                        MZI mzi2 = this.LJLJJI;
                        if (mzi2 != null) {
                            mzi2.LIZJ();
                            c73306Spq.LJI = "";
                            c73305Spp.setStatus(c73306Spq);
                            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                        } else {
                            o.LJIJI("mDetailProxy");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mDetailProxy");
                        throw null;
                    }
                }
                C57053MaH.LIZ(0);
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        String str;
        Analysis analysis = new Analysis();
        int i = vl().groupType;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    str = "fans";
                } else {
                    str = "at";
                }
            } else {
                str = "like";
            }
        } else {
            str = "comment";
        }
        analysis.setLabelName(str);
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(getEnterFrom())");
        return analysis;
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        MZI mzi = this.LJLJJI;
        if (mzi == null) {
            return "";
        }
        String LIZ = mzi.LIZ();
        if (o.LJ(LIZ, "Account updates")) {
            return "system_notification";
        }
        if (!o.LJ(LIZ, "Shop updates")) {
            return "";
        }
        return "shop_updates";
    }

    public final void showLoadMoreEmpty() {
        MZK mzk = this.LJLJJLL;
        if (mzk != null) {
            mzk.showLoadMoreEmpty();
            MZK mzk2 = this.LJLJJLL;
            if (mzk2 != null) {
                mzk2.setShowFooter(false);
                return;
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        MZK mzk = this.LJLJJLL;
        if (mzk != null) {
            mzk.showLoadMoreLoading();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    public final MusNotificationDetailArg vl() {
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) this.LJLIL.getValue();
        if (musNotificationDetailArg == null) {
            return new MusNotificationDetailArg(0, 0, null, null, null, false, 0L, null, 255, null);
        }
        return musNotificationDetailArg;
    }

    public final C56729MOf wl() {
        return (C56729MOf) this.LJLJL.getValue();
    }

    public final MZA xl() {
        String str;
        vl();
        String str2 = vl().title;
        String str3 = vl().tabName;
        String str4 = vl().enterFrom;
        if (vl().mergeTikTokShop) {
            str = "shop_info";
        } else {
            str = null;
        }
        MZA mza = new MZA(str2, str3, str4, str);
        NotificationDetailVM notificationDetailVM = (NotificationDetailVM) this.LJLL.getValue();
        o.LJIIIZ(notificationDetailVM, "<set-?>");
        mza.LIZ = notificationDetailVM;
        return mza;
    }

    public final boolean Al() {
        FragmentManager fragmentManager;
        FindNavigationContainerResult findNavigationContainer = NavigationUtils.findNavigationContainer(this);
        if (findNavigationContainer != null) {
            fragmentManager = findNavigationContainer.getFragmentManager();
        } else {
            fragmentManager = null;
        }
        MZI mzi = this.LJLJJI;
        if (mzi != null) {
            if (!o.LJ(mzi.LIZ(), "Account updates") || fragmentManager == null || fragmentManager.LJJJJIZL() != 1) {
                return false;
            }
            return true;
        }
        o.LJIJI("mDetailProxy");
        throw null;
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        boolean z;
        getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            MZK mzk = this.LJLJJLL;
            if (mzk != null) {
                if (mzk.getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                }
                wl().LJIILL(1, Integer.valueOf(vl().groupType), null, Boolean.valueOf(vl().mergeTikTokShop));
                ((Set) ((NotificationDetailVM) this.LJLL.getValue()).LJLIL.getValue()).clear();
                C57050MaE c57050MaE = C57050MaE.LJLIL;
                C57051MaF c57051MaF = C57053MaH.LIZ;
                if (c57051MaF != null) {
                    c57050MaE.invoke(c57051MaF);
                    return;
                }
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        MZK mzk2 = this.LJLJJLL;
        if (mzk2 != null) {
            if (mzk2.getItemCount() == 0) {
                C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 7), C10K.LJIIIIZZ, null);
            }
            C57053MaH.LIZ = null;
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        wl().LJIILL(4, Integer.valueOf(vl().groupType), null, Boolean.valueOf(vl().mergeTikTokShop));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        wl().LIZIZ();
        ((C73318Sq2) this.LJLLI.getValue()).dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLLL = "close";
        this.LJLLJ = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int childCount = ((ViewGroup) _$_findCachedViewById(R.id.h5k)).getChildCount();
        if (vl().mergeTikTokShop && vl().groupType == 210 && this.LJLLJ != -1) {
            _$_findCachedViewById(R.id.h5k).post(new ARunnableS13S0101000_9(childCount, this, 3));
        }
        super.onStop();
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        MZK mzk = this.LJLJJLL;
        if (mzk != null) {
            if (mzk.mShowFooter) {
                mzk.setShowFooter(false);
                MZK mzk2 = this.LJLJJLL;
                if (mzk2 != null) {
                    mzk2.notifyDataSetChanged();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            ((SwipeRefreshLayout) _$_findCachedViewById(R.id.h5v)).setRefreshing(false);
            MZK mzk3 = this.LJLJJLL;
            if (mzk3 != null) {
                if (mzk3.getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    MGN mgn = MGN.LJLILLLLZI;
                    if (mgn.isStandardUIEnable()) {
                        C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        o.LJIIIIZZ(status_view, "status_view");
                        mgn.setStatusView(status_view, "inbox_notification_detail", new MZP(this), exc);
                        Context context = getContext();
                        o.LJI(context);
                        Activity LJIJJ = C45804HyK.LJIJJ(context);
                        o.LJI(LJIJJ);
                        mgn.triggerNetworkTips(LJIJJ, "inbox_notification_detail", exc, (C73305Spp) _$_findCachedViewById(R.id.kf_));
                    } else {
                        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        C73306Spq c73306Spq = new C73306Spq();
                        C73312Spw.LJI(c73306Spq, new MZQ(this));
                        c73305Spp.setStatus(c73306Spq);
                    }
                }
                C57053MaH.LIZ(0);
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        MZK mzk = this.LJLJJLL;
        if (mzk != null) {
            mzk.showPullUpLoadMore();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        activityConfiguration(MZX.LJLIL);
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC56810MRi
    public final void onItemClick(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onItemClick:");
        LIZ.append(i);
        C221018lt.LIZ("NotificationDetail", X1D.LIZIZ(LIZ));
        this.LJLLL = "next";
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C9NE c9ne) {
        AX6.LIZ(this);
    }

    @Override // X.LK2
    public final void v0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C53355Kwp.LIZ() && NavigationUtils.findNavigationContainer(this) != null && Al()) {
            FMX.LJIIL("enter_homepage_message_navi", C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "click_button_icon"), new OSZ("from_inbox_page", getPageName())));
        }
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<BaseNotice> list, boolean z) {
        if (_$_findCachedViewById(R.id.h5k) == null) {
            return;
        }
        MZK mzk = this.LJLJJLL;
        if (mzk != null) {
            mzk.setShowFooter(true);
            int i = 0;
            if (this.LJLLILLLL) {
                MZK mzk2 = this.LJLJJLL;
                if (mzk2 != null) {
                    mzk2.LJLJJI = 0;
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            if (!z) {
                showLoadMoreEmpty();
            } else {
                MZK mzk3 = this.LJLJJLL;
                if (mzk3 != null) {
                    mzk3.resetLoadMoreState();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            MusNewNotificationModel musNewNotificationModel = this.LJLJLJ;
            if (musNewNotificationModel != null) {
                UnsubscribeSettingMetadata unsubscribeSettingMetadata = musNewNotificationModel.unsubscribeSetting;
                if (unsubscribeSettingMetadata != null && unsubscribeSettingMetadata.hasUnsubscribeSetting) {
                    C57110MbC c57110MbC = this.LJLJLLL;
                    if (c57110MbC != null) {
                        ((SubscribeSettingVM) c57110MbC.LJFF.getValue()).gv0(c57110MbC.LIZIZ);
                    } else {
                        o.LJIJI("mSubscribeSettingHelper");
                        throw null;
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) _$_findCachedViewById(R.id.h5v);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                MZK mzk4 = this.LJLJJLL;
                if (mzk4 != null) {
                    mzk4.setData(list);
                    C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                    if (c73305Spp != null) {
                        c73305Spp.setVisibility(8);
                    }
                    if (!this.LJLLILLLL && vl().mergeTikTokShop && vl().groupType == 210) {
                        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.h5k);
                        if (viewGroup != null) {
                            int childCount = viewGroup.getChildCount();
                            View _$_findCachedViewById = _$_findCachedViewById(R.id.h5k);
                            if (_$_findCachedViewById != null) {
                                _$_findCachedViewById.post(new ARunnableS13S0101000_9(childCount, this, 2));
                            }
                        } else {
                            return;
                        }
                    }
                    this.LJLLILLLL = true;
                    if (list != null) {
                        i = list.size();
                    }
                    C57053MaH.LIZ(i);
                    return;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
            o.LJIJI("mNoticeModel");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            showLoadMoreEmpty();
        } else {
            MZK mzk = this.LJLJJLL;
            if (mzk != null) {
                mzk.resetLoadMoreState();
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        MZK mzk2 = this.LJLJJLL;
        if (mzk2 != null) {
            mzk2.setDataAfterLoadMore(list);
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.MusNotificationDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rp, viewGroup, false);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LLLLIILL.setPadding(0, C63081OpJ.LJJJJLI(requireActivity), 0, 0);
        Context context = LLLLIILL.getContext();
        o.LJIIIIZZ(context, "view.context");
        LLLLIILL.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
