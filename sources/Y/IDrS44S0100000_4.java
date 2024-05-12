package Y;

import X.C0A2;
import X.C0A6;
import X.C247089mq;
import X.C252709vu;
import X.C26059AKp;
import X.C27804Avg;
import X.C65352Pkq;
import X.C770830u;
import X.C8VC;
import X.C9QU;
import X.InterfaceC242259f3;
import X.UC0;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui.ProfileEditPronounsSearchAndDisplayAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.tag.assem.SearchResultListAssem;
import com.ss.android.ugc.aweme.tag.assem.VideoTagFriendsListAssem;
import com.ss.android.ugc.aweme.trending.ui.list.TrendingRevealPage;
import com.ss.android.ugc.trill.setting.PreferredLanguageSettingFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDrS44S0100000_4 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 2:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 3:
            case 8:
            case 9:
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
            case 4:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 10:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILJJIL$6(this, i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 2:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 3:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 8:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 9:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case 10:
                LJIILL$6(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS44S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        IEventCenter LIZ = C26059AKp.LIZ();
        String jSONObject = C770830u.LIZLLL("status_code", i).toString();
        o.LJIIIIZZ(jSONObject, "JSONObject().apply { put…E, newState) }.toString()");
        LIZ.LIZ("scrolled_state_change_event", jSONObject);
    }

    public static final void LJIILJJIL$1(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            KeyboardUtils.LIZIZ(((ProfileEditPronounsSearchAndDisplayAssem) iDrS44S0100000_4.l0).O3());
        }
    }

    public static final void LJIILJJIL$2(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        InterfaceC242259f3 interfaceC242259f3 = (InterfaceC242259f3) C8VC.LJFF((SearchResultListAssem) iDrS44S0100000_4.l0, C65352Pkq.LIZ(InterfaceC242259f3.class), null);
        if (interfaceC242259f3 != null) {
            interfaceC242259f3.LJIJI();
        }
    }

    public static final void LJIILJJIL$3(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        InterfaceC242259f3 interfaceC242259f3 = (InterfaceC242259f3) C8VC.LJFF((VideoTagFriendsListAssem) iDrS44S0100000_4.l0, C65352Pkq.LIZ(InterfaceC242259f3.class), null);
        if (interfaceC242259f3 != null) {
            interfaceC242259f3.LJIJI();
        }
    }

    public static final void LJIILJJIL$4(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C9QU c9qu = (C9QU) C8VC.LJFF((com.ss.android.ugc.aweme.topic.trendingtopic.ui.SearchResultListAssem) iDrS44S0100000_4.l0, C65352Pkq.LIZ(C9QU.class), null);
        if (c9qu != null) {
            c9qu.LJIJI();
        }
    }

    public static final void LJIILJJIL$5(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (((C247089mq) iDrS44S0100000_4.l0).getScrollState() == 0) {
            C0A2 layoutManager = ((C247089mq) iDrS44S0100000_4.l0).getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int LLILL = ((LinearLayoutManager) layoutManager).LLILL();
            C0A2 layoutManager2 = ((C247089mq) iDrS44S0100000_4.l0).getLayoutManager();
            o.LJII(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            View LJJIJIL = layoutManager2.LJJIJIL(LLILL);
            if (LJJIJIL != null) {
                float y = LJJIJIL.getY();
                if (y == 0.0f) {
                    return;
                }
                if (Math.abs(y) < ((C247089mq) iDrS44S0100000_4.l0).getMItemHeight() / 2) {
                    C247089mq c247089mq = (C247089mq) iDrS44S0100000_4.l0;
                    c247089mq.getClass();
                    c247089mq.LJLIIIL(0, C247089mq.LJLJJL(y));
                } else {
                    ((C247089mq) iDrS44S0100000_4.l0).LJLIIIL(0, C247089mq.LJLJJL(r1.getMItemHeight() + y));
                }
            }
        }
    }

    public static final void LJIILJJIL$6(IDrS44S0100000_4 iDrS44S0100000_4, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((SearchFragment) iDrS44S0100000_4.l0).getClass();
    }

    public static final void LJIILL$0(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            return;
        }
        if (linearLayoutManager.LLILL() > 0) {
            ((CreatorToolsActivity) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.bz7).findViewById(R.id.gwk).setAlpha(1.0f);
        } else {
            ((CreatorToolsActivity) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.bz7).findViewById(R.id.gwk).setAlpha(0.0f);
        }
    }

    public static final void LJIILL$1(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).LLILL() >= 1) {
            ((MessageCenterAssem) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.gwg).findViewById(R.id.gwk).setAlpha(1.0f);
            ((C252709vu) ((MessageCenterAssem) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.gwg)).LJIILJJIL(true);
        } else {
            ((MessageCenterAssem) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.gwg).findViewById(R.id.gwk).setAlpha(0.0f);
            ((C252709vu) ((MessageCenterAssem) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.gwg)).LJIILJJIL(false);
        }
    }

    public static final void LJIILL$2(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        View LJJIJIL;
        IOspFragmentStyle iOspFragmentStyle;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        Object obj = null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (LJJIJIL = linearLayoutManager.LJJIJIL(linearLayoutManager.LLILL())) == null) {
            return;
        }
        Object tag = LJJIJIL.getTag();
        if (!(tag instanceof String)) {
            tag = null;
        }
        if (o.LJ(tag, "address_item_view") && (iOspFragmentStyle = (IOspFragmentStyle) UC0.LJIIJJI((OrderSubmitFragment) iDrS44S0100000_4.l0, "order_submit", null, null, null, 14)) != null && iOspFragmentStyle.getShowBriefAddrBar()) {
            if (LJJIJIL.getBottom() < ((OrderSubmitFragment) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.asw).getHeight()) {
                OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) iDrS44S0100000_4.l0;
                orderSubmitFragment.withState(orderSubmitFragment.getViewModel(), new AqS170S0100000_4((OrderSubmitFragment) iDrS44S0100000_4.l0, 260));
            } else {
                ((OrderSubmitFragment) iDrS44S0100000_4.l0)._$_findCachedViewById(R.id.asw).setVisibility(4);
            }
        }
        View LJJIJIL2 = linearLayoutManager.LJJIJIL(linearLayoutManager.LLILLJJLI());
        if (LJJIJIL2 == null) {
            return;
        }
        Object tag2 = LJJIJIL2.getTag();
        if (tag2 instanceof String) {
            obj = tag2;
        }
        if (o.LJ(obj, "us_order_summary_item_view")) {
            OrderSubmitFragment orderSubmitFragment2 = (OrderSubmitFragment) iDrS44S0100000_4.l0;
            if (!orderSubmitFragment2.skipDismissPromotionBannerOnScroll) {
                orderSubmitFragment2.getViewModel().setState(C27804Avg.LJLIL);
            }
            ((OrderSubmitFragment) iDrS44S0100000_4.l0).skipDismissPromotionBannerOnScroll = false;
        }
    }

    public static final void LJIILL$3(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        PaymentMethodView paymentMethodView;
        PaymentMethod paymentMethod;
        o.LJIIIZ(recyclerView, "recyclerView");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr2);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        PaymentFragment paymentFragment = (PaymentFragment) iDrS44S0100000_4.l0;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL > LLILLJJLI) {
            return;
        }
        while (true) {
            View LJJIJIL = linearLayoutManager.LJJIJIL(LLILL);
            if ((LJJIJIL instanceof PaymentMethodView) && (paymentMethodView = (PaymentMethodView) LJJIJIL) != null && (paymentMethod = paymentMethodView.getPaymentMethod()) != null) {
                paymentMethodView.getLocationOnScreen(iArr);
                if ((recyclerView.getHeight() + iArr2[1]) - iArr[1] > 0) {
                    paymentFragment.withState(paymentFragment.getViewModel(), new AqS135S0200000_4(paymentFragment, paymentMethod, 36));
                }
            }
            if (LLILL != LLILLJJLI) {
                LLILL++;
            } else {
                return;
            }
        }
    }

    public static final void LJIILL$4(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        TrendingRevealPage trendingRevealPage = (TrendingRevealPage) iDrS44S0100000_4.l0;
        int i3 = trendingRevealPage.LJLILLLLZI + i2;
        trendingRevealPage.LJLILLLLZI = i3;
        if (i3 != 0) {
            C252709vu c252709vu = trendingRevealPage.LJLJI;
            if (c252709vu != null) {
                c252709vu.setNavBackground(-16777216);
                return;
            } else {
                o.LJIJI("navBar");
                throw null;
            }
        }
        C252709vu c252709vu2 = trendingRevealPage.LJLJI;
        if (c252709vu2 != null) {
            c252709vu2.setNavBackground(0);
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    public static final void LJIILL$5(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (o.LJ(((PreferredLanguageSettingFragment) iDrS44S0100000_4.l0).xl().LJLLJ.getValue(), Boolean.TRUE)) {
            PreferredLanguageSettingFragment preferredLanguageSettingFragment = (PreferredLanguageSettingFragment) iDrS44S0100000_4.l0;
            int i3 = preferredLanguageSettingFragment.LJLJJLL + i2;
            preferredLanguageSettingFragment.LJLJJLL = i3;
            if (i3 > ((Number) preferredLanguageSettingFragment.LJLJL.getValue()).intValue()) {
                C252709vu wl = ((PreferredLanguageSettingFragment) iDrS44S0100000_4.l0).wl();
                if (wl == null) {
                    return;
                }
                PreferredLanguageSettingFragment preferredLanguageSettingFragment2 = (PreferredLanguageSettingFragment) iDrS44S0100000_4.l0;
                wl.setAlpha(Math.min((preferredLanguageSettingFragment2.LJLJJLL - ((Number) preferredLanguageSettingFragment2.LJLJL.getValue()).intValue()) / (((Number) ((PreferredLanguageSettingFragment) iDrS44S0100000_4.l0).LJLJLJ.getValue()).intValue() - ((Number) ((PreferredLanguageSettingFragment) iDrS44S0100000_4.l0).LJLJL.getValue()).intValue()), 1.0f));
                return;
            }
            C252709vu wl2 = ((PreferredLanguageSettingFragment) iDrS44S0100000_4.l0).wl();
            if (wl2 == null) {
                return;
            }
            wl2.setAlpha(0.0f);
        }
    }

    public static final void LJIILL$6(IDrS44S0100000_4 iDrS44S0100000_4, RecyclerView recyclerView, int i, int i2) {
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        C247089mq c247089mq = (C247089mq) iDrS44S0100000_4.l0;
        int i4 = c247089mq.LLLFF / 2;
        C0A2 layoutManager = c247089mq.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int LLILL = ((LinearLayoutManager) layoutManager).LLILL();
        if (c247089mq.getChildAt(0) == null) {
            return;
        }
        if (Math.abs(c247089mq.getChildAt(0).getY()) <= c247089mq.LLLF / 2) {
            i3 = LLILL + i4;
        } else {
            i3 = LLILL + i4 + 1;
        }
        if (i3 == c247089mq.LLLFZ) {
            return;
        }
        c247089mq.LLLFZ = i3;
        int i5 = i4 + i3 + 1;
        for (int i6 = (i3 - i4) - 1; i6 < i5; i6++) {
            View childAt = c247089mq.getChildAt(i6 - LLILL);
            if (childAt != null) {
                View findViewById = childAt.findViewById(R.id.m_e);
                o.LJII(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById;
                View findViewById2 = childAt.findViewById(R.id.m_f);
                o.LJII(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) findViewById2;
                if (i3 == i6) {
                    textView.setTextColor(-16777216);
                    textView2.setTextColor(-16777216);
                    childAt.setAlpha(1.0f);
                    childAt.findViewById(R.id.lfk).setVisibility(0);
                    childAt.findViewById(R.id.aqd).setVisibility(0);
                } else {
                    textView.setTextColor(-7829368);
                    textView2.setTextColor(-7829368);
                    childAt.setAlpha((float) Math.pow(0.699999988079071d, Math.abs(i6 - i3)));
                    childAt.findViewById(R.id.lfk).setVisibility(8);
                    childAt.findViewById(R.id.aqd).setVisibility(8);
                }
            }
        }
    }
}
