package com.ss.android.ugc.aweme.commercialize.depend;

import X.C157566Gi;
import X.C158056If;
import X.C16880lQ;
import X.C221108m2;
import X.C226208uG;
import X.C226218uH;
import X.C26042AJy;
import X.C45804HyK;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C63077OpF;
import X.C74R;
import X.C78983UzD;
import X.NN1;
import X.NO5;
import X.NOE;
import X.O8Z;
import X.Z8A;
import Y.AObjectS52S0101000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes4.dex */
public final class AdCommentDependImpl implements IAdCommentDepend {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C226218uH.LJLIL);

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final String LJIIL() {
        AwemeFEConfigs awemeFEConfigs;
        LinkPlan linkPlan;
        String str = null;
        try {
            C157566Gi.LIZ().getClass();
            try {
                SettingsManager.LIZLLL().getClass();
                awemeFEConfigs = (AwemeFEConfigs) SettingsManager.LJII("aweme_fe_conf", AwemeFEConfigs.class);
            } catch (Throwable unused) {
                awemeFEConfigs = null;
            }
            if (awemeFEConfigs == null || (linkPlan = awemeFEConfigs.getLinkPlan()) == null) {
                return null;
            }
            str = linkPlan.getInfo();
            return str;
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public static IAdCommentDepend LJJIIJZLJL() {
        Object LIZ = C58096Mr6.LIZ(IAdCommentDepend.class, false);
        if (LIZ != null) {
            return (IAdCommentDepend) LIZ;
        }
        if (C58096Mr6.LLLL == null) {
            synchronized (IAdCommentDepend.class) {
                if (C58096Mr6.LLLL == null) {
                    C58096Mr6.LLLL = new AdCommentDependImpl();
                }
            }
        }
        return C58096Mr6.LLLL;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final NewCommentAdWidget LJ(AObjectS52S0101000_7 aObjectS52S0101000_7) {
        return new NewCommentAdWidget(aObjectS52S0101000_7);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean LJFF(Aweme aweme) {
        LinkData LIZ = C63077OpF.LIZ(aweme);
        if (LIZ != null && LIZ.linkType == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIILJJIL(AwemeRawAd awemeRawAd) {
        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        new AqS185S0100000_3(awemeRawAd, 40);
        O8Z.LIZ("click", clickTrackUrlList, creativeId, logExtra);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean LJIJ(String str) {
        return OpenChatExt.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final CommentHeaderWidget LJIJI(AqS153S0100000_3 aqS153S0100000_3) {
        return new CommentHeaderWidget(aqS153S0100000_3);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final String LJJ(CommentStruct commentStruct) {
        CommentService.LIZ.getClass();
        return CommentServiceImpl.LJJL().LJJJZ(commentStruct);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LIZJ(Context context, Aweme aweme) {
        LinkData LIZ = C63077OpF.LIZ(aweme);
        if (LIZ != null) {
            if (LIZ.linkType == 0) {
                NO5.LJIILIIL(context, LIZ, aweme, true);
            } else {
                if (LIZ.linkType != 1) {
                    return;
                }
                NO5.LJIILIIL(context, LIZ, aweme, true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJII(Context context, String str) {
        String str2;
        this.LIZ.getValue().getClass();
        Aweme aweme = AwemeService.LIZ().i6(str);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            IReportService LJIILLIIL = a.LJIILLIIL();
            o.LJIIIZ(aweme, "aweme");
            HashMap hashMap = new HashMap();
            LinkData LIZ = C63077OpF.LIZ(aweme);
            String str3 = null;
            if (LIZ != null) {
                str2 = LIZ.logExtra;
            } else {
                str2 = null;
            }
            hashMap.put("log_extra", str2);
            if (LIZ != null) {
                str3 = LIZ.creativeId;
            }
            hashMap.put("cid", str3);
            Uri.Builder builder = new Uri.Builder();
            String json = GsonProtectorUtils.toJson(new Gson(), hashMap);
            o.LJIIIIZZ(json, "Gson().toJson(extraMap)");
            LJIILLIIL.LIZJ(LJIJJ, C26042AJy.LIZ(builder, aweme, "landing_page", json));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List<TextExtraStruct> LJIIJ(Context context, CommentStruct commentStruct) {
        CommentService.LIZ.getClass();
        return CommentServiceImpl.LJJL().LJJIIJZLJL(context, commentStruct);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJJIII(Context context, User user) {
        if (user != null && context != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            buildRoute.withParam("uid", user.getUid());
            buildRoute.withParam("sec_user_id", user.getSecUid());
            buildRoute.withParam("profile_enterprise_type", Z8A.LIZIZ.getEnterpriseType(user));
            buildRoute.open();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List LIZIZ(Context context, CommentStruct commentStruct, Aweme aweme) {
        CommentService.LIZ.getClass();
        return CommentServiceImpl.LJJL().LIZIZ(context, commentStruct, aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIIJJI(Context context, String str, String str2) {
        this.LIZ.getValue().getClass();
        if (!NO5.LJI(context, str, false)) {
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            intent.setData(UriProtector.parse(str2));
            C16880lQ.LIZJ(context, intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIILIIL(Context context, Aweme aweme, String str) {
        o.LJIIIZ(context, "context");
        JSONObject LJIIIZ = NN1.LJIIIZ(context, aweme);
        if (!TextUtils.isEmpty(str)) {
            try {
                LJIIIZ.put("refer", str);
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", NN1.LJI(aweme));
                hashMap.put("room_id", NN1.LJIIZILJ(aweme));
                LJIIIZ.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        NN1.LJJJJI(context, "comment", aweme, LJIIIZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIIZILJ(Context context, String creativeId, String logExtra) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(creativeId, "creativeId");
        o.LJIIIZ(logExtra, "logExtra");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", "background");
            jSONObject.put("log_extra", logExtra);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        NN1.LIZJ(0L, context, "draw_ad", "replay", creativeId, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJIJJ(Context context, LinkData linkData, Aweme aweme) {
        this.LIZ.getValue().getClass();
        NO5.LJIILIIL(context, linkData, aweme, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean LIZ(Context context, Aweme aweme, int i, C74R adOpenCallBack) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(adOpenCallBack, "adOpenCallBack");
        return NOE.LJJIIJ(context, aweme, i, adOpenCallBack);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r5 != null) goto L10;
     */
    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            r9 = this;
            r6 = r10
            com.ss.android.ugc.aweme.commercialize.model.LinkData r5 = X.C63077OpF.LIZ(r6)
            if (r5 == 0) goto L61
            int r0 = r5.linkType
            if (r0 != 0) goto L61
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "enterprise_link_"
            r1.append(r0)
            int r0 = r5.saiyanLinkType
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            boolean r0 = X.C63081OpJ.LJLIL(r6)
            if (r0 == 0) goto L30
            if (r12 == 0) goto L30
            java.lang.String r3 = "link_click"
            android.content.Context r4 = X.EF7.LIZIZ()
            r7 = 1
            r8 = 0
            X.NN1.LJIJJLI(r3, r4, r5, r6, r7, r8)
        L30:
            int r1 = r5.linkType
            r0 = 1
            if (r1 != r0) goto L37
            java.lang.String r2 = "ad_link"
        L37:
            if (r6 != 0) goto L3a
        L39:
            return
        L3a:
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = r6.getAid()
            java.lang.String r0 = "group_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r0 = "enter_from"
            r3.LJIIIZ(r0, r11)
            java.lang.String r1 = r6.getAuthorUid()
            java.lang.String r0 = "author_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r0 = "link_type"
            r3.LJIIIZ(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.FMX.LJIIL(r13, r0)
            goto L39
        L61:
            java.lang.String r2 = ""
            if (r5 == 0) goto L37
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl.LJIILL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List LJJI(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AqS153S0100000_3 aqS153S0100000_3) {
        CommentService.LIZ.getClass();
        return CommentServiceImpl.LJJL().LJJJJI(context, commentStruct, awemeRawAd, aqS153S0100000_3);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void LJJIIJ(String str, Context context, LinkData linkData, Aweme aweme, String str2) {
        C226208uG c226208uG = new C226208uG();
        c226208uG.LIZIZ = linkData;
        c226208uG.LIZJ = aweme;
        c226208uG.LJ = true;
        c226208uG.LIZLLL = true;
        c226208uG.LIZ = str;
        c226208uG.LJII = str2;
        NN1.LJIJI(context, c226208uG.LIZ());
    }
}
