package com.twitter.sdk.android.core.identity;

import X.C65263PjP;
import X.C65264PjQ;
import X.C65279Pjf;
import X.InterfaceC65283Pjj;
import com.google.android.play.core.appupdate.h;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;

/* loaded from: classes12.dex */
public class TwitterAuthClient {
    public final h LIZ;
    public final InterfaceC65283Pjj<TwitterSession> LIZIZ;
    public final TwitterAuthConfig LIZJ;

    public TwitterAuthClient() {
        C65263PjP.LIZIZ();
        TwitterAuthConfig twitterAuthConfig = C65263PjP.LIZIZ().LIZLLL;
        C65264PjQ c65264PjQ = C65263PjP.LIZIZ().LIZ;
        this.LIZ = C65279Pjf.LIZ;
        this.LIZJ = twitterAuthConfig;
        this.LIZIZ = c65264PjQ;
    }
}
