package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.C2K0;
import X.C57778Mly;
import X.C57826Mmk;
import X.C57859MnH;
import X.C76800UCe;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.InterfaceC57927MoN;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.Set;

/* loaded from: classes10.dex */
public interface IUserCardListAbility extends C2K0 {
    int GM(InterfaceC57784Mm4 interfaceC57784Mm4);

    void Gp(InterfaceC57927MoN interfaceC57927MoN);

    void Ju0(InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe> interfaceC88472Yns);

    void K8(InterfaceC57910Mo6 interfaceC57910Mo6);

    void S70(C57778Mly c57778Mly);

    Set<String> Sb0();

    void W7(InterfaceC57910Mo6 interfaceC57910Mo6);

    C57859MnH getConfig();

    C57778Mly getState();

    void my(C57826Mmk c57826Mmk, boolean z);

    void mz(RecUser recUser);

    void onCleared();
}
