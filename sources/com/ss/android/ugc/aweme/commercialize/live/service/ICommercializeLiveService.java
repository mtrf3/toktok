package com.ss.android.ugc.aweme.commercialize.live.service;

import X.InterfaceC37276Ek4;
import X.InterfaceC59337NQn;
import X.InterfaceC59736NcS;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PromoteEntrySchemaModel;
import com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface ICommercializeLiveService {
    void LIZ(JSONObject jSONObject);

    int LIZIZ();

    void LIZJ(Context context, Aweme aweme, int i, User user);

    void LIZLLL(Aweme aweme, EnterRoomConfig enterRoomConfig, int i);

    boolean LJ();

    void LJFF(Context context, AqS134S0200000_3 aqS134S0200000_3);

    void LJI(Aweme aweme);

    InterfaceC37276Ek4 LJII(int i, String str, String str2, long j, String str3);

    void LJIIIIZZ();

    boolean LJIIIZ();

    void LJIIJ(Context context, String str);

    InterfaceC59736NcS LJIIJJI(FrameLayout frameLayout);

    InterfaceC59337NQn LJIIL(FrameLayout frameLayout);

    boolean LJIILIIL(Aweme aweme);

    void LJIILJJIL(JSONObject jSONObject);

    AdLiveEnterRoomConfig LJIILL(Aweme aweme, AwemeRawAd awemeRawAd, int i);

    PromoteIconFlipFrequencySettingsModel LJIILLIIL();

    void LJIIZILJ();

    String LJIJ(Aweme aweme);

    void LJIJI(String str, String str2, Map map);

    String LJIJJ(Aweme aweme);

    long LJIJJLI();

    PromoteEntrySchemaModel LJIL();

    int LJJ();

    boolean LJJI();

    void LJJIFFI(String str);

    void LJJII(Integer num, Long l, String str, String str2);

    void LJJIII();

    void preload(Context context, String str);
}
