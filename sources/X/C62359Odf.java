package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Odf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62359Odf {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62362Odi.LJLIL);

    public static List LIZLLL() {
        return (List) LIZ.getValue();
    }

    public static int LIZIZ(String channelKey) {
        o.LJIIIZ(channelKey, "channelKey");
        List LIZLLL = LIZLLL();
        if (LIZLLL != null && !LIZLLL.isEmpty()) {
            for (SharePlatform sharePlatform : LIZLLL()) {
                if (o.LJ(sharePlatform.platformId, channelKey)) {
                    return sharePlatform.photoShareMode;
                }
            }
        }
        return -2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r3 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r4, X.EnumC62617Ohp r5) {
        /*
            java.lang.String r0 = "channelKey"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "shareScene"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.List r0 = LIZLLL()
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
        L16:
            r0 = -2
        L17:
            return r0
        L18:
            java.util.List r0 = LIZLLL()
            java.util.Iterator r2 = r0.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.share.SharePlatform r1 = (com.ss.android.ugc.aweme.share.SharePlatform) r1
            java.lang.String r0 = r1.platformId
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L20
            java.lang.String r0 = r1.platformId
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L16
            java.util.List<com.ss.android.ugc.aweme.setting.model.ShareConfig> r1 = r1.shareConfigList
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L47
            goto L16
        L47:
            java.util.Iterator r4 = r1.iterator()
            r3 = 0
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r2 = r4.next()
            com.ss.android.ugc.aweme.setting.model.ShareConfig r2 = (com.ss.android.ugc.aweme.setting.model.ShareConfig) r2
            int r1 = r2.scene
            X.Ohp r0 = X.EnumC62617Ohp.SHARE_DEFAULT
            int r0 = r0.getNum()
            if (r1 != r0) goto L67
            r3 = r2
            goto L4c
        L64:
            if (r3 == 0) goto L16
            goto L70
        L67:
            int r1 = r2.scene
            int r0 = r5.getNum()
            if (r1 != r0) goto L4c
            r3 = r2
        L70:
            int r0 = r3.shareMode
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62359Odf.LIZ(java.lang.String, X.Ohp):int");
    }

    public static int LIZJ(String channelKey, List list) {
        o.LJIIIZ(channelKey, "channelKey");
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SharePlatform sharePlatform = (SharePlatform) it.next();
                if (o.LJ(sharePlatform.platformId, channelKey)) {
                    return sharePlatform.shareMode;
                }
            }
        }
        return -2;
    }

    public static boolean LJFF(Aweme aweme, InterfaceC62225ObV channel) {
        List LIZLLL;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(channel, "channel");
        if (aweme.getAwemeType() != 150 || (LIZLLL = LIZLLL()) == null || LIZLLL.isEmpty() || LIZIZ(channel.key()) != 4) {
            return false;
        }
        return true;
    }

    public static boolean LJI(Aweme aweme, InterfaceC62225ObV interfaceC62225ObV) {
        int LIZJ;
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAwemeType() == 150) {
            LIZJ = LIZIZ(interfaceC62225ObV.key());
        } else {
            LIZJ = LIZJ(interfaceC62225ObV.key(), LIZLLL());
        }
        if (LIZJ == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJII(Aweme aweme, InterfaceC62225ObV channel) {
        List LIZLLL;
        o.LJIIIZ(channel, "channel");
        if ((aweme.getAwemeType() != 150 && !C1DF.LJJIII(aweme)) || (LIZLLL = LIZLLL()) == null || LIZLLL.isEmpty()) {
            return false;
        }
        int LIZIZ = LIZIZ(channel.key());
        if (LIZIZ != 4 && LIZIZ != 5) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Aweme aweme, InterfaceC62225ObV channel, boolean z) {
        int LIZJ;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(channel, "channel");
        if (aweme.getAwemeType() == 150) {
            LIZJ = LIZIZ(channel.key());
        } else {
            LIZJ = LIZJ(channel.key(), LIZLLL());
        }
        if (LIZJ == 0 && !channel.LJIILJJIL()) {
            return true;
        }
        return z;
    }
}
