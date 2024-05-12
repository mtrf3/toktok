package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishStatus;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GmX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42525GmX implements IAVInfoService.IGetInfoCallback<int[]> {
    public final /* synthetic */ PublishModel LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C224578rd c224578rd;
        C224578rd c224578rd2;
        String str;
        String str2;
        int[] iArr2 = iArr;
        Video video = new Video();
        String str3 = this.LIZIZ;
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
        videoUrlModel.setUri(str3);
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
        ArrayList<C224578rd> arrayList = C42524GmW.LIZLLL;
        PublishModel publishModel = this.LIZ;
        Iterator<C224578rd> it = arrayList.iterator();
        while (true) {
            c224578rd = null;
            if (it.hasNext()) {
                c224578rd2 = it.next();
                String str4 = c224578rd2.LJLIL.creationId;
                if (publishModel != null) {
                    str2 = publishModel.creationId;
                } else {
                    str2 = null;
                }
                if (o.LJ(str4, str2)) {
                    break;
                }
            } else {
                c224578rd2 = null;
                break;
            }
        }
        C224578rd c224578rd3 = c224578rd2;
        if (c224578rd3 != null) {
            c224578rd3.LJLJI.setVideo(video);
            c224578rd3.LJLJI.setAid(c224578rd3.LJLJI.getAid() + System.currentTimeMillis());
            PublishPreviewInfo previewData = c224578rd3.LJLJI.getPreviewData();
            if (previewData != null) {
                previewData.setInPublishing(true);
                previewData.setPublishStatus(PublishStatus.UPLOADING);
                previewData.setProgress(60);
            }
            c224578rd = c224578rd3;
        }
        C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
        PublishModel publishModel2 = this.LIZ;
        if (publishModel2 == null || (str = publishModel2.creationId) == null) {
            str = "";
        }
        c55723Ltv.LJIILLIIL(video, str);
        PublishModel publishModel3 = this.LIZ;
        if (publishModel3 != null && c224578rd != null) {
            C42524GmW.LIZLLL(new AqS138S0200000_7(publishModel3, c224578rd, 49));
        }
    }

    public C42525GmX(PublishModel publishModel, String str) {
        this.LIZ = publishModel;
        this.LIZIZ = str;
    }
}
