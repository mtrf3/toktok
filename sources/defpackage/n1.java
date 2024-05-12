package defpackage;

import X.C224578rd;
import X.H7B;
import X.InterfaceC42527GmZ;
import X.OSZ;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishStatus;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class n1 implements InterfaceC42527GmZ {
    public final /* synthetic */ PublishPreviewViewModel LIZ;

    public n1(PublishPreviewViewModel publishPreviewViewModel) {
        this.LIZ = publishPreviewViewModel;
    }

    @Override // X.InterfaceC42527GmZ
    public final void LIZ(String scheduleId, C224578rd data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
        this.LIZ.jv0(new OSZ(scheduleId, data), "PUBLISH_VIDEO_START");
        H7B.LIZ("publish_preview_view_model -> onStart");
    }

    @Override // X.InterfaceC42527GmZ
    public final void LIZIZ(String scheduleId, C224578rd data) {
        Integer num;
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
        PublishPreviewViewModel publishPreviewViewModel = this.LIZ;
        PublishPreviewInfo previewData = data.LJLJI.getPreviewData();
        if (previewData != null) {
            num = Integer.valueOf(previewData.getProgress());
        } else {
            num = null;
        }
        publishPreviewViewModel.jv0(new OSZ(scheduleId, num), "PUBLISH_VIDEO_PROGRESS");
    }

    @Override // X.InterfaceC42527GmZ
    public final void LIZJ(String scheduleId, C224578rd data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
        H7B.LIZ("publish_preview_view_model -> onLocalVideoReady");
        this.LIZ.jv0(new OSZ(scheduleId, data), "PUBLISH_VIDEO_COMPILE_DONE");
    }

    @Override // X.InterfaceC42527GmZ
    public final void LIZLLL(String scheduleId, C224578rd data) {
        PublishStatus publishStatus;
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
        H7B.LIZ("publish_preview_view_model -> onFinish");
        PublishPreviewInfo previewData = data.LJLJI.getPreviewData();
        PublishStatus publishStatus2 = null;
        if (previewData != null) {
            publishStatus = previewData.getPublishStatus();
        } else {
            publishStatus = null;
        }
        if (publishStatus == PublishStatus.SUCCESS) {
            this.LIZ.jv0(new OSZ(scheduleId, data), "PUBLISH_VIDEO_SUCCESS");
            return;
        }
        PublishPreviewInfo previewData2 = data.LJLJI.getPreviewData();
        if (previewData2 != null) {
            publishStatus2 = previewData2.getPublishStatus();
        }
        if (publishStatus2 != PublishStatus.FAILED) {
            return;
        }
        this.LIZ.jv0(new OSZ(scheduleId, data.LJLILLLLZI), "PUBLISH_VIDEO_FAIL");
    }
}
