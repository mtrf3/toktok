package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {LiveChatShowDelayForHotLiveSetting.DEFAULT, 403}, m = "processDragCancel")
/* renamed from: X.1xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49761xM extends C3CS {
    public C0UX LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C0UX LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49761xM(C0UX c0ux, InterfaceC67352kd<? super C49761xM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c0ux;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
