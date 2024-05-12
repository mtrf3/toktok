package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Ode, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62358Ode {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62360Odg.LJLIL);

    public static String LIZ(InterfaceC62225ObV channel, String str, String shareDesc) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(shareDesc, "shareDesc");
        if (!LIZIZ(channel, str, 0)) {
            return "";
        }
        if (o.LJ(channel.key(), "twitter")) {
            if (SettingServiceImpl.LIZ().isArabicLang(EF7.LIZIZ()) && !TextUtils.isEmpty(shareDesc)) {
                shareDesc = shareDesc.replace("#", "");
            }
            o.LJIIIIZZ(shareDesc, "{\n                Arabic…(shareDesc)\n            }");
        }
        return shareDesc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        if (r4 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.InterfaceC62225ObV r8, java.lang.String r9, int r10) {
        /*
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.Ol8 r0 = X.C62358Ode.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r9)
            X.Ohp r0 = (X.EnumC62617Ohp) r0
            if (r0 == 0) goto L31
        L15:
            int r5 = r0.getNum()
            X.Eak r0 = X.C36698Eak.LIZIZ()
            com.ss.android.ugc.aweme.setting.model.ShareSettings r0 = r0.LJLJI
            r4 = 0
            if (r0 == 0) goto L2f
            java.util.List<com.ss.android.ugc.aweme.share.SharePlatform> r1 = r0.sharePlatforms
        L24:
            r7 = 0
            r6 = 1
            if (r1 == 0) goto L2e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L34
        L2e:
            return r7
        L2f:
            r1 = r4
            goto L24
        L31:
            X.Ohp r0 = X.EnumC62617Ohp.SHARE_DEFAULT
            goto L15
        L34:
            java.util.Iterator r3 = r1.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.share.SharePlatform r2 = (com.ss.android.ugc.aweme.share.SharePlatform) r2
            java.lang.String r1 = r2.platformId
            java.lang.String r0 = r8.key()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L38
            java.util.List<com.ss.android.ugc.aweme.setting.model.ShareConfig> r1 = r2.shareConfigList
            if (r1 == 0) goto L5a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5b
        L5a:
            return r7
        L5b:
            java.util.Iterator r3 = r1.iterator()
        L5f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.setting.model.ShareConfig r2 = (com.ss.android.ugc.aweme.setting.model.ShareConfig) r2
            int r1 = r2.scene
            X.Ohp r0 = X.EnumC62617Ohp.SHARE_DEFAULT
            int r0 = r0.getNum()
            if (r1 != r0) goto L7a
            r4 = r2
            goto L5f
        L77:
            if (r4 == 0) goto L9a
            goto L7f
        L7a:
            int r0 = r2.scene
            if (r0 != r5) goto L5f
            r4 = r2
        L7f:
            java.util.List<java.lang.Integer> r0 = r4.shareDescEnableModes
            if (r0 == 0) goto L9a
            java.util.Iterator r1 = r0.iterator()
        L87:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r10) goto L87
            return r6
        L9a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62358Ode.LIZIZ(X.ObV, java.lang.String, int):boolean");
    }
}
