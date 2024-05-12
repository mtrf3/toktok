package com.ss.android.ugc.aweme.notification;

import X.AX6;
import X.AbstractC030109x;
import X.AbstractC030309z;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C223318pb;
import X.C26045AKb;
import X.C29S;
import X.C2NU;
import X.C2U8;
import X.C32151Nz;
import X.C3C5;
import X.C40443Fu3;
import X.C51031K1b;
import X.C53363Kwx;
import X.C53371Kx5;
import X.C54251LQx;
import X.C54362LVe;
import X.C56649MLd;
import X.C56724MOa;
import X.C56725MOb;
import X.C56726MOc;
import X.C56727MOd;
import X.C56732MOi;
import X.C56736MOm;
import X.C56760MPk;
import X.C56818MRq;
import X.C57110MbC;
import X.C5H3;
import X.C60996Nwm;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73379Sr1;
import X.C76800UCe;
import X.C78897Uxp;
import X.C7MY;
import X.C80896Voy;
import X.C90903hW;
import X.C9NE;
import X.FMX;
import X.G27;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC56737MOn;
import X.InterfaceC61213O0r;
import X.InterfaceC74170T9a;
import X.L03;
import X.MDJ;
import X.MGN;
import X.MOH;
import X.MOY;
import X.MOZ;
import X.MS5;
import X.O6R;
import X.OSZ;
import X.QD3;
import X.V1B;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import Y.AgS126S0100000_9;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import com.ss.android.ugc.aweme.notification.adapter.FilterViewModel;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.vm.ChannelInfoViewModel;
import com.ss.android.ugc.aweme.notification.vm.SubscribeSettingVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

