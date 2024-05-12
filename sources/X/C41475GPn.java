package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveOpKt", f = "DraftSaveOp.kt", l = {81, 87}, m = "save")
/* renamed from: X.GPn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41475GPn extends C3CS {
    public C41021G8b LJLIL;
    public InterfaceC88472Yns LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C41475GPn(InterfaceC67352kd<? super C41475GPn> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return GX4.LIZ(null, null, this);
    }
}
