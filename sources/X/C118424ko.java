package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent", f = "ChatRoomAlphaVideoComponent.kt", l = {403, 410}, m = "checkAmbientAnimation$im_base_release")
/* renamed from: X.4ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118424ko extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118424ko(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, InterfaceC67352kd<? super C118424ko> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = chatRoomAlphaVideoComponent;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(null, this, false);
    }
}
