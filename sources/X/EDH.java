package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.storage.monitor.CreativeStorageMonitor", f = "CreativeStorageMonitor.kt", l = {38}, m = "monitorStorageSize")
/* loaded from: classes7.dex */
public final class EDH extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EDI LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDH(EDI edi, InterfaceC67352kd<? super EDH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = edi;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
