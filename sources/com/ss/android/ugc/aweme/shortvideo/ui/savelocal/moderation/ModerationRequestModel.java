package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.EnumC62152cF;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ModerationRequestModel extends F9E {

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("watermark_moderation")
    public final WaterMarkModerationModel waterMarkModerationModel;

    public static /* synthetic */ ModerationRequestModel copy$default(ModerationRequestModel moderationRequestModel, int i, WaterMarkModerationModel waterMarkModerationModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = moderationRequestModel.type;
        }
        if ((i2 & 2) != 0) {
            waterMarkModerationModel = moderationRequestModel.waterMarkModerationModel;
        }
        return moderationRequestModel.copy(i, waterMarkModerationModel);
    }

    public final ModerationRequestModel copy(int i, WaterMarkModerationModel waterMarkModerationModel) {
        o.LJIIIZ(waterMarkModerationModel, "waterMarkModerationModel");
        return new ModerationRequestModel(i, waterMarkModerationModel);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), this.waterMarkModerationModel};
    }

    public final int getType() {
        return this.type;
    }

    public final WaterMarkModerationModel getWaterMarkModerationModel() {
        return this.waterMarkModerationModel;
    }

    public ModerationRequestModel(int i, WaterMarkModerationModel waterMarkModerationModel) {
        o.LJIIIZ(waterMarkModerationModel, "waterMarkModerationModel");
        this.type = i;
        this.waterMarkModerationModel = waterMarkModerationModel;
    }

    public /* synthetic */ ModerationRequestModel(int i, WaterMarkModerationModel waterMarkModerationModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EnumC62152cF.WATERMARK_FRAME.ordinal() : i, waterMarkModerationModel);
    }
}
