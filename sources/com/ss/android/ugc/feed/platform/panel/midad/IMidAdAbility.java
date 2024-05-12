package com.ss.android.ugc.feed.platform.panel.midad;

import X.C2K0;
import X.IWH;
import X.JAT;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes9.dex */
public interface IMidAdAbility extends C2K0 {
    IMidAdCellAbility FT();

    void LJJIIZ();

    void bF(Aweme aweme, Aweme aweme2, IWH iwh, JAT jat);

    ViewGroup getRootView();

    List<Aweme> im();

    void mC(Aweme aweme);
}
