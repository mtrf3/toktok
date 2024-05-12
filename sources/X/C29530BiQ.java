package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.BiQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29530BiQ extends TBS implements InterfaceC88472Yns<C32208CkW, C76800UCe> {
    public C29530BiQ(Object obj) {
        super(1, obj, LiveStickerPropsDialog.class, "updateHostLinkedState", "updateHostLinkedState(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C32208CkW c32208CkW) {
        boolean z;
        C32208CkW p0 = c32208CkW;
        o.LJIIIZ(p0, "p0");
        LiveStickerPropsDialog liveStickerPropsDialog = (LiveStickerPropsDialog) this.receiver;
        liveStickerPropsDialog.getClass();
        if (p0.LIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        liveStickerPropsDialog.LJLILLLLZI = z;
        return C76800UCe.LIZ;
    }
}
