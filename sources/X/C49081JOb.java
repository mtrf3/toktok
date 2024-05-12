package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.JOb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49081JOb extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchCLASubtitleAssem, C43I<? extends View>, C76800UCe> {
    public static final C49081JOb LJLIL = new C49081JOb();

    public C49081JOb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchCLASubtitleAssem searchCLASubtitleAssem, C43I<? extends View> c43i) {
        String str;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        Video video;
        CaptionModel captionModel;
        Aweme aweme3;
        Video video2;
        CaptionModel captionModel2;
        Aweme aweme4;
        SearchCLASubtitleAssem selectSubscribe = searchCLASubtitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.LLFFF != null) {
            JJR jjr = selectSubscribe.LLFF;
            if (jjr != null) {
                if (jjr.getVisibility() == 0) {
                    JJR jjr2 = selectSubscribe.LLFF;
                    if (jjr2 != null) {
                        if (jjr2.getState() == EnumC48742JBa.SHOW) {
                            String str2 = "";
                            if (!selectSubscribe.a4().LJLILLLLZI || C50560Jsq.LIZLLL() || !TranslationKevaServiceImpl.LJIIL().LIZ() || (aweme4 = selectSubscribe.LLFFF) == null || (str = aweme4.getAid()) == null) {
                                str = "";
                            }
                            if ((selectSubscribe.a4().LJLILLLLZI || (aweme3 = selectSubscribe.LLFFF) == null || (video2 = aweme3.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || !o.LJ(captionModel2.getHideOriginalCaption(), Boolean.TRUE)) && ((TranslationKevaServiceImpl.LJIIL().LIZ() || (aweme2 = selectSubscribe.LLFFF) == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || !o.LJ(captionModel.getHideOriginalCaption(), Boolean.TRUE)) && (aweme = selectSubscribe.LLFFF) != null && (aid = aweme.getAid()) != null)) {
                                str2 = aid;
                            }
                            C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
                            java.util.Map LJJL = C113554cx.LJJL(new OSZ("isFormSearchSubtitleVideo", str2), new OSZ("isFormSearchTranslationVideo", str));
                            c50654JuM.getClass();
                            C50654JuM.LIZJ(LJJL, true);
                        }
                    } else {
                        o.LJIJI("subtitleView");
                        throw null;
                    }
                }
                selectSubscribe.c4();
            } else {
                o.LJIJI("subtitleView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
