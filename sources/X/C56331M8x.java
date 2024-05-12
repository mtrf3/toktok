package X;

import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.M8x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56331M8x {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZLLL(String str) {
        String str2;
        try {
            if (C6DX.LIZ()) {
                AwemeHostApplication LIZ2 = FKM.LIZ();
                if (LIZ2 != null) {
                    Object[] objArr = new Object[1];
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    objArr[0] = str2;
                    str = LIZ2.getString(R.string.geh, objArr);
                    if (str != null) {
                        return str;
                    }
                }
            } else if (str != null) {
                return str;
            }
        } catch (Throwable unused) {
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static boolean LJFF(Aweme aweme) {
        if (aweme == null || ((aweme.isCanPlay() && !aweme.isDelete()) || C63081OpJ.LJLJLLL(aweme))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6) {
        /*
            r4 = 1
            boolean r0 = X.C59251NNf.LIZ(r5, r4)
            r3 = 0
            if (r0 == 0) goto L93
            r0 = 3
            boolean r0 = X.C59251NNf.LIZIZ(r0, r5)
            if (r0 == 0) goto L93
            if (r5 == 0) goto L93
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L93
            X.NNj r0 = r0.vast
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L91
            X.NNj r0 = r0.vast
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.adTitle
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L93
            r2 = 1
        L3a:
            boolean r0 = LJFF(r5)
            if (r5 == 0) goto L44
            com.ss.android.ugc.aweme.profile.model.User r3 = r5.getAuthor()
        L44:
            java.lang.String r1 = ""
            if (r2 == 0) goto L65
            if (r5 == 0) goto L5e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L5e
            X.NNj r0 = r0.vast
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.adTitle
            if (r0 != 0) goto L63
        L5e:
            java.lang.String r1 = LIZLLL(r1)
        L62:
            return r1
        L63:
            r1 = r0
            goto L5e
        L65:
            if (r3 == 0) goto L62
            if (r0 == 0) goto L62
            java.lang.String r0 = "homepage_friends"
            boolean r1 = android.text.TextUtils.equals(r6, r0)
            boolean r0 = r3.isAdFake()
            if (r0 == 0) goto L7d
            if (r6 == 0) goto L7d
            int r0 = r6.length()
            if (r0 != 0) goto L86
        L7d:
            java.lang.String r0 = LIZIZ(r3, r1, r4)
        L81:
            java.lang.String r1 = LIZLLL(r0)
            goto L62
        L86:
            boolean r0 = r5.isAd()
            if (r0 != 0) goto L7d
            java.lang.String r0 = r3.getNickname()
            goto L81
        L91:
            r0 = r3
            goto L33
        L93:
            r2 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56331M8x.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.lang.String");
    }

    public static String LIZ(User user, boolean z, boolean z2) {
        String nickname;
        o.LJIIIZ(user, "<this>");
        C53249Kv7.LIZ.getClass();
        int intValue = ((Number) C53249Kv7.LIZIZ.getValue()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    nickname = user.getNickname();
                    if (nickname == null) {
                        return "";
                    }
                } else {
                    nickname = user.getUniqueId();
                    if (nickname == null) {
                        return "";
                    }
                }
            } else if (z) {
                nickname = user.getUniqueId();
                if (nickname == null) {
                    return "";
                }
            } else if (z2) {
                if (!C85990Xow.LJIIIZ()) {
                    nickname = user.getNickname();
                    if (nickname == null) {
                        return "";
                    }
                } else {
                    nickname = user.getUniqueId();
                    if (nickname == null) {
                        return "";
                    }
                }
            } else {
                nickname = user.getNickname();
                if (nickname == null) {
                    return "";
                }
            }
        } else if (z2) {
            if (!C85990Xow.LJIIIZ()) {
                nickname = user.getNickname();
                if (nickname == null) {
                    return "";
                }
            } else {
                nickname = user.getUniqueId();
                if (nickname == null) {
                    return "";
                }
            }
        } else {
            nickname = user.getNickname();
            if (nickname == null) {
                return "";
            }
        }
        return nickname;
    }

    public static String LIZIZ(User user, boolean z, boolean z2) {
        String uniqueId;
        o.LJIIIZ(user, "<this>");
        C53249Kv7.LIZ.getClass();
        int intValue = ((Number) C53249Kv7.LIZIZ.getValue()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    uniqueId = user.getUniqueId();
                    if (uniqueId == null) {
                        return "";
                    }
                } else {
                    uniqueId = user.getNickname();
                    if (uniqueId == null) {
                        return "";
                    }
                }
            } else if (z) {
                uniqueId = user.getNickname();
                if (uniqueId == null) {
                    return "";
                }
            } else if (z2) {
                if (!C85990Xow.LJIIIZ()) {
                    uniqueId = user.getUniqueId();
                    if (uniqueId == null) {
                        return "";
                    }
                } else {
                    uniqueId = user.getNickname();
                    if (uniqueId == null) {
                        return "";
                    }
                }
            } else {
                uniqueId = user.getUniqueId();
                if (uniqueId == null) {
                    return "";
                }
            }
        } else if (z2) {
            if (!C85990Xow.LJIIIZ()) {
                uniqueId = user.getUniqueId();
                if (uniqueId == null) {
                    return "";
                }
            } else {
                uniqueId = user.getNickname();
                if (uniqueId == null) {
                    return "";
                }
            }
        } else {
            uniqueId = user.getUniqueId();
            if (uniqueId == null) {
                return "";
            }
        }
        return uniqueId;
    }

    public static String LIZJ(String str, String str2, boolean z, boolean z2) {
        User user = new User();
        user.setNickname(str);
        user.setUniqueId(str2);
        return LIZIZ(user, z, z2);
    }
}
