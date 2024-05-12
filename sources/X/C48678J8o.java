package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.J8o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48678J8o extends AbstractC65781Prl implements InterfaceC88472Yns<String, Video> {
    public static final C48678J8o LJLIL = new C48678J8o();

    public C48678J8o() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Video invoke(String str) {
        String url = str;
        o.LJIIIZ(url, "url");
        Video video = new Video();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setCodecType(0);
        videoUrlModel.setUrlList(C47261Igj.LJJIJ(url));
        videoUrlModel.setUri(url);
        videoUrlModel.setUrlKey(url);
        videoUrlModel.setSourceId(url);
        video.setPlayAddr(videoUrlModel);
        video.setSourceId(url);
        return video;
    }
}
