package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.util.ResponseUtilsKt", f = "ResponseUtils.kt", l = {135}, m = "logApi")
/* renamed from: X.EaI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36670EaI<T> extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C36670EaI(InterfaceC67352kd<? super C36670EaI> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C36669EaH.LIZLLL(null, null, null, this);
    }
}
