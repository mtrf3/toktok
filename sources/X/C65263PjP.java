package X;

import Y.ARunnableS18S0000000_11;
import android.content.Context;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.PjP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65263PjP {
    public static volatile C65263PjP LJI;
    public final C65264PjQ LIZ;
    public final C65264PjQ LIZIZ;
    public final C65277Pjd<TwitterSession> LIZJ;
    public final TwitterAuthConfig LIZLLL;
    public final C43862HJi LJ;
    public volatile C65254PjG LJFF;

    public C65263PjP() {
        throw null;
    }

    public static C65263PjP LIZIZ() {
        if (LJI == null) {
            synchronized (C65263PjP.class) {
                if (LJI == null) {
                    LJI = new C65263PjP(C65265PjR.LIZ().LIZLLL);
                    C65265PjR.LIZ().LIZJ.execute(new ARunnableS18S0000000_11(17));
                }
            }
        }
        return LJI;
    }

    public final C65254PjG LIZ() {
        if (this.LJFF == null) {
            synchronized (this) {
                if (this.LJFF == null) {
                    this.LJFF = new C65254PjG(new OAuth2Service(this, new C65051Pfz()), this.LIZIZ);
                }
            }
        }
        return this.LJFF;
    }

    public C65263PjP(TwitterAuthConfig twitterAuthConfig) {
        new ConcurrentHashMap();
        this.LIZLLL = twitterAuthConfig;
        C65265PjR LIZ = C65265PjR.LIZ();
        LIZ.getClass();
        Context context = LIZ.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(".TwitterKit");
        C43862HJi c43862HJi = new C43862HJi(context, JBR.LJFF(LIZ2, File.separator, "com.twitter.sdk.android:twitter-core", LIZ2));
        this.LJ = c43862HJi;
        C65264PjQ c65264PjQ = new C65264PjQ(new C65270PjW(c43862HJi, "session_store"), new C65262PjO(), "active_twittersession", "twittersession");
        this.LIZ = c65264PjQ;
        this.LIZIZ = new C65264PjQ(new C65270PjW(c43862HJi, "session_store"), new C65255PjH(), "active_guestsession", "guestsession");
        this.LIZJ = new C65277Pjd<>(c65264PjQ, C65265PjR.LIZ().LIZJ, new C65269PjV());
    }
}
