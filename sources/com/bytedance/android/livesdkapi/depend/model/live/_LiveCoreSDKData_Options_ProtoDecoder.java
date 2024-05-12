package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _LiveCoreSDKData_Options_ProtoDecoder implements InterfaceC31105CIr<LiveCoreSDKData.Options> {
    public static LiveCoreSDKData.Options LIZIZ(Q9H q9h) {
        LiveCoreSDKData.Options options = new LiveCoreSDKData.Options();
        options.qualityList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                options.showQualityButton = Q9J.LIZ(q9h);
                            }
                        } else {
                            options.defaultPreviewQuality = _LiveCoreSDKData_Quality_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        options.qualityList.add(_LiveCoreSDKData_Quality_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    options.defaultQuality = _LiveCoreSDKData_Quality_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return options;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveCoreSDKData.Options LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