@InterfaceC61213O0r
/* loaded from: classes10.dex */
public final class NoticeCardFragment extends AmeBaseFragment implements InterfaceC223218pR<SystemNoticeData>, InterfaceC74170T9a, InterfaceC191547fS, InterfaceC56737MOn, G27 {
    public C56736MOm LJLJL;
    public C57110MbC LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C56726MOc.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C56727MOd.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 345));
    public final Map<OSZ<Integer, Integer>, List<MusNotice>> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLJJL = V1B.LJZI(new AqS159S0100000_9(this, 348));
    public final C5H3 LJLJJLL = V1B.LJZI(new AqS159S0100000_9(this, 347));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 346));

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
    public final void jh(List<SystemNoticeData> list, boolean z) {
    }

    public final void Dl() {
        C56736MOm c56736MOm = this.LJLJL;
        if (c56736MOm != null && c56736MOm.isShowing()) {
            return;
        }
        if (o.LJ(wl().LJLLLL.getValue(), Boolean.TRUE)) {
            ((ImageView) _$_findCachedViewById(R.id.ex5)).setVisibility(0);
        } else {
            ((ImageView) _$_findCachedViewById(R.id.ex5)).setVisibility(4);
        }
    }

    public final C56818MRq vl() {
        return (C56818MRq) this.LJLJI.getValue();
    }

    public final MOH wl() {
        return (MOH) this.LJLILLLLZI.getValue();
    }

    public final C51031K1b<MOH> xl() {
        return (C51031K1b) this.LJLIL.getValue();
    }

    public final void Al() {
        UnsubscribeSettingMetadata unsubscribeSettingMetadata;
        if (C53371Kx5.LIZIZ()) {
            List<GroupUnsubscribeSetting> list = wl().LJLZ;
            if (list != null && list.size() > 0) {
                ((ImageView) _$_findCachedViewById(R.id.ex0)).setVisibility(0);
                C221018lt.LJFF("NoticeCardFragment", "handleUnsubscribeSettings show setting icon");
                C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.ex0), new ACListenerS29S0100000_9(this, 23));
                return;
            }
            return;
        }
        C57110MbC c57110MbC = this.LJLJLLL;
        if (c57110MbC != null && (unsubscribeSettingMetadata = wl().LJLLLLLL) != null && unsubscribeSettingMetadata.hasUnsubscribeSetting && _$_findCachedViewById(R.id.ex0).getVisibility() != 0) {
            ((SubscribeSettingVM) c57110MbC.LJFF.getValue()).gv0(c57110MbC.LIZIZ);
            ((ImageView) _$_findCachedViewById(R.id.ex0)).setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.ex0), new ACListenerS29S0100000_9(c57110MbC, 24));
        }
    }

    @Override // X.InterfaceC74170T9a
    public final void LJ() {
        boolean z;
        mo49getActivity();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            if (vl().getItemCount() <= 0) {
                ((C73305Spp) _$_findCachedViewById(R.id.g7z)).LJFF();
                ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
                ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(0);
            }
            ((LinkedHashMap) this.LJLJJI).clear();
            xl().LJIILL(1);
            C54362LVe.LIZLLL(wl().LJLILLLLZI);
            C2U8.LIZ(new C54251LQx(6, C54362LVe.LJIILJJIL(6)));
            return;
        }
        MGN mgn = MGN.LJLILLLLZI;
        if (mgn.isStandardUIEnable()) {
            ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
            if (vl().getItemCount() <= 0) {
                ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
                C73305Spp statusView = (C73305Spp) _$_findCachedViewById(R.id.keh);
                o.LJIIIIZZ(statusView, "statusView");
                mgn.setStatusView(statusView, "system_notice", new C56724MOa(this), (Exception) null);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    mgn.triggerNetworkTips(mo49getActivity, "system_notice", (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.keh));
                }
            } else {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    mgn.triggerNetworkTips(mo49getActivity2, "system_notice", (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.keh));
                }
            }
            ((C80896Voy) _$_findCachedViewById(R.id.ito)).setRefreshing(false);
            return;
        }
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
        if (vl().getItemCount() <= 0) {
            C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 8), C10K.LJIIIIZZ, null);
        }
        ((C80896Voy) _$_findCachedViewById(R.id.ito)).setRefreshing(false);
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        if (xl().LJJIFFI()) {
            return;
        }
        xl().LJIILL(4);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
        ((C80896Voy) _$_findCachedViewById(R.id.ito)).setRefreshing(false);
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setStatus((C73306Spq) this.LJLJJLL.getValue());
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
        Al();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        xl().LJJII();
        xl().LIZIZ();
        if (wl().LJLJJLL) {
            MDJ.LIZJ = null;
            MDJ.LJ = null;
        } else {
            C221018lt.LJFF("SNUnsubscribeDataHelper", "clear all");
            MDJ.LIZ = null;
            MDJ.LIZIZ = null;
            MDJ.LIZJ = null;
            MDJ.LIZLLL = null;
            MDJ.LJ = null;
        }
        EventBus.LIZJ().LJIJ(this);
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResume isClicked = ");
        LIZ.append(wl().LJLLI);
        LIZ.append(", unreadState = ");
        LIZ.append(wl().LJLLLL.getValue());
        C221018lt.LJFF("NoticeCardFragment", X1D.LIZIZ(LIZ));
        if (!wl().LJLLI || o.LJ(wl().LJLLLL.getValue(), Boolean.FALSE)) {
            return;
        }
        wl().LJIIIZ();
        C56818MRq vl = vl();
        List<T> list = vl.mmItems;
        if (list != 0) {
            for (T t : list) {
                MusNotice notice = t.getNotice();
                if (notice != null) {
                    notice.hasRead = true;
                }
                List<NoticeChannelInfo> channelList = t.getChannelList();
                if (channelList != null) {
                    Iterator<NoticeChannelInfo> it = channelList.iterator();
                    while (it.hasNext()) {
                        it.next().hasRead = true;
                    }
                }
            }
        }
        vl.notifyDataSetChanged();
        C56736MOm c56736MOm = this.LJLJL;
        if (c56736MOm != null) {
            c56736MOm.LIZ();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        vl().showLoadMoreLoading();
    }

    public final void Gl(View view) {
        List<C56732MOi> list;
        Context context;
        C56736MOm c56736MOm;
        if (!isViewValid() || (list = wl().LJLLL) == null || ((ArrayList) list).isEmpty() || (context = getContext()) == null) {
            return;
        }
        String tabName = wl().LJLJJL;
        o.LJIIIZ(tabName, "tabName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "official_message_mix");
        linkedHashMap.put("tab_name", tabName);
        FMX.LJIIL("click_notification_tab", linkedHashMap);
        if (this.LJLJL == null) {
            C56736MOm c56736MOm2 = new C56736MOm(context, this, this);
            this.LJLJL = c56736MOm2;
            FilterViewModel filterViewModel = c56736MOm2.LJLJJL;
            if (filterViewModel != null) {
                ((LiveData) filterViewModel.LJLIL.getValue()).postValue(Integer.valueOf(wl().LJLJI));
            }
            if (MSAdaptionService.LJIIL().LIZIZ(mo49getActivity()) && (c56736MOm = this.LJLJL) != null) {
                c56736MOm.setWidth(C60996Nwm.LIZIZ(mo49getActivity()));
            }
            C56736MOm c56736MOm3 = this.LJLJL;
            if (c56736MOm3 != null) {
                c56736MOm3.LIZJ(wl().LJLLL);
            }
            C56736MOm c56736MOm4 = this.LJLJL;
            if (c56736MOm4 != null) {
                c56736MOm4.setOnDismissListener(new MOY(this));
            }
        }
        C56736MOm c56736MOm5 = this.LJLJL;
        if (c56736MOm5 != null) {
            C16880lQ.LLJLL(c56736MOm5, view);
        }
        ((ImageView) _$_findCachedViewById(R.id.ex5)).setVisibility(4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.ew0), "rotation", 0.0f, 180.0f);
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
        ((C80896Voy) _$_findCachedViewById(R.id.ito)).setRefreshing(false);
        if (exc == null) {
            exc = new RuntimeException("Load error");
        }
        if (vl().getItemCount() == 0) {
            ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp statusView = (C73305Spp) _$_findCachedViewById(R.id.keh);
                o.LJIIIIZZ(statusView, "statusView");
                mgn.setStatusView(statusView, "system_notice", new MOZ(this), exc);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    mgn.triggerNetworkTips(mo49getActivity, "system_notice", exc, (C73305Spp) _$_findCachedViewById(R.id.keh));
                    return;
                }
                return;
            }
            ((C73305Spp) _$_findCachedViewById(R.id.keh)).setStatus((C73306Spq) this.LJLJJL.getValue());
        }
    }

    @Override // X.InterfaceC56737MOn
    public final void m6(C56732MOi struct) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(struct, "struct");
        if (wl().LJLJI == struct.LJLIL) {
            C56736MOm c56736MOm = this.LJLJL;
            if (c56736MOm != null) {
                c56736MOm.dismiss();
                return;
            }
            return;
        }
        MOH wl = wl();
        if (wl().LJLJJI != struct.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        wl.LJLJJLL = z;
        wl().LJLJI = struct.LJLIL;
        MOH wl2 = wl();
        NoticeChannelInfo noticeChannelInfo = struct.LJLJLJ;
        String str3 = "";
        if (noticeChannelInfo == null || (str = noticeChannelInfo.name) == null) {
            str = "";
        }
        wl2.getClass();
        wl2.LJLIL = str;
        MOH wl3 = wl();
        NoticeChannelInfo noticeChannelInfo2 = struct.LJLJLJ;
        if (noticeChannelInfo2 != null && (str2 = noticeChannelInfo2.accountType) != null) {
            str3 = str2;
        }
        wl3.getClass();
        wl3.LJLJJL = str3;
        String str4 = wl().LJLJJL;
        if (str4 == null || str4.length() == 0) {
            MOH wl4 = wl();
            wl4.getClass();
            wl4.LJLJJL = "all";
        }
        ((TextView) _$_findCachedViewById(R.id.lyc)).setText(wl().LJLIL);
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).LJFF();
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(0);
        LJ();
        C56736MOm c56736MOm2 = this.LJLJL;
        if (c56736MOm2 != null) {
            c56736MOm2.dismiss();
        }
        if (o.LJ(wl().LJLLLL.getValue(), Boolean.TRUE)) {
            wl().LJIIIZ();
            C56736MOm c56736MOm3 = this.LJLJL;
            if (c56736MOm3 != null) {
                c56736MOm3.LIZ();
            }
        }
        C56760MPk.LJIIJ("official_message_mix", wl().LJLJJL, "filter_tab");
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        vl().showPullUpLoadMore();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78897Uxp.LJII(this, C56725MOb.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.os.Bundle r0 = r6.getArguments()
            r5 = 0
            if (r0 == 0) goto Lfd
            int r0 = r0.size()
        Le:
            r4 = 0
            if (r0 <= 0) goto Ld8
            android.os.Bundle r4 = r6.getArguments()
        L15:
            if (r4 == 0) goto Lfa
            java.lang.String r0 = "group"
            int r2 = r4.getInt(r0, r5)
        L1d:
            X.MOH r0 = r6.wl()
            r0.LJLJI = r2
            X.MOH r0 = r6.wl()
            r0.LJLJJI = r2
            X.MOH r3 = r6.wl()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L37
            java.lang.String r0 = "filter_type"
            int r1 = r4.getInt(r0, r1)
        L37:
            r3.LJLILLLLZI = r1
            X.MOH r3 = r6.wl()
            if (r4 == 0) goto L47
            java.lang.String r0 = "title"
            java.lang.String r1 = r4.getString(r0)
            if (r1 != 0) goto L59
        L47:
            boolean r0 = X.C53363Kwx.LIZIZ()
            if (r0 == 0) goto Ld3
            r0 = 2131831733(0x7f112bb5, float:1.92965E38)
        L50:
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "if (SystemNotificationMe…_title,\n                )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L59:
            r3.getClass()
            r3.LJLIL = r1
            X.MOH r1 = r6.wl()
            if (r4 == 0) goto L6a
            java.lang.String r0 = "single_channel"
            boolean r5 = r4.getBoolean(r0, r5)
        L6a:
            r1.LJLJJLL = r5
            X.MOH r0 = r6.wl()
            boolean r0 = r0.LJLJJLL
            if (r0 == 0) goto Lc8
            java.util.Map<X.OSZ<java.lang.Integer, java.lang.Integer>, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>> r0 = r6.LJLJJI
            X.MDJ.LIZJ = r0
            X.MRq r0 = r6.vl()
            X.MDJ.LJ = r0
        L7e:
            java.lang.String r1 = "onCreate group = "
            java.lang.String r0 = ", filterType = "
            java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r2, r0)
            X.MOH r0 = r6.wl()
            int r0 = r0.LJLILLLLZI
            r1.append(r0)
            java.lang.String r0 = ", isSingleChannel = "
            r1.append(r0)
            X.MOH r0 = r6.wl()
            boolean r0 = r0.LJLJJLL
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r1 = "NoticeCardFragment"
            X.C221018lt.LJFF(r1, r0)
            boolean r0 = X.C53371Kx5.LIZIZ()
            if (r0 != 0) goto Lc0
            X.MOH r0 = r6.wl()
            boolean r0 = r0.LJLJJLL
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "onCreate new subscribeSettingHelper"
            X.C221018lt.LJFF(r1, r0)
            X.MbC r0 = new X.MbC
            r0.<init>(r2, r6)
            r6.LJLJLLL = r0
        Lc0:
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZJ()
            r0.LJIILJJIL(r6)
            return
        Lc8:
            java.util.Map<X.OSZ<java.lang.Integer, java.lang.Integer>, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>> r0 = r6.LJLJJI
            X.MDJ.LIZIZ = r0
            X.MRq r0 = r6.vl()
            X.MDJ.LIZLLL = r0
            goto L7e
        Ld3:
            r0 = 2131831747(0x7f112bc3, float:1.9296528E38)
            goto L50
        Ld8:
            X.1qj r0 = r6.mo49getActivity()
            if (r0 == 0) goto Lf8
            android.content.Intent r0 = r0.getIntent()
        Le2:
            boolean r1 = com.bytedance.router.SmartIntent.isSmartIntent(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto Lf0
            if (r0 == 0) goto Lf0
            android.content.Intent r0 = com.bytedance.router.SmartIntent.smartIntent(r0)
        Lf0:
            if (r0 == 0) goto Lfa
            android.os.Bundle r4 = X.C16880lQ.LLJJIJI(r0)
            goto L15
        Lf8:
            r0 = r4
            goto Le2
        Lfa:
            r2 = 0
            goto L1d
        Lfd:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.NoticeCardFragment.onCreate(android.os.Bundle):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C9NE event) {
        o.LJIIIZ(event, "event");
        AX6.LIZ(this);
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<SystemNoticeData> list, boolean z) {
        ((C73305Spp) _$_findCachedViewById(R.id.g7z)).setVisibility(8);
        ((C73305Spp) _$_findCachedViewById(R.id.keh)).setVisibility(8);
        ((C80896Voy) _$_findCachedViewById(R.id.ito)).setRefreshing(false);
        vl().setData(list);
        vl().notifyDataSetChanged();
        vl().setShowFooter(z);
        C56736MOm c56736MOm = this.LJLJL;
        if (c56736MOm != null) {
            c56736MOm.LIZ();
        }
        if (C53371Kx5.LIZIZ()) {
            MS5.LIZ(new AqS156S0200000_9((List) list, (List<SystemNoticeData>) this, (NoticeCardFragment) 118));
        }
        Al();
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<SystemNoticeData> list, boolean z) {
        vl().resetLoadMoreState();
        vl().setDataAfterLoadMore(list);
        vl().setShowFooter(z);
        if (!C53371Kx5.LIZIZ()) {
            return;
        }
        MS5.LIZ(new AqS156S0200000_9((List) list, (List<SystemNoticeData>) this, (NoticeCardFragment) 118));
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        C56736MOm c56736MOm = this.LJLJL;
        if (c56736MOm != null && c56736MOm.isShowing()) {
            return;
        }
        this.LJLJL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        AbstractC28931Bp abstractC28931Bp;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            view2.setPadding(0, C63081OpJ.LJJJJLI(requireActivity), 0, 0);
        }
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LIZIZ.LJIIJJI();
        LIZIZ.LJII(R.attr.c9);
        LIZIZ.LIZ(true);
        LIZIZ.LIZJ();
        AbstractC030109x itemAnimator = ((RecyclerView) _$_findCachedViewById(R.id.isf)).getItemAnimator();
        if ((itemAnimator instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator) != null) {
            abstractC28931Bp.LJI = false;
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isf);
        getContext();
        recyclerView.setLayoutManager(new FixedLinearlayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJIIJJI(new C73379Sr1(getContext()));
        C56649MLd.LIZ((RecyclerView) _$_findCachedViewById(R.id.isf), (C223318pb) _$_findCachedViewById(R.id.ito));
        if (C53363Kwx.LIZIZ() || wl().LJLJJLL) {
            i = 20;
        } else {
            i = 0;
        }
        final int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isf);
        final int LIZIZ2 = C7MY.LIZIZ(20);
        recyclerView2.LJII(new AbstractC030309z(LIZIZ2, LJJIIZ) { // from class: X.4mL
            public final boolean LJLIL;
            public final Paint LJLILLLLZI;
            public final int LJLJI;
            public final int LJLJJLL;
            public final int LJLJJL = -1;
            public final int LJLJJI = 1;

            {
                this.LJLJI = LIZIZ2;
                Paint paint = new Paint(1);
                this.LJLILLLLZI = paint;
                paint.setColor(0);
                paint.setStyle(Paint.Style.FILL);
                this.LJLIL = true;
                this.LJLJJLL = LJJIIZ;
            }

            @Override // X.AbstractC030309z
            public final void LJI(Canvas canvas, RecyclerView recyclerView3, C0AC c0ac) {
                float f = 0.0f;
                Canvas canvas2 = canvas;
                if (this.LJLJJI == 1) {
                    int measuredWidth = recyclerView3.getMeasuredWidth();
                    int childCount = recyclerView3.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = recyclerView3.getChildAt(i2);
                        int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
                        int i3 = top - this.LJLJI;
                        if (this.LJLIL) {
                            canvas2.drawRect(f, i3, measuredWidth - f, top, this.LJLILLLLZI);
                        } else {
                            float f2 = i3;
                            float f3 = top;
                            canvas2 = canvas2;
                            f = f;
                            canvas2.drawRect(f, f2, f, f3, this.LJLILLLLZI);
                            float f4 = measuredWidth;
                            canvas2.drawRect(f4 - f, f2, f4, f3, this.LJLILLLLZI);
                        }
                    }
                    return;
                }
                int measuredHeight = recyclerView3.getMeasuredHeight();
                int childCount2 = recyclerView3.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = recyclerView3.getChildAt(i4);
                    int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).leftMargin;
                    int i5 = left - this.LJLJI;
                    if (this.LJLIL) {
                        canvas2.drawRect(i5, 0 + 0.0f, left, measuredHeight - 0.0f, this.LJLILLLLZI);
                    } else {
                        float f5 = i5;
                        float f6 = left;
                        canvas2.drawRect(f5, 0.0f, f6, 0.0f, this.LJLILLLLZI);
                        float f7 = measuredHeight;
                        canvas2.drawRect(f5, f7 - 0.0f, f6, f7, this.LJLILLLLZI);
                    }
                }
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view3, RecyclerView recyclerView3, C0AC c0ac) {
                int i2;
                int i3;
                int i4;
                recyclerView3.getClass();
                int LJJJJIZL = RecyclerView.LJJJJIZL(view3);
                if (this.LJLJJI == 1) {
                    int i5 = this.LJLJJLL;
                    if (i5 != 0 && LJJJJIZL == 0) {
                        if (LJJJJIZL == this.LJLJJL) {
                            i4 = 0;
                        } else {
                            i4 = this.LJLJI;
                        }
                        rect.set(0, i5, 0, i4);
                        return;
                    }
                    if (LJJJJIZL == this.LJLJJL) {
                        i3 = 0;
                    } else {
                        i3 = this.LJLJI;
                    }
                    rect.set(0, 0, 0, i3);
                    return;
                }
                if (LJJJJIZL == this.LJLJJL) {
                    i2 = 0;
                } else {
                    i2 = this.LJLJI;
                }
                rect.set(0, 0, i2, 0);
            }
        }, -1);
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(vl());
        ((C80896Voy) _$_findCachedViewById(R.id.ito)).setOnRefreshListener(this);
        ((C80896Voy) _$_findCachedViewById(R.id.ito)).setNestedScrollEnabledWhenNonTouch(false);
        vl().setShowFooter(false);
        vl().setLoadMoreListener(this);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.evx), new ACListenerS29S0100000_9(this, 185));
        if (C53363Kwx.LIZIZ() && !wl().LJLJJLL) {
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.lyc), new ACListenerS29S0100000_9(this, 186));
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.ew0), new ACListenerS29S0100000_9(this, 188));
        }
        xl().LJJ(wl());
        xl().LJJI(this);
        ((LiveData) ((ChannelInfoViewModel) this.LJLJLJ.getValue()).LJLIL.getValue()).observe(this, new AObserverS77S0100000_9(this, 131));
        ((TextView) _$_findCachedViewById(R.id.lyc)).setText(wl().LJLIL);
        if (!wl().LJLJJLL && C53363Kwx.LIZIZ()) {
            ((ImageView) _$_findCachedViewById(R.id.ew0)).setVisibility(0);
            wl().LJLLLL.observe(this, new AObserverS77S0100000_9(this, 132));
        } else {
            ((ImageView) _$_findCachedViewById(R.id.ew0)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ex5)).setVisibility(8);
        }
        LJ();
        if (L03.LIZ()) {
            C40443Fu3.LIZ("inbox_system_page").LJIIIIZZ((RecyclerView) _$_findCachedViewById(R.id.isf));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.tu, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
