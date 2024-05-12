package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.actionai.action.data.MusicRecommendInputParam;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicRecommendAction", f = "MusicRecommendAction.kt", l = {93, 106}, m = "execute-BWLJW6A")
/* renamed from: X.Wou, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83440Wou extends C3CS {
    public C83439Wot LJLIL;
    public ExecutionContext LJLILLLLZI;
    public MusicRecommendInputParam LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C83439Wot LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83440Wou(C83439Wot c83439Wot, InterfaceC67352kd<? super C83440Wou> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c83439Wot;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZJ = this.LJLJLJ.LIZJ(null, null, this);
        if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZJ;
        }
        return C3C5.m6boximpl(LIZJ);
    }
}
