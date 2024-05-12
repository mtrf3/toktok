package com.ss.android.ugc.tiktok.addyours.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursTopicStickerResp extends BaseResponse {

    @InterfaceC65349Pkn("sticker")
    public final AddYoursStickerStruct sticker;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursTopicStickerResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddYoursTopicStickerResp) && o.LJ(this.sticker, ((AddYoursTopicStickerResp) obj).sticker);
    }

    public final int hashCode() {
        AddYoursStickerStruct addYoursStickerStruct = this.sticker;
        if (addYoursStickerStruct == null) {
            return 0;
        }
        return addYoursStickerStruct.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursTopicStickerResp(sticker=");
        LIZ.append(this.sticker);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AddYoursTopicStickerResp(AddYoursStickerStruct addYoursStickerStruct) {
        this.sticker = addYoursStickerStruct;
    }

    public /* synthetic */ AddYoursTopicStickerResp(AddYoursStickerStruct addYoursStickerStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addYoursStickerStruct);
    }
}
