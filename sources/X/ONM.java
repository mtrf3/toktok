package X;

import Y.IDCSpanS30S0100000_4;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.ForceVideo;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class ONM {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static String LIZ(Option[] optionArr) {
        String str;
        Option option;
        Question[] questions;
        Question question;
        Option[] options;
        if (optionArr != null && (option = optionArr[0]) != null && (questions = option.getQuestions()) != null && (question = questions[0]) != null && (options = question.getOptions()) != null) {
            str = ORY.LJJJJLL(options, ",", null, null, ON5.LJLIL, 30);
        } else {
            str = null;
        }
        return String.valueOf(str);
    }

    public static final Aweme LIZIZ(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        String[] urlList;
        Aweme m114clone = aweme.m114clone();
        o.LJIIIIZZ(m114clone, "aweme.clone()");
        String aid = aweme.getAid();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(aid);
        LIZ2.append("_sub");
        m114clone.setAid(X1D.LIZIZ(LIZ2));
        m114clone.setGroupId(m114clone.getAid());
        m114clone.setIsSubAweme(true);
        boolean isLive = aweme.isLive();
        if (isLive) {
            m114clone.setAwemeType(0);
            m114clone.buildUniqueId();
            m114clone.setLiveType("live_sub_aweme_type");
        }
        if (aweme.isPhotoMode()) {
            m114clone.setAwemeType(0);
            m114clone.buildUniqueId();
            m114clone.setExtra("photo_sub_aweme_type");
        }
        Video video = new Video();
        FeedSurvey LIZJ = OMU.LIZJ(aweme);
        if (LIZJ != null) {
            ForceVideo forceVideo = LIZJ.getForceVideo();
            if (forceVideo != null) {
                video.setRatio("720p");
                video.setHeight(1280);
                video.setWidth(720);
                m114clone.setVideo(video);
                String[] urlList2 = forceVideo.getUrlList();
                if (urlList2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : urlList2) {
                        arrayList.add(str);
                    }
                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                    videoUrlModel.setUrlList(arrayList);
                    videoUrlModel.setHeight(1280);
                    videoUrlModel.setWidth(720);
                    m114clone.getVideo().setPlayAddr(videoUrlModel);
                    m114clone.getVideo().setDownloadAddr(videoUrlModel);
                }
            }
            ForceVideo videoCover = LIZJ.getVideoCover();
            if (videoCover != null && (urlList = videoCover.getUrlList()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : urlList) {
                    arrayList2.add(str2);
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(arrayList2);
                urlModel.setUri(videoCover.getUri());
                urlModel.setHeight(1280);
                urlModel.setWidth(720);
                video.setCover(urlModel);
                video.setOriginCover(urlModel);
            }
        }
        UrlModel urlModel2 = null;
        if (isLive) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                urlModel2 = newLiveRoomData.roomCover;
            }
            m114clone.setSubAwemeCover(urlModel2);
        } else {
            Video video2 = aweme.getVideo();
            if (video2 != null) {
                urlModel2 = video2.getCover();
            }
            m114clone.setSubAwemeCover(urlModel2);
        }
        aweme.setSubAweme(m114clone);
        return m114clone;
    }

    public static final String LIZLLL(String str) {
        if (str != null) {
            try {
                if (!ujb.o.LJJJJ(str, "_sub", false)) {
                    return str;
                }
                return (String) ListProtector.get(s.LJLJJL(str, new String[]{"_sub"}, 0, 6), 0);
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static boolean LJ(Question question) {
        Option[] options;
        Option option;
        Question[] questions;
        Question[] questions2;
        Question question2;
        Option[] options2;
        if (question == null || (options = question.getOptions()) == null || (option = options[0]) == null || (questions = option.getQuestions()) == null || questions.length <= 0 || (questions2 = option.getQuestions()) == null || (question2 = questions2[0]) == null || (options2 = question2.getOptions()) == null || options2.length <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(FeedSurvey feedSurvey) {
        Question[] questions;
        Question[] questions2;
        Question question;
        if (feedSurvey == null || (questions = feedSurvey.getQuestions()) == null || questions.length <= 0 || feedSurvey == null || (questions2 = feedSurvey.getQuestions()) == null || (question = questions2[0]) == null) {
            return false;
        }
        return TextUtils.isEmpty(question.getTitle());
    }

    public static final boolean LJI(Aweme aweme) {
        if (aweme != null) {
            return aweme.getIsSubAweme();
        }
        return false;
    }

    public static final SpannableStringBuilder LIZJ(Context context, String privacyText, int i, String privacyKey) {
        boolean z;
        String str;
        o.LJIIIZ(privacyText, "privacyText");
        o.LJIIIZ(privacyKey, "privacyKey");
        if (context == null || TextUtils.isEmpty(privacyText)) {
            return null;
        }
        int length = privacyText.length();
        int i2 = 0;
        if (!TextUtils.isEmpty(privacyKey) && s.LJJJLZIJ(privacyText, "%s", false)) {
            z = true;
            str = ujb.o.LJJJJZ(privacyText, "%s", privacyKey, false);
            i2 = s.LJJLIIIJL(str, privacyKey, 0, false, 6);
            length = privacyKey.length() + i2;
            if (i2 < 0) {
                return null;
            }
        } else {
            z = false;
            str = "";
        }
        if (i2 >= str.length() || length < 0 || length > str.length()) {
            return null;
        }
        IDCSpanS30S0100000_4 iDCSpanS30S0100000_4 = new IDCSpanS30S0100000_4(context, 4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), i2, length, 33);
        }
        spannableStringBuilder.setSpan(iDCSpanS30S0100000_4, i2, length, 33);
        return spannableStringBuilder;
    }

    public static final void LJII(Aweme aweme, Context context, FeedSurvey feedSurvey, OML surveyType) {
        o.LJIIIZ(surveyType, "surveyType");
        if (context != null) {
            ONQ onq = new ONQ(context, feedSurvey, aweme);
            onq.setOnDismissListener(DialogInterfaceOnDismissListenerC59049NFl.LJLIL);
            onq.LLD = surveyType;
            if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/feed/survey/FeedSurveyBottomDialog", "show", onq, new Object[0], "void", new C65300Pk0(false, "()V", "-4415021939847538258")).LIZ) {
                return;
            }
            onq.show();
        }
    }
}
