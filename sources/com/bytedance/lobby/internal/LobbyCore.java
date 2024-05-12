package com.bytedance.lobby.internal;

import X.C77119UOl;
import X.QB3;
import X.QB4;
import X.QB5;
import X.QB6;
import X.QB8;
import X.QBA;
import X.QBY;
import X.QCI;
import X.X1D;
import android.app.Application;
import com.bytedance.lobby.facebook.FacebookAuth;
import com.bytedance.lobby.facebook.FacebookShare;
import com.bytedance.lobby.google.GoogleAuth;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.bytedance.lobby.google.GoogleShare;
import com.bytedance.lobby.google.GoogleWebAuth;
import com.bytedance.lobby.instagram.InstagramAuth;
import com.bytedance.lobby.kakao.KakaoAuth;
import com.bytedance.lobby.line.LineAuth;
import com.bytedance.lobby.twitter.TwitterAuth;
import com.bytedance.lobby.vk.VkAuth;

/* loaded from: classes12.dex */
public final class LobbyCore {
    public static final boolean DEBUG = C77119UOl.LIZIZ;
    public static volatile boolean isInit;
    public static Application sApplication;
    public static QBY sPluginService;
    public static QB8 sProviderConfig;

    public static void tryInitProviderConfig() {
        if (!isInit) {
            synchronized (LobbyCore.class) {
                if (!isInit) {
                    if (sProviderConfig.LIZ() != null) {
                        for (QCI qci : sProviderConfig.LIZ()) {
                            int i = qci.LIZ;
                            if (i == 2) {
                                registerAuth(qci);
                            } else if (i == 3) {
                                registerShare(qci);
                            } else {
                                registerAuth(qci);
                                registerShare(qci);
                            }
                        }
                    }
                    isInit = true;
                }
            }
        }
    }

    public static Application getApplication() {
        return sApplication;
    }

    public static QBY getPluginService() {
        return sPluginService;
    }

    public static QB3 createAuth(QCI qci) {
        String str = qci.LIZIZ;
        str.getClass();
        switch (str.hashCode()) {
            case -1534815154:
                if (!str.equals("google_web")) {
                    return null;
                }
                return new GoogleWebAuth(qci);
            case -1240244679:
                if (!str.equals("google")) {
                    return null;
                }
                return new GoogleAuth(qci);
            case -916346253:
                if (!str.equals("twitter")) {
                    return null;
                }
                return new TwitterAuth(qci);
            case 3765:
                if (!str.equals("vk")) {
                    return null;
                }
                return new VkAuth(sApplication, qci);
            case 3321844:
                if (!str.equals("line")) {
                    return null;
                }
                return new LineAuth(qci);
            case 28903346:
                if (!str.equals("instagram")) {
                    return null;
                }
                return new InstagramAuth(qci);
            case 323062851:
                if (!str.equals("google_onetap")) {
                    return null;
                }
                return new GoogleOneTapAuth(qci);
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return null;
                }
                return new KakaoAuth(qci);
            case 497130182:
                if (!str.equals("facebook")) {
                    return null;
                }
                return new FacebookAuth(qci);
            default:
                return null;
        }
    }

    public static QB4 createShare(QCI qci) {
        String str = qci.LIZIZ;
        str.getClass();
        if (!str.equals("google")) {
            if (!str.equals("facebook")) {
                return null;
            }
            return new FacebookShare(qci);
        }
        return new GoogleShare(qci);
    }

    public static void initialize(QB6 qb6) {
        QB8 qb8 = qb6.LIZIZ;
        if (qb8 == null) {
            return;
        }
        sApplication = (Application) qb6.LIZ;
        sProviderConfig = qb8;
        sPluginService = qb6.LIZJ;
        C77119UOl.LIZIZ = qb6.LIZLLL;
        if (qb8.LIZIZ()) {
            tryInitProviderConfig();
        }
    }

    public static void registerAuth(QCI qci) {
        QB3 createAuth = createAuth(qci);
        if (createAuth == null) {
            if (!C77119UOl.LIZIZ) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot find Provider with id ");
            LIZ.append(qci.LIZIZ);
            throw new NullPointerException(X1D.LIZIZ(LIZ));
        }
        createAuth.wv();
        QBA LIZIZ = QBA.LIZIZ();
        synchronized (LIZIZ) {
            LIZIZ.LIZ.put(createAuth.getConfig().LIZIZ, createAuth);
        }
    }

    public static void registerShare(QCI qci) {
        QB4 createShare = createShare(qci);
        if (createShare == null) {
            if (!C77119UOl.LIZIZ) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot find Provider with id ");
            LIZ.append(qci.LIZIZ);
            throw new NullPointerException(X1D.LIZIZ(LIZ));
        }
        if (QB5.LIZIZ == null) {
            synchronized (QB5.class) {
                if (QB5.LIZIZ == null) {
                    QB5.LIZIZ = new QB5();
                }
            }
        }
        QB5.LIZIZ.LIZ(createShare);
    }
}
