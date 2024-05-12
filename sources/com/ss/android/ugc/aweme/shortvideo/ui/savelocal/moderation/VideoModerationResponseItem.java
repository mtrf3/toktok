package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoModerationResponseItem extends F9E {

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("watermark_moderation")
    public final WaterMarkModerationModel waterMarkModerationModel;

    public static /* synthetic */ VideoModerationResponseItem copy$default(VideoModerationResponseItem videoModerationResponseItem, int i, int i2, WaterMarkModerationModel waterMarkModerationModel, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoModerationResponseItem.type;
        }
        if ((i3 & 2) != 0) {
            i2 = videoModerationResponseItem.status;
        }
        if ((i3 & 4) != 0) {
            waterMarkModerationModel = videoModerationResponseItem.waterMarkModerationModel;
        }
        return videoModerationResponseItem.copy(i, i2, waterMarkModerationModel);
    }

    public final VideoModerationResponseItem copy(int i, int i2, WaterMarkModerationModel waterMarkModerationModel) {
        o.LJIIIZ(waterMarkModerationModel, "waterMarkModerationModel");
        return new VideoModerationResponseItem(i, i2, waterMarkModerationModel);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), Integer.valueOf(this.status), this.waterMarkModerationModel};
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final WaterMarkModerationModel getWaterMarkModerationModel() {
        return this.waterMarkModerationModel;
    }

    public VideoModerationResponseItem(int i, int i2, WaterMarkModerationModel waterMarkModerationModel) {
        o.LJIIIZ(waterMarkModerationModel, "waterMarkModerationModel");
        this.type = i;
        this.status = i2;
        this.waterMarkModerationModel = waterMarkModerationModel;
    }
}
