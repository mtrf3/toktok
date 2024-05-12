package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.AqS30S1000000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HLq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43922HLq implements IAVInfoService.IGetInfoCallback<int[]> {
    public final /* synthetic */ PublishModel LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int[] iArr2 = iArr;
        Video video = new Video();
        String str2 = this.LIZIZ;
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        int i6 = 0;
        if (iArr2 != null) {
            i = iArr2[0];
        } else {
            i = 0;
        }
        videoUrlModel.setWidth(i);
        if (iArr2 != null) {
            i2 = iArr2[1];
        } else {
            i2 = 0;
        }
        videoUrlModel.setHeight(i2);
        if (iArr2 != null) {
            i3 = iArr2[10];
        } else {
            i3 = 0;
        }
        videoUrlModel.setDuration(i3);
        videoUrlModel.setUri(str2);
        videoUrlModel.setUrlList(C47261Igj.LJJIJ(videoUrlModel.getUri()));
        videoUrlModel.setUrlKey(videoUrlModel.getUri());
        video.setPlayAddr(videoUrlModel);
        if (iArr2 != null) {
            i4 = iArr2[0];
        } else {
            i4 = 0;
        }
        video.setWidth(i4);
        if (iArr2 != null) {
            i5 = iArr2[1];
        } else {
            i5 = 0;
        }
        video.setHeight(i5);
        if (iArr2 != null) {
            i6 = iArr2[10];
        }
        video.setDuration(i6);
        C43921HLp c43921HLp = C43921HLp.LIZ;
        PublishModel publishModel = this.LIZ;
        String str3 = null;
        if (publishModel != null) {
            str3 = publishModel.creationId;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c43921HLp.getClass();
        Aweme LJIIZILJ = C43921HLp.LJIIZILJ(str3);
        if (LJIIZILJ != null) {
            LJIIZILJ.setVideo(video);
            String scheduleId = LJIIZILJ.getScheduleId();
            o.LJIIIIZZ(scheduleId, "scheduleId");
            C43921HLp.LJIJJLI(new AqS30S1000000_7(scheduleId, 9));
        }
        PublishModel publishModel2 = this.LIZ;
        if (publishModel2 != null && (str = publishModel2.creationId) != null) {
            str4 = str;
        }
        HM1.LIZLLL(video, str4);
    }

    public C43922HLq(PublishModel publishModel, String str) {
        this.LIZ = publishModel;
        this.LIZIZ = str;
    }
}
