package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyAction", f = "MusicApplyAction.kt", l = {69, 74, 89}, m = "execute-BWLJW6A")
/* renamed from: X.Hqa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45324Hqa extends C3CS {
    public C45323HqZ LJLIL;
    public C45241HpF LJLILLLLZI;
    public C68322mC LJLJI;
    public C68322mC LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C45323HqZ LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45324Hqa(C45323HqZ c45323HqZ, InterfaceC67352kd<? super C45324Hqa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c45323HqZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZLLL = this.LJLJLJ.LIZLLL(null, this);
        if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL;
        }
        return C3C5.m6boximpl(LIZLLL);
    }
}
