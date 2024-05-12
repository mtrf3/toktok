package com.ss.android.ugc.aweme.notification.utils;

import X.C10K;
import X.C26045AKb;
import X.C42375Gk7;
import X.C45804HyK;
import X.E4Q;
import X.EF7;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.ProgressDialogC43241Gy5;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShareFromWebHelper {
    public static final VideoInfoApi LIZ;

    /* loaded from: classes8.dex */
    public interface VideoInfoApi {
        @E4Q("/tiktok/v1/tt4d/share/video/info/")
        C10K<ShareVideoInfoResponse> getVideoInfo(@InterfaceC64989Pez("video_id") String str);
    }

    /* loaded from: classes8.dex */
    public static final class ShareVideoInfo {

        @InterfaceC65349Pkn("cdn_url")
        public final String cdnUrl;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShareVideoInfo) && o.LJ(this.cdnUrl, ((ShareVideoInfo) obj).cdnUrl);
        }

        public final int hashCode() {
            return this.cdnUrl.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShareVideoInfo(cdnUrl=");
            return q.LIZIZ(LIZ, this.cdnUrl, ')', LIZ);
        }

        public ShareVideoInfo(String cdnUrl) {
            o.LJIIIZ(cdnUrl, "cdnUrl");
            this.cdnUrl = cdnUrl;
        }
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZ = (VideoInfoApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(X1D.LIZIZ(LIZ2)).create(VideoInfoApi.class);
    }

    public static void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        o.LJI(LJIJJ);
        C26045AKb c26045AKb = new C26045AKb(LJIJJ);
        c26045AKb.LJIIIZ(context.getResources().getString(R.string.r4l));
        c26045AKb.LJIIJ();
    }

    /* loaded from: classes8.dex */
    public static final class ShareVideoInfoResponse {

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("video_info")
        public final ShareVideoInfo videoInfo;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareVideoInfoResponse)) {
                return false;
            }
            ShareVideoInfoResponse shareVideoInfoResponse = (ShareVideoInfoResponse) obj;
            return this.statusCode == shareVideoInfoResponse.statusCode && o.LJ(this.videoInfo, shareVideoInfoResponse.videoInfo);
        }

        public final int hashCode() {
            return this.videoInfo.hashCode() + (this.statusCode * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShareVideoInfoResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", videoInfo=");
            LIZ.append(this.videoInfo);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public ShareVideoInfoResponse(int i, ShareVideoInfo videoInfo) {
            o.LJIIIZ(videoInfo, "videoInfo");
            this.statusCode = i;
            this.videoInfo = videoInfo;
        }
    }

    public static void LIZIZ(Context context, String str) {
        Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(schema)");
        String queryParameter = UriProtector.getQueryParameter(parse, "video_id");
        String queryParameter2 = UriProtector.getQueryParameter(parse, "client_name");
        String queryParameter3 = UriProtector.getQueryParameter(parse, "share_id");
        String queryParameter4 = UriProtector.getQueryParameter(parse, "shoot_way");
        if (queryParameter4 == null) {
            queryParameter4 = "share_video_web";
        }
        String queryParameter5 = UriProtector.getQueryParameter(parse, "client_key");
        if (context != null) {
            ProgressDialogC43241Gy5 LIZIZ = ProgressDialogC43241Gy5.LIZIZ(context, context.getResources().getString(R.string.kfq));
            LIZIZ.setIndeterminate(true);
            LIZIZ.setProgress(0);
            LIZ.getVideoInfo(queryParameter).LJ(new C42375Gk7(queryParameter, LIZIZ, context, queryParameter4, queryParameter3, queryParameter5, queryParameter2), C10K.LJIIIIZZ, null);
        }
    }
}
