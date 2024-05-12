package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;

/* renamed from: X.42y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1031242y extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C1031242y(ChatRoomViewModel chatRoomViewModel) {
        super(0, chatRoomViewModel, ChatRoomViewModel.class, "onStickerBannerCloseIconClick", "onStickerBannerCloseIconClick()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ((ChatRoomViewModel) this.receiver).LLFF.setValue(Boolean.TRUE);
        return C76800UCe.LIZ;
    }
}
