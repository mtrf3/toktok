package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.ContactMaFCell;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.ContactUnRegisterCell;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P1W extends AbstractC63778P1i implements KPL, InterfaceC03360Bg {
    public C84773Uj LJLIL;
    public C84773Uj LJLILLLLZI;
    public C114194dz LJLJI;
    public SwipeRefreshLayout LJLJJI;
    public C73305Spp LJLJJL;
    public SYL LJLJJLL;
    public P1U LJLJLLL;
    public int LJLLILLLL;
    public InterfaceC65784Pro<Boolean> LJLLJ;
    public ContactMaFWidgetVM LJLLL;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 452));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 453));
    public final C63770P1a LJLL = new C63770P1a(new Class[]{ContactMaFCell.class});
    public final C63782P1m LJLLI = new C63782P1m(ContactUnRegisterCell.class);

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

    public final SYL LIZIZ() {
        return (SYL) this.LJLJLJ.getValue();
    }

    public final void LIZLLL() {
        C63782P1m c63782P1m = this.LJLLI;
        C84773Uj c84773Uj = this.LJLILLLLZI;
        if (c63782P1m.LJI()) {
            c63782P1m.LJIIIZ(c84773Uj);
        } else {
            c63782P1m.LJLJLLL = null;
        }
        C63770P1a c63770P1a = this.LJLL;
        C84773Uj c84773Uj2 = this.LJLIL;
        if (c63770P1a.LJI()) {
            c63770P1a.LJIIIZ(c84773Uj2);
        } else {
            c63770P1a.LJLJLLL = null;
        }
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            P1U p1u = this.LJLJLLL;
            if (p1u != null) {
                if (p1u.LJIIL) {
                    C73306Spq c73306Spq = p1u.LJIILL;
                    if (c73306Spq == null) {
                        c73306Spq = new C73306Spq();
                        String LJFF = C86V.LJFF(R.string.ht9);
                        o.LJIIIIZZ(LJFF, "getString(R.string.list_empty)");
                        c73306Spq.LJFF = LJFF;
                        String LJFF2 = C86V.LJFF(R.string.g2u);
                        o.LJIIIIZZ(LJFF2, "getString(R.string.empty_contacts)");
                        c73306Spq.LJI = LJFF2;
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_large_person;
                        c2068389v.LJ = Integer.valueOf(R.attr.gu);
                        c73306Spq.LIZJ = 0;
                        c73306Spq.LIZIZ = c2068389v;
                        int LIZIZ = C7MY.LIZIZ(72);
                        int LIZIZ2 = C7MY.LIZIZ(72);
                        c73306Spq.LIZLLL = LIZIZ;
                        c73306Spq.LJ = LIZIZ2;
                    }
                    c73305Spp.setStatus(c73306Spq);
                    c73305Spp.setVisibility(0);
                    SwipeRefreshLayout swipeRefreshLayout = this.LJLJJI;
                    if (swipeRefreshLayout == null) {
                        return;
                    }
                    swipeRefreshLayout.setVisibility(8);
                    return;
                }
                return;
            }
            o.LJIJI("config");
            throw null;
        }
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLLJ;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return;
        }
        LJFF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM r5 = r6.LJLLL
            r4 = 0
            if (r5 == 0) goto L49
            X.33Q r0 = r5.getState()
            X.P1c r0 = (X.C63772P1c) r0
            X.2td<X.9U5> r0 = r0.LJLJI
            boolean r0 = r0 instanceof X.C72922tc
            if (r0 == 0) goto L12
        L11:
            return
        L12:
            X.P1b r0 = X.C63771P1b.LJLIL
            r5.setState(r0)
            X.P1U r1 = r5.LJLIL
            boolean r0 = r1.LIZLLL
            if (r0 == 0) goto L39
            boolean r0 = X.C76917UGr.LJJIJ(r1)
            if (r0 == 0) goto L36
            X.P1c r2 = com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM.LJLJJLL
            if (r2 != 0) goto L2b
            X.P1c r2 = com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM.LJLJL
        L29:
            if (r2 == 0) goto L39
        L2b:
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 146(0x92, float:2.05E-43)
            r1.<init>(r2, r0)
            r5.setState(r1)
            goto L11
        L36:
            X.P1c r2 = com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM.LJLJL
            goto L29
        L39:
            X.2pa r3 = r5.getAssemVMScope()
            X.XKW r2 = r5.LJLJJL
            X.Okl r1 = new X.Okl
            r1.<init>(r5, r4)
            r0 = 2
            X.XKX.LIZLLL(r3, r2, r4, r1, r0)
            goto L11
        L49:
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1W.LJFF():void");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        ContactMaFWidgetVM contactMaFWidgetVM = this.LJLLL;
        if (contactMaFWidgetVM != null) {
            return contactMaFWidgetVM.getLifecycle();
        }
        o.LJIJI("viewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(AbstractC72932td<C9U5> state) {
        o.LJIIIZ(state, "state");
        ContactMaFWidgetVM contactMaFWidgetVM = this.LJLLL;
        if (contactMaFWidgetVM != null) {
            if (o.LJ(state, C33X.LIZ)) {
                contactMaFWidgetVM.setState(new AqS176S0100000_10(contactMaFWidgetVM, 149));
                return;
            }
            if (state instanceof C72922tc) {
                contactMaFWidgetVM.setState(C63771P1b.LJLIL);
                return;
            }
            if (state instanceof C72912tb) {
                contactMaFWidgetVM.setState(C63771P1b.LJLIL);
                contactMaFWidgetVM.setState(new AqS141S0200000_10(contactMaFWidgetVM, (C9U5) ((C72912tb) state).LIZ, 36));
                return;
            } else {
                if (!(state instanceof C3C1)) {
                    return;
                }
                contactMaFWidgetVM.setState(new AqS176S0100000_10(((C3C1) state).LIZ, 145));
                return;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.Yns, X.Pro, java.lang.Object, X.MCa] */
    public final void LIZJ(Object obj) {
        P1U config = (P1U) obj;
        o.LJIIIZ(config, "config");
        this.LJLJLLL = config;
        ContactMaFWidgetVM LIZ = C62794Okg.LIZ(config);
        this.LJLLL = LIZ;
        Throwable th = null;
        C8YN.LJII(this, LIZ, new TBT() { // from class: X.P1d
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C63772P1c) obj2).LJLJI;
            }
        }, null, new AqS192S0100000_10(this, 33), 6);
        ContactMaFWidgetVM contactMaFWidgetVM = this.LJLLL;
        if (contactMaFWidgetVM != null) {
            P1X p1x = new P1X(this);
            AssemViewModel.asyncSubscribe$default(contactMaFWidgetVM, new TBT() { // from class: X.P1e
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((C63772P1c) obj2).LJLJI;
                }
            }, null, new P1Y(this), new P1Z(this), p1x, 2, null);
            if (config.LJIIIIZZ) {
                ContactMaFWidgetVM contactMaFWidgetVM2 = this.LJLLL;
                if (contactMaFWidgetVM2 != null) {
                    th = null;
                    AssemViewModel.asyncSubscribe$default(contactMaFWidgetVM2, new TBT() { // from class: X.P1f
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj2) {
                            return ((C63772P1c) obj2).LJLIL;
                        }
                    }, null, null, null, new AqS176S0100000_10(this, 148), 14, null);
                } else {
                    o.LJIJI("viewModel");
                    throw null;
                }
            }
            Throwable th2 = th;
            if (config.LJIIIZ) {
                ContactMaFWidgetVM contactMaFWidgetVM3 = this.LJLLL;
                if (contactMaFWidgetVM3 != null) {
                    ?? r6 = th;
                    AssemViewModel.asyncSubscribe$default(contactMaFWidgetVM3, new TBT() { // from class: X.P1g
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj2) {
                            return ((C63772P1c) obj2).LJLILLLLZI;
                        }
                    }, r6, r6, r6, new AqS176S0100000_10(this, 147), 14, r6);
                    th2 = r6;
                } else {
                    o.LJIJI("viewModel");
                    throw th;
                }
            }
            if (config.LJII) {
                ContactMaFWidgetVM contactMaFWidgetVM4 = this.LJLLL;
                if (contactMaFWidgetVM4 != null) {
                    C8YN.LJII(this, contactMaFWidgetVM4, new TBT() { // from class: X.P1h
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj2) {
                            return ((C63772P1c) obj2).LJLJJI;
                        }
                    }, th2, new AqS183S0100000_1(this, 94), 6);
                } else {
                    o.LJIJI("viewModel");
                    throw th2;
                }
            }
            Integer num = config.LJIIJ;
            if (num != null) {
                int intValue = num.intValue();
                if (config.LJIIIIZZ) {
                    C84773Uj c84773Uj = new C84773Uj(config.LIZ, null, 6, 0);
                    this.LJLIL = c84773Uj;
                    c84773Uj.setTitleText(intValue);
                } else {
                    "you config register chunk title but not show chunk??".toString();
                    throw new IllegalArgumentException("you config register chunk title but not show chunk??");
                }
            }
            Integer num2 = config.LJIIJJI;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (config.LJIIIZ) {
                    C84773Uj c84773Uj2 = new C84773Uj(config.LIZ, null, 6, 0);
                    this.LJLILLLLZI = c84773Uj2;
                    c84773Uj2.setTitleText(intValue2);
                    return;
                }
                "you config unregister chunk title but not show chunk??".toString();
                throw new IllegalArgumentException("you config unregister chunk title but not show chunk??");
            }
            return;
        }
        o.LJIJI("viewModel");
        throw null;
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
