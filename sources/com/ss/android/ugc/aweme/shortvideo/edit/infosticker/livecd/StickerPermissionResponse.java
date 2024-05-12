package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class StickerPermissionResponse extends BaseResponse {

    @InterfaceC65349Pkn("sticker_list")
    public final ArrayList<StickerPublishStruct> stickerList;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerPermissionResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ArrayList<StickerPublishStruct> getStickerList() {
        return this.stickerList;
    }

    public StickerPermissionResponse(ArrayList<StickerPublishStruct> arrayList) {
        this.stickerList = arrayList;
    }

    public /* synthetic */ StickerPermissionResponse(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }
}
