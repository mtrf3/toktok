package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C16880lQ;
import X.C1DG;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C28289B8j;
import X.C32151Nz;
import X.C33Q;
import X.C36746EbW;
import X.C3C8;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55954Lxe;
import X.C55956Lxg;
import X.C55957Lxh;
import X.C55958Lxi;
import X.C56005LyT;
import X.C56045Lz7;
import X.C56412MCa;
import X.C62562cu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.CK3;
import X.EnumC56134M1i;
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
import X.M7U;
import X.M7Y;
import X.M7Z;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.TBW;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ARunnableS13S0400000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import com.ss.android.ugc.aweme.utils.Au2S17S0200000_9;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ToolEntryCellNew extends PowerCell<C55954Lxe> implements KPL {
    public final C214298b3 LJLIL;

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

    public ToolEntryCellNew() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 102);
        C55956Lxg c55956Lxg = C55956Lxg.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, M7Y.INSTANCE, new AqS159S0100000_9(this, 103), new AqS159S0100000_9(this, 104), C55958Lxi.INSTANCE, c55956Lxg, new AqS159S0100000_9(this, 105), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, M7Z.INSTANCE, new AqS159S0100000_9(this, 106), new AqS159S0100000_9(this, 97), C55957Lxh.INSTANCE, c55956Lxg, new AqS159S0100000_9(this, 98), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, M7U.INSTANCE, new AqS159S0100000_9(this, 99), new AqS159S0100000_9(this, 100), new AqS159S0100000_9(this, 101), c55956Lxg, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        String str;
        ToolEntryVO toolEntryVO;
        super.onItemViewCreated();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateToolPanel old user new tool panel  view created ");
        C55954Lxe item = getItem();
        if (item != null && (toolEntryVO = item.LJLIL) != null) {
            str = toolEntryVO.getButtonName();
        } else {
            str = null;
        }
        CK3.LIZIZ(LIZ, str, LIZ, 3);
    }

    public static long L(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return CastLongProtector.parseLong(str);
                }
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C55954Lxe c55954Lxe) {
        ActivityC45651qj LJ;
        CustomDotAbilityCommon customDotAbilityCommon;
        String id;
        ActivityC45651qj LJ2;
        CustomDotAbilityCommon customDotAbilityCommon2;
        CustomDotAbilityCommon customDotAbilityCommon3;
        Map<String, Boolean> oG;
        C55954Lxe item = c55954Lxe;
        o.LJIIIZ(item, "item");
        String str = null;
        if (item.LJLIL.getCardType() == EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue() && item.LJLIL.getMsgPopupData() != null && (LJ = C1DG.LJ(this.itemView, "itemView.context")) != null && (customDotAbilityCommon = (CustomDotAbilityCommon) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJ, null), CustomDotAbilityCommon.class, null)) != null && customDotAbilityCommon.C6() != null && item.LJLIL.isItemVisible()) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.moh);
            o.LJIIIIZZ(tuxTextView, "itemView.tv_tool");
            Notice msgPopupData = item.LJLIL.getMsgPopupData();
            if (msgPopupData != null && (id = msgPopupData.getId()) != null && ((LJ2 = C1DG.LJ(this.itemView, "itemView.context")) == null || (customDotAbilityCommon3 = (CustomDotAbilityCommon) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJ2, null), CustomDotAbilityCommon.class, null)) == null || (oG = customDotAbilityCommon3.oG()) == null || !o.LJ(oG.get(id), Boolean.TRUE))) {
                ActivityC45651qj LJ3 = C1DG.LJ(this.itemView, "itemView.context");
                if (LJ3 != null && (customDotAbilityCommon2 = (CustomDotAbilityCommon) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJ3, null), CustomDotAbilityCommon.class, null)) != null) {
                    customDotAbilityCommon2.ty(id);
                }
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a00, C16880lQ.LLZIL(tuxTextView.getContext()), null);
                o.LJIIIIZZ(LLLZIIL, "from(view.context)\n     …all_message_bubble, null)");
                ((TextView) LLLZIIL.findViewById(R.id.gi2)).setText(msgPopupData.getTitle());
                tuxTextView.post(new ARunnableS13S0400000_9(tuxTextView, this, LLLZIIL, msgPopupData, 6));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateToolPanel old user new tool panel bind view ");
        ToolEntryVO toolEntryVO = item.LJLIL;
        if (toolEntryVO != null) {
            str = toolEntryVO.getButtonName();
        }
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        if (getAbsoluteAdapterPosition() <= 4) {
            ShopMainViewModel shopMainViewModel = (ShopMainViewModel) this.LJLIL.getValue();
            int cardType = item.LJLIL.getCardType();
            Set<Integer> set = shopMainViewModel.LJLLILLLL;
            if (set != null && set.contains(Integer.valueOf(cardType))) {
                ToolEntryVO toolEntryVO2 = item.LJLIL;
                Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("button_name", toolEntryVO2.getButtonName()), new OSZ("page_struc_type", "tools_out"), new OSZ("item_order", String.valueOf(getAbsoluteAdapterPosition() + 1)));
                if (toolEntryVO2.getNotify()) {
                    LJJLIIIIJ.put("notice_number", "");
                    LJJLIIIIJ.put("notice_type", "red_dot");
                }
                C56045Lz7.LIZ.getClass();
                C56045Lz7.LJ(LJJLIIIIJ);
                ShopMainViewModel shopMainViewModel2 = (ShopMainViewModel) this.LJLIL.getValue();
                int cardType2 = item.LJLIL.getCardType();
                Set<Integer> set2 = shopMainViewModel2.LJLLILLLL;
                if (set2 != null) {
                    set2.remove(Integer.valueOf(cardType2));
                }
            }
        }
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
        ((TextView) this.itemView.findViewById(R.id.moh)).setText(item.LJLIL.getTitle());
        C62562cu imageUrls = item.LJLIL.getImageUrls();
        if (imageUrls != null) {
            W5F LJIIIZ = W5U.LJIIIZ(imageUrls);
            LJIIIZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.fbj);
            LJIIIZ.LIZLLL(new C56005LyT(item));
        }
        String link = item.LJLIL.getLink();
        if (link == null || ujb.o.LJJJJJL(link)) {
            return;
        }
        View findViewById = this.itemView.findViewById(R.id.lc4);
        o.LJIIIIZZ(findViewById, "itemView.tool_entry_element");
        C16880lQ.LJIIJ(new Au2S17S0200000_9(item, this, 1), findViewById);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        String str;
        ToolEntryVO toolEntryVO;
        o.LJIIIZ(parent, "parent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateToolPanel old user new tool panel create view ");
        C55954Lxe item = getItem();
        if (item != null && (toolEntryVO = item.LJLIL) != null) {
            str = toolEntryVO.getButtonName();
        } else {
            str = null;
        }
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(parent.getContext(), "parent.context");
        int LJJII = (int) (C32151Nz.LJJII(r1) / 4.5d);
        View LIZ2 = C28289B8j.LIZ(parent, R.layout.aod, parent, false);
        ViewGroup.LayoutParams layoutParams = LIZ2.findViewById(R.id.lc4).getLayoutParams();
        layoutParams.width = LJJII;
        LIZ2.findViewById(R.id.lc4).setLayoutParams(layoutParams);
        return LIZ2;
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