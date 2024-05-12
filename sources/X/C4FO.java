package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiModel", f = "EmojiModel.kt", l = {216, 217, 218, 221, 222}, m = "pollResources")
/* renamed from: X.4FO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FO<T> extends C3CS {
    public long LJLIL;
    public double LJLILLLLZI;
    public InterfaceC106334Fh LJLJI;
    public InterfaceC88472Yns LJLJJI;
    public C72242sW LJLJJL;
    public Object LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ C4FF LJLL;
    public int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4FO(C4FF c4ff, InterfaceC67352kd<? super C4FO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLL = c4ff;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLLL = obj;
        this.LJLLI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLL.LIZLLL(0, 0L, 0L, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, this);
    }
}
