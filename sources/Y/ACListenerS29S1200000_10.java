package Y;

import X.C188727au;
import X.C50921Jyf;
import X.C62313Ocv;
import X.C76W;
import X.C78598Ut0;
import X.FMX;
import X.InterfaceC62225ObV;
import X.X1D;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.FileProvider;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomDefaultCommentAssem;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import java.io.File;

/* loaded from: classes11.dex */
public class ACListenerS29S1200000_10 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(Y.ACListenerS29S1200000_10 r9, android.view.View r10) {
        /*
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem r0 = (com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem) r0
            X.Lm3 r1 = X.C55096Ljo.LJIIZILJ(r0)
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility> r0 = com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility.class
            r8 = 0
            X.2K0 r1 = X.C55096Ljo.LIZ(r1, r0, r8)
            com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility r1 = (com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility) r1
            if (r1 == 0) goto Lc1
            java.lang.String r0 = r9.s0
            X.NK8 r3 = r1.N50(r0)
            if (r3 == 0) goto Lc2
            java.util.List<java.lang.Long> r0 = r3.LIZ
            if (r0 == 0) goto Lc2
            int r4 = r0.size()
        L23:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r5 = r9.s0
            java.lang.Object r2 = r9.l2
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            java.lang.String r0 = "related_live_tag"
            r6.put(r0, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = "draw_video_id"
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            java.lang.String r1 = r0.getAuthorUid()
            java.lang.String r0 = "draw_author_id"
            r6.put(r0, r1)
            java.lang.String r1 = "tag_name"
            java.lang.String r0 = "cache_room_cnt"
            X.C116484hg.LIZIZ(r6, r1, r5, r4, r0)
            java.lang.Object r2 = r9.l2
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "game_live_bottom_banner_did_click"
            X.C8T8.LIZ(r0, r2, r1)
            java.lang.Object r1 = r9.l1
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem r1 = (com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem) r1
            X.NK7 r0 = r1.LLII
            if (r0 == 0) goto Lb9
        L69:
            android.view.View r1 = r1.getContainerView()
            if (r3 == 0) goto Lb7
            Y.ARunnableS46S0100000_10 r0 = r3.LIZJ
        L71:
            r1.removeCallbacks(r0)
            java.lang.Object r2 = r9.l1
            com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem r2 = (com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssem) r2
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r7 = r0.mEventType
            java.lang.String r0 = "item.eventType"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            android.content.Context r5 = r10.getContext()
            java.lang.String r0 = "it.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r2.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            if (r1 == 0) goto Lb4
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto Lb4
            X.Uqn r4 = r0.LJIILL()
            if (r4 == 0) goto Lb4
            if (r3 == 0) goto La9
            java.util.List<java.lang.Long> r8 = r3.LIZ
        La9:
            if (r3 == 0) goto Lb5
            int r0 = r3.LIZIZ
            int r9 = r0 + 1
        Laf:
            X.NK7 r10 = r2.LLII
            r4.LJIJI(r5, r6, r7, r8, r9, r10)
        Lb4:
            return
        Lb5:
            r9 = 0
            goto Laf
        Lb7:
            r0 = r8
            goto L71
        Lb9:
            X.NK7 r0 = new X.NK7
            r0.<init>(r1)
            r1.LLII = r0
            goto L69
        Lc1:
            r3 = r8
        Lc2:
            r4 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS29S1200000_10.onClick$0(Y.ACListenerS29S1200000_10, android.view.View):void");
    }

    public static final void onClick$1(ACListenerS29S1200000_10 aCListenerS29S1200000_10, View view) {
        Uri fromFile;
        VideoShare2GifPreviewActivity videoShare2GifPreviewActivity = (VideoShare2GifPreviewActivity) aCListenerS29S1200000_10.l1;
        InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) aCListenerS29S1200000_10.l2;
        String str = aCListenerS29S1200000_10.s0;
        if (videoShare2GifPreviewActivity.LJLJJI != null) {
            C76W c76w = new C76W();
            c76w.LIZ("group_id", videoShare2GifPreviewActivity.LJLJJI.awemeId);
            c76w.LIZ("author_id", videoShare2GifPreviewActivity.LJLJJI.authorId);
            c76w.LIZ("enter_from", videoShare2GifPreviewActivity.LJLJJI.enterFrom);
            c76w.LIZ("log_pb", videoShare2GifPreviewActivity.LJLJJI.logPb);
            c76w.LIZ("platform", interfaceC62225ObV.key());
            FMX.LJIILJJIL("share_as_gif", c76w.LIZIZ());
            C50921Jyf c50921Jyf = new C50921Jyf();
            VideoShare2GifEditContext videoShare2GifEditContext = videoShare2GifPreviewActivity.LJLJJI;
            c50921Jyf.LJJL = videoShare2GifEditContext.awemeId;
            c50921Jyf.LJJLI = videoShare2GifEditContext.authorId;
            c50921Jyf.LIZLLL = videoShare2GifEditContext.enterFrom;
            c50921Jyf.LJJLIIIIJ = interfaceC62225ObV.key();
            c50921Jyf.LJLLL = "gif_form";
            c50921Jyf.LJIILIIL();
        }
        File file = new File(videoShare2GifPreviewActivity.LJLJJI.gifImagePath);
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(videoShare2GifPreviewActivity.getPackageName());
            LIZ.append(".fileprovider");
            fromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(videoShare2GifPreviewActivity, X1D.LIZIZ(LIZ), file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        if (TextUtils.equals(str, "facebook")) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("video/*");
                intent.setClassName(videoShare2GifPreviewActivity.getPackageName(), "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                Intent createChooser = Intent.createChooser(Intent.createChooser(intent, ""), "");
                C78598Ut0.LJIJJ(createChooser, videoShare2GifPreviewActivity);
                videoShare2GifPreviewActivity.startActivity(createChooser);
            } catch (Exception unused) {
            }
        } else if (videoShare2GifPreviewActivity.LJLJJI != null) {
            interfaceC62225ObV.LJII(new C62313Ocv(fromFile, videoShare2GifPreviewActivity.LJLJJI.gifImagePath, null, null, null, null, false, 252), videoShare2GifPreviewActivity, null);
        }
        videoShare2GifPreviewActivity.LJLJJL = true;
    }

    public static final void onClick$2(ACListenerS29S1200000_10 aCListenerS29S1200000_10, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        AwemeCommerceStruct commerceVideoAuthInfo;
        StringBuilder LIZ = X1D.LIZ();
        String str6 = "https%3A%2F%2Finapp.tiktokv.com%2Fad%2Ftetris%2Fexperience%2Ffeedback_form%3fhide_nav_bar%3d1%26report_type%3d3";
        try {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            SettingsManager.LIZLLL().getClass();
            sb.append(SettingsManager.LJI("report_ads_problem_schema_setting", "https%3A%2F%2Finapp.tiktokv.com%2Fad%2Ftetris%2Fexperience%2Ffeedback_form%3fhide_nav_bar%3d1%26report_type%3d3"));
            str6 = sb.toString();
        } catch (Throwable unused) {
        }
        LIZ.append(str6);
        LIZ.append("%26selectTab%3d");
        LIZ.append(aCListenerS29S1200000_10.s0);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C188727au c188727au = new C188727au();
        Aweme aweme = ((BottomDefaultCommentAssem) aCListenerS29S1200000_10.l1).getAweme();
        String str7 = null;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            str = commerceVideoAuthInfo.getCreativeId();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("creativeId", str);
        FMX.LJIIL("select_report_ads", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(((BottomDefaultCommentAssem) aCListenerS29S1200000_10.l1).getContext(), LIZIZ);
        AwemeCommerceStruct awemeCommerceStruct = (AwemeCommerceStruct) aCListenerS29S1200000_10.l2;
        if (awemeCommerceStruct != null) {
            str2 = awemeCommerceStruct.getAdId();
        } else {
            str2 = null;
        }
        buildRoute.withParam("bundle_ad_id_from_aweme", str2);
        AwemeCommerceStruct awemeCommerceStruct2 = (AwemeCommerceStruct) aCListenerS29S1200000_10.l2;
        if (awemeCommerceStruct2 != null) {
            str3 = awemeCommerceStruct2.getAdvId();
        } else {
            str3 = null;
        }
        buildRoute.withParam("bundle_advertiser_id_from_aweme", str3);
        AwemeCommerceStruct awemeCommerceStruct3 = (AwemeCommerceStruct) aCListenerS29S1200000_10.l2;
        if (awemeCommerceStruct3 != null) {
            str4 = awemeCommerceStruct3.getCreativeId();
        } else {
            str4 = null;
        }
        buildRoute.withParam("bundle_creative_id_from_aweme", str4);
        AwemeCommerceStruct awemeCommerceStruct4 = (AwemeCommerceStruct) aCListenerS29S1200000_10.l2;
        if (awemeCommerceStruct4 != null) {
            str5 = awemeCommerceStruct4.getItemId();
        } else {
            str5 = null;
        }
        buildRoute.withParam("bundle_item_id_from_aweme", str5);
        AwemeCommerceStruct awemeCommerceStruct5 = (AwemeCommerceStruct) aCListenerS29S1200000_10.l2;
        if (awemeCommerceStruct5 != null) {
            l = Long.valueOf(awemeCommerceStruct5.getLastViewTime());
        } else {
            l = null;
        }
        buildRoute.withParam("bundle_view_time_from_aweme", l);
        Aweme aweme2 = ((BottomDefaultCommentAssem) aCListenerS29S1200000_10.l1).getAweme();
        if (aweme2 != null) {
            str7 = aweme2.getDesc();
        }
        buildRoute.withParam("bundle_desc_from_aweme", str7);
        Aweme aweme3 = ((BottomDefaultCommentAssem) aCListenerS29S1200000_10.l1).getAweme();
        if (aweme3 != null && aweme3.getVideo() != null && aweme3.getVideo().getCover() != null && aweme3.getVideo().getCover().getUrlList() != null && aweme3.getVideo().getCover().getUrlList().size() > 0) {
            buildRoute.withParam("bundle_cover_url_from_aweme", (String) ListProtector.get(aweme3.getVideo().getCover().getUrlList(), 0));
        }
        buildRoute.open();
    }

    public ACListenerS29S1200000_10(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
