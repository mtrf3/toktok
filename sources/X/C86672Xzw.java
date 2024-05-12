package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86672Xzw extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, C43I<? extends C90U>, C76800UCe> {
    public static final C86672Xzw LJLIL = new C86672Xzw();

    public C86672Xzw() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, C43I<? extends C90U> c43i) {
        Aweme aweme;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        String str;
        VideoItemParams gv0;
        Aweme aweme2;
        String str2;
        Aweme aweme3;
        Aweme aweme4;
        CaptionItemModel LJIIIIZZ;
        String str3;
        String mv0;
        Aweme aweme5;
        String str4;
        String str5;
        String str6;
        Aweme aweme6;
        Aweme aweme7;
        boolean z;
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        C43I<? extends C90U> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            VideoCLACaptionViewModel r4 = selectSubscribe.r4();
            C90U params = (C90U) c43i2.LIZ;
            r4.getClass();
            o.LJIIIZ(params, "params");
            if (r4.wv0()) {
                Integer num = null;
                if (!r4.LLF && (z = params.LIZJ)) {
                    r4.LLF = z;
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = r4.LLII;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                        r4.LLII = null;
                    }
                }
                String str7 = "";
                if (r4.LJLLI != -1 && !r4.LJZ) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - r4.LJLLI;
                    r4.LJLLI = -1L;
                    int i = !r4.LJLLILLLL ? 1 : 0;
                    VideoItemParams gv02 = r4.gv0();
                    if (gv02 == null || (str4 = gv02.mEventType) == null) {
                        str4 = "";
                    }
                    VideoItemParams gv03 = r4.gv0();
                    if (gv03 == null || (aweme7 = gv03.getAweme()) == null || (str5 = aweme7.getAid()) == null) {
                        str5 = "";
                    }
                    VideoItemParams gv04 = r4.gv0();
                    if (gv04 == null || (aweme6 = gv04.getAweme()) == null || (str6 = aweme6.getAuthorUid()) == null) {
                        str6 = "";
                    }
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", str4);
                    c188727au.LIZLLL(i, "is_transl");
                    c188727au.LJIIIZ("group_id", str5);
                    c188727au.LJIIIZ("author_id", str6);
                    c188727au.LJ(elapsedRealtime, "duration");
                    FMX.LJIIL("cla_caption_first_visible_time", c188727au.LIZ);
                }
                VideoItemParams gv05 = r4.gv0();
                if (gv05 != null && (aweme = gv05.getAweme()) != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (captionList = captionModel.getCaptionList()) != null && !captionList.isEmpty()) {
                    String str8 = params.LIZ;
                    VideoItemParams gv06 = r4.gv0();
                    if (gv06 != null && (aweme5 = gv06.getAweme()) != null) {
                        str = aweme5.getAid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, str8)) {
                        if (!r4.LJZ || (((str3 = params.LIZLLL) != null && str3.length() != 0) || ((mv0 = r4.mv0()) != null && mv0.length() != 0))) {
                            r4.LJZ = true;
                            if (!SQS.LIZ.getBoolean("has_tap_translated_caption", false) && (gv0 = r4.gv0()) != null && (aweme2 = gv0.getAweme()) != null && aweme2.getAuthorUid() != null) {
                                VideoItemParams gv07 = r4.gv0();
                                if (gv07 != null && (aweme3 = gv07.getAweme()) != null) {
                                    str2 = aweme3.getAuthorUid();
                                } else {
                                    str2 = null;
                                }
                                o.LJ(str2, ((RBX) HG3.LJIILL()).getCurUserId());
                            }
                            String str9 = params.LIZLLL;
                            Integer num2 = params.LJ;
                            VideoItemParams gv08 = r4.gv0();
                            if (gv08 != null && (aweme4 = gv08.getAweme()) != null && (LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme4)) != null) {
                                num = Integer.valueOf(LJIIIIZZ.getSubId());
                            }
                            r4.LJLJLLL = new IQV(str9, num2, o.LJ(num2, num), r4.LLFFF);
                            ICLAPerfETService LIZ = C46290IEs.LIZ();
                            String str10 = params.LIZLLL;
                            if (str10 != null) {
                                str7 = str10;
                            }
                            LIZ.LIZ(str7);
                            if (!r4.LJLLLL) {
                                r4.setState(C69597RTd.LJLIL);
                            }
                        }
                    }
                }
                ((Y18) r4.LLFZ.getValue()).LIZ();
            }
        }
        return C76800UCe.LIZ;
    }
}
