package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FavStickerUpdateResponse extends BaseResponse {

    @InterfaceC65349Pkn("sticker")
    public final FavStickerStruct favSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public FavStickerUpdateResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FavStickerUpdateResponse copy$default(FavStickerUpdateResponse favStickerUpdateResponse, FavStickerStruct favStickerStruct, int i, Object obj) {
        if ((i & 1) != 0) {
            favStickerStruct = favStickerUpdateResponse.favSticker;
        }
        return favStickerUpdateResponse.copy(favStickerStruct);
    }

    public final FavStickerUpdateResponse copy(FavStickerStruct favStickerStruct) {
        return new FavStickerUpdateResponse(favStickerStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavStickerUpdateResponse) && o.LJ(this.favSticker, ((FavStickerUpdateResponse) obj).favSticker);
    }

    public int hashCode() {
        FavStickerStruct favStickerStruct = this.favSticker;
        if (favStickerStruct == null) {
            return 0;
        }
        return favStickerStruct.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavStickerUpdateResponse(favSticker=");
        LIZ.append(this.favSticker);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final FavStickerStruct getFavSticker() {
        return this.favSticker;
    }

    public FavStickerUpdateResponse(FavStickerStruct favStickerStruct) {
        this.favSticker = favStickerStruct;
    }

    public /* synthetic */ FavStickerUpdateResponse(FavStickerStruct favStickerStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : favStickerStruct);
    }
}
