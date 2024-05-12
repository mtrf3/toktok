package com.ss.android.ugc.aweme;

import X.AbstractC241239dP;
import X.C3C8;
import X.C8XO;
import X.InterfaceC115514g7;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.Y2S;
import android.content.Context;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes16.dex */
public interface IDubbingService {
    boolean LIZ();

    boolean LIZIZ(Aweme aweme);

    InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZJ();

    boolean LIZLLL(InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC65784Pro<Boolean> interfaceC65784Pro2, InterfaceC55235Lm3 interfaceC55235Lm3, Aweme aweme, Context context);

    <T extends ReusedUISlotAssem<T> & C3C8 & C8XO<X>, X> InterfaceC115514g7<Object, AssemViewModel<Y2S>> LJ(T t, AbstractC241239dP abstractC241239dP);
}
