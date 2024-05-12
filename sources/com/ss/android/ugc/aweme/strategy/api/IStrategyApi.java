package com.ss.android.ugc.aweme.strategy.api;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.utils.OHRPredictResultParams;
import kotlin.jvm.internal.AqS106S0101000_6;

/* loaded from: classes7.dex */
public interface IStrategyApi {
    boolean LIZ();

    boolean LIZJ();

    void LIZLLL(long j);

    boolean LJ();

    int LJFF();

    boolean LJI();

    int LJII(int i);

    boolean LJIIIIZZ(long j);

    void LJIIIZ(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    int LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL(InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    boolean LJIILIIL();

    boolean LJIILJJIL();

    boolean LJIILL();

    boolean LJIILLIIL(InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    boolean LJIIZILJ();

    boolean LJIJ();

    boolean LJIJI();

    boolean LJIJJ();

    int LJIJJLI();

    boolean LJIL();

    boolean LJJ();

    boolean LJJI();

    int LJJIFFI(int i);

    int LJJII();

    String LJJIII();

    boolean LJJIIJ();

    boolean LJJIIJZLJL();

    boolean LJJIIZ();

    Handler LJJIIZI();

    boolean LJJIJ();

    void LJJIJIIJI(ARunnableS42S0100000_6 aRunnableS42S0100000_6, AqS106S0101000_6 aqS106S0101000_6);

    boolean LJJIJIIJIL();

    boolean LJJIJIL();

    OHRPredictResultParams LJJIJL();

    boolean LJJIJLIJ();

    boolean LJJIL();

    int getAppId();

    AwemeHostApplication getApplication();

    Context getApplicationContext();

    int getAverageSpeedInKBps();

    long getUpdateVersionCode();

    boolean isNewUser();
}
