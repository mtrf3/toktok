package X;

import X.C0AC;
import X.C107234It;
import X.C1GE;
import X.C4NG;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS62S0300000_1;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS20S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4NG, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4NG extends OOS implements InterfaceC108594Nz, InterfaceC107704Ko, LifecycleOwner {
    public final Activity LJLJLLL;
    public final java.util.Set<IMContact> LJLL;
    public final boolean LJLLI;
    public final C4NQ LJLLILLLL;
    public final boolean LJLLJ;
    public final SharePackage LJLLL;
    public final BaseContent LJLLLL;
    public final java.util.Map<String, String> LJLLLLLL;
    public final java.util.Map<String, String> LJLZ;
    public final C107124Ii LJZ;
    public final C4NN LJZI;
    public final boolean LJZL;
    public final boolean LL;
    public final boolean LLD;
    public final boolean LLF;
    public final C62822Ol8 LLFF;
    public boolean LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public View LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final boolean LLII;
    public final ActivityC45651qj LLIIII;
    public ShakeEggVM LLIIIILZ;
    public final String LLIIIJ;
    public final InterfaceC101153y3 LLIIIL;
    public final ShareDialogViewModel LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final List<LiveData<ActivityStatus>> LLIIL;
    public ARunnableS20S0200000_1 LLIILII;

    public C4NG() {
        throw null;
    }

    @Override // X.InterfaceC108594Nz
    public final void YX(boolean z) {
    }

    @Override // X.InterfaceC108594Nz
    public final void ua(boolean z) {
    }

    public final FrameLayout LJJI() {
        return (FrameLayout) this.LLIFFJFJJ.getValue();
    }

    public final View LJJIFFI() {
        return (View) this.LLFII.getValue();
    }

    public final LinearLayout LJJII() {
        return (LinearLayout) this.LLFZ.getValue();
    }

    public final C4N7 LJJIII() {
        return (C4N7) this.LLIIJLIL.getValue();
    }

    @Override // X.InterfaceC107704Ko
    public final C107724Kq getActivityStatusParams() {
        C107724Kq c107724Kq = new C107724Kq(this);
        c107724Kq.LIZIZ = EnumC112364b2.MORE_PANEL;
        c107724Kq.LJ = "more_panel";
        c107724Kq.LIZLLL = "homepage_hot";
        return c107724Kq;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLFF.getValue();
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-2656795034592683147")).LIZ) {
            super.show();
        }
        C2U8.LIZ(new C2IP(true, true));
        ShakeEggVM shakeEggVM = this.LLIIIILZ;
        if (shakeEggVM != null && shakeEggVM.LJLILLLLZI) {
            shakeEggVM.LJLJL.setValue("shake_more_contact");
        }
    }

    public void LJJIIJ() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout LJJI = LJJI();
        if (LJJI == null || (layoutParams = LJJI.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        View view;
        Window window = getWindow();
        if (window != null) {
            view = window.getCurrentFocus();
        } else {
            view = null;
        }
        KeyboardUtils.LIZIZ(view);
        if (!this.LLII) {
            C4NJ c4nj = (C4NJ) findViewById(R.id.jfz);
            c4nj.LJLILLLLZI.clearFocus();
            KeyboardUtils.LIZIZ(c4nj.LJLILLLLZI);
        }
        super.dismiss();
        C2U8.LIZ(new C2IP(false, true));
        ShakeEggVM shakeEggVM = this.LLIIIILZ;
        if (shakeEggVM != null && shakeEggVM.LJLILLLLZI) {
            shakeEggVM.LJLJLJ.setValue("shake_more_contact");
        }
        if (this.LLIILII != null) {
            findViewById(R.id.bs7).removeCallbacks(this.LLIILII);
        }
    }

    @Override // X.OOS, android.app.Dialog
    public final void onStart() {
        super.onStart();
        C4NQ c4nq = this.LJLLILLLL;
        if (c4nq != null) {
            c4nq.LIZLLL(this, this.LJLLL);
        }
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onStop() {
        super.onStop();
        C4NQ c4nq = this.LJLLILLLL;
        if (c4nq != null) {
            c4nq.LJ(this, this.LJLLL);
        }
        ((LifecycleRegistry) this.LLFF.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.InterfaceC108594Nz
    public final void Hq0(boolean z) {
        C4N7 LJJIII = LJJIII();
        if (z == LJJIII.LJLLJ) {
            return;
        }
        LJJIII.LJLLJ = z;
    }

    public final void LJJ(List<? extends IMContact> list) {
        Iterator it = ((ArrayList) this.LLIIL).iterator();
        while (it.hasNext()) {
            ((LiveData) it.next()).removeObservers(this.LLIIII);
        }
        ((ArrayList) this.LLIIL).clear();
        for (IMContact iMContact : list) {
            if (iMContact instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact;
                if (iMUser.getUid() != null) {
                    if (AV1.LJIJI(iMUser.getUid())) {
                        iMUser.setOnline(true);
                        LJJIII().LJJIIJ(list, null);
                    } else {
                        C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                        String uid = iMUser.getUid();
                        o.LJIIIIZZ(uid, "item.uid");
                        LiveData LIZ = C3B3.LIZ(activityStatusViewModel, uid, null, null, 14);
                        ((ArrayList) this.LLIIL).add(LIZ);
                        LIZ.observe(this.LLIIII, new AObserverS62S0300000_1(iMContact, this, list, 1));
                    }
                }
            }
        }
    }

    public void LJJIIJZLJL(boolean z) {
        int i;
        View view = this.LLI;
        if (view != null) {
            if (z && !this.LLII) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // X.InterfaceC108594Nz
    public final void gD(boolean z) {
        C4N7 LJJIII = LJJIII();
        if (z == LJJIII.LJLLILLLL) {
            return;
        }
        LJJIII.LJLLILLLL = z;
        LJJIII.LJLJL.LJLLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        String str;
        OSJ osj;
        List<? extends IMContact> list;
        boolean z;
        List<IMUser> list2;
        String str2;
        String string;
        Bundle bundle2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ActivityC45651qj activityC45651qj;
        super.onCreate(bundle);
        setContentView(R.layout.b6x);
        C98163tE c98163tE = InterfaceC98153tD.LIZ;
        View contact_list_recyclerview = findViewById(R.id.bs7);
        o.LJIIIIZZ(contact_list_recyclerview, "contact_list_recyclerview");
        String str3 = null;
        c98163tE.LIZ(contact_list_recyclerview, "more_share_dialog", null);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setLayout(-1, -1);
            if (this.LLF) {
                window.setSoftInputMode(36);
            } else {
                window.setSoftInputMode(16);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.a8a;
            }
        }
        LJJIIJ();
        FrameLayout LJJI = LJJI();
        if (LJJI != null) {
            BottomSheetBehavior from = BottomSheetBehavior.from(LJJI);
            o.LJIIIIZZ(from, "from(sheet)");
            from.setState(3);
            from.setPeekHeight(0);
            from.setHideable(true);
            from.setSkipCollapsed(true);
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.gmc);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 143));
            tuxIconView.setContentDescription(getContext().getString(R.string.a_c));
        }
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.4NP
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C4NG c4ng;
                C4NQ c4nq;
                if (i == 4 && (c4nq = (c4ng = C4NG.this).LJLLILLLL) != null) {
                    c4nq.LJFF(c4ng.LJLLL);
                    return false;
                }
                return false;
            }
        });
        if (C78966Uyw.LJJIJ().LIZIZ()) {
            findViewById(R.id.bs7).setVisibility(8);
            ((C73305Spp) findViewById(R.id.kf_)).setVisibility(8);
        } else {
            if (!this.LLII) {
                ((C4NJ) findViewById(R.id.jfz)).setListViewModel(this.LLIIIZ);
            } else {
                findViewById(R.id.jfz).setVisibility(8);
                TextView textView = (TextView) findViewById(R.id.title);
                C4NN c4nn = this.LJZI;
                if (c4nn != null) {
                    str = c4nn.getPanelTitle();
                } else {
                    str = null;
                }
                textView.setText(str);
            }
            ((C4NJ) findViewById(R.id.jfz)).setEditClickCallBack(new AqS151S0100000_1(this, 794));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bs7);
            recyclerView.setHasFixedSize(true);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.im.sdk.share.ui.morecontacts.MoreContactsShareBottomDialog$setupContactListRecyclerView$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                public final void LJLJJL(C0AC state) {
                    o.LJIIIZ(state, "state");
                    super.LJLJJL(state);
                    Collection collection = C4NG.this.LJJIII().LJLIL.LJ;
                    if (collection == null) {
                        collection = Collections.emptyList();
                        o.LJIIIIZZ(collection, "emptyList()");
                    }
                    if (C1GE.LJIILIIL(collection)) {
                        C4NG c4ng = C4NG.this;
                        if (c4ng.LLFFF) {
                            c4ng.LLFFF = false;
                            String string2 = c4ng.LJLLL.extras.getString("enter_from");
                            String enterMethod = C4NG.this.LJLLL.extras.getString("enter_method", "");
                            o.LJIIIIZZ(enterMethod, "enterMethod");
                            long LJFF = IMCriticalFlowKeva.LJFF(enterMethod);
                            long currentTimeMillis = System.currentTimeMillis() - LJFF;
                            if (LJFF > 0 && currentTimeMillis > 0) {
                                C107234It.LJIIIZ(currentTimeMillis, string2, enterMethod);
                            }
                        }
                    }
                }
            });
            recyclerView.setAdapter(LJJIII());
            final Context context = recyclerView.getContext();
            recyclerView.LJIIJJI(new C73379Sr1(context) { // from class: X.4NM
                @Override // X.C73379Sr1, X.C0A6
                public final void LJIILJJIL(int i, RecyclerView recyclerView2) {
                    View view;
                    o.LJIIIZ(recyclerView2, "recyclerView");
                    super.LJIILJJIL(i, recyclerView2);
                    if (i == 1) {
                        Window window2 = C4NG.this.getWindow();
                        if (window2 != null) {
                            view = window2.getCurrentFocus();
                        } else {
                            view = null;
                        }
                        KeyboardUtils.LIZIZ(view);
                    }
                }
            });
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.b1d, (ViewGroup) findViewById(R.id.bs7), false);
            View findViewById = LLLLIILL.findViewById(R.id.gb2);
            this.LLI = findViewById;
            if (findViewById != null) {
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 144), findViewById);
            }
            C4N7 LJJIII = LJJIII();
            LJJIII.getClass();
            View view = LJJIII.LJLJJI;
            if (view == null) {
                LJJIII.LJLJJI = LLLLIILL;
                LJJIII.LJLJJL = true;
                LJJIII.notifyItemInserted(0);
            } else {
                o.LJ(view, LLLLIILL);
            }
            C107124Ii c107124Ii = this.LJZ;
            if (c107124Ii != null) {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                C107114Ih c107114Ih = new C107114Ih(context2);
                c107114Ih.LIZJ(c107124Ii);
                ((ViewGroup) findViewById(R.id.l8o)).addView(c107114Ih);
            }
            String string2 = this.LJLLL.extras.getString("default_edit_text_msg");
            if (string2 != null) {
                C108474Nn c108474Nn = (C108474Nn) this.LLIIJI.getValue();
                c108474Nn.getClass();
                C108464Nm c108464Nm = c108474Nn.LIZJ;
                c108464Nm.getClass();
                c108464Nm.LJIIIIZZ.setText(string2);
                c108464Nm.LJIIIIZZ.setSelection(string2.length());
            }
            SharePackage sharePackage = this.LJLLL;
            o.LJIIIZ(sharePackage, "<this>");
            String string3 = sharePackage.extras.getString("share_live_intent");
            if (string3 != null && o.LJ(string3, "multi_guest_invite") && C78857UxB.LJJJIL(string3)) {
                osj = new OSJ(Boolean.TRUE, 0, C78857UxB.LJJIIZI("pm_mt_multi_sendinvite"));
            } else {
                osj = new OSJ(Boolean.FALSE, 0, "");
            }
            boolean booleanValue = ((Boolean) osj.getFirst()).booleanValue();
            int intValue = ((Number) osj.getSecond()).intValue();
            String tipText = (String) osj.getThird();
            if (booleanValue) {
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                C107114Ih c107114Ih2 = new C107114Ih(context3);
                o.LJIIIZ(tipText, "tipText");
                ((TuxIconView) c107114Ih2.LIZ(R.id.l8k)).setIconRes(intValue);
                ((TextView) c107114Ih2.LIZ(R.id.l8l)).setText(tipText);
                ((ViewGroup) findViewById(R.id.l8o)).addView(c107114Ih2);
            }
            this.LLIIIL.LIZ();
            final ShareDialogViewModel shareDialogViewModel = this.LLIIIZ;
            shareDialogViewModel.LJLJL.observe(this.LLIIII, new Observer() { // from class: X.4NE
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Collection it = (Collection) obj;
                    C4NG c4ng = C4NG.this;
                    ShareDialogViewModel shareDialogViewModel2 = shareDialogViewModel;
                    o.LJIIIIZZ(it, "it");
                    List<? extends T> LLJILJILJ = ORZ.LLJILJILJ(it);
                    shareDialogViewModel2.getClass();
                    String string4 = shareDialogViewModel2.LJLIL.extras.getString("selected_uid");
                    if (!C1GE.LJIIL(string4)) {
                        string4 = null;
                    }
                    int i = 0;
                    if (string4 != null) {
                        ArrayList arrayList = (ArrayList) LLJILJILJ;
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            IMContact iMContact = (IMContact) it2.next();
                            if ((iMContact instanceof IMUser) && o.LJ(((IMUser) iMContact).getUid(), string4)) {
                                arrayList.remove(iMContact);
                                ListProtector.add(LLJILJILJ, 0, iMContact);
                                shareDialogViewModel2.hv0(C47261Igj.LJJIJ(iMContact));
                                shareDialogViewModel2.LJLIL.extras.remove("selected_uid");
                                break;
                            }
                        }
                    }
                    C4N7 LJJIII2 = c4ng.LJJIII();
                    boolean z2 = !LJJIII2.LJLJJL;
                    LJJIII2.LJLJJL = true;
                    if (LJJIII2.LJLJJI != null && z2) {
                        LJJIII2.notifyItemInserted(0);
                    }
                    ArrayList arrayList2 = (ArrayList) LLJILJILJ;
                    if (arrayList2.isEmpty()) {
                        c4ng.findViewById(R.id.jfz).setVisibility(8);
                        return;
                    }
                    C116814iD<T> c116814iD = c4ng.LJJIII().LJLIL;
                    c116814iD.LJ = LLJILJILJ;
                    c116814iD.LIZ.notifyDataSetChanged();
                    if (IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF()) {
                        c4ng.LJJ(LLJILJILJ);
                    }
                    C76732zl c76732zl = new C76732zl();
                    c76732zl.element = -1;
                    if (c4ng.LL) {
                        int size = arrayList2.size();
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (((IMContact) ListProtector.get(LLJILJILJ, i)).getType() == 17) {
                                c76732zl.element = i + 1;
                                break;
                            }
                            i++;
                        }
                    }
                    if (c76732zl.element != -1) {
                        c4ng.LLIILII = new ARunnableS20S0200000_1(c4ng, c76732zl, 32);
                        c4ng.findViewById(R.id.bs7).postDelayed(c4ng.LLIILII, 100L);
                    }
                    C107234It.LJIIJJI(c4ng.LJLLL);
                }
            });
            shareDialogViewModel.LJLJLLL.observe(this.LLIIII, new AObserverS69S0100000_1(this, 68));
            shareDialogViewModel.LJLJJL.observe(this.LLIIII, new AObserverS69S0100000_1(this, 69));
            shareDialogViewModel.LJLJJLL.observe(this.LLIIII, new AObserverS69S0100000_1(this, 70));
            shareDialogViewModel.LJLLILLLL.observe(this.LLIIII, new AObserverS69S0100000_1(this, 71));
            shareDialogViewModel.LJLLJ.observe(this.LLIIII, new AObserverS69S0100000_1(this, 72));
            shareDialogViewModel.LJLLI.observe(this.LLIIII, new AObserverS69S0100000_1(this, 73));
            ShareDialogViewModel shareDialogViewModel2 = this.LLIIIZ;
            java.util.Set<IMContact> set = this.LJLL;
            if (set == null || (list = ORZ.LLJI(set)) == null) {
                list = C61878OQg.INSTANCE;
            }
            shareDialogViewModel2.hv0(list);
            if (this.LLII) {
                ShareDialogViewModel shareDialogViewModel3 = this.LLIIIZ;
                C4NN c4nn2 = this.LJZI;
                if (c4nn2 == null || (list2 = c4nn2.getBatchContacts()) == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                shareDialogViewModel3.hv0(list2);
            }
            shareDialogViewModel.LJLLLL.setValue(0);
            shareDialogViewModel.LJLILLLLZI.refresh();
            C73305Spp status_view = (C73305Spp) findViewById(R.id.kf_);
            o.LJIIIIZZ(status_view, "status_view");
            C4NJ search_head_list = (C4NJ) findViewById(R.id.jfz);
            o.LJIIIIZZ(search_head_list, "search_head_list");
            ShareDialogViewModel shareDialogViewModel4 = this.LLIIIZ;
            if (this.LLIIIJ != null) {
                z = true;
            } else {
                z = false;
            }
            new C84793Ul(status_view, search_head_list, shareDialogViewModel4, z, this.LLIIII);
        }
        Activity activity = this.LJLJLLL;
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
            this.LLIIIILZ = C4NV.LIZ(activityC45651qj);
        }
        ((LifecycleRegistry) this.LLFF.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        if (this.LLF) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bs8);
            LinearLayout LJJII = LJJII();
            if (LJJII != null && (layoutParams4 = LJJII.getLayoutParams()) != null) {
                layoutParams4.height = -1;
            }
            LinearLayout LJJII2 = LJJII();
            if (LJJII2 != null) {
                C26338AVi.LJIIIZ(LJJII2, 0, 0, 0, Integer.valueOf((int) KL2.LIZJ(getContext(), 12.0f)), 16);
            }
            FrameLayout LJJI2 = LJJI();
            if (LJJI2 != null) {
                layoutParams = LJJI2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            C06F c06f = (C06F) layoutParams;
            ((ViewGroup.MarginLayoutParams) c06f).width = -2;
            ((ViewGroup.MarginLayoutParams) c06f).height = -1;
            c06f.LIZJ = 8388613;
            View findViewById2 = findViewById(R.id.bv5);
            if (findViewById2 != null) {
                findViewById2.setFitsSystemWindows(false);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.a8b);
            }
            LinearLayout LJJII3 = LJJII();
            if (LJJII3 != null) {
                layoutParams2 = LJJII3.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                LinearLayout LJJII4 = LJJII();
                if (LJJII4 != null) {
                    layoutParams3 = LJJII4.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams3;
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                int LJJJJL = C63081OpJ.LJJJJL(context4);
                Context context5 = getContext();
                o.LJIIIIZZ(context5, "context");
                int LJJJJJL = C63081OpJ.LJJJJJL(context5);
                if (LJJJJL > LJJJJJL) {
                    LJJJJL = LJJJJJL;
                }
                layoutParams5.width = LJJJJL;
                Drawable drawable = getContext().getDrawable(R.drawable.bpi);
                LinearLayout LJJII5 = LJJII();
                if (LJJII5 != null) {
                    LJJII5.setBackground(drawable);
                }
            }
            C117524jM.LIZIZ(this, frameLayout);
        }
        SharePackage sharePackage2 = this.LJLLL;
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        if (sharePackage2 != null && (bundle2 = sharePackage2.extras) != null) {
            str2 = bundle2.getString("enter_from");
        } else {
            str2 = null;
        }
        LIZ2.put("enter_from", str2);
        if (sharePackage2 != null) {
            Bundle bundle3 = sharePackage2.extras;
            if (bundle3 == null || (string = bundle3.getString("button_source", null)) == null) {
                Bundle bundle4 = sharePackage2.extras;
                if (bundle4 != null) {
                    str3 = bundle4.getString("enter_method");
                }
            } else {
                str3 = string;
            }
        }
        LIZ2.put("panel_source", str3);
        LIZ2.put("page_name", "share_friend_list");
        LIZ.LIZIZ("share_friend_list_show", LIZ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4NG(Activity activity, java.util.Set set, boolean z, C4NQ c4nq, boolean z2, SharePackage initSharePackage, BaseContent baseContent, java.util.Map map, java.util.Map map2, C107124Ii c107124Ii, C4NN c4nn, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        super(C78605Ut7.LJIIIIZZ(activity), R.style.a8i);
        boolean z8;
        boolean z9;
        boolean z10;
        InterfaceC101153y3 interfaceC101153y3;
        C4NQ c4nq2 = c4nq;
        boolean z11 = z2;
        BaseContent baseContent2 = baseContent;
        java.util.Map map3 = map;
        boolean z12 = z7;
        C107124Ii c107124Ii2 = c107124Ii;
        java.util.Map map4 = map2;
        boolean z13 = z3;
        boolean z14 = z4;
        boolean z15 = z5;
        boolean z16 = (i & 4) != 0 ? false : z;
        c4nq2 = (i & 8) != 0 ? null : c4nq2;
        z11 = (i & 16) != 0 ? false : z11;
        baseContent2 = (i & 64) != 0 ? null : baseContent2;
        map3 = (i & 128) != 0 ? null : map3;
        map4 = (i & 256) != 0 ? null : map4;
        c107124Ii2 = (i & 512) != 0 ? null : c107124Ii2;
        C4NN c4nn2 = (i & 1024) == 0 ? c4nn : null;
        z13 = (i & 2048) != 0 ? C92333jp.LIZIZ() : z13;
        if ((i & 4096) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        z14 = (i & FileUtils.BUFFER_SIZE) != 0 ? false : z14;
        z15 = (i & 16384) != 0 ? true : z15;
        z6 = (32768 & i) != 0 ? C3UE.LIZ() : z6;
        z12 = (i & 65536) != 0 ? false : z12;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(initSharePackage, "initSharePackage");
        this.LJLJLLL = activity;
        this.LJLL = set;
        this.LJLLI = z16;
        this.LJLLILLLL = c4nq2;
        this.LJLLJ = z11;
        this.LJLLL = initSharePackage;
        this.LJLLLL = baseContent2;
        this.LJLLLLLL = map3;
        this.LJLZ = map4;
        this.LJZ = c107124Ii2;
        this.LJZI = c4nn2;
        this.LJZL = z13;
        this.LL = z14;
        this.LLD = z12;
        if (!initSharePackage.LJIIJ() && initSharePackage.extras.containsKey("is_share_live") && o.LJ(C16880lQ.LLJJIII(initSharePackage.extras, "is_share_live"), Boolean.TRUE)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.LLF = z9;
        this.LLFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 791));
        this.LLFFF = true;
        this.LLFII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 790));
        this.LLFZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 792));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 789));
        if (c4nn2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.LLII = z10;
        this.LLIIII = (ActivityC45651qj) activity;
        String string = initSharePackage.extras.getString("ttn_filter_scene");
        this.LLIIIJ = string;
        boolean z17 = initSharePackage.extras.getBoolean("friend_only");
        C101173y5 c101173y5 = InterfaceC101153y3.LJJJLIIL;
        final List<IMUser> preloadedContacts = (c4nn2 == null || (preloadedContacts = c4nn2.getBatchContacts()) == null) ? C61878OQg.INSTANCE : preloadedContacts;
        boolean z18 = z6 && !z17;
        c101173y5.getClass();
        o.LJIIIZ(preloadedContacts, "preloadedContacts");
        if (preloadedContacts.isEmpty()) {
            interfaceC101153y3 = new C3S1((C3R2) C221108m2.LIZIZ(new C3RE(z17, z15, null, null, Boolean.FALSE, z18, string)).getValue(), z8, z18);
        } else {
            interfaceC101153y3 = new InterfaceC101153y3(preloadedContacts) { // from class: X.3S5
                public final List<IMContact> LJLIL;
                public final MutableLiveData<String> LJLILLLLZI = new MutableLiveData<>();
                public final MutableLiveData<List<IMContact>> LJLJI = new MutableLiveData<>();
                public final MutableLiveData<List<IMContact>> LJLJJI = new MutableLiveData<>();
                public final MutableLiveData LJLJJL = new MutableLiveData();

                @Override // X.InterfaceC101153y3
                public final void LLIIIL(String str) {
                }

                @Override // X.InterfaceC101153y3
                public final void onCleared() {
                }

                @Override // X.InterfaceC101153y3
                public final void refresh() {
                }

                @Override // X.InterfaceC101153y3
                public final void LIZ() {
                    this.LJLJJI.setValue(this.LJLIL);
                }

                @Override // X.InterfaceC101153y3
                public final /* bridge */ /* synthetic */ MutableLiveData LIZIZ() {
                    return this.LJLJI;
                }

                @Override // X.InterfaceC101153y3
                public final /* bridge */ /* synthetic */ MutableLiveData LIZJ() {
                    return this.LJLILLLLZI;
                }

                @Override // X.InterfaceC101153y3
                public final /* bridge */ /* synthetic */ MutableLiveData LIZLLL() {
                    return this.LJLJJI;
                }

                @Override // X.InterfaceC101153y3
                public final LiveData<C3S2> getState() {
                    return this.LJLJJL;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LJLIL = preloadedContacts;
                }
            };
        }
        this.LLIIIL = interfaceC101153y3;
        this.LLIIIZ = new ShareDialogViewModel(initSharePackage, interfaceC101153y3);
        this.LLIIJI = C221108m2.LIZIZ(new C4NI(this));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 793));
        this.LLIIL = new ArrayList();
        InterfaceC98153tD.LIZ.LIZIZ("more_share_dialog");
    }
}
