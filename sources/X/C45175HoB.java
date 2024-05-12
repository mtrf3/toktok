package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.smartmovie.jni.VecMeta;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.bot.frame.autocut.AutoCutFrameExtract", f = "AutoCutFrameExtract.kt", l = {88}, m = "execute")
/* renamed from: X.HoB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45175HoB extends C3CS {
    public C45172Ho8 LJLIL;
    public VecMeta LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C45172Ho8 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45175HoB(C45172Ho8 c45172Ho8, InterfaceC67352kd<? super C45175HoB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c45172Ho8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(this);
    }
}
