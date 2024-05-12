package com.ss.android.ugc.aweme.paidcontent.fragments;

import X.A4S;
import X.A4U;
import X.A4Y;
import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C04D;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C1DJ;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C25589A2n;
import X.C25628A4a;
import X.C25629A4b;
import X.C26045AKb;
import X.C283619k;
import X.C29S;
import X.C3C5;
import X.C40517FvF;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C79045V0n;
import X.C81062Vre;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.CK3;
import X.FMX;
import X.InterfaceC219588ja;
import X.SY4;
import X.V1B;
import X.V66;
import Y.ACListenerS24S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailPaymentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RatingFragment extends Fragment implements InterfaceC219588ja {
    public final long LJLIL;
    public final CollectionDetailModel LJLILLLLZI;
    public SY4 LJLJI;
    public SY4 LJLJJI;
    public View LJLJJL;
    public C81062Vre LJLJJLL;
    public Dialog LJLJL;
    public int LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C73318Sq2 LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLZ;
        Integer valueOf = Integer.valueOf(R.id.hgs);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.hgs)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // X.InterfaceC219588ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C235119Kp createNavActions() {
        /*
            r6 = this;
            X.9Kp r5 = new X.9Kp
            r5.<init>()
            X.9KF r2 = new X.9KF
            r2.<init>()
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L25
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L25
            boolean r0 = X.A4U.LIZ()
            if (r0 == 0) goto L50
            r0 = 2131844580(0x7f115de4, float:1.9322557E38)
        L1f:
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            r2.LIZJ = r0
            r5.LIZJ = r2
            boolean r0 = X.A4U.LIZ()
            r4 = 1
            if (r0 == 0) goto L4d
            X.9Ih[] r3 = new X.AbstractC234519Ih[r4]
            X.9Ii r2 = defpackage.s1.LIZJ()
            r0 = 2131756485(0x7f1005c5, float:1.9143879E38)
            r2.LIZJ = r0
            kotlin.jvm.internal.AqS154S0100000_4 r1 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 568(0x238, float:7.96E-43)
            r1.<init>(r6, r0)
            r2.LIZIZ(r1)
            r0 = 0
            r3[r0] = r2
            r5.LIZIZ(r3)
        L4d:
            r5.LIZLLL = r4
            return r5
        L50:
            r0 = 2131844503(0x7f115d97, float:1.93224E38)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment.createNavActions():X.9Kp");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment.q0():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLL.dispose();
    }

    public RatingFragment(long j, CollectionDetailModel collectionDetailModel) {
        C214298b3 c214298b3;
        this.LJLIL = j;
        this.LJLILLLLZI = collectionDetailModel;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailPaymentViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 573);
        C25629A4b c25629A4b = C25629A4b.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c25629A4b, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c25629A4b, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLLL = c214298b3;
        this.LJLL = new C73318Sq2();
        this.LJLLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 571));
        this.LJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 572));
        this.LJLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 570));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 569));
    }

    public static final void wl(RatingFragment ratingFragment, A4Y a4y) {
        ActivityC45651qj mo49getActivity = ratingFragment.mo49getActivity();
        if (mo49getActivity != null) {
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
            c26045AKb.LJIIIZ(ratingFragment.getResources().getString(R.string.rjt));
            c26045AKb.LJIIJ();
        }
        ASQ.LIZ(ratingFragment, ASX.LIZ);
        Dialog dialog = ratingFragment.LJLJL;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        ratingFragment.vl(ratingFragment.LJLJLJ, ratingFragment.LJLLI, (String) ratingFragment.LJLLL.getValue(), false);
        A4S.LJIIIZ(a4y);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        String string;
        o.LJIIIZ(view, "view");
        if (A4U.LIZ()) {
            Integer num = (Integer) this.LJLLLL.getValue();
            if (num != null) {
                int intValue = num.intValue();
                C40517FvF c40517FvF = new C40517FvF(1, 5);
                Integer num2 = (Integer) this.LJLLLL.getValue();
                if (num2 != null && c40517FvF.LJIILJJIL(num2.intValue())) {
                    this.LJLLILLLL = intValue;
                }
            }
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("text")) != null) {
                this.LJLLI = string;
            }
            View view2 = this.LJLJJL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            C81062Vre c81062Vre = this.LJLJJLL;
            if (c81062Vre != null) {
                c81062Vre.setVisibility(8);
            }
            SY4 sy4 = this.LJLJI;
            if (sy4 != null) {
                sy4.setVisibility(8);
            }
            SY4 sy42 = this.LJLJJI;
            if (sy42 != null) {
                sy42.setVisibility(8);
            }
            _$_findCachedViewById(R.id.hgs).setVisibility(0);
            ((C04D) _$_findCachedViewById(R.id.hgs)).setViewCompositionStrategy(C283619k.LIZIZ);
            ComposeView paid_content_stars_and_text = (ComposeView) _$_findCachedViewById(R.id.hgs);
            o.LJIIIIZZ(paid_content_stars_and_text, "paid_content_stars_and_text");
            V66.LIZIZ(paid_content_stars_and_text, C1DJ.LJFF(new AqS194S0100000_12(this, 133), 1336277626, true));
            return;
        }
        SY4 sy43 = this.LJLJI;
        if (sy43 != null) {
            sy43.setEnabled(false);
        }
        C81062Vre c81062Vre2 = this.LJLJJLL;
        if (c81062Vre2 != null) {
            c81062Vre2.setOnRatingChangeListener(new C25628A4a(this));
        }
        SY4 sy44 = this.LJLJJI;
        if (sy44 != null) {
            sy44.setVisibility(0);
        }
        SY4 sy45 = this.LJLJJI;
        if (sy45 != null) {
            C16880lQ.LJJIZ(sy45, new ACListenerS24S0100000_4(this, 108));
        }
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cl, context)) != null) {
            int intValue2 = LJI.intValue();
            SY4 sy46 = this.LJLJJI;
            if (sy46 != null) {
                sy46.setBackgroundColor(intValue2);
            }
        }
        SY4 sy47 = this.LJLJJI;
        if (sy47 != null) {
            sy47.setTextColorRes(R.attr.gv);
        }
        View view3 = this.LJLJJL;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        C81062Vre c81062Vre3 = this.LJLJJLL;
        if (c81062Vre3 != null) {
            c81062Vre3.setVisibility(0);
        }
        _$_findCachedViewById(R.id.hgs).setVisibility(8);
        SY4 sy48 = this.LJLJI;
        if (sy48 != null) {
            sy48.setVisibility(0);
        }
        SY4 sy49 = this.LJLJI;
        if (sy49 == null) {
            return;
        }
        C16880lQ.LJJIZ(sy49, new ACListenerS24S0100000_4(this, 109));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.aiy, viewGroup, false, "inflater.inflate(R.layou…ing_ui, container, false)");
        this.LJLJJL = LIZIZ.findViewById(R.id.title);
        this.LJLJI = (SY4) LIZIZ.findViewById(R.id.bhu);
        this.LJLJJI = (SY4) LIZIZ.findViewById(R.id.bhs);
        this.LJLJJLL = (C81062Vre) LIZIZ.findViewById(R.id.bi0);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }

    public final void vl(int i, String str, String str2, boolean z) {
        String str3;
        String str4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str3 = arguments.getString("enter_from");
        } else {
            str3 = null;
        }
        CollectionDetailModel collectionDetailModel = this.LJLILLLLZI;
        C188727au LIZ = CK3.LIZ("enter_from", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJI("is_success", str4);
        LIZ.LIZLLL(i, "submitted_rating");
        if (collectionDetailModel != null) {
            C25589A2n.LJ(LIZ, collectionDetailModel);
            C25589A2n.LIZ(LIZ, collectionDetailModel);
        }
        LIZ.LJI("text", str);
        LIZ.LJI("review_id", str2);
        FMX.LJIIL("submit_collection_rating", LIZ.LIZ);
    }
}
