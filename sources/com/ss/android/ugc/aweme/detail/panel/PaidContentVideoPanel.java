package com.ss.android.ugc.aweme.detail.panel;

import X.A3H;
import X.A6O;
import X.C0RN;
import X.C16880lQ;
import X.C188727au;
import X.C211568Sa;
import X.C221108m2;
import X.C32151Nz;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.C7MY;
import X.FMX;
import X.JBR;
import X.M89;
import X.O6R;
import X.QD3;
import X.SY4;
import X.T16;
import Y.ACListenerS39S0200000_4;
import Y.AfS56S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.PurchaseParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.PaidContentServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class PaidContentVideoPanel extends DetailFragmentPanel {
    public RelativeLayout LLJJJIL;
    public final Boolean LLJJJJ;
    public final PurchaseParams LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final Boolean LLJL;
    public final Boolean LLJLIL;
    public final C73318Sq2 LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public final C62822Ol8 LLJZ;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLJJJIL != null || !C211568Sa.LIZ() || !o.LJ(this.LLJJJJ, Boolean.TRUE)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        if (viewGroup != null) {
            viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -2));
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(relativeLayout.getContext()), R.layout.alq, relativeLayout, false);
        SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.ig5);
        View findViewById = LLLLIILL.findViewById(R.id.b1y);
        if (PaidContentServiceImpl.LJIIIZ().LJI()) {
            ViewGroup.LayoutParams layoutParams = sy4.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C7MY.LIZIZ(12);
            sy4.setButtonSize(3);
            findViewById.setVisibility(0);
            this.LLFII.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        } else {
            ViewGroup.LayoutParams layoutParams2 = sy4.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            sy4.setButtonSize(2);
            findViewById.setVisibility(8);
            this.LLFII.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS39S0200000_4(this, sy4, 13));
        PurchaseParams purchaseParams = this.LLJJJJJIL;
        String str = null;
        if (purchaseParams != null && purchaseParams.voucherId != null) {
            Context context = relativeLayout.getContext();
            if (context != null) {
                str = context.getString(R.string.s90);
            }
            sy4.setText(str);
        } else {
            Context context2 = relativeLayout.getContext();
            if (context2 != null) {
                str = context2.getString(R.string.qpb);
            }
            sy4.setText(str);
        }
        relativeLayout.addView(LLLLIILL);
        this.LLJJJIL = relativeLayout;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onDestroy() {
        super.onDestroy();
        this.LLJLILLLLZIIL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        super.onPageSelected();
        if (this.LLJLL) {
            this.LLJLL = false;
            return;
        }
        PurchaseParams purchaseParams = this.LLJJJJJIL;
        if (purchaseParams == null) {
            return;
        }
        C78999UzT.LJFF(PaidContentServiceImpl.LJIIIZ().LJ(purchaseParams.collectionId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS56S0100000_4(this, 10)), this.LLJLILLLLZIIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onStart() {
        super.onStart();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onStop() {
        super.onStop();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJLL = true;
    }

    @QD3
    public final void onFreePreviewOverlayVisibilityChange(A6O event) {
        int i;
        String str;
        String str2;
        PaidContentInfo paidContentInfo;
        User author;
        PaidContentInfo paidContentInfo2;
        o.LJIIIZ(event, "event");
        View seekBarFrame = this.LLFZ;
        o.LJIIIIZZ(seekBarFrame, "seekBarFrame");
        int i2 = 1;
        if (!event.LJLIL) {
            i = 0;
        } else {
            i = 8;
        }
        seekBarFrame.setVisibility(i);
        boolean z = event.LJLIL;
        this.LLJLLL = z;
        String str3 = null;
        Long l = null;
        if (z) {
            String str4 = this.LLJJJJLIIL;
            String str5 = this.LLJJL;
            PurchaseParams purchaseParams = this.LLJJJJJIL;
            if (purchaseParams != null) {
                l = Long.valueOf(purchaseParams.collectionId);
            }
            String valueOf = String.valueOf(l);
            String str6 = this.LLJJLIIIJLLLLLLLZ;
            boolean z2 = event.LJLJI;
            C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", str4, "collection_user_id", str5);
            LJIIIIZZ.LJI("collection_id", valueOf);
            LJIIIIZZ.LJI("group_id", str6);
            LJIIIIZZ.LIZLLL(z2 ? 1 : 0, "if_able_to_scroll");
            FMX.LJIIL("show_collection_preview_end_prompt", LJIIIIZZ.LIZ);
            return;
        }
        boolean LJ = o.LJ(this.LLJLIL, Boolean.TRUE);
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || (paidContentInfo2 = currentAweme.mPaidContentInfo) == null || !paidContentInfo2.getShouldShowPreview()) {
            i2 = 0;
        }
        String valueOf2 = String.valueOf(this.LLJLLIL);
        boolean z3 = event.LJLILLLLZI;
        Aweme currentAweme2 = getCurrentAweme();
        if (currentAweme2 != null && (author = currentAweme2.getAuthor()) != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        Aweme currentAweme3 = getCurrentAweme();
        if (currentAweme3 != null && (paidContentInfo = currentAweme3.mPaidContentInfo) != null) {
            str2 = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString();
        } else {
            str2 = null;
        }
        Aweme currentAweme4 = getCurrentAweme();
        if (currentAweme4 != null) {
            str3 = currentAweme4.getGroupId();
        }
        C188727au LIZJ = C0RN.LIZJ(LJ ? 1 : 0, "is_intro", i2, "is_preview");
        LIZJ.LJI("play_ts", valueOf2);
        LIZJ.LIZLLL(z3 ? 1 : 0, "if_end_play");
        LIZJ.LJI("collection_user_id", str);
        LIZJ.LJI("collection_id", str2);
        LIZJ.LJI("group_id", str3);
        FMX.LJIIL("collection_preview_scroll", LIZJ.LIZ);
    }

    public PaidContentVideoPanel(Bundle bundle, M89 m89) {
        super(m89);
        Boolean bool;
        PurchaseParams purchaseParams;
        String str;
        String str2;
        String str3;
        Boolean bool2;
        if (bundle != null) {
            bool = Boolean.valueOf(bundle.getBoolean("should_show_preview"));
        } else {
            bool = null;
        }
        this.LLJJJJ = bool;
        if (bundle != null) {
            purchaseParams = (PurchaseParams) bundle.getParcelable("purchase_params");
        } else {
            purchaseParams = null;
        }
        this.LLJJJJJIL = purchaseParams;
        if (bundle != null) {
            str = bundle.getString("enter_from");
        } else {
            str = null;
        }
        this.LLJJJJLIIL = str;
        if (bundle != null) {
            str2 = bundle.getString("creator_uid");
        } else {
            str2 = null;
        }
        this.LLJJL = str2;
        if (bundle != null) {
            str3 = bundle.getString("video_id");
        } else {
            str3 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = str3;
        if (bundle != null) {
            bool2 = Boolean.valueOf(bundle.getBoolean("is_from_anchor"));
        } else {
            bool2 = null;
        }
        this.LLJL = bool2;
        this.LLJLIL = bundle != null ? Boolean.valueOf(bundle.getBoolean("is_intro_video")) : null;
        this.LLJLILLLLZIIL = new C73318Sq2();
        this.LLJLL = true;
        this.LLJZ = C221108m2.LIZIZ(A3H.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onProgressUpdated(String str, int i) {
        super.onProgressUpdated(str, i);
        this.LLJLLIL = i;
    }
}
