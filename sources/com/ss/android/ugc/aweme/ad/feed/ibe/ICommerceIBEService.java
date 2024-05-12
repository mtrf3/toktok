package com.ss.android.ugc.aweme.ad.feed.ibe;

import X.C58628Mzg;
import X.C59119NId;
import X.C76800UCe;
import X.EnumC59048NFk;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.NDX;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes11.dex */
public interface ICommerceIBEService {
    Object LIZ(IBEInfo iBEInfo, C58628Mzg c58628Mzg, InterfaceC67352kd<? super Boolean> interfaceC67352kd);

    NDX LIZIZ(C59119NId c59119NId);

    boolean LIZJ(String str);

    void LIZLLL(IBEInfo iBEInfo, Context context, C58628Mzg c58628Mzg, InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void LJ(List<? extends Aweme> list, EnumC59048NFk enumC59048NFk, Integer num);
}
