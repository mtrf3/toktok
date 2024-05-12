package com.ss.android.ugc.aweme.app;

import X.EE1;
import android.app.Application;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceApplicationTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceMainActTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;

/* loaded from: classes7.dex */
public interface IInitAllService {
    boolean LIZ();

    InitLiveServiceTask LIZIZ();

    void LIZJ(AwemeHostApplication awemeHostApplication);

    void LIZLLL(Application application);

    void LJ();

    PreloadInstanceApplicationTask LJFF();

    void LJI();

    void LJII();

    InstallEventBus LJIIIIZZ();

    EE1 LJIIIZ();

    void LJIIJ(AwemeHostApplication awemeHostApplication);

    void LJIIJJI();

    RegisterLifecycle LJIIL();

    PreloadInstanceMainActTask LJIILIIL();

    void LJIILJJIL();

    void LJIILL(AwemeHostApplication awemeHostApplication);
}
