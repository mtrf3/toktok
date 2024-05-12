package X;

import Y.ACListenerS36S0200000_1;
import Y.AObserverS65S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.IDaS465S0100000_1;
import o3.IDaS88S0000000_1;
import o3.h0;

/* renamed from: X.4Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C109004Po extends C4P0 implements C4PA {
    public SharePanelViewModel LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public boolean LJLJL;
    public final C62822Ol8 LJLJLJ;
    public LifecycleOwner LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public C109354Qx LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;

    @Override // X.C4PA
    public final void LJJLJLI() {
        C109354Qx c109354Qx = this.LJLLILLLL;
        if (c109354Qx != null) {
            c109354Qx.LJLJI = false;
        }
    }

    public final int LJZI() {
        return ((Number) this.LJLJLJ.getValue()).intValue();
    }

    public final List<IMContact> getData() {
        return (List) this.LJLLI.getValue();
    }

    @Override // X.C4P0
    public final void LJLZ() {
        notifyItemRangeChanged(0, getData().size(), Boolean.TRUE);
    }

    @Override // X.AbstractC029409q
    public int getItemCount() {
        return getData().size();
    }

    public C109004Po(SharePanelViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLJJI = true;
        this.LJLJJL = C108994Pn.LJLZ;
        this.LJLJJLL = 2;
        this.LJLJLJ = C221108m2.LIZIZ(C4PV.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C4QJ.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(C4QA.LJLIL);
        this.LJLLJ = 64;
        this.LJLLL = 9;
        this.LJLLLL = 4;
    }

    @Override // X.C4P0
    public final void LJLLLLLL(SharePanelViewModel sharePanelViewModel) {
        this.LJLIL = sharePanelViewModel;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return ListProtector.get(getData(), i).hashCode();
    }

    @Override // X.AbstractC029409q
    public int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C4Q7) {
            return 6;
        }
        if (obj instanceof C108724Om) {
            return 2;
        }
        if (obj instanceof C4QO) {
            return 3;
        }
        if (obj instanceof C108734On) {
            return 4;
        }
        if (obj instanceof C4QL) {
            return 5;
        }
        if (obj instanceof C4QI) {
            return 7;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        C4QS c4qs;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof C4QS) && (c4qs = (C4QS) holder) != null) {
            c4qs.onAttachedToWindow();
        }
    }

    public C109004Po(SharePanelViewModel sharePanelViewModel, C108874Pb c108874Pb) {
        this(sharePanelViewModel);
        this.LJLILLLLZI = c108874Pb.LIZ;
        this.LJLJI = c108874Pb.LIZIZ;
        this.LJLJJL = c108874Pb.LIZJ;
        this.LJLJJLL = 2;
        this.LJLJJI = false;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [X.4Q4] */
    @Override // X.AbstractC029409q
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C107724Kq c107724Kq;
        String str;
        List<String> urlList;
        int i2;
        Bundle bundle;
        TextView textView;
        o.LJIIIZ(viewHolder, "viewHolder");
        boolean z = false;
        if (viewHolder instanceof C4Q0) {
            C4Q0 c4q0 = (C4Q0) viewHolder;
            IMContact contact = (IMContact) ListProtector.get(getData(), i);
            SharePanelViewModel newViewModel = this.LJLIL;
            o.LJIIIZ(contact, "contact");
            o.LJIIIZ(newViewModel, "newViewModel");
            c4q0.LJLJI = contact;
            c4q0.LJLIL = newViewModel;
            c4q0.LJLJJI = i;
            Context context = c4q0.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "ivMore.context");
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_magnifying_glass_fill;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            c2068389v.LJ = Integer.valueOf(R.attr.gu);
            c4q0.LJLIL.getClass();
            if (SharePanelViewModel.LIZ()) {
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
            }
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c4q0.LJLIL.getClass();
            if (SharePanelViewModel.LIZ()) {
                i2 = R.attr.eb;
            } else {
                i2 = R.attr.cf;
            }
            c110614Vt.LIZIZ = Integer.valueOf(i2);
            c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(24));
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c4q0.LJLILLLLZI.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context)));
            c4q0.LJLIL.getClass();
            C107814Kz.LIZ.getClass();
            if (C107814Kz.LIZIZ() > 0 && (textView = (TextView) c4q0.itemView.findViewById(R.id.gw7)) != null) {
                textView.setText(c4q0.itemView.getContext().getText(R.string.eu5));
            }
            h0.LJIJI(c4q0.itemView, new IDaS88S0000000_1(12));
            SharePanelViewModel sharePanelViewModel = c4q0.LJLIL;
            SharePackage sharePackage = sharePanelViewModel.LJLIL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                bundle.putString("button_source", bundle.getString("enter_method"));
                bundle.putInt("rank_num", c4q0.getBindingAdapterPosition());
            }
            sharePanelViewModel.LJIIJJI();
            return;
        }
        if (viewHolder instanceof C108994Pn) {
            final C108994Pn c108994Pn = (C108994Pn) viewHolder;
            IMContact contact2 = (IMContact) ListProtector.get(getData(), i);
            SharePanelViewModel newViewModel2 = this.LJLIL;
            LifecycleOwner lifecycleOwner = this.LJLJLLL;
            o.LJIIIZ(contact2, "contact");
            o.LJIIIZ(newViewModel2, "newViewModel");
            c108994Pn.LJLJL = contact2;
            c108994Pn.LJLIL = newViewModel2;
            c108994Pn.LJLJLJ = i;
            InterfaceC107704Ko interfaceC107704Ko = newViewModel2.LJLLJ;
            if (interfaceC107704Ko != null && (c107724Kq = interfaceC107704Ko.getActivityStatusParams()) != null) {
                c107724Kq.LIZIZ = EnumC112364b2.SHARE_PANEL;
                c107724Kq.LJ = "profile";
            } else {
                c107724Kq = null;
            }
            c108994Pn.LJLLLL = c107724Kq;
            new InterfaceC88472Yns<Integer, C76800UCe>() { // from class: X.4Q4
                public final void LIZ(int i3) {
                    if (C108994Pn.this.LJLJJI.getMaxLines() != i3) {
                        C108994Pn.this.LJLJJI.setMaxLines(i3);
                        C108994Pn c108994Pn2 = C108994Pn.this;
                        IMContact iMContact = c108994Pn2.LJLJL;
                        if (iMContact instanceof IMUser) {
                            o.LJII(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                            c108994Pn2.P((IMUser) iMContact);
                        } else {
                            if (!(iMContact instanceof IMConversation)) {
                                return;
                            }
                            o.LJII(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMConversation");
                            c108994Pn2.M((IMConversation) iMContact);
                        }
                    }
                }

                @Override // X.InterfaceC88472Yns
                public final /* bridge */ /* synthetic */ C76800UCe invoke(Integer num) {
                    LIZ(num.intValue());
                    return C76800UCe.LIZ;
                }
            }.LIZ(c108994Pn.LJLLI);
            boolean z2 = contact2 instanceof IMUser;
            if (z2) {
                IMUser iMUser = (IMUser) contact2;
                c108994Pn.itemView.setContentDescription(iMUser.getDisplayName());
                str = iMUser.getUid();
                o.LJIIIIZZ(str, "contact.uid");
                c108994Pn.P(iMUser);
                if ((C1041346v.LIZIZ() & 16) != 0) {
                    ((InterfaceC1040946r) c108994Pn.LJLLLLLL.getValue()).LIZ(iMUser, 0, 0);
                } else {
                    W5F LJ = C45S.LJ(c108994Pn.LJLJJL, C78939UyV.LJ(iMUser.getDisplayAvatar()), R.drawable.b0p, 0, null, 24);
                    LJ.LJJIII = EnumC62195Ob1.SMALL;
                    C43659HBn.LJIIZILJ(LJ, i0.LJFF("SharePanelHeadViewHolder", ":byUser"), iMUser.getUid(), 0, null, 28);
                }
            } else if (!(contact2 instanceof IMConversation)) {
                str = "";
            } else {
                IMConversation iMConversation = (IMConversation) contact2;
                c108994Pn.itemView.setContentDescription(iMConversation.getConversationName());
                str = iMConversation.getConversationId();
                o.LJIIIIZZ(str, "contact.conversationId");
                c108994Pn.M(iMConversation);
                UrlModel displayAvatar = iMConversation.getDisplayAvatar();
                if (displayAvatar != null && (urlList = displayAvatar.getUrlList()) != null && !urlList.isEmpty()) {
                    if ((C1041346v.LIZIZ() & 16) != 0) {
                        ((InterfaceC1040946r) c108994Pn.LJLLLLLL.getValue()).LIZ(iMConversation, 0, 0);
                    } else {
                        z = false;
                        W5F LJ2 = C45S.LJ(c108994Pn.LJLJJL, C78939UyV.LJ(displayAvatar), 0, 0, null, 28);
                        LJ2.LJJIII = EnumC62195Ob1.SMALL;
                        C43659HBn.LJIJ(LJ2, i0.LJFF("SharePanelHeadViewHolder", ":byConversation"), false, null, 6);
                    }
                }
            }
            c108994Pn.L();
            if (!o.LJ(str, "")) {
                C105004Ae.LIZIZ();
            }
            c108994Pn.N(contact2);
            C109044Ps c109044Ps = c108994Pn.LJLLJ;
            if (c109044Ps != null) {
                SharePanelViewModel shareViewModel = c108994Pn.LJLIL;
                o.LJIIIZ(shareViewModel, "shareViewModel");
                c109044Ps.LJIIIZ = contact2;
                c109044Ps.LIZIZ = shareViewModel;
                c109044Ps.LJIIJ = new C108914Pf(c109044Ps.LIZ, shareViewModel, c109044Ps);
                if (contact2.isShareSuccess()) {
                    c109044Ps.LJ();
                    View view = c109044Ps.LJIIIIZZ;
                    if (view != null) {
                        C17N.LJJIIJZLJL(view);
                    }
                    C119354mJ c119354mJ = c109044Ps.LJ;
                    if (c119354mJ != null) {
                        C17N.LJJIIJZLJL(c119354mJ);
                    }
                    View view2 = c109044Ps.LJII;
                    if (view2 != null) {
                        C17N.LJJLIIIJJI(view2);
                    }
                    TuxTextView tuxTextView = c109044Ps.LJFF;
                    if (tuxTextView != null) {
                        C17N.LJJIIJZLJL(tuxTextView);
                    }
                } else {
                    View view3 = c109044Ps.LJIIIIZZ;
                    if (view3 != null) {
                        C17N.LJJIIJZLJL(view3);
                    }
                    View view4 = c109044Ps.LJII;
                    if (view4 != null) {
                        C17N.LJJIIJZLJL(view4);
                    }
                    TuxTextView tuxTextView2 = c109044Ps.LJI;
                    if (tuxTextView2 != null) {
                        C17N.LJJIIJZLJL(tuxTextView2);
                    }
                    TuxTextView tuxTextView3 = c109044Ps.LJFF;
                    if (tuxTextView3 != null) {
                        C17N.LJJLIIIJJI(tuxTextView3);
                    }
                    c109044Ps.LJFF();
                }
            }
            if (lifecycleOwner != null) {
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(z);
                o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
                View itemView = c108994Pn.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                itemView.setTag(R.id.eg1, null);
                if (createIIMServicebyMonsterPlugin.getActivityStatusViewModel().getSettings().LJFF() && z2) {
                    IMUser iMUser2 = (IMUser) contact2;
                    if (iMUser2.getUid() != null) {
                        if (AV1.LJIJI(iMUser2.getUid())) {
                            iMUser2.setOnline(true);
                            c108994Pn.Q(true);
                            View itemView2 = c108994Pn.itemView;
                            o.LJIIIIZZ(itemView2, "itemView");
                            C112244aq.LIZ(itemView2, iMUser2.getUid(), Boolean.TRUE);
                        } else {
                            C3B2 activityStatusViewModel = createIIMServicebyMonsterPlugin.getActivityStatusViewModel();
                            String uid = iMUser2.getUid();
                            o.LJIIIIZZ(uid, "imContact.uid");
                            LiveData LIZ2 = C3B3.LIZ(activityStatusViewModel, uid, null, EnumC112364b2.SHARE_PANEL.getValue(), 6);
                            ActivityStatus activityStatus = (ActivityStatus) LIZ2.getValue();
                            if (activityStatus != null && OUP.LJJII(activityStatus, null, null, 3)) {
                                z = true;
                            }
                            iMUser2.setOnline(z);
                            AObserverS65S0200000_1 aObserverS65S0200000_1 = c108994Pn.LJLLL;
                            if (aObserverS65S0200000_1 != null) {
                                LIZ2.removeObserver(aObserverS65S0200000_1);
                            }
                            AObserverS65S0200000_1 aObserverS65S0200000_12 = new AObserverS65S0200000_1(contact2, c108994Pn, 21);
                            c108994Pn.LJLLL = aObserverS65S0200000_12;
                            LIZ2.observe(lifecycleOwner, aObserverS65S0200000_12);
                        }
                    }
                }
            }
            h0.LJIJI(c108994Pn.itemView, new IDaS465S0100000_1(c108994Pn, 5));
            return;
        }
        if (viewHolder instanceof C109354Qx) {
            ((C109354Qx) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (viewHolder instanceof C4R2) {
            ((C4R2) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (viewHolder instanceof C4Q5) {
            C4Q5 c4q5 = (C4Q5) viewHolder;
            IMContact contact3 = (IMContact) ListProtector.get(getData(), i);
            SharePanelViewModel newViewModel3 = this.LJLIL;
            o.LJIIIZ(contact3, "contact");
            o.LJIIIZ(newViewModel3, "newViewModel");
            c4q5.LJLIL = newViewModel3;
            if (!newViewModel3.LJIIIIZZ().isEmpty()) {
                C16880lQ.LJIIJ(null, c4q5.itemView);
                c4q5.L(false);
                return;
            } else {
                c4q5.L(true);
                C16880lQ.LJIIJ(new ACListenerS36S0200000_1(contact3, c4q5, 89), c4q5.itemView);
                return;
            }
        }
        if (!(viewHolder instanceof C4Q3)) {
            return;
        }
        C4Q3 c4q3 = (C4Q3) viewHolder;
        IMContact contact4 = (IMContact) ListProtector.get(getData(), i);
        SharePanelViewModel newViewModel4 = this.LJLIL;
        o.LJIIIZ(contact4, "contact");
        o.LJIIIZ(newViewModel4, "newViewModel");
        c4q3.LJLIL = newViewModel4;
        c4q3.LJLILLLLZI = contact4;
        c4q3.LJLJI = i;
        C17N.LJJIIJZLJL(c4q3.itemView.findViewById(R.id.c49));
        if (!(contact4 instanceof C4Q7)) {
            return;
        }
        C105004Ae.LIZIZ();
        C4Q7 c4q7 = (C4Q7) contact4;
        if (c4q7.getMafUsers().size() > 1) {
            ((ImageView) c4q3.itemView.findViewById(R.id.da1)).setVisibility(0);
            ((ImageView) c4q3.itemView.findViewById(R.id.jip)).setVisibility(0);
            C4AS.LJII((W5G) c4q3.itemView.findViewById(R.id.da1), ((IMContact) ListProtector.get(c4q7.getMafUsers(), 0)).getDisplayAvatar(), "", null, null, 0, 0, 504);
            C4AS.LJII((W5G) c4q3.itemView.findViewById(R.id.jip), ((IMContact) ListProtector.get(c4q7.getMafUsers(), 1)).getDisplayAvatar(), "", null, null, 0, 0, 504);
            ((ImageView) c4q3.itemView.findViewById(R.id.acf)).setVisibility(8);
            return;
        }
        if (c4q7.getMafUsers().size() != 1) {
            return;
        }
        C4AS.LJII((W5G) c4q3.itemView.findViewById(R.id.acf), ((IMContact) ListProtector.get(c4q7.getMafUsers(), 0)).getDisplayAvatar(), "", null, null, 0, 0, 504);
        ((ImageView) c4q3.itemView.findViewById(R.id.da1)).setVisibility(8);
        ((ImageView) c4q3.itemView.findViewById(R.id.jip)).setVisibility(8);
        ((ImageView) c4q3.itemView.findViewById(R.id.acf)).setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        if (r6 != null) goto L24;
     */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup r25, int r26) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109004Po.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4P0
    public void LJZ(Context context, LifecycleOwner lifecycleOwner, List list) {
        int i;
        int i2;
        Activity LJIJJ;
        WindowManager windowManager;
        Display defaultDisplay;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setData: ");
        Integer num = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        LIZ.append(num);
        C34B.LJI("SharePanelHeadAdapter", X1D.LIZIZ(LIZ));
        this.LJLJLLL = lifecycleOwner;
        int i3 = 0;
        if (list == null) {
            if (C4VT.LIZJ()) {
                getData().clear();
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (windowManager = LJIJJ.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    i2 = (displayMetrics.widthPixels - (C1DF.LJIIIZ(this.LJLLL) * 2)) / (C1DF.LJIIIZ(this.LJLLLL) + C1DF.LJIIIZ(this.LJLLJ));
                } else {
                    i2 = 5;
                    getData().add(this.LJLL.getValue());
                    i3 = 0 + 1;
                }
                while (i3 < i2) {
                    getData().add(this.LJLL.getValue());
                    i3++;
                }
            }
            notifyDataSetChanged();
        } else if (!list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (!((Boolean) L17.LIZIZ.getValue()).booleanValue() && this.LJLIL.LIZLLL()) {
                arrayList.add(new C4QO());
                i = 3;
            } else {
                i = 4;
            }
            if (((Boolean) L1S.LIZJ.getValue()).booleanValue() && this.LJLIL.LIZIZ()) {
                arrayList.add(new C108734On());
                i--;
            }
            C4OX LJI = this.LJLIL.LJI();
            if (LJI == C4OX.FIRST) {
                arrayList.add(new IMContact() { // from class: X.4QL
                    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
                    public UrlModel getDisplayAvatar() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
                    public String getDisplayName() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
                    public String getNickName() {
                        return null;
                    }
                });
            }
            this.LJLIL.getClass();
            if (SharePanelViewModel.LIZ()) {
                arrayList.add(new C108724Om());
                i--;
            }
            SharePanelViewModel sharePanelViewModel = this.LJLIL;
            sharePanelViewModel.getClass();
            if (((Number) C109234Ql.LIZ.getValue()).intValue() > 0 || ((ArrayList) sharePanelViewModel.LJLJJI.LJLLL).size() <= 0 || System.currentTimeMillis() - C80993Fv.LIZ().LIZ.getLong("maf_group_click_time", 0L) < 86400000) {
                arrayList.addAll(list);
            } else if (list.size() > i) {
                arrayList.addAll(list.subList(0, i));
                arrayList.add(new C4Q7(this.LJLIL.LLIFFJFJJ));
                arrayList.addAll(list.subList(arrayList.size(), list.size()));
            } else {
                arrayList.addAll(list);
                arrayList.add(new C4Q7(this.LJLIL.LLIFFJFJJ));
            }
            SharePanelViewModel sharePanelViewModel2 = this.LJLIL;
            sharePanelViewModel2.getClass();
            C107814Kz.LIZ.getClass();
            if (C107814Kz.LIZIZ() == 0 || C107814Kz.LIZIZ() == 1 || C107814Kz.LIZIZ() == 4 || (C107814Kz.LIZIZ() == 3 && sharePanelViewModel2.LJ().size() <= 5)) {
                arrayList.add(new C108724Om());
            }
            if (LJI == C4OX.LAST) {
                arrayList.add(new IMContact() { // from class: X.4QL
                    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
                    public UrlModel getDisplayAvatar() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
                    public String getDisplayName() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
                    public String getNickName() {
                        return null;
                    }
                });
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((IMContact) it.next()).setShareSuccess(false);
            }
            if (C81313Hb.LIZ()) {
                C4Q6.LIZ(this, getData(), arrayList);
                List<IMContact> data = getData();
                data.clear();
                data.addAll(arrayList);
            } else {
                List<IMContact> data2 = getData();
                data2.clear();
                data2.addAll(arrayList);
                notifyDataSetChanged();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("set data cost: ");
            LIZ2.append(currentTimeMillis2 - currentTimeMillis);
            C34B.LJI("SharePanelHeadAdapter", X1D.LIZIZ(LIZ2));
        }
        C105004Ae.LIZIZ();
        if (OVS.LIZ() && list != null) {
            ArrayList arrayList2 = (ArrayList) C4P7.LIZ;
            arrayList2.clear();
            arrayList2.addAll(list);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("setData finish: ");
        LIZ3.append(getData().size());
        C34B.LJI("SharePanelHeadAdapter", X1D.LIZIZ(LIZ3));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> payloads) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, payloads);
            return;
        }
        Object LJLLLL = ORZ.LJLLLL(payloads);
        Object obj = null;
        if (!(LJLLLL instanceof Boolean)) {
            LJLLLL = null;
        }
        boolean z = viewHolder instanceof C108994Pn;
        if (z && o.LJ(LJLLLL, Boolean.TRUE)) {
            ((C108994Pn) viewHolder).N((IMContact) ListProtector.get(getData(), i));
        }
        Object LJLLLL2 = ORZ.LJLLLL(payloads);
        if (LJLLLL2 instanceof C4QR) {
            obj = LJLLLL2;
        }
        if (!z || !o.LJ(obj, C4QR.LIZ)) {
            return;
        }
        ((C108994Pn) viewHolder).N((IMContact) ListProtector.get(getData(), i));
    }
}
