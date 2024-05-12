package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221238mF extends AbstractC65781Prl implements InterfaceC88473Ynt<VideoExposeSharerInformationAssem, String, UrlModel, C76800UCe> {
    public static final C221238mF INSTANCE = new C221238mF();

    public C221238mF() {
        super(3);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VideoExposeSharerInformationAssem selectSubscribe, String callerId, UrlModel urlModel) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(callerId, "callerId");
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LIZIZ(callerId);
        LJII.LJJIJIIJIL = true;
        LJII.LJJIIJ = (SmartImageView) selectSubscribe.Y3().findViewById(R.id.jvp);
        C16880lQ.LLJJJ(LJII);
        if (C221518mh.LIZ()) {
            C105784De quick_reply_header = (C105784De) selectSubscribe.Y3().findViewById(R.id.il6);
            ImageUrlModel LJ = C78939UyV.LJ(urlModel);
            o.LJIIIIZZ(quick_reply_header, "quick_reply_header");
            C105784De.LIZIZ(quick_reply_header, LJ, callerId, 52);
        }
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, String str, UrlModel urlModel) {
        invoke2(videoExposeSharerInformationAssem, str, urlModel);
        return C76800UCe.LIZ;
    }
}
