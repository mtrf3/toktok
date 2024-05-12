package X;

import Y.IDhS0S1000000_1;
import Y.IDhS2S1000000_4;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import com.ss.android.ugc.aweme.share.ShortenUrlApi;
import com.ss.android.ugc.aweme.share.model.SharerInfoChecksum;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Ohr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62619Ohr {
    public static final java.util.Map<String, EnumC62617Ohp> LIZ = (java.util.Map) ShareConfig.LIZ.getValue();

    public static EnumC62617Ohp LIZ(String itemType, String origin) {
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(origin, "origin");
        EnumC62617Ohp enumC62617Ohp = LIZ.get(itemType);
        if (enumC62617Ohp == null) {
            enumC62617Ohp = EnumC62617Ohp.SHARE_DEFAULT;
        }
        android.net.Uri parse = UriProtector.parse(origin);
        if (o.LJ(UriProtector.getQueryParameter(parse, "aweme_type"), "40") || o.LJ(UriProtector.getQueryParameter(parse, "is_tiktok_story"), "true")) {
            return EnumC62617Ohp.SHARE_STORY;
        }
        return enumC62617Ohp;
    }

    public static AbstractC73635Sv9 LIZIZ(String str, String str2, String str3) {
        EnumC57171McB enumC57171McB;
        String str4;
        String str5;
        Integer LJJIL;
        HH1.LIZ(str, "itemType", str2, "channel", str3, "origin");
        C109254Qn.LIZ = System.currentTimeMillis();
        C109254Qn.LIZIZ = System.currentTimeMillis();
        C4LD.LIZIZ.LJIIL(EF7.LIZIZ(), str3);
        String str6 = "";
        if (C78857UxB.LJJJIL(str3)) {
            android.net.Uri parse = UriProtector.parse(str3);
            if (parse.isOpaque() || UriProtector.getQueryParameterNames(parse).isEmpty()) {
                C73320Sq4.LIZ(str3, "item is null");
                return new C73535StX(str3);
            }
            str5 = UriProtector.getQueryParameter(parse, "invitation_scene");
            if (str5 == null) {
                str5 = "";
            }
            String queryParameter = UriProtector.getQueryParameter(parse, "share_link_id");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String queryParameter2 = UriProtector.getQueryParameter(parse, "share_item_id");
            if (queryParameter2 != null) {
                str6 = queryParameter2;
            }
            String queryParameter3 = UriProtector.getQueryParameter(parse, "social_share_type");
            if (queryParameter3 != null && (LJJIL = C38350F3i.LJJIL(queryParameter3)) != null) {
                enumC57171McB = C55786Luw.LJFF(LJJIL.intValue());
            } else {
                enumC57171McB = null;
            }
            str4 = str6;
            str6 = queryParameter;
        } else {
            enumC57171McB = null;
            str4 = "";
            str5 = "";
        }
        boolean z = true;
        if (str6.length() <= 0 || enumC57171McB == null) {
            z = false;
        }
        if (!z) {
            new C9XY(str3, false, null, 12).LIZLLL("@LinkRelation");
            EnumC62617Ohp scene = LIZ(str, str3);
            o.LJIIIZ(scene, "scene");
            return E7M.LIZ.getShareLinkShortenUel(scene.getNum(), str2, str3).LJIIJJI(C62620Ohs.LJLIL).LJIJJLI(3L, TimeUnit.SECONDS).LJIILIIL(new IDhS0S1000000_1(str3, 1)).LJIILJJIL(2L, C73674Svm.LJI).LJIJJ(T16.LIZ());
        }
        C73627Sv1 LJIIJJI = ShortenUrlApi.LIZ(str6, str4, str5).LJIIJJI(new InterfaceC48038ItG() { // from class: X.303
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                SharerInfoChecksum it = (SharerInfoChecksum) obj;
                o.LJIIIZ(it, "it");
                return it.checksum;
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return LJIIJJI.LJIJJLI(1L, timeUnit).LJIILIIL(new IDhS2S1000000_4(str3, 0)).LJIIJJI(new IDhS2S1000000_4(str3, 1)).LJIIJ(new C62605Ohd(str, str3, str2)).LJIIJJI(C62621Oht.LJLIL).LJIJJLI(3L, timeUnit).LJIILIIL(new IDhS0S1000000_1(str3, 2)).LJIILJJIL(2L, C73674Svm.LJI).LJIJJ(T16.LIZ());
    }
}
