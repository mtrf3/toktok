package com.ss.android.ugc.aweme.shortvideo;

import X.C39579Fg7;
import X.C78886Uxe;
import X.InterfaceC65349Pkn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class CreateBaseAwemeResponse extends BaseResponse {

    @InterfaceC65349Pkn("creation_id")
    public String creationId;

    @InterfaceC65349Pkn("save_local_with_watermark")
    public boolean isSaveLocalWithWatermark;

    @InterfaceC65349Pkn("save_model")
    public AVUploadSaveModel mSaveModel;
    public transient String materialId;
    public int realVideoHeight;
    public int realVideoWidth;
    public ShoutOutsData shoutoutData;
    public List<String> videoCoverPaths = new ArrayList();
    public int shoutOutsType = 0;

    public String getVideoCoverPath() {
        if (C78886Uxe.LJJIJ(this.videoCoverPaths) || !C39579Fg7.LIZIZ((String) ListProtector.get(this.videoCoverPaths, 0))) {
            return null;
        }
        return (String) ListProtector.get(this.videoCoverPaths, 0);
    }

    public void setVideoCoverPath(String str) {
        List<String> list = this.videoCoverPaths;
        if (list == null) {
            this.videoCoverPaths = new ArrayList();
        } else {
            list.clear();
        }
        this.videoCoverPaths.add(str);
    }
}
