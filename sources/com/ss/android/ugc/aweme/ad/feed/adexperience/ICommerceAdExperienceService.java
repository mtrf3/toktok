package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.C59122NIg;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.NFU;
import X.NQU;
import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.List;

/* loaded from: classes11.dex */
public interface ICommerceAdExperienceService {
    void LIZ(Context context, Aweme aweme, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2);

    NQU LIZIZ(C59122NIg c59122NIg);

    NFU LIZJ(Aweme aweme);

    List<String> LIZLLL(Aweme aweme);

    boolean LJ(Aweme aweme);

    void LJFF(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, String str);

    String LJI(AwemeRawAd awemeRawAd);

    BottomBarPriorityProtocol LJII();

    boolean LJIIIIZZ(Aweme aweme);

    void LJIIIZ(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2);

    void LJIIJ(Context context, Aweme aweme, String str);
}
