package com.ss.android.ugc.aweme.mix.mixdetail;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C109824Ss;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C228428xq;
import X.C228448xs;
import X.C228458xt;
import X.C228468xu;
import X.C228478xv;
import X.C228498xx;
import X.C228508xy;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26227ARb;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76732zl;
import X.C76800UCe;
import X.C78926UyI;
import X.C8C6;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY4;
import X.TBT;
import X.TBW;
import X.UC0;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.IDqS182S0200000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixFeedManagerFragment extends AmeBaseFragment implements KPL {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C252709vu LJLIL;
    public C228428xq LJLILLLLZI;
    public final C214298b3 LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public final long LJLJL;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public MixFeedManagerFragment() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosManageViewModel.class);
        this.LJLJI = new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 498), C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C8C6.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJI = "";
        this.LJLJJL = "";
        this.LJLJL = 300L;
    }

    public final MixVideosManageViewModel vl() {
        return (MixVideosManageViewModel) this.LJLJI.getValue();
    }

    public final void xl() {
        Context context = getContext();
        o.LJI(context);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.ejd);
        c26227ARb.LIZ(R.string.ejc);
        UC0.LIZJ(c26227ARb, new AqS169S0100000_3(this, 263));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        o.LJI(view);
        view.setFocusableInTouchMode(true);
        View view2 = getView();
        o.LJI(view2);
        view2.requestFocus();
        View view3 = getView();
        o.LJI(view3);
        view3.setOnKeyListener(new View.OnKeyListener() { // from class: X.8xr
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view4, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 4) {
                    C212418Vh.LJIIJJI(MixFeedManagerFragment.this.vl(), new AqS169S0100000_3(MixFeedManagerFragment.this, 262));
                    return true;
                }
                return false;
            }
        });
    }

    public final void wl(boolean z) {
        Resources resources;
        Resources resources2;
        MixVideosManageViewModel vl = vl();
        vl.getClass();
        vl.setState(new AqS8S0010000_3(z, 59));
        if (z) {
            C252709vu c252709vu = this.LJLIL;
            if (c252709vu != null) {
                c252709vu.LJIJ("cancel_text", C228498xx.LJLIL);
                Context context = getContext();
                if (context != null && (resources2 = context.getResources()) != null) {
                    C252709vu c252709vu2 = this.LJLIL;
                    if (c252709vu2 != null) {
                        C9KF c9kf = new C9KF();
                        String string = resources2.getString(R.string.fk2);
                        o.LJIIIIZZ(string, "it.getString(R.string.edit_playlist)");
                        c9kf.LIZJ = string;
                        c252709vu2.LJIILLIIL(c9kf);
                    } else {
                        o.LJIJI("mTitleBar");
                        throw null;
                    }
                }
                C252709vu c252709vu3 = this.LJLIL;
                if (c252709vu3 != null) {
                    c252709vu3.LJIJ("done_text", C228508xy.LJLIL);
                    C252709vu c252709vu4 = this.LJLIL;
                    if (c252709vu4 != null) {
                        c252709vu4.LJIJ("back_btn", C228458xt.LJLIL);
                    } else {
                        o.LJIJI("mTitleBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("mTitleBar");
                    throw null;
                }
            } else {
                o.LJIJI("mTitleBar");
                throw null;
            }
        } else {
            C252709vu c252709vu5 = this.LJLIL;
            if (c252709vu5 != null) {
                c252709vu5.LJIJ("cancel_text", C228468xu.LJLIL);
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    C252709vu c252709vu6 = this.LJLIL;
                    if (c252709vu6 != null) {
                        C9KF c9kf2 = new C9KF();
                        String string2 = resources.getString(R.string.q1g);
                        o.LJIIIIZZ(string2, "it.getString(R.string.remove_from_playlist)");
                        c9kf2.LIZJ = string2;
                        c252709vu6.LJIILLIIL(c9kf2);
                    } else {
                        o.LJIJI("mTitleBar");
                        throw null;
                    }
                }
                C252709vu c252709vu7 = this.LJLIL;
                if (c252709vu7 != null) {
                    c252709vu7.LJIJ("done_text", C228478xv.LJLIL);
                    C252709vu c252709vu8 = this.LJLIL;
                    if (c252709vu8 != null) {
                        c252709vu8.LJIJ("back_btn", C228448xs.LJLIL);
                    } else {
                        o.LJIJI("mTitleBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("mTitleBar");
                    throw null;
                }
            } else {
                o.LJIJI("mTitleBar");
                throw null;
            }
        }
        if (z) {
            C228428xq c228428xq = this.LJLILLLLZI;
            if (c228428xq != null) {
                LinearLayout editMixLayout = c228428xq.getEditMixLayout();
                if (editMixLayout != null) {
                    editMixLayout.setVisibility(0);
                }
                C228428xq c228428xq2 = this.LJLILLLLZI;
                if (c228428xq2 != null) {
                    TextView removeConfirmView = c228428xq2.getRemoveConfirmView();
                    if (removeConfirmView == null) {
                        return;
                    }
                    removeConfirmView.setVisibility(8);
                    return;
                }
                o.LJIJI("mBottomView");
                throw null;
            }
            o.LJIJI("mBottomView");
            throw null;
        }
        C228428xq c228428xq3 = this.LJLILLLLZI;
        if (c228428xq3 != null) {
            LinearLayout editMixLayout2 = c228428xq3.getEditMixLayout();
            if (editMixLayout2 != null) {
                editMixLayout2.setVisibility(8);
            }
            C228428xq c228428xq4 = this.LJLILLLLZI;
            if (c228428xq4 != null) {
                TextView removeConfirmView2 = c228428xq4.getRemoveConfirmView();
                if (removeConfirmView2 == null) {
                    return;
                }
                removeConfirmView2.setVisibility(0);
                return;
            }
            o.LJIJI("mBottomView");
            throw null;
        }
        o.LJIJI("mBottomView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.gkn);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.mix_manage_title_bar)");
        C252709vu c252709vu = (C252709vu) findViewById;
        this.LJLIL = c252709vu;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = false;
        LIZJ.LIZIZ = "back_btn";
        LIZJ.LJI = false;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1695));
        c235119Kp.LIZLLL(LIZJ);
        C234509Ig c234509Ig = new C234509Ig();
        Context context = getContext();
        o.LJI(context);
        String string = context.getResources().getString(R.string.cg_);
        o.LJIIIIZZ(string, "context!!.resources.getString(R.string.cancel)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZIZ = "cancel_text";
        c234509Ig.LJ = true;
        c234509Ig.LIZ = new C109824Ss(new AqS153S0100000_3(this, 1696));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
        Context context2 = getContext();
        o.LJI(context2);
        String string2 = context2.getResources().getString(R.string.fk2);
        o.LJIIIIZZ(string2, "context!!.resources.getS…g(R.string.edit_playlist)");
        LIZLLL.LIZJ = string2;
        LIZLLL.LIZIZ = "edit_playlist_text";
        c235119Kp.LIZJ = LIZLLL;
        C234509Ig c234509Ig2 = new C234509Ig();
        Context context3 = getContext();
        o.LJI(context3);
        String string3 = context3.getResources().getString(R.string.exd);
        o.LJIIIIZZ(string3, "context!!.resources.getString(R.string.done)");
        c234509Ig2.LIZJ = string3;
        c234509Ig2.LJ = false;
        c234509Ig2.LIZIZ = "done_text";
        c235119Kp.LIZIZ(c234509Ig2);
        c252709vu.setNavActions(c235119Kp);
        C252709vu c252709vu2 = this.LJLIL;
        if (c252709vu2 != null) {
            View LJI = c252709vu2.LJI("done_text");
            if (LJI != null && LJI.getVisibility() == 0) {
                C8YN.LJII(this, vl(), new TBT() { // from class: X.8xd
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C228228xW) obj).LJLJJL;
                    }
                }, null, new AqS185S0100000_3(this, 218), 6);
            }
            C252709vu c252709vu3 = this.LJLIL;
            if (c252709vu3 != null) {
                View LJI2 = c252709vu3.LJI("done_text");
                if (LJI2 != null) {
                    LJI2.isEnabled();
                }
                C252709vu c252709vu4 = this.LJLIL;
                if (c252709vu4 != null) {
                    c252709vu4.LJIJ("done_text", new AqS169S0100000_3(this, 951));
                    C8VV.LIZ(this, false, new AqS169S0100000_3(this, 952));
                    View findViewById2 = view.findViewById(R.id.gkm);
                    o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.mix_manage_bottom)");
                    C228428xq c228428xq = (C228428xq) findViewById2;
                    this.LJLILLLLZI = c228428xq;
                    SY4 removeView = c228428xq.getRemoveView();
                    if (removeView != null) {
                        C16880lQ.LJJIZ(removeView, new ACListenerS23S0100000_3(this, 309));
                    }
                    C228428xq c228428xq2 = this.LJLILLLLZI;
                    if (c228428xq2 != null) {
                        TextView removeConfirmView = c228428xq2.getRemoveConfirmView();
                        if (removeConfirmView != null) {
                            C16880lQ.LJIJI(removeConfirmView, new ACListenerS23S0100000_3(this, 310));
                        }
                        C228428xq c228428xq3 = this.LJLILLLLZI;
                        if (c228428xq3 != null) {
                            SY4 addVideoView = c228428xq3.getAddVideoView();
                            if (addVideoView != null) {
                                C16880lQ.LJJIZ(addVideoView, new ACListenerS23S0100000_3(this, 311));
                            }
                            C8YN.LJIIJ(this, vl(), new TBT() { // from class: X.8xz
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C228228xW) obj).LJLILLLLZI;
                                }
                            }, new TBT() { // from class: X.8xo
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C228228xW) obj).LJLIL;
                                }
                            }, null, new IDqS428S0100000_3(this, 15), 12);
                            C76732zl c76732zl = new C76732zl();
                            MixFeedService.LJJIJIIJIL().LJIIIZ();
                            c76732zl.element = 100;
                            C8YN.LJIIJ(this, vl(), new TBT() { // from class: X.8y1
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C228228xW) obj).LJLJI;
                                }
                            }, new TBT() { // from class: X.8y0
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C228228xW) obj).LJLILLLLZI;
                                }
                            }, null, new IDqS182S0200000_3(this, c76732zl, 6), 12);
                            C8YN.LJII(this, vl(), new TBT() { // from class: X.8xp
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C228228xW) obj).LJLIL;
                                }
                            }, null, new AqS185S0100000_3(this, 219), 6);
                            return;
                        }
                        o.LJIJI("mBottomView");
                        throw null;
                    }
                    o.LJIJI("mBottomView");
                    throw null;
                }
                o.LJIJI("mTitleBar");
                throw null;
            }
            o.LJIJI("mTitleBar");
            throw null;
        }
        o.LJIJI("mTitleBar");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("key_mix_id");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LJLJJI = string;
            String string2 = arguments.getString("enter_from");
            if (string2 != null) {
                str = string2;
            }
            this.LJLJJL = str;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awo, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
