package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {BaseNotice.CREATOR}, m = "invoke$emitEnter")
/* renamed from: X.1wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49171wP extends C3CS {
    public InterfaceC35811ar LJLIL;
    public C1OF LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C49171wP(InterfaceC67352kd<? super C49171wP> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C49211wT.LIZ(null, null, this);
    }
}
