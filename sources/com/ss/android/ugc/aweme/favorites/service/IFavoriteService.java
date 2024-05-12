package com.ss.android.ugc.aweme.favorites.service;

import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C193577ij;
import X.C193627io;
import X.C7ZB;
import X.C7ZC;
import X.OSJ;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public interface IFavoriteService {
    boolean LIZ();

    long LIZIZ();

    void LIZJ(ActivityC45651qj activityC45651qj, String str, String str2);

    MusicCollectionRouteInterceptor LIZLLL();

    boolean LJ();

    boolean LJFF();

    int LJI();

    C193577ij LJII(C193627io c193627io);

    AmeBaseFragment LJIIIIZZ(User user, boolean z);

    boolean LJIIIZ();

    C7ZB LJIIJ();

    void LJIIJJI(String str);

    boolean LJIIL();

    C7ZC LJIILIIL();

    void LJIILJJIL(Context context);

    boolean LJIILL();

    void LJIILLIIL(ActivityC45651qj activityC45651qj, String str, String str2, View view);

    String LJIIZILJ();

    void LJIJ();

    OSJ LJIJI(long j, String str);

    boolean LJIJJ();

    List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList();
}
