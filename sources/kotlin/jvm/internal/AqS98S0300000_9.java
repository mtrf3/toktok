package kotlin.jvm.internal;

import X.AX6;
import X.AXU;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C00F;
import X.C100193wV;
import X.C10K;
import X.C110614Vt;
import X.C119354mJ;
import X.C16880lQ;
import X.C188717at;
import X.C1C9;
import X.C2068389v;
import X.C208108Es;
import X.C221018lt;
import X.C26227ARb;
import X.C26335AVf;
import X.C2K0;
import X.C32151Nz;
import X.C32W;
import X.C32X;
import X.C36496EUa;
import X.C37190Eig;
import X.C3AA;
import X.C3AW;
import X.C3TE;
import X.C40443Fu3;
import X.C46604IQu;
import X.C51733KSb;
import X.C52716KmW;
import X.C53117Ksz;
import X.C53330KwQ;
import X.C53339KwZ;
import X.C53754L7u;
import X.C53765L8f;
import X.C54072LKa;
import X.C54561LbB;
import X.C54569LbJ;
import X.C54581LbV;
import X.C54672Lcy;
import X.C54673Lcz;
import X.C54841Lfh;
import X.C55104Ljw;
import X.C55239Lm7;
import X.C55252LmK;
import X.C55763LuZ;
import X.C55783Lut;
import X.C56179M3b;
import X.C56334M9a;
import X.C56634MKo;
import X.C56641MKv;
import X.C56649MLd;
import X.C56805MRd;
import X.C56812MRk;
import X.C57135Mbb;
import X.C57792MmC;
import X.C61328O5c;
import X.C61712OJw;
import X.C61713OJx;
import X.C63081OpJ;
import X.C76732zl;
import X.C76800UCe;
import X.C78983UzD;
import X.C79045V0n;
import X.C7MY;
import X.C85258Xd8;
import X.C8WY;
import X.C8YN;
import X.EnumC112364b2;
import X.EnumC56806MRe;
import X.EnumC57366MfK;
import X.EnumC57793MmD;
import X.FN6;
import X.HG3;
import X.IJ0;
import X.INB;
import X.IRI;
import X.InterfaceC100183wU;
import X.InterfaceC111984aQ;
import X.InterfaceC26157AOj;
import X.InterfaceC55057LjB;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.J8W;
import X.K2B;
import X.KL2;
import X.L03;
import X.L08;
import X.L0H;
import X.L9X;
import X.LJ6;
import X.LJ7;
import X.LV9;
import X.M9M;
import X.MLW;
import X.MQ1;
import X.MRZ;
import X.MSQ;
import X.O6R;
import X.OSZ;
import X.RBX;
import X.RunnableC67294Qb4;
import X.TBT;
import X.UC0;
import X.V1B;
import X.X1D;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.ACListenerS39S0200000_4;
import Y.ACallableS107S0100000_4;
import Y.ACallableS92S0200000_15;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.NotificationFragment;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ProfileFollowMessageComponent;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowAssem;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.ui.NearbyFeedContentAssem;
import com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS98S0300000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$0();
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            default:
                return null;
        }
    }

    public final View invoke$0() {
        View view = ((NotificationFragment) this.l0).LJLZ;
        if (view == null) {
            View LLLLIILL = C16880lQ.LLLLIILL((LayoutInflater) this.l1, R.layout.sr, (ViewGroup) this.l2, false);
            NotificationFragment notificationFragment = (NotificationFragment) this.l0;
            Context requireContext = notificationFragment.requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            LLLLIILL.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, requireContext));
            notificationFragment.LJZ = false;
            notificationFragment.LJLZ = LLLLIILL;
            return LLLLIILL;
        }
        return view;
    }

    public final void invoke$1() {
        if (((L9X) this.l0).LIZ.isFinishing()) {
            return;
        }
        try {
            C208108Es c208108Es = (C208108Es) this.l1;
            C76732zl c76732zl = (C76732zl) this.l2;
            L9X l9x = (L9X) this.l0;
            Iterator it = ((ArrayList) c208108Es.LIZ).iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                Object first = osz.getFirst();
                int intValue = ((Number) osz.getSecond()).intValue();
                int intValue2 = ((Number) first).intValue();
                c76732zl.element = intValue2;
                LinkedList<View> linkedList = l9x.LIZIZ.get(Integer.valueOf(intValue2));
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    l9x.LIZIZ.put(Integer.valueOf(intValue2), linkedList);
                }
                for (int i = 0; i < intValue; i++) {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(l9x.LIZ), intValue2, new FrameLayout(l9x.LIZ), false);
                    synchronized (linkedList) {
                        linkedList.offer(LLLLIILL);
                    }
                }
            }
            C37190Eig.LIZ.postDelayed(new RunnableC67294Qb4((C208108Es) this.l1, ((L9X) this.l0).LIZIZ), 30000L);
            C37190Eig.LIZIZ.LIZ(((L9X) this.l0).LIZ);
        } catch (Exception e) {
            if (((C76732zl) this.l2).element != 0) {
                String resourceName = ((L9X) this.l0).LIZ.getResources().getResourceName(((C76732zl) this.l2).element);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ECAsyncInflater inflate ");
                LIZ.append(resourceName);
                LIZ.append(" failed");
                C78983UzD.LJIJ(e, X1D.LIZIZ(LIZ));
            }
        }
    }

    public static final Object invoke$0(AqS98S0300000_9 aqS98S0300000_9) {
        boolean z;
        Class cls = (Class) aqS98S0300000_9.l0;
        if (((C2K0) aqS98S0300000_9.l1) != null) {
            z = true;
        } else {
            z = false;
        }
        return new C55104Ljw(cls, z, (InterfaceC55235Lm3) aqS98S0300000_9.l2);
    }

    public static final Object invoke$1(AqS98S0300000_9 aqS98S0300000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load ability for ");
        LIZ.append(((InterfaceC55235Lm3) aqS98S0300000_9.l0).getHost());
        LIZ.append(", container is ");
        LIZ.append((InterfaceC55102Lju) aqS98S0300000_9.l1);
        LIZ.append(", clazz is ");
        LIZ.append(((Class) aqS98S0300000_9.l2).getName());
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$10(AqS98S0300000_9 aqS98S0300000_9) {
        String str;
        INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
        WeakHandler weakHandler = new WeakHandler((UserProfileFollowAssem) aqS98S0300000_9.l0);
        String uid = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LJJJJJ.LJIILL(weakHandler, uid);
        ((C188717at) aqS98S0300000_9.l2).LIZIZ();
        String mEnterFrom = ((UserProfileFollowAssem) aqS98S0300000_9.l0).getMEnterFrom();
        if (mEnterFrom == null) {
            mEnterFrom = "";
        }
        String uid2 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        C26335AVf.LJIIJJI(1, mEnterFrom, uid2);
        String uid3 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid3, "user.uid");
        if (((User) aqS98S0300000_9.l1).getFollowStatus() == 1) {
            str = "mutual";
        } else {
            str = "single";
        }
        C26335AVf.LJIIIZ(uid3, str, AXU.LIZJ((User) aqS98S0300000_9.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS98S0300000_9 aqS98S0300000_9) {
        INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
        WeakHandler weakHandler = new WeakHandler((UserProfileFollowAssem) aqS98S0300000_9.l0);
        String uid = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LJJJJJ.LJ(weakHandler, uid);
        ((C188717at) aqS98S0300000_9.l2).LIZIZ();
        String mEnterFrom = ((UserProfileFollowAssem) aqS98S0300000_9.l0).getMEnterFrom();
        if (mEnterFrom == null) {
            mEnterFrom = "";
        }
        String uid2 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        C26335AVf.LJIIJJI(0, mEnterFrom, uid2);
        String uid3 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid3, "user.uid");
        C26335AVf.LJIIJ(uid3, AXU.LIZJ((User) aqS98S0300000_9.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS98S0300000_9 aqS98S0300000_9) {
        boolean LJIILLIIL = LocationServiceImpl.LJIJJ().LJIILLIIL(0, (ActivityC45651qj) aqS98S0300000_9.l0);
        AqS98S0300000_9 aqS98S0300000_92 = new AqS98S0300000_9((ActivityC45651qj) aqS98S0300000_9.l0, (ActivityC45651qj) aqS98S0300000_9.l1, (NearbyFeedContentAssem) aqS98S0300000_9.l2, (InterfaceC65784Pro<C76800UCe>) 14);
        if (LJIILLIIL) {
            NearbyFeedContentAssem nearbyFeedContentAssem = (NearbyFeedContentAssem) aqS98S0300000_9.l1;
            C8YN.LJII(nearbyFeedContentAssem, (AssemViewModel) nearbyFeedContentAssem.LJLJLJ.getValue(), new TBT() { // from class: X.Lak
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C54662Lco) obj).LJLJJI;
                }
            }, null, new AqS172S0200000_9((NearbyFeedContentAssem) aqS98S0300000_9.l1, aqS98S0300000_92, 8), 6);
            TokenCert with = TokenCert.Companion.with("bpea-nearby_roaming_fetch_location_before_check_location_popup");
            with.auth("mttu");
            C51733KSb.LIZ("poi", "nearby_change_region", with, null, new C54581LbV((NearbyFeedContentAssem) aqS98S0300000_9.l1, aqS98S0300000_92), 32);
        } else {
            aqS98S0300000_92.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS98S0300000_9 aqS98S0300000_9) {
        NearbySkylightBaseAssem nearbySkylightBaseAssem = (NearbySkylightBaseAssem) aqS98S0300000_9.l0;
        TokenCert tokenCert = (TokenCert) aqS98S0300000_9.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS98S0300000_9.l2;
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(activityC45651qj, nearbySkylightBaseAssem, 49);
        nearbySkylightBaseAssem.getClass();
        C85258Xd8 c85258Xd8 = new C85258Xd8("homepage_nearby", null, null, false, 254);
        c85258Xd8.LIZLLL = true;
        C54569LbJ c54569LbJ = new C54569LbJ(aqS156S0200000_9, nearbySkylightBaseAssem, System.currentTimeMillis());
        c85258Xd8.LJ = true;
        C56179M3b.LIZ.LJIJI("poi", "nearby", tokenCert, activityC45651qj, c85258Xd8, new C54673Lcz(c54569LbJ), new J8W());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS98S0300000_9 aqS98S0300000_9) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS98S0300000_9.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ActivityC45651qj activity = (ActivityC45651qj) aqS98S0300000_9.l1;
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(activity, 702);
        AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9((NearbyFeedContentAssem) aqS98S0300000_9.l2, 703);
        o.LJIIIZ(activity, "activity");
        if (LJ7.LIZ(activity)) {
            LocationRegion LIZJ = NearbyTabConfig.LIZJ();
            if (LIZJ != null) {
                Keva keva = LJ6.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LIZJ.getName());
                LIZ.append('+');
                LIZ.append(LIZJ.getParentName());
                keva.storeString("last_popular_l2_shown_in_nearby", X1D.LIZIZ(LIZ));
            }
            C26227ARb LIZ2 = C3AW.LIZ(activity);
            LIZ2.LJ(R.string.ilw);
            LIZ2.LIZ(R.string.ilv);
            UC0.LIZJ(LIZ2, new AqS172S0100000_6(aqS159S0100000_9, LiveTryModeCountDownThresholdSetting.DEFAULT));
            LIZ2.LJII = false;
            LIZ2.LIZJ(new AqS175S0100000_9(aqS159S0100000_92, 529));
            LIZ2.LJI().LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS98S0300000_9 aqS98S0300000_9) {
        String str;
        INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
        WeakHandler weakHandler = new WeakHandler((HeaderCTASocialInteractionComponent) aqS98S0300000_9.l0);
        String uid = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LJJJJJ.LJIILL(weakHandler, uid);
        ((C188717at) aqS98S0300000_9.l2).LIZIZ();
        String enterFrom = ((HeaderCTASocialInteractionComponent) aqS98S0300000_9.l0).getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String uid2 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        C26335AVf.LJIIJJI(1, enterFrom, uid2);
        String uid3 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid3, "user.uid");
        if (((User) aqS98S0300000_9.l1).getFollowStatus() == 1) {
            str = "mutual";
        } else {
            str = "single";
        }
        C26335AVf.LJIIIZ(uid3, str, AXU.LIZJ((User) aqS98S0300000_9.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS98S0300000_9 aqS98S0300000_9) {
        INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
        WeakHandler weakHandler = new WeakHandler((HeaderCTASocialInteractionComponent) aqS98S0300000_9.l0);
        String uid = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LJJJJJ.LJ(weakHandler, uid);
        ((C188717at) aqS98S0300000_9.l2).LIZIZ();
        String enterFrom = ((HeaderCTASocialInteractionComponent) aqS98S0300000_9.l0).getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String uid2 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        C26335AVf.LJIIJJI(0, enterFrom, uid2);
        String uid3 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid3, "user.uid");
        C26335AVf.LJIIJ(uid3, AXU.LIZJ((User) aqS98S0300000_9.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS98S0300000_9 aqS98S0300000_9) {
        ((C55783Lut) aqS98S0300000_9.l0).LJ((User) aqS98S0300000_9.l1);
        ((C55783Lut) aqS98S0300000_9.l0).LIZ(new C55763LuZ((Aweme) aqS98S0300000_9.l2));
        C57135Mbb.LIZIZ.LJI().LIZJ((User) aqS98S0300000_9.l1);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AqS98S0300000_9 aqS98S0300000_9) {
        aqS98S0300000_9.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS98S0300000_9 aqS98S0300000_9) {
        NearbyLocationPermissionRequestBaseAssem nearbyLocationPermissionRequestBaseAssem = (NearbyLocationPermissionRequestBaseAssem) aqS98S0300000_9.l0;
        TokenCert tokenCert = (TokenCert) aqS98S0300000_9.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS98S0300000_9.l2;
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(activityC45651qj, nearbyLocationPermissionRequestBaseAssem, 58);
        nearbyLocationPermissionRequestBaseAssem.getClass();
        C85258Xd8 c85258Xd8 = new C85258Xd8("homepage_nearby", null, null, false, 254);
        c85258Xd8.LIZLLL = true;
        C54561LbB c54561LbB = new C54561LbB(aqS156S0200000_9, nearbyLocationPermissionRequestBaseAssem, System.currentTimeMillis(), activityC45651qj);
        c85258Xd8.LJ = true;
        C56179M3b.LIZ.LJIJI("poi", "nearby", tokenCert, activityC45651qj, c85258Xd8, new C54672Lcy(c54561LbB), new C54841Lfh());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS98S0300000_9 aqS98S0300000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create tree for ");
        LIZ.append((ActivityC45651qj) aqS98S0300000_9.l0);
        LIZ.append(", tree: ");
        LIZ.append((C55252LmK) aqS98S0300000_9.l1);
        LIZ.append(", this: ");
        LIZ.append((C55239Lm7) aqS98S0300000_9.l2);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if (r1 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AqS98S0300000_9 r6) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS98S0300000_9.invoke$20(kotlin.jvm.internal.AqS98S0300000_9):java.lang.Object");
    }

    public static final Object invoke$21(AqS98S0300000_9 aqS98S0300000_9) {
        String str;
        String enterFrom;
        Aweme firstAweme = ((LatestUnreadVideoInfo) aqS98S0300000_9.l0).getFirstAweme();
        if (firstAweme != null) {
            MufUserCell mufUserCell = (MufUserCell) aqS98S0300000_9.l1;
            C57792MmC c57792MmC = (C57792MmC) aqS98S0300000_9.l2;
            mufUserCell.getClass();
            mufUserCell.N(c57792MmC, EnumC57793MmD.NEW_VIDEOS_LINK);
            SmartRoute buildRoute = SmartRouter.buildRoute(mufUserCell.L().getContext(), "//aweme/detail");
            MufPageTrackInfo mufPageTrackInfo = c57792MmC.LJLJI;
            String str2 = null;
            if (mufPageTrackInfo != null) {
                str2 = mufPageTrackInfo.getEnterFrom();
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            buildRoute.withParam("enter_from", str2);
            buildRoute.withParam("video_from", "FRIEND_NEW_POST_DETAIL");
            buildRoute.withParam("id", firstAweme.getAid());
            buildRoute.withParam("userid", firstAweme.getAuthor().getUid());
            buildRoute.withParam("sec_userid", firstAweme.getAuthor().getSecUid());
            buildRoute.withParam("is_show_follow_btn_on_bottom", true);
            buildRoute.withParam("refer", "others_homepage");
            MufPageTrackInfo mufPageTrackInfo2 = c57792MmC.LJLJI;
            if (mufPageTrackInfo2 == null || (str = mufPageTrackInfo2.getPreviousPage()) == null) {
                str = "";
            }
            buildRoute.withParam("previous_page", str);
            buildRoute.withParam("is_card", true);
            MufPageTrackInfo mufPageTrackInfo3 = c57792MmC.LJLJI;
            if (mufPageTrackInfo3 != null && (enterFrom = mufPageTrackInfo3.getEnterFrom()) != null) {
                str3 = enterFrom;
            }
            buildRoute.withParam("follow_recommned_enter_from", str3);
            buildRoute.withParam("scene_type", EnumC57366MfK.CARD.getType());
            buildRoute.open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS98S0300000_9 aqS98S0300000_9) {
        SmartRouter.buildRoute((Context) aqS98S0300000_9.l0, ((InlineLink) aqS98S0300000_9.l1).getUrl()).open();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS98S0300000_9.l2;
        if (interfaceC88472Yns != null) {
            String url = ((InlineLink) aqS98S0300000_9.l1).getUrl();
            if (url == null) {
                url = "";
            }
            interfaceC88472Yns.invoke(url);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS98S0300000_9 aqS98S0300000_9) {
        ViewGroup viewGroup;
        Object obj;
        C221018lt.LJFF("InboxFragment", "onCreateView");
        SystemClock.uptimeMillis();
        InboxFragment inboxFragment = (InboxFragment) aqS98S0300000_9.l0;
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9((LayoutInflater) aqS98S0300000_9.l1, (ViewGroup) aqS98S0300000_9.l2, 14);
        inboxFragment.getClass();
        if (!AX6.LIZIZ()) {
            obj = aqS156S0200000_9.invoke();
        } else {
            View view = inboxFragment.LJLILLLLZI;
            if (view == null) {
                inboxFragment.LJLILLLLZI = (View) aqS156S0200000_9.invoke();
            } else {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.endViewTransition(inboxFragment.LJLILLLLZI);
                }
            }
            obj = inboxFragment.LJLILLLLZI;
            o.LJI(obj);
        }
        SystemClock.uptimeMillis();
        return obj;
    }

    public static final Object invoke$4(AqS98S0300000_9 aqS98S0300000_9) {
        C221018lt.LJFF("InboxFragment", "onViewCreated");
        SystemClock.uptimeMillis();
        C56641MKv.LIZIZ(C8WY.ON_VIEW_CREATED, new AqS98S0300000_9((InboxFragment) aqS98S0300000_9.l0, (View) aqS98S0300000_9.l1, (Bundle) aqS98S0300000_9.l2, 5));
        View inbox_title_container = ((InboxFragment) aqS98S0300000_9.l0)._$_findCachedViewById(R.id.ekq);
        o.LJIIIIZZ(inbox_title_container, "inbox_title_container");
        InboxFragment inboxFragment = (InboxFragment) aqS98S0300000_9.l0;
        inboxFragment.getClass();
        HG3.LJIIL();
        InterfaceC26157AOj LJIIL = HG3.LJLJL.LJIIL();
        if (LJIIL.isUpsell2svInboxHVAExperimentTreatment()) {
            C10K.LIZJ(new ACallableS92S0200000_15(LJIIL, inboxFragment, 3));
        }
        InboxFragment inboxFragment2 = (InboxFragment) aqS98S0300000_9.l0;
        inboxFragment2.getClass();
        if (HG3.LJFF().emailPopUpFunctionSwitch()) {
            C10K.LIZJ(new ACallableS107S0100000_4(inboxFragment2, 9));
        }
        if (L03.LIZ()) {
            InterfaceC55057LjB LIZ = C40443Fu3.LIZ("inbox_page");
            InboxFragment inboxFragment3 = (InboxFragment) aqS98S0300000_9.l0;
            LIZ.LJIIIIZZ((RecyclerView) inboxFragment3._$_findCachedViewById(R.id.ekg));
            LIZ.LJI(inboxFragment3.LLIIJLIL);
        }
        InboxFragment inboxFragment4 = (InboxFragment) aqS98S0300000_9.l0;
        InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
        EnumC112364b2 enumC112364b2 = EnumC112364b2.CHAT_CELL;
        View inboxRecyclerView = ((InboxFragment) aqS98S0300000_9.l0)._$_findCachedViewById(R.id.ekg);
        o.LJIIIIZZ(inboxRecyclerView, "inboxRecyclerView");
        InboxFragment inboxFragment5 = (InboxFragment) aqS98S0300000_9.l0;
        inboxFragment4.LL = C100193wV.LIZ(activityStatusAccuracyAnalysis, enumC112364b2, inboxRecyclerView, inboxFragment5, inboxFragment5.getContext());
        SystemClock.uptimeMillis();
        IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LIZIZ();
        if (C53117Ksz.LIZJ) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((InboxFragment) aqS98S0300000_9.l0), null, null, new C32X(null), 3);
        }
        if (C3AA.LIZIZ) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((InboxFragment) aqS98S0300000_9.l0), null, null, new C32W(null), 3);
        }
        FN6.LIZJ(new ARunnableS45S0100000_9((InboxFragment) aqS98S0300000_9.l0, 63));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v92, types: [X.4nI] */
    public static final Object invoke$5(AqS98S0300000_9 aqS98S0300000_9) {
        int i;
        int i2;
        int i3;
        boolean z;
        MutableLiveData<Boolean> LJIILJJIL;
        int i4;
        InboxFragment.xl((InboxFragment) aqS98S0300000_9.l0, (View) aqS98S0300000_9.l1, (Bundle) aqS98S0300000_9.l2);
        InboxFragment inboxFragment = (InboxFragment) aqS98S0300000_9.l0;
        ViewGroup.LayoutParams layoutParams = inboxFragment._$_findCachedViewById(R.id.n2e).getLayoutParams();
        Context context = inboxFragment.getContext();
        if (context != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        layoutParams.height = i;
        C119354mJ c119354mJ = (C119354mJ) inboxFragment._$_findCachedViewById(R.id.l9q);
        if (c119354mJ != null) {
            c119354mJ.setActive(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJII());
        }
        C54072LKa c54072LKa = inboxFragment.LLF;
        TuxIconView backIconView = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.aei);
        o.LJIIIIZZ(backIconView, "backIconView");
        c54072LKa.LIZ(backIconView);
        inboxFragment.Yl();
        boolean Wl = inboxFragment.Wl();
        Integer valueOf = Integer.valueOf(R.attr.go);
        if (Wl) {
            if (C53339KwZ.LIZLLL()) {
                TuxIconView tuxIconView = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v.LIZ = R.raw.icon_camera;
                c2068389v.LJ = valueOf;
                tuxIconView.setTuxIcon(c2068389v);
                if (inboxFragment.Wl()) {
                    C16880lQ.LJJJ((TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg), new ACListenerS21S0100000_1(inboxFragment, 208));
                }
            } else {
                ((ImageView) inboxFragment._$_findCachedViewById(R.id.byg)).setVisibility(8);
            }
            View imSearchEntranceView = inboxFragment._$_findCachedViewById(R.id.edn);
            o.LJIIIIZZ(imSearchEntranceView, "imSearchEntranceView");
            V1B.LJLLLLLL(imSearchEntranceView);
        } else {
            ((ImageView) inboxFragment._$_findCachedViewById(R.id.byg)).setVisibility(0);
            LV9 groupChatService = IMService.createIIMServicebyMonsterPlugin(false).getGroupChatService();
            if (C53339KwZ.LIZLLL()) {
                TuxIconView tuxIconView2 = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg);
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZIZ = C7MY.LIZIZ(26);
                c2068389v2.LIZJ = C7MY.LIZIZ(26);
                c2068389v2.LIZ = R.raw.icon_circle_plus;
                c2068389v2.LJ = Integer.valueOf(R.attr.gq);
                tuxIconView2.setTuxIcon(c2068389v2);
            } else if (groupChatService.LIZJ()) {
                TuxIconView tuxIconView3 = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg);
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v3.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                int LIZ = C00F.LIZ(31744, 0, "im_group_chat_creation_inbox_page_optimization", false);
                if (LIZ != 1) {
                    if (LIZ != 2) {
                        if (LIZ != 3) {
                            i3 = R.raw.icon_create_group;
                        } else {
                            i3 = R.raw.icon_circle_plus;
                        }
                    } else {
                        i3 = R.raw.icon_pen_on_paper;
                    }
                } else {
                    i3 = R.raw.icon_chat_plus;
                }
                c2068389v3.LIZ = i3;
                c2068389v3.LJ = valueOf;
                tuxIconView3.setTuxIcon(c2068389v3);
                Context requireContext = inboxFragment.requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                TuxIconView createChatView = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg);
                o.LJIIIIZZ(createChatView, "createChatView");
                groupChatService.LIZLLL(requireContext, createChatView);
            } else {
                TuxIconView tuxIconView4 = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg);
                C2068389v c2068389v4 = new C2068389v();
                c2068389v4.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                c2068389v4.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
                int LIZ2 = C00F.LIZ(31744, 0, "im_group_chat_creation_inbox_page_optimization", false);
                if (LIZ2 != 1) {
                    if (LIZ2 == 2 || LIZ2 != 3) {
                        i2 = R.raw.icon_pen_on_paper;
                    } else {
                        i2 = R.raw.icon_circle_plus;
                    }
                } else {
                    i2 = R.raw.icon_chat_plus;
                }
                c2068389v4.LIZ = i2;
                c2068389v4.LJ = valueOf;
                tuxIconView4.setTuxIcon(c2068389v4);
            }
            C16880lQ.LJJJ((TuxIconView) inboxFragment._$_findCachedViewById(R.id.byg), new ACListenerS36S0200000_1(groupChatService, inboxFragment, 55));
            C54072LKa c54072LKa2 = inboxFragment.LLF;
            View createChatView2 = inboxFragment._$_findCachedViewById(R.id.byg);
            o.LJIIIIZZ(createChatView2, "createChatView");
            TuxIconView imSearchEntranceView2 = (TuxIconView) inboxFragment._$_findCachedViewById(R.id.edn);
            o.LJIIIIZZ(imSearchEntranceView2, "imSearchEntranceView");
            c54072LKa2.getClass();
            C221018lt.LJFF("InboxPageHelper", "adjustCreateChatOrSearchEntranceViewIfNeed");
            C53330KwQ.LIZ.getClass();
            if (C53330KwQ.LIZ() == 2 || C53330KwQ.LIZ() == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((RBX) HG3.LJIILL()).isLogin()) {
                V1B.LJLZ(imSearchEntranceView2);
                C16880lQ.LJJJ(imSearchEntranceView2, new ACListenerS21S0100000_1(c54072LKa2, 179));
                if (C53765L8f.LJIILJJIL()) {
                    ViewGroup.LayoutParams layoutParams2 = imSearchEntranceView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.removeRule(21);
                        layoutParams3.addRule(17, R.id.byg);
                        layoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                        imSearchEntranceView2.setLayoutParams(layoutParams3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                } else if (C53765L8f.LJIIIIZZ("NOTIFICATION") == 1) {
                    ViewGroup.LayoutParams layoutParams4 = createChatView2.getLayoutParams();
                    if (layoutParams4 != null) {
                        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                        layoutParams5.removeRule(20);
                        layoutParams5.addRule(21, -1);
                        layoutParams5.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                        layoutParams5.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                        createChatView2.setLayoutParams(layoutParams5);
                        ViewGroup.LayoutParams layoutParams6 = imSearchEntranceView2.getLayoutParams();
                        if (layoutParams6 != null) {
                            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                            layoutParams7.removeRule(21);
                            layoutParams7.addRule(16, R.id.byg);
                            layoutParams7.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                            layoutParams7.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                            imSearchEntranceView2.setLayoutParams(layoutParams7);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    }
                }
            } else {
                V1B.LJLLLLLL(imSearchEntranceView2);
                ViewGroup.LayoutParams layoutParams8 = createChatView2.getLayoutParams();
                if (layoutParams8 != null) {
                    RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                    if (!C53765L8f.LJIILJJIL()) {
                        layoutParams9.removeRule(20);
                        layoutParams9.addRule(21, -1);
                        layoutParams9.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                        layoutParams9.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    }
                    createChatView2.setLayoutParams(layoutParams9);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            }
        }
        inboxFragment.getContext();
        inboxFragment.LJLJLJ = new FixedLinearlayoutManager(0);
        final Context requireContext2 = inboxFragment.requireContext();
        inboxFragment.LJLJL = new C1C9(requireContext2) { // from class: X.4nI
            @Override // X.C1C9
            public final int LJIILJJIL() {
                return -1;
            }

            @Override // X.C1C9
            public final float LJIIJ(DisplayMetrics displayMetrics) {
                if (displayMetrics != null) {
                    return 50.0f / displayMetrics.densityDpi;
                }
                throw new NullPointerException("densityDpi");
            }
        };
        if (((Boolean) L08.LIZJ.getValue()).booleanValue()) {
            inboxFragment._$_findCachedViewById(R.id.ekg).setBackground(null);
            C221018lt.LJFF("InboxJankOptimizationV2", "inboxRecyclerView.background = null");
        }
        RecyclerView recyclerView = (RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg);
        FixedLinearlayoutManager fixedLinearlayoutManager = inboxFragment.LJLJLJ;
        if (fixedLinearlayoutManager != null) {
            recyclerView.setLayoutManager(fixedLinearlayoutManager);
            ((RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg)).setAdapter(inboxFragment.Jl());
            IIMSearchEntranceWidget iIMSearchEntranceWidget = (IIMSearchEntranceWidget) inboxFragment.LJZL.getValue();
            if (iIMSearchEntranceWidget != null) {
                InterfaceC111984aQ searchService = IMService.createIIMServicebyMonsterPlugin(false).getSearchService();
                K2B inboxRecyclerView = (K2B) inboxFragment._$_findCachedViewById(R.id.ekg);
                o.LJIIIIZZ(inboxRecyclerView, "inboxRecyclerView");
                searchService.LIZJ(inboxRecyclerView, iIMSearchEntranceWidget);
            }
            if (((Boolean) C52716KmW.LIZIZ.getValue()).booleanValue()) {
                ((RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg)).setItemAnimator(null);
                C221018lt.LJFF("InboxFragment", "first no item animator");
            } else {
                ((RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg)).setItemAnimator(inboxFragment.Ml());
                C221018lt.LJFF("InboxFragment", "first has item animator");
            }
            if (((Boolean) C46604IQu.LIZLLL.getValue()).booleanValue() && !C3TE.LIZIZ()) {
                ArrayList arrayList = new ArrayList();
                Object value = inboxFragment.LJLLLL.getValue();
                if (value != null) {
                    arrayList.add(value);
                }
                if (!IRI.LIZ()) {
                    arrayList.add(inboxFragment.Ol());
                    InboxAdapterWidget Rl = inboxFragment.Rl();
                    if (Rl != null) {
                        arrayList.add(Rl);
                    }
                } else {
                    arrayList.add(inboxFragment.Il());
                }
                InboxAdapterWidget Nl = inboxFragment.Nl();
                if (Nl != null) {
                    arrayList.add(Nl);
                }
                RecyclerView inboxRecyclerView2 = (RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg);
                o.LJIIIIZZ(inboxRecyclerView2, "inboxRecyclerView");
                View titleDivideLine = inboxFragment._$_findCachedViewById(R.id.l9k);
                o.LJIIIIZZ(titleDivideLine, "titleDivideLine");
                Context context2 = inboxRecyclerView2.getContext();
                if (((Boolean) C46604IQu.LJFF.getValue()).booleanValue()) {
                    i4 = 84;
                } else {
                    i4 = 76;
                }
                float LIZIZ = C7MY.LIZIZ(i4);
                o.LJIIIIZZ(context2, "context");
                inboxRecyclerView2.LJII(new C56634MKo(arrayList, AnonymousClass636.LJIIIIZZ(R.attr.dz, context2), AnonymousClass391.LIZ(0.32d), LIZIZ), -1);
                Integer num = (Integer) LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL().LIZJ(0, "live_inbox_skylight_avatar_live_tag_style");
                if (num == null || num.intValue() != 0) {
                    titleDivideLine.setVisibility(8);
                } else {
                    titleDivideLine.setVisibility(0);
                }
            }
            if (((Boolean) C56334M9a.LJI.getValue()).booleanValue()) {
                RecyclerView recyclerView2 = (RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg);
                float floatValue = ((Number) IJ0.LIZ.getValue()).floatValue();
                if (recyclerView2 != null) {
                    try {
                        int maxFlingVelocity = recyclerView2.getMaxFlingVelocity();
                        Field LIZ3 = C36496EUa.LIZ(RecyclerView.class, "mMaxFlingVelocity");
                        if (LIZ3 != null) {
                            LIZ3.setAccessible(true);
                            LIZ3.set(recyclerView2, Integer.valueOf((int) (maxFlingVelocity * floatValue)));
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            C56649MLd.LIZ((RecyclerView) inboxFragment._$_findCachedViewById(R.id.ekg), inboxFragment.Ql());
            inboxFragment.Ql().setOnRefreshListener(inboxFragment);
            inboxFragment.Ql().setNestedScrollEnabledWhenNonTouch(false);
            if (IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJI()) {
                View _$_findCachedViewById = inboxFragment._$_findCachedViewById(R.id.eki);
                if (_$_findCachedViewById != null) {
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
                    _$_findCachedViewById.setVisibility(0);
                    Rect rect = new Rect();
                    _$_findCachedViewById.getHitRect(rect);
                    rect.left -= LJJIIZ;
                    rect.right += LJJIIZ;
                    rect.top -= LJJIIZ;
                    rect.bottom += LJJIIZ;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, _$_findCachedViewById);
                    Object parent = _$_findCachedViewById.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type android.view.View");
                    ((View) parent).setTouchDelegate(touchDelegate);
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
                    c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                    Context context3 = _$_findCachedViewById.getContext();
                    o.LJIIIIZZ(context3, "container.context");
                    _$_findCachedViewById.setBackground(c110614Vt.LIZ(context3));
                }
            } else {
                View _$_findCachedViewById2 = inboxFragment._$_findCachedViewById(R.id.eki);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setVisibility(8);
                }
            }
            InboxFragment inboxFragment2 = (InboxFragment) aqS98S0300000_9.l0;
            Iterator<InboxAdapterWidget> it = inboxFragment2.Tl().iterator();
            while (it.hasNext()) {
                inboxFragment2.Xl(it.next());
            }
            InboxFragment inboxFragment3 = (InboxFragment) aqS98S0300000_9.l0;
            inboxFragment3.getClass();
            IMService.createIIMServicebyMonsterPlugin(false).getImChatService().LJIIJ(inboxFragment3);
            InboxFragment inboxFragment4 = (InboxFragment) aqS98S0300000_9.l0;
            inboxFragment4.Kl().LJLJJLL.observe(inboxFragment4, new AObserverS77S0100000_9(inboxFragment4, 80));
            inboxFragment4.Kl().LJLJL.observe(inboxFragment4, new AObserverS77S0100000_9(inboxFragment4, 81));
            List<InboxAdapterWidget> Tl = inboxFragment4.Tl();
            if (!(Tl instanceof Collection) || !Tl.isEmpty()) {
                Iterator<InboxAdapterWidget> it2 = Tl.iterator();
                while (it2.hasNext()) {
                    if (o.LJ(it2.next(), inboxFragment4.Pl())) {
                        break;
                    }
                }
            }
            inboxFragment4.Kl().LJLJJL.observe(inboxFragment4, new AObserverS77S0100000_9(inboxFragment4, 83));
            InboxAdapterWidget Nl2 = inboxFragment4.Nl();
            if (Nl2 != null) {
                LiveData<Integer> LJIIL = Nl2.LJIIL();
                if (LJIIL != null) {
                    LJIIL.observe(Nl2, new AObserverS77S0100000_9(inboxFragment4, 78));
                }
            } else {
                inboxFragment4.Dl();
            }
            inboxFragment4.Kl().LJLJLLL.observe(inboxFragment4, new AObserverS77S0100000_9(inboxFragment4, 82));
            InboxFragment inboxFragment5 = (InboxFragment) aqS98S0300000_9.l0;
            InboxAdapterWidget Rl2 = inboxFragment5.Rl();
            if (Rl2 != null && (LJIILJJIL = Rl2.LJIILJJIL()) != null) {
                LJIILJJIL.observe(inboxFragment5, new Observer() { // from class: X.2aG
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("sessionList widget expanded state: ");
                        LIZ4.append(obj);
                        C221018lt.LJFF("InboxFragment", X1D.LIZIZ(LIZ4));
                    }
                });
            }
            ((InboxFragment) aqS98S0300000_9.l0).Zl();
            return C76800UCe.LIZ;
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    public static final Object invoke$7(AqS98S0300000_9 aqS98S0300000_9) {
        MLW mlw;
        NotificationFragment.Gl((NotificationFragment) aqS98S0300000_9.l0, (View) aqS98S0300000_9.l1, (Bundle) aqS98S0300000_9.l2);
        if (!((NotificationFragment) aqS98S0300000_9.l0).LJZ) {
            Context context = ((View) aqS98S0300000_9.l1).getContext();
            if (context != null) {
                C56812MRk.LIZ = C56812MRk.LIZJ(context);
            }
            NotificationFragment notificationFragment = (NotificationFragment) aqS98S0300000_9.l0;
            View view = (View) aqS98S0300000_9.l1;
            Context context2 = notificationFragment.getContext();
            if (context2 != null) {
                Integer LJI = C79045V0n.LJI(R.attr.cl, context2);
                if (LJI != null) {
                    view.setBackgroundColor(LJI.intValue());
                }
                C16880lQ.LJIJ((RelativeLayout) notificationFragment._$_findCachedViewById(R.id.j5z), MRZ.LJLIL);
                notificationFragment.Il().setOnRefreshListener(new AqS159S0100000_9(notificationFragment, 1027));
                notificationFragment.Il().setNestedScrollEnabledWhenNonTouch(false);
                notificationFragment.getContext();
                FixedLinearlayoutManager fixedLinearlayoutManager = new FixedLinearlayoutManager();
                notificationFragment.w6().setAdapter(notificationFragment.Hl());
                notificationFragment.w6().setLayoutManager(fixedLinearlayoutManager);
                C56649MLd.LIZ(notificationFragment.w6(), notificationFragment.Il());
                notificationFragment.w6().LJIIJJI(notificationFragment.LLFFF);
                notificationFragment.w6().LJIIJJI(new MQ1(notificationFragment.getContext()));
                notificationFragment.w6().setClipToPadding(false);
                notificationFragment.w6().setPadding(0, 0, 0, (int) KL2.LIZJ(notificationFragment.getContext(), 19.0f));
                MSQ msq = new MSQ();
                RecyclerView recyclerView = notificationFragment.w6();
                o.LJIIIIZZ(recyclerView, "recyclerView");
                msq.LIZ(recyclerView, fixedLinearlayoutManager, notificationFragment.LLFII);
                LogHelper LJIIIIZZ = LogHelperImpl.LJIIIIZZ();
                RecyclerView recyclerView2 = notificationFragment.w6();
                o.LJIIIIZZ(recyclerView2, "recyclerView");
                LJIIIIZZ.LIZ(recyclerView2);
                notificationFragment.Ml();
                if (INB.LIZIZ()) {
                    ((TuxIconView) notificationFragment._$_findCachedViewById(R.id.aei)).setTintColorRes(R.attr.go);
                    ((ImageView) notificationFragment._$_findCachedViewById(R.id.aei)).setVisibility(0);
                    C16880lQ.LJJJ((TuxIconView) notificationFragment._$_findCachedViewById(R.id.aei), new ACListenerS39S0200000_4(notificationFragment, context2, 117));
                    C61713OJx LIZIZ = C61712OJw.LIZIZ(notificationFragment);
                    LIZIZ.LJII(R.attr.cl);
                    LIZIZ.LJ(R.attr.cl);
                    LIZIZ.LIZ(true);
                    LIZIZ.LIZJ();
                } else {
                    C54072LKa c54072LKa = notificationFragment.LLF;
                    TuxIconView backIconView = (TuxIconView) notificationFragment._$_findCachedViewById(R.id.aei);
                    o.LJIIIIZZ(backIconView, "backIconView");
                    c54072LKa.LIZ(backIconView);
                    notificationFragment._$_findCachedViewById(R.id.n2e).getLayoutParams().height = C63081OpJ.LJJJJLI(context2);
                }
            }
            NotificationFragment notificationFragment2 = (NotificationFragment) aqS98S0300000_9.l0;
            ((LiveData) notificationFragment2.Kl().LJLJJI.getValue()).observe(notificationFragment2, new AObserverS77S0100000_9(notificationFragment2, 134));
            notificationFragment2.Nl(notificationFragment2.Kl().az(), true);
            NotificationVM Kl = notificationFragment2.Kl();
            if (L0H.LIZ()) {
                mlw = MLW.PRELOAD_FORM_CACHE_AND_REFRESH;
            } else {
                mlw = MLW.FIRST_REFRESH;
            }
            Kl.jv0(mlw);
            if (C56805MRd.LIZJ()) {
                EnumC56806MRe.LJLJL.LJ();
                EnumC56806MRe.LJLJLJ.LJ();
            }
        }
        C53754L7u.LIZIZ.LIZ(((NotificationFragment) aqS98S0300000_9.l0).mo49getActivity());
        M9M.LIZIZ();
        M9M.LIZIZ = System.currentTimeMillis();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS98S0300000_9 aqS98S0300000_9) {
        String str;
        INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
        WeakHandler weakHandler = new WeakHandler((ProfileFollowMessageComponent) aqS98S0300000_9.l0);
        String uid = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LJJJJJ.LJIILL(weakHandler, uid);
        ((C188717at) aqS98S0300000_9.l2).LIZIZ();
        String enterFrom = ((ProfileFollowMessageComponent) aqS98S0300000_9.l0).getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String uid2 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        C26335AVf.LJIIJJI(1, enterFrom, uid2);
        String uid3 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid3, "user.uid");
        if (((User) aqS98S0300000_9.l1).getFollowStatus() == 1) {
            str = "mutual";
        } else {
            str = "single";
        }
        C26335AVf.LJIIIZ(uid3, str, AXU.LIZJ((User) aqS98S0300000_9.l1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS98S0300000_9 aqS98S0300000_9) {
        INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
        WeakHandler weakHandler = new WeakHandler((ProfileFollowMessageComponent) aqS98S0300000_9.l0);
        String uid = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        LJJJJJ.LJ(weakHandler, uid);
        ((C188717at) aqS98S0300000_9.l2).LIZIZ();
        String enterFrom = ((ProfileFollowMessageComponent) aqS98S0300000_9.l0).getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        String uid2 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        C26335AVf.LJIIJJI(0, enterFrom, uid2);
        String uid3 = ((User) aqS98S0300000_9.l1).getUid();
        o.LJIIIIZZ(uid3, "user.uid");
        C26335AVf.LJIIJ(uid3, AXU.LIZJ((User) aqS98S0300000_9.l1));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS98S0300000_9(X.ActivityC45651qj r3, X.ActivityC45651qj r4, com.ss.android.ugc.aweme.ui.NearbyFeedContentAssem r5, X.InterfaceC65784Pro<X.C76800UCe> r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 12: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS98S0300000_9.<init>(X.1qj, com.ss.android.ugc.aweme.ui.NearbyFeedContentAssem, X.Pro, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(ActivityC45651qj activityC45651qj, C55252LmK c55252LmK, C55239Lm7 c55239Lm7, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c55252LmK;
        this.l2 = c55239Lm7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(L9X l9x, C208108Es c208108Es, C76732zl c76732zl, int i) {
        super(0);
        this.$t = i;
        this.l0 = l9x;
        this.l1 = c208108Es;
        this.l2 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS98S0300000_9(InterfaceC55235Lm3 interfaceC55235Lm3, InterfaceC55235Lm3 interfaceC55235Lm32, InterfaceC55102Lju interfaceC55102Lju, Class<? extends C2K0> cls) {
        super(0);
        this.$t = cls;
        this.l0 = interfaceC55235Lm3;
        this.l1 = interfaceC55235Lm32;
        this.l2 = interfaceC55102Lju;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(C55783Lut c55783Lut, User user, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = c55783Lut;
        this.l1 = user;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS98S0300000_9(Context context, Context context2, InlineLink inlineLink, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        super(0);
        this.$t = interfaceC88472Yns;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = inlineLink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(InboxFragment inboxFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(0);
        this.$t = i;
        this.l0 = inboxFragment;
        this.l1 = layoutInflater;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(InboxFragment inboxFragment, View view, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = inboxFragment;
        this.l1 = view;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(BaseNotice baseNotice, BaseResponse baseResponse, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseNotice;
        this.l1 = baseResponse;
        this.l2 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(NotificationFragment notificationFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(0);
        this.$t = i;
        this.l0 = notificationFragment;
        this.l1 = layoutInflater;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(NotificationFragment notificationFragment, View view, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = notificationFragment;
        this.l1 = view;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(NearbyLocationPermissionRequestBaseAssem nearbyLocationPermissionRequestBaseAssem, TokenCert tokenCert, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = nearbyLocationPermissionRequestBaseAssem;
        this.l1 = tokenCert;
        this.l2 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(LatestUnreadVideoInfo latestUnreadVideoInfo, MufUserCell mufUserCell, C57792MmC c57792MmC, int i) {
        super(0);
        this.$t = i;
        this.l0 = latestUnreadVideoInfo;
        this.l1 = mufUserCell;
        this.l2 = c57792MmC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(ProfileFollowMessageComponent profileFollowMessageComponent, User user, C188717at c188717at, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileFollowMessageComponent;
        this.l1 = user;
        this.l2 = c188717at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(UserProfileFollowAssem userProfileFollowAssem, User user, C188717at c188717at, int i) {
        super(0);
        this.$t = i;
        this.l0 = userProfileFollowAssem;
        this.l1 = user;
        this.l2 = c188717at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(NearbySkylightBaseAssem nearbySkylightBaseAssem, TokenCert tokenCert, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = nearbySkylightBaseAssem;
        this.l1 = tokenCert;
        this.l2 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS98S0300000_9(HeaderCTASocialInteractionComponent headerCTASocialInteractionComponent, User user, C188717at c188717at, int i) {
        super(0);
        this.$t = i;
        this.l0 = headerCTASocialInteractionComponent;
        this.l1 = user;
        this.l2 = c188717at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS98S0300000_9(Class cls, Class<? extends T> cls2, T t, InterfaceC55235Lm3 interfaceC55235Lm3) {
        super(0);
        this.$t = interfaceC55235Lm3;
        this.l0 = cls;
        this.l1 = cls2;
        this.l2 = t;
    }
}
