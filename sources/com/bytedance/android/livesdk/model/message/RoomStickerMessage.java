package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.RoomSticker;
import java.util.List;

/* loaded from: classes6.dex */
public class RoomStickerMessage extends CR6 {

    @InterfaceC65349Pkn("sticker")
    public List<RoomSticker> stickerList;

    public RoomStickerMessage() {
        this.type = EnumC31509CYf.MODIFY_STICKER;
    }
}
