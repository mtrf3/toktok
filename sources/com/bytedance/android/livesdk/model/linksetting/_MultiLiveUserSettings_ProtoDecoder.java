package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _MultiLiveUserSettings_ProtoDecoder implements InterfaceC31105CIr<MultiLiveUserSettings> {
    public static MultiLiveUserSettings LIZIZ(Q9H q9h) {
        MultiLiveUserSettings multiLiveUserSettings = new MultiLiveUserSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            multiLiveUserSettings.coHost = _CoHost_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        long LIZJ2 = q9h.LIZJ();
                        Integer num = null;
                        Long l = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 == -1) {
                                break;
                            }
                            if (LJI2 != 1) {
                                if (LJI2 == 2) {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                num = Integer.valueOf(q9h.LJIIJ());
                            }
                        }
                        q9h.LJ(LIZJ2);
                        if (num != null) {
                            if (l != null) {
                                multiLiveUserSettings.channelMap.put(num, l);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    multiLiveUserSettings.multiLiveUserApplySettings = _MultiLiveUserApplySettings_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveUserSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveUserSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
