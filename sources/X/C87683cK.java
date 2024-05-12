package X;

import Y.AObserverS69S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.legacy.select.RecUserSelectCell;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3cK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87683cK implements InterfaceC108504Nq {
    public final C87693cL LIZ;
    public InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> LIZIZ;
    public InterfaceC65784Pro<C76800UCe> LIZJ;
    public C26231ARf LIZLLL;
    public SYL LJ;
    public TuxTextView LJFF;
    public TuxTextView LJI;
    public SY4 LJII;
    public SelectedCardVM LJIIIIZZ;

    public final ARL LIZLLL() {
        ARI ari;
        List<ARL> list;
        C26231ARf c26231ARf = this.LIZLLL;
        if (c26231ARf != null) {
            AbstractC243009gG LJI = c26231ARf.LJI();
            if (!(LJI instanceof ARI) || (ari = (ARI) LJI) == null || (list = ari.LJFF) == null) {
                return null;
            }
            return (ARL) ORZ.LJLLLLLL(0, list);
        }
        o.LJIJI("attachDialog");
        throw null;
    }

    @Override // X.InterfaceC108504Nq
    public final void destroy() {
        SelectedCardVM selectedCardVM = this.LJIIIIZZ;
        if (selectedCardVM != null) {
            selectedCardVM.LJLJLJ.removeObservers(this.LIZ);
            selectedCardVM.LJLL.removeObservers(this.LIZ);
            selectedCardVM.LJLLILLLL.removeObservers(this.LIZ);
            selectedCardVM.LJLLL.removeObservers(this.LIZ);
            SelectedCardVM selectedCardVM2 = this.LJIIIIZZ;
            if (selectedCardVM2 != null) {
                NextLiveData<List<C80663Eo>> nextLiveData = selectedCardVM2.LJLJL;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                nextLiveData.postValue(c61878OQg);
                selectedCardVM2.LJLJLLL.postValue(0);
                selectedCardVM2.LJLLI.postValue(c61878OQg);
                selectedCardVM2.LJLLJ.postValue(Boolean.FALSE);
                return;
            }
            o.LJIJI("selectedCardVM");
            throw null;
        }
        o.LJIJI("selectedCardVM");
        throw null;
    }

    @Override // X.InterfaceC108504Nq
    public final void dismiss() {
        C26231ARf c26231ARf = this.LIZLLL;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(null);
        } else {
            o.LJIJI("attachDialog");
            throw null;
        }
    }

    @Override // X.InterfaceC108504Nq
    public final boolean isShowing() {
        C26231ARf c26231ARf = this.LIZLLL;
        if (c26231ARf != null) {
            return c26231ARf.LJII();
        }
        o.LJIJI("attachDialog");
        throw null;
    }

    @Override // X.InterfaceC108504Nq
    public final void show() {
        C26231ARf c26231ARf = this.LIZLLL;
        if (c26231ARf != null) {
            if (!c26231ARf.LJII()) {
                C26231ARf c26231ARf2 = this.LIZLLL;
                if (c26231ARf2 != null) {
                    c26231ARf2.LIZLLL();
                    return;
                } else {
                    o.LJIJI("attachDialog");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("attachDialog");
        throw null;
    }

    public C87683cK(C87693cL c87693cL) {
        View view;
        this.LIZ = c87693cL;
        SYL syl = new SYL(c87693cL.LIZ(), null);
        syl.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        syl.LLLF.LJZL(RecUserSelectCell.class);
        this.LJ = syl;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c87693cL.LIZ()), R.layout.c_v, null, false);
        View findViewById = LLLLIILL.findViewById(R.id.l9t);
        o.LJIIIIZZ(findViewById, "captionView.findViewById(R.id.titleView)");
        this.LJFF = (TuxTextView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.c4r);
        o.LJIIIIZZ(findViewById2, "captionView.findViewById(R.id.decsView)");
        this.LJI = (TuxTextView) findViewById2;
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            tuxTextView.setText(R.string.g3t);
            TuxTextView tuxTextView2 = this.LJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(R.string.g3n);
                C26227ARb LIZIZ = C77413UZt.LIZIZ(c87693cL.LIZ());
                LIZIZ.LJIIJ = new ARU(LLLLIILL);
                SYL syl2 = this.LJ;
                if (syl2 != null) {
                    C77119UOl.LJFF(LIZIZ, syl2);
                    UC0.LIZJ(LIZIZ, C2PF.LJLIL);
                    LIZIZ.LIZLLL(new AqS167S0100000_1(this, 278));
                    LIZIZ.LIZJ(new AqS167S0100000_1(this, 279));
                    this.LIZLLL = LIZIZ.LJI();
                    SYL syl3 = this.LJ;
                    if (syl3 != null) {
                        Object parent = syl3.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C26338AVi.LJI(view, 0, null, 0, null, false, 26);
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if (layoutParams != null) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                layoutParams2.weight = 1.0f;
                                view.setLayoutParams(layoutParams2);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                        }
                        C26231ARf c26231ARf = this.LIZLLL;
                        if (c26231ARf != null) {
                            View LJFF = c26231ARf.LJFF(R.id.b4l);
                            ViewGroup.LayoutParams layoutParams3 = LJFF.getLayoutParams();
                            if (layoutParams3 != null) {
                                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                layoutParams4.weight = 0.0f;
                                layoutParams4.height = -2;
                                LJFF.setLayoutParams(layoutParams4);
                                ARL LIZLLL = LIZLLL();
                                if (LIZLLL != null) {
                                    LIZLLL.LIZ(new AqS167S0100000_1(this, 280));
                                }
                                SelectedCardVM selectedCardVM = (SelectedCardVM) new ViewModelProvider(c87693cL).get(SelectedCardVM.class);
                                this.LJIIIIZZ = selectedCardVM;
                                if (selectedCardVM != null) {
                                    String str = c87693cL.LJLIL;
                                    o.LJIIIZ(str, "<set-?>");
                                    selectedCardVM.LJLIL = str;
                                    selectedCardVM.LJLILLLLZI = "share_pop_up";
                                    SelectedCardVM selectedCardVM2 = this.LJIIIIZZ;
                                    if (selectedCardVM2 != null) {
                                        selectedCardVM2.LJLJLJ.observe(c87693cL, new AObserverS69S0100000_1(this, 79));
                                        SelectedCardVM selectedCardVM3 = this.LJIIIIZZ;
                                        if (selectedCardVM3 != null) {
                                            selectedCardVM3.LJLL.observe(c87693cL, new AObserverS69S0100000_1(this, 80));
                                            SelectedCardVM selectedCardVM4 = this.LJIIIIZZ;
                                            if (selectedCardVM4 != null) {
                                                selectedCardVM4.LJLLILLLL.observe(c87693cL, new AObserverS69S0100000_1(this, 81));
                                                SelectedCardVM selectedCardVM5 = this.LJIIIIZZ;
                                                if (selectedCardVM5 != null) {
                                                    selectedCardVM5.LJLLL.observe(c87693cL, new AObserverS69S0100000_1(this, 82));
                                                    return;
                                                } else {
                                                    o.LJIJI("selectedCardVM");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("selectedCardVM");
                                            throw null;
                                        }
                                        o.LJIJI("selectedCardVM");
                                        throw null;
                                    }
                                    o.LJIJI("selectedCardVM");
                                    throw null;
                                }
                                o.LJIJI("selectedCardVM");
                                throw null;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        o.LJIJI("attachDialog");
                        throw null;
                    }
                    o.LJIJI("recPowerList");
                    throw null;
                }
                o.LJIJI("recPowerList");
                throw null;
            }
            o.LJIJI("descView");
            throw null;
        }
        o.LJIJI("titleView");
        throw null;
    }

    @Override // X.InterfaceC108504Nq
    public final void LIZ(InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> interfaceC88472Yns) {
        this.LIZIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC108504Nq
    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC108504Nq
    public final void LIZJ(List<? extends User> users) {
        o.LJIIIZ(users, "users");
        SelectedCardVM selectedCardVM = this.LJIIIIZZ;
        if (selectedCardVM != null) {
            NextLiveData<List<C80663Eo>> nextLiveData = selectedCardVM.LJLJL;
            ArrayList arrayList = new ArrayList(C32I.LJJL(users, 10));
            Iterator<? extends User> it = users.iterator();
            while (it.hasNext()) {
                arrayList.add(new C80663Eo(it.next()));
            }
            nextLiveData.postValue(arrayList);
            selectedCardVM.LJLJLLL.postValue(Integer.valueOf(users.size()));
            if (users.size() > 1) {
                TuxTextView tuxTextView = this.LJFF;
                if (tuxTextView != null) {
                    tuxTextView.setText(R.string.g3s);
                    return;
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            }
            TuxTextView tuxTextView2 = this.LJFF;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(R.string.g3t);
                return;
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        }
        o.LJIJI("selectedCardVM");
        throw null;
    }
}
