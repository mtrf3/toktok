package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.C237559Tz;
import X.C26227ARb;
import X.C31461Li;
import X.C40300Frk;
import X.C40342FsQ;
import X.C40343FsR;
import X.C42193GhB;
import X.C44091HSd;
import X.C45804HyK;
import X.C58096Mr6;
import X.C59977NgL;
import X.C59980NgO;
import X.C59981NgP;
import X.C60141Niz;
import X.C60144Nj2;
import X.C60605NqT;
import X.C76732zl;
import X.C84763XOl;
import X.InterfaceC60142Nj0;
import X.KMP;
import X.KR3;
import X.OKG;
import X.UC0;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.settings.BAProductLinkSchemaSettings;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS2S0600000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class BAAnchorServiceImpl implements IBAAnchorService {
    public static IBAAnchorService LJII() {
        Object LIZ = C58096Mr6.LIZ(IBAAnchorService.class, false);
        if (LIZ != null) {
            return (IBAAnchorService) LIZ;
        }
        if (C58096Mr6.LLLILZLLLI == null) {
            synchronized (IBAAnchorService.class) {
                if (C58096Mr6.LLLILZLLLI == null) {
                    C58096Mr6.LLLILZLLLI = new BAAnchorServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLILZLLLI;
    }

    public static void LJIIIIZZ(Context context) {
        String str = "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3";
        String LIZJ = C31461Li.LIZJ("get_leads_schema_settings", "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=lead-gen&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js&enter_from=business_suite&createModel=3", "getInstance().getStringV…hemaSettings::class.java)");
        if (!TextUtils.isEmpty(LIZJ)) {
            str = LIZJ;
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext LIZIZ = C42193GhB.LIZIZ(str);
        LIZIZ.LJIL(new C60141Niz());
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, LIZIZ).LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final AnchorCommonStruct LIZLLL(Aweme aweme) {
        AnchorCommonStruct anchorCommonStruct;
        String keyword;
        String schema;
        o.LJIIIZ(aweme, "aweme");
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it = anchors.iterator();
            while (true) {
                if (it.hasNext()) {
                    anchorCommonStruct = it.next();
                    AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                    if (anchorCommonStruct2.getType() == 76 && anchorCommonStruct2.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    anchorCommonStruct = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
            if (anchorCommonStruct3 != null && (keyword = anchorCommonStruct3.getKeyword()) != null && keyword.length() != 0 && (schema = anchorCommonStruct3.getSchema()) != null && schema.length() != 0) {
                return anchorCommonStruct3;
            }
        }
        return null;
    }

    public static void LJIIIZ(int i, Context context) {
        String LJJJJZ;
        if (i == 1) {
            BAProductLinkSchemaSettings.LIZ.getClass();
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema = BAProductLinkSchemaSettings.LIZIZ;
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema2 = (BAProductLinkSchemaSettings.ProductLinkSchema) LIZLLL.LJIIIIZZ("ba_product_link_schema_set", BAProductLinkSchemaSettings.ProductLinkSchema.class, productLinkSchema);
            if (productLinkSchema2 != null) {
                productLinkSchema = productLinkSchema2;
            }
            String str = productLinkSchema.addLink;
            if (str != null) {
                LJJJJZ = ujb.o.LJJJJZ(str, "((enter_from))", "video_publish", false);
            } else {
                return;
            }
        } else {
            BAProductLinkSchemaSettings.LIZ.getClass();
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema3 = BAProductLinkSchemaSettings.LIZIZ;
            BAProductLinkSchemaSettings.ProductLinkSchema productLinkSchema4 = (BAProductLinkSchemaSettings.ProductLinkSchema) LIZLLL2.LJIIIIZZ("ba_product_link_schema_set", BAProductLinkSchemaSettings.ProductLinkSchema.class, productLinkSchema3);
            if (productLinkSchema4 != null) {
                productLinkSchema3 = productLinkSchema4;
            }
            String str2 = productLinkSchema3.createLink;
            if (str2 == null) {
                return;
            } else {
                LJJJJZ = ujb.o.LJJJJZ(str2, "((enter_from))", "video_publish", false);
            }
        }
        if (LJJJJZ == null) {
            return;
        }
        SmartRouter.buildRoute(context, LJJJJZ).open();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LIZIZ(AnchorCommonStruct anchorCommonStruct, Context context) {
        o.LJIIIZ(context, "context");
        new C59981NgP(C59980NgO.LIZ(anchorCommonStruct, context, true)).LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJ(int i, Context context, AqS157S0100000_7 aqS157S0100000_7) {
        int i2;
        int i3;
        C76732zl c76732zl = new C76732zl();
        C76732zl c76732zl2 = new C76732zl();
        C76732zl c76732zl3 = new C76732zl();
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                    LJIIIZ(1, context);
                    aqS157S0100000_7.invoke();
                    KevaImpl.getRepo("ba_product_anchor", 0).storeBoolean("clicked", true);
                    return;
                }
                c76732zl.element = R.string.sn_;
                c76732zl2.element = R.string.sn9;
                c76732zl3.element = 3;
                i2 = R.string.snf;
                i3 = R.string.sne;
            } else {
                c76732zl.element = R.string.snb;
                c76732zl2.element = R.string.sna;
                c76732zl3.element = 2;
                i2 = R.string.snd;
                i3 = R.string.snc;
            }
        } else {
            c76732zl.element = R.string.snj;
            c76732zl2.element = R.string.snh;
            c76732zl3.element = 1;
            i2 = R.string.sng;
            i3 = R.string.sni;
        }
        C26227ARb LIZLLL = KMP.LIZLLL(context, i2, i3);
        UC0.LIZJ(LIZLLL, new AqS2S0600000_4(c76732zl, c76732zl2, c76732zl3, this, context, aqS157S0100000_7, 1));
        LIZLLL.LJII = false;
        LIZLLL.LJI().LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final C44091HSd LJFF(Context context, Aweme aweme, String str) {
        AnchorCommonStruct LIZLLL;
        if (aweme == null || (LIZLLL = LIZLLL(aweme)) == null) {
            return null;
        }
        return new C44091HSd(context, LIZLLL, aweme, str);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LIZ(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String enterFrom) {
        String schema;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        String str2 = null;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null || schema.length() == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview_popup?url=");
        LIZ.append(Uri.encode(schema));
        String LIZIZ = X1D.LIZIZ(LIZ);
        Activity LIZJ = KR3.LIZJ(context);
        if (LIZJ == null && (LIZJ = C84763XOl.LJIIIIZZ()) == null) {
            return;
        }
        int LJJJLIIL = (int) (C45804HyK.LJJJLIIL(LIZJ, Integer.valueOf(C60605NqT.LJIIJ(C60605NqT.LJI(LIZJ), LIZJ))) * 0.85f);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(LIZIZ);
        sparkContext.LJJIIJ("gravity", "bottom");
        sparkContext.LJJIFFI(LJJJLIIL, "height");
        sparkContext.LJJIIJ("use_spark", "1");
        sparkContext.LJJIIJ("enable_pull_down_close", "1");
        sparkContext.LJJIIJ("show_mask", "1");
        sparkContext.LJJIFFI(0, "radius");
        sparkContext.LJJIIJ("keyboard_adjust", "2");
        sparkContext.LJII(InterfaceC60142Nj0.class, new C59977NgL(sparkContext, anchorCommonStruct, aweme, enterFrom));
        sparkContext.LJJ(new C60144Nj2());
        if (aweme != null) {
            str = aweme.getAid();
            str2 = aweme.getAuthorUid();
        } else {
            str = null;
        }
        sparkContext.LJII(C40300Frk.class, new C40300Frk(str, str2));
        OKG.LIZLLL(C40343FsR.LJIILJJIL, context, sparkContext);
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LIZJ(int i, Context context, AqS154S0200000_7 aqS154S0200000_7, AqS157S0100000_7 aqS157S0100000_7) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 6) {
                                return;
                            }
                            C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.nn, R.string.nk);
                            UC0.LIZJ(LIZLLL, new AqS141S0200000_10(this, context, 78));
                            LIZLLL.LJII = false;
                            LIZLLL.LJI().LIZLLL();
                            return;
                        }
                        C26227ARb LIZLLL2 = KMP.LIZLLL(context, R.string.nt, R.string.nr);
                        UC0.LIZJ(LIZLLL2, new AqS141S0200000_10(this, context, 76));
                        LIZLLL2.LJII = false;
                        LIZLLL2.LJI().LIZLLL();
                        return;
                    }
                    C26227ARb LIZLLL3 = KMP.LIZLLL(context, R.string.nt, R.string.nq);
                    UC0.LIZJ(LIZLLL3, new AqS141S0200000_10(this, context, 74));
                    LIZLLL3.LJII = false;
                    LIZLLL3.LJI().LIZLLL();
                    return;
                }
                C26227ARb LIZLLL4 = KMP.LIZLLL(context, R.string.nx, R.string.nw);
                UC0.LIZJ(LIZLLL4, new AqS141S0200000_10(this, context, 72));
                LIZLLL4.LJII = false;
                LIZLLL4.LJI().LIZLLL();
                return;
            }
            aqS157S0100000_7.invoke();
            return;
        }
        aqS154S0200000_7.invoke();
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService
    public final void LJI(Context context, User user, Aweme aweme, AnchorCommonStruct anchorCommonStruct) {
        String schema;
        String str;
        List<String> urlList;
        o.LJIIIZ(context, "context");
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ixBusinessData", anchorCommonStruct.getExtra());
        Uri.Builder buildUpon = UriProtector.parse(schema).buildUpon();
        C237559Tz c237559Tz = new C237559Tz();
        c237559Tz.LIZJ = 1;
        c237559Tz.LJIIIZ(aweme);
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("enter_from", (String) c237559Tz.LIZLLL("enter_from"));
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger != null && (urlList = avatarLarger.getUrlList()) != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("avatar", str).appendQueryParameter("name", user.getNickname()).appendQueryParameter("ba_uid", user.getUid()).appendQueryParameter("title", anchorCommonStruct.getKeyword());
        C237559Tz c237559Tz2 = new C237559Tz();
        c237559Tz2.LJIIIZ(aweme);
        String builder = appendQueryParameter2.appendQueryParameter("is_ad", String.valueOf(c237559Tz2.LIZLLL("is_ad"))).toString();
        o.LJIIIIZZ(builder, "parse(schema).buildUpon(…)\n            .toString()");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext LIZIZ = C42193GhB.LIZIZ(builder);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "initialData.toString()");
        LIZIZ.LJJIIJ("initialData", jSONObject2);
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, LIZIZ).LIZIZ();
    }
}
