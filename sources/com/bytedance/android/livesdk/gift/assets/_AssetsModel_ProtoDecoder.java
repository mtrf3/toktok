package com.bytedance.android.livesdk.gift.assets;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LokiExtraContent_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _AssetsModel_ProtoDecoder implements InterfaceC31105CIr<AssetsModel> {
    public static AssetsModel LIZIZ(Q9H q9h) {
        AssetsModel assetsModel = new AssetsModel();
        assetsModel.videoResourceList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 26) {
                            switch (LJI) {
                                case 4:
                                    assetsModel.resourceModel = _ResourceModel_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                case 5:
                                    assetsModel.describe = Q9J.LIZIZ(q9h);
                                    break;
                                case 6:
                                    assetsModel.id = q9h.LJIIJJI();
                                    break;
                                case 7:
                                    assetsModel.resourceType = q9h.LJIIJ();
                                    break;
                                case 8:
                                    assetsModel.md5 = Q9J.LIZIZ(q9h);
                                    break;
                                case 9:
                                    assetsModel.size = q9h.LJIIJJI();
                                    break;
                                case 10:
                                    assetsModel.lokiExtraContent = _LokiExtraContent_ProtoDecoder.LIZIZ(q9h);
                                    break;
                                default:
                                    switch (LJI) {
                                        case 28:
                                            assetsModel.resourceByteVC1Model = _ResourceModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 29:
                                            assetsModel.bytevc1Md5 = Q9J.LIZIZ(q9h);
                                            break;
                                        case 30:
                                            assetsModel.videoResourceList.add(_VideoResource_ProtoDecoder.LIZIZ(q9h));
                                            break;
                                        case 31:
                                            assetsModel.faceRecognitionArchiveMeta = _FaceRecognitionMeta_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 32:
                                            assetsModel.lynxUrlSettingsKey = Q9J.LIZIZ(q9h);
                                            break;
                                        case 33:
                                            assetsModel.downgradeResourceType = q9h.LJIIJ();
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                            }
                        } else {
                            assetsModel.downloadType = q9h.LJIIJ();
                        }
                    } else {
                        assetsModel.resourceUri = Q9J.LIZIZ(q9h);
                    }
                } else {
                    assetsModel.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return assetsModel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AssetsModel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
