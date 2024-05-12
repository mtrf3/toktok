package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent", f = "ChatRoomAlphaVideoComponent.kt", l = {455}, m = "checkAnimatedEmojiOnFirstScreen")
/* renamed from: X.4kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118394kl extends C3CS {
    public ChatRoomAlphaVideoComponent LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118394kl(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, InterfaceC67352kd<? super C118394kl> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = chatRoomAlphaVideoComponent;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, 0L, this);
    }
}
