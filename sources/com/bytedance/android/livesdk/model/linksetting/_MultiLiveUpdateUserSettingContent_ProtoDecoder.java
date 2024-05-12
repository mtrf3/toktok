package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _MultiLiveUpdateUserSettingContent_ProtoDecoder implements InterfaceC31105CIr<MultiLiveUpdateUserSettingContent> {
    public static MultiLiveUpdateUserSettingContent LIZIZ(Q9H q9h) {
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent = new MultiLiveUpdateUserSettingContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveUpdateUserSettingContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveUpdateUserSettingContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
