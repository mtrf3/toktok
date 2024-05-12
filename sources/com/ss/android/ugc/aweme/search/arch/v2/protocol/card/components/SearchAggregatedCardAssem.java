package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.AbstractC030309z;
import X.C221108m2;
import X.C30591Hz;
import X.C32151Nz;
import X.C3C8;
import X.C49098JOs;
import X.C49472JbI;
import X.C49475JbL;
import X.C49477JbN;
import X.C54840Lfg;
import X.C55096Ljo;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72808Sho;
import X.C8XO;
import X.EF7;
import X.EnumC35471Dw3;
import X.InterfaceC49479JbP;
import X.InterfaceC57784Mm4;
import X.JW6;
import X.O6R;
import X.SYL;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchAggregatedCardAssem<T extends JW6> extends ReusedUISlotAssem<SearchAggregatedCardAssem<T>> implements C8XO<T> {
    public SYL LLFF;
    public final C62822Ol8 LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public abstract int r4();

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchAggregatedCardAssem() {
        new LinkedHashMap();
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8((SearchAggregatedCardAssem) this, 112));
    }

    public final ISearchAggregatedCardProtocol m4() {
        return (ISearchAggregatedCardProtocol) this.LLFFF.getValue();
    }

    public InterfaceC49479JbP n4() {
        return new C49477JbN();
    }

    public AbstractC030309z p4() {
        int i;
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LJ());
        if (valueOf.intValue() > 0) {
            i = valueOf.intValue();
        } else {
            i = 8;
        }
        return new C49472JbI(i);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C3C8>, ? extends InterfaceC57784Mm4>> cls;
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(r4());
        o.LJIIIIZZ(findViewById, "parent.findViewById(powerListId())");
        SYL syl = (SYL) findViewById;
        this.LLFF = syl;
        C30591Hz.LJJIII(syl, C55096Ljo.LJIIZILJ(this));
        C72808Sho<InterfaceC57784Mm4> state = syl.getState();
        EnumC35471Dw3 emitStrategy = EnumC35471Dw3.BUFFER;
        state.getClass();
        o.LJIIIZ(emitStrategy, "emitStrategy");
        state.LIZIZ = emitStrategy;
        if (getContext() == null) {
            EF7.LIZIZ();
        }
        syl.setLayoutManager(new LinearLayoutManager(0, false));
        Class<? extends PowerCell<?>>[] clsArr = new Class[1];
        ISearchAggregatedCardProtocol m4 = m4();
        if (m4 != null) {
            cls = m4.P();
        } else {
            cls = null;
        }
        clsArr[0] = cls;
        syl.LLLF.LJZL(clsArr);
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LJFF());
        if (valueOf.intValue() > 0) {
            int intValue = valueOf.intValue();
            SYL syl2 = this.LLFF;
            if (syl2 != null) {
                C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(intValue))), syl2);
            } else {
                o.LJIJI("powerList");
                throw null;
            }
        }
        syl.LJII(p4(), -1);
        InterfaceC49479JbP trigger = n4();
        o.LJIIIZ(trigger, "trigger");
        new C49475JbL(this, syl, syl, trigger);
    }

    @Override // X.C8XO
    public void q4(T item) {
        List<InterfaceC57784Mm4> list;
        o.LJIIIZ(item, "item");
        SYL syl = this.LLFF;
        if (syl != null) {
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            if (state != null) {
                ISearchAggregatedCardProtocol m4 = m4();
                if (m4 == null || (list = m4.w2(item)) == null) {
                    list = C61878OQg.INSTANCE;
                }
                state.LJIILLIIL(list);
                return;
            }
            return;
        }
        o.LJIJI("powerList");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }
}
