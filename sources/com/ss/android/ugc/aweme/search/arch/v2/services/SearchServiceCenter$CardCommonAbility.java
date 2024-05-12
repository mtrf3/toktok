package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C2K0;
import X.InterfaceC49871Jhj;
import X.InterfaceC55235Lm3;
import Y.IDCListenerS245S0100000_8;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;

/* loaded from: classes9.dex */
public interface SearchServiceCenter$CardCommonAbility extends C2K0 {
    RecyclerView.ViewHolder C40();

    void Jq0(IDCListenerS245S0100000_8 iDCListenerS245S0100000_8);

    boolean WV(InterfaceC55235Lm3 interfaceC55235Lm3);

    InterfaceC49871Jhj dj0();

    ISearchCardProtocol<InterfaceC49871Jhj> getProtocol();
}
