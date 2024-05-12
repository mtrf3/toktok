package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MTa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56854MTa extends AbstractC029409q<RecyclerView.ViewHolder> implements KPL {
    public final CreatorNoticeResultVM LJLIL;
    public final List<C56859MTf> LJLILLLLZI;
    public ViewOnClickListenerC86063Xq7 LJLJI;
    public List<NoticeSortModel> LJLJJI;
    public List<NoticeFilterModel> LJLJJL;
    public final C62822Ol8 LJLJJLL;

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

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.getLifecycle();
    }

    public C56854MTa(CreatorNoticeResultVM vm) {
        o.LJIIIZ(vm, "vm");
        this.LJLIL = vm;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 760));
        AssemViewModel.asyncSubscribe$default(vm, new TBT() { // from class: X.MTg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJJL;
            }
        }, C213688a4.LJ(), null, null, new AqS175S0100000_9(this, 379), 12, null);
        C8YN.LJII(this, vm, new TBT() { // from class: X.MSs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLJI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 66), 4);
        C8YN.LJII(this, vm, new TBT() { // from class: X.MSu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLILLLLZI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 67), 4);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (i < ((ArrayList) this.LJLILLLLZI).size()) {
            ((ViewOnClickListenerC86063Xq7) holder).L((C56859MTf) ListProtector.get(this.LJLILLLLZI, i));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ViewOnClickListenerC86063Xq7 viewOnClickListenerC86063Xq7 = new ViewOnClickListenerC86063Xq7(C1FL.LIZIZ(parent, R.layout.sj, parent, false, "from(parent.context)\n   …or_filter, parent, false)"), (MTY) this.LJLJJLL.getValue());
        this.LJLJI = viewOnClickListenerC86063Xq7;
        C0AX.LIZ(parent, viewOnClickListenerC86063Xq7.itemView, R.id.lj7);
        View view = viewOnClickListenerC86063Xq7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewOnClickListenerC86063Xq7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnClickListenerC86063Xq7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewOnClickListenerC86063Xq7.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewOnClickListenerC86063Xq7.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ViewOnClickListenerC86063Xq7.class.getName();
        return viewOnClickListenerC86063Xq7;
    }

    public final void LJLLLLLL(int i, List<Integer> list, List<NoticeSortModel> list2, List<NoticeFilterModel> list3) {
        boolean z;
        boolean z2;
        List LJJIJ;
        if (i == MTW.UN_SUPPORT.getId() || list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (list3 == null || list3.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            LJJIJ = C61878OQg.INSTANCE;
        } else {
            LJJIJ = C47261Igj.LJJIJ(new C56859MTf(i, list, list2, list3));
        }
        MS5.LJ(new C56855MTb(ORZ.LLJI(this.LJLILLLLZI), LJJIJ, this, i, list, list2, list3));
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
