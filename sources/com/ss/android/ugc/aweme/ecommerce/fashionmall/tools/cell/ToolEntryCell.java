package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell;

import X.C16880lQ;
import X.C1FL;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C33Q;
import X.C36746EbW;
import X.C3C8;
import X.C55954Lxe;
import X.C56004LyS;
import X.C56412MCa;
import X.C62562cu;
import X.C63081OpJ;
import X.C76800UCe;
import X.C8YZ;
import X.CK3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
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
import X.TBW;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.utils.Au2S17S0200000_9;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ToolEntryCell extends PowerCell<C55954Lxe> implements KPL {
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        String str;
        ToolEntryVO toolEntryVO;
        super.onItemViewCreated();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateToolPanel new user tool panel view created ");
        C55954Lxe item = getItem();
        if (item != null && (toolEntryVO = item.LJLIL) != null) {
            str = toolEntryVO.getButtonName();
        } else {
            str = null;
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C55954Lxe c55954Lxe) {
        String str;
        C55954Lxe item = c55954Lxe;
        o.LJIIIZ(item, "item");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateToolPanel new user tool panel bind view ");
        ToolEntryVO toolEntryVO = item.LJLIL;
        if (toolEntryVO != null) {
            str = toolEntryVO.getButtonName();
        } else {
            str = null;
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
        if (item.LJLIL.getNotify()) {
            ((TuxAlertBadgeLayout) this.itemView.findViewById(R.id.lca)).LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RedBadge name: ");
            LIZ2.append(item.LJLIL.getTitle());
            LIZ2.append(" show");
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
        } else {
            ((TuxAlertBadgeLayout) this.itemView.findViewById(R.id.lca)).LIZIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("RedBadge name: ");
            LIZ3.append(item.LJLIL.getTitle());
            LIZ3.append(" hide");
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ3));
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Redbadge update item ");
        LIZ4.append(item.LJLIL.getButtonName());
        LIZ4.append(' ');
        LIZ4.append(item.LJLIL.getNotify());
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ4));
        ((TextView) this.itemView.findViewById(R.id.moh)).setText(item.LJLIL.getTitle());
        C62562cu imageUrls = item.LJLIL.getImageUrls();
        if (imageUrls != null) {
            W5F LJIIIZ = W5U.LJIIIZ(imageUrls);
            LJIIIZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.fbj);
            LJIIIZ.LIZLLL(new C56004LyS(item));
        }
        String link = item.LJLIL.getLink();
        if (link == null || ujb.o.LJJJJJL(link)) {
            return;
        }
        View findViewById = this.itemView.findViewById(R.id.lc4);
        o.LJIIIIZZ(findViewById, "itemView.tool_entry_element");
        C16880lQ.LJIIJ(new Au2S17S0200000_9(item, this, 0), findViewById);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        String str;
        int i;
        ToolEntryVO toolEntryVO;
        o.LJIIIZ(parent, "parent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateToolPanel new user tool panel create view ");
        C55954Lxe item = getItem();
        if (item != null && (toolEntryVO = item.LJLIL) != null) {
            str = toolEntryVO.getButtonName();
        } else {
            str = null;
        }
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        if (C63081OpJ.LJJJJL(context) > 320) {
            Context context2 = parent.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            if (C63081OpJ.LJJJJJL(context2) > 320) {
                i = R.layout.aoc;
                return C1FL.LIZIZ(parent, i, parent, false, "from(parent.context)\n   …esourceId, parent, false)");
            }
        }
        i = R.layout.aoe;
        return C1FL.LIZIZ(parent, i, parent, false, "from(parent.context)\n   …esourceId, parent, false)");
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
