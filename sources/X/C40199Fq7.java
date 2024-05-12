package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.lynx.spark.SparkPreloadKt", f = "SparkPreload.kt", l = {31}, m = "fetch")
/* renamed from: X.Fq7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40199Fq7 extends C3CS {
    public Object LJLIL;
    public OSZ[] LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public int LJLJJI;

    public C40199Fq7(InterfaceC67352kd<? super C40199Fq7> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C40198Fq6.LIZ(null, null, null, this);
    }
}
