package X;

import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.guest.VoiceChatGuestUserInfoDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.Tak, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C74918Tak extends TBS implements InterfaceC88472Yns<EnumC74914Tag, C76800UCe> {
    public C74918Tak(Object obj) {
        super(1, obj, VoiceChatGuestUserInfoDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiLiveDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC74914Tag enumC74914Tag) {
        EnumC74914Tag p0 = enumC74914Tag;
        o.LJIIIZ(p0, "p0");
        ((VoiceChatGuestUserInfoDialog) this.receiver).xl(p0);
        return C76800UCe.LIZ;
    }
}
