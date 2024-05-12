package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.createconversation.CreateConversationUseCase", f = "CreateConversationUseCase.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 86}, m = "createGroupConversation")
/* renamed from: X.Ox6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63564Ox6 extends C3CS {
    public C63560Ox2 LJLIL;
    public InterfaceC86963bA LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C63560Ox2 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63564Ox6(C63560Ox2 c63560Ox2, InterfaceC67352kd<? super C63564Ox6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c63560Ox2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(0, null, null, null, null, this);
    }
}
