package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent", f = "ChatRoomAlphaVideoComponent.kt", l = {490}, m = "realCheckAnimatedEmoji$im_base_release")
/* renamed from: X.4km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118404km extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118404km(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, InterfaceC67352kd<? super C118404km> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = chatRoomAlphaVideoComponent;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJ(null, null, this);
    }
}
