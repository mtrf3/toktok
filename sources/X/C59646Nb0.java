package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.Nb0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59646Nb0 {
    public static List<String> LIZ = C47261Igj.LJJIJIL("dou+", "company_link", "iron_man", "shopping_cart", "open_platform", "movie", "sticker");

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r7, boolean r8) {
        /*
            r6 = 0
            if (r7 != 0) goto L4
            return r6
        L4:
            java.util.List<java.lang.String> r0 = X.C59646Nb0.LIZ
            java.util.Iterator r5 = r0.iterator()
        La:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lf3
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.hashCode()
            switch(r0) {
                case -1890252483: goto L1e;
                case -1648893033: goto L31;
                case -309942941: goto L68;
                case -210508088: goto L78;
                case 3089441: goto L9e;
                case 104087344: goto Lb3;
                case 1429828220: goto Lc3;
                default: goto L1d;
            }
        L1d:
            goto La
        L1e:
            java.lang.String r0 = "sticker"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L27
            goto La
        L27:
            com.ss.android.ugc.aweme.tools.detail.IPropReuseService r0 = com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl.LJIIJ()
            boolean r0 = r0.LIZIZ(r7)
            goto Leb
        L31:
            java.lang.String r0 = "shopping_cart"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3a
            goto La
        L3a:
            if (r8 == 0) goto La
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r0 = r7.getPromotion()
            if (r0 == 0) goto La
            X.LSn r4 = X.C235779Nd.LIZ
            X.Ecj<java.lang.Boolean> r0 = r4.LJIIZILJ
            if (r0 != 0) goto L53
            X.Ecj r3 = new X.Ecj
            java.lang.String r1 = "enable_shopping_total"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r1, r0)
            r4.LJIIZILJ = r3
        L53:
            X.Ecj<java.lang.Boolean> r0 = r4.LJIIZILJ
            java.lang.Object r1 = r0.LIZ()
            java.lang.String r0 = "inst().enableShoppingTotal.cache"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto La
            goto Led
        L68:
            java.lang.String r0 = "iron_man"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L71
            goto La
        L71:
            com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo r0 = r7.getMicroAppInfo()
            if (r0 == 0) goto La
            goto Led
        L78:
            java.lang.String r0 = "open_platform"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L81
            goto La
        L81:
            if (r8 != 0) goto La
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r7.getAnchorInfo()
            if (r0 == 0) goto La
            java.lang.Integer r3 = r0.getType()
            X.Gt8 r0 = X.EnumC42934Gt8.OPEN_PLATFORM_ANCHOR
            int r1 = r0.getTYPE()
            if (r3 != 0) goto L97
            goto La
        L97:
            int r0 = r3.intValue()
            if (r0 != r1) goto La
            goto Led
        L9e:
            java.lang.String r0 = "dou+"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto La
            com.ss.android.ugc.aweme.commercialize.model.DouPlusLinkData r0 = r0.getDouPlusLinkData()
            if (r0 == 0) goto La
            goto Led
        Lb3:
            java.lang.String r0 = "movie"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbd
            goto La
        Lbd:
            boolean r0 = X.HSN.LIZ(r7)
            goto Leb
        Lc3:
            java.lang.String r0 = "company_link"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lcd
            goto La
        Lcd:
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = X.C63077OpF.LIZ(r7)
            if (r1 == 0) goto La
            int r0 = r1.getLinkType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto Ldf
            goto La
        Ldf:
            int r0 = r0.intValue()
            if (r0 != 0) goto La
            if (r8 == 0) goto Lee
            boolean r0 = r1.showOnComment()
        Leb:
            if (r0 == 0) goto La
        Led:
            return r2
        Lee:
            boolean r0 = r1.showOnFeed()
            goto Leb
        Lf3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59646Nb0.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }

    public static boolean LIZIZ(Aweme aweme, boolean z, int i, String str) {
        return TextUtils.equals(str, LIZ(aweme, z));
    }
}
