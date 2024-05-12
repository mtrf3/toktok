package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent", f = "ChatRoomAlphaVideoComponent.kt", l = {308, 310}, m = "checkActionBarAnimatedEmoji$im_base_release")
/* renamed from: X.4kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118414kn extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118414kn(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, InterfaceC67352kd<? super C118414kn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = chatRoomAlphaVideoComponent;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this, false);
    }
}
