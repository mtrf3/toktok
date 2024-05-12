package com.ss.android.ugc.aweme.mix.addfeed;

import X.AML;
import X.AbstractC26082ALm;
import X.C02Y;
import X.C116414hZ;
import X.C116714i3;
import X.C116724i4;
import X.C157166Eu;
import X.C16880lQ;
import X.C19K;
import X.C1DI;
import X.C1EU;
import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C77339UWx;
import X.C79594VLq;
import X.C85431Xfv;
import X.C85437Xg1;
import X.C85438Xg2;
import X.C85439Xg3;
import X.C85441Xg5;
import X.C85450XgE;
import X.C85451XgF;
import X.C85474Xgc;
import X.C85475Xgd;
import X.C85476Xge;
import X.C90193gN;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC74236TBo;
import X.InterfaceC85435Xfz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.Q7K;
import X.T5T;
import X.TBT;
import X.TBW;
import X.TMG;
import X.VN9;
import X.W1T;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS49S0200000_15;
import Y.ARunnableS10S0110000_4;
import Y.ARunnableS51S0100000_15;
import Y.IDObjectS186S0100000_15;
import android.graphics.drawable.ColorDrawable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DefaultMixListCell extends PowerCell<C85431Xfv> implements InterfaceC151715xP {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public T5T LJLIL;
    public TuxTextView LJLILLLLZI;
    public View LJLJI;
    public LinearLayout LJLJJI;
    public C116414hZ LJLJJL;
    public ImageView LJLJJLL;
    public TuxTextView LJLJL;
    public CountDownTimer LJLJLJ;
    public C85431Xfv LJLJLLL;
    public final C85437Xg1 LJLL = new C85437Xg1(this);
    public int LJLLI = 25;
    public final C214298b3 LJLLILLLL;

    static {
        TBT tbt = new TBT(DefaultMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final InterfaceC85435Xfz L() {
        return (InterfaceC85435Xfz) this.LJLL.LIZ(this, LJLLJ[0]);
    }

    public final void M() {
        View view = this.LJLJI;
        if (view != null) {
            view.setBackground(new ColorDrawable(C1EU.LIZ(this.itemView, "itemView.context", R.attr.dt)));
            LinearLayout linearLayout = this.LJLJJI;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                C116414hZ c116414hZ = this.LJLJJL;
                if (c116414hZ != null) {
                    c116414hZ.postDelayed(new ARunnableS51S0100000_15(this, 33), 300L);
                    ImageView imageView = this.LJLJJLL;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        TuxTextView tuxTextView = this.LJLJL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(this.itemView.getContext().getText(R.string.jtj));
                            return;
                        } else {
                            o.LJIJI("errorHintText");
                            throw null;
                        }
                    }
                    o.LJIJI("delete");
                    throw null;
                }
                o.LJIJI("loading");
                throw null;
            }
            o.LJIJI("errorHint");
            throw null;
        }
        o.LJIJI("inputLine");
        throw null;
    }

    public final void P() {
        String str;
        C116724i4 c116724i4 = new C116724i4();
        T5T t5t = this.LJLIL;
        if (t5t != null) {
            c116724i4.LIZIZ(String.valueOf(t5t.getText().length()));
            if (C90193gN.LIZ()) {
                str = "\u200f\\";
            } else {
                str = "\u200e/";
            }
            c116724i4.LIZIZ(str);
            c116724i4.LIZIZ(String.valueOf(this.LJLLI));
            C116714i3 c116714i3 = c116724i4.LIZ;
            T5T t5t2 = this.LJLIL;
            if (t5t2 != null) {
                if (t5t2.getText().length() > this.LJLLI) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C1EU.LIZ(this.itemView, "itemView.context", R.attr.e7));
                    T5T t5t3 = this.LJLIL;
                    if (t5t3 != null) {
                        c116714i3.setSpan(foregroundColorSpan, 0, String.valueOf(t5t3.getText().length()).length() + 1, 33);
                        TuxTextView tuxTextView = this.LJLILLLLZI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(c116714i3);
                            LinearLayout linearLayout = this.LJLJJI;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                                TuxTextView tuxTextView2 = this.LJLJL;
                                if (tuxTextView2 != null) {
                                    tuxTextView2.setText(this.itemView.getContext().getText(R.string.cm8));
                                    View view = this.LJLJI;
                                    if (view != null) {
                                        view.setBackground(new ColorDrawable(C1EU.LIZ(this.itemView, "itemView.context", R.attr.e7)));
                                        N(false);
                                        return;
                                    } else {
                                        o.LJIJI("inputLine");
                                        throw null;
                                    }
                                }
                                o.LJIJI("errorHintText");
                                throw null;
                            }
                            o.LJIJI("errorHint");
                            throw null;
                        }
                        o.LJIJI("lengthHint");
                        throw null;
                    }
                    o.LJIJI("editText");
                    throw null;
                }
                TuxTextView tuxTextView3 = this.LJLILLLLZI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(c116714i3);
                    return;
                } else {
                    o.LJIJI("lengthHint");
                    throw null;
                }
            }
            o.LJIJI("editText");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }

    public final void T() {
        C85431Xfv c85431Xfv = this.LJLJLLL;
        if (c85431Xfv != null) {
            if (c85431Xfv.LJLJJL) {
                c85431Xfv.LJLILLLLZI = String.valueOf(((C19K) this.itemView.findViewById(R.id.c5o)).getText());
                InterfaceC85435Xfz L = L();
                if (L != null) {
                    boolean isChecked = ((CompoundButton) this.itemView.findViewById(R.id.c5i)).isChecked();
                    C85431Xfv c85431Xfv2 = this.LJLJLLL;
                    if (c85431Xfv2 != null) {
                        L.hc0(new C79594VLq(isChecked, c85431Xfv2.LJLILLLLZI));
                        return;
                    } else {
                        o.LJIJI("defaultMixListItem");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        o.LJIJI("defaultMixListItem");
        throw null;
    }

    public DefaultMixListCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(EditPlayListNameEditTextVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 483);
        C85439Xg3 c85439Xg3 = C85439Xg3.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85475Xgd.INSTANCE, new AqS165S0100000_15(this, 484), new AqS165S0100000_15(this, 485), C85451XgF.INSTANCE, c85439Xg3, new AqS165S0100000_15(this, 486), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85476Xge.INSTANCE, new AqS165S0100000_15(this, 487), new AqS165S0100000_15(this, 478), C85450XgE.INSTANCE, c85439Xg3, new AqS165S0100000_15(this, 479), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C85474Xgc.INSTANCE, new AqS165S0100000_15(this, 480), new AqS165S0100000_15(this, 481), new AqS165S0100000_15(this, 482), c85439Xg3, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLLILLLL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLLI = Q7K.LIZIZ("mix_name_max_length", 25);
        this.LJLJLJ = new CountDownTimer(1000L, 100L, new C85438Xg2(this));
        T5T t5t = (T5T) this.itemView.findViewById(R.id.c5o);
        o.LJIIIIZZ(t5t, "itemView.default_mix_edittext_input");
        this.LJLIL = t5t;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.c5t);
        o.LJIIIIZZ(tuxTextView, "itemView.default_mix_hint_length");
        this.LJLILLLLZI = tuxTextView;
        View findViewById = this.itemView.findViewById(R.id.c5u);
        o.LJIIIIZZ(findViewById, "itemView.default_mix_input_line");
        this.LJLJI = findViewById;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.c5s);
        o.LJIIIIZZ(linearLayout, "itemView.default_mix_hint_layout");
        this.LJLJJI = linearLayout;
        C116414hZ c116414hZ = (C116414hZ) this.itemView.findViewById(R.id.c5w);
        o.LJIIIIZZ(c116414hZ, "itemView.default_mix_loading");
        this.LJLJJL = c116414hZ;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.c5n);
        o.LJIIIIZZ(imageView, "itemView.default_mix_delete");
        this.LJLJJLL = imageView;
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.c5r);
        o.LJIIIIZZ(tuxTextView2, "itemView.default_mix_error_textview");
        this.LJLJL = tuxTextView2;
        T5T t5t2 = this.LJLIL;
        if (t5t2 != null) {
            t5t2.addTextChangedListener(new IDObjectS186S0100000_15(this, 3));
            P();
            M();
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLILLLL.getValue(), new TBT() { // from class: X.8yq
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C229038yp) obj).LJLIL;
                }
            }, null, new AqS181S0100000_15(this, LiveCoverMinSizeSetting.DEFAULT), C85441Xg5.LJLIL, new AqS181S0100000_15(this, 251), 2, null);
            ImageView imageView2 = this.LJLJJLL;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                ImageView imageView3 = this.LJLJJLL;
                if (imageView3 != null) {
                    C16880lQ.LJIILLIIL(imageView3, new ACListenerS35S0100000_15(this, 109));
                    return;
                } else {
                    o.LJIJI("delete");
                    throw null;
                }
            }
            o.LJIJI("delete");
            throw null;
        }
        o.LJIJI("editText");
        throw null;
    }

    public final void N(boolean z) {
        InterfaceC85435Xfz L = L();
        if (L != null) {
            L.Tf(new VN9(z));
        }
    }

    public final void Q(boolean z) {
        T5T t5t = this.LJLIL;
        if (t5t != null) {
            t5t.postDelayed(new ARunnableS10S0110000_4(this, z, 3), 300L);
        } else {
            o.LJIJI("editText");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C85431Xfv c85431Xfv) {
        int i;
        C85431Xfv t = c85431Xfv;
        o.LJIIIZ(t, "t");
        this.LJLJLLL = t;
        ((CompoundButton) this.itemView.findViewById(R.id.c5i)).setChecked(t.LJLJJI);
        View findViewById = this.itemView.findViewById(R.id.gzo);
        if (t.LJLJJI) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        Q(t.LJLJJI);
        N(t.LJLJJL);
        T();
        ((AppCompatImageView) this.itemView.findViewById(R.id.c5v)).setBackgroundResource(R.drawable.bru);
        C16880lQ.LJIJJ((C02Y) this.itemView.findViewById(R.id.c5i), new ACListenerS49S0200000_15(this, t, 34));
        C16880lQ.LJIIJ(new ACListenerS49S0200000_15(this, t, 35), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bt2, viewGroup, false, "from(parent.context)\n   …t_new_mix, parent, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
