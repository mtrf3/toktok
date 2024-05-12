package kotlin.jvm.internal;

import X.A21;
import X.AKH;
import X.AML;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C0A2;
import X.C16880lQ;
import X.C2068389v;
import X.C212428Vi;
import X.C234999Kd;
import X.C235079Kl;
import X.C240719cZ;
import X.C245479kF;
import X.C26045AKb;
import X.C26049AKf;
import X.C26773Af3;
import X.C27565Arp;
import X.C27919AxX;
import X.C32151Nz;
import X.C38333F2r;
import X.C3C1;
import X.C51029K0z;
import X.C55096Ljo;
import X.C5S1;
import X.C65352Pkq;
import X.C70961Rt7;
import X.C72912tb;
import X.C74587TPb;
import X.C76542zS;
import X.C76800UCe;
import X.C78685UuP;
import X.C78946Uyc;
import X.C78983UzD;
import X.C80896Voy;
import X.C8VC;
import X.C8W0;
import X.C99H;
import X.C9KV;
import X.C9TY;
import X.EnumC235129Kq;
import X.EnumC241749eE;
import X.InterfaceC235069Kk;
import X.InterfaceC73150SnK;
import X.InterfaceC88473Ynt;
import X.KL2;
import X.O6R;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.PdpSkuHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.music.assem.MusicMiniBarAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCoverAssem;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesListAssem;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui.ProfileEditPronounsNavBarAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.user.UserNavBarBellAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NavBarBellData;
import com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarBellComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class IDqS429S0100000_4 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(C26773Af3 c26773Af3, int i) {
        super(3);
        this.$t = i;
        this.l0 = c26773Af3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(LogisticSelectFragment logisticSelectFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = logisticSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(OrderSubmitActivity orderSubmitActivity, int i) {
        super(3);
        this.$t = i;
        this.l0 = orderSubmitActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(OrderSubmitFragment orderSubmitFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = orderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(PaymentHalfFragment paymentHalfFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(PdpSkuHolderV2 pdpSkuHolderV2, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpSkuHolderV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(MusicMiniBarAssem musicMiniBarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = musicMiniBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(MusicCellCoverAssem musicCellCoverAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = musicCellCoverAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(ManageSeriesListAssem manageSeriesListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = manageSeriesListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(ProfileEditPronounsNavBarAssem profileEditPronounsNavBarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileEditPronounsNavBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(User user, int i) {
        super(3);
        this.$t = i;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(MineProfileInfoAssem mineProfileInfoAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = mineProfileInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(UserNavBarBellAssem userNavBarBellAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = userNavBarBellAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS429S0100000_4(NavBarBellComponent navBarBellComponent, int i) {
        super(3);
        this.$t = i;
        this.l0 = navBarBellComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS429S0100000_4(HashMap hashMap, HashMap<String, Object> hashMap2) {
        super(3);
        this.$t = hashMap2;
        this.l0 = hashMap;
    }

    public final void invoke$0(AML selectSubscribe, boolean z, String str) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        try {
            if (z) {
                AKH loadingPopupWindow = ((OrderSubmitFragment) this.l0).getLoadingPopupWindow();
                if (str == null) {
                    str = ((OrderSubmitFragment) this.l0).requireContext().getString(R.string.fb3);
                    o.LJIIIIZZ(str, "requireContext().getStri…_risk_delay_layer_backup)");
                }
                loadingPopupWindow.LIZ.LJ = str;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_bell;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                loadingPopupWindow.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT)));
                A21 a21 = loadingPopupWindow.LIZ;
                a21.LJIIIIZZ = LJJIIZ;
                a21.LIZJ = false;
                loadingPopupWindow.LIZIZ();
                C78946Uyc.LJJII((OrderSubmitFragment) this.l0, new C70961Rt7(), new AqS170S0100000_4((OrderSubmitFragment) this.l0, 258));
                return;
            }
            ((OrderSubmitFragment) this.l0).getLoadingPopupWindow().LIZ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final Object invoke$0(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        PaymentInfo pi = (PaymentInfo) obj;
        o.LJIIIZ(pi, "pi");
        HashMap<String, Object> hashMap = ((OrderSubmitActivity) iDqS429S0100000_4.l0).LLII().LLIL;
        if (hashMap != null) {
            hashMap.put("previous_page", "payment_method");
        }
        ((OrderSubmitActivity) iDqS429S0100000_4.l0).LLII().Tw0(pi, false);
        OrderSubmitViewModel LLII = ((OrderSubmitActivity) iDqS429S0100000_4.l0).LLII();
        LLII.getClass();
        LLII.withState(new AqS170S0100000_4(LLII, 1236));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        InterfaceC73150SnK selectSubscribe = (InterfaceC73150SnK) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(obj2, "<anonymous parameter 0>");
        o.LJIIIZ(obj3, "<anonymous parameter 1>");
        selectSubscribe.withState(((LogisticSelectFragment) iDqS429S0100000_4.l0).getViewModel(), new AqS170S0100000_4((LogisticSelectFragment) iDqS429S0100000_4.l0, 238));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        C8W0 selectSubscribe = (C8W0) obj;
        AbstractC72932td request = (AbstractC72932td) obj2;
        EnumC235129Kq action = (EnumC235129Kq) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(action, "action");
        C80896Voy c80896Voy = ((MineProfileInfoAssem) iDqS429S0100000_4.l0).LJLIL;
        if (c80896Voy != null) {
            c80896Voy.setRefreshing(false);
        }
        if (request instanceof C72912tb) {
            User user = (User) request.LIZ();
            if (user != null) {
                C235079Kl.LIZIZ((MineProfileInfoAssem) iDqS429S0100000_4.l0, user, action, false, 4);
                ((C9KV) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(C9KV.class), null)).LJJLJLI(user);
                ((C9KV) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(C9KV.class), null)).LLILZIL(user);
                long LIZ = C99H.LIZ();
                long friendCount = user.getFriendCount();
                if (friendCount > LIZ) {
                    Object value = C99H.LIZ.getValue();
                    o.LJIIIIZZ(value, "<get-repo>(...)");
                    ((Keva) value).storeLong(C9TY.LIZ("history_max_muf_count"), friendCount);
                }
            }
        } else if (request instanceof C3C1) {
            Throwable th = ((C3C1) request).LIZ;
            if (th instanceof C38333F2r) {
                C38333F2r c38333F2r = (C38333F2r) th;
                int errorCode = c38333F2r.getErrorCode();
                if (!TextUtils.isEmpty(c38333F2r.getErrorMsg()) && selectSubscribe.getContext() != null && errorCode != 3070 && errorCode != 3071 && errorCode != 3072) {
                    C5S1 c5s1 = new C5S1(selectSubscribe.getContext());
                    c5s1.LIZLLL(c38333F2r.getErrorMsg());
                    c5s1.LJ();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS429S0100000_4 iDqS429S0100000_4, Object selectSubscribe, Object obj, Object obj2) {
        User user;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            UserNavBarBellAssem userNavBarBellAssem = (UserNavBarBellAssem) iDqS429S0100000_4.l0;
            C245479kF c245479kF = userNavBarBellAssem.LJLJJI;
            if (c245479kF != null) {
                c245479kF.setBellIcon(userNavBarBellAssem.v3(intValue));
            }
            C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(userNavBarBellAssem, C65352Pkq.LIZ(InterfaceC235069Kk.class));
            if (c234999Kd != null) {
                user = c234999Kd.LIZ;
                if (user != null) {
                    user.setLivePushNotificationStatus(intValue);
                }
            } else {
                user = null;
            }
            C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(userNavBarBellAssem, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        User user;
        C8W0 selectSubscribe = (C8W0) obj;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj2 != null) {
            NavBarBellComponent navBarBellComponent = (NavBarBellComponent) iDqS429S0100000_4.l0;
            C245479kF c245479kF = navBarBellComponent.LJLJJL;
            if (c245479kF != null) {
                c245479kF.setBellIcon(navBarBellComponent.v3(intValue));
            }
            UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), UserProfileAbility.class, null);
            if (userProfileAbility != null) {
                user = userProfileAbility.getUser();
                if (user != null) {
                    user.setLivePushNotificationStatus(intValue);
                }
            } else {
                user = null;
            }
            NavBarBellData navBarBellData = (NavBarBellData) navBarBellComponent.bizBaseData;
            if (navBarBellData != null) {
                navBarBellData.setLivePushNotificationStatus(Integer.valueOf(intValue));
            }
            UserProfileAbility userProfileAbility2 = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), UserProfileAbility.class, null);
            if (userProfileAbility2 != null) {
                userProfileAbility2.Pe0(user, EnumC235129Kq.NORMAL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        View view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        if (!booleanValue) {
            C26049AKf.LIZ(((PdpSkuHolderV2) iDqS429S0100000_4.l0).itemView, toastMsg);
        } else {
            PdpViewModel vm = ((PdpSkuHolderV2) iDqS429S0100000_4.l0).getVm();
            Context context = ((PdpSkuHolderV2) iDqS429S0100000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C27565Arp c27565Arp = ((PdpSkuHolderV2) iDqS429S0100000_4.l0).getVm().LLJLLL;
            View view2 = null;
            if (c27565Arp != null && (view = c27565Arp.LIZ.LLFZ) != null) {
                view2 = view.findViewById(R.id.wn);
            }
            vm.Pv0(context, view2, toastMsg, obj3, LifecycleOwnerKt.getLifecycleScope((PdpSkuHolderV2) iDqS429S0100000_4.l0));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        String quitType = (String) obj3;
        o.LJIIIZ(quitType, "quitType");
        C76542zS.LIZJ("tiktokec_stay_page", new AqS9S1100100_4(quitType, (String) (SystemClock.elapsedRealtime() - longValue), (long) iDqS429S0100000_4.l0, (HashMap<String, Object>) 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        String quitType = (String) obj3;
        o.LJIIIZ(quitType, "quitType");
        C76542zS.LIZJ("tiktokec_stay_page", new AqS9S1100100_4(quitType, (String) (SystemClock.elapsedRealtime() - longValue), (long) iDqS429S0100000_4.l0, (HashMap<String, Object>) 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        long longValue = ((Number) obj3).longValue();
        C26773Af3 c26773Af3 = (C26773Af3) iDqS429S0100000_4.l0;
        if (c26773Af3 != null) {
            c26773Af3.LJJJIL(longValue, false);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(IDqS429S0100000_4 iDqS429S0100000_4, Object selectSubscribe, Object obj, Object obj2) {
        C27919AxX c27919AxX = (C27919AxX) obj;
        String str = (String) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c27919AxX != null) {
            Context context = ((OrderSubmitFragment) iDqS429S0100000_4.l0)._$_findCachedViewById(R.id.isn).getContext();
            o.LJIIIIZZ(context, "recycler_view.context");
            C74587TPb c74587TPb = new C74587TPb(context);
            c74587TPb.LIZ = ((Number) c27919AxX.LIZ).intValue();
            C0A2 layoutManager = ((RecyclerView) ((OrderSubmitFragment) iDqS429S0100000_4.l0)._$_findCachedViewById(R.id.isn)).getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                layoutManager.LLIIIILZ(c74587TPb);
            }
            if (C78685UuP.LJJJZ(str)) {
                C26045AKb c26045AKb = new C26045AKb((OrderSubmitFragment) iDqS429S0100000_4.l0);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        iDqS429S0100000_4.invoke$0((AML) obj, ((Boolean) obj2).booleanValue(), (String) obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS429S0100000_4 iDqS429S0100000_4, Object paymentInfo, Object obj, Object obj2) {
        o.LJIIIZ(paymentInfo, "paymentInfo");
        ((PaymentHalfFragment) iDqS429S0100000_4.l0).LJLILLLLZI.invoke(paymentInfo, obj, obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        View findViewById;
        UIAssem selectSubscribe = (UIAssem) obj;
        C240719cZ c240719cZ = (C240719cZ) obj2;
        EnumC241749eE status = (EnumC241749eE) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        if (c240719cZ != null) {
            C78983UzD.LJJLIIIJL(selectSubscribe.getContainerView());
            ((MusicMiniBarAssem) iDqS429S0100000_4.l0).v3(c240719cZ);
            ActivityC45651qj LIZ = C212428Vi.LIZ(selectSubscribe);
            if (LIZ != null && (findViewById = LIZ.findViewById(R.id.gu0)) != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), ((MusicMiniBarAssem) iDqS429S0100000_4.l0).A3().getBottomBarHeight() + ((int) KL2.LIZJ(selectSubscribe.getContext(), 64.0f)));
            }
        }
        ((MusicMiniBarAssem) iDqS429S0100000_4.l0).x3(status);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        String str;
        MusicModel musicModel;
        ReusedAssem selectSubscribe = (ReusedAssem) obj;
        C240719cZ c240719cZ = (C240719cZ) obj2;
        EnumC241749eE status = (EnumC241749eE) obj3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        if (c240719cZ != null && (musicModel = c240719cZ.LJLIL) != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (o.LJ(str, ((C240719cZ) C51029K0z.LJIILLIIL(selectSubscribe)).LJLIL.getMusicId())) {
            ((MusicCellCoverAssem) iDqS429S0100000_4.l0).n4(status);
        } else {
            ((MusicCellCoverAssem) iDqS429S0100000_4.l0).n4(EnumC241749eE.DEFAULT);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS429S0100000_4 iDqS429S0100000_4, Object obj, Object obj2, Object obj3) {
        PushSettingFollowListAdapter.FollowItemViewHolder selectSubscribe = (PushSettingFollowListAdapter.FollowItemViewHolder) obj;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj2 != null) {
            User user = (User) iDqS429S0100000_4.l0;
            if (selectSubscribe.LJLJJLL) {
                ((PushSettingNotificationChoiceViewModel) selectSubscribe.LJLJL.getValue()).LJLJLLL = true;
                selectSubscribe.LJLJJLL = false;
            } else {
                user.setLivePushNotificationStatus(intValue);
                selectSubscribe.N(intValue);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        if (r6 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.IDqS429S0100000_4 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS429S0100000_4.invoke$8(kotlin.jvm.internal.IDqS429S0100000_4, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(IDqS429S0100000_4 iDqS429S0100000_4, Object selectSubscribe, Object obj, Object obj2) {
        String newPronouns = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(newPronouns, "newPronouns");
        if (booleanValue) {
            ((ProfileEditPronounsNavBarAssem) iDqS429S0100000_4.l0).L3(newPronouns);
        }
        return C76800UCe.LIZ;
    }
}
