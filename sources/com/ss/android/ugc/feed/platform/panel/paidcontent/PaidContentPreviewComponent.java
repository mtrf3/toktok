package com.ss.android.ugc.feed.platform.panel.paidcontent;

import X.A2Z;
import X.A6O;
import X.C16880lQ;
import X.C221108m2;
import X.C25682A6c;
import X.C25683A6d;
import X.C25684A6e;
import X.C2MA;
import X.C2U8;
import X.C47261Igj;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73893SzJ;
import X.C76800UCe;
import X.C78999UzT;
import X.C8MM;
import X.C9CO;
import X.InterfaceC222708oc;
import X.QD3;
import Y.AfS56S0100000_4;
import Y.IDhS97S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PriceInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class PaidContentPreviewComponent extends BasePanelComponent {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 918));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 919));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C25684A6e.LJLIL);
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final C73893SzJ<C76800UCe> LJLJJL = new C73893SzJ<>();
    public final C73893SzJ<C76800UCe> LJLJJLL = new C73893SzJ<>();
    public String LJLJL;

    public final Aweme getCurrentAweme() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLILLLLZI.getValue();
        if (iViewPagerComponentAbility != null) {
            return iViewPagerComponentAbility.getCurrentAweme();
        }
        return null;
    }

    public final void v3() {
        C2MA c2ma;
        boolean z;
        long j;
        String str;
        PriceInfo priceInfo;
        PriceInfo priceInfo2;
        ViewGroup viewGroup;
        boolean z2;
        String str2;
        int i;
        com.ss.android.ugc.aweme.model.PriceInfo priceInfo3;
        C2MA curViewHolder;
        InterfaceC222708oc LLLJ;
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        User author;
        String nickname;
        PaidContentInfo paidContentInfo3;
        PaidContentInfo paidContentInfo4;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLILLLLZI.getValue();
        if (iViewPagerComponentAbility != null) {
            c2ma = iViewPagerComponentAbility.getNextViewHolder();
        } else {
            c2ma = null;
        }
        if (c2ma != null) {
            z = true;
        } else {
            z = false;
        }
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme != null && (paidContentInfo4 = currentAweme.mPaidContentInfo) != null) {
            j = paidContentInfo4.getPaidCollectionId();
        } else {
            j = 0;
        }
        Aweme currentAweme2 = getCurrentAweme();
        if (currentAweme2 != null && (paidContentInfo3 = currentAweme2.mPaidContentInfo) != null) {
            str = paidContentInfo3.getCollectionName();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Aweme currentAweme3 = getCurrentAweme();
        if (currentAweme3 != null && (author = currentAweme3.getAuthor()) != null && (nickname = author.getNickname()) != null) {
            str3 = nickname;
        }
        Aweme currentAweme4 = getCurrentAweme();
        if (currentAweme4 != null && (paidContentInfo2 = currentAweme4.mPaidContentInfo) != null) {
            priceInfo = paidContentInfo2.getPrice();
        } else {
            priceInfo = null;
        }
        Aweme currentAweme5 = getCurrentAweme();
        if (currentAweme5 != null && (paidContentInfo = currentAweme5.mPaidContentInfo) != null) {
            priceInfo2 = paidContentInfo.getDiscountedPrice();
        } else {
            priceInfo2 = null;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LJLILLLLZI.getValue();
        if (iViewPagerComponentAbility2 != null && (curViewHolder = iViewPagerComponentAbility2.getCurViewHolder()) != null && (LLLJ = curViewHolder.LLLJ()) != null) {
            viewGroup = LLLJ.Dp();
        } else {
            viewGroup = null;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.adq, C16880lQ.LLZIL(getContext()), viewGroup);
        LLLZIIL.bringToFront();
        if (this.LJLJL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2U8.LIZ(new A6O(true, z2, z));
        Aweme currentAweme6 = getCurrentAweme();
        if (currentAweme6 != null) {
            str2 = currentAweme6.getAid();
        } else {
            str2 = null;
        }
        this.LJLJL = str2;
        View findViewById = LLLZIIL.findViewById(R.id.jcy);
        o.LJIIIIZZ(findViewById, "overlayView.findViewById…scroll_up_hint_container)");
        View findViewById2 = LLLZIIL.findViewById(R.id.i3e);
        o.LJIIIIZZ(findViewById2, "overlayView.findViewById…preview_overlay_subtitle)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        if (priceInfo != null) {
            Context context = getContext();
            if (context != null) {
                Object value = this.LJLJI.getValue();
                o.LJIIIIZZ(value, "<get-seriesPricingService>(...)");
                ISeriesPricingService iSeriesPricingService = (ISeriesPricingService) value;
                com.ss.android.ugc.aweme.model.PriceInfo priceInfo4 = new com.ss.android.ugc.aweme.model.PriceInfo(priceInfo.getDiamondId(), priceInfo.getIapId(), priceInfo.getPriceInUsd());
                if (priceInfo2 != null) {
                    priceInfo3 = new com.ss.android.ugc.aweme.model.PriceInfo(priceInfo2.getDiamondId(), priceInfo2.getIapId(), priceInfo2.getPriceInUsd());
                } else {
                    priceInfo3 = null;
                }
                iSeriesPricingService.LIZ(context, C47261Igj.LJJIJ(new A2Z(j, priceInfo4, priceInfo3))).observe(this, new C25682A6c(j, tuxTextView, context, str, str3));
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
            IViewPagerComponentAbility iViewPagerComponentAbility3 = (IViewPagerComponentAbility) this.LJLILLLLZI.getValue();
            if (iViewPagerComponentAbility3 != null) {
                iViewPagerComponentAbility3.De0(new C25683A6d(this, z, LLLZIIL, viewGroup));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C78999UzT.LJFF(this.LJLJJLL.LJJLIIIIJ(new IDhS97S0100000_4(this, 2)).LJJLIIIJ(1L).LJJJJZI(new AfS56S0100000_4(this, 67)), this.LJLJJI);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJI.LIZLLL();
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        o.LJIIIZ(c8mm, "<this>");
        c8mm.LIZ("event_on_play_completed", new AqS170S0100000_4(this, 808));
        c8mm.LIZ("event_on_playing", new AqS170S0100000_4(this, 809));
    }

    @QD3(sticky = true)
    public final void onLandscapePreviewVideoPlayCompleted(C9CO event) {
        o.LJIIIZ(event, "event");
        v3();
        this.LJLJJLL.onNext(C76800UCe.LIZ);
        EventBus.LIZJ().LJIILLIIL(event);
    }
}
