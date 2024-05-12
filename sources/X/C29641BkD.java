package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.model.RoomSticker;

/* renamed from: X.BkD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29641BkD extends TBS implements InterfaceC88472Yns<RoomSticker, C76800UCe> {
    public C29641BkD(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "updateRoomStickerDecoration", "updateRoomStickerDecoration(Lcom/bytedance/android/livesdk/model/RoomSticker;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(RoomSticker roomSticker) {
        ((DecorationWrapperWidget) this.receiver).Ap(roomSticker);
        return C76800UCe.LIZ;
    }
}
