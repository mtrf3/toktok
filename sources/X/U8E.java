package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* loaded from: classes14.dex */
public final class U8E implements UA0 {
    @Override // X.UA0
    public final OSZ<Integer, Throwable> LIZ(BizJoinGroupResponse bizJoinGroupResponse) {
        BizJoinGroupResponse.ResponseData responseData;
        BizJoinGroupResponse.ResponseData responseData2;
        PerceptionMessage perceptionMessage;
        if (bizJoinGroupResponse != null && (responseData = bizJoinGroupResponse.data) != null && responseData.perceptionStatus == 1 && (responseData2 = bizJoinGroupResponse.data) != null && (perceptionMessage = responseData2.perceptionMessage) != null) {
            return new OSZ<>(2, new MultiCoHostViolationException(perceptionMessage));
        }
        return new OSZ<>(1, null);
    }
}
