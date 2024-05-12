package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget;

import X.ATB;
import X.ATN;
import X.ATO;
import X.C100023wE;
import X.C107114Ih;
import X.C107124Ii;
import X.C107724Kq;
import X.C108644Oe;
import X.C108654Of;
import X.C108664Og;
import X.C108724Om;
import X.C108734On;
import X.C109024Pq;
import X.C16880lQ;
import X.C1HQ;
import X.C3UE;
import X.C3WF;
import X.C3WG;
import X.C41831GbL;
import X.C45804HyK;
import X.C4KZ;
import X.C4LD;
import X.C4NK;
import X.C4NN;
import X.C4NQ;
import X.C4OT;
import X.C4R9;
import X.C55723Ltv;
import X.C5S1;
import X.C772831o;
import X.C77876UhM;
import X.C80893Fl;
import X.C85323Wm;
import X.C85773Yf;
import X.EF7;
import X.EnumC112364b2;
import X.EnumC84123Rw;
import X.EnumC84133Rx;
import X.GZP;
import X.HXX;
import X.InterfaceC100173wT;
import X.InterfaceC100183wU;
import X.InterfaceC107704Ko;
import X.InterfaceC108594Nz;
import X.InterfaceC83893Qz;
import X.ViewOnApplyWindowInsetsListenerC51182K6w;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.lifecycleowner.ActivityStatusLifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LongPressShareWidget extends Widget implements InterfaceC83893Qz, InterfaceC108594Nz, InterfaceC107704Ko, ATN {
    public final C108654Of LJLILLLLZI;
    public final C4OT LJLJI;
    public final Context LJLJJI;
    public final SharePanelViewModel LJLJJL;
    public C107114Ih LJLJJLL;
    public RecyclerView LJLJL;
    public ViewGroup LJLJLJ;
    public C109024Pq LJLJLLL;
    public final List<IMContact> LJLL;
    public InterfaceC100173wT LJLLI;
    public final ActivityStatusLifecycleOwner LJLLILLLL;

    @Override // X.InterfaceC108594Nz
    public final void Hq0(boolean z) {
    }

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC108594Nz
    public final void YX(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    @Override // X.InterfaceC108594Nz
    public final void ua(boolean z) {
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
    }

    @Override // X.ATN
    public final void LIZ() {
        this.LJLLILLLL.LIZ(false);
    }

    public final void LIZJ() {
        ViewGroup viewGroup = this.LJLILLLLZI.LIZLLL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        List<IMContact> list = this.LJLL;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                IMContact contact = (IMContact) it.next();
                if (contact instanceof C108724Om) {
                    C108664Og c108664Og = new C108664Og(this.LJLILLLLZI.LIZ, this.LJLJJL);
                    o.LJIIIZ(contact, "contact");
                    c108664Og.LJLJI = contact;
                    c108664Og.LJLILLLLZI.setImageDrawable(EF7.LIZIZ().getResources().getDrawable(R.drawable.bij));
                    ViewGroup viewGroup2 = this.LJLILLLLZI.LIZLLL;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(c108664Og);
                    }
                } else {
                    C108644Oe c108644Oe = new C108644Oe(this.LJLILLLLZI.LIZ, this.LJLJJL, this.LJLJI);
                    c108644Oe.LIZ(contact);
                    ViewGroup viewGroup3 = this.LJLILLLLZI.LIZLLL;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(c108644Oe);
                    }
                }
            }
        }
        List<IMContact> list2 = this.LJLL;
        if (list2 == null || ((ArrayList) list2).isEmpty()) {
            return;
        }
        ViewGroup viewGroup4 = this.LJLILLLLZI.LIZLLL;
        if (viewGroup4 != null && viewGroup4.getVisibility() == 0) {
            return;
        }
        ViewGroup viewGroup5 = this.LJLILLLLZI.LIZLLL;
        if (viewGroup5 != null) {
            viewGroup5.setVisibility(0);
        }
        TextView textView = this.LJLILLLLZI.LJII;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // X.ATN
    public final void dismissDialog() {
        this.LJLLILLLL.LIZ(true);
    }

    @Override // X.InterfaceC107704Ko
    public final C107724Kq getActivityStatusParams() {
        C107724Kq c107724Kq = new C107724Kq(this);
        c107724Kq.LIZIZ = EnumC112364b2.LONG_PRESS_PANEL;
        c107724Kq.LIZLLL = this.LJLJJL.LJFF();
        return c107724Kq;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void onDestroy() {
        getLifecycle().removeObserver(this.LJLJJL);
    }

    public final void LIZIZ(C4NN c4nn) {
        C107124Ii c107124Ii;
        Set<IMContact> LJIIIZ;
        this.LJLILLLLZI.LIZJ.dismiss();
        this.LJLJI.LJI(this.LJLILLLLZI.LIZIZ, "chat_merge");
        C4NQ c4nq = new C4NQ() { // from class: X.4OV
            @Override // X.C4NQ
            public final void LJI() {
            }

            @Override // X.C4NQ
            public final void LIZ(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                LongPressShareWidget.this.LJLJI.LIZ(sharePackage);
            }

            @Override // X.C4NQ
            public final void LIZIZ(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                LongPressShareWidget.this.LJLJI.LIZIZ(sharePackage);
            }

            @Override // X.C4NQ
            public final void LIZJ(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
                LongPressShareWidget.this.LJLJI.LJIIIIZZ(sharePackage);
            }

            @Override // X.C4NQ
            public final void LJFF(SharePackage sharePackage) {
                o.LJIIIZ(sharePackage, "sharePackage");
            }

            @Override // X.C4NQ
            public final void LIZLLL(Dialog dialog, SharePackage sharePackage) {
                o.LJIIIZ(dialog, "dialog");
                o.LJIIIZ(sharePackage, "sharePackage");
                LongPressShareWidget.this.LJLJI.LIZLLL(dialog, sharePackage);
            }

            @Override // X.C4NQ
            public final void LJ(Dialog dialog, SharePackage sharePackage) {
                o.LJIIIZ(dialog, "dialog");
                o.LJIIIZ(sharePackage, "sharePackage");
                LongPressShareWidget.this.LJLJI.LJ(dialog, sharePackage);
            }
        };
        String userName = this.LJLILLLLZI.LIZIZ.extras.getString("author_user_name", "");
        int i = this.LJLILLLLZI.LIZIZ.extras.getInt("share_im_limit_tip_type", -1);
        if (i > 0 && !TextUtils.isEmpty(userName)) {
            o.LJIIIIZZ(userName, "userName");
            c107124Ii = new C107124Ii(userName, i, 1);
        } else {
            c107124Ii = null;
        }
        if (C3UE.LIZ()) {
            LJIIIZ = this.LJLJJL.LJIIIIZZ();
        } else {
            LJIIIZ = this.LJLJJL.LJIIIZ();
        }
        Activity LJIJJ = C45804HyK.LJIJJ(this.LJLJJI);
        if (LJIJJ == null) {
            return;
        }
        C16880lQ.LIZ(C4NK.LIZ(LJIJJ, this.LJLILLLLZI.LIZIZ, c4nn, LJIIIZ, true, c4nq, false, c107124Ii, false, null, false, 3840));
        SharePackage sharePackage = this.LJLILLLLZI.LIZIZ;
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(eventSender, "eventSender");
        Bundle bundle = sharePackage.extras;
        String string = bundle.getString("previous_page");
        C1HQ LIZJ = HXX.LIZJ("enter_method", "long_press", "enter_from", bundle.getString("enter_from"));
        LIZJ.put("previous_page", string);
        eventSender.LIZIZ("enter_more_friend_list", LIZJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (X.C4VT.LIZJ() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        r5.getData().add(r5.LJLJI.getValue());
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r3 >= 3) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r15) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget.LIZLLL(java.util.List):void");
    }

    @Override // X.InterfaceC108594Nz
    public final void gD(boolean z) {
        this.LJLJJL.LLD = z;
        C109024Pq c109024Pq = this.LJLJLLL;
        if (c109024Pq != null) {
            c109024Pq.notifyDataSetChanged();
        }
        if (this.LJLJJL.LLFF) {
            return;
        }
        o.LJIJI("sendTv");
        throw null;
    }

    @Override // X.InterfaceC83893Qz
    public final void ks(List<? extends IMContact> list) {
        o.LJIIIZ(list, "list");
        LIZLLL(list);
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
        C109024Pq c109024Pq = this.LJLJLLL;
        if (c109024Pq != null) {
            Iterator<IMContact> it = c109024Pq.getData().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next(), iMContact)) {
                    if (i != -1) {
                        ((ArrayList) c109024Pq.LJLJJI).add(Integer.valueOf(i));
                        c109024Pq.notifyItemChanged(i, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public LongPressShareWidget(C108654Of c108654Of, C4R9 c4r9) {
        boolean z;
        RecyclerView recyclerView;
        View view;
        SharePackage sharePackage;
        Bundle bundle;
        int i;
        RecyclerView recyclerView2;
        this.LJLILLLLZI = c108654Of;
        this.LJLJI = c4r9;
        Context context = c108654Of.LIZ;
        this.LJLJJI = context;
        this.LJLL = new ArrayList();
        ActivityStatusLifecycleOwner activityStatusLifecycleOwner = new ActivityStatusLifecycleOwner(C45804HyK.LJIJJ(context));
        this.LJLLILLLL = activityStatusLifecycleOwner;
        create();
        c108654Of.LIZIZ.extras.putString("enter_method", "long_press");
        SharePackage sharePackage2 = c108654Of.LIZIZ;
        List<C4NN> list = c108654Of.LJIIIZ;
        EnumC84123Rw enumC84123Rw = EnumC84123Rw.LONG_PRESS;
        int LIZ = C80893Fl.LIZ();
        C3WF.LIZ.getClass();
        EnumC84133Rx LIZ2 = C3WF.LIZ();
        if (C3WF.LIZ() != EnumC84133Rx.RECENT_SHARED) {
            z = true;
        } else {
            z = false;
        }
        SharePanelViewModel LIZ3 = C3WG.LIZ(sharePackage2, this, list, enumC84123Rw, LIZ, LIZ2, true, z, false, true, this, null, 9728);
        this.LJLJJL = LIZ3;
        getLifecycle().addObserver(LIZ3);
        RecyclerView recyclerView3 = c108654Of.LJFF;
        if (recyclerView3 != null) {
            this.LJLJL = recyclerView3;
            if (ATO.LIZIZ() && (recyclerView2 = this.LJLJL) != null) {
                recyclerView2.setClipToPadding(false);
                recyclerView2.setOnApplyWindowInsetsListener(ViewOnApplyWindowInsetsListenerC51182K6w.LIZ);
            }
            C109024Pq c109024Pq = new C109024Pq(LIZ3, c4r9);
            this.LJLJLLL = c109024Pq;
            RecyclerView recyclerView4 = this.LJLJL;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(c109024Pq);
            }
            RecyclerView recyclerView5 = this.LJLJL;
            if (recyclerView5 != null) {
                recyclerView5.setLayoutManager(new LinearLayoutManager(1, false));
            }
            RecyclerView recyclerView6 = this.LJLJL;
            if (recyclerView6 != null) {
                recyclerView6.setNestedScrollingEnabled(false);
            }
            if (this.LJLLI == null && (recyclerView = this.LJLJL) != null) {
                InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
                EnumC112364b2 enumC112364b2 = EnumC112364b2.LONG_PRESS_PANEL;
                Window window = c108654Of.LIZJ.getWindow();
                if (window != null) {
                    view = window.getDecorView();
                } else {
                    view = null;
                }
                this.LJLLI = activityStatusAccuracyAnalysis.LIZIZ(enumC112364b2, recyclerView, activityStatusLifecycleOwner, context, view);
                activityStatusLifecycleOwner.LJLILLLLZI.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget$inflateContactListLayout$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        InterfaceC100173wT interfaceC100173wT;
                        o.LJIIIZ(source, "source");
                        o.LJIIIZ(event, "event");
                        if (event == Lifecycle.Event.ON_RESUME) {
                            InterfaceC100173wT interfaceC100173wT2 = LongPressShareWidget.this.LJLLI;
                            if (interfaceC100173wT2 != null) {
                                interfaceC100173wT2.onVisible();
                                return;
                            }
                            return;
                        }
                        if (event != Lifecycle.Event.ON_PAUSE || (interfaceC100173wT = LongPressShareWidget.this.LJLLI) == null) {
                            return;
                        }
                        interfaceC100173wT.onInvisible();
                    }
                });
            }
            FrameLayout frameLayout = c108654Of.LJ;
            if (frameLayout != null && (sharePackage = LIZ3.LJLIL) != null && (bundle = sharePackage.extras) != null) {
                String userName = bundle.getString("author_user_name", null);
                int i2 = bundle.getInt("share_im_limit_tip_type", -1);
                if (i2 > 0 && !TextUtils.isEmpty(userName)) {
                    if (bundle.getBoolean("is_sub_only_live", false)) {
                        i = 4;
                    } else {
                        i = 1;
                    }
                    C107114Ih c107114Ih = new C107114Ih(context);
                    this.LJLJJLL = c107114Ih;
                    c107114Ih.setWidget(this);
                    frameLayout.addView(this.LJLJJLL);
                    C107114Ih c107114Ih2 = this.LJLJJLL;
                    if (c107114Ih2 != null) {
                        o.LJIIIIZZ(userName, "userName");
                        c107114Ih2.LIZJ(new C107124Ii(userName, i2, i));
                    }
                }
            }
        } else if (c108654Of.LIZLLL != null) {
            TextView textView = c108654Of.LJII;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ViewGroup viewGroup = c108654Of.LIZLLL;
            o.LJI(viewGroup);
            this.LJLJLJ = viewGroup;
            LIZJ();
        }
        LIZLLL(null);
        LIZ3.LJIILIIL();
    }

    @Override // X.InterfaceC83893Qz
    public final boolean HY(IMContact contact, boolean z) {
        ATB atb;
        ATB atb2;
        int i;
        C100023wE LJ;
        C100023wE LJ2;
        o.LJIIIZ(contact, "contact");
        if (contact instanceof C108724Om) {
            LIZIZ(null);
        } else if (contact instanceof C4NN) {
            LIZIZ((C4NN) contact);
        } else if (contact instanceof C108734On) {
            Aweme LJJJLL = C4LD.LIZ.LJJJLL(this.LJLILLLLZI.LIZIZ);
            if (LJJJLL != null) {
                this.LJLJI.LJIIIZ();
                this.LJLILLLLZI.LIZJ.dismiss();
                GZP LJII = C55723Ltv.LIZIZ.LJII();
                Context context = this.LJLJJI;
                String LJFF = this.LJLJJL.LJFF();
                o.LJIIIIZZ(LJFF, "viewModel.enterFrom");
                LJII.LJFF(new C41831GbL(context, LJJJLL, LJFF, null, null, 24));
                LJII.LJIIJ("share_to_story_click", LJJJLL, new AqS167S0100000_1(this, 520));
            }
        } else {
            if (z) {
                int size = this.LJLJJL.LJIIIIZZ().size();
                int i2 = 10;
                if (C85773Yf.LJLJI != null && (LJ2 = C77876UhM.LJ()) != null) {
                    i = LJ2.LIZ;
                } else {
                    i = 10;
                }
                if (size >= i && !this.LJLJJL.LJIIIIZZ().contains(contact)) {
                    Context context2 = this.LJLJJI;
                    Object[] objArr = new Object[1];
                    if (C85773Yf.LJLJI != null && (LJ = C77876UhM.LJ()) != null) {
                        i2 = LJ.LIZ;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    String string = context2.getString(R.string.h_7, objArr);
                    o.LJIIIIZZ(string, "context.getString(toastResId, multiSelectLimit)");
                    C5S1 c5s1 = new C5S1(this.LJLJJI);
                    c5s1.LIZLLL(string);
                    c5s1.LJ();
                    return false;
                }
                this.LJLJJL.LJIIIIZZ().add(contact);
                C4KZ.LIZLLL(this.LJLILLLLZI.LIZIZ, contact, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
            } else {
                this.LJLJJL.LJIIIIZZ().remove(contact);
            }
            C109024Pq c109024Pq = this.LJLJLLL;
            if (c109024Pq != null) {
                Iterator<IMContact> it = c109024Pq.getData().iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (o.LJ(it.next(), contact)) {
                        if (i3 != -1) {
                            if (z) {
                                ((ArrayList) c109024Pq.LJLJJL).add(Integer.valueOf(i3));
                            } else {
                                ((ArrayList) c109024Pq.LJLJJL).remove(Integer.valueOf(i3));
                            }
                            c109024Pq.notifyItemChanged(i3, Boolean.valueOf(z));
                        }
                    } else {
                        i3++;
                    }
                }
            }
            if (this.LJLJJL.LJIIIIZZ().isEmpty()) {
                Dialog dialog = this.LJLILLLLZI.LIZJ;
                if ((dialog instanceof ATB) && (atb2 = (ATB) dialog) != null) {
                    atb2.LLD = false;
                    BottomSheetBehavior<View> bottomSheetBehavior = atb2.LJZL;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setState(4);
                    }
                }
                LinearLayout linearLayout = this.LJLILLLLZI.LJI;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                o.LJIJI("editText");
                throw null;
            }
            Dialog dialog2 = this.LJLILLLLZI.LIZJ;
            if ((dialog2 instanceof ATB) && (atb = (ATB) dialog2) != null) {
                atb.LLD = true;
                BottomSheetBehavior<View> bottomSheetBehavior2 = atb.LJZL;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(3);
                }
            }
            LinearLayout linearLayout2 = this.LJLILLLLZI.LJI;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            o.LJIJI("shareCover");
            throw null;
        }
        return false;
    }
}
