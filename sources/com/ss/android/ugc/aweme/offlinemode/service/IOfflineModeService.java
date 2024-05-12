package com.ss.android.ugc.aweme.offlinemode.service;

import X.ActivityC45651qj;
import X.C8W0;
import X.EE1;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;

/* loaded from: classes16.dex */
public interface IOfflineModeService {
    EE1 LIZ();

    String LIZIZ();

    void LIZJ(Activity activity);

    void LIZLLL(Fragment fragment);

    boolean LJ();

    IOfflineModeSwitchAbility LJFF(InterfaceC55235Lm3 interfaceC55235Lm3);

    void LJI();

    long LJII();

    void LJIIIIZZ(ActivityC45651qj activityC45651qj);

    InterfaceC65350Pko<? extends UIContentAssem> LJIIIZ();

    InterfaceC65350Pko<? extends C8W0> LJIIJ();

    String getSceneId();
}
