package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C0A2;
import X.C141335gf;
import X.C1BU;
import X.C221108m2;
import X.C3C5;
import X.C55096Ljo;
import X.C62822Ol8;
import X.InterfaceC49025JLx;
import X.InterfaceC49055JNb;
import X.InterfaceC49871Jhj;
import X.InterfaceC55235Lm3;
import X.JPU;
import Y.IDCListenerS245S0100000_8;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardCommonAbilityImpl implements SearchServiceCenter$CardCommonAbility, InterfaceC49055JNb {
    public final RecyclerView.ViewHolder LJLIL;
    public final ISearchCardProtocol<InterfaceC49871Jhj> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public InterfaceC49871Jhj LJLJJI;
    public SearchServiceCenter$RecyclerViewAbility LJLJJL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final RecyclerView.ViewHolder C40() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final InterfaceC49871Jhj dj0() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final ISearchCardProtocol<InterfaceC49871Jhj> getProtocol() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final void Jq0(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8) {
        ((ArrayList) this.LJLJI.getValue()).add(iDCListenerS245S0100000_8);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility
    public final boolean WV(InterfaceC55235Lm3 vScope) {
        GridLayoutManager gridLayoutManager;
        C1BU c1bu;
        Object LIZ;
        boolean z;
        o.LJIIIZ(vScope, "vScope");
        if (this.LJLJJL == null) {
            this.LJLJJL = (SearchServiceCenter$RecyclerViewAbility) C55096Ljo.LIZIZ(vScope, SearchServiceCenter$RecyclerViewAbility.class);
        }
        SearchServiceCenter$RecyclerViewAbility searchServiceCenter$RecyclerViewAbility = this.LJLJJL;
        if (searchServiceCenter$RecyclerViewAbility == null) {
            return false;
        }
        C0A2 mO = searchServiceCenter$RecyclerViewAbility.mO();
        Object obj = null;
        if (!(mO instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) mO) == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = this.LJLIL.itemView.getLayoutParams();
        if (!(layoutParams instanceof C1BU) || (c1bu = (C1BU) layoutParams) == null) {
            return false;
        }
        try {
            if (gridLayoutManager.LLIILII.LJFF(this.LJLIL.getBindingAdapterPosition() + (gridLayoutManager.LLIIIL - c1bu.LJLIL)) == gridLayoutManager.LLIIIL) {
                z = true;
            } else {
                z = false;
            }
            LIZ = Boolean.valueOf(z);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public SearchCardCommonAbilityImpl(SearchCardViewHolder viewHolder, ISearchCardProtocol protocol) {
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(protocol, "protocol");
        this.LJLIL = viewHolder;
        this.LJLILLLLZI = protocol;
        this.LJLJI = C221108m2.LIZIZ(JPU.LJLIL);
        viewHolder.itemView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 3));
    }

    @Override // X.InterfaceC49055JNb
    public final void LIZ(InterfaceC49871Jhj interfaceC49871Jhj, InterfaceC49025JLx searchCardRenderData) {
        o.LJIIIZ(searchCardRenderData, "searchCardRenderData");
        this.LJLJJI = interfaceC49871Jhj;
    }
}
