package X;

import Y.AfS2S1102000_7;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.api.ValidInfo;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.api.VideoRelatedInfo;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GSo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41554GSo {
    public static final /* synthetic */ int LIZ = 0;

    public static SY9 LIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_play_circle;
        SY9 LIZ2 = c2068389v.LIZ(ctx);
        LIZ2.setBounds(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
        return LIZ2;
    }

    public static int LIZIZ(List list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AVTextExtraStruct) it.next()).type == 5) {
                i++;
            }
        }
        return i;
    }

    public static final boolean LIZLLL(String str) {
        if (str != null && str.length() != 0 && str.length() >= 23 && str.length() <= Q7K.LIZIZ("add_video_by_paste_url_max_length", LiveNetAdaptiveHurryTimeSetting.DEFAULT) && ujb.o.LJJJLIIL(str, "https://", false) && s.LJJJLZIJ(str, "tiktok", false)) {
            return true;
        }
        return false;
    }

    public static void LJ(GSR editText, C41555GSp c41555GSp) {
        String toastContent;
        o.LJIIIZ(editText, "editText");
        if (c41555GSp.getRequestResult().getStatusCode() == 104 || c41555GSp.getRequestResult().getValidInfo() == null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            String string = C60903NvH.LJ.getString(R.string.s2u);
            o.LJIIIIZZ(string, "getApplication().getStri…ideo_toast_network_error)");
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIJ(editText, 2023, creativeToastBuilder);
            return;
        }
        if (c41555GSp.getRequestResult().getStatusCode() == 0 && c41555GSp.getRequestResult().getVideoInfo() != null) {
            ValidInfo validInfo = c41555GSp.getRequestResult().getValidInfo();
            o.LJI(validInfo);
            if (validInfo.getAttachable()) {
                ValidInfo validInfo2 = c41555GSp.getRequestResult().getValidInfo();
                o.LJI(validInfo2);
                if (!validInfo2.getAttachable()) {
                    return;
                }
                VideoRelatedInfo videoInfo = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo);
                String uniqueId = videoInfo.getUniqueId();
                VideoRelatedInfo videoInfo2 = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo2);
                String authorNickName = videoInfo2.getAuthorNickName();
                VideoRelatedInfo videoInfo3 = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo3);
                String valueOf = String.valueOf(videoInfo3.getAuthorId());
                VideoRelatedInfo videoInfo4 = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo4);
                String authorSecUid = videoInfo4.getAuthorSecUid();
                VideoRelatedInfo videoInfo5 = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo5);
                String valueOf2 = String.valueOf(videoInfo5.getAwemeId());
                VideoRelatedInfo videoInfo6 = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo6);
                int videoStatus = videoInfo6.getVideoStatus();
                VideoRelatedInfo videoInfo7 = c41555GSp.getRequestResult().getVideoInfo();
                o.LJI(videoInfo7);
                GSX gsx = new GSX(uniqueId, authorNickName, valueOf, authorSecUid, valueOf2, videoStatus, videoInfo7.isPrivateAccount(), c41555GSp.getSubType(), c41555GSp.getEnterMethod());
                ValidInfo validInfo3 = c41555GSp.getRequestResult().getValidInfo();
                o.LJI(validInfo3);
                String toastContent2 = validInfo3.getToastContent();
                if (toastContent2 == null) {
                    toastContent2 = "";
                }
                editText.LJIIIZ(gsx, toastContent2);
                return;
            }
        }
        ValidInfo validInfo4 = c41555GSp.getRequestResult().getValidInfo();
        if (validInfo4 == null || (toastContent = validInfo4.getToastContent()) == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
        creativeToastBuilder2.message(toastContent);
        C78915Uy7.LJJIJ(editText, 2023, creativeToastBuilder2);
    }

    public static void LIZJ(int i, int i2, GSU gsu, String url) {
        o.LJIIIZ(url, "url");
        AbstractC73638SvC<VideoInfoFromURLResponse> videoInfoByURLV2 = C41556GSq.LIZ.getVideoInfoByURLV2(url);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC73471SsV interfaceC73471SsV = C42245Gi1.LJLIL;
        videoInfoByURLV2.getClass();
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        new C73500Ssy(videoInfoByURLV2, 10L, timeUnit, abstractC73946T0k, interfaceC73471SsV).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS2S1102000_7(i, i2, gsu, url, 0), new AfS2S1102000_7(i, i2, gsu, url, 1));
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2) {
        String str2;
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("enter_from", "video_post_page");
        LIZ2.LJI("shoot_way", videoPublishEditModel.mShootWay);
        LIZ2.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LIZ2.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        if (str == null) {
            str = "";
        }
        LIZ2.LJI("enter_method", str);
        LIZ2.LIZ(i2, "author_is_private");
        if (i != 1) {
            if (i != 2) {
                if (i != 140) {
                    if (i != 143) {
                        if (i != 144) {
                            str2 = "public";
                            LIZ2.LJI("privacy_status", str2);
                            LIZ2.LIZ(1, "is_credit");
                            FMX.LJIIL("add_quote_video_finish", LIZ2.LIZ);
                        }
                    }
                }
            }
            str2 = "friendVisible";
            LIZ2.LJI("privacy_status", str2);
            LIZ2.LIZ(1, "is_credit");
            FMX.LJIIL("add_quote_video_finish", LIZ2.LIZ);
        }
        str2 = "private";
        LIZ2.LJI("privacy_status", str2);
        LIZ2.LIZ(1, "is_credit");
        FMX.LJIIL("add_quote_video_finish", LIZ2.LIZ);
    }
}
