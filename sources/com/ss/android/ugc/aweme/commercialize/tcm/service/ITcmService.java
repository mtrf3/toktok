package com.ss.android.ugc.aweme.commercialize.tcm.service;

import X.C198377qT;
import X.C38049EwX;
import X.C55492LqC;
import X.InterfaceC40516FvE;
import X.NHD;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface ITcmService {
    C198377qT LIZ(Context context, Aweme aweme, String str);

    void LIZIZ(JSONObject jSONObject);

    int LIZJ(Integer num);

    boolean LIZLLL(Aweme aweme);

    TcmOrderStatusBottomBarAssem LJ();

    C55492LqC LJFF(Context context, ViewGroup viewGroup);

    void LJI(Context context, Aweme aweme);

    boolean LJII();

    void LJIIIIZZ(NHD nhd);

    void LJIIIZ(Context context, C38049EwX c38049EwX, InterfaceC40516FvE interfaceC40516FvE);

    boolean LJIIJ(Aweme aweme, String str);

    int LJIIJJI();

    void LJIIL(Context context, Aweme aweme);

    boolean LJIILIIL();

    void LJIILJJIL(Activity activity, Aweme aweme);

    void LJIILL(Aweme aweme, String str);

    void LJIILLIIL(JSONObject jSONObject);

    TcmConfig LJIIZILJ();

    boolean LJIJ(Aweme aweme, String str);
}
