package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyAction", f = "MusicApplyAction.kt", l = {105}, m = "downloadMusic-0E7RQCE")
/* renamed from: X.9g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242859g1 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C45323HqZ LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C242859g1(C45323HqZ c45323HqZ, InterfaceC67352kd<? super C242859g1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c45323HqZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZJ = this.LJLJI.LIZJ(null, null, this);
        if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZJ;
        }
        return C3C5.m6boximpl(LIZJ);
    }
}
