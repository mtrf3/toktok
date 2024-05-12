package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.experiment.ClickMutualLabelToMutualListSetting;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationCell;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94253mv extends SIT implements KPL {
    public final MutualRelationViewModel LJLJJLL;
    public View LJLJL;
    public List<? extends InterfaceC57784Mm4> LJLJLJ;
    public List<? extends InterfaceC57784Mm4> LJLJLLL;

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

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(MutualRelationCell.class);
    }

    public final void LJIIJJI() {
        this.LJLJJL.LJFF();
    }

    public final void LJIIJ() {
        LJIIJJI();
        LJIIJJI();
        this.LJLJJL.LJ(this.LJLJJLL.getState().LJLILLLLZI);
        if (this.LJLJJLL.iv0()) {
            int LJIIIIZZ = this.LJLJJL.LJIIIIZZ();
            C211088Qe.LIZ.getClass();
            C62822Ol8 c62822Ol8 = C211088Qe.LIZJ;
            if (LJIIIIZZ > ((ClickMutualLabelToMutualListSetting) c62822Ol8.getValue()).foldMutualNumber) {
                this.LJLJL = AnonymousClass030.LIZLLL(this.LJLJI, R.layout.bvp, null, false, "from(getContext())\n     …tion_footer, null, false)");
                this.LJLJLJ = ((ArrayList) this.LJLJJL.LJII()).subList(0, ((ClickMutualLabelToMutualListSetting) c62822Ol8.getValue()).foldMutualNumber);
                this.LJLJLLL = ((ArrayList) this.LJLJJL.LJII()).subList(((ClickMutualLabelToMutualListSetting) c62822Ol8.getValue()).foldMutualNumber, this.LJLJJL.LJIIIIZZ());
                this.LJLJJL.LJFF();
                List<? extends InterfaceC57784Mm4> list = this.LJLJLJ;
                if (list != null) {
                    this.LJLJJL.LJ(list);
                }
                View view = this.LJLJL;
                if (view != null) {
                    LIZ(view);
                    View view2 = this.LJLJL;
                    if (view2 != null) {
                        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 162), view2);
                        return;
                    } else {
                        o.LJIJI("footerView");
                        throw null;
                    }
                }
                o.LJIJI("footerView");
                throw null;
            }
        }
    }

    public C94253mv(MutualRelationViewModel mutualRelationViewModel) {
        o.LJIIIZ(mutualRelationViewModel, "mutualRelationViewModel");
        this.LJLJJLL = mutualRelationViewModel;
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
