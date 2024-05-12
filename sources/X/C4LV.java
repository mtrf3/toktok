package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem.SingleTitleBarAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;

/* renamed from: X.4LV, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4LV extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C4LV(SingleTitleBarAssem singleTitleBarAssem) {
        super(0, singleTitleBarAssem, SingleTitleBarAssem.class, "onBackClick", "onBackClick()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C8W0 c8w0 = (C8W0) this.receiver;
        c8w0.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(c8w0);
        if (LIZLLL != null && (LIZLLL instanceof NewChatRoomFragment)) {
            ((NewChatRoomFragment) LIZLLL).onExitChatRoom();
        }
        return C76800UCe.LIZ;
    }
}
