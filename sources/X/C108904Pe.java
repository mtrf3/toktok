package X;

import Y.ACListenerS21S0100000_1;
import Y.AObserverS65S0200000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108904Pe extends RecyclerView.ViewHolder implements C4QS {
    public static final /* synthetic */ int LJZ = 0;
    public SharePanelViewModel LJLIL;
    public final boolean LJLILLLLZI;
    public final C63044Ooi LJLJI;
    public final SY4 LJLJJI;
    public final TextView LJLJJL;
    public final SmartAvatarImageView LJLJJLL;
    public final ConstraintLayout LJLJL;
    public IMContact LJLJLJ;
    public int LJLJLLL;
    public C119354mJ LJLL;
    public boolean LJLLI;
    public final C4OA LJLLILLLL;
    public final C108924Pg LJLLJ;
    public final C107724Kq LJLLL;
    public final C62822Ol8 LJLLLL;
    public XKQ LJLLLLLL;
    public AObserverS65S0200000_1 LJLZ;

    static {
        new C108934Ph();
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        C78949Uyf.LJJJ(this, this.LJLJLJ, this.LJLLL, 0);
    }

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
        C108964Pk c108964Pk;
        C108924Pg c108924Pg = this.LJLLJ;
        if (c108924Pg != null && (c108964Pk = c108924Pg.LJI.LJFF) != null) {
            RunnableC108944Pi runnableC108944Pi = c108964Pk.LIZLLL;
            if (runnableC108944Pi != null) {
                c108964Pk.LIZJ.removeCallbacks(runnableC108944Pi);
            }
            c108964Pk.LIZLLL = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(C119354mJ c119354mJ) {
        int i;
        boolean z;
        IMUser iMUser;
        this.LJLL = c119354mJ;
        if ((c119354mJ instanceof IMUser) && (iMUser = (IMUser) c119354mJ) != null) {
            i = iMUser.getFollowStatus();
        } else {
            i = -1;
        }
        boolean z2 = false;
        if (IMUser.isFriend(i)) {
            z = false;
        } else {
            z = true;
        }
        if (this.LJLIL.LLD && z) {
            z2 = true;
        }
        this.LJLLI = z2;
    }

    public final void P(IMContact iMContact) {
        boolean z = iMContact instanceof IMUser;
        if (z && ((IMUser) iMContact).isOnline()) {
            C119354mJ c119354mJ = this.LJLL;
            if (c119354mJ != null) {
                c119354mJ.setActive(true);
                c119354mJ.setVisibility(0);
                c119354mJ.LIZ(R.attr.cr);
            }
        } else {
            C119354mJ c119354mJ2 = this.LJLL;
            if (c119354mJ2 != null) {
                c119354mJ2.setVisibility(8);
            }
        }
        if (z) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            IMUser iMUser = (IMUser) iMContact;
            C112244aq.LIZ(itemView, iMUser.getUid(), Boolean.valueOf(iMUser.isOnline()));
            return;
        }
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        itemView2.setTag(R.id.eg1, null);
    }

    public final void Q(boolean z) {
        int i;
        SY4 sy4 = this.LJLJJI;
        Context context = this.itemView.getContext();
        if (z) {
            i = R.string.qiu;
        } else {
            i = R.string.qic;
        }
        sy4.setText(context.getText(i));
        this.LJLJJI.setEnabled(!z);
        this.LJLJJI.setClickable(!z);
        this.LJLJL.setClickable(!z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108904Pe(View view, SharePanelViewModel viewModel, C4OT c4ot) {
        super(view);
        C107724Kq c107724Kq;
        Bundle bundle;
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = false;
        this.LJLLILLLL = new C4OA(viewModel, c4ot);
        InterfaceC107704Ko interfaceC107704Ko = this.LJLIL.LJLLJ;
        String str = null;
        if (interfaceC107704Ko != null && (c107724Kq = interfaceC107704Ko.getActivityStatusParams()) != null) {
            c107724Kq.LJ = "long_press_panel";
        } else {
            c107724Kq = null;
        }
        this.LJLLL = c107724Kq;
        View findViewById = view.findViewById(R.id.iln);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.radio)");
        C63044Ooi c63044Ooi = (C63044Ooi) findViewById;
        this.LJLJI = c63044Ooi;
        View findViewById2 = view.findViewById(R.id.az1);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.btn_send)");
        SY4 sy4 = (SY4) findViewById2;
        this.LJLJJI = sy4;
        View findViewById3 = view.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.name_tv)");
        this.LJLJJL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.avatar_iv)");
        this.LJLJJLL = (SmartAvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.eus);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.item_root_container)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
        this.LJLJL = constraintLayout;
        N((C119354mJ) view.findViewById(R.id.pq));
        if (C99W.LIZ) {
            sy4.setButtonVariant(5);
        }
        sy4.setVisibility(0);
        c63044Ooi.setVisibility(8);
        AqS132S0200000_1 aqS132S0200000_1 = new AqS132S0200000_1(this, view, 102);
        c63044Ooi.setClickable(false);
        C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(aqS132S0200000_1, 269));
        C16880lQ.LJIL(constraintLayout, new ACListenerS21S0100000_1(aqS132S0200000_1, 269));
        SharePackage sharePackage = this.LJLIL.LJLIL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            str = bundle.getString("panel_source");
        }
        int LIZIZ = C4P2.LIZIZ(str);
        if (C109254Qn.LIZIZ(this.LJLIL.LJLIL) && LIZIZ == 1) {
            if (C81313Hb.LIZ()) {
                C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 265));
                C16880lQ.LJIL(constraintLayout, new ACListenerS21S0100000_1(this, 267));
                sy4.setButtonVariant(0);
                sy4.setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(78)));
                sy4.setMinTextSize(9.0f);
            } else {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                C108924Pg c108924Pg = new C108924Pg(context, this.LJLIL, c107724Kq);
                this.LJLLJ = c108924Pg;
                c108924Pg.LIZLLL((ViewGroup) view);
            }
        }
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1036));
    }

    public final void L(IMContact contact, int i, boolean z, boolean z2, SharePanelViewModel newViewModel, InterfaceC70422pa interfaceC70422pa, InterfaceC71762rk<? extends EnumC107604Ke> interfaceC71762rk, LifecycleOwner lifecycleOwner) {
        float f;
        boolean z3;
        String str;
        View view;
        C119354mJ c119354mJ;
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(newViewModel, "newViewModel");
        this.LJLJLJ = contact;
        this.LJLJLLL = i;
        this.LJLIL = newViewModel;
        TextView textView = this.LJLJJL;
        String displayName = contact.getDisplayName();
        if (displayName == null) {
            displayName = C45804HyK.LJJLJ("");
        }
        textView.setText(displayName);
        Q(z);
        this.LJLJI.setChecked(z2);
        View view2 = this.itemView;
        if (this.LJLLI) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view2.setAlpha(f);
        boolean z4 = true;
        if ((C1041346v.LIZIZ() & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        XKQ xkq = null;
        if (z3) {
            ((InterfaceC1040946r) this.LJLLLL.getValue()).LIZ(contact, 0, 0);
        } else {
            W5F LJ = C45S.LJ(this.LJLJJLL, C78939UyV.LJ(contact.getDisplayAvatar()), R.drawable.b0p, 0, null, 24);
            LJ.LJJIII = EnumC62195Ob1.SMALL;
            IMUser LIZ = C81573Ib.LIZ(contact);
            if (LIZ != null) {
                str = LIZ.getUid();
            } else {
                str = null;
            }
            C43659HBn.LJIIZILJ(LJ, "LongPressShareListViewHolder", str, 0, null, 28);
        }
        C107234It.LJIIIIZZ(contact, i, "column", this.LJLIL.LJLIL, false);
        C4OA c4oa = this.LJLLILLLL;
        c4oa.getClass();
        c4oa.LJ = contact;
        c4oa.LIZLLL = i;
        if (C107454Jp.LIZ() && this.LJLL == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.pe);
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if (view instanceof C119354mJ) {
                c119354mJ = (C119354mJ) view;
            } else {
                c119354mJ = null;
            }
            N(c119354mJ);
        }
        if (C81313Hb.LIZ()) {
            if (contact instanceof IMUser) {
                P(contact);
                if (lifecycleOwner != null) {
                    IMUser iMUser = (IMUser) contact;
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
                    View itemView = this.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    itemView.setTag(R.id.eg1, null);
                    if (createIIMServicebyMonsterPlugin.getActivityStatusViewModel().getSettings().LJFF() && iMUser.getUid() != null) {
                        if (AV1.LJIJI(iMUser.getUid())) {
                            iMUser.setOnline(true);
                            P(iMUser);
                            View itemView2 = this.itemView;
                            o.LJIIIIZZ(itemView2, "itemView");
                            C112244aq.LIZ(itemView2, iMUser.getUid(), Boolean.TRUE);
                        } else {
                            C3B2 activityStatusViewModel = createIIMServicebyMonsterPlugin.getActivityStatusViewModel();
                            String uid = iMUser.getUid();
                            o.LJIIIIZZ(uid, "imContact.uid");
                            LiveData LIZ2 = C3B3.LIZ(activityStatusViewModel, uid, null, EnumC112364b2.SHARE_PANEL.getValue(), 6);
                            ActivityStatus activityStatus = (ActivityStatus) LIZ2.getValue();
                            if (activityStatus == null || !OUP.LJJII(activityStatus, null, null, 3)) {
                                z4 = false;
                            }
                            iMUser.setOnline(z4);
                            AObserverS65S0200000_1 aObserverS65S0200000_1 = this.LJLZ;
                            if (aObserverS65S0200000_1 != null) {
                                LIZ2.removeObserver(aObserverS65S0200000_1);
                            }
                            AObserverS65S0200000_1 aObserverS65S0200000_12 = new AObserverS65S0200000_1(iMUser, this, 20);
                            this.LJLZ = aObserverS65S0200000_12;
                            LIZ2.observe(lifecycleOwner, aObserverS65S0200000_12);
                        }
                    }
                }
            } else {
                C119354mJ c119354mJ2 = this.LJLL;
                if (c119354mJ2 != null) {
                    c119354mJ2.setVisibility(8);
                }
            }
        } else {
            P(contact);
        }
        if (C81313Hb.LIZ()) {
            XKQ xkq2 = this.LJLLLLLL;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            if (interfaceC70422pa != null) {
                xkq = XKX.LIZLLL(interfaceC70422pa, null, null, new C107634Kh(interfaceC71762rk, this, null), 3);
            }
            this.LJLLLLLL = xkq;
            return;
        }
        C108924Pg c108924Pg = this.LJLLJ;
        if (c108924Pg == null) {
            return;
        }
        SharePanelViewModel sharePanelViewModel = this.LJLIL;
        o.LJIIIZ(sharePanelViewModel, "sharePanelViewModel");
        c108924Pg.LJ = contact;
        c108924Pg.LJFF = i;
        c108924Pg.LIZIZ = sharePanelViewModel;
        c108924Pg.LJI = new C108914Pf(c108924Pg.LIZ, sharePanelViewModel, c108924Pg);
        if (contact.isShareSuccess()) {
            c108924Pg.LIZIZ();
            return;
        }
        SY4 sy4 = c108924Pg.LIZLLL;
        if (sy4 == null) {
            return;
        }
        sy4.setButtonVariant(0);
        sy4.setText(R.string.qic);
    }
}
