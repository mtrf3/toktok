package com.ss.android.ugc.aweme.profile.edit.api;

import X.C16880lQ;
import X.C76L;
import X.C770830u;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.content.Context;
import android.util.Log;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.android.gms.common.GoogleApiAvailability;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class YoutubeApi {
    public static final ServerApi LIZ;

    /* loaded from: classes12.dex */
    public interface ServerApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/youtube/bind/")
        C76L<YouTubeResponse> link(@InterfaceC64987Pex("yt_raw_token") String str, @InterfaceC64987Pex("google_account") String str2, @InterfaceC64987Pex("youtube_channel_id") String str3, @InterfaceC64987Pex("youtube_channel_title") String str4, @InterfaceC64987Pex("user_agent") String str5, @InterfaceC64987Pex("token_type") String str6, @InterfaceC64987Pex("access_token") String str7);

        @E4Q("/aweme/v1/youtube/unbind/")
        C76L<YouTubeResponse> unlink();
    }

    /* loaded from: classes12.dex */
    public static final class YouTubeResponse {

        @InterfaceC65349Pkn("error_msg")
        public final String errorMessage;

        @InterfaceC65349Pkn("fail_reason")
        public final YouTubeErrorStruct errorStruct;

        @InterfaceC65349Pkn("status_code")
        public final Integer statusCode;

        @InterfaceC65349Pkn("bind_info")
        public final YoutubeChannelStruct youtubeData;

        /* JADX WARN: Multi-variable type inference failed */
        public YouTubeResponse() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YouTubeResponse)) {
                return false;
            }
            YouTubeResponse youTubeResponse = (YouTubeResponse) obj;
            return o.LJ(this.statusCode, youTubeResponse.statusCode) && o.LJ(this.errorMessage, youTubeResponse.errorMessage) && o.LJ(this.errorStruct, youTubeResponse.errorStruct) && o.LJ(this.youtubeData, youTubeResponse.youtubeData);
        }

        public final int hashCode() {
            Integer num = this.statusCode;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            YouTubeErrorStruct youTubeErrorStruct = this.errorStruct;
            int hashCode3 = (hashCode2 + (youTubeErrorStruct == null ? 0 : youTubeErrorStruct.hashCode())) * 31;
            YoutubeChannelStruct youtubeChannelStruct = this.youtubeData;
            return hashCode3 + (youtubeChannelStruct != null ? youtubeChannelStruct.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("YouTubeResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", errorMessage=");
            LIZ.append(this.errorMessage);
            LIZ.append(", errorStruct=");
            LIZ.append(this.errorStruct);
            LIZ.append(", youtubeData=");
            LIZ.append(this.youtubeData);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        /* loaded from: classes2.dex */
        public static final class YouTubeErrorStruct {

            @InterfaceC65349Pkn("code")
            public final Integer code;

            @InterfaceC65349Pkn("message")
            public final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public YouTubeErrorStruct() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof YouTubeErrorStruct)) {
                    return false;
                }
                YouTubeErrorStruct youTubeErrorStruct = (YouTubeErrorStruct) obj;
                return o.LJ(this.code, youTubeErrorStruct.code) && o.LJ(this.message, youTubeErrorStruct.message);
            }

            public final int hashCode() {
                Integer num = this.code;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.message;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("YouTubeErrorStruct(code=");
                LIZ.append(this.code);
                LIZ.append(", message=");
                return q.LIZIZ(LIZ, this.message, ')', LIZ);
            }

            public YouTubeErrorStruct(Integer num, String str) {
                this.code = num;
                this.message = str;
            }

            public /* synthetic */ YouTubeErrorStruct(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str);
            }
        }

        /* loaded from: classes12.dex */
        public static final class YoutubeChannelStruct {

            @InterfaceC65349Pkn("channel_id")
            public final String channelId;

            @InterfaceC65349Pkn("channel_title")
            public final String channelTitle;

            @InterfaceC65349Pkn("google_account")
            public final String googleAccount;

            /* JADX WARN: Multi-variable type inference failed */
            public YoutubeChannelStruct() {
                this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof YoutubeChannelStruct)) {
                    return false;
                }
                YoutubeChannelStruct youtubeChannelStruct = (YoutubeChannelStruct) obj;
                return o.LJ(this.googleAccount, youtubeChannelStruct.googleAccount) && o.LJ(this.channelId, youtubeChannelStruct.channelId) && o.LJ(this.channelTitle, youtubeChannelStruct.channelTitle);
            }

            public final int hashCode() {
                String str = this.googleAccount;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.channelId;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.channelTitle;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("YoutubeChannelStruct(googleAccount=");
                LIZ.append(this.googleAccount);
                LIZ.append(", channelId=");
                LIZ.append(this.channelId);
                LIZ.append(", channelTitle=");
                return q.LIZIZ(LIZ, this.channelTitle, ')', LIZ);
            }

            public YoutubeChannelStruct(String str, String str2, String str3) {
                this.googleAccount = str;
                this.channelId = str2;
                this.channelTitle = str3;
            }

            public /* synthetic */ YoutubeChannelStruct(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }
        }

        public YouTubeResponse(Integer num, String str, YouTubeErrorStruct youTubeErrorStruct, YoutubeChannelStruct youtubeChannelStruct) {
            this.statusCode = num;
            this.errorMessage = str;
            this.errorStruct = youTubeErrorStruct;
            this.youtubeData = youtubeChannelStruct;
        }

        public /* synthetic */ YouTubeResponse(Integer num, String str, YouTubeErrorStruct youTubeErrorStruct, YoutubeChannelStruct youtubeChannelStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : youTubeErrorStruct, (i & 8) != 0 ? null : youtubeChannelStruct);
        }
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (ServerApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ServerApi.class);
    }

    public static String LIZ(Context context, Exception exc, Integer num, YouTubeResponse youTubeResponse) {
        String stackTraceString;
        int i;
        Integer num2;
        String str;
        Integer num3;
        YouTubeResponse.YouTubeErrorStruct youTubeErrorStruct;
        YouTubeResponse.YouTubeErrorStruct youTubeErrorStruct2;
        StringBuilder LIZ2 = X1D.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Exception: ");
        if (exc == null || (stackTraceString = exc.getMessage()) == null) {
            stackTraceString = Log.getStackTraceString(exc);
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(exception)");
        }
        LIZ3.append(stackTraceString);
        LIZ2.append(X1D.LIZIZ(LIZ3));
        LIZ2.append(", gms_code: ");
        try {
            i = C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), context);
        } catch (Exception unused) {
            i = 1;
        }
        LIZ2.append(i);
        LIZ2.append(", oauth_code: ");
        LIZ2.append(num);
        LIZ2.append(", resp_code: ");
        String str2 = null;
        if (youTubeResponse != null) {
            num2 = youTubeResponse.statusCode;
        } else {
            num2 = null;
        }
        LIZ2.append(num2);
        LIZ2.append(", resp_msg: ");
        if (youTubeResponse != null) {
            str = youTubeResponse.errorMessage;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(", yt_code: ");
        if (youTubeResponse != null && (youTubeErrorStruct2 = youTubeResponse.errorStruct) != null) {
            num3 = youTubeErrorStruct2.code;
        } else {
            num3 = null;
        }
        LIZ2.append(num3);
        LIZ2.append(", yt_msg: ");
        if (youTubeResponse != null && (youTubeErrorStruct = youTubeResponse.errorStruct) != null) {
            str2 = youTubeErrorStruct.message;
        }
        LIZ2.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …)\n            .toString()");
        return LIZIZ;
    }
}
