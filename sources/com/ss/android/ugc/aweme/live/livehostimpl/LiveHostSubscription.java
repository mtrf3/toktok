package com.ss.android.ugc.aweme.live.livehostimpl;

import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C03880Dg;
import X.C0H1;
import X.C39519Ff9;
import X.C45456Hsi;
import X.C45804HyK;
import X.C65300Pk0;
import X.C67054QTi;
import X.C72991Skl;
import X.C73030SlO;
import X.C76878UFe;
import X.C76882UFi;
import X.C76883UFj;
import X.HG3;
import X.HH1;
import X.R7H;
import X.UGZ;
import Y.IDeS358S0100000_13;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumServiceImpl;
import defpackage.g0;
import defpackage.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveHostSubscription implements IHostSubscription {
    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void W30(C45456Hsi c45456Hsi) {
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Ed(C76882UFi c76882UFi) {
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = new SpotlightImageListPreviewDialogFragment();
        spotlightImageListPreviewDialogFragment.LJLJI = c76882UFi;
        List<Bitmap> list = c76882UFi.LJI;
        o.LJIIIZ(list, "<set-?>");
        spotlightImageListPreviewDialogFragment.LJLILLLLZI = list;
        String str = c76882UFi.LIZIZ;
        o.LJIIIZ(str, "<set-?>");
        spotlightImageListPreviewDialogFragment.LJLJL = str;
        spotlightImageListPreviewDialogFragment.show(c76882UFi.LIZ, "SpotlightImageListPreviewDialogFragment");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Hh(C76883UFj c76883UFj) {
        EmoteEditDialogFragment emoteEditDialogFragment = new EmoteEditDialogFragment();
        emoteEditDialogFragment.LJLIL = c76883UFj;
        emoteEditDialogFragment.LJLILLLLZI = c76883UFj.LJII;
        emoteEditDialogFragment.show(c76883UFj.LIZ, "SubscribePreviewImageDialogFragment");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final List<LiveSubMediaModel> jy(Intent data) {
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("choose_live_sub_media");
        if (parcelableArrayListExtra == null) {
            return new ArrayList();
        }
        return parcelableArrayListExtra;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void yY(Context context) {
        Bundle LIZ = C0H1.LIZ("previous_page", "subscription_page");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        buildRoute.withParam(LIZ);
        buildRoute.withParam(UriProtector.parse("https://www.tiktok.com/email/h5/notifications?disableBounces=1"));
        buildRoute.open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Me0(Context context, AqS171S0100000_5 aqS171S0100000_5) {
        new R7H(context).LJJIII("normal", new C67054QTi(aqS171S0100000_5));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final String V00(Context context, Uri uri) {
        ContentResolver contentResolver;
        Cursor query;
        int columnIndex;
        String str = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return uri.getPath();
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        if (!"content".equals(scheme) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        String[] strArr = {"_data"};
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "8821130800147708560"));
        if (LIZJ.LIZ) {
            query = (Cursor) LIZJ.LIZIZ;
        } else {
            query = contentResolver.query(uri, strArr, null, null, null);
        }
        if (query == null) {
            return null;
        }
        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) > -1) {
            str = query.getString(columnIndex);
        }
        query.close();
        return str;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void m10(Context context, AqS171S0100000_5 aqS171S0100000_5) {
        Activity LJIJJ;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            HG3.LJFF().bindEmail(LJIJJ, "subscription_page", "click", null, new IDeS358S0100000_13(aqS171S0100000_5, 0));
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void G30(Context context, int i, String enterFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//live/container");
        buildRoute.withParam("fragment_type", "subscribe");
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("open_sub_only_setting", i);
        buildRoute.open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final IHostSubscription.Result QL(Fragment mFragment, Intent data, IHostSubscription.Params mParams) {
        o.LJIIIZ(mFragment, "mFragment");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(mParams, "mParams");
        return uV(mFragment, g0.LJJJIL(data.getParcelableArrayListExtra("choose_photo")), mParams, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void RX(C76883UFj c76883UFj, String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = new SpotlightImageEditDialogFragment();
        spotlightImageEditDialogFragment.LJLIL = c76883UFj;
        spotlightImageEditDialogFragment.LJLILLLLZI = c76883UFj.LJII;
        spotlightImageEditDialogFragment.LLFII = enterFrom;
        spotlightImageEditDialogFragment.show(c76883UFj.LIZ, "SpotlightImageEditDialogFragment");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x011f, code lost:
    
        if (r14.getWidth() != r14.getHeight()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0239, code lost:
    
        if (r1 == null) goto L73;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdkapi.host.IHostSubscription.Result uV(androidx.fragment.app.Fragment r19, java.util.List<com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel> r20, com.bytedance.android.livesdkapi.host.IHostSubscription.Params r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostSubscription.uV(androidx.fragment.app.Fragment, java.util.List, com.bytedance.android.livesdkapi.host.IHostSubscription$Params, boolean):com.bytedance.android.livesdkapi.host.IHostSubscription$Result");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void Hm(Context context, String str, String str2, String str3, String str4, Integer num, String str5) {
        int i;
        SmartRoute LIZ = m0.LIZ(context, "//live/ReplayVideoClipActivity", "videoId", str, "videoUrl", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ.withParam("enterFromPage", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZ.withParam("enterFrom", str4);
        if (str5 == null) {
            str5 = "live_replay";
        }
        LIZ.withParam("lastPage", str5);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LIZ.withParam("videoLengthMS", i * 1000);
        LIZ.open();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void WX(Context context, String str, String str2, String str3, String str4, int i, String str5) {
        HH1.LIZ(str, "roomId", str2, "clipId", str3, "url");
        C72991Skl.LIZJ(context, 0.0f, null, str, str2, str3, str4, str5);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void gx(Fragment fragment, int i, int i2, int i3, int i4, C76878UFe imageParams, Map<String, ? extends Object> logInfo) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(imageParams, "imageParams");
        o.LJIIIZ(logInfo, "logInfo");
        IExternalAlbumService service = AlbumServiceImpl.LIZJ();
        o.LJIIIIZZ(service, "service");
        service.LIZ(fragment, i, i2, i3, i4, imageParams.getMinWidth(), imageParams.getMinHeight(), imageParams.getMaxWidth(), imageParams.getMaxHeight(), imageParams.getMaxSize(), logInfo, 3);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void gW(Context context, String str, int i, boolean z, int i2, boolean z2, boolean z3, UGZ ugz) {
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i2);
        bundle.putBoolean("isMute", z2);
        bundle.putBoolean("isPause", z3);
        bundle.putBoolean("isAutoPlay", z);
        bundle.putInt("videoLength", i);
        bundle.putString("videoUrl", str);
        EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment = new EducationVideoPlayerDialogFragment();
        educationVideoPlayerDialogFragment.LJLLJ = ugz;
        educationVideoPlayerDialogFragment.setArguments(bundle);
        educationVideoPlayerDialogFragment.setCancelable(false);
        if ((context instanceof ActivityC45651qj) && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            educationVideoPlayerDialogFragment.show(supportFragmentManager, "common_video_player");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSubscription
    public final void ZV(Context context, String str, String str2, String str3, Integer num, String str4, String str5, int i, C73030SlO c73030SlO) {
        int i2;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        Bundle LIZJ = AnonymousClass036.LIZJ("roomId", str, "videoUrl", str2);
        LIZJ.putString("downloadUrl", str3);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        LIZJ.putInt("downloadStatus", i2);
        if (str4 == null) {
            str4 = "";
        }
        LIZJ.putString("enterFromPage", str4);
        if (str5 == null) {
            str5 = "";
        }
        LIZJ.putString("enterFrom", str5);
        LIZJ.putInt("videoLength", i);
        LIZJ.putBoolean("isAutoPlay", false);
        LIZJ.putInt("position", 0);
        LIZJ.putBoolean("isMute", false);
        LIZJ.putBoolean("isPause", false);
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = new LiveReplayVideoPlayerDialogFragment();
        liveReplayVideoPlayerDialogFragment.LJZI = c73030SlO;
        liveReplayVideoPlayerDialogFragment.setArguments(LIZJ);
        liveReplayVideoPlayerDialogFragment.setCancelable(false);
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            liveReplayVideoPlayerDialogFragment.show(supportFragmentManager, "common_video_player");
        }
    }
}
