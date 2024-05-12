package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C2K0;
import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import X.JMS;
import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes9.dex */
public interface SearchServiceCenter$NavigateAbility extends C2K0 {
    void ns(InterfaceC55235Lm3 interfaceC55235Lm3, Aweme aweme, InterfaceC88472Yns<? super EnterRoomConfig, EnterRoomConfig> interfaceC88472Yns);

    void su(InterfaceC55235Lm3 interfaceC55235Lm3, Context context, User user, String str);

    boolean xK();

    void y80(InterfaceC55235Lm3 interfaceC55235Lm3, Aweme aweme, JMS jms);
}
